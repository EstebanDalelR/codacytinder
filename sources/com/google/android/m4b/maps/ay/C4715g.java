package com.google.android.m4b.maps.ay;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;

/* renamed from: com.google.android.m4b.maps.ay.g */
public final class C4715g extends DataOutputStream implements DataOutput {
    /* renamed from: a */
    private final ByteArrayOutputStream f17332a;

    public C4715g() {
        this(new ByteArrayOutputStream());
    }

    private C4715g(ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
        this.f17332a = byteArrayOutputStream;
    }

    /* renamed from: a */
    public final byte[] m20962a() {
        return this.f17332a.toByteArray();
    }
}
