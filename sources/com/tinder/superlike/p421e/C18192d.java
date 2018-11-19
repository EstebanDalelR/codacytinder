package com.tinder.superlike.p421e;

import com.tinder.api.model.meta.SuperLikes;
import com.tinder.superlike.p418a.C15066a;
import rx.functions.Func1;

/* renamed from: com.tinder.superlike.e.d */
final /* synthetic */ class C18192d implements Func1 {
    /* renamed from: a */
    private final C15066a f56404a;

    private C18192d(C15066a c15066a) {
        this.f56404a = c15066a;
    }

    /* renamed from: a */
    static Func1 m65965a(C15066a c15066a) {
        return new C18192d(c15066a);
    }

    public Object call(Object obj) {
        return this.f56404a.m56778a((SuperLikes) obj);
    }
}
