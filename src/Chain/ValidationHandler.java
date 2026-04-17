package Chain;

public class ValidationHandler extends ClaimHandler {

    @Override
    public void processRequest(ClaimRequest request) {
        System.out.println("ValidationHandler: Checking required fields...");

        if (request.getPatientName().isEmpty()
                || request.getPolicyNumber().isEmpty()
                || request.getClaimAmount() <= 0) {

            request.setStatus("Rejected");
            request.setRemarks("Validation failed: Missing required fields or invalid amount.");
            System.out.println("Validation FAILED.");
            return;
        }

        System.out.println("Validation PASSED.");
        request.setRemarks(request.getRemarks() + "Validated. ");

        if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}
