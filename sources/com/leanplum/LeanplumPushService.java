package com.leanplum;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.p069a.ag;
import com.leanplum.p069a.ak;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.aw;
import com.leanplum.p069a.bo;
import com.leanplum.utils.SharedPreferencesUtil;
import java.util.List;

public class LeanplumPushService {
    public static final String LEANPLUM_ACTION_PARAM = "lp_action_param";
    public static final String LEANPLUM_MESSAGE_ID = "lp_message_id";
    public static final String LEANPLUM_MESSAGE_PARAM = "lp_message_param";
    public static final String LEANPLUM_NOTIFICATION = "LP_NOTIFICATION";
    public static final String LEANPLUM_SENDER_ID = "44059457771";
    /* renamed from: a */
    private static final String f7854a = "com.leanplum.LeanplumPushFcmListenerService";
    /* renamed from: b */
    private static final String f7855b = "com.leanplum.LeanplumPushFirebaseMessagingService";
    /* renamed from: c */
    private static final String f7856c = "com.leanplum.LeanplumPushInstanceIDService";
    /* renamed from: d */
    private static final String f7857d = "com.leanplum.LeanplumPushListenerService";
    /* renamed from: e */
    private static final String f7858e = "com.google.android.gms.gcm.GcmReceiver";
    /* renamed from: f */
    private static final int f7859f = 1;
    /* renamed from: g */
    private static final String f7860g = "Open URL";
    /* renamed from: h */
    private static final String f7861h = "URL";
    /* renamed from: i */
    private static final String f7862i = "Open";
    /* renamed from: j */
    private static final int f7863j = 37;
    /* renamed from: k */
    private static Class<? extends Activity> f7864k = null;
    /* renamed from: l */
    private static C5731c f7865l = null;
    /* renamed from: m */
    private static boolean f7866m = false;
    /* renamed from: n */
    private static LeanplumPushNotificationCustomizer f7867n;

    public static void enableFirebase() {
        f7866m = true;
    }

    /* renamed from: c */
    private static boolean m9418c() {
        return f7866m;
    }

    /* renamed from: a */
    static C5731c m9407a() {
        return f7865l;
    }

    public static void setDefaultCallbackClass(Class<? extends Activity> cls) {
        f7864k = cls;
    }

    public static void setCustomizer(LeanplumPushNotificationCustomizer leanplumPushNotificationCustomizer) {
        f7867n = leanplumPushNotificationCustomizer;
    }

    public static void setGcmSenderId(String str) {
        C7045e.a(str);
    }

