package com.google.android.gms.internal;

import android.text.TextUtils;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class amy implements zzt<Object> {
    /* renamed from: a */
    final /* synthetic */ zzzb f23009a;
    /* renamed from: b */
    final /* synthetic */ amx f23010b;

    amy(amx amx, zzzb zzzb) {
        this.f23010b = amx;
        this.f23009a = zzzb;
    }

    public final void zza(Object obj, Map<String, String> map) {
        zzanh zzanh = (zzanh) this.f23010b.f15511a.get();
        if (zzanh == null) {
            this.f23009a.zzb("/loadHtml", this);
            return;
        }
        zzanh.zzsz().m20000a(new ana(this, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzanh.loadData(str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8");
        } else {
            zzanh.loadDataWithBaseURL(str2, str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8", null);
        }
    }
}
