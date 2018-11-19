package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@zzzv
public final class gj {
    /* renamed from: a */
    private final Object f16094a = new Object();
    /* renamed from: b */
    private String f16095b = "";
    /* renamed from: c */
    private String f16096c = "";
    /* renamed from: d */
    private boolean f16097d = false;
    /* renamed from: e */
    private String f16098e = "";

    /* renamed from: a */
    private final String m19809a(Context context) {
        String str;
        synchronized (this.f16094a) {
            if (TextUtils.isEmpty(this.f16095b)) {
                ar.e();
                this.f16095b = fk.m19714b(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f16095b)) {
                    ar.e();
                    this.f16095b = fk.m19685a();
                    ar.e();
                    fk.m19720c(context, "debug_signals_id.txt", this.f16095b);
                }
            }
            str = this.f16095b;
        }
        return str;
    }

    /* renamed from: a */
    private final void m19810a(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            fk.f16060a.post(new gk(this, context, str, z, z2));
        } else {
            hx.m19915d("Can not create dialog without Activity Context");
        }
    }

    /* renamed from: b */
    private final boolean m19811b(Context context, String str, String str2) {
        Object d = m19814d(context, m19812c(context, (String) aja.m19221f().m19334a(alo.cB), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            hx.m19911b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d.trim());
            String optString = jSONObject.optString("gct");
            this.f16098e = jSONObject.optString("status");
            synchronized (this.f16094a) {
                this.f16096c = optString;
            }
            return true;
        } catch (Throwable e) {
            hx.m19914c("Fail to get in app preview response json.", e);
            return false;
        }
    }

    /* renamed from: c */
    private final Uri m19812c(Context context, String str, String str2, String str3) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", m19809a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: c */
    private final boolean m19813c(Context context, String str, String str2) {
        Object d = m19814d(context, m19812c(context, (String) aja.m19221f().m19334a(alo.cC), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            hx.m19911b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d.trim()).optString("debug_mode"));
            synchronized (this.f16094a) {
                this.f16097d = equals;
            }
            return equals;
        } catch (Throwable e) {
            hx.m19914c("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* renamed from: d */
    private static String m19814d(Context context, String str, String str2) {
        Throwable e;
        String str3;
        Map hashMap = new HashMap();
        hashMap.put("User-Agent", ar.e().m19746a(context, str2));
        zzakv a = new gr(context).m19832a(str, hashMap);
        try {
            return (String) a.get((long) ((Integer) aja.m19221f().m19334a(alo.cE)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            e = e2;
            str3 = "Timeout while retriving a response from: ";
            str = String.valueOf(str);
            if (str.length() == 0) {
                str = new String(str3);
                hx.m19912b(str, e);
                a.cancel(true);
                return null;
            }
            str = str3.concat(str);
            hx.m19912b(str, e);
            a.cancel(true);
            return null;
        } catch (InterruptedException e3) {
            e = e3;
            str3 = "Interrupted while retriving a response from: ";
            str = String.valueOf(str);
            if (str.length() != 0) {
                str = str3.concat(str);
                hx.m19912b(str, e);
                a.cancel(true);
                return null;
            }
            str = new String(str3);
            hx.m19912b(str, e);
            a.cancel(true);
            return null;
        } catch (Throwable e4) {
            str2 = "Error retriving a response from: ";
            str = String.valueOf(str);
            hx.m19912b(str.length() != 0 ? str2.concat(str) : new String(str2), e4);
            return null;
        }
    }

    /* renamed from: e */
    private final void m19815e(Context context, String str, String str2) {
        ar.e();
        fk.m19697a(context, m19812c(context, (String) aja.m19221f().m19334a(alo.cA), str, str2));
    }

    /* renamed from: a */
    public final String m19816a() {
        String str;
        synchronized (this.f16094a) {
            str = this.f16096c;
        }
        return str;
    }

    /* renamed from: a */
    public final void m19817a(Context context, String str, String str2) {
        if (!m19811b(context, str, str2)) {
            m19810a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.f16098e)) {
            hx.m19911b("Creative is not pushed for this device.");
            m19810a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.f16098e)) {
            hx.m19911b("The app is not linked for creative preview.");
            m19815e(context, str, str2);
        } else {
            if ("0".equals(this.f16098e)) {
                hx.m19911b("Device is linked for in app preview.");
                m19810a(context, "The device is successfully linked for creative preview.", false, true);
            }
        }
    }

    /* renamed from: a */
    public final void m19818a(Context context, String str, String str2, String str3) {
        boolean b = m19820b();
        if (m19813c(context, str, str2)) {
            if (!(b || TextUtils.isEmpty(str3))) {
                m19819b(context, str2, str3, str);
            }
            hx.m19911b("Device is linked for debug signals.");
            m19810a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        m19815e(context, str, str2);
    }

    /* renamed from: b */
    public final void m19819b(Context context, String str, String str2, String str3) {
        Builder buildUpon = m19812c(context, (String) aja.m19221f().m19334a(alo.cD), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        ar.e();
        fk.m19717b(context, str, buildUpon.build().toString());
    }

    /* renamed from: b */
    public final boolean m19820b() {
        boolean z;
        synchronized (this.f16094a) {
            z = this.f16097d;
        }
        return z;
    }
}
