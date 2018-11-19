package com.tinder.boost.repository;

import com.tinder.model.ProfileResponse;
import retrofit2.Response;
import rx.functions.Func1;

/* renamed from: com.tinder.boost.repository.b */
final /* synthetic */ class C12637b implements Func1 {
    /* renamed from: a */
    static final Func1 f40772a = new C12637b();

    private C12637b() {
    }

    public Object call(Object obj) {
        return ((ProfileResponse) ((Response) obj).body()).getBoost();
    }
}
