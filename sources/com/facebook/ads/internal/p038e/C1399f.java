package com.facebook.ads.internal.p038e;

import android.support.annotation.Nullable;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.internal.e.f */
abstract class C1399f<T> {
    /* renamed from: a */
    private C1398a f3814a;

    /* renamed from: com.facebook.ads.internal.e.f$a */
    public enum C1398a {
        UNKNOWN(9000, "An unknown error has occurred."),
        DATABASE_SELECT(AdError.MEDIATION_ERROR_CODE, "Failed to read from database."),
        DATABASE_INSERT(3002, "Failed to insert row into database."),
        DATABASE_UPDATE(3003, "Failed to update row in database."),
        DATABASE_DELETE(3004, "Failed to delete row from database.");
        
        /* renamed from: f */
        private final int f3812f;
        /* renamed from: g */
        private final String f3813g;

        private C1398a(int i, String str) {
            this.f3812f = i;
            this.f3813g = str;
        }

        /* renamed from: a */
        public int m4857a() {
            return this.f3812f;
        }

        /* renamed from: b */
        public String m4858b() {
            return this.f3813g;
        }
    }

    C1399f() {
    }

    /* renamed from: a */
    protected void m4859a(C1398a c1398a) {
        this.f3814a = c1398a;
    }

    @Nullable
    /* renamed from: b */
    abstract T mo3337b();

    /* renamed from: c */
    public C1398a m4861c() {
        return this.f3814a;
    }
}
