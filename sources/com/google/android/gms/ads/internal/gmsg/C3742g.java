package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzzv;
import java.util.Map;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.gmsg.g */
public final class C3742g implements zzt<zzanh> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzanh zzanh = (zzanh) obj;
        String str = (String) map.get("action");
        String str2;
        if ("tick".equals(str)) {
            str = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            str2 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str)) {
                ec.e("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str2)) {
                ec.e("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = ar.m8654k().elapsedRealtime() + (Long.parseLong(str2) - ar.m8654k().currentTimeMillis());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzanh.zzsj().a(str, str3, elapsedRealtime);
                } catch (Throwable e) {
                    ec.c("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            str2 = (String) map.get("value");
            if (TextUtils.isEmpty(str2)) {
                ec.e("No value given for CSI experiment.");
                return;
            }
            r11 = zzanh.zzsj().a();
            if (r11 == null) {
                ec.e("No ticker for WebView, dropping experiment ID.");
            } else {
                r11.a("e", str2);
            }
        } else {
            if ("extra".equals(str)) {
                str = (String) map.get("name");
                str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    ec.e("No value given for CSI extra.");
                } else if (TextUtils.isEmpty(str)) {
                    ec.e("No name given for CSI extra.");
                } else {
                    r11 = zzanh.zzsj().a();
                    if (r11 == null) {
                        ec.e("No ticker for WebView, dropping extra parameter.");
                        return;
                    }
                    r11.a(str, str2);
                }
            }
        }
    }
}
