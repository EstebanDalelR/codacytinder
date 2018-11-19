package com.tinder.common;

import com.tinder.model.UserMeta;
import java8.util.Objects;
import rx.functions.Func1;

/* renamed from: com.tinder.common.i */
final /* synthetic */ class C12782i implements Func1 {
    /* renamed from: a */
    static final Func1 f41175a = new C12782i();

    private C12782i() {
    }

    public Object call(Object obj) {
        return Boolean.valueOf(Objects.d((UserMeta) obj));
    }
}
