package com.google.android.m4b.maps.ax;

import com.google.android.m4b.maps.ax.C4699a.C7436c;

/* renamed from: com.google.android.m4b.maps.ax.c */
public final class C4701c {
    /* renamed from: a */
    private final C7436c f17287a;
    /* renamed from: b */
    private final int f17288b;

    public C4701c(C7436c c7436c, int i) {
        this.f17287a = c7436c;
        this.f17288b = i;
    }

    /* renamed from: a */
    public final C7436c m20902a() {
        return this.f17287a;
    }

    /* renamed from: b */
    public final int m20903b() {
        return this.f17288b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4701c) {
            return this.f17287a.equals(((C4701c) obj).f17287a);
        }
        return obj instanceof C7436c ? this.f17287a.equals(obj) : null;
    }

    public final int hashCode() {
        return this.f17287a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        String valueOf2 = String.valueOf(this.f17287a);
        int i = this.f17288b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 35) + String.valueOf(valueOf2).length());
        stringBuilder.append("{");
        stringBuilder.append(valueOf);
        stringBuilder.append(":mId=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", mLevelNumberE3=");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
