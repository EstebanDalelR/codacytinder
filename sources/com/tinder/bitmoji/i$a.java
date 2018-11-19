package com.tinder.bitmoji;

import io.reactivex.functions.Action;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
final class i$a implements Action {
    /* renamed from: a */
    final /* synthetic */ C3922i f33859a;

    i$a(C3922i c3922i) {
        this.f33859a = c3922i;
    }

    public final void run() {
        C3922i.a(this.f33859a).disconnect();
        C3922i.b(this.f33859a).clearImageUrl();
    }
}
