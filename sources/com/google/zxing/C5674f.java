package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.zxing.f */
public final class C5674f {
    /* renamed from: a */
    private final String f21028a;
    /* renamed from: b */
    private final byte[] f21029b;
    /* renamed from: c */
    private final int f21030c;
    /* renamed from: d */
    private C5675g[] f21031d;
    /* renamed from: e */
    private final BarcodeFormat f21032e;
    /* renamed from: f */
    private Map<ResultMetadataType, Object> f21033f;
    /* renamed from: g */
    private final long f21034g;

    public C5674f(String str, byte[] bArr, C5675g[] c5675gArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, c5675gArr, barcodeFormat, System.currentTimeMillis());
    }

    public C5674f(String str, byte[] bArr, C5675g[] c5675gArr, BarcodeFormat barcodeFormat, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, c5675gArr, barcodeFormat, j);
    }

    public C5674f(String str, byte[] bArr, int i, C5675g[] c5675gArr, BarcodeFormat barcodeFormat, long j) {
        this.f21028a = str;
        this.f21029b = bArr;
        this.f21030c = i;
        this.f21031d = c5675gArr;
        this.f21032e = barcodeFormat;
        this.f21033f = null;
        this.f21034g = j;
    }

    /* renamed from: a */
    public String m24839a() {
        return this.f21028a;
    }

    /* renamed from: b */
    public C5675g[] m24843b() {
        return this.f21031d;
    }

    /* renamed from: c */
    public Map<ResultMetadataType, Object> m24844c() {
        return this.f21033f;
    }

    /* renamed from: a */
    public void m24840a(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f21033f == null) {
            this.f21033f = new EnumMap(ResultMetadataType.class);
        }
        this.f21033f.put(resultMetadataType, obj);
    }

    /* renamed from: a */
    public void m24841a(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            if (this.f21033f == null) {
                this.f21033f = map;
                return;
            }
            this.f21033f.putAll(map);
        }
    }

    /* renamed from: a */
    public void m24842a(C5675g[] c5675gArr) {
        Object obj = this.f21031d;
        if (obj == null) {
            this.f21031d = c5675gArr;
            return;
        }
        if (c5675gArr != null && c5675gArr.length > 0) {
            Object obj2 = new C5675g[(obj.length + c5675gArr.length)];
            System.arraycopy(obj, 0, obj2, 0, obj.length);
            System.arraycopy(c5675gArr, 0, obj2, obj.length, c5675gArr.length);
            this.f21031d = obj2;
        }
    }

    public String toString() {
        return this.f21028a;
    }
}
