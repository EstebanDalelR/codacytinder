package com.tinder.addy.tracker;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import kotlin.sequences.C19285g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/addy/tracker/UniqueTrackingUrlsDecorator;", "Lcom/tinder/addy/tracker/TrackingUrlsDecorator;", "()V", "decorate", "", "Lcom/tinder/addy/tracker/TrackingUrl;", "trackingUrls", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "addy_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.addy.tracker.b */
public final class C7306b implements TrackingUrlsDecorator {
    @NotNull
    public List<TrackingUrl> decorate(@NotNull List<TrackingUrl> list, @NotNull AdUrlTracker adUrlTracker) {
        C2668g.b(list, "trackingUrls");
        C2668g.b(adUrlTracker, "adUrlTracker");
        adUrlTracker = (List) adUrlTracker.m26829b((List) list).c().a();
        if (adUrlTracker == null) {
            adUrlTracker = C19301m.a();
        }
        return C19285g.f(C19285g.b(C19301m.r(list), new UniqueTrackingUrlsDecorator$decorate$1(adUrlTracker)));
    }
}
