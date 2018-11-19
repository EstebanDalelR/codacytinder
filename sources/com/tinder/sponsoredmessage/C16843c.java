package com.tinder.sponsoredmessage;

import com.tinder.addy.Ad;
import com.tinder.addy.AdAggregator.Listener;
import com.tinder.addy.AdLoader;
import com.tinder.messageads.model.C12131a;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/sponsoredmessage/SponsoredMessageAdMatchListener;", "Lcom/tinder/addy/AdAggregator$Listener;", "()V", "sponsoredMatchAdListeners", "", "Lcom/tinder/sponsoredmessage/SponsoredMessageAdMonitor$Listener;", "addAllListeners", "", "listeners", "", "onAdAdded", "ad", "Lcom/tinder/addy/Ad;", "onAdRequestFailed", "adLoader", "Lcom/tinder/addy/AdLoader;", "exception", "", "onAdRequestSent", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.sponsoredmessage.c */
public final class C16843c implements Listener {
    /* renamed from: a */
    private final Set<SponsoredMessageAdMonitor.Listener> f51907a = new CopyOnWriteArraySet();

    public void onAdAdded(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        C12131a c12131a = (C12131a) ad;
        for (SponsoredMessageAdMonitor.Listener onSponsoredMatchAdAvailable : this.f51907a) {
            onSponsoredMatchAdAvailable.onSponsoredMatchAdAvailable(c12131a);
        }
    }

    public void onAdRequestFailed(@NotNull AdLoader adLoader, @NotNull Throwable th) {
        C2668g.b(adLoader, "adLoader");
        C2668g.b(th, "exception");
        C0001a.c(th);
    }

    public void onAdRequestSent(@NotNull AdLoader adLoader) {
        C2668g.b(adLoader, "adLoader");
        C0001a.b("Sending Sponsored Message Ad Request", new Object[0]);
    }

    /* renamed from: a */
    public final void m62397a(@NotNull Set<? extends SponsoredMessageAdMonitor.Listener> set) {
        C2668g.b(set, "listeners");
        this.f51907a.clear();
        this.f51907a.addAll(set);
    }
}
