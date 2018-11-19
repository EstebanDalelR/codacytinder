package com.tinder.addy.tracker;

import com.tinder.addy.ping.C6188a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "trackingUrl", "Lcom/tinder/addy/tracker/TrackingUrl;", "invoke"}, k = 3, mv = {1, 1, 10})
final class UniqueTrackingUrlsDecorator$decorate$1 extends Lambda implements Function1<TrackingUrl, Boolean> {
    /* renamed from: a */
    final /* synthetic */ List f29133a;

    UniqueTrackingUrlsDecorator$decorate$1(List list) {
        this.f29133a = list;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m34535a((TrackingUrl) obj));
    }

    /* renamed from: a */
    public final boolean m34535a(@NotNull TrackingUrl trackingUrl) {
        C2668g.b(trackingUrl, "trackingUrl");
        for (Object next : this.f29133a) {
            if (C2668g.a(((C6188a) next).m26799a(), trackingUrl.m26832c())) {
                break;
            }
        }
        Object next2 = null;
        return (C19303i.b((CharSequence) trackingUrl.m26831b(), (CharSequence) "unique", false, 2, null) == null || ((C6188a) next2) == null) ? false : true;
    }
}
