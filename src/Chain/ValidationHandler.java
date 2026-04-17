package Chain;

/**
 * CHAIN OF RESPONSIBILITY — Handler #1
 * Validates that all required claim fields are filled.
 */
public class ValidationHandler extends ClaimHandler {

    @Override
    public void processRequest(ClaimRequest request) {
        System.out.println("🔍 ValidationHandler: Checking required fields...");

        if (request.getPatientName().isEmpty() ||
            request.getPolicyNumber().isEmpty() ||
            request.getClaimAmount() <= 0) {

            request.setStatus("Rejected");
            request.setRemarks("Validation failed: Missing required fields or invalid amount.");
            System.out.println("❌ Validation FAILED.");
            return; // Chain stops here
        }

        System.out.println("✅ Validation PASSED.");
        request.setRemarks(request.getRemarks() + "Validated. ");

        // Pass to next handler
        if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}