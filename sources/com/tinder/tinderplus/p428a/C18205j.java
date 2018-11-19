package com.tinder.tinderplus.p428a;

import com.tinder.domain.common.model.Subscription;
import rx.functions.Func1;

/* renamed from: com.tinder.tinderplus.a.j */
final /* synthetic */ class C18205j implements Func1 {
    /* renamed from: a */
    static final Func1 f56442a = new C18205j();

    private C18205j() {
    }

    public Object call(Object obj) {
        return Boolean.valueOf(((Subscription) obj).isPlus());
    }
}
