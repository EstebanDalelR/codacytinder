package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.Process;
import android.os.UserManager;
import android.support.annotation.WorkerThread;
import android.support.v4.util.C2880a;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.iid.C2562k;
import com.tinder.api.ManagerWebServices;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.gcm.a */
public class C2544a {
    /* renamed from: a */
    private static C2544a f7737a;
    /* renamed from: b */
    private Context f7738b;
    /* renamed from: c */
    private final PendingIntent f7739c;
    /* renamed from: d */
    private Boolean f7740d;
    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f7741e = new C2880a();

    private C2544a(Context context) {
        this.f7738b = context;
        this.f7739c = PendingIntent.getBroadcast(this.f7738b, 0, new Intent().setPackage("com.google.example.invalidpackage"), 0);
    }

    /* renamed from: a */
    private final Intent m9264a() {
        String a = C2562k.m9311a(this.f7738b);
        int a2 = a != null ? C2545b.m9276a(this.f7738b) : -1;
        if (a != null) {
            if (a2 >= 5000000) {
                Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
                intent.setPackage(a);
                intent.putExtra("app", this.f7739c);
                intent.putExtra("source", 4);
                intent.putExtra("source_version", C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                return intent;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(91);
        stringBuilder.append("Google Play Services is not available, dropping GcmNetworkManager request. code=");
        stringBuilder.append(a2);
        Log.e("GcmNetworkManager", stringBuilder.toString());
        return null;
    }

    /* renamed from: a */
    public static C2544a m9265a(Context context) {
        C2544a c2544a;
        synchronized (C2544a.class) {
            if (f7737a == null) {
                f7737a = new C2544a(context.getApplicationContext());
            }
            c2544a = f7737a;
        }
        return c2544a;
    }

    /* renamed from: a */
    private static List<ResolveInfo> m9266a(PackageManager packageManager, Intent intent, int i) {
        List<ResolveInfo> list = null;
        int i2 = 0;
        while (i2 < 2) {
            list = packageManager.queryIntentServices(intent, 0);
            if (list == null ? true : list.isEmpty()) {
                i2++;
            } else {
                if (i2 > 0) {
                    StringBuilder stringBuilder = new StringBuilder(46);
                    stringBuilder.append("validation query succeeded on try #2");
                    Log.i("GcmNetworkManager", stringBuilder.toString());
                    return list;
                }
                return list;
            }
        }
        return list;
    }

    /* renamed from: a */
    static void m9267a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        } else if (100 < str.length()) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    /* renamed from: b */
    private final synchronized boolean m9268b() {
        if (this.f7740d == null) {
            this.f7740d = Boolean.valueOf(this.f7738b.checkPermission("android.permission.INTERACT_ACROSS_USERS", Process.myPid(), Process.myUid()) == 0);
        }
        return this.f7740d.booleanValue();
    }

    /* renamed from: c */
    private final boolean m9269c(String str) {
        ad.m9046a((Object) str, (Object) "GcmTaskService must not be null.");
        PackageManager packageManager = this.f7738b.getPackageManager();
        List list = null;
        if (packageManager != null) {
            String str2;
            String str3;
            StringBuilder stringBuilder;
            Object obj = VERSION.SDK_INT < 17 ? 1 : null;
            Object obj2 = VERSION.SDK_INT < 24 ? 1 : null;
            if (obj == null) {
                if (obj2 == null || m9268b()) {
                    UserManager userManager = (UserManager) this.f7738b.getSystemService(ManagerWebServices.PARAM_USER);
                    if (userManager != null) {
                        if (!userManager.isUserRunning(Process.myUserHandle())) {
                            obj = null;
                            if (obj != null) {
                                str2 = "GcmNetworkManager";
                                str3 = str != null ? "unknown service" : str;
                                stringBuilder = new StringBuilder(String.valueOf(str3).length() + 51);
                                stringBuilder.append("Dropping request for ");
                                stringBuilder.append(str3);
                                stringBuilder.append(" because user is shutting down");
                                Log.w(str2, stringBuilder.toString());
                            } else {
                                list = C2544a.m9266a(packageManager, str == null ? new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setClassName(this.f7738b, str) : new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setPackage(this.f7738b.getPackageName()), 0);
                                if (list == null) {
                                    list = Collections.emptyList();
                                }
                            }
                        }
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                if (str == null) {
                }
                list = C2544a.m9266a(packageManager, str == null ? new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setClassName(this.f7738b, str) : new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setPackage(this.f7738b.getPackageName()), 0);
                if (list == null) {
                    list = Collections.emptyList();
                }
            } else {
                str2 = "GcmNetworkManager";
                if (str != null) {
                }
                stringBuilder = new StringBuilder(String.valueOf(str3).length() + 51);
                stringBuilder.append("Dropping request for ");
                stringBuilder.append(str3);
                stringBuilder.append(" because user is shutting down");
                Log.w(str2, stringBuilder.toString());
            }
        }
        if (r1 == null) {
            return false;
        }
        for (ResolveInfo resolveInfo : r1) {
            if (resolveInfo.serviceInfo.name.equals(str)) {
                return true;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 118);
        stringBuilder2.append("The GcmTaskService class you provided ");
        stringBuilder2.append(str);
        stringBuilder2.append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY");
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    public synchronized void m9270a(com.google.android.gms.gcm.Task r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r5.getServiceName();	 Catch:{ all -> 0x0051 }
        r0 = r4.m9269c(r0);	 Catch:{ all -> 0x0051 }
        if (r0 != 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r4);
        return;
    L_0x000d:
        r0 = r4.m9264a();	 Catch:{ all -> 0x0051 }
        if (r0 != 0) goto L_0x0015;
    L_0x0013:
        monitor-exit(r4);
        return;
    L_0x0015:
        r1 = r0.getExtras();	 Catch:{ all -> 0x0051 }
        r2 = "scheduler_action";
        r3 = "SCHEDULE_TASK";
        r1.putString(r2, r3);	 Catch:{ all -> 0x0051 }
        r5.toBundle(r1);	 Catch:{ all -> 0x0051 }
        r0.putExtras(r1);	 Catch:{ all -> 0x0051 }
        r1 = r4.f7738b;	 Catch:{ all -> 0x0051 }
        r1.sendBroadcast(r0);	 Catch:{ all -> 0x0051 }
        r0 = r4.f7741e;	 Catch:{ all -> 0x0051 }
        r1 = r5.getServiceName();	 Catch:{ all -> 0x0051 }
        r0 = r0.get(r1);	 Catch:{ all -> 0x0051 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0051 }
        if (r0 == 0) goto L_0x004f;
    L_0x0039:
        r1 = r5.getTag();	 Catch:{ all -> 0x0051 }
        r1 = r0.containsKey(r1);	 Catch:{ all -> 0x0051 }
        if (r1 == 0) goto L_0x004f;
    L_0x0043:
        r5 = r5.getTag();	 Catch:{ all -> 0x0051 }
        r1 = 1;
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ all -> 0x0051 }
        r0.put(r5, r1);	 Catch:{ all -> 0x0051 }
    L_0x004f:
        monitor-exit(r4);
        return;
    L_0x0051:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.a.a(com.google.android.gms.gcm.Task):void");
    }

    @WorkerThread
    /* renamed from: a */
    public void m9271a(String str, Class<? extends GcmTaskService> cls) {
        Parcelable componentName = new ComponentName(this.f7738b, cls);
        C2544a.m9267a(str);
        if (m9269c(componentName.getClassName())) {
            Intent a = m9264a();
            if (a != null) {
                a.putExtra("scheduler_action", "CANCEL_TASK");
                a.putExtra("tag", str);
                a.putExtra("component", componentName);
                this.f7738b.sendBroadcast(a);
            }
        }
    }

    /* renamed from: a */
    final synchronized boolean m9272a(String str, String str2) {
        Map map = (Map) this.f7741e.get(str2);
        if (map == null) {
            map = new C2880a();
            this.f7741e.put(str2, map);
        }
        return map.put(str, Boolean.valueOf(false)) == null;
    }

    /* renamed from: b */
    final synchronized void m9273b(String str, String str2) {
        Map map = (Map) this.f7741e.get(str2);
        if (map != null) {
            if ((map.remove(str) != null ? 1 : null) != null && map.isEmpty()) {
                this.f7741e.remove(str2);
            }
        }
    }

    /* renamed from: b */
    final synchronized boolean m9274b(String str) {
        return this.f7741e.containsKey(str);
    }

    /* renamed from: c */
    final synchronized boolean m9275c(String str, String str2) {
        Map map = (Map) this.f7741e.get(str2);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
