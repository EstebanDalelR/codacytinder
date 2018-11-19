package com.tinder.profile.p363b;

import retrofit2.Response;
import rx.functions.Func1;

/* renamed from: com.tinder.profile.b.af */
final /* synthetic */ class af implements Func1 {
    /* renamed from: a */
    static final Func1 f55382a = new af();

    private af() {
    }

    public Object call(Object obj) {
        return ((Response) obj).body();
    }
}
