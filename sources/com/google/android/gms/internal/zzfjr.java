package com.google.android.gms.internal;

import java.io.IOException;

public final class zzfjr extends IOException {
    public zzfjr(String str) {
        super(str);
    }

    /* renamed from: a */
    static zzfjr m20330a() {
        return new zzfjr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static zzfjr m20331b() {
        return new zzfjr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static zzfjr m20332c() {
        return new zzfjr("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static zzfjr m20333d() {
        return new zzfjr("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
