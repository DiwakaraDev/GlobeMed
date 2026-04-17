package Model;

import DB.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BillDAO {

    public static boolean saveBill(Bill bill) {
        String sql = "INSERT INTO billing (patient_id, patient_name, subtotal, after_tax, final_amount, description) "
                   + "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(sql)) {
            stmt.setInt(1,    bill.getPatientId());
            stmt.setString(2, bill.getPatientName());
            stmt.setDouble(3, bill.getSubtotal());
            stmt.setDouble(4, bill.getAfterTax());
            stmt.setDouble(5, bill.getFinalAmount());
            stmt.setString(6, bill.getDescription());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("BillDAO error: " + e.getMessage());
            return false;
        }
    }
}