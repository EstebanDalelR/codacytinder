package com.google.android.gms.internal;

import android.content.Context;

public final class pl {
    /* renamed from: b */
    private static pl f16389b = new pl();
    /* renamed from: a */
    private pk f16390a = null;

    /* renamed from: a */
    public static pk m20131a(Context context) {
        return f16389b.m20132b(context);
    }

    /* renamed from: b */
    private final synchronized pk m20132b(Context context) {
        if (this.f16390a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f16390a = new pk(context);
        }
        return this.f16390a;
    }
}
