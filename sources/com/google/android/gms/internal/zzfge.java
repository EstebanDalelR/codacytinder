package com.google.android.gms.internal;

import java.io.IOException;

public class zzfge extends IOException {
    /* renamed from: a */
    private zzfhe f16699a = null;

    public zzfge(String str) {
        super(str);
    }

    /* renamed from: a */
    static zzfge m20315a() {
        return new zzfge("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static zzfge m20316b() {
        return new zzfge("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static zzfge m20317c() {
        return new zzfge("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static zzfge m20318d() {
        return new zzfge("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static zzfge m20319e() {
        return new zzfge("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static zzfgf m20320f() {
        return new zzfgf("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static zzfge m20321g() {
        return new zzfge("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: h */
    static zzfge m20322h() {
        return new zzfge("Protocol message had invalid UTF-8.");
    }

    /* renamed from: a */
    public final zzfge m20323a(zzfhe zzfhe) {
        this.f16699a = zzfhe;
        return this;
    }
}
