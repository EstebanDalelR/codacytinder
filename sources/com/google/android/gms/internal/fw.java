package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.C2513p;
import java.io.File;

@TargetApi(17)
public class fw extends fz {
    /* renamed from: a */
    public final android.graphics.drawable.Drawable mo7667a(android.content.Context r4, android.graphics.Bitmap r5, boolean r6, float r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        if (r6 == 0) goto L_0x0053;
    L_0x0002:
        r6 = 0;
        r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r6 <= 0) goto L_0x0053;
    L_0x0007:
        r6 = 1103626240; // 0x41c80000 float:25.0 double:5.45263811E-315;
        r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r6 <= 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0053;
    L_0x000e:
        r6 = r5.getWidth();	 Catch:{ RuntimeException -> 0x0049 }
        r0 = r5.getHeight();	 Catch:{ RuntimeException -> 0x0049 }
        r1 = 0;	 Catch:{ RuntimeException -> 0x0049 }
        r6 = android.graphics.Bitmap.createScaledBitmap(r5, r6, r0, r1);	 Catch:{ RuntimeException -> 0x0049 }
        r0 = android.graphics.Bitmap.createBitmap(r6);	 Catch:{ RuntimeException -> 0x0049 }
        r1 = android.renderscript.RenderScript.create(r4);	 Catch:{ RuntimeException -> 0x0049 }
        r2 = android.renderscript.Element.U8_4(r1);	 Catch:{ RuntimeException -> 0x0049 }
        r2 = android.renderscript.ScriptIntrinsicBlur.create(r1, r2);	 Catch:{ RuntimeException -> 0x0049 }
        r6 = android.renderscript.Allocation.createFromBitmap(r1, r6);	 Catch:{ RuntimeException -> 0x0049 }
        r1 = android.renderscript.Allocation.createFromBitmap(r1, r0);	 Catch:{ RuntimeException -> 0x0049 }
        r2.setRadius(r7);	 Catch:{ RuntimeException -> 0x0049 }
        r2.setInput(r6);	 Catch:{ RuntimeException -> 0x0049 }
        r2.forEach(r1);	 Catch:{ RuntimeException -> 0x0049 }
        r1.copyTo(r0);	 Catch:{ RuntimeException -> 0x0049 }
        r6 = new android.graphics.drawable.BitmapDrawable;	 Catch:{ RuntimeException -> 0x0049 }
        r7 = r4.getResources();	 Catch:{ RuntimeException -> 0x0049 }
        r6.<init>(r7, r0);	 Catch:{ RuntimeException -> 0x0049 }
        return r6;
    L_0x0049:
        r6 = new android.graphics.drawable.BitmapDrawable;
        r4 = r4.getResources();
        r6.<init>(r4, r5);
        return r6;
    L_0x0053:
        r6 = new android.graphics.drawable.BitmapDrawable;
        r4 = r4.getResources();
        r6.<init>(r4, r5);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fw.a(android.content.Context, android.graphics.Bitmap, boolean, float):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public final String mo7668a(Context context) {
        hh a = hh.m19846a();
        if (TextUtils.isEmpty(a.f16138a)) {
            a.f16138a = (String) hg.m19844a(context, new hi(a, C2513p.getRemoteContext(context), context));
        }
        return a.f16138a;
    }

    /* renamed from: a */
    public final boolean mo6865a(Context context, WebSettings webSettings) {
        super.mo6865a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    /* renamed from: b */
    public final void mo7669b(Context context) {
        hh a = hh.m19846a();
        ec.m27332a("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a.f16138a)) {
            Context remoteContext = C2513p.getRemoteContext(context);
            if (remoteContext == null) {
                Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    putString.apply();
                } else {
                    String str = "admob_user_agent";
                    File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.setExecutable(true, false);
                    }
                    file.setExecutable(true, false);
                    putString.commit();
                    new File(file, String.valueOf(str).concat(".xml")).setReadable(true, false);
                }
            }
            a.f16138a = defaultUserAgent;
        }
        ec.m27332a("User agent is updated.");
        ar.i().m27325w();
    }
}
