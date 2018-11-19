package com.tinder.data.purchase.p091a;

import com.tinder.domain.common.model.Subscription;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.purchase.a.e$a */
final class e$a implements Action0 {
    /* renamed from: a */
    final /* synthetic */ C3927e f43982a;

    e$a(C3927e c3927e) {
        this.f43982a = c3927e;
    }

    public final void call() {
        this.f43982a.a().update(new Subscription("", false, false, null, 8, null));
    }
}
