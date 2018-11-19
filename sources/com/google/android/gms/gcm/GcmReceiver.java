package com.google.android.gms.gcm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C2526k;
import com.google.android.gms.iid.C2560h;
import com.tinder.api.ManagerWebServices;

public class GcmReceiver extends WakefulBroadcastReceiver {
    /* renamed from: a */
    private static boolean f12077a = false;
    /* renamed from: b */
    private static C2560h f12078b;
    /* renamed from: c */
    private static C2560h f12079c;

    /* renamed from: a */
    private final synchronized C2560h m14466a(Context context, String str) {
        if ("com.google.android.c2dm.intent.RECEIVE".equals(str)) {
            if (f12079c == null) {
                f12079c = new C2560h(context, str);
            }
            return f12079c;
        }
        if (f12078b == null) {
            f12078b = new C2560h(context, str);
        }
        return f12078b;
    }

    /* renamed from: a */
    private final void m14467a(Context context, Intent intent) {
        ComponentName startWakefulService;
        if (isOrderedBroadcast()) {
            setResultCode(500);
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            if (resolveService.serviceInfo != null) {
                String str;
                String str2;
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    if (serviceInfo.name != null) {
                        String valueOf;
                        str = serviceInfo.name;
                        if (str.startsWith(".")) {
                            valueOf = String.valueOf(context.getPackageName());
                            str = String.valueOf(str);
                            str = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
                        }
                        if (Log.isLoggable("GcmReceiver", 3)) {
                            valueOf = "GcmReceiver";
                            str2 = "Restricting intent to a specific service: ";
                            String valueOf2 = String.valueOf(str);
                            Log.d(valueOf, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
                        }
                        intent.setClassName(context.getPackageName(), str);
                        if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                            startWakefulService = WakefulBroadcastReceiver.startWakefulService(context, intent);
                        } else {
                            startWakefulService = context.startService(intent);
                            Log.d("GcmReceiver", "Missing wake lock permission, service start may be delayed");
                        }
                        if (startWakefulService != null) {
                            Log.e("GcmReceiver", "Error while delivering the message: ServiceIntent not found.");
                            if (isOrderedBroadcast()) {
                                setResultCode(404);
                            }
                        } else if (isOrderedBroadcast()) {
                            setResultCode(-1);
                        }
                    }
                }
                str2 = serviceInfo.packageName;
                str = serviceInfo.name;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 94) + String.valueOf(str).length());
                stringBuilder.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                stringBuilder.append(str2);
                stringBuilder.append("/");
                stringBuilder.append(str);
                Log.e("GcmReceiver", stringBuilder.toString());
                if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                    startWakefulService = context.startService(intent);
                    Log.d("GcmReceiver", "Missing wake lock permission, service start may be delayed");
                } else {
                    startWakefulService = WakefulBroadcastReceiver.startWakefulService(context, intent);
                }
                if (startWakefulService != null) {
                    Log.e("GcmReceiver", "Error while delivering the message: ServiceIntent not found.");
                    if (isOrderedBroadcast()) {
                        setResultCode(404);
                    }
                } else if (isOrderedBroadcast()) {
                    setResultCode(-1);
                }
            }
        }
        Log.e("GcmReceiver", "Failed to resolve target intent service, skipping classname enforcement");
        try {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                startWakefulService = WakefulBroadcastReceiver.startWakefulService(context, intent);
            } else {
                startWakefulService = context.startService(intent);
                Log.d("GcmReceiver", "Missing wake lock permission, service start may be delayed");
            }
            if (startWakefulService != null) {
                Log.e("GcmReceiver", "Error while delivering the message: ServiceIntent not found.");
                if (isOrderedBroadcast()) {
                    setResultCode(404);
                }
            } else if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
        } catch (Throwable e) {
            Log.e("GcmReceiver", "Error while delivering the message to the serviceIntent", e);
            if (isOrderedBroadcast()) {
                setResultCode(401);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (Log.isLoggable("GcmReceiver", 3)) {
            Log.d("GcmReceiver", "received new intent");
        }
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra(ManagerWebServices.PARAM_FROM);
        if ("google.com/iid".equals(stringExtra) || "gcm.googleapis.com/refresh".equals(stringExtra)) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        stringExtra = intent.getStringExtra("gcm.rawData64");
        int i = 0;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if (C2526k.m9218i() && context.getApplicationInfo().targetSdkVersion > 25) {
            i = 1;
        }
        if (i != 0) {
            if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
            m14466a(context, intent.getAction()).m9310a(intent, goAsync());
            return;
        }
        boolean equals = "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction());
        m14467a(context, intent);
        if (isOrderedBroadcast() && getResultCode() == 0) {
            setResultCode(-1);
        }
    }
}
