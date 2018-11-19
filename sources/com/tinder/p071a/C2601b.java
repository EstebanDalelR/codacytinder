package com.tinder.p071a;

import com.tinder.enums.SqlDataType;

/* renamed from: com.tinder.a.b */
public class C2601b {
    /* renamed from: a */
    private final String f8130a;
    /* renamed from: b */
    private final SqlDataType f8131b;
    /* renamed from: c */
    private final boolean f8132c;
    /* renamed from: d */
    private final boolean f8133d;

    public C2601b(String str, SqlDataType sqlDataType, boolean z, boolean z2) {
        this.f8130a = str;
        this.f8131b = sqlDataType;
        this.f8132c = z;
        this.f8133d = z2;
    }

    public C2601b(String str, SqlDataType sqlDataType, boolean z) {
        this(str, sqlDataType, z, false);
    }

    /* renamed from: a */
    public String m9754a() {
        return this.f8130a;
    }

    /* renamed from: b */
    public SqlDataType m9755b() {
        return this.f8131b;
    }

    /* renamed from: c */
    public boolean m9756c() {
        return this.f8132c;
    }

    /* renamed from: d */
    public boolean m9757d() {
        return this.f8133d;
    }
}
