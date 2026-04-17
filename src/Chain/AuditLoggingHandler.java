package Chain;

import DB.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class AuditLoggingHandler extends ClaimHandler {

    @Override
    public void processRequest(ClaimRequest request) {
        // Log the incoming claim attempt
        String logEntry = String.format(
            "[CLAIM AUDIT] %s | Patient: %s | Provider: %s | Amount: %.2f | Policy: %s",
            LocalDateTime.now(),
            request.getPatientName(),
            request.getInsuranceProvider(),
            request.getClaimAmount(),
            request.getPolicyNumber()
        );

        System.out.println(logEntry);
        saveAuditLog(request);

        if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }

    private void saveAuditLog(ClaimRequest request) {
        String sql = "INSERT INTO claim_audit_log "
                   + "(patient_name, provider, claim_type, amount, policy_number, logged_at) "
                   + "VALUES (?, ?, ?, ?, ?, NOW())";
        try (PreparedStatement ps = DBConnection.getInstance()
                .getConnection().prepareStatement(sql)) {
            ps.setString(1, request.getPatientName());
            ps.setString(2, request.getInsuranceProvider());
            ps.setString(3, request.getClaimType());
            ps.setDouble(4, request.getClaimAmount());
            ps.setString(5, request.getPolicyNumber());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("AuditLoggingHandler DB error: " + e.getMessage());
        }
    }
}