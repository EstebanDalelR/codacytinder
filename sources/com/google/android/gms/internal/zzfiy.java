package com.google.android.gms.internal;

public enum zzfiy {
    DOUBLE(zzfjd.DOUBLE, 1),
    FLOAT(zzfjd.FLOAT, 5),
    INT64(zzfjd.LONG, 0),
    UINT64(zzfjd.LONG, 0),
    INT32(zzfjd.INT, 0),
    FIXED64(zzfjd.LONG, 1),
    FIXED32(zzfjd.INT, 5),
    BOOL(zzfjd.BOOLEAN, 0),
    STRING(zzfjd.STRING, 2),
    GROUP(zzfjd.MESSAGE, 3),
    MESSAGE(zzfjd.MESSAGE, 2),
    BYTES(zzfjd.BYTE_STRING, 2),
    UINT32(zzfjd.INT, 0),
    ENUM(zzfjd.ENUM, 0),
    SFIXED32(zzfjd.INT, 5),
    SFIXED64(zzfjd.LONG, 1),
    SINT32(zzfjd.INT, 0),
    SINT64(zzfjd.LONG, 0);
    
    private final zzfjd zzpmh;
    private final int zzpmi;

    private zzfiy(zzfjd zzfjd, int i) {
        this.zzpmh = zzfjd;
        this.zzpmi = i;
    }

    public final zzfjd zzdad() {
        return this.zzpmh;
    }

    public final int zzdae() {
        return this.zzpmi;
    }
}
