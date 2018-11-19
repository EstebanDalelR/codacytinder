package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class lf implements zzt<zzanh> {
    /* renamed from: a */
    private /* synthetic */ le f23408a;

    lf(le leVar) {
        this.f23408a = leVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f23408a.f28776b) {
                        if (this.f23408a.f28799y != parseInt) {
                            this.f23408a.f28799y = parseInt;
                            this.f23408a.requestLayout();
                        }
                    }
                } catch (Throwable e) {
                    hx.m19914c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
