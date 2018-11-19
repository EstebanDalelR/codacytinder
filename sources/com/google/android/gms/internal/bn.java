package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C2507w;

@zzzv
public final class bn extends bs {
    /* renamed from: a */
    private final String f26851a;
    /* renamed from: b */
    private final int f26852b;

    public bn(String str, int i) {
        this.f26851a = str;
        this.f26852b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        if (C2507w.a(this.f26851a, bnVar.f26851a) && C2507w.a(Integer.valueOf(this.f26852b), Integer.valueOf(bnVar.f26852b))) {
            return true;
        }
        return false;
    }

    public final int getAmount() {
        return this.f26852b;
    }

    public final String getType() {
        return this.f26851a;
    }
}
