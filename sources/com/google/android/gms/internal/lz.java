package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@zzzv
public final class lz extends MutableContextWrapper {
    /* renamed from: a */
    private Activity f16360a;
    /* renamed from: b */
    private Context f16361b;
    /* renamed from: c */
    private Context f16362c;

    public lz(Context context) {
        super(context);
        setBaseContext(context);
    }

    /* renamed from: a */
    public final Activity m20037a() {
        return this.f16360a;
    }

    /* renamed from: b */
    public final Context m20038b() {
        return this.f16362c;
    }

    public final Object getSystemService(String str) {
        return this.f16362c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.f16361b = context.getApplicationContext();
        this.f16360a = context instanceof Activity ? (Activity) context : null;
        this.f16362c = context;
        super.setBaseContext(this.f16361b);
    }

    public final void startActivity(Intent intent) {
        if (this.f16360a != null) {
            this.f16360a.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f16361b.startActivity(intent);
    }
}
