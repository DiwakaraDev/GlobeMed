package Chain;

public class VerificationHandler extends ClaimHandler {

    @Override
    public void processRequest(ClaimRequest request) {
        System.out.println("VerificationHandler: Verifying insurance provider...");

        if (request.getInsuranceProvider().equals("Select")
                || request.getInsuranceProvider().isEmpty()) {

            request.setStatus("Rejected");
            request.setRemarks(request.getRemarks() + "Verification failed: Unknown provider.");
            System.out.println("Verification FAILED.");
            return;
        }

        System.out.println("Verification PASSED.");
        request.setRemarks(request.getRemarks() + "Verified. ");

        if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}
