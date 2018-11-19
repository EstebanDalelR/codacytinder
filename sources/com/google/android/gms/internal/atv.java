package com.google.android.gms.internal;

import org.json.JSONObject;

@zzzv
public class atv {
    /* renamed from: a */
    private final zzanh f15729a;
    /* renamed from: b */
    private final String f15730b;

    public atv(zzanh zzanh) {
        this(zzanh, "");
    }

    public atv(zzanh zzanh, String str) {
        this.f15729a = zzanh;
        this.f15730b = str;
    }

    /* renamed from: a */
    public final void m19486a(int i, int i2, int i3, int i4) {
        try {
            this.f15729a.zza("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (Throwable e) {
            hx.m19912b("Error occured while dispatching size change.", e);
        }
    }

    /* renamed from: a */
    public final void m19487a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f15729a.zza("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (Throwable e) {
            hx.m19912b("Error occured while obtaining screen information.", e);
        }
    }

    /* renamed from: a */
    public final void m19488a(String str) {
        try {
            this.f15729a.zza("onError", new JSONObject().put("message", str).put("action", this.f15730b));
        } catch (Throwable e) {
            hx.m19912b("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: b */
    public final void m19489b(int i, int i2, int i3, int i4) {
        try {
            this.f15729a.zza("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (Throwable e) {
            hx.m19912b("Error occured while dispatching default position.", e);
        }
    }

    /* renamed from: b */
    public final void m19490b(String str) {
        try {
            this.f15729a.zza("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (Throwable e) {
            hx.m19912b("Error occured while dispatching ready Event.", e);
        }
    }

    /* renamed from: c */
    public final void m19491c(String str) {
        try {
            this.f15729a.zza("onStateChanged", new JSONObject().put("state", str));
        } catch (Throwable e) {
            hx.m19912b("Error occured while dispatching state change.", e);
        }
    }
}
