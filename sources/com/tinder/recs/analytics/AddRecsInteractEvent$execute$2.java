package com.tinder.recs.analytics;

import kotlin.Metadata;
import p000a.p001a.C0001a;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
final class AddRecsInteractEvent$execute$2 implements Action0 {
    public static final AddRecsInteractEvent$execute$2 INSTANCE = new AddRecsInteractEvent$execute$2();

    AddRecsInteractEvent$execute$2() {
    }

    public final void call() {
        C0001a.b("RecsInteractEvent successfully logged.", new Object[0]);
    }
}
