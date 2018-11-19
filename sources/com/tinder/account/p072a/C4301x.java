package com.tinder.account.p072a;

import android.text.TextUtils;
import rx.functions.Func1;

/* renamed from: com.tinder.account.a.x */
final /* synthetic */ class C4301x implements Func1 {
    /* renamed from: a */
    static final Func1 f14021a = new C4301x();

    private C4301x() {
    }

    public Object call(Object obj) {
        return Boolean.valueOf(TextUtils.isEmpty((String) obj) ^ 1);
    }
}
