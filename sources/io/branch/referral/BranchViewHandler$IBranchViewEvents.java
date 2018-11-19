package io.branch.referral;

public interface BranchViewHandler$IBranchViewEvents {
    void onBranchViewAccepted(String str, String str2);

    void onBranchViewCancelled(String str, String str2);

    void onBranchViewError(int i, String str, String str2);

    void onBranchViewVisible(String str, String str2);
}
