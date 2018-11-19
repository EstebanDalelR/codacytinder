package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;

/* renamed from: com.facebook.internal.l */
public class C1725l {
    /* renamed from: a */
    private Fragment f4766a;
    /* renamed from: b */
    private android.app.Fragment f4767b;

    public C1725l(Fragment fragment) {
        C1749x.m6064a((Object) fragment, "fragment");
        this.f4766a = fragment;
    }

    public C1725l(android.app.Fragment fragment) {
        C1749x.m6064a((Object) fragment, "fragment");
        this.f4767b = fragment;
    }

    /* renamed from: a */
    public android.app.Fragment m5946a() {
        return this.f4767b;
    }

    /* renamed from: b */
    public Fragment m5948b() {
        return this.f4766a;
    }

    /* renamed from: a */
    public void m5947a(Intent intent, int i) {
        if (this.f4766a != null) {
            this.f4766a.startActivityForResult(intent, i);
        } else {
            this.f4767b.startActivityForResult(intent, i);
        }
    }

    /* renamed from: c */
    public final Activity m5949c() {
        if (this.f4766a != null) {
            return this.f4766a.getActivity();
        }
        return this.f4767b.getActivity();
    }
}
