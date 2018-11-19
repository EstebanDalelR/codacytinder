package com.google.android.gms.gcm;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat.C0382c;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.C2335R;
import com.google.android.gms.common.util.C2526k;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.gcm.d */
final class C2547d {
    /* renamed from: a */
    static C2547d f7746a;
    /* renamed from: b */
    private final Context f7747b;
    /* renamed from: c */
    private String f7748c;
    /* renamed from: d */
    private final AtomicInteger f7749d = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private C2547d(Context context) {
        this.f7747b = context.getApplicationContext();
    }

    /* renamed from: a */
    private final android.os.Bundle m9279a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.f7747b;	 Catch:{ NameNotFoundException -> 0x0013 }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0013 }
        r1 = r3.f7747b;	 Catch:{ NameNotFoundException -> 0x0013 }
        r1 = r1.getPackageName();	 Catch:{ NameNotFoundException -> 0x0013 }
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0013 }
        r0 = r0.getApplicationInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x0013 }
        goto L_0x0014;
    L_0x0013:
        r0 = 0;
    L_0x0014:
        if (r0 == 0) goto L_0x001d;
    L_0x0016:
        r1 = r0.metaData;
        if (r1 == 0) goto L_0x001d;
    L_0x001a:
        r0 = r0.metaData;
        return r0;
    L_0x001d:
        r0 = android.os.Bundle.EMPTY;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.d.a():android.os.Bundle");
    }

    /* renamed from: a */
    static synchronized C2547d m9280a(Context context) {
        C2547d c2547d;
        synchronized (C2547d.class) {
            if (f7746a == null) {
                f7746a = new C2547d(context);
            }
            c2547d = f7746a;
        }
        return c2547d;
    }

    /* renamed from: a */
    static String m9281a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    /* renamed from: a */
    static void m9282a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String string = bundle.getString(str);
            if (str.startsWith("gcm.notification.")) {
                str = str.replace("gcm.notification.", "gcm.n.");
            }
            if (str.startsWith("gcm.n.")) {
                if (!"gcm.n.e".equals(str)) {
                    bundle2.putString(str.substring(6), string);
                }
                it.remove();
            }
        }
        String string2 = bundle2.getString("sound2");
        if (string2 != null) {
            bundle2.remove("sound2");
            bundle2.putString("sound", string2);
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("notification", bundle2);
        }
    }

    /* renamed from: b */
    private final java.lang.String m9283b(android.os.Bundle r10, java.lang.String r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r9 = this;
        r0 = com.google.android.gms.gcm.C2547d.m9281a(r10, r11);
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x000b;
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = java.lang.String.valueOf(r11);
        r1 = "_loc_key";
        r1 = java.lang.String.valueOf(r1);
        r2 = r1.length();
        if (r2 == 0) goto L_0x0020;
    L_0x001b:
        r0 = r0.concat(r1);
        goto L_0x0026;
    L_0x0020:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x0026:
        r0 = com.google.android.gms.gcm.C2547d.m9281a(r10, r0);
        r1 = android.text.TextUtils.isEmpty(r0);
        r2 = 0;
        if (r1 == 0) goto L_0x0032;
    L_0x0031:
        return r2;
    L_0x0032:
        r1 = r9.f7747b;
        r1 = r1.getResources();
        r3 = "string";
        r4 = r9.f7747b;
        r4 = r4.getPackageName();
        r3 = r1.getIdentifier(r0, r3, r4);
        r4 = 6;
        if (r3 != 0) goto L_0x0098;
    L_0x0047:
        r10 = "GcmNotification";
        r11 = java.lang.String.valueOf(r11);
        r1 = "_loc_key";
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x005e;
    L_0x0059:
        r11 = r11.concat(r1);
        goto L_0x0064;
    L_0x005e:
        r1 = new java.lang.String;
        r1.<init>(r11);
        r11 = r1;
    L_0x0064:
        r11 = r11.substring(r4);
        r1 = java.lang.String.valueOf(r11);
        r1 = r1.length();
        r1 = r1 + 49;
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r1 = r1 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r1);
        r3.append(r11);
        r11 = " resource not found: ";
        r3.append(r11);
        r3.append(r0);
        r11 = " Default value will be used.";
        r3.append(r11);
        r11 = r3.toString();
        android.util.Log.w(r10, r11);
        return r2;
    L_0x0098:
        r5 = java.lang.String.valueOf(r11);
        r6 = "_loc_args";
        r6 = java.lang.String.valueOf(r6);
        r7 = r6.length();
        if (r7 == 0) goto L_0x00ad;
    L_0x00a8:
        r5 = r5.concat(r6);
        goto L_0x00b3;
    L_0x00ad:
        r6 = new java.lang.String;
        r6.<init>(r5);
        r5 = r6;
    L_0x00b3:
        r10 = com.google.android.gms.gcm.C2547d.m9281a(r10, r5);
        r5 = android.text.TextUtils.isEmpty(r10);
        if (r5 == 0) goto L_0x00c2;
    L_0x00bd:
        r10 = r1.getString(r3);
        return r10;
    L_0x00c2:
        r5 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0117, MissingFormatArgumentException -> 0x00df }
        r5.<init>(r10);	 Catch:{ JSONException -> 0x0117, MissingFormatArgumentException -> 0x00df }
        r6 = r5.length();	 Catch:{ JSONException -> 0x0117, MissingFormatArgumentException -> 0x00df }
        r6 = new java.lang.String[r6];	 Catch:{ JSONException -> 0x0117, MissingFormatArgumentException -> 0x00df }
        r7 = 0;	 Catch:{ JSONException -> 0x0117, MissingFormatArgumentException -> 0x00df }
    L_0x00ce:
        r8 = r6.length;	 Catch:{ JSONException -> 0x0117, MissingFormatArgumentException -> 0x00df }
        if (r7 >= r8) goto L_0x00da;	 Catch:{ JSONException -> 0x0117, MissingFormatArgumentException -> 0x00df }
    L_0x00d1:
        r8 = r5.opt(r7);	 Catch:{ JSONException -> 0x0117, MissingFormatArgumentException -> 0x00df }
        r6[r7] = r8;	 Catch:{ JSONException -> 0x0117, MissingFormatArgumentException -> 0x00df }
        r7 = r7 + 1;	 Catch:{ JSONException -> 0x0117, MissingFormatArgumentException -> 0x00df }
        goto L_0x00ce;	 Catch:{ JSONException -> 0x0117, MissingFormatArgumentException -> 0x00df }
    L_0x00da:
        r1 = r1.getString(r3, r6);	 Catch:{ JSONException -> 0x0117, MissingFormatArgumentException -> 0x00df }
        return r1;
    L_0x00df:
        r11 = move-exception;
        r1 = "GcmNotification";
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r3 = r3 + 58;
        r4 = java.lang.String.valueOf(r10);
        r4 = r4.length();
        r3 = r3 + r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "Missing format argument for ";
        r4.append(r3);
        r4.append(r0);
        r0 = ": ";
        r4.append(r0);
        r4.append(r10);
        r10 = " Default value will be used.";
        r4.append(r10);
        r10 = r4.toString();
        android.util.Log.w(r1, r10, r11);
        return r2;
    L_0x0117:
        r0 = "GcmNotification";
        r11 = java.lang.String.valueOf(r11);
        r1 = "_loc_args";
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x012e;
    L_0x0129:
        r11 = r11.concat(r1);
        goto L_0x0134;
    L_0x012e:
        r1 = new java.lang.String;
        r1.<init>(r11);
        r11 = r1;
    L_0x0134:
        r11 = r11.substring(r4);
        r1 = java.lang.String.valueOf(r11);
        r1 = r1.length();
        r1 = r1 + 41;
        r3 = java.lang.String.valueOf(r10);
        r3 = r3.length();
        r1 = r1 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r1);
        r1 = "Malformed ";
        r3.append(r1);
        r3.append(r11);
        r11 = ": ";
        r3.append(r11);
        r3.append(r10);
        r10 = "  Default value will be used.";
        r3.append(r10);
        r10 = r3.toString();
        android.util.Log.w(r0, r10);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.d.b(android.os.Bundle, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    static boolean m9284b(Context context) {
        if (((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        int myPid = Process.myPid();
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private final PendingIntent m9285c(Bundle bundle) {
        Intent launchIntentForPackage;
        Object a = C2547d.m9281a(bundle, "gcm.n.click_action");
        if (TextUtils.isEmpty(a)) {
            launchIntentForPackage = this.f7747b.getPackageManager().getLaunchIntentForPackage(this.f7747b.getPackageName());
            if (launchIntentForPackage == null) {
                Log.w("GcmNotification", "No activity found to launch app");
                return null;
            }
        }
        launchIntentForPackage = new Intent(a);
        launchIntentForPackage.setPackage(this.f7747b.getPackageName());
        launchIntentForPackage.setFlags(268435456);
        Bundle bundle2 = new Bundle(bundle);
        GcmListenerService.zzq(bundle2);
        launchIntentForPackage.putExtras(bundle2);
        for (String str : bundle2.keySet()) {
            if (str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                launchIntentForPackage.removeExtra(str);
            }
        }
        return PendingIntent.getActivity(this.f7747b, this.f7749d.getAndIncrement(), launchIntentForPackage, 1073741824);
    }

    /* renamed from: b */
    final boolean m9286b(Bundle bundle) {
        int identifier;
        Object a;
        String a2;
        String str;
        Uri uri;
        PendingIntent c;
        C0382c a3;
        Notification a4;
        String a5;
        NotificationManager notificationManager;
        CharSequence b = m9283b(bundle, "gcm.n.title");
        if (TextUtils.isEmpty(b)) {
            b = this.f7747b.getApplicationInfo().loadLabel(this.f7747b.getPackageManager());
        }
        CharSequence b2 = m9283b(bundle, "gcm.n.body");
        String a6 = C2547d.m9281a(bundle, "gcm.n.icon");
        if (!TextUtils.isEmpty(a6)) {
            String packageName;
            Resources resources = this.f7747b.getResources();
            identifier = resources.getIdentifier(a6, "drawable", this.f7747b.getPackageName());
            if (identifier == 0) {
                identifier = resources.getIdentifier(a6, "mipmap", this.f7747b.getPackageName());
                if (identifier == 0) {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(a6).length() + 57);
                    stringBuilder.append("Icon resource ");
                    stringBuilder.append(a6);
                    stringBuilder.append(" not found. Notification will use app icon.");
                    Log.w("GcmNotification", stringBuilder.toString());
                }
            }
            a = C2547d.m9281a(bundle, "gcm.n.color");
            a2 = C2547d.m9281a(bundle, "gcm.n.sound2");
            str = null;
            if (TextUtils.isEmpty(a2)) {
                uri = null;
            } else if (!"default".equals(a2) || this.f7747b.getResources().getIdentifier(a2, "raw", this.f7747b.getPackageName()) == 0) {
                uri = RingtoneManager.getDefaultUri(2);
            } else {
                String str2 = "android.resource://";
                packageName = this.f7747b.getPackageName();
                StringBuilder stringBuilder2 = new StringBuilder(((String.valueOf(str2).length() + 5) + String.valueOf(packageName).length()) + String.valueOf(a2).length());
                stringBuilder2.append(str2);
                stringBuilder2.append(packageName);
                stringBuilder2.append("/raw/");
                stringBuilder2.append(a2);
                uri = Uri.parse(stringBuilder2.toString());
            }
            c = m9285c(bundle);
            if (C2526k.m9218i() || this.f7747b.getApplicationInfo().targetSdkVersion <= 25) {
                a3 = new C0382c(this.f7747b).m1418a(true).m1410a(identifier);
                if (!TextUtils.isEmpty(b)) {
                    a3.m1416a(b);
                }
                if (!TextUtils.isEmpty(b2)) {
                    a3.m1420b(b2);
                }
                if (!TextUtils.isEmpty(a)) {
                    a3.m1424d(Color.parseColor(a));
                }
                if (uri != null) {
                    a3.m1414a(uri);
                }
                if (c != null) {
                    a3.m1412a(c);
                }
                a4 = a3.m1409a();
            } else {
                packageName = C2547d.m9281a(bundle, "gcm.n.android_channel_id");
                if (C2526k.m9218i()) {
                    NotificationManager notificationManager2 = (NotificationManager) this.f7747b.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(packageName)) {
                        if (notificationManager2.getNotificationChannel(packageName) != null) {
                            str = packageName;
                        } else {
                            StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(packageName).length() + 122);
                            stringBuilder3.append("Notification Channel requested (");
                            stringBuilder3.append(packageName);
                            stringBuilder3.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                            Log.w("GcmNotification", stringBuilder3.toString());
                        }
                    }
                    if (this.f7748c == null) {
                        String str3;
                        this.f7748c = m9279a().getString("com.google.android.gms.gcm.default_notification_channel_id");
                        if (TextUtils.isEmpty(this.f7748c)) {
                            packageName = "GcmNotification";
                            str3 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
                        } else if (notificationManager2.getNotificationChannel(this.f7748c) == null) {
                            packageName = "GcmNotification";
                            str3 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
                        }
                        Log.w(packageName, str3);
                        if (notificationManager2.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            notificationManager2.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", this.f7747b.getString(C2335R.string.gcm_fallback_notification_channel_label), 3));
                        }
                        this.f7748c = "fcm_fallback_notification_channel";
                    }
                    str = this.f7748c;
                }
                Builder smallIcon = new Builder(this.f7747b).setAutoCancel(true).setSmallIcon(identifier);
                if (!TextUtils.isEmpty(b)) {
                    smallIcon.setContentTitle(b);
                }
                if (!TextUtils.isEmpty(b2)) {
                    smallIcon.setContentText(b2);
                    smallIcon.setStyle(new BigTextStyle().bigText(b2));
                }
                if (!TextUtils.isEmpty(a)) {
                    smallIcon.setColor(Color.parseColor(a));
                }
                if (uri != null) {
                    smallIcon.setSound(uri);
                }
                if (c != null) {
                    smallIcon.setContentIntent(c);
                }
                if (str != null) {
                    smallIcon.setChannelId(str);
                }
                a4 = smallIcon.build();
            }
            a5 = C2547d.m9281a(bundle, "gcm.n.tag");
            if (Log.isLoggable("GcmNotification", 3)) {
                Log.d("GcmNotification", "Showing notification");
            }
            notificationManager = (NotificationManager) this.f7747b.getSystemService("notification");
            if (TextUtils.isEmpty(a5)) {
                long uptimeMillis = SystemClock.uptimeMillis();
                StringBuilder stringBuilder4 = new StringBuilder(37);
                stringBuilder4.append("GCM-Notification:");
                stringBuilder4.append(uptimeMillis);
                a5 = stringBuilder4.toString();
            }
            notificationManager.notify(a5, 0, a4);
            return true;
        }
        int i = this.f7747b.getApplicationInfo().icon;
        identifier = i == 0 ? 17301651 : i;
        a = C2547d.m9281a(bundle, "gcm.n.color");
        a2 = C2547d.m9281a(bundle, "gcm.n.sound2");
        str = null;
        if (TextUtils.isEmpty(a2)) {
            uri = null;
        } else {
            if ("default".equals(a2)) {
            }
            uri = RingtoneManager.getDefaultUri(2);
        }
        c = m9285c(bundle);
        if (C2526k.m9218i()) {
        }
        a3 = new C0382c(this.f7747b).m1418a(true).m1410a(identifier);
        if (TextUtils.isEmpty(b)) {
            a3.m1416a(b);
        }
        if (TextUtils.isEmpty(b2)) {
            a3.m1420b(b2);
        }
        if (TextUtils.isEmpty(a)) {
            a3.m1424d(Color.parseColor(a));
        }
        if (uri != null) {
            a3.m1414a(uri);
        }
        if (c != null) {
            a3.m1412a(c);
        }
        a4 = a3.m1409a();
        a5 = C2547d.m9281a(bundle, "gcm.n.tag");
        if (Log.isLoggable("GcmNotification", 3)) {
            Log.d("GcmNotification", "Showing notification");
        }
        notificationManager = (NotificationManager) this.f7747b.getSystemService("notification");
        if (TextUtils.isEmpty(a5)) {
            long uptimeMillis2 = SystemClock.uptimeMillis();
            StringBuilder stringBuilder42 = new StringBuilder(37);
            stringBuilder42.append("GCM-Notification:");
            stringBuilder42.append(uptimeMillis2);
            a5 = stringBuilder42.toString();
        }
        notificationManager.notify(a5, 0, a4);
        return true;
    }
}
