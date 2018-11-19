package com.leanplum;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.leanplum.p069a.ab;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.bo;
import com.leanplum.utils.BuildUtil;
import com.leanplum.utils.SharedPreferencesUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

@TargetApi(26)
/* renamed from: com.leanplum.f */
final class C5732f {
    C5732f() {
    }

    /* renamed from: a */
    static void m25196a(Context context, JSONArray jSONArray) {
        if (context != null) {
            if (jSONArray != null) {
                try {
                    List<HashMap> b = C5732f.m25198b(context);
                    JSONArray<Map> a = ab.a(jSONArray);
                    if (!(b == null || a == null)) {
                        b.removeAll(a);
                        for (HashMap hashMap : b) {
                            if (hashMap != null) {
                                String str = (String) hashMap.get("id");
                                if (context != null && BuildUtil.isNotificationChannelSupported(context)) {
                                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                                    if (notificationManager == null) {
                                        ao.a(new Object[]{"Notification manager is null"});
                                    } else {
                                        notificationManager.deleteNotificationChannel(str);
                                    }
                                }
                            }
                        }
                    }
                    if (context != null) {
                        if (a != null) {
                            Editor edit = context.getSharedPreferences("__leanplum__", 0).edit();
                            edit.putString("__leanplum_notification_channels", new JSONArray(a).toString());
                            SharedPreferencesUtil.commitChanges(edit);
                        }
                    }
                    if (a != null) {
                        for (Map map : a) {
                            if (map != null) {
                                C5732f.m25191a(context, map);
                            }
                        }
                    }
                } catch (Context context2) {
                    bo.a(context2);
                }
            }
        }
    }

