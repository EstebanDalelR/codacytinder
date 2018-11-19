package com.google.android.m4b.maps.ct;

import java.io.IOException;

/* renamed from: com.google.android.m4b.maps.ct.m */
public final class C5274m extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    /* renamed from: a */
    private C6656q f19596a = null;

    public C5274m(String str) {
        super(str);
    }

    /* renamed from: a */
    public final C5274m m23418a(C6656q c6656q) {
        this.f19596a = c6656q;
        return this;
    }

    /* renamed from: a */
    public final C6656q m23419a() {
        return this.f19596a;
    }

    /* renamed from: b */
    static C5274m m23409b() {
        return new C5274m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: c */
    static C5274m m23410c() {
        return new C5274m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: d */
    static C5274m m23411d() {
        return new C5274m("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: e */
    static C5274m m23412e() {
        return new C5274m("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: f */
    static C5274m m23413f() {
        return new C5274m("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: g */
    static C5274m m23414g() {
        return new C5274m("Protocol message tag had invalid wire type.");
    }

    /* renamed from: h */
    static C5274m m23415h() {
        return new C5274m("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: i */
    static C5274m m23416i() {
        return new C5274m("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: j */
    static C5274m m23417j() {
        return new C5274m("Protocol message had invalid UTF-8.");
    }
}
