package Chain;

public class ApprovalHandler extends ClaimHandler {

    private static final double MAX_AUTO_APPROVAL = 50000.00;

    @Override
    public void processRequest(ClaimRequest request) {
        System.out.println("ApprovalHandler: Checking claim amount...");

        if (request.getClaimAmount() > MAX_AUTO_APPROVAL) {
            request.setStatus("Pending Manual Review");
            request.setRemarks(request.getRemarks()
                    + "Amount exceeds Rs.50,000 — requires manual approval.");
            System.out.println("Sent for Manual Review.");
        } else {
            request.setStatus("Approved");
            request.setRemarks(request.getRemarks() + "Auto-approved.");
            System.out.println("Claim APPROVED.");
        }
    }
}
