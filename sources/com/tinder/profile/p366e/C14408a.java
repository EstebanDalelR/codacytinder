package com.tinder.profile.p366e;

import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import com.tinder.controlla.model.AdvertisingPageType;
import com.tinder.profile.p366e.C16106d.C16105a;

/* renamed from: com.tinder.profile.e.a */
public abstract class C14408a {

    /* renamed from: com.tinder.profile.e.a$a */
    public static abstract class C14407a {
        /* renamed from: a */
        public abstract C14407a mo11604a(int i);

        /* renamed from: a */
        public abstract C14407a mo11605a(AdvertisingPageType advertisingPageType);

        /* renamed from: a */
        public abstract C14407a mo11606a(String str);

        /* renamed from: a */
        public abstract C14408a mo11607a();

        /* renamed from: b */
        public abstract C14407a mo11608b(int i);

        /* renamed from: c */
        public abstract C14407a mo11609c(int i);
    }

    @StringRes
    /* renamed from: a */
    public abstract int mo11610a();

    /* renamed from: b */
    public abstract String mo11611b();

    @ColorRes
    /* renamed from: c */
    public abstract int mo11612c();

    @DrawableRes
    /* renamed from: d */
    public abstract int mo11613d();

    /* renamed from: e */
    public abstract AdvertisingPageType mo11614e();

    /* renamed from: f */
    public static C14407a m54856f() {
        return new C16105a();
    }
}
