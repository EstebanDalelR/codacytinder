package com.leanplum;

import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat.C0382c;
import android.text.TextUtils;
import com.leanplum.p069a.ao;

/* renamed from: com.leanplum.i */
final class C5735i {
    /* renamed from: a */
    private static final int f21342a = -14;
    /* renamed from: b */
    private static final int f21343b = 14;
    /* renamed from: c */
    private static final String f21344c = "leanplum_default_push_icon";

    C5735i() {
    }

    /* renamed from: a */
    static C0382c m25210a(Context context, boolean z) {
        if (!z) {
            return new C0382c(context);
        }
        z = C5732f.m25190a(context);
        if (!TextUtils.isEmpty(z)) {
            return new C0382c(context, z);
        }
        ao.b(new Object[]{"Failed to post notification, there are no notification channels configured."});
        return null;
    }

    /* renamed from: b */
    private static Builder m25214b(Context context, boolean z) {
        z = C5732f.m25190a(context);
        if (!TextUtils.isEmpty(z)) {
            return new Builder(context, z);
        }
        ao.b(new Object[]{"Failed to post notification, there are no notification channels configured."});
        return null;
    }

    /* renamed from: a */
    static android.support.v4.app.NotificationCompat.C0382c m25209a(android.content.Context r3, android.os.Bundle r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = com.leanplum.utils.BuildUtil.isNotificationChannelSupported(r3);
        if (r0 == 0) goto L_0x0042;
    L_0x0006:
        r0 = 0;
        r1 = 1;
        r2 = "lp_channel";	 Catch:{ Exception -> 0x0037 }
        r4 = r4.getString(r2);	 Catch:{ Exception -> 0x0037 }
        r2 = android.text.TextUtils.isEmpty(r4);	 Catch:{ Exception -> 0x0037 }
        if (r2 != 0) goto L_0x0032;	 Catch:{ Exception -> 0x0037 }
    L_0x0014:
        r4 = com.leanplum.p069a.ab.a(r4);	 Catch:{ Exception -> 0x0037 }
        r4 = com.leanplum.C5732f.m25191a(r3, r4);	 Catch:{ Exception -> 0x0037 }
        r2 = android.text.TextUtils.isEmpty(r4);	 Catch:{ Exception -> 0x0037 }
        if (r2 != 0) goto L_0x0028;	 Catch:{ Exception -> 0x0037 }
    L_0x0022:
        r2 = new android.support.v4.app.NotificationCompat$c;	 Catch:{ Exception -> 0x0037 }
        r2.<init>(r3, r4);	 Catch:{ Exception -> 0x0037 }
        goto L_0x0047;	 Catch:{ Exception -> 0x0037 }
    L_0x0028:
        r3 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0037 }
        r4 = "Failed to post notification to specified channel.";	 Catch:{ Exception -> 0x0037 }
        r3[r0] = r4;	 Catch:{ Exception -> 0x0037 }
        com.leanplum.p069a.ao.b(r3);	 Catch:{ Exception -> 0x0037 }
        goto L_0x0040;	 Catch:{ Exception -> 0x0037 }
    L_0x0032:
        r2 = com.leanplum.C5735i.m25210a(r3, r1);	 Catch:{ Exception -> 0x0037 }
        goto L_0x0047;
    L_0x0037:
        r3 = new java.lang.Object[r1];
        r4 = "Failed to post notification to specified channel.";
        r3[r0] = r4;
        com.leanplum.p069a.ao.a(r3);
    L_0x0040:
        r2 = 0;
        goto L_0x0047;
    L_0x0042:
        r2 = new android.support.v4.app.NotificationCompat$c;
        r2.<init>(r3);
    L_0x0047:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.i.a(android.content.Context, android.os.Bundle):android.support.v4.app.NotificationCompat$c");
    }

    /* renamed from: b */
    private static android.app.Notification.Builder m25213b(android.content.Context r4, android.os.Bundle r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = com.leanplum.utils.BuildUtil.isNotificationChannelSupported(r4);
        r1 = 0;
        if (r0 == 0) goto L_0x0058;
    L_0x0007:
        r0 = 0;
        r2 = 1;
        r3 = "lp_channel";	 Catch:{ Exception -> 0x004e }
        r5 = r5.getString(r3);	 Catch:{ Exception -> 0x004e }
        r3 = android.text.TextUtils.isEmpty(r5);	 Catch:{ Exception -> 0x004e }
        if (r3 != 0) goto L_0x0033;	 Catch:{ Exception -> 0x004e }
    L_0x0015:
        r5 = com.leanplum.p069a.ab.a(r5);	 Catch:{ Exception -> 0x004e }
        r5 = com.leanplum.C5732f.m25191a(r4, r5);	 Catch:{ Exception -> 0x004e }
        r3 = android.text.TextUtils.isEmpty(r5);	 Catch:{ Exception -> 0x004e }
        if (r3 != 0) goto L_0x0029;	 Catch:{ Exception -> 0x004e }
    L_0x0023:
        r3 = new android.app.Notification$Builder;	 Catch:{ Exception -> 0x004e }
        r3.<init>(r4, r5);	 Catch:{ Exception -> 0x004e }
        goto L_0x0042;	 Catch:{ Exception -> 0x004e }
    L_0x0029:
        r4 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x004e }
        r5 = "Failed to post notification to specified channel.";	 Catch:{ Exception -> 0x004e }
        r4[r0] = r5;	 Catch:{ Exception -> 0x004e }
        com.leanplum.p069a.ao.b(r4);	 Catch:{ Exception -> 0x004e }
        goto L_0x005d;	 Catch:{ Exception -> 0x004e }
    L_0x0033:
        r5 = com.leanplum.C5732f.m25190a(r4);	 Catch:{ Exception -> 0x004e }
        r3 = android.text.TextUtils.isEmpty(r5);	 Catch:{ Exception -> 0x004e }
        if (r3 != 0) goto L_0x0044;	 Catch:{ Exception -> 0x004e }
    L_0x003d:
        r3 = new android.app.Notification$Builder;	 Catch:{ Exception -> 0x004e }
        r3.<init>(r4, r5);	 Catch:{ Exception -> 0x004e }
    L_0x0042:
        r1 = r3;	 Catch:{ Exception -> 0x004e }
        goto L_0x005d;	 Catch:{ Exception -> 0x004e }
    L_0x0044:
        r4 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x004e }
        r5 = "Failed to post notification, there are no notification channels configured.";	 Catch:{ Exception -> 0x004e }
        r4[r0] = r5;	 Catch:{ Exception -> 0x004e }
        com.leanplum.p069a.ao.b(r4);	 Catch:{ Exception -> 0x004e }
        goto L_0x005d;
    L_0x004e:
        r4 = new java.lang.Object[r2];
        r5 = "Failed to post notification to specified channel.";
        r4[r0] = r5;
        com.leanplum.p069a.ao.a(r4);
        goto L_0x005d;
    L_0x0058:
        r1 = new android.app.Notification$Builder;
        r1.<init>(r4);
    L_0x005d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.i.b(android.content.Context, android.os.Bundle):android.app.Notification$Builder");
    }

    /* renamed from: a */
    static Builder m25208a(Context context, Bundle bundle, PendingIntent pendingIntent, String str, String str2, Bitmap bitmap, int i) {
        if (VERSION.SDK_INT < 16) {
            return null;
        }
        Builder b = C5735i.m25213b(context, bundle);
        if (i == 0) {
            b.setSmallIcon(context.getApplicationInfo().icon);
        } else {
            b.setSmallIcon(i);
        }
        b.setContentTitle(str).setContentText(str2);
        context = new C5736j();
        context.bigPicture(bitmap).setBigContentTitle(str).setSummaryText(bundle.getString("lp_message"));
        b.setStyle(context);
        if (VERSION.SDK_INT >= 24) {
            try {
                context = b.createBigContentView();
                if (context != null) {
                    b.setCustomBigContentView(context);
                }
            } catch (Context context2) {
                ao.a(new Object[]{"Cannot modify push notification layout.", context2});
            }
        }
        b.setAutoCancel(true);
        b.setContentIntent(pendingIntent);
        return b;
    }

    /* renamed from: c */
    private static boolean m25215c(android.content.Context r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r1.getResources();	 Catch:{ Throwable -> 0x0018 }
        r1 = r1.getApplicationInfo();	 Catch:{ Throwable -> 0x0018 }
        r1 = r1.icon;	 Catch:{ Throwable -> 0x0018 }
        r1 = r0.openRawResource(r1);	 Catch:{ Throwable -> 0x0018 }
        r0 = "applicationInfo.icon";	 Catch:{ Throwable -> 0x0018 }
        r1 = android.graphics.drawable.AdaptiveIconDrawable.createFromStream(r1, r0);	 Catch:{ Throwable -> 0x0018 }
        if (r1 == 0) goto L_0x0018;
    L_0x0016:
        r1 = 1;
        return r1;
    L_0x0018:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.i.c(android.content.Context):boolean");
    }

    /* renamed from: a */
    static boolean m25211a(Context context) {
        if (context == null) {
            return null;
        }
        if (VERSION.SDK_INT < 26) {
            return true;
        }
        return C5735i.m25215c(context);
    }

    /* renamed from: b */
    static int m25212b(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r3.getResources();	 Catch:{ Throwable -> 0x0011 }
        r1 = "leanplum_default_push_icon";	 Catch:{ Throwable -> 0x0011 }
        r2 = "drawable";	 Catch:{ Throwable -> 0x0011 }
        r3 = r3.getPackageName();	 Catch:{ Throwable -> 0x0011 }
        r3 = r0.getIdentifier(r1, r2, r3);	 Catch:{ Throwable -> 0x0011 }
        return r3;
    L_0x0011:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.i.b(android.content.Context):int");
    }
}
