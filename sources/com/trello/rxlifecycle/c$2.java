package com.trello.rxlifecycle;

import rx.functions.Func2;

class c$2 implements Func2<T, T, Boolean> {
    c$2() {
    }

    public /* synthetic */ Object call(Object obj, Object obj2) {
        return m66309a(obj, obj2);
    }

    /* renamed from: a */
    public Boolean m66309a(T t, T t2) {
        return Boolean.valueOf(t2.equals(t));
    }
}
