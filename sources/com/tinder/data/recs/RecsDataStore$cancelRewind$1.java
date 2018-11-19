package com.tinder.data.recs;

import com.tinder.domain.recs.model.Swipe;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 9})
final class RecsDataStore$cancelRewind$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ C10992i f43988a;
    /* renamed from: b */
    final /* synthetic */ Swipe f43989b;

    RecsDataStore$cancelRewind$1(C10992i c10992i, Swipe swipe) {
        this.f43988a = c10992i;
        this.f43989b = swipe;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53429a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53429a() {
        this.f43988a.m43623c(this.f43989b);
    }
}
