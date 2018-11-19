package com.google.android.m4b.maps.bo;

import java.io.DataInput;

/* renamed from: com.google.android.m4b.maps.bo.b */
public class C4838b {
    /* renamed from: b */
    public static final C4838b f17701b = new C4838b(5);
    /* renamed from: a */
    protected final int f17702a;

    /* renamed from: com.google.android.m4b.maps.bo.b$a */
    public static class C6492a extends C4838b {
        /* renamed from: c */
        public static final C6492a f24118c = new C6492a(5, 0);

        private C6492a(int i) {
            super(i);
        }

        private C6492a(int i, int i2) {
            super(80);
        }

        /* renamed from: b */
        public static C6492a m28599b(DataInput dataInput) {
            return new C6492a(dataInput.readUnsignedByte());
        }

        /* renamed from: d */
        public final int m28600d() {
            return (this.a >> 4) & 15;
        }
    }

    /* renamed from: c */
    public static int m21600c() {
        return 16;
    }

    public C4838b(int i) {
        this.f17702a = i;
    }

    /* renamed from: a */
    public static C4838b m21599a(DataInput dataInput) {
        return new C4838b(dataInput.readUnsignedByte());
    }

    /* renamed from: a */
    public final int m21601a() {
        return this.f17702a & 3;
    }

    /* renamed from: b */
    public final int m21602b() {
        return (this.f17702a >> 2) & 3;
    }

    public int hashCode() {
        return this.f17702a + 31;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f17702a == ((C4838b) obj).f17702a;
    }
}
