package com.google.android.gms.auth.api.signin.internal;

/* renamed from: com.google.android.gms.auth.api.signin.internal.o */
public final class C2454o {
    /* renamed from: a */
    private static int f7396a = 31;
    /* renamed from: b */
    private int f7397b = 1;

    /* renamed from: a */
    public final int m8825a() {
        return this.f7397b;
    }

    /* renamed from: a */
    public final C2454o m8826a(Object obj) {
        this.f7397b = (f7396a * this.f7397b) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final C2454o m8827a(boolean z) {
        this.f7397b = (f7396a * this.f7397b) + z;
        return this;
    }
}
