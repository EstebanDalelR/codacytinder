package com.tinder.recsads;

import com.tinder.addy.tracker.TrackingUrl.EventType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class BrandedProfileCardTrackingUrlParser$getPredicate$1 extends Lambda implements Function1<String, Boolean> {
    /* renamed from: a */
    final /* synthetic */ EventType f58278a;

    BrandedProfileCardTrackingUrlParser$getPredicate$1(EventType eventType) {
        this.f58278a = eventType;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m67211a((String) obj));
    }

    /* renamed from: a */
    public final boolean m67211a(@NotNull String str) {
        C2668g.b(str, "it");
        return C19298r.m68786b((CharSequence) str, (CharSequence) this.f58278a.token(), false, 2, null);
    }
}
