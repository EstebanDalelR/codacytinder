package com.tinder.activities;

import android.net.Uri;
import com.tinder.utils.Async.AsyncBg;

/* renamed from: com.tinder.activities.b */
final /* synthetic */ class C7278b implements AsyncBg {
    /* renamed from: a */
    private final ActivityAddPhoto f26265a;
    /* renamed from: b */
    private final String f26266b;
    /* renamed from: c */
    private final int f26267c;
    /* renamed from: d */
    private final int f26268d;
    /* renamed from: e */
    private final Uri f26269e;

    C7278b(ActivityAddPhoto activityAddPhoto, String str, int i, int i2, Uri uri) {
        this.f26265a = activityAddPhoto;
        this.f26266b = str;
        this.f26267c = i;
        this.f26268d = i2;
        this.f26269e = uri;
    }

    public Object doInBg() {
        return this.f26265a.m35110a(this.f26266b, this.f26267c, this.f26268d, this.f26269e);
    }
}
