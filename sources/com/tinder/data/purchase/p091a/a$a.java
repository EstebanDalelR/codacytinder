package com.tinder.data.purchase.p091a;

import com.tinder.domain.common.model.Subscription;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.purchase.a.a$a */
final class a$a implements Action0 {
    /* renamed from: a */
    final /* synthetic */ C3926a f43978a;
    /* renamed from: b */
    final /* synthetic */ String f43979b;

    a$a(C3926a c3926a, String str) {
        this.f43978a = c3926a;
        this.f43979b = str;
    }

    public final void call() {
        this.f43978a.a().update(new Subscription(this.f43979b, true, true, null, 8, null));
    }
}
