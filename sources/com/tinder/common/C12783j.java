package com.tinder.common;

import com.tinder.model.UserMeta;
import rx.functions.Func1;

/* renamed from: com.tinder.common.j */
final /* synthetic */ class C12783j implements Func1 {
    /* renamed from: a */
    static final Func1 f41176a = new C12783j();

    private C12783j() {
    }

    public Object call(Object obj) {
        return ((UserMeta) obj).getUser();
    }
}
