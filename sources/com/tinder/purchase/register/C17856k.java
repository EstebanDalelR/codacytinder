package com.tinder.purchase.register;

import android.app.Activity;
import java.util.List;
import org.joda.time.DateTime;
import rx.functions.Func1;

/* renamed from: com.tinder.purchase.register.k */
final /* synthetic */ class C17856k implements Func1 {
    /* renamed from: a */
    private final RegisterImpl f55720a;
    /* renamed from: b */
    private final DateTime f55721b;
    /* renamed from: c */
    private final Activity f55722c;
    /* renamed from: d */
    private final String f55723d;

    C17856k(RegisterImpl registerImpl, DateTime dateTime, Activity activity, String str) {
        this.f55720a = registerImpl;
        this.f55721b = dateTime;
        this.f55722c = activity;
        this.f55723d = str;
    }

    public Object call(Object obj) {
        return this.f55720a.m61356a(this.f55721b, this.f55722c, this.f55723d, (List) obj);
    }
}
