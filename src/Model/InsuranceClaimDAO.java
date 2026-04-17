package Model;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsuranceClaimDAO {

    public static boolean saveClaim(InsuranceClaim claim) {
        String sql = "INSERT INTO insurance_claims "
                   + "(patient_id, patient_name, insurance_provider, claim_type, "
                   + "claim_amount, policy_number, status, remarks, claim_date) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, CURDATE())";
        try (PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(sql)) {
            stmt.setInt(1,    claim.getPatientId());
            stmt.setString(2, claim.getPatientName());
            stmt.setString(3, claim.getInsuranceProvider());
            stmt.setString(4, claim.getClaimType());
            stmt.setDouble(5, claim.getClaimAmount());
            stmt.setString(6, claim.getPolicyNumber());
            stmt.setString(7, claim.getStatus());
            stmt.setString(8, claim.getRemarks());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("InsuranceClaimDAO error: " + e.getMessage());
            return false;
        }
    }
}