    /* renamed from: a */
    static void m25192a(Context context, String str) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (context != null) {
                        if (str != null) {
                            context = context.getSharedPreferences("__leanplum__", 0).edit();
                            context.putString("__leanplum_default_notification_channels", str);
                            SharedPreferencesUtil.commitChanges(context);
                        }
                    }
                }
            } catch (Context context2) {
                bo.a(context2);
            }
        }
    }

    /* renamed from: b */
    static void m25201b(Context context, JSONArray jSONArray) {
        if (context != null) {
            if (jSONArray != null) {
                try {
                    List<HashMap> d = C5732f.m25204d(context);
                    JSONArray<Map> a = ab.a(jSONArray);
                    if (!(d == null || a == null)) {
                        d.removeAll(a);
                        for (HashMap hashMap : d) {
                            if (hashMap != null) {
                                String str = (String) hashMap.get("id");
                                if (context == null) {
                                    continue;
                                } else if (!TextUtils.isEmpty(str)) {
                                    if (BuildUtil.isNotificationChannelSupported(context)) {
                                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                                        if (notificationManager == null) {
                                            ao.a(new Object[]{"Notification manager is null"});
                                        } else {
                                            notificationManager.deleteNotificationChannelGroup(str);
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                    if (context != null) {
                        if (a != null) {
                            Editor edit = context.getSharedPreferences("__leanplum__", 0).edit();
                            edit.putString("__leanplum_notification_groups", new JSONArray(a).toString());
                            SharedPreferencesUtil.commitChanges(edit);
                        }
                    }
                    if (a != null) {
                        for (Map map : a) {
                            if (map != null) {
                                C5732f.m25197b(context, map);
                            }
                        }
                    }
                } catch (Context context2) {
                    bo.a(context2);
                }
            }
        }
    }

    /* renamed from: b */
    private static java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> m25198b(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        r2 = "__leanplum__";	 Catch:{ Exception -> 0x001e }
        r3 = r3.getSharedPreferences(r2, r1);	 Catch:{ Exception -> 0x001e }
        r2 = "__leanplum_notification_channels";	 Catch:{ Exception -> 0x001e }
        r3 = r3.getString(r2, r0);	 Catch:{ Exception -> 0x001e }
        if (r3 != 0) goto L_0x0014;	 Catch:{ Exception -> 0x001e }
    L_0x0013:
        return r0;	 Catch:{ Exception -> 0x001e }
    L_0x0014:
        r2 = new org.json.JSONArray;	 Catch:{ Exception -> 0x001e }
        r2.<init>(r3);	 Catch:{ Exception -> 0x001e }
        r3 = com.leanplum.p069a.ab.a(r2);	 Catch:{ Exception -> 0x001e }
        return r3;
    L_0x001e:
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r2 = "Failed to convert notification channels json.";
        r3[r1] = r2;
        com.leanplum.p069a.ao.a(r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.f.b(android.content.Context):java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>>");
    }

    /* renamed from: c */
    private static java.lang.String m25202c(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        r2 = "__leanplum__";	 Catch:{ Exception -> 0x0012 }
        r3 = r3.getSharedPreferences(r2, r1);	 Catch:{ Exception -> 0x0012 }
        r2 = "__leanplum_default_notification_channels";	 Catch:{ Exception -> 0x0012 }
        r3 = r3.getString(r2, r0);	 Catch:{ Exception -> 0x0012 }
        return r3;
    L_0x0012:
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r2 = "Failed to convert default notification channels json.";
        r3[r1] = r2;
        com.leanplum.p069a.ao.a(r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.f.c(android.content.Context):java.lang.String");
    }

    /* renamed from: d */
    private static java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> m25204d(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        r2 = "__leanplum__";	 Catch:{ Exception -> 0x001e }
        r3 = r3.getSharedPreferences(r2, r1);	 Catch:{ Exception -> 0x001e }
        r2 = "__leanplum_notification_groups";	 Catch:{ Exception -> 0x001e }
        r3 = r3.getString(r2, r0);	 Catch:{ Exception -> 0x001e }
        if (r3 != 0) goto L_0x0014;	 Catch:{ Exception -> 0x001e }
    L_0x0013:
        return r0;	 Catch:{ Exception -> 0x001e }
    L_0x0014:
        r2 = new org.json.JSONArray;	 Catch:{ Exception -> 0x001e }
        r2.<init>(r3);	 Catch:{ Exception -> 0x001e }
        r3 = com.leanplum.p069a.ab.a(r2);	 Catch:{ Exception -> 0x001e }
        return r3;
    L_0x001e:
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r2 = "Failed to convert notification channels json.";
        r3[r1] = r2;
        com.leanplum.p069a.ao.a(r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.f.d(android.content.Context):java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>>");
    }

    /* renamed from: a */
    private static void m25195a(Context context, List<HashMap<String, Object>> list) {
        if (context != null) {
            if (list != null) {
                context = context.getSharedPreferences("__leanplum__", 0).edit();
                context.putString("__leanplum_notification_channels", new JSONArray(list).toString());
                SharedPreferencesUtil.commitChanges(context);
            }
        }
    }

    /* renamed from: b */
    private static void m25199b(Context context, String str) {
        if (context != null) {
            if (str != null) {
                context = context.getSharedPreferences("__leanplum__", 0).edit();
                context.putString("__leanplum_default_notification_channels", str);
                SharedPreferencesUtil.commitChanges(context);
            }
        }
    }

    /* renamed from: b */
    private static void m25200b(Context context, List<HashMap<String, Object>> list) {
        if (context != null) {
            if (list != null) {
                context = context.getSharedPreferences("__leanplum__", 0).edit();
                context.putString("__leanplum_notification_groups", new JSONArray(list).toString());
                SharedPreferencesUtil.commitChanges(context);
            }
        }
    }

    /* renamed from: a */
    static java.lang.String m25191a(android.content.Context r18, java.util.Map<java.lang.String, java.lang.Object> r19) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = r18;
        r2 = r19;
        if (r1 == 0) goto L_0x009c;
    L_0x0006:
        if (r2 != 0) goto L_0x000a;
    L_0x0008:
        goto L_0x009c;
    L_0x000a:
        r6 = new com.leanplum.g;	 Catch:{ Exception -> 0x008f }
        r6.<init>(r2);	 Catch:{ Exception -> 0x008f }
        r2 = r6.f21328a;	 Catch:{ Exception -> 0x008f }
        r7 = r6.f21329b;	 Catch:{ Exception -> 0x008f }
        r8 = r6.f21332e;	 Catch:{ Exception -> 0x008f }
        r9 = r6.f21330c;	 Catch:{ Exception -> 0x008f }
        r10 = r6.f21331d;	 Catch:{ Exception -> 0x008f }
        r11 = r6.f21333f;	 Catch:{ Exception -> 0x008f }
        r12 = r6.f21334g;	 Catch:{ Exception -> 0x008f }
        r13 = r6.f21335h;	 Catch:{ Exception -> 0x008f }
        r14 = r6.f21336i;	 Catch:{ Exception -> 0x008f }
        r15 = r6.f21337j;	 Catch:{ Exception -> 0x008f }
        r3 = r6.f21338k;	 Catch:{ Exception -> 0x008f }
        r4 = r6.f21339l;	 Catch:{ Exception -> 0x008f }
        if (r1 == 0) goto L_0x008c;	 Catch:{ Exception -> 0x008f }
    L_0x0029:
        r16 = android.text.TextUtils.isEmpty(r2);	 Catch:{ Exception -> 0x008f }
        if (r16 == 0) goto L_0x0030;	 Catch:{ Exception -> 0x008f }
    L_0x002f:
        goto L_0x008c;	 Catch:{ Exception -> 0x008f }
    L_0x0030:
        r16 = com.leanplum.utils.BuildUtil.isNotificationChannelSupported(r18);	 Catch:{ Exception -> 0x008f }
        if (r16 == 0) goto L_0x008c;
    L_0x0036:
        r5 = android.app.NotificationManager.class;	 Catch:{ Throwable -> 0x0087 }
        r1 = r1.getSystemService(r5);	 Catch:{ Throwable -> 0x0087 }
        r1 = (android.app.NotificationManager) r1;	 Catch:{ Throwable -> 0x0087 }
        if (r1 != 0) goto L_0x004c;	 Catch:{ Throwable -> 0x0087 }
    L_0x0040:
        r5 = 1;	 Catch:{ Throwable -> 0x0087 }
        r1 = new java.lang.Object[r5];	 Catch:{ Throwable -> 0x0087 }
        r2 = "Notification manager is null";	 Catch:{ Throwable -> 0x0087 }
        r3 = 0;	 Catch:{ Throwable -> 0x0087 }
        r1[r3] = r2;	 Catch:{ Throwable -> 0x0087 }
        com.leanplum.p069a.ao.a(r1);	 Catch:{ Throwable -> 0x0087 }
        goto L_0x008c;	 Catch:{ Throwable -> 0x0087 }
    L_0x004c:
        r5 = new android.app.NotificationChannel;	 Catch:{ Throwable -> 0x0087 }
        r5.<init>(r2, r7, r8);	 Catch:{ Throwable -> 0x0087 }
        r2 = android.text.TextUtils.isEmpty(r9);	 Catch:{ Throwable -> 0x0087 }
        if (r2 != 0) goto L_0x005a;	 Catch:{ Throwable -> 0x0087 }
    L_0x0057:
        r5.setDescription(r9);	 Catch:{ Throwable -> 0x0087 }
    L_0x005a:
        if (r11 == 0) goto L_0x0063;	 Catch:{ Throwable -> 0x0087 }
    L_0x005c:
        r2 = 1;	 Catch:{ Throwable -> 0x0087 }
        r5.enableLights(r2);	 Catch:{ Throwable -> 0x0087 }
        r5.setLightColor(r12);	 Catch:{ Throwable -> 0x0087 }
    L_0x0063:
        if (r13 == 0) goto L_0x0071;	 Catch:{ Throwable -> 0x0087 }
    L_0x0065:
        r2 = 1;	 Catch:{ Throwable -> 0x0087 }
        r5.enableVibration(r2);	 Catch:{ Throwable -> 0x0087 }
        if (r14 == 0) goto L_0x0071;	 Catch:{ Throwable -> 0x0087 }
    L_0x006b:
        r2 = r14.length;	 Catch:{ Throwable -> 0x0087 }
        if (r2 == 0) goto L_0x0071;	 Catch:{ Throwable -> 0x0087 }
    L_0x006e:
        r5.setVibrationPattern(r14);	 Catch:{ Throwable -> 0x0087 }
    L_0x0071:
        r2 = android.text.TextUtils.isEmpty(r10);	 Catch:{ Throwable -> 0x0087 }
        if (r2 != 0) goto L_0x007a;	 Catch:{ Throwable -> 0x0087 }
    L_0x0077:
        r5.setGroup(r10);	 Catch:{ Throwable -> 0x0087 }
    L_0x007a:
        r5.setLockscreenVisibility(r15);	 Catch:{ Throwable -> 0x0087 }
        r5.setBypassDnd(r3);	 Catch:{ Throwable -> 0x0087 }
        r5.setShowBadge(r4);	 Catch:{ Throwable -> 0x0087 }
        r1.createNotificationChannel(r5);	 Catch:{ Throwable -> 0x0087 }
        goto L_0x008c;
    L_0x0087:
        r0 = move-exception;
        r1 = r0;
        com.leanplum.p069a.bo.a(r1);	 Catch:{ Exception -> 0x008f }
    L_0x008c:
        r1 = r6.f21328a;	 Catch:{ Exception -> 0x008f }
        return r1;
    L_0x008f:
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = "Failed to create notification channel.";
        r3 = 0;
        r1[r3] = r2;
        com.leanplum.p069a.ao.a(r1);
        r1 = 0;
        return r1;
    L_0x009c:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.f.a(android.content.Context, java.util.Map):java.lang.String");
    }

    /* renamed from: a */
    private static void m25194a(Context context, String str, String str2, int i, String str3, String str4, boolean z, int i2, boolean z2, long[] jArr, int i3, boolean z3, boolean z4) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (BuildUtil.isNotificationChannelSupported(context)) {
                    try {
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (notificationManager == null) {
                            ao.a(new Object[]{"Notification manager is null"});
                            return;
                        }
                        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
                        if (TextUtils.isEmpty(str3) == null) {
                            notificationChannel.setDescription(str3);
                        }
                        if (z) {
                            notificationChannel.enableLights(true);
                            notificationChannel.setLightColor(i2);
                        }
                        if (z2) {
                            notificationChannel.enableVibration(true);
                            if (!(jArr == null || jArr.length == null)) {
                                notificationChannel.setVibrationPattern(jArr);
                            }
                        }
                        if (TextUtils.isEmpty(str4) == null) {
                            notificationChannel.setGroup(str4);
                        }
                        notificationChannel.setLockscreenVisibility(i3);
                        notificationChannel.setBypassDnd(z3);
                        notificationChannel.setShowBadge(z4);
                        notificationManager.createNotificationChannel(notificationChannel);
                    } catch (Context context2) {
                        bo.a(context2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private static void m25203c(Context context, String str) {
        if (context != null && BuildUtil.isNotificationChannelSupported(context)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager == null) {
                    ao.a(new Object[]{"Notification manager is null"});
                    return;
                }
                notificationManager.deleteNotificationChannel(str);
            } catch (Context context2) {
                bo.a(context2);
            }
        }
    }

    /* renamed from: b */
    private static String m25197b(Context context, Map<String, Object> map) {
        if (context != null) {
            if (map != null) {
                C5734h c5734h = new C5734h(map);
                map = c5734h.f21340a;
                CharSequence charSequence = c5734h.f21341b;
                if (context != null) {
                    if (!TextUtils.isEmpty(map)) {
                        if (BuildUtil.isNotificationChannelSupported(context)) {
                            try {
                                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                                if (notificationManager == null) {
                                    ao.a(new Object[]{"Notification manager is null"});
                                } else {
                                    notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(map, charSequence));
                                }
                            } catch (Context context2) {
                                bo.a(context2);
                            }
                        }
                    }
                }
                return c5734h.f21340a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m25193a(Context context, String str, String str2) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (BuildUtil.isNotificationChannelSupported(context)) {
                    try {
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager == null) {
                            ao.a(new Object[]{"Notification manager is null"});
                            return;
                        }
                        notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(str, str2));
                    } catch (Context context2) {
                        bo.a(context2);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private static void m25205d(Context context, String str) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (BuildUtil.isNotificationChannelSupported(context)) {
                    try {
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager == null) {
                            ao.a(new Object[]{"Notification manager is null"});
                            return;
                        }
                        notificationManager.deleteNotificationChannelGroup(str);
                    } catch (Context context2) {
                        bo.a(context2);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private static List<NotificationChannel> m25206e(Context context) {
        if (!BuildUtil.isNotificationChannelSupported(context)) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            return notificationManager.getNotificationChannels();
        }
        ao.a(new Object[]{"Notification manager is null"});
        return null;
    }

    /* renamed from: a */
    static String m25190a(Context context) {
        return BuildUtil.isNotificationChannelSupported(context) ? C5732f.m25202c(context) : null;
    }

    /* renamed from: f */
    private static List<NotificationChannelGroup> m25207f(Context context) {
        if (!BuildUtil.isNotificationChannelSupported(context)) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            return notificationManager.getNotificationChannelGroups();
        }
        ao.a(new Object[]{"Cannot get Notification Channel Groups, notificationManager is null."});
        return null;
    }
}
