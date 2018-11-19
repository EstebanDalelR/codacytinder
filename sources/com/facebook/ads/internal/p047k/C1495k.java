package com.facebook.ads.internal.p047k;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1520a;
import com.facebook.ads.internal.protocol.C1522c;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.k.k */
public final class C1495k {
    /* renamed from: a */
    private final C1494a f4136a;
    @Nullable
    /* renamed from: b */
    private final Long f4137b;
    @Nullable
    /* renamed from: c */
    private final String f4138c;
    @Nullable
    /* renamed from: d */
    private final String f4139d;

    /* renamed from: com.facebook.ads.internal.k.k$a */
    private enum C1494a {
        ID,
        CREATIVE,
        NONE
    }

    public C1495k(Context context, String str, String str2, C1522c c1522c) {
        if (TextUtils.isEmpty(str)) {
            this.f4136a = C1494a.NONE;
            this.f4137b = null;
            this.f4139d = null;
            this.f4138c = null;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            switch (C1494a.valueOf(jSONObject.getString("type").toUpperCase())) {
                case ID:
                    this.f4136a = C1494a.ID;
                    this.f4137b = Long.valueOf(jSONObject.getString("bid_id"));
                    this.f4139d = jSONObject.getString("device_id");
                    this.f4138c = null;
                    break;
                case CREATIVE:
                    this.f4136a = C1494a.CREATIVE;
                    this.f4137b = Long.valueOf(jSONObject.getString("bid_id"));
                    this.f4139d = jSONObject.getString("device_id");
                    this.f4138c = new JSONObject(jSONObject.getString("payload")).toString();
                    break;
                default:
                    AdErrorType adErrorType = AdErrorType.BID_PAYLOAD_ERROR;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported BidPayload type ");
                    stringBuilder.append(jSONObject.getString("type"));
                    throw new C1520a(adErrorType, stringBuilder.toString());
            }
            if (!jSONObject.getString("sdk_version").equals("4.27.0")) {
                throw new C1520a(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for SDK version %s being used on SDK version %s", new Object[]{this.f4137b, jSONObject.getString("sdk_version"), "4.27.0"}));
            } else if (!jSONObject.getString("resolved_placement_id").equals(str2)) {
                throw new C1520a(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for placement %s being used on placement %s", new Object[]{this.f4137b, jSONObject.getString("resolved_placement_id"), str2}));
            } else if (jSONObject.getInt("template") != c1522c.m5362a()) {
                throw new C1520a(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for template %s being used on template %s", new Object[]{this.f4137b, Integer.valueOf(jSONObject.getInt("template")), c1522c}));
            }
        } catch (Exception e) {
            C1502p.m5285a(e, context);
            throw new C1520a(AdErrorType.BID_PAYLOAD_ERROR, "Invalid BidPayload", e);
        }
    }

    /* renamed from: a */
    public void m5265a(String str) {
        if (!this.f4139d.equals(str)) {
            throw new C1520a(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for IDFA %s being used on IDFA %s", new Object[]{this.f4137b, this.f4139d, str}));
        }
    }

    /* renamed from: a */
    public boolean m5266a() {
        return this.f4136a == C1494a.CREATIVE;
    }

    @Nullable
    /* renamed from: b */
    public String m5267b() {
        return this.f4138c;
    }

    /* renamed from: c */
    public boolean m5268c() {
        return this.f4136a != C1494a.NONE;
    }

    @Nullable
    /* renamed from: d */
    public String m5269d() {
        return this.f4137b == null ? null : this.f4137b.toString();
    }
}
