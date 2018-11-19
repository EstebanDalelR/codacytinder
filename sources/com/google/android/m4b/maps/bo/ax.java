package com.google.android.m4b.maps.bo;

import java.io.DataInput;

public final class ax {
    /* renamed from: c */
    private static ax f17691c = new ax(0, ar.m21544a());
    /* renamed from: a */
    private final int f17692a;
    /* renamed from: b */
    private final ar f17693b;

    public ax(int i, ar arVar) {
        this.f17692a = i;
        this.f17693b = arVar;
    }

    /* renamed from: a */
    public static ax m21581a(DataInput dataInput, int i) {
        return new ax(dataInput.readInt(), ar.m21545a(dataInput));
    }

    /* renamed from: a */
    public static ax m21580a() {
        return f17691c;
    }

    /* renamed from: b */
    public final int m21582b() {
        return this.f17692a;
    }

    public final int hashCode() {
        return ((this.f17692a + 31) * 31) + (this.f17693b == null ? 0 : this.f17693b.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ax axVar = (ax) obj;
        if (this.f17692a != axVar.f17692a) {
            return false;
        }
        if (this.f17693b == null) {
            if (axVar.f17693b != null) {
                return false;
            }
        } else if (this.f17693b.equals(axVar.f17693b) == null) {
            return false;
        }
        return true;
    }
}
