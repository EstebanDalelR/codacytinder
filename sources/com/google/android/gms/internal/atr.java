package com.google.android.gms.internal;

import org.json.JSONObject;

@zzzv
public final class atr {
    /* renamed from: a */
    private final boolean f15719a;
    /* renamed from: b */
    private final boolean f15720b;
    /* renamed from: c */
    private final boolean f15721c;
    /* renamed from: d */
    private final boolean f15722d;
    /* renamed from: e */
    private final boolean f15723e;

    private atr(att att) {
        this.f15719a = att.f15724a;
        this.f15720b = att.f15725b;
        this.f15721c = att.f15726c;
        this.f15722d = att.f15727d;
        this.f15723e = att.f15728e;
    }

    /* renamed from: a */
    public final JSONObject m19475a() {
        try {
            return new JSONObject().put("sms", this.f15719a).put("tel", this.f15720b).put("calendar", this.f15721c).put("storePicture", this.f15722d).put("inlineVideo", this.f15723e);
        } catch (Throwable e) {
            hx.m19912b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
