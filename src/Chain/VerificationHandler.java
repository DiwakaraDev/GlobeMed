package Chain;

/**
 * CHAIN OF RESPONSIBILITY — Handler #2
 * Verifies the insurance provider and policy number.
 */
public class VerificationHandler extends ClaimHandler {

    @Override
    public void processRequest(ClaimRequest request) {
        System.out.println("VerificationHandler: Verifying insurance provider...");

        // Simulate: only known providers are accepted
        if (request.getInsuranceProvider().equals("Select") ||
            request.getInsuranceProvider().isEmpty()) {

            request.setStatus("Rejected");
            request.setRemarks(request.getRemarks() + "Verification failed: Unknown provider.");
            System.out.println("Verification FAILED.");
            return; // Chain stops here
        }

        System.out.println("Verification PASSED.");
        request.setRemarks(request.getRemarks() + "Verified. ");

        // Pass to next handler
        if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}