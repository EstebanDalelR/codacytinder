package com.trello.rxlifecycle;

import rx.functions.Func1;

class c$1 implements Func1<T, Boolean> {
    /* renamed from: a */
    final /* synthetic */ Object f56693a;

    c$1(Object obj) {
        this.f56693a = obj;
    }

    public /* synthetic */ Object call(Object obj) {
        return m66308a(obj);
    }

    /* renamed from: a */
    public Boolean m66308a(T t) {
        return Boolean.valueOf(t.equals(this.f56693a));
    }
}
