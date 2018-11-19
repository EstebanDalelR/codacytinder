package com.facebook.accountkit.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.accountkit.internal.r */
final class C1244r {
    /* renamed from: a */
    private static AtomicBoolean f3341a = new AtomicBoolean(false);
    /* renamed from: b */
    private static List<C1242q> f3342b = Arrays.asList(new C1242q[]{new C3175b(), new C3176c(), new C3174a()});

    /* renamed from: com.facebook.accountkit.internal.r$1 */
    static class C12431 implements Runnable {
        C12431() {
        }

        public void run() {
            try {
                for (C1242q a : C1244r.f3342b) {
                    a.m4438a(true);
                }
            } finally {
                C1244r.f3341a.set(false);
            }
        }
    }

    /* renamed from: com.facebook.accountkit.internal.r$a */
    private static class C3174a extends C1242q {
        /* renamed from: a */
        protected String mo1591a() {
            return "com.facebook.lite";
        }

        private C3174a() {
        }

        /* renamed from: b */
        protected Intent mo1592b() {
            return new Intent("com.facebook.lite.platform.PLATFORM_SERVICE").setPackage(mo1591a());
        }
    }

    /* renamed from: com.facebook.accountkit.internal.r$b */
    private static class C3175b extends C1242q {
        /* renamed from: a */
        protected String mo1591a() {
            return "com.facebook.katana";
        }

        private C3175b() {
        }

        /* renamed from: b */
        protected Intent mo1592b() {
            return new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(mo1591a());
        }
    }

    /* renamed from: com.facebook.accountkit.internal.r$c */
    private static class C3176c extends C1242q {
        /* renamed from: a */
        protected String mo1591a() {
            return "com.facebook.wakizashi";
        }

        private C3176c() {
        }

        /* renamed from: b */
        protected Intent mo1592b() {
            return new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(mo1591a());
        }
    }

    /* renamed from: a */
    static boolean m4445a() {
        for (C1242q c : f3342b) {
            if (c.m4441c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m4446a(int i) {
        for (C1242q d : f3342b) {
            if (d.m4442d().contains(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    static void m4447b() {
        if (f3341a.compareAndSet(false, true)) {
            C1251w.m4502b().execute(new C12431());
        }
    }

    /* renamed from: a */
    static Intent m4443a(Context context) {
        for (C1242q c1242q : f3342b) {
            Intent a = C1244r.m4444a(context, c1242q.mo1592b().addCategory("android.intent.category.DEFAULT"), c1242q);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Intent m4444a(Context context, Intent intent, C1242q c1242q) {
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || c1242q.m4439a(context, resolveService.serviceInfo.packageName) == null) {
            return null;
        }
        return intent;
    }
}
