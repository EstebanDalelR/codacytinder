package com.google.android.gms.ads.internal.gmsg;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.tb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.d */
public final class C2376d {
    /* renamed from: a */
    private final Context f7238a;
    /* renamed from: b */
    private final tb f7239b;
    /* renamed from: c */
    private final View f7240c;

    public C2376d(Context context, tb tbVar, View view) {
        this.f7238a = context;
        this.f7239b = tbVar;
        this.f7240c = view;
    }

    /* renamed from: a */
    private static Intent m8707a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    /* renamed from: a */
    private static Intent m8708a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    /* renamed from: a */
    private final ResolveInfo m8709a(Intent intent) {
        return m8710a(intent, new ArrayList());
    }

    /* renamed from: a */
    private final ResolveInfo m8710a(Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = this.f7238a.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            Collection queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) queryIntentActivities.get(i);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            ar.m8652i().a(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
            return null;
        }
    }

    /* renamed from: a */
    public final Intent m8711a(Map<String, String> map) {
        ActivityManager activityManager = (ActivityManager) this.f7238a.getSystemService("activity");
        String str = (String) map.get("u");
        Uri uri = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj;
        Builder buildUpon;
        String str2;
        ArrayList arrayList;
        Intent a;
        Intent a2;
        ResolveInfo a3;
        Intent a4;
        List<RunningAppProcessInfo> runningAppProcesses;
        ArrayList arrayList2;
        int size;
        int i;
        Object obj2;
        ResolveInfo resolveInfo;
        ar.m8648e();
        Uri parse = Uri.parse(fk.a(this.f7238a, this.f7239b, str, this.f7240c, null));
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
        boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
        if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
            if (!((Boolean) aja.f().a(alo.cw)).booleanValue()) {
                obj = null;
                if ("http".equalsIgnoreCase(parse.getScheme())) {
                    if ("https".equalsIgnoreCase(parse.getScheme())) {
                        buildUpon = parse.buildUpon();
                        str2 = "http";
                    }
                    arrayList = new ArrayList();
                    a = C2376d.m8708a(parse);
                    a2 = C2376d.m8708a(uri);
                    if (obj != null) {
                        ar.m8648e();
                        fk.b(this.f7238a, a);
                        ar.m8648e();
                        fk.b(this.f7238a, a2);
                    }
                    a3 = m8710a(a, arrayList);
                    if (a3 == null) {
                        return C2376d.m8707a(a, a3);
                    }
                    if (a2 != null) {
                        a3 = m8709a(a2);
                        if (a3 != null) {
                            a4 = C2376d.m8707a(a, a3);
                            if (m8709a(a4) != null) {
                                return a4;
                            }
                        }
                    }
                    if (arrayList.size() != 0) {
                        return a;
                    }
                    if (parseBoolean2 && activityManager != null) {
                        runningAppProcesses = activityManager.getRunningAppProcesses();
                        if (runningAppProcesses != null) {
                            arrayList2 = arrayList;
                            size = arrayList2.size();
                            i = 0;
                            while (i < size) {
                                obj2 = arrayList2.get(i);
                                i++;
                                resolveInfo = (ResolveInfo) obj2;
                                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                    if (runningAppProcessInfo.processName.equals(resolveInfo.activityInfo.packageName)) {
                                        return C2376d.m8707a(a, resolveInfo);
                                    }
                                }
                            }
                        }
                    }
                    return parseBoolean ? C2376d.m8707a(a, (ResolveInfo) arrayList.get(0)) : a;
                } else {
                    buildUpon = parse.buildUpon();
                    str2 = "https";
                }
                uri = buildUpon.scheme(str2).build();
                arrayList = new ArrayList();
                a = C2376d.m8708a(parse);
                a2 = C2376d.m8708a(uri);
                if (obj != null) {
                    ar.m8648e();
                    fk.b(this.f7238a, a);
                    ar.m8648e();
                    fk.b(this.f7238a, a2);
                }
                a3 = m8710a(a, arrayList);
                if (a3 == null) {
                    return C2376d.m8707a(a, a3);
                }
                if (a2 != null) {
                    a3 = m8709a(a2);
                    if (a3 != null) {
                        a4 = C2376d.m8707a(a, a3);
                        if (m8709a(a4) != null) {
                            return a4;
                        }
                    }
                }
                if (arrayList.size() != 0) {
                    return a;
                }
                runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    arrayList2 = arrayList;
                    size = arrayList2.size();
                    i = 0;
                    while (i < size) {
                        obj2 = arrayList2.get(i);
                        i++;
                        resolveInfo = (ResolveInfo) obj2;
                        while (r8.hasNext()) {
                            if (runningAppProcessInfo.processName.equals(resolveInfo.activityInfo.packageName)) {
                                return C2376d.m8707a(a, resolveInfo);
                            }
                        }
                    }
                }
                if (parseBoolean) {
                }
            }
        }
        obj = 1;
        if ("http".equalsIgnoreCase(parse.getScheme())) {
            if ("https".equalsIgnoreCase(parse.getScheme())) {
                buildUpon = parse.buildUpon();
                str2 = "http";
            }
            arrayList = new ArrayList();
            a = C2376d.m8708a(parse);
            a2 = C2376d.m8708a(uri);
            if (obj != null) {
                ar.m8648e();
                fk.b(this.f7238a, a);
                ar.m8648e();
                fk.b(this.f7238a, a2);
            }
            a3 = m8710a(a, arrayList);
            if (a3 == null) {
                return C2376d.m8707a(a, a3);
            }
            if (a2 != null) {
                a3 = m8709a(a2);
                if (a3 != null) {
                    a4 = C2376d.m8707a(a, a3);
                    if (m8709a(a4) != null) {
                        return a4;
                    }
                }
            }
            if (arrayList.size() != 0) {
                return a;
            }
            runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                arrayList2 = arrayList;
                size = arrayList2.size();
                i = 0;
                while (i < size) {
                    obj2 = arrayList2.get(i);
                    i++;
                    resolveInfo = (ResolveInfo) obj2;
                    while (r8.hasNext()) {
                        if (runningAppProcessInfo.processName.equals(resolveInfo.activityInfo.packageName)) {
                            return C2376d.m8707a(a, resolveInfo);
                        }
                    }
                }
            }
            if (parseBoolean) {
            }
        }
        buildUpon = parse.buildUpon();
        str2 = "https";
        uri = buildUpon.scheme(str2).build();
        arrayList = new ArrayList();
        a = C2376d.m8708a(parse);
        a2 = C2376d.m8708a(uri);
        if (obj != null) {
            ar.m8648e();
            fk.b(this.f7238a, a);
            ar.m8648e();
            fk.b(this.f7238a, a2);
        }
        a3 = m8710a(a, arrayList);
        if (a3 == null) {
            return C2376d.m8707a(a, a3);
        }
        if (a2 != null) {
            a3 = m8709a(a2);
            if (a3 != null) {
                a4 = C2376d.m8707a(a, a3);
                if (m8709a(a4) != null) {
                    return a4;
                }
            }
        }
        if (arrayList.size() != 0) {
            return a;
        }
        runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            arrayList2 = arrayList;
            size = arrayList2.size();
            i = 0;
            while (i < size) {
                obj2 = arrayList2.get(i);
                i++;
                resolveInfo = (ResolveInfo) obj2;
                while (r8.hasNext()) {
                    if (runningAppProcessInfo.processName.equals(resolveInfo.activityInfo.packageName)) {
                        return C2376d.m8707a(a, resolveInfo);
                    }
                }
            }
        }
        if (parseBoolean) {
        }
    }
}
