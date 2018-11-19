package com.tinder.intropricing.domain.paywall;

import com.tinder.paywall.domain.PaywallEntrySource;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/intropricing/domain/paywall/IntroPricingPaywallEntrySource;", "", "Lcom/tinder/paywall/domain/PaywallEntrySource;", "source", "", "(Ljava/lang/String;II)V", "getSource", "()I", "UNKNOWN", "MATCH_LIST", "SETTINGS", "INTRO_MODAL", "CONTROLLA", "MERCHANDISING_UNLIMITED_LIKES", "MERCHANDISING_UNDO", "domain_release"}, k = 1, mv = {1, 1, 10})
public enum IntroPricingPaywallEntrySource implements PaywallEntrySource {
    ;
    
    private final int source;

    protected IntroPricingPaywallEntrySource(int i) {
        this.source = i;
    }

    public int getSource() {
        return this.source;
    }
}
