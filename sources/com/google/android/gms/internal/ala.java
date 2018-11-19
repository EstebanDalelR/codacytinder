package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.ad;

@zzzv
public final class ala {
    /* renamed from: a */
    private final Context f15404a;

    public ala(Context context) {
        ad.a(context, "Context can not be null");
        this.f15404a = context;
    }

    /* renamed from: a */
    private final boolean m19308a(Intent intent) {
        ad.a(intent, "Intent can not be null");
        return !this.f15404a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    /* renamed from: a */
    public final boolean m19309a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m19308a(intent);
    }

    /* renamed from: b */
    public final boolean m19310b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m19308a(intent);
    }

    /* renamed from: c */
    public final boolean m19311c() {
        return ((Boolean) hg.m19844a(this.f15404a, new alb())).booleanValue() && pl.m20131a(this.f15404a).m20124a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    /* renamed from: d */
    public final boolean m19312d() {
        return m19308a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
