package io.branch.referral;

import io.branch.indexing.BranchUniversalObject;
import io.branch.referral.util.LinkProperties;

public interface Branch$ExtendedBranchLinkShareListener extends Branch$BranchLinkShareListener {
    boolean onChannelSelected(String str, BranchUniversalObject branchUniversalObject, LinkProperties linkProperties);
}
