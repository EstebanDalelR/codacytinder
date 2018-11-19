package com.google.android.m4b.maps.ar;

import com.google.android.m4b.maps.at.C4669b;

/* renamed from: com.google.android.m4b.maps.ar.b */
public final class C4664b {
    /* renamed from: b */
    private static final C4663a[] f17108b = new C4663a[168];
    /* renamed from: a */
    private final C4669b f17109a;
    /* renamed from: c */
    private final String f17110c;

    /* renamed from: com.google.android.m4b.maps.ar.b$a */
    static class C4663a {
        /* renamed from: a */
        private int f17106a;
        /* renamed from: b */
        private Object f17107b;

        C4663a(int i, Object obj) {
            this.f17106a = i;
            this.f17107b = obj;
        }

        public final int hashCode() {
            return this.f17106a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (obj instanceof C4663a) {
                    C4663a c4663a = (C4663a) obj;
                    return this.f17106a == c4663a.f17106a && (this.f17107b == c4663a.f17107b || !(this.f17107b == null || this.f17107b.equals(c4663a.f17107b) == null));
                }
            }
            return false;
        }

        public final String toString() {
            int i = this.f17106a;
            String valueOf = String.valueOf(this.f17107b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
            stringBuilder.append("TypeInfo{type=");
            stringBuilder.append(i);
            stringBuilder.append(", data=");
            stringBuilder.append(valueOf);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    static {
        int i = 0;
        for (int i2 = 0; i2 <= 7; i2++) {
            int i3 = 16;
            while (i3 < 37) {
                int i4 = i + 1;
                f17108b[i] = new C4663a((i2 << 8) + i3, null);
                i3++;
                i = i4;
            }
        }
    }

    public C4664b() {
        this(null);
    }

    private C4664b(String str) {
        this.f17110c = null;
        this.f17109a = new C4669b();
    }

    /* renamed from: a */
    public final C4664b m20850a(int i, int i2, Object obj) {
        C4669b c4669b = this.f17109a;
        if (obj == null) {
            i = f17108b[(((65280 & i) >> 8) * 21) + ((i & 255) - 16)];
        } else {
            i = new C4663a(i, obj);
        }
        c4669b.m20874a(i2, i);
        return this;
    }

    /* renamed from: a */
    final C4669b m20851a() {
        return this.f17109a.m20872a();
    }

    /* renamed from: a */
    public final int m20849a(int i) {
        C4663a c4663a = (C4663a) this.f17109a.m20873a(i);
        if (c4663a == null) {
            return 16;
        }
        return c4663a.f17106a & 255;
    }

    /* renamed from: b */
    public final Object m20852b(int i) {
        C4663a c4663a = (C4663a) this.f17109a.m20873a(i);
        if (c4663a == null) {
            return c4663a;
        }
        return c4663a.f17107b;
    }

    public final String toString() {
        String str = "ProtoBufType Name: ";
        String valueOf = String.valueOf(this.f17110c);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return this.f17109a.equals(((C4664b) obj).f17109a);
    }

    public final int hashCode() {
        return this.f17109a.hashCode();
    }
}
