package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.Nullable;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.ar;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@zzzv
@TargetApi(11)
public class lx extends ku {
    public lx(zzanh zzanh, boolean z) {
        super(zzanh, z);
    }

    /* renamed from: a */
    protected final WebResourceResponse m27429a(WebView webView, String str, @Nullable Map<String, String> map) {
        if (webView instanceof zzanh) {
            zzanh zzanh = (zzanh) webView;
            if (this.b != null) {
                this.b.zza(str, map, 1);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
                return super.shouldInterceptRequest(webView, str);
            }
            if (zzanh.zzsz() != null) {
                zzanh.zzsz().m20024n();
            }
            ald ald = zzanh.zzsx().m20048d() ? alo.f15429G : zzanh.zztc() ? alo.f15428F : alo.f15427E;
            String str2 = (String) aja.m19221f().m19334a(ald);
            try {
                Context context = zzanh.getContext();
                String str3 = zzanh.zzsk().zzcv;
                Map hashMap = new HashMap();
                hashMap.put("User-Agent", ar.e().m19746a(context, str3));
                hashMap.put("Cache-Control", "max-stale=3600");
                str2 = (String) new gr(context).m19832a(str2, hashMap).get(60, TimeUnit.SECONDS);
                return str2 == null ? null : new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str2.getBytes("UTF-8")));
            } catch (Exception e) {
                str = "Could not fetch MRAID JS. ";
                str2 = String.valueOf(e.getMessage());
                hx.m19916e(str2.length() == 0 ? new String(str) : str.concat(str2));
                return null;
            }
        }
        hx.m19916e("Tried to intercept request from a WebView that wasn't an AdWebView.");
        return null;
    }
}
