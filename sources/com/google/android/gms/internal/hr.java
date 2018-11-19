package com.google.android.gms.internal;

import android.util.JsonWriter;
import java.util.Map;

final /* synthetic */ class hr implements hw {
    /* renamed from: a */
    private final String f23315a;
    /* renamed from: b */
    private final String f23316b;
    /* renamed from: c */
    private final Map f23317c;
    /* renamed from: d */
    private final byte[] f23318d;

    hr(String str, String str2, Map map, byte[] bArr) {
        this.f23315a = str;
        this.f23316b = str2;
        this.f23317c = map;
        this.f23318d = bArr;
    }

    /* renamed from: a */
    public final void mo4625a(JsonWriter jsonWriter) {
        hq.m19892a(this.f23315a, this.f23316b, this.f23317c, this.f23318d, jsonWriter);
    }
}