    public static void setGcmSenderIds(String... strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strArr) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(str);
        }
        C7045e.a(stringBuilder.toString());
    }

    /* renamed from: d */
    private static Class<? extends Activity> m9421d() {
        return f7864k;
    }

    /* renamed from: c */
    private static boolean m9420c(Bundle bundle) {
        return bundle.containsKey("_lpx");
    }

    /* renamed from: b */
    private static void m9416b(String str, VariablesChangedCallback variablesChangedCallback) {
        Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new LeanplumPushService$1(str, variablesChangedCallback));
    }

    /* renamed from: d */
    private static String m9422d(Bundle bundle) {
        String string = bundle.getString("_lpm");
        if (string == null) {
            string = bundle.getString("_lpu");
            if (string == null) {
                string = bundle.getString("_lpn");
                if (string == null) {
                    string = bundle.getString("_lpv");
                }
            }
        }
        if (string != null) {
            bundle.putString("lp_messageId", string);
        }
        return string;
    }

    /* renamed from: a */
    static void m9410a(Context context, Bundle bundle) {
        if (LeanplumActivityHelper.f7831b == null || LeanplumActivityHelper.f7830a || !(bundle.containsKey("_lpu") || bundle.containsKey("_lpv"))) {
            if (m9422d(bundle) != null) {
                if (ag.m9501j()) {
                    m9415b(context, bundle);
                    return;
                }
            }
            m9415b(context, bundle);
        }
    }

    /* renamed from: b */
    private static void m9415b(android.content.Context r13, android.os.Bundle r14) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        if (r13 == 0) goto L_0x018e;
    L_0x0002:
        if (r14 != 0) goto L_0x0006;
    L_0x0004:
        goto L_0x018e;
    L_0x0006:
        r0 = com.leanplum.Leanplum.AnonymousClass12.m14526a(r13);
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x0020;
    L_0x000e:
        r0 = com.leanplum.Leanplum.AnonymousClass12.m14527b(r13);
        if (r0 != 0) goto L_0x001e;
    L_0x0014:
        r13 = new java.lang.Object[r2];
        r14 = "You are using adaptive icons without having a fallback icon for push notifications on Android Oreo. \nThis can cause a factory reset of the device on Android Version 26. Please add regular icon with name \"leanplum_default_push_icon.png\" to your \"drawable\" folder.\nGoogle issue: https://issuetracker.google.com/issues/68716460";
        r13[r1] = r14;
        com.leanplum.p069a.ao.m9516a(r13);
        return;
    L_0x001e:
        r9 = r0;
        goto L_0x0021;
    L_0x0020:
        r9 = 0;
    L_0x0021:
        r0 = "notification";
        r0 = r13.getSystemService(r0);
        r0 = (android.app.NotificationManager) r0;
        r3 = new android.content.Intent;
        r4 = com.leanplum.LeanplumPushReceiver.class;
        r3.<init>(r13, r4);
        r4 = "lpAction";
        r3.addCategory(r4);
        r3.putExtras(r14);
        r4 = r13.getApplicationContext();
        r5 = new java.util.Random;
        r5.<init>();
        r5 = r5.nextInt();
        r10 = android.app.PendingIntent.getBroadcast(r4, r5, r3, r1);
        r3 = r13.getApplicationContext();
        r3 = com.leanplum.p069a.bo.m9598a(r3);
        r4 = "title";
        r4 = r14.getString(r4);
        if (r4 == 0) goto L_0x005f;
    L_0x0059:
        r3 = "title";
        r3 = r14.getString(r3);
    L_0x005f:
        r6 = r3;
        r11 = com.leanplum.Leanplum.AnonymousClass12.m14524a(r13, r14);
        if (r11 != 0) goto L_0x0067;
    L_0x0066:
        return;
    L_0x0067:
        r3 = "lp_message";
        r7 = r14.getString(r3);
        if (r9 != 0) goto L_0x0079;
    L_0x006f:
        r3 = r13.getApplicationInfo();
        r3 = r3.icon;
        r11.m1410a(r3);
        goto L_0x007c;
    L_0x0079:
        r11.m1410a(r9);
    L_0x007c:
        r3 = r11.m1416a(r6);
        r4 = new android.support.v4.app.NotificationCompat$b;
        r4.<init>();
        r4 = r4.m11018a(r7);
        r3 = r3.m1415a(r4);
        r3.m1420b(r7);
        r3 = "lp_imageUrl";
        r3 = r14.getString(r3);
        r4 = 0;
        r5 = android.text.TextUtils.isEmpty(r3);
        r12 = 16;
        if (r5 != 0) goto L_0x00e5;
    L_0x009f:
        r5 = android.os.Build.VERSION.SDK_INT;
        if (r5 < r12) goto L_0x00e5;
    L_0x00a3:
        r8 = com.leanplum.utils.BitmapUtil.getScaledBitmap(r13, r3);
        if (r8 == 0) goto L_0x00d4;
    L_0x00a9:
        if (r7 == 0) goto L_0x00b3;
    L_0x00ab:
        r3 = r7.length();
        r5 = 37;
        if (r3 < r5) goto L_0x00b7;
    L_0x00b3:
        r3 = f7867n;
        if (r3 == 0) goto L_0x00cc;
    L_0x00b7:
        r3 = new android.support.v4.app.NotificationCompat$a;
        r3.<init>();
        r3 = r3.m11014a(r8);
        r3 = r3.m11015a(r6);
        r3 = r3.m11017b(r7);
        r11.m1415a(r3);
        goto L_0x00e5;
    L_0x00cc:
        r3 = r13;
        r4 = r14;
        r5 = r10;
        r4 = com.leanplum.Leanplum.AnonymousClass12.m14523a(r3, r4, r5, r6, r7, r8, r9);
        goto L_0x00e5;
    L_0x00d4:
        r5 = new java.lang.Object[r2];
        r6 = "Image download failed for push notification with big picture. No image will be included with the push notification. Image URL: %s.";
        r7 = new java.lang.Object[r2];
        r7[r1] = r3;
        r3 = java.lang.String.format(r6, r7);
        r5[r1] = r3;
        com.leanplum.p069a.ao.m9517b(r5);
    L_0x00e5:
        r3 = android.os.Build.VERSION.SDK_INT;
        r5 = 2;
        if (r3 < r12) goto L_0x00f3;
    L_0x00ea:
        r13 = com.leanplum.utils.BuildUtil.isNotificationChannelSupported(r13);
        if (r13 != 0) goto L_0x00f3;
    L_0x00f0:
        r11.m1422c(r5);
    L_0x00f3:
        r11.m1418a(r2);
        r11.m1412a(r10);
        r13 = f7867n;
        if (r13 == 0) goto L_0x0114;
    L_0x00fd:
        r13 = f7867n;	 Catch:{ Throwable -> 0x0103 }
        r13.customize(r11, r14);	 Catch:{ Throwable -> 0x0103 }
        goto L_0x0114;
    L_0x0103:
        r13 = move-exception;
        r14 = new java.lang.Object[r5];
        r0 = "Unable to customize push notification: ";
        r14[r1] = r0;
        r13 = com.leanplum.p069a.ao.m9513a(r13);
        r14[r2] = r13;
        com.leanplum.p069a.ao.m9516a(r14);
        return;
    L_0x0114:
        r13 = "lp_notificationId";
        r13 = r14.get(r13);
        r3 = r13 instanceof java.lang.Number;
        if (r3 == 0) goto L_0x0125;
    L_0x011e:
        r13 = (java.lang.Number) r13;
        r13 = r13.intValue();
        goto L_0x0146;
    L_0x0125:
        r3 = r13 instanceof java.lang.String;
        if (r3 == 0) goto L_0x0130;
    L_0x0129:
        r13 = (java.lang.String) r13;	 Catch:{ NumberFormatException -> 0x0145 }
        r13 = java.lang.Integer.parseInt(r13);	 Catch:{ NumberFormatException -> 0x0145 }
        goto L_0x0146;
    L_0x0130:
        r13 = "lp_messageId";
        r13 = r14.containsKey(r13);
        if (r13 == 0) goto L_0x0145;
    L_0x0138:
        r13 = "lp_messageId";
        r13 = r14.getString(r13);
        if (r13 == 0) goto L_0x0145;
    L_0x0140:
        r13 = r13.hashCode();
        goto L_0x0146;
    L_0x0145:
        r13 = 1;
    L_0x0146:
        r3 = "_lpx";	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
        r14 = r14.getString(r3);	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
        r14 = com.leanplum.p069a.ab.m9452a(r14);	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
        r14 = com.leanplum.ActionContext.m14512a(r14);	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
        if (r14 == 0) goto L_0x015f;	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
    L_0x0156:
        r14 = new com.leanplum.LeanplumPushService$2;	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
        r14.<init>(r4, r0, r13, r11);	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
        com.leanplum.Leanplum.forceContentUpdate(r14);	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
        goto L_0x0180;	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
    L_0x015f:
        if (r4 == 0) goto L_0x0169;	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
    L_0x0161:
        r14 = r4.build();	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
        r0.notify(r13, r14);	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
        goto L_0x0180;	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
    L_0x0169:
        r14 = r11.m1409a();	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
        r0.notify(r13, r14);	 Catch:{ NullPointerException -> 0x0181, Throwable -> 0x0171 }
        return;
    L_0x0171:
        r13 = move-exception;
        r14 = new java.lang.Object[r5];
        r0 = "Unable to show push notification.";
        r14[r1] = r0;
        r14[r2] = r13;
        com.leanplum.p069a.ao.m9516a(r14);
        com.leanplum.p069a.bo.m9608a(r13);
    L_0x0180:
        return;
    L_0x0181:
        r13 = move-exception;
        r14 = new java.lang.Object[r5];
        r0 = "Unable to show push notification.";
        r14[r1] = r0;
        r14[r2] = r13;
        com.leanplum.p069a.ao.m9516a(r14);
        return;
    L_0x018e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.LeanplumPushService.b(android.content.Context, android.os.Bundle):void");
    }

    /* renamed from: a */
    static void m9409a(Context context, Intent intent) {
        Object[] objArr = new Object[1];
        boolean z = false;
        objArr[0] = "Opening push notification action.";
        ao.m9521f(objArr);
        Bundle preHandlePushNotification = preHandlePushNotification(context, intent);
        if (preHandlePushNotification != null) {
            Intent e;
            Object obj;
            Class cls;
            Activity activity;
            Class cls2;
            String string = preHandlePushNotification.getString("_lpx");
            if (string != null && string.contains(f7860g)) {
                e = m9423e(preHandlePushNotification);
                if (e != null) {
                    Boolean valueOf;
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(e, 0);
                    if (!(queryIntentActivities == null || queryIntentActivities.isEmpty())) {
                        for (ResolveInfo resolveInfo : queryIntentActivities) {
                            if (resolveInfo != null && resolveInfo.activityInfo != null && resolveInfo.activityInfo.name != null && resolveInfo.activityInfo.name.contains(context.getPackageName())) {
                                e.setPackage(resolveInfo.activityInfo.packageName);
                                valueOf = Boolean.valueOf(true);
                                break;
                            }
                        }
                    }
                    valueOf = Boolean.valueOf(false);
                    if (valueOf.booleanValue()) {
                        String d = m9422d(preHandlePushNotification);
                        if (d != null) {
                            new ActionContext("__Push Notification", null, d).track(f7862i, 0.0d, null);
                            context.startActivity(e);
                            obj = 1;
                            if (obj != null) {
                                cls = f7864k;
                                activity = LeanplumActivityHelper.f7831b;
                                if (!(activity == null || LeanplumActivityHelper.f7830a)) {
                                    if (cls == null) {
                                        if (cls.isInstance(activity)) {
                                        }
                                    }
                                    if (z) {
                                        cls2 = f7864k;
                                        if (cls2 != null) {
                                            e = new Intent(context, cls2);
                                        } else {
                                            e = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                                        }
                                        if (e == null) {
                                            e.putExtras(preHandlePushNotification);
                                            e.addFlags(335544320);
                                            context.startActivity(e);
                                        } else {
                                            return;
                                        }
                                    }
                                    postHandlePushNotification(context, intent);
                                }
                                z = true;
                                if (z) {
                                    cls2 = f7864k;
                                    if (cls2 != null) {
                                        e = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                                    } else {
                                        e = new Intent(context, cls2);
                                    }
                                    if (e == null) {
                                        e.putExtras(preHandlePushNotification);
                                        e.addFlags(335544320);
                                        context.startActivity(e);
                                    } else {
                                        return;
                                    }
                                }
                                postHandlePushNotification(context, intent);
                            }
                        }
                    }
                }
            }
            obj = null;
            if (obj != null) {
                cls = f7864k;
                activity = LeanplumActivityHelper.f7831b;
                if (cls == null) {
                    if (cls.isInstance(activity)) {
                    }
                    z = true;
                }
                if (z) {
                    cls2 = f7864k;
                    if (cls2 != null) {
                        e = new Intent(context, cls2);
                    } else {
                        e = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                    }
                    if (e == null) {
                        e.putExtras(preHandlePushNotification);
                        e.addFlags(335544320);
                        context.startActivity(e);
                    } else {
                        return;
                    }
                }
                postHandlePushNotification(context, intent);
            }
        }
    }

    public static java.util.Map<java.lang.String, java.lang.Object> parseNotificationBundle(android.os.Bundle r4) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = "_lpx";	 Catch:{ Throwable -> 0x0029 }
        r0 = r4.getString(r0);	 Catch:{ Throwable -> 0x0029 }
        r1 = "lp_message";	 Catch:{ Throwable -> 0x0029 }
        r1 = r4.getString(r1);	 Catch:{ Throwable -> 0x0029 }
        r4 = m9422d(r4);	 Catch:{ Throwable -> 0x0029 }
        r2 = new java.util.HashMap;	 Catch:{ Throwable -> 0x0029 }
        r2.<init>();	 Catch:{ Throwable -> 0x0029 }
        r3 = "lp_action_param";	 Catch:{ Throwable -> 0x0029 }
        r0 = com.leanplum.p069a.ab.m9452a(r0);	 Catch:{ Throwable -> 0x0029 }
        r2.put(r3, r0);	 Catch:{ Throwable -> 0x0029 }
        r0 = "lp_message_param";	 Catch:{ Throwable -> 0x0029 }
        r2.put(r0, r1);	 Catch:{ Throwable -> 0x0029 }
        r0 = "lp_message_id";	 Catch:{ Throwable -> 0x0029 }
        r2.put(r0, r4);	 Catch:{ Throwable -> 0x0029 }
        return r2;
    L_0x0029:
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r0 = 0;
        r1 = "Failed to parse notification bundle.";
        r4[r0] = r1;
        com.leanplum.p069a.ao.m9518c(r4);
        r4 = 0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.LeanplumPushService.parseNotificationBundle(android.os.Bundle):java.util.Map<java.lang.String, java.lang.Object>");
    }

    public static Bundle preHandlePushNotification(Context context, Intent intent) {
        if (intent == null) {
            ao.m9518c(new Object[]{"Unable to pre handle push notification, Intent is null."});
            return null;
        }
        intent = intent.getExtras();
        if (intent != null) {
            return intent;
        }
        ao.m9518c(new Object[]{"Unable to pre handle push notification, extras are null."});
        return null;
    }

    public static void postHandlePushNotification(Context context, Intent intent) {
        context = intent.getExtras();
        if (context == null) {
            ao.m9518c(new Object[]{"Could not post handle push notification, extras are null."});
            return;
        }
        LeanplumActivityHelper.queueActionUponActive(new LeanplumPushService$3(context));
    }

    /* renamed from: c */
    private static boolean m9419c(Context context, Bundle bundle) {
        String string = bundle.getString("_lpx");
        if (string != null && string.contains(f7860g)) {
            Intent e = m9423e(bundle);
            if (e != null) {
                Boolean valueOf;
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(e, 0);
                if (!(queryIntentActivities == null || queryIntentActivities.isEmpty())) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        if (resolveInfo != null && resolveInfo.activityInfo != null && resolveInfo.activityInfo.name != null && resolveInfo.activityInfo.name.contains(context.getPackageName())) {
                            e.setPackage(resolveInfo.activityInfo.packageName);
                            valueOf = Boolean.valueOf(true);
                            break;
                        }
                    }
                }
                valueOf = Boolean.valueOf(false);
                if (valueOf.booleanValue()) {
                    bundle = m9422d(bundle);
                    if (bundle != null) {
                        new ActionContext("__Push Notification", null, bundle).track(f7862i, 0.0d, null);
                        context.startActivity(e);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private static android.content.Intent m9423e(android.os.Bundle r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = "_lpx";	 Catch:{ JSONException -> 0x0024 }
        r3 = r3.getString(r0);	 Catch:{ JSONException -> 0x0024 }
        if (r3 == 0) goto L_0x0024;	 Catch:{ JSONException -> 0x0024 }
    L_0x0008:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0024 }
        r0.<init>(r3);	 Catch:{ JSONException -> 0x0024 }
        r3 = new android.content.Intent;	 Catch:{ JSONException -> 0x0024 }
        r1 = "android.intent.action.VIEW";	 Catch:{ JSONException -> 0x0024 }
        r2 = "URL";	 Catch:{ JSONException -> 0x0024 }
        r0 = r0.getString(r2);	 Catch:{ JSONException -> 0x0024 }
        r0 = android.net.Uri.parse(r0);	 Catch:{ JSONException -> 0x0024 }
        r3.<init>(r1, r0);	 Catch:{ JSONException -> 0x0024 }
        r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;	 Catch:{ JSONException -> 0x0024 }
        r3.setFlags(r0);	 Catch:{ JSONException -> 0x0024 }
        return r3;
    L_0x0024:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.LeanplumPushService.e(android.os.Bundle):android.content.Intent");
    }

    /* renamed from: b */
    private static Boolean m9413b(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (!(queryIntentActivities == null || queryIntentActivities.isEmpty())) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo != null && resolveInfo.activityInfo != null && resolveInfo.activityInfo.name != null && resolveInfo.activityInfo.name.contains(context.getPackageName())) {
                    intent.setPackage(resolveInfo.activityInfo.packageName);
                    return Boolean.valueOf(true);
                }
            }
        }
        return Boolean.valueOf(false);
    }

    public static void unregister() {
        try {
            Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
            Context context = Leanplum.getContext();
            intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
            intent.setPackage("com.google.android.gms");
            context.startService(intent);
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    /* renamed from: e */
    private static void m9424e() {
        Context context = Leanplum.getContext();
        if (context == null) {
            ao.m9516a("Failed to register application with GCM/FCM. Your application context is not set.");
            return;
        }
        context.startService(new Intent(context, LeanplumPushRegistrationService.class));
    }

    public static void setGcmRegistrationId(String str) {
        LeanplumManualProvider leanplumManualProvider = new LeanplumManualProvider(Leanplum.getContext().getApplicationContext(), str);
    }

    /* renamed from: b */
    static void m9414b() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = 1;
        r1 = 0;
        r2 = com.leanplum.p069a.bo.m9633i();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r2 == 0) goto L_0x016e;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0008:
        r2 = f7866m;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r2 == 0) goto L_0x0089;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x000c:
        r2 = com.leanplum.Leanplum.getContext();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r2 != 0) goto L_0x001d;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0012:
        r2 = new java.lang.Object[r0];	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r3 = "Failed to enable FCM services, context is null.";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2[r1] = r3;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ao.m9518c(r2);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x001b:
        r2 = 0;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        goto L_0x0073;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x001d:
        r3 = r2.getPackageManager();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r3 != 0) goto L_0x002d;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0023:
        r2 = new java.lang.Object[r0];	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r3 = "Failed to enable FCM services, PackageManager is null.";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2[r1] = r3;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ao.m9518c(r2);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        goto L_0x001b;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x002d:
        r4 = f7866m;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r4 == 0) goto L_0x0072;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0031:
        r4 = "com.leanplum.LeanplumPushFcmListenerService";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r4 = com.leanplum.p069a.ak.a(r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r4 != 0) goto L_0x0043;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0039:
        r2 = new java.lang.Object[r0];	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r3 = "Failed to setup Firebase, please compile Firebase library.";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2[r1] = r3;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ao.m9516a(r2);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        goto L_0x001b;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0043:
        r5 = com.leanplum.p069a.ak.c(r2, r3, r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r5 != 0) goto L_0x0072;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0049:
        r5 = com.leanplum.Leanplum.getContext();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r5 == 0) goto L_0x0064;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x004f:
        r6 = r5.getPackageManager();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r6 == 0) goto L_0x0064;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0055:
        r7 = "com.leanplum.LeanplumPushInstanceIDService";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ak.a(r5, r6, r7);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r7 = "com.google.android.gms.gcm.GcmReceiver";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ak.a(r5, r6, r7);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r7 = "com.leanplum.LeanplumPushListenerService";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ak.a(r5, r6, r7);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0064:
        com.leanplum.p069a.ak.a(r2, r3, r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r4 = "com.leanplum.LeanplumPushFirebaseMessagingService";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r4 = com.leanplum.p069a.ak.a(r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r4 == 0) goto L_0x0072;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x006f:
        com.leanplum.p069a.ak.a(r2, r3, r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0072:
        r2 = 1;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0073:
        if (r2 != 0) goto L_0x0080;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0075:
        r2 = new java.lang.Object[r0];	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r3 = "Failed to initialize FCM services.";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2[r1] = r3;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ao.m9517b(r2);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        goto L_0x0177;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0080:
        r2 = new com.leanplum.d;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2.<init>();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        f7865l = r2;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        goto L_0x0106;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0089:
        r2 = com.leanplum.Leanplum.getContext();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r2 != 0) goto L_0x009a;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x008f:
        r2 = new java.lang.Object[r0];	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r3 = "Failed to enable FCM services, context is null.";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2[r1] = r3;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ao.m9518c(r2);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0098:
        r2 = 0;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        goto L_0x00f2;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x009a:
        r3 = r2.getPackageManager();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r3 != 0) goto L_0x00aa;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00a0:
        r2 = new java.lang.Object[r0];	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r3 = "Failed to enable FCM services, PackageManager is null.";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2[r1] = r3;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ao.m9518c(r2);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        goto L_0x0098;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00aa:
        r4 = "com.leanplum.LeanplumPushInstanceIDService";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r4 = com.leanplum.p069a.ak.a(r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r4 != 0) goto L_0x00bc;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00b2:
        r2 = new java.lang.Object[r0];	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r3 = "Failed to setup GCM, please compile GCM library.";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2[r1] = r3;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ao.m9516a(r2);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        goto L_0x0098;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00bc:
        r5 = com.leanplum.p069a.ak.c(r2, r3, r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r5 != 0) goto L_0x00f1;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00c2:
        r5 = com.leanplum.Leanplum.getContext();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r5 == 0) goto L_0x00d8;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00c8:
        r6 = r5.getPackageManager();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r6 == 0) goto L_0x00d8;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00ce:
        r7 = "com.leanplum.LeanplumPushFcmListenerService";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ak.a(r5, r6, r7);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r7 = "com.leanplum.LeanplumPushFirebaseMessagingService";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ak.a(r5, r6, r7);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00d8:
        com.leanplum.p069a.ak.b(r2, r3, r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r4 = "com.google.android.gms.gcm.GcmReceiver";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r4 = com.leanplum.p069a.ak.a(r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r4 == 0) goto L_0x00e6;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00e3:
        com.leanplum.p069a.ak.b(r2, r3, r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00e6:
        r4 = "com.leanplum.LeanplumPushListenerService";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r4 = com.leanplum.p069a.ak.a(r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r4 == 0) goto L_0x00f1;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00ee:
        com.leanplum.p069a.ak.b(r2, r3, r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00f1:
        r2 = 1;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00f2:
        if (r2 != 0) goto L_0x00ff;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00f4:
        r2 = new java.lang.Object[r0];	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r3 = "Failed to initialize GCM services.";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2[r1] = r3;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ao.m9517b(r2);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        goto L_0x0177;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x00ff:
        r2 = new com.leanplum.e;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2.<init>();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        f7865l = r2;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0106:
        r2 = f7865l;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2 = r2.isInitialized();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r2 == 0) goto L_0x0177;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x010e:
        r2 = f7865l;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2 = r2.isManifestSetup();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r2 != 0) goto L_0x0117;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0116:
        goto L_0x0177;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0117:
        r2 = com.leanplum.p069a.aw.m9560e();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r2 == 0) goto L_0x014b;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x011d:
        r3 = com.leanplum.Leanplum.getContext();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r3 == 0) goto L_0x014b;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0123:
        r4 = "__leanplum_push__";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r5 = "__app_id";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r4 = com.leanplum.utils.SharedPreferencesUtil.getString(r3, r4, r5);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r5 = r2.equals(r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r5 != 0) goto L_0x014b;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0131:
        r5 = new java.lang.Object[r0];	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r6 = "Saving the application id in the shared preferences.";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r5[r1] = r6;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ao.m9519d(r5);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r5 = "__leanplum_push__";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r6 = "__app_id";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.utils.SharedPreferencesUtil.setString(r3, r5, r6, r2);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2 = "";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2 = r2.equals(r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r2 != 0) goto L_0x014b;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0149:
        r2 = 1;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        goto L_0x014c;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x014b:
        r2 = 0;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x014c:
        if (r2 == 0) goto L_0x0153;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x014e:
        r2 = f7865l;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2.unregister();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0153:
        r2 = com.leanplum.Leanplum.getContext();	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        if (r2 != 0) goto L_0x0163;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0159:
        r2 = new java.lang.Object[r0];	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r3 = "Failed to register application with GCM/FCM. Your application context is not set.";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2[r1] = r3;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ao.m9516a(r2);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        goto L_0x0177;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0163:
        r3 = new android.content.Intent;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r4 = com.leanplum.LeanplumPushRegistrationService.class;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r3.<init>(r2, r4);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2.startService(r3);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        goto L_0x0178;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x016e:
        r2 = new java.lang.Object[r0];	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r3 = "No valid Google Play Services APK found.";	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        r2[r1] = r3;	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
        com.leanplum.p069a.ao.m9518c(r2);	 Catch:{ LeanplumException -> 0x0179, Throwable -> 0x0178 }
    L_0x0177:
        return;
    L_0x0178:
        return;
    L_0x0179:
        r2 = move-exception;
        r0 = new java.lang.Object[r0];
        r3 = new java.lang.StringBuilder;
        r4 = "There was an error registering for push notifications.\n";
        r3.<init>(r4);
        r2 = com.leanplum.p069a.ao.m9513a(r2);
        r3.append(r2);
        r2 = r3.toString();
        r0[r1] = r2;
        com.leanplum.p069a.ao.m9516a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.LeanplumPushService.b():void");
    }

    /* renamed from: g */
    private static boolean m9426g() {
        Context context = Leanplum.getContext();
        if (context == null) {
            ao.m9518c("Failed to enable FCM services, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            ao.m9518c("Failed to enable FCM services, PackageManager is null.");
            return false;
        }
        if (f7866m) {
            Class a = ak.a(f7854a);
            if (a == null) {
                ao.m9516a("Failed to setup Firebase, please compile Firebase library.");
                return false;
            } else if (!ak.c(context, packageManager, a)) {
                Context context2 = Leanplum.getContext();
                if (context2 != null) {
                    PackageManager packageManager2 = context2.getPackageManager();
                    if (packageManager2 != null) {
                        ak.a(context2, packageManager2, f7856c);
                        ak.a(context2, packageManager2, f7858e);
                        ak.a(context2, packageManager2, f7857d);
                    }
                }
                ak.a(context, packageManager, a);
                Class a2 = ak.a(f7855b);
                if (a2 != null) {
                    ak.a(context, packageManager, a2);
                }
            }
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m9427h() {
        Context context = Leanplum.getContext();
        if (context == null) {
            ao.m9518c("Failed to enable FCM services, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            ao.m9518c("Failed to enable FCM services, PackageManager is null.");
            return false;
        }
        Class a = ak.a(f7856c);
        if (a == null) {
            ao.m9516a("Failed to setup GCM, please compile GCM library.");
            return false;
        }
        if (!ak.c(context, packageManager, a)) {
            Context context2 = Leanplum.getContext();
            if (context2 != null) {
                PackageManager packageManager2 = context2.getPackageManager();
                if (packageManager2 != null) {
                    ak.a(context2, packageManager2, f7854a);
                    ak.a(context2, packageManager2, f7855b);
                }
            }
            ak.b(context, packageManager, a);
            Class a2 = ak.a(f7858e);
            if (a2 != null) {
                ak.b(context, packageManager, a2);
            }
            a2 = ak.a(f7857d);
            if (a2 != null) {
                ak.b(context, packageManager, a2);
            }
        }
        return true;
    }

    /* renamed from: i */
    private static void m9428i() {
        Context context = Leanplum.getContext();
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ak.a(context, packageManager, f7854a);
                ak.a(context, packageManager, f7855b);
            }
        }
    }

    /* renamed from: j */
    private static void m9429j() {
        Context context = Leanplum.getContext();
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ak.a(context, packageManager, f7856c);
                ak.a(context, packageManager, f7858e);
                ak.a(context, packageManager, f7857d);
            }
        }
    }

    /* renamed from: a */
    private static boolean m9412a(String str) {
        if (str == null) {
            return false;
        }
        Context context = Leanplum.getContext();
        if (context == null) {
            return false;
        }
        String string = SharedPreferencesUtil.getString(context, "__leanplum_push__", "__app_id");
        if (!str.equals(string)) {
            ao.m9519d("Saving the application id in the shared preferences.");
            SharedPreferencesUtil.setString(context, "__leanplum_push__", "__app_id", str);
            if ("".equals(string) == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static Intent m9406a(Context context) {
        Class cls = f7864k;
        if (cls != null) {
            return new Intent(context, cls);
        }
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    /* renamed from: f */
    private static void m9425f() {
        Context context;
        PackageManager packageManager;
        Class a;
        Context context2;
        PackageManager packageManager2;
        Object obj;
        if (f7866m) {
            context = Leanplum.getContext();
            if (context == null) {
                ao.m9518c("Failed to enable FCM services, context is null.");
            } else {
                packageManager = context.getPackageManager();
                if (packageManager == null) {
                    ao.m9518c("Failed to enable FCM services, PackageManager is null.");
                } else {
                    if (f7866m) {
                        a = ak.a(f7854a);
                        if (a == null) {
                            ao.m9516a("Failed to setup Firebase, please compile Firebase library.");
                        } else if (!ak.c(context, packageManager, a)) {
                            context2 = Leanplum.getContext();
                            if (context2 != null) {
                                packageManager2 = context2.getPackageManager();
                                if (packageManager2 != null) {
                                    ak.a(context2, packageManager2, f7856c);
                                    ak.a(context2, packageManager2, f7858e);
                                    ak.a(context2, packageManager2, f7857d);
                                }
                            }
                            ak.a(context, packageManager, a);
                            a = ak.a(f7855b);
                            if (a != null) {
                                ak.a(context, packageManager, a);
                            }
                        }
                    }
                    obj = 1;
                    if (obj != null) {
                        ao.m9517b("Failed to initialize FCM services.");
                        return;
                    }
                    f7865l = new C7044d();
                }
            }
            obj = null;
            if (obj != null) {
                f7865l = new C7044d();
            } else {
                ao.m9517b("Failed to initialize FCM services.");
                return;
            }
        }
        context = Leanplum.getContext();
        if (context == null) {
            ao.m9518c("Failed to enable FCM services, context is null.");
        } else {
            packageManager = context.getPackageManager();
            if (packageManager == null) {
                ao.m9518c("Failed to enable FCM services, PackageManager is null.");
            } else {
                a = ak.a(f7856c);
                if (a == null) {
                    ao.m9516a("Failed to setup GCM, please compile GCM library.");
                } else {
                    if (!ak.c(context, packageManager, a)) {
                        context2 = Leanplum.getContext();
                        if (context2 != null) {
                            packageManager2 = context2.getPackageManager();
                            if (packageManager2 != null) {
                                ak.a(context2, packageManager2, f7854a);
                                ak.a(context2, packageManager2, f7855b);
                            }
                        }
                        ak.b(context, packageManager, a);
                        a = ak.a(f7858e);
                        if (a != null) {
                            ak.b(context, packageManager, a);
                        }
                        a = ak.a(f7857d);
                        if (a != null) {
                            ak.b(context, packageManager, a);
                        }
                    }
                    obj = 1;
                    if (obj != null) {
                        ao.m9517b("Failed to initialize GCM services.");
                        return;
                    }
                    f7865l = new C7045e();
                }
            }
        }
        obj = null;
        if (obj != null) {
            f7865l = new C7045e();
        } else {
            ao.m9517b("Failed to initialize GCM services.");
            return;
        }
        if (f7865l.isInitialized()) {
            if (f7865l.isManifestSetup()) {
                String e = aw.m9560e();
                if (e != null) {
                    Context context3 = Leanplum.getContext();
                    if (context3 != null) {
                        String string = SharedPreferencesUtil.getString(context3, "__leanplum_push__", "__app_id");
                        if (!e.equals(string)) {
                            ao.m9519d("Saving the application id in the shared preferences.");
                            SharedPreferencesUtil.setString(context3, "__leanplum_push__", "__app_id", e);
                            if (!"".equals(string)) {
                                obj = 1;
                                if (obj != null) {
                                    f7865l.unregister();
                                }
                                context = Leanplum.getContext();
                                if (context != null) {
                                    ao.m9516a("Failed to register application with GCM/FCM. Your application context is not set.");
                                }
                                context.startService(new Intent(context, LeanplumPushRegistrationService.class));
                                return;
                            }
                        }
                    }
                }
                obj = null;
                if (obj != null) {
                    f7865l.unregister();
                }
                context = Leanplum.getContext();
                if (context != null) {
                    context.startService(new Intent(context, LeanplumPushRegistrationService.class));
                    return;
                }
                ao.m9516a("Failed to register application with GCM/FCM. Your application context is not set.");
            }
        }
    }
}
