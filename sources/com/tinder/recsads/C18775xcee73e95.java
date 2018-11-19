package com.tinder.recsads;

import com.tinder.addy.tracker.TrackingUrl;
import com.tinder.recsads.model.C16469h;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/addy/tracker/TrackingUrl;", "invoke", "com/tinder/recsads/BrandedProfileCardTrackingUrlParser$parseTrackingUrls$1$1"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.BrandedProfileCardTrackingUrlParser$parseTrackingUrls$$inlined$forEach$lambda$1 */
final class C18775xcee73e95 extends Lambda implements Function1<TrackingUrl, C15813i> {
    /* renamed from: a */
    final /* synthetic */ C16457d f58280a;
    /* renamed from: b */
    final /* synthetic */ C16469h f58281b;
    /* renamed from: c */
    final /* synthetic */ List f58282c;

    C18775xcee73e95(C16457d c16457d, C16469h c16469h, List list) {
        this.f58280a = c16457d;
        this.f58281b = c16469h;
        this.f58282c = list;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67213a((TrackingUrl) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67213a(@NotNull TrackingUrl trackingUrl) {
        C2668g.b(trackingUrl, "it");
        this.f58282c.add(trackingUrl);
    }
}
