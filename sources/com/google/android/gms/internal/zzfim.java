package com.google.android.gms.internal;

import java.util.List;

public final class zzfim extends RuntimeException {
    /* renamed from: a */
    private final List<String> f16702a = null;

    public zzfim(zzfhe zzfhe) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public final zzfge m20329a() {
        return new zzfge(getMessage());
    }
}
