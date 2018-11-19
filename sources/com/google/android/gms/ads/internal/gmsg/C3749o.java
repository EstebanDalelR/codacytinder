package com.google.android.gms.ads.internal.gmsg;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.zzanh;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.o */
final class C3749o implements zzt<zzanh> {
    C3749o() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzanh zzanh = (zzanh) obj;
        WindowManager windowManager = (WindowManager) zzanh.getContext().getSystemService("window");
        ar.m8648e();
        View view = (View) zzanh;
        DisplayMetrics a = fk.a(windowManager);
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        Map hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzanh.zza("locationReady", hashMap);
        ec.e("GET LOCATION COMPILED");
    }
}
