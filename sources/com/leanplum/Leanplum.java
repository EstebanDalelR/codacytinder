package com.leanplum;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification.Builder;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat.C0382c;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.leanplum.ActionContext.ContextualValues;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.RegisterDeviceCallback;
import com.leanplum.callbacks.RegisterDeviceFinishedCallback;
import com.leanplum.callbacks.StartCallback;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.messagetemplates.MessageTemplates;
import com.leanplum.p069a.C2590h;
import com.leanplum.p069a.C2594s;
import com.leanplum.p069a.ab;
import com.leanplum.p069a.ae;
import com.leanplum.p069a.ag;
import com.leanplum.p069a.aj;
import com.leanplum.p069a.an;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.aq;
import com.leanplum.p069a.aw;
import com.leanplum.p069a.ax;
import com.leanplum.p069a.ay;
import com.leanplum.p069a.az;
import com.leanplum.p069a.bo;
import com.leanplum.p069a.bq;
import com.leanplum.utils.BuildUtil;
import com.leanplum.utils.SharedPreferencesUtil;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class Leanplum {
    public static final int ACTION_KIND_ACTION = 2;
    public static final int ACTION_KIND_MESSAGE = 1;
    public static final String PURCHASE_EVENT_NAME = "Purchase";
    /* renamed from: a */
    private static final ArrayList<StartCallback> f7815a = new ArrayList();
    /* renamed from: b */
    private static final ArrayList<VariablesChangedCallback> f7816b = new ArrayList();
    /* renamed from: c */
    private static final ArrayList<VariablesChangedCallback> f7817c = new ArrayList();
    /* renamed from: d */
    private static final ArrayList<VariablesChangedCallback> f7818d = new ArrayList();
    /* renamed from: e */
    private static final Object f7819e = new Object();
    /* renamed from: f */
    private static RegisterDeviceCallback f7820f = null;
    /* renamed from: g */
    private static RegisterDeviceFinishedCallback f7821g = null;
    /* renamed from: h */
    private static LeanplumDeviceIdMode f7822h = LeanplumDeviceIdMode.MD5_MAC_ADDRESS;
    /* renamed from: i */
    private static String f7823i = null;
    /* renamed from: j */
    private static boolean f7824j = false;
    /* renamed from: k */
    private static boolean f7825k = false;
    /* renamed from: l */
    private static boolean f7826l = true;
    /* renamed from: m */
    private static ScheduledExecutorService f7827m;
    /* renamed from: n */
    private static Context f7828n;
    /* renamed from: o */
    private static Runnable f7829o;

    /* renamed from: com.leanplum.Leanplum$11 */
    final class AnonymousClass11 extends AsyncTask<Void, Void, Void> {
        /* renamed from: a */
        private /* synthetic */ String f7804a;
        /* renamed from: b */
        private /* synthetic */ Map f7805b;
        /* renamed from: c */
        private /* synthetic */ boolean f7806c;

        AnonymousClass11(String str, Map map, boolean z) {
            this.f7804a = str;
            this.f7805b = map;
            this.f7806c = z;
        }

        protected final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m9342a();
        }

        /* renamed from: a */
        private Void m9342a() {
            try {
                Leanplum.m9350a(this.f7804a, this.f7805b, this.f7806c);
            } catch (Throwable th) {
                bo.m9608a(th);
            }
            return null;
        }
    }

    /* renamed from: com.leanplum.Leanplum$13 */
    final class AnonymousClass13 extends AsyncTask<Void, Void, Void> {
        /* renamed from: a */
        private /* synthetic */ JSONObject f7807a;

        AnonymousClass13(JSONObject jSONObject) {
            this.f7807a = jSONObject;
        }

        protected final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m9343a();
        }

        /* renamed from: a */
        private Void m9343a() {
            if (aw.m9550b(this.f7807a)) {
                try {
                    ag.m9483a(true);
                    ag.m9488b(true);
                    if (this.f7807a.optJSONObject("vars") == null) {
                        ao.m9516a("No variable values were received from the server. Please contact us to investigate.");
                    }
                    if (this.f7807a.optJSONObject(ManagerWebServices.PARAM_MESSAGES) == null) {
                        ao.m9521f("No messages received from the server.");
                    }
                    if (this.f7807a.optJSONObject("regions") == null) {
                        ao.m9521f("No regions received from the server.");
                    }
                    if (this.f7807a.optJSONArray("variants") == null) {
                        ao.m9521f("No variants received from the server.");
                    }
                    if (BuildUtil.isNotificationChannelSupported(Leanplum.f7828n)) {
                        JSONArray optJSONArray = this.f7807a.optJSONArray("notificationChannels");
                        JSONArray optJSONArray2 = this.f7807a.optJSONArray("notificationChannelGroups");
                        String optString = this.f7807a.optString("defaultNotificationChannel");
                        C38498.m14543b(Leanplum.f7828n, optJSONArray2);
                        C38498.m14538a(Leanplum.f7828n, optJSONArray);
                        C38498.m14534a(Leanplum.f7828n, optString);
                    }
                    aw.m9554c(this.f7807a.optString(ManagerWebServices.PARAM_TOKEN, null));
                    aw.m9558d();
                    Leanplum.m9354a(this.f7807a, true);
                    bq.m9674r();
                    Leanplum.m9363b(true);
                    if (this.f7807a.optBoolean("syncNewsfeed", false)) {
                        LeanplumInbox.m9394a().m9405d();
                    }
                    if (this.f7807a.optBoolean("loggingEnabled", false)) {
                        C2590h.f8068m = true;
                    }
                    if (C2590h.f8067l) {
                        Context e;
                        if (LeanplumActivityHelper.f7831b == Leanplum.f7828n || LeanplumActivityHelper.f7831b == null) {
                            e = Leanplum.f7828n;
                        } else {
                            e = LeanplumActivityHelper.f7831b;
                        }
                        if (!(this.f7807a.optBoolean("isRegistered") || null == null)) {
                            null.setResponseHandler(new Leanplum$13$1(this));
                            aq.m9522a().m9523a(null);
                        }
                        if (this.f7807a.optBoolean("isRegisteredFromOtherApp")) {
                            aq.m9522a().m9523a(new Leanplum$13$2(this, e));
                        }
                        boolean optBoolean = this.f7807a.optBoolean("isRegistered");
                        String optString2 = this.f7807a.optString("latestVersion", null);
                        if (optBoolean && optString2 != null) {
                            Object[] objArr = new Object[1];
                            StringBuilder stringBuilder = new StringBuilder("An update to Leanplum Android SDK, ");
                            stringBuilder.append(optString2);
                            stringBuilder.append(", is available. Go to leanplum.com to download it.");
                            objArr[0] = stringBuilder.toString();
                            ao.m9518c(objArr);
                        }
                        JSONObject optJSONObject = this.f7807a.optJSONObject("varsFromCode");
                        if (optJSONObject == null) {
                            optJSONObject = new JSONObject();
                        }
                        JSONObject optJSONObject2 = this.f7807a.optJSONObject("actionDefinitions");
                        if (optJSONObject2 == null) {
                            optJSONObject2 = new JSONObject();
                        }
                        JSONObject optJSONObject3 = this.f7807a.optJSONObject("fileAttributes");
                        if (optJSONObject3 == null) {
                            optJSONObject3 = new JSONObject();
                        }
                        bq.m9648a(ab.m9453a(optJSONObject), ab.m9453a(optJSONObject3), ab.m9453a(optJSONObject2));
                        if (optBoolean) {
                            ag.m9473a();
                        }
                    }
                    ag.m9489c();
                    Leanplum.m9377p();
                } catch (Throwable th) {
                    bo.m9608a(th);
                }
            } else {
                try {
                    ag.m9483a(true);
                    ag.m9488b(false);
                    bq.m9663g();
                    Leanplum.m9363b(false);
                } catch (Throwable th2) {
                    bo.m9608a(th2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.leanplum.Leanplum$2 */
    final class C25662 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ String f7808a;
        /* renamed from: b */
        private /* synthetic */ HashMap f7809b;

        C25662(String str, HashMap hashMap) {
            this.f7808a = str;
            this.f7809b = hashMap;
        }

        public final void run() {
            try {
                Leanplum.m9357b(this.f7808a, this.f7809b);
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: com.leanplum.Leanplum$3 */
    final class C25673 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ String f7810a;

        C25673(String str) {
            this.f7810a = str;
        }

        public final void run() {
            if (!C2590h.m9712a()) {
                try {
                    Map hashMap = new HashMap();
                    hashMap.put("gcmRegistrationId", this.f7810a);
                    aw.m9544b("setDeviceAttributes", hashMap).m9579h();
                } catch (Throwable th) {
                    bo.m9608a(th);
                }
            }
        }
    }

    /* renamed from: com.leanplum.Leanplum$4 */
    final class C25684 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ HashMap f7811a;

        C25684(HashMap hashMap) {
            this.f7811a = hashMap;
        }

        public final void run() {
            try {
                Leanplum.m9360b(this.f7811a);
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: com.leanplum.Leanplum$5 */
    final class C25695 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ String f7812a;
        /* renamed from: b */
        private /* synthetic */ Map f7813b;
        /* renamed from: c */
        private /* synthetic */ Map f7814c;

        C25695(String str, Map map, Map map2) {
            this.f7812a = str;
            this.f7813b = map;
            this.f7814c = map2;
        }

        public final void run() {
            try {
                Leanplum.m9358b(this.f7812a, this.f7813b, this.f7814c);
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: com.leanplum.Leanplum$6 */
    final class C25706 implements Runnable {
        C25706() {
        }

        public final void run() {
            try {
                Leanplum.m9383v();
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: com.leanplum.Leanplum$7 */
    final class C25717 implements Runnable {
        C25717() {
        }

        public final void run() {
            try {
                Leanplum.m9384w();
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: com.leanplum.Leanplum$1 */
    final class C38481 implements CacheUpdateBlock {
        C38481() {
        }

        public final void updateCache() {
            Leanplum.m9382u();
            if (aw.m9563l() == 0) {
                Leanplum.m9364c();
            }
        }
    }

    @TargetApi(26)
    /* renamed from: com.leanplum.Leanplum$8 */
    class C38498 implements ay {
        /* renamed from: a */
        private /* synthetic */ VariablesChangedCallback f12094a;

        C38498(VariablesChangedCallback variablesChangedCallback) {
            this.f12094a = variablesChangedCallback;
        }

        /* renamed from: a */
        public final void mo2612a(Exception exception) {
            if (this.f12094a != null) {
                aq.m9522a().m9523a(this.f12094a);
            }
            LeanplumInbox.m9394a().m9403a(false);
        }

        C38498() {
        }

        /* renamed from: a */
        static void m14538a(Context context, JSONArray jSONArray) {
            if (context != null) {
                if (jSONArray != null) {
                    try {
                        List<HashMap> b = C38498.m14540b(context);
                        JSONArray<Map> a = ab.m9451a(jSONArray);
                        if (!(b == null || a == null)) {
                            b.removeAll(a);
                            for (HashMap hashMap : b) {
                                if (hashMap != null) {
                                    String str = (String) hashMap.get("id");
                                    if (context != null && BuildUtil.isNotificationChannelSupported(context)) {
                                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                                        if (notificationManager == null) {
                                            ao.m9516a("Notification manager is null");
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
                                    C38498.m14533a(context, map);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        bo.m9608a(th);
                    }
                }
            }
        }

        /* renamed from: a */
        static void m14534a(Context context, String str) {
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
                } catch (Throwable th) {
                    bo.m9608a(th);
                }
            }
        }

        /* renamed from: b */
        static void m14543b(Context context, JSONArray jSONArray) {
            if (context != null) {
                if (jSONArray != null) {
                    try {
                        List<HashMap> d = C38498.m14546d(context);
                        JSONArray<HashMap> a = ab.m9451a(jSONArray);
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
                                                ao.m9516a("Notification manager is null");
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
                            for (HashMap hashMap2 : a) {
                                if (!(hashMap2 == null || context == null)) {
                                    if (hashMap2 != null) {
                                        C5734h c5734h = new C5734h(hashMap2);
                                        C38498.m14535a(context, c5734h.f21340a, c5734h.f21341b);
                                        String str2 = c5734h.f21340a;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        bo.m9608a(th);
                    }
                }
            }
        }

        /* renamed from: b */
        private static java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> m14540b(android.content.Context r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
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
            r3 = com.leanplum.p069a.ab.m9451a(r2);	 Catch:{ Exception -> 0x001e }
            return r3;
        L_0x001e:
            r3 = 1;
            r3 = new java.lang.Object[r3];
            r2 = "Failed to convert notification channels json.";
            r3[r1] = r2;
            com.leanplum.p069a.ao.m9516a(r3);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.leanplum.Leanplum.8.b(android.content.Context):java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>>");
        }

        /* renamed from: c */
        private static java.lang.String m14544c(android.content.Context r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
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
            com.leanplum.p069a.ao.m9516a(r3);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.leanplum.Leanplum.8.c(android.content.Context):java.lang.String");
        }

        /* renamed from: d */
        private static java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> m14546d(android.content.Context r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
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
            r3 = com.leanplum.p069a.ab.m9451a(r2);	 Catch:{ Exception -> 0x001e }
            return r3;
        L_0x001e:
            r3 = 1;
            r3 = new java.lang.Object[r3];
            r2 = "Failed to convert notification channels json.";
            r3[r1] = r2;
            com.leanplum.p069a.ao.m9516a(r3);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.leanplum.Leanplum.8.d(android.content.Context):java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>>");
        }

        /* renamed from: a */
        private static void m14537a(Context context, List<HashMap<String, Object>> list) {
            if (context != null) {
                if (list != null) {
                    context = context.getSharedPreferences("__leanplum__", 0).edit();
                    context.putString("__leanplum_notification_channels", new JSONArray(list).toString());
                    SharedPreferencesUtil.commitChanges(context);
                }
            }
        }

        /* renamed from: b */
        private static void m14541b(Context context, String str) {
            if (context != null) {
                if (str != null) {
                    context = context.getSharedPreferences("__leanplum__", 0).edit();
                    context.putString("__leanplum_default_notification_channels", str);
                    SharedPreferencesUtil.commitChanges(context);
                }
            }
        }

        /* renamed from: b */
        private static void m14542b(Context context, List<HashMap<String, Object>> list) {
            if (context != null) {
                if (list != null) {
                    context = context.getSharedPreferences("__leanplum__", 0).edit();
                    context.putString("__leanplum_notification_groups", new JSONArray(list).toString());
                    SharedPreferencesUtil.commitChanges(context);
                }
            }
        }

        /* renamed from: a */
        static java.lang.String m14533a(android.content.Context r18, java.util.Map<java.lang.String, java.lang.Object> r19) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
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
            com.leanplum.p069a.ao.m9516a(r1);	 Catch:{ Throwable -> 0x0087 }
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
            com.leanplum.p069a.bo.m9608a(r1);	 Catch:{ Exception -> 0x008f }
        L_0x008c:
            r1 = r6.f21328a;	 Catch:{ Exception -> 0x008f }
            return r1;
        L_0x008f:
            r1 = 1;
            r1 = new java.lang.Object[r1];
            r2 = "Failed to create notification channel.";
            r3 = 0;
            r1[r3] = r2;
            com.leanplum.p069a.ao.m9516a(r1);
            r1 = 0;
            return r1;
        L_0x009c:
            r1 = 0;
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.leanplum.Leanplum.8.a(android.content.Context, java.util.Map):java.lang.String");
        }

        /* renamed from: a */
        private static void m14536a(Context context, String str, String str2, int i, String str3, String str4, boolean z, int i2, boolean z2, long[] jArr, int i3, boolean z3, boolean z4) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    if (BuildUtil.isNotificationChannelSupported(context)) {
                        try {
                            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                            if (notificationManager == null) {
                                ao.m9516a("Notification manager is null");
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
                        } catch (Throwable th) {
                            bo.m9608a(th);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        private static void m14545c(Context context, String str) {
            if (context != null && BuildUtil.isNotificationChannelSupported(context)) {
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager == null) {
                        ao.m9516a("Notification manager is null");
                        return;
                    }
                    notificationManager.deleteNotificationChannel(str);
                } catch (Throwable th) {
                    bo.m9608a(th);
                }
            }
        }

        /* renamed from: b */
        private static String m14539b(Context context, Map<String, Object> map) {
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
                                        ao.m9516a("Notification manager is null");
                                    } else {
                                        notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(map, charSequence));
                                    }
                                } catch (Throwable th) {
                                    bo.m9608a(th);
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
        private static void m14535a(Context context, String str, String str2) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    if (BuildUtil.isNotificationChannelSupported(context)) {
                        try {
                            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                            if (notificationManager == null) {
                                ao.m9516a("Notification manager is null");
                                return;
                            }
                            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(str, str2));
                        } catch (Throwable th) {
                            bo.m9608a(th);
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        private static void m14547d(Context context, String str) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    if (BuildUtil.isNotificationChannelSupported(context)) {
                        try {
                            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                            if (notificationManager == null) {
                                ao.m9516a("Notification manager is null");
                                return;
                            }
                            notificationManager.deleteNotificationChannelGroup(str);
                        } catch (Throwable th) {
                            bo.m9608a(th);
                        }
                    }
                }
            }
        }

        /* renamed from: e */
        private static List<NotificationChannel> m14548e(Context context) {
            if (!BuildUtil.isNotificationChannelSupported(context)) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                return notificationManager.getNotificationChannels();
            }
            ao.m9516a("Notification manager is null");
            return null;
        }

        /* renamed from: a */
        static String m14532a(Context context) {
            return BuildUtil.isNotificationChannelSupported(context) ? C38498.m14544c(context) : null;
        }

        /* renamed from: f */
        private static List<NotificationChannelGroup> m14549f(Context context) {
            if (!BuildUtil.isNotificationChannelSupported(context)) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                return notificationManager.getNotificationChannelGroups();
            }
            ao.m9516a("Cannot get Notification Channel Groups, notificationManager is null.");
            return null;
        }
    }

    /* renamed from: com.leanplum.Leanplum$9 */
    final class C38509 implements aj {
        C38509() {
        }

        /* renamed from: a */
        public final void mo2613a(boolean z) {
            if (z) {
                ao.m9521f(new Object[]{"setUserAttributes with location is successfully called"});
            }
        }
    }

    private Leanplum() {
    }

    public static void setApiConnectionSettings(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            ao.m9516a("setApiConnectionSettings - Empty hostname parameter provided.");
        } else if (TextUtils.isEmpty(str2)) {
            ao.m9516a("setApiConnectionSettings - Empty servletName parameter provided.");
        } else {
            C2590h.f8056a = str;
            C2590h.f8057b = str2;
            C2590h.f8058c = z;
        }
    }

    public static void setSocketConnectionSettings(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            ao.m9516a("setSocketConnectionSettings - Empty hostName parameter provided.");
            return;
        }
        if (i > 0) {
            if (i <= 65535) {
                C2590h.f8059d = str;
                C2590h.f8060e = i;
                return;
            }
        }
        ao.m9516a("setSocketConnectionSettings - Invalid port parameter provided.");
    }

    public static void setFileHashingEnabledInDevelopmentMode(boolean z) {
        C2590h.f8066k = z;
    }

    public static void setFileUploadingEnabledInDevelopmentMode(boolean z) {
        C2590h.f8071p = z;
    }

    public static void enableVerboseLoggingInDevelopmentMode() {
        C2590h.f8070o = true;
    }

    public static void setNetworkTimeout(int i, int i2) {
        if (i < 0) {
            ao.m9516a("setNetworkTimeout - Invalid seconds parameter provided.");
        } else if (i2 < 0) {
            ao.m9516a("setNetworkTimeout - Invalid downloadSeconds parameter provided.");
        } else {
            C2590h.f8061f = i;
            C2590h.f8062g = i2;
        }
    }

    public static void setCanDownloadContentMidSessionInProductionMode(boolean z) {
        C2590h.f8072q = z;
    }

    public static void setAppIdForDevelopmentMode(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ao.m9516a("setAppIdForDevelopmentMode - Empty appId parameter provided.");
        } else if (TextUtils.isEmpty(str2)) {
            ao.m9516a("setAppIdForDevelopmentMode - Empty accessKey parameter provided.");
        } else {
            C2590h.f8067l = true;
            aw.m9540a(str, str2);
        }
    }

    public static void setAppIdForProductionMode(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ao.m9516a("setAppIdForProductionMode - Empty appId parameter provided.");
        } else if (TextUtils.isEmpty(str2)) {
            ao.m9516a("setAppIdForProductionMode - Empty accessKey parameter provided.");
        } else {
            C2590h.f8067l = false;
            aw.m9540a(str, str2);
        }
    }

    public static void trackAllAppScreens() {
        ag.m9506o();
    }

    public static boolean isScreenTrackingEnabled() {
        return ag.m9505n();
    }

    public static boolean isInterfaceEditingEnabled() {
        return an.m14557b();
    }

    public static void setDeviceIdMode(LeanplumDeviceIdMode leanplumDeviceIdMode) {
        if (leanplumDeviceIdMode == null) {
            ao.m9516a("setDeviceIdMode - Invalid mode parameter provided.");
            return;
        }
        f7822h = leanplumDeviceIdMode;
        f7824j = true;
    }

    public static void setDeviceId(String str) {
        if (TextUtils.isEmpty(str)) {
            ao.m9517b("setDeviceId - Empty deviceId parameter provided.");
        }
        f7823i = str;
        f7824j = true;
    }

    public static String getDeviceId() {
        if (ag.m9501j()) {
            return aw.m9561f();
        }
        ao.m9516a("Leanplum.start() must be called before calling getDeviceId.");
        return null;
    }

    public static void setApplicationContext(Context context) {
        if (context == null) {
            ao.m9517b("setApplicationContext - Null context parameter provided.");
        }
        f7828n = context;
    }

    public static Context getContext() {
        if (f7828n == null) {
            ao.m9516a("Your application context is not set. You should call Leanplum.setApplicationContext(this) or LeanplumActivityHelper.enableLifecycleCallbacks(this) in your application's onCreate method, or have your application extend LeanplumApplication.");
        }
        return f7828n;
    }

    public static void syncResources() {
        if (!C2590h.m9712a()) {
            try {
                C2594s.m9725a(null, null, false);
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    public static void syncResourcesAsync() {
        if (!C2590h.m9712a()) {
            try {
                C2594s.m9725a(null, null, true);
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    public static void syncResources(List<String> list, List<String> list2) {
        try {
            C2594s.m9725a((List) list, (List) list2, false);
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    public static void syncResourcesAsync(List<String> list, List<String> list2) {
        try {
            C2594s.m9725a((List) list, (List) list2, true);
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    public static boolean isResourceSyncingEnabled() {
        return C2594s.m9729b();
    }

    public static void start(Context context) {
        m9345a(context, null, null, null, null);
    }

    public static void start(Context context, StartCallback startCallback) {
        m9345a(context, null, null, startCallback, null);
    }

    public static void start(Context context, Map<String, ?> map) {
        m9345a(context, null, (Map) map, null, null);
    }

    public static void start(Context context, String str) {
        m9345a(context, str, null, null, null);
    }

    public static void start(Context context, String str, StartCallback startCallback) {
        m9345a(context, str, null, startCallback, null);
    }

    public static void start(Context context, String str, Map<String, ?> map) {
        m9345a(context, str, (Map) map, null, null);
    }

    public static synchronized void start(Context context, String str, Map<String, ?> map, StartCallback startCallback) {
        synchronized (Leanplum.class) {
            m9345a(context, str, (Map) map, startCallback, null);
        }
    }

    /* renamed from: a */
    private static synchronized void m9345a(Context context, String str, Map<String, ?> map, StartCallback startCallback, Boolean bool) {
        synchronized (Leanplum.class) {
            try {
                boolean z;
                aq.m9522a();
                if (context instanceof Activity) {
                    LeanplumActivityHelper.f7831b = (Activity) context;
                }
                if (LeanplumActivityHelper.f7831b != null) {
                    if (!LeanplumActivityHelper.isActivityPaused()) {
                        z = false;
                        if (C2590h.m9712a()) {
                            if (startCallback != null) {
                                addStartResponseHandler(startCallback);
                            }
                            if (context != null) {
                                setApplicationContext(context.getApplicationContext());
                            }
                            if (ag.m9501j() != null) {
                                f7825k = true;
                                MessageTemplates.register(getContext());
                                ag.m9494e(z);
                                context = ag.m9472a((Map) map, "userAttributes", true);
                                ag.m9491c(true);
                                if (context != null) {
                                    ag.m9504m().add(context);
                                }
                                aw.m9553c();
                                bq.m9649a(true);
                                bq.m9663g();
                                bq.m9649a(false);
                                LeanplumInbox.m9394a().m9404c();
                                bq.m9642a(new C38481());
                                aw.m9537a(new az() {
                                    /* renamed from: a */
                                    public final void mo2609a() {
                                        Leanplum.m9364c();
                                    }
                                });
                                bo.m9613a(true, new AnonymousClass11(str, context, z), new Void[0]);
                                return;
                            } else if (!z || ag.m9503l() == null) {
                                ao.m9518c(new Object[]{"Already called start"});
                                return;
                            } else {
                                ag.m9494e(false);
                                ag.m9489c();
                                return;
                            }
                        }
                        ag.m9483a(true);
                        ag.m9488b(true);
                        m9363b(true);
                        m9382u();
                        m9364c();
                        bq.m9647a(new HashMap(), new HashMap(), bq.m9658c(), bq.m9660d(), new HashMap(), new ArrayList());
                        LeanplumInbox.m9394a().m9402a(new HashMap(), 0, false);
                    }
                }
                z = true;
                if (C2590h.m9712a()) {
                    if (startCallback != null) {
                        addStartResponseHandler(startCallback);
                    }
                    if (context != null) {
                        setApplicationContext(context.getApplicationContext());
                    }
                    if (ag.m9501j() != null) {
                        f7825k = true;
                        MessageTemplates.register(getContext());
                        ag.m9494e(z);
                        context = ag.m9472a((Map) map, "userAttributes", true);
                        ag.m9491c(true);
                        if (context != null) {
                            ag.m9504m().add(context);
                        }
                        aw.m9553c();
                        bq.m9649a(true);
                        bq.m9663g();
                        bq.m9649a(false);
                        LeanplumInbox.m9394a().m9404c();
                        bq.m9642a(new C38481());
                        aw.m9537a(/* anonymous class already generated */);
                        bo.m9613a(true, new AnonymousClass11(str, context, z), new Void[0]);
                        return;
                    }
                    if (z) {
                    }
                    ao.m9518c(new Object[]{"Already called start"});
                    return;
                }
                ag.m9483a(true);
                ag.m9488b(true);
                m9363b(true);
                m9382u();
                m9364c();
                bq.m9647a(new HashMap(), new HashMap(), bq.m9658c(), bq.m9660d(), new HashMap(), new ArrayList());
                LeanplumInbox.m9394a().m9402a(new HashMap(), 0, false);
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: b */
    private static void m9359b(String str, Map<String, ?> map, boolean z) {
        ae.m9465a(f7828n);
        LeanplumPushService.m9414b();
        Boolean bool = null;
        if (aw.m9561f() == null) {
            String str2;
            if (!f7824j && C2590h.f8065j != null) {
                str2 = C2590h.f8065j;
            } else if (f7823i != null) {
                str2 = f7823i;
            } else {
                ab a = bo.m9594a(f7822h);
                String str3 = a.f7891a;
                bool = Boolean.valueOf(a.f7892b);
                str2 = str3;
            }
            aw.m9539a(str2);
        }
        if (str == null) {
            str = aw.m9562g();
            if (str == null) {
                str = aw.m9561f();
            }
        }
        aw.m9548b(str);
        str = bo.m9596a();
        if (str == null) {
            str = "";
        }
        TimeZone timeZone = TimeZone.getDefault();
        int offset = timeZone.getOffset(new Date().getTime()) / AdError.NETWORK_ERROR_CODE;
        String string = SharedPreferencesUtil.getString(f7828n, "__leanplum_push__", "registration_id");
        Map hashMap = new HashMap();
        hashMap.put("includeDefaults", Boolean.toString(false));
        if (z) {
            hashMap.put("background", Boolean.toString(true));
        }
        hashMap.put("versionName", str);
        hashMap.put("deviceName", bo.m9629f());
        hashMap.put("deviceModel", bo.m9614b());
        hashMap.put("systemName", bo.m9622c());
        hashMap.put("systemVersion", bo.m9625d());
        hashMap.put("gcmRegistrationId", string);
        hashMap.put("timezone", timeZone.getID());
        hashMap.put("timezoneOffsetSeconds", Integer.toString(offset));
        hashMap.put(ManagerWebServices.PARAM_LOCALE, bo.m9631g());
        hashMap.put(ManagerWebServices.PARAM_COUNTRY, "(detect)");
        hashMap.put("region", "(detect)");
        hashMap.put("city", "(detect)");
        hashMap.put("location", "(detect)");
        if (Boolean.TRUE.equals(bool) != null) {
            hashMap.put("limitTracking", bool.toString());
        }
        if (map != null) {
            hashMap.put("userAttributes", ab.m9450a((Map) map));
        }
        if (C2590h.f8067l != null) {
            hashMap.put("devMode", Boolean.TRUE.toString());
        }
        hashMap.put("newsfeedMessages", LeanplumInbox.m9394a().messagesIds());
        bo.m9610a(hashMap);
        str = aw.m9544b("start", hashMap);
        aw.m9536a(new ax(str) {
            /* renamed from: b */
            private static final int f12090b = -14;
            /* renamed from: c */
            private static final int f12091c = 14;
            /* renamed from: d */
            private static final String f12092d = "leanplum_default_push_icon";
            /* renamed from: a */
            private /* synthetic */ aw f12093a;

            AnonymousClass12(aw awVar) {
                this.f12093a = awVar;
            }

            /* renamed from: a */
            public final void mo2610a(List<Map<String, Object>> list, JSONObject jSONObject, int i) {
                Leanplum.m9353a(jSONObject, list, this.f12093a, i);
            }

            /* renamed from: a */
            static C0382c m14525a(Context context, boolean z) {
                if (!z) {
                    return new C0382c(context);
                }
                z = C38498.m14532a(context);
                if (!TextUtils.isEmpty(z)) {
                    return new C0382c(context, z);
                }
                ao.m9517b(new Object[]{"Failed to post notification, there are no notification channels configured."});
                return null;
            }

            /* renamed from: b */
            private static Builder m14529b(Context context, boolean z) {
                z = C38498.m14532a(context);
                if (!TextUtils.isEmpty(z)) {
                    return new Builder(context, z);
                }
                ao.m9517b(new Object[]{"Failed to post notification, there are no notification channels configured."});
                return null;
            }

            /* renamed from: a */
            static android.support.v4.app.NotificationCompat.C0382c m14524a(android.content.Context r3, android.os.Bundle r4) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
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
                r4 = com.leanplum.p069a.ab.m9452a(r4);	 Catch:{ Exception -> 0x0037 }
                r4 = com.leanplum.Leanplum.C38498.m14533a(r3, r4);	 Catch:{ Exception -> 0x0037 }
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
                com.leanplum.p069a.ao.m9517b(r3);	 Catch:{ Exception -> 0x0037 }
                goto L_0x0040;	 Catch:{ Exception -> 0x0037 }
            L_0x0032:
                r2 = com.leanplum.Leanplum.AnonymousClass12.m14525a(r3, r1);	 Catch:{ Exception -> 0x0037 }
                goto L_0x0047;
            L_0x0037:
                r3 = new java.lang.Object[r1];
                r4 = "Failed to post notification to specified channel.";
                r3[r0] = r4;
                com.leanplum.p069a.ao.m9516a(r3);
            L_0x0040:
                r2 = 0;
                goto L_0x0047;
            L_0x0042:
                r2 = new android.support.v4.app.NotificationCompat$c;
                r2.<init>(r3);
            L_0x0047:
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.leanplum.Leanplum.12.a(android.content.Context, android.os.Bundle):android.support.v4.app.NotificationCompat$c");
            }

            /* renamed from: b */
            private static android.app.Notification.Builder m14528b(android.content.Context r4, android.os.Bundle r5) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
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
                r5 = com.leanplum.p069a.ab.m9452a(r5);	 Catch:{ Exception -> 0x004e }
                r5 = com.leanplum.Leanplum.C38498.m14533a(r4, r5);	 Catch:{ Exception -> 0x004e }
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
                com.leanplum.p069a.ao.m9517b(r4);	 Catch:{ Exception -> 0x004e }
                goto L_0x005d;	 Catch:{ Exception -> 0x004e }
            L_0x0033:
                r5 = com.leanplum.Leanplum.C38498.m14532a(r4);	 Catch:{ Exception -> 0x004e }
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
                com.leanplum.p069a.ao.m9517b(r4);	 Catch:{ Exception -> 0x004e }
                goto L_0x005d;
            L_0x004e:
                r4 = new java.lang.Object[r2];
                r5 = "Failed to post notification to specified channel.";
                r4[r0] = r5;
                com.leanplum.p069a.ao.m9516a(r4);
                goto L_0x005d;
            L_0x0058:
                r1 = new android.app.Notification$Builder;
                r1.<init>(r4);
            L_0x005d:
                return r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.leanplum.Leanplum.12.b(android.content.Context, android.os.Bundle):android.app.Notification$Builder");
            }

            /* renamed from: a */
            static Builder m14523a(Context context, Bundle bundle, PendingIntent pendingIntent, String str, String str2, Bitmap bitmap, int i) {
                if (VERSION.SDK_INT < 16) {
                    return null;
                }
                Builder b = AnonymousClass12.m14528b(context, bundle);
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
                        ao.m9516a("Cannot modify push notification layout.", context2);
                    }
                }
                b.setAutoCancel(true);
                b.setContentIntent(pendingIntent);
                return b;
            }

            /* renamed from: c */
            private static boolean m14530c(android.content.Context r1) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
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
                throw new UnsupportedOperationException("Method not decompiled: com.leanplum.Leanplum.12.c(android.content.Context):boolean");
            }

            /* renamed from: a */
            static boolean m14526a(Context context) {
                if (context == null) {
                    return null;
                }
                if (VERSION.SDK_INT < 26) {
                    return true;
                }
                return AnonymousClass12.m14530c(context);
            }

            /* renamed from: b */
            static int m14527b(android.content.Context r3) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
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
                throw new UnsupportedOperationException("Method not decompiled: com.leanplum.Leanplum.12.b(android.content.Context):int");
            }
        });
        if (z) {
            str.m9582k();
        } else {
            str.m9581j();
        }
        ag.m9492d();
    }

    /* renamed from: b */
    private static void m9361b(JSONObject jSONObject, List<Map<String, Object>> list, aw awVar, int i) {
        int i2 = 1;
        try {
            long j = (long) i;
            if (awVar.m9577b() >= j) {
                awVar.m9573a(awVar.m9577b() - j);
                return;
            }
            awVar = aw.m9528a(jSONObject);
            i = list.size() - 1;
            while (i >= 0) {
                if ("start".equals(((Map) list.get(i)).get("action"))) {
                    jSONObject = i < awVar ? aw.m9532a(jSONObject, i) : null;
                    if (i2 != 0 && ag.m9499h() == null) {
                        aw.m9536a(null);
                        bo.m9613a(false, new AnonymousClass13(jSONObject), new Void[0]);
                    }
                }
                i--;
            }
            jSONObject = null;
            i2 = 0;
            aw.m9536a(null);
            bo.m9613a(false, new AnonymousClass13(jSONObject), new Void[0]);
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    /* renamed from: a */
    private static void m9352a(JSONObject jSONObject) {
        bo.m9613a(false, new AnonymousClass13(jSONObject), new Void[0]);
    }

    /* renamed from: b */
    private static void m9362b(JSONObject jSONObject, boolean z) {
        Map b = ab.m9456b(jSONObject.optJSONObject("vars"));
        Map b2 = ab.m9456b(jSONObject.optJSONObject(ManagerWebServices.PARAM_MESSAGES));
        List b3 = ab.m9455b(jSONObject.optJSONArray("interfaceRules"));
        List b4 = ab.m9455b(jSONObject.optJSONArray("interfaceEvents"));
        Map b5 = ab.m9456b(jSONObject.optJSONObject("regions"));
        List b6 = ab.m9455b(jSONObject.optJSONArray("variants"));
        if (z || b.equals(bq.m9641a()) == null || b2.equals(bq.m9655b()) == null || b3.equals(bq.m9658c()) == null || b4.equals(bq.m9660d()) == null || b5.equals(bq.m9661e()) == null) {
            bq.m9647a(b, b2, b3, b4, b5, b6);
        }
    }

    static void setClient(String str, String str2, String str3) {
        C2590h.f8064i = str;
        C2590h.f8063h = str2;
        C2590h.f8065j = str3;
    }

    /* renamed from: a */
    static void m9344a() {
        if (!C2590h.m9712a()) {
            if (!ag.m9501j()) {
                ao.m9516a("You cannot call pause before calling start");
            } else if (ag.m9498g()) {
                m9375n();
            } else {
                ag.m9477a(new Runnable() {
                    public final void run() {
                        try {
                            Leanplum.m9375n();
                        } catch (Throwable th) {
                            bo.m9608a(th);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: n */
    private static void m9375n() {
        aw.m9544b("pauseSession", null).m9581j();
        synchronized (f7819e) {
            if (f7827m != null) {
                f7827m.shutdown();
            }
        }
        ag.m9493d(true);
    }

    /* renamed from: b */
    static void m9356b() {
        if (!C2590h.m9712a()) {
            if (!ag.m9501j()) {
                ao.m9516a("You cannot call resume before calling start");
            } else if (ag.m9498g()) {
                m9376o();
            } else {
                ag.m9477a(new Runnable() {
                    public final void run() {
                        try {
                            Leanplum.m9376o();
                        } catch (Throwable th) {
                            bo.m9608a(th);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: o */
    private static void m9376o() {
        aw b = aw.m9544b("resumeSession", null);
        if (ag.m9503l()) {
            ag.m9494e(false);
            b.m9581j();
        } else {
            b.m9580i();
            ag.m9481a("resume", null, 3, null, null);
        }
        m9377p();
        ag.m9493d(false);
    }

    /* renamed from: p */
    private static void m9377p() {
        synchronized (f7819e) {
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            f7827m = newSingleThreadScheduledExecutor;
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(new Runnable() {
                public final void run() {
                    try {
                        aw.m9544b("heartbeat", null).m9580i();
                    } catch (Throwable th) {
                        bo.m9608a(th);
                    }
                }
            }, 15, 15, TimeUnit.MINUTES);
        }
    }

    /* renamed from: q */
    private static void m9378q() {
        synchronized (f7819e) {
            if (f7827m != null) {
                f7827m.shutdown();
            }
        }
    }

    /* renamed from: r */
    private static void m9379r() {
        m9377p();
    }

    /* renamed from: s */
    private static void m9380s() {
        if (!C2590h.m9712a()) {
            if (!ag.m9501j()) {
                ao.m9516a("You cannot call stop before calling start");
            } else if (ag.m9498g()) {
                m9381t();
            } else {
                ag.m9477a(new Runnable() {
                    public final void run() {
                        try {
                            Leanplum.m9381t();
                        } catch (Throwable th) {
                            bo.m9608a(th);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: t */
    private static void m9381t() {
        aw.m9544b("stop", null).m9581j();
    }

    public static boolean hasStarted() {
        return ag.m9499h();
    }

    public static LeanplumInbox getInbox() {
        return LeanplumInbox.m9394a();
    }

    public static boolean hasStartedAndRegisteredAsDeveloper() {
        return ag.m9495e();
    }

    public static void addStartResponseHandler(StartCallback startCallback) {
        if (startCallback == null) {
            ao.m9516a("addStartResponseHandler - Invalid handler parameter provided.");
        } else if (ag.m9499h()) {
            if (ag.m9500i()) {
                startCallback.setSuccess(true);
            }
            startCallback.run();
        } else {
            synchronized (f7815a) {
                if (f7815a.indexOf(startCallback) == -1) {
                    f7815a.add(startCallback);
                }
            }
        }
    }

    public static void removeStartResponseHandler(StartCallback startCallback) {
        if (startCallback == null) {
            ao.m9516a("removeStartResponseHandler - Invalid handler parameter provided.");
            return;
        }
        synchronized (f7815a) {
            f7815a.remove(startCallback);
        }
    }

    /* renamed from: b */
    private static void m9363b(boolean z) {
        synchronized (f7815a) {
            Iterator it = f7815a.iterator();
            while (it.hasNext()) {
                StartCallback startCallback = (StartCallback) it.next();
                startCallback.setSuccess(z);
                aq.m9522a().m9523a(startCallback);
            }
            f7815a.clear();
        }
    }

    public static void addVariablesChangedHandler(VariablesChangedCallback variablesChangedCallback) {
        if (variablesChangedCallback == null) {
            ao.m9516a("addVariablesChangedHandler - Invalid handler parameter provided.");
            return;
        }
        synchronized (f7816b) {
            f7816b.add(variablesChangedCallback);
        }
        if (bq.m9662f()) {
            variablesChangedCallback.variablesChanged();
        }
    }

    public static void removeVariablesChangedHandler(VariablesChangedCallback variablesChangedCallback) {
        if (variablesChangedCallback == null) {
            ao.m9516a("removeVariablesChangedHandler - Invalid handler parameter provided.");
            return;
        }
        synchronized (f7816b) {
            f7816b.remove(variablesChangedCallback);
        }
    }

    /* renamed from: u */
    private static void m9382u() {
        synchronized (f7816b) {
            Iterator it = f7816b.iterator();
            while (it.hasNext()) {
                aq.m9522a().m9523a((VariablesChangedCallback) it.next());
            }
        }
    }

    public static void addVariablesChangedAndNoDownloadsPendingHandler(VariablesChangedCallback variablesChangedCallback) {
        if (variablesChangedCallback == null) {
            ao.m9516a("addVariablesChangedAndNoDownloadsPendingHandler - Invalid handler parameter provided.");
            return;
        }
        synchronized (f7817c) {
            f7817c.add(variablesChangedCallback);
        }
        if (bq.m9662f() && aw.m9563l() == 0) {
            variablesChangedCallback.variablesChanged();
        }
    }

    public static void removeVariablesChangedAndNoDownloadsPendingHandler(VariablesChangedCallback variablesChangedCallback) {
        if (variablesChangedCallback == null) {
            ao.m9516a("removeVariablesChangedAndNoDownloadsPendingHandler - Invalid handler parameter provided.");
            return;
        }
        synchronized (f7817c) {
            f7817c.remove(variablesChangedCallback);
        }
    }

    public static void addOnceVariablesChangedAndNoDownloadsPendingHandler(VariablesChangedCallback variablesChangedCallback) {
        if (variablesChangedCallback == null) {
            ao.m9516a("addOnceVariablesChangedAndNoDownloadsPendingHandler - Invalid handler parameter provided.");
        } else if (bq.m9662f() && aw.m9563l() == 0) {
            variablesChangedCallback.variablesChanged();
        } else {
            synchronized (f7818d) {
                f7818d.add(variablesChangedCallback);
            }
        }
    }

    public static void removeOnceVariablesChangedAndNoDownloadsPendingHandler(VariablesChangedCallback variablesChangedCallback) {
        if (variablesChangedCallback == null) {
            ao.m9516a("removeOnceVariablesChangedAndNoDownloadsPendingHandler - Invalid handler parameter provided.");
            return;
        }
        synchronized (f7818d) {
            f7818d.remove(variablesChangedCallback);
        }
    }

    /* renamed from: c */
    static void m9364c() {
        synchronized (f7817c) {
            Iterator it = f7817c.iterator();
            while (it.hasNext()) {
                aq.m9522a().m9523a((VariablesChangedCallback) it.next());
            }
        }
        synchronized (f7818d) {
            Iterator it2 = f7818d.iterator();
            while (it2.hasNext()) {
                aq.m9522a().m9523a((VariablesChangedCallback) it2.next());
            }
            f7818d.clear();
        }
    }

    public static void defineAction(String str, int i, ActionArgs actionArgs) {
        m9347a(str, i, actionArgs, null, null);
    }

    public static void defineAction(String str, int i, ActionArgs actionArgs, ActionCallback actionCallback) {
        m9347a(str, i, actionArgs, null, actionCallback);
    }

    /* renamed from: a */
    private static void m9347a(String str, int i, ActionArgs actionArgs, Map<String, Object> map, ActionCallback actionCallback) {
        if (TextUtils.isEmpty(str) != null) {
            ao.m9516a("defineAction - Empty name parameter provided.");
        } else if (actionArgs == null) {
            ao.m9516a("defineAction - Invalid args parameter provided.");
        } else {
            try {
                map = getContext();
                if (!f7825k) {
                    f7825k = true;
                    MessageTemplates.register(map);
                }
                map = new HashMap();
                ag.m9496f().remove(str);
                bq.m9644a(str, i, actionArgs.m9341a(), map);
                if (actionCallback != null) {
                    onAction(str, actionCallback);
                }
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    public static void onAction(String str, ActionCallback actionCallback) {
        if (str == null) {
            ao.m9516a("onAction - Invalid actionName parameter provided.");
        } else if (actionCallback == null) {
            ao.m9516a("onAction - Invalid handler parameter provided.");
        } else {
            List list = (List) ag.m9496f().get(str);
            if (list == null) {
                list = new ArrayList();
                ag.m9496f().put(str, list);
            }
            list.add(actionCallback);
        }
    }

    public static void setUserAttributes(String str, Map<String, ?> map) {
        if (!C2590h.m9712a()) {
            if (ag.m9501j()) {
                try {
                    HashMap hashMap = new HashMap();
                    if (str != null) {
                        hashMap.put("newUserId", str);
                    }
                    if (map != null) {
                        Map a = ag.m9472a((Map) map, "userAttributes", true);
                        hashMap.put("userAttributes", ab.m9450a(a));
                        ag.m9504m().add(a);
                    }
                    if (ag.m9498g() != null) {
                        m9357b(str, hashMap);
                    } else {
                        ag.m9477a(new C25662(str, hashMap));
                    }
                } catch (Throwable th) {
                    bo.m9608a(th);
                }
            } else {
                ao.m9516a("You cannot call setUserAttributes before calling start");
            }
        }
    }

    /* renamed from: b */
    private static void m9357b(String str, HashMap<String, Object> hashMap) {
        aw.m9544b("setUserAttributes", (Map) hashMap).m9579h();
        if (str != null && str.length() > null) {
            aw.m9548b(str);
            if (ag.m9499h() != null) {
                bq.m9664h();
            }
        }
        ag.m9486b();
    }

    public static void setUserId(String str) {
        if (str == null) {
            ao.m9516a("setUserId - Invalid userId parameter provided.");
            return;
        }
        setUserAttributes(str, null);
    }

    public static void setUserAttributes(Map<String, Object> map) {
        if (map != null) {
            if (!map.isEmpty()) {
                setUserAttributes(null, map);
                return;
            }
        }
        ao.m9516a("setUserAttributes - Invalid userAttributes parameter provided (null or empty).");
    }

    /* renamed from: a */
    static void m9346a(String str) {
        if (!C2590h.m9712a()) {
            Runnable c25673 = new C25673(str);
            f7829o = c25673;
            ag.m9477a(c25673);
        }
    }

    public static void setTrafficSourceInfo(Map<String, String> map) {
        if (!C2590h.m9712a()) {
            if (ag.m9501j()) {
                if (map != null) {
                    if (!map.isEmpty()) {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put("trafficSource", ab.m9450a(ag.m9472a((Map) map, "info", false)));
                            if (ag.m9498g() != null) {
                                m9360b(hashMap);
                                return;
                            } else {
                                ag.m9477a(new C25684(hashMap));
                                return;
                            }
                        } catch (Throwable th) {
                            bo.m9608a(th);
                        }
                    }
                }
                ao.m9516a("setTrafficSourceInfo - Invalid info parameter provided (null or empty).");
                return;
            }
            ao.m9516a("You cannot call setTrafficSourceInfo before calling start");
        }
    }

    /* renamed from: b */
    private static void m9360b(HashMap<String, Object> hashMap) {
        aw.m9544b("setTrafficSourceInfo", (Map) hashMap).m9579h();
    }

    public static void track(String str, double d, String str2, Map<String, ?> map) {
        ag.m9479a(str, d, str2, (Map) map, null);
    }

    public static void trackPurchase(String str, double d, String str2, Map<String, ?> map) {
        try {
            if (TextUtils.isEmpty(str)) {
                ao.m9517b("trackPurchase - Empty event parameter provided.");
            }
            Map hashMap = new HashMap();
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("currencyCode", str2);
            }
            ag.m9479a(str, d, null, (Map) map, hashMap);
        } catch (Throwable th) {
            ao.m9516a("trackPurchase - Failed to track purchase event.");
            bo.m9608a(th);
        }
    }

    public static void trackGooglePlayPurchase(String str, long j, String str2, String str3, String str4) {
        trackGooglePlayPurchase(PURCHASE_EVENT_NAME, str, j, str2, str3, str4, null);
    }

    public static void trackGooglePlayPurchase(String str, long j, String str2, String str3, String str4, Map<String, ?> map) {
        trackGooglePlayPurchase(PURCHASE_EVENT_NAME, str, j, str2, str3, str4, map);
    }

    public static void trackGooglePlayPurchase(String str, String str2, long j, String str3, String str4, String str5, Map<String, ?> map) {
        Map hashMap;
        if (TextUtils.isEmpty(str)) {
            ao.m9517b("trackGooglePlayPurchase - Empty eventName parameter provided.");
        }
        Map hashMap2 = new HashMap();
        hashMap2.put("googlePlayPurchaseData", str4);
        hashMap2.put("googlePlayPurchaseDataSignature", str5);
        hashMap2.put("currencyCode", str3);
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("item", str2);
        ag.m9479a(str, ((double) j) / 0, null, hashMap, hashMap2);
    }

    public static void track(String str) {
        track(str, 0.0d, "", null);
    }

    public static void track(String str, double d) {
        track(str, d, "", null);
    }

    public static void track(String str, String str2) {
        track(str, 0.0d, str2, null);
    }

    public static void track(String str, Map<String, ?> map) {
        track(str, 0.0d, "", map);
    }

    public static void track(String str, double d, Map<String, ?> map) {
        track(str, d, "", map);
    }

    public static void track(String str, double d, String str2) {
        track(str, d, str2, null);
    }

    public static void advanceTo(String str, String str2, Map<String, ?> map) {
        if (!C2590h.m9712a()) {
            if (ag.m9501j()) {
                try {
                    Map a;
                    Map hashMap = new HashMap();
                    hashMap.put("info", str2);
                    hashMap.put("state", str);
                    if (map != null) {
                        a = ag.m9472a((Map) map, "params", false);
                        hashMap.put("params", ab.m9450a(a));
                    } else {
                        a = null;
                    }
                    if (ag.m9498g() != null) {
                        m9358b(str, a, hashMap);
                    } else {
                        ag.m9477a(new C25695(str, a, hashMap));
                    }
                } catch (Throwable th) {
                    bo.m9608a(th);
                }
            } else {
                ao.m9516a("You cannot call advanceTo before calling start");
            }
        }
    }

    /* renamed from: b */
    private static void m9358b(String str, Map<String, ?> map, Map<String, Object> map2) {
        aw.m9544b("advance", (Map) map2).m9579h();
        ContextualValues contextualValues = new ContextualValues();
        contextualValues.parameters = map;
        ag.m9481a("state", str, 3, null, contextualValues);
    }

    public static void advanceTo(String str) {
        advanceTo(str, "", null);
    }

    public static void advanceTo(String str, String str2) {
        advanceTo(str, str2, null);
    }

    public static void advanceTo(String str, Map<String, ?> map) {
        advanceTo(str, "", map);
    }

    public static void pauseState() {
        if (!C2590h.m9712a()) {
            if (ag.m9501j()) {
                try {
                    if (ag.m9498g()) {
                        m9383v();
                    } else {
                        ag.m9477a(new C25706());
                    }
                } catch (Throwable th) {
                    bo.m9608a(th);
                }
            } else {
                ao.m9516a("You cannot call pauseState before calling start");
            }
        }
    }

    /* renamed from: v */
    private static void m9383v() {
        aw.m9544b("pauseState", new HashMap()).m9579h();
    }

    public static void resumeState() {
        if (!C2590h.m9712a()) {
            if (ag.m9501j()) {
                try {
                    if (ag.m9498g()) {
                        m9384w();
                    } else {
                        ag.m9477a(new C25717());
                    }
                } catch (Throwable th) {
                    bo.m9608a(th);
                }
            } else {
                ao.m9516a("You cannot call resumeState before calling start");
            }
        }
    }

    /* renamed from: w */
    private static void m9384w() {
        aw.m9544b("resumeState", new HashMap()).m9579h();
    }

    public static void forceContentUpdate() {
        forceContentUpdate(null);
    }

    public static void forceContentUpdate(VariablesChangedCallback variablesChangedCallback) {
        if (C2590h.m9712a()) {
            if (variablesChangedCallback != null) {
                aq.m9522a().m9523a(variablesChangedCallback);
            }
            return;
        }
        try {
            Map hashMap = new HashMap();
            hashMap.put("includeDefaults", Boolean.toString(false));
            hashMap.put("newsfeedMessages", LeanplumInbox.m9394a().messagesIds());
            aw b = aw.m9544b("getVars", hashMap);
            b.m9575a(new C3861a(variablesChangedCallback));
            b.m9574a(new C38498(variablesChangedCallback));
            b.m9581j();
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    public static void enableTestMode() {
        C2590h.f8069n = true;
    }

    public static boolean isTestModeEnabled() {
        return C2590h.f8069n;
    }

    public static void setIsTestModeEnabled(boolean z) {
        C2590h.f8069n = z;
    }

    public static String pathForResource(String str) {
        if (TextUtils.isEmpty(str)) {
            ao.m9516a("pathForResource - Empty filename parameter provided.");
            return null;
        }
        str = Var.defineFile(str, str);
        if (str != null) {
            return str.fileValue();
        }
        return null;
    }

    public static Object objectForKeyPath(Object... objArr) {
        return objectForKeyPathComponents(objArr);
    }

    public static Object objectForKeyPathComponents(Object[] objArr) {
        try {
            return bq.m9638a(objArr);
        } catch (Throwable th) {
            bo.m9608a(th);
            return null;
        }
    }

    public static List<Map<String, Object>> variants() {
        List<Map<String, Object>> n = bq.m9670n();
        return n == null ? new ArrayList() : n;
    }

    public static Map<String, Object> messageMetadata() {
        Map<String, Object> p = bq.m9672p();
        return p == null ? new HashMap() : p;
    }

    public static void setDeviceLocation(Location location) {
        setDeviceLocation(location, LeanplumLocationAccuracyType.CELL);
    }

    public static void setDeviceLocation(Location location, LeanplumLocationAccuracyType leanplumLocationAccuracyType) {
        if (f7826l) {
            ao.m9517b("Leanplum is automatically collecting device location, so there is no need to call setDeviceLocation. If you prefer to always set location manually, then call disableLocationCollection.");
        }
        ag.m9474a(location, leanplumLocationAccuracyType, new C38509());
    }

    public static void disableLocationCollection() {
        f7826l = false;
    }

    public static boolean isLocationCollectionEnabled() {
        return f7826l;
    }

    /* renamed from: a */
    static /* synthetic */ void m9350a(String str, Map map, boolean z) {
        ae.m9465a(f7828n);
        LeanplumPushService.m9414b();
        Boolean bool = null;
        if (aw.m9561f() == null) {
            String str2;
            if (!f7824j && C2590h.f8065j != null) {
                str2 = C2590h.f8065j;
            } else if (f7823i != null) {
                str2 = f7823i;
            } else {
                ab a = bo.m9594a(f7822h);
                String str3 = a.f7891a;
                bool = Boolean.valueOf(a.f7892b);
                str2 = str3;
            }
            aw.m9539a(str2);
        }
        if (str == null) {
            str = aw.m9562g();
            if (str == null) {
                str = aw.m9561f();
            }
        }
        aw.m9548b(str);
        str = bo.m9596a();
        if (str == null) {
            str = "";
        }
        TimeZone timeZone = TimeZone.getDefault();
        int offset = timeZone.getOffset(new Date().getTime()) / AdError.NETWORK_ERROR_CODE;
        String string = SharedPreferencesUtil.getString(f7828n, "__leanplum_push__", "registration_id");
        Map hashMap = new HashMap();
        hashMap.put("includeDefaults", Boolean.toString(false));
        if (z) {
            hashMap.put("background", Boolean.toString(true));
        }
        hashMap.put("versionName", str);
        hashMap.put("deviceName", bo.m9629f());
        hashMap.put("deviceModel", bo.m9614b());
        hashMap.put("systemName", bo.m9622c());
        hashMap.put("systemVersion", bo.m9625d());
        hashMap.put("gcmRegistrationId", string);
        hashMap.put("timezone", timeZone.getID());
        hashMap.put("timezoneOffsetSeconds", Integer.toString(offset));
        hashMap.put(ManagerWebServices.PARAM_LOCALE, bo.m9631g());
        hashMap.put(ManagerWebServices.PARAM_COUNTRY, "(detect)");
        hashMap.put("region", "(detect)");
        hashMap.put("city", "(detect)");
        hashMap.put("location", "(detect)");
        if (Boolean.TRUE.equals(bool) != null) {
            hashMap.put("limitTracking", bool.toString());
        }
        if (map != null) {
            hashMap.put("userAttributes", ab.m9450a(map));
        }
        if (C2590h.f8067l != null) {
            hashMap.put("devMode", Boolean.TRUE.toString());
        }
        hashMap.put("newsfeedMessages", LeanplumInbox.m9394a().messagesIds());
        bo.m9610a(hashMap);
        str = aw.m9544b("start", hashMap);
        aw.m9536a(/* anonymous class already generated */);
        if (z) {
            str.m9582k();
        } else {
            str.m9581j();
        }
        ag.m9492d();
    }

    /* renamed from: a */
    static /* synthetic */ void m9353a(JSONObject jSONObject, List list, aw awVar, int i) {
        int i2 = 1;
        try {
            long j = (long) i;
            if (awVar.m9577b() >= j) {
                awVar.m9573a(awVar.m9577b() - j);
                return;
            }
            awVar = aw.m9528a(jSONObject);
            i = list.size() - 1;
            while (i >= 0) {
                if ("start".equals(((Map) list.get(i)).get("action"))) {
                    jSONObject = i < awVar ? aw.m9532a(jSONObject, i) : null;
                    if (i2 != 0 && ag.m9499h() == null) {
                        aw.m9536a(null);
                        bo.m9613a(false, new AnonymousClass13(jSONObject), new Void[0]);
                    }
                }
                i--;
            }
            jSONObject = null;
            i2 = 0;
            aw.m9536a(null);
            bo.m9613a(false, new AnonymousClass13(jSONObject), new Void[0]);
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m9354a(JSONObject jSONObject, boolean z) {
        Map b = ab.m9456b(jSONObject.optJSONObject("vars"));
        Map b2 = ab.m9456b(jSONObject.optJSONObject(ManagerWebServices.PARAM_MESSAGES));
        List b3 = ab.m9455b(jSONObject.optJSONArray("interfaceRules"));
        List b4 = ab.m9455b(jSONObject.optJSONArray("interfaceEvents"));
        Map b5 = ab.m9456b(jSONObject.optJSONObject("regions"));
        List b6 = ab.m9455b(jSONObject.optJSONArray("variants"));
        if (z || b.equals(bq.m9641a()) == null || b2.equals(bq.m9655b()) == null || b3.equals(bq.m9658c()) == null || b4.equals(bq.m9660d()) == null || b5.equals(bq.m9661e()) == null) {
            bq.m9647a(b, b2, b3, b4, b5, b6);
        }
    }
}
