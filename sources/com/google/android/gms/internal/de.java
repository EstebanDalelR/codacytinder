package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@zzzv
public final class de {
    /* renamed from: a */
    private final AtomicReference<ThreadPoolExecutor> f15943a = new AtomicReference(null);
    /* renamed from: b */
    private final Object f15944b = new Object();
    @Nullable
    /* renamed from: c */
    private String f15945c = null;
    /* renamed from: d */
    private AtomicBoolean f15946d = new AtomicBoolean(false);
    /* renamed from: e */
    private final AtomicInteger f15947e = new AtomicInteger(-1);
    /* renamed from: f */
    private final AtomicReference<Object> f15948f = new AtomicReference(null);
    /* renamed from: g */
    private final AtomicReference<Object> f15949g = new AtomicReference(null);
    /* renamed from: h */
    private ConcurrentMap<String, Method> f15950h = new ConcurrentHashMap(9);

    /* renamed from: a */
    private static Bundle m19585a(Context context, String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (Throwable e) {
            String str2 = "Invalid event ID: ";
            str = String.valueOf(str);
            hx.m19912b(str.length() == 0 ? new String(str2) : str2.concat(str), e);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    /* renamed from: a */
    private final Object m19586a(String str, Context context) {
        if (!m19589a(context, "com.google.android.gms.measurement.AppMeasurement", this.f15948f, true)) {
            return null;
        }
        try {
            return m19592h(context, str).invoke(this.f15948f.get(), new Object[0]);
        } catch (Exception e) {
            m19588a(e, str, true);
            return null;
        }
    }

    /* renamed from: a */
    private final void m19587a(Context context, String str, Bundle bundle) {
        if (m19598a(context) && m19589a(context, "com.google.android.gms.measurement.AppMeasurement", this.f15948f, true)) {
            Method k = m19594k(context);
            try {
                k.invoke(this.f15948f.get(), new Object[]{"am", str, bundle});
            } catch (Exception e) {
                m19588a(e, "logEventInternal", true);
            }
        }
    }

    /* renamed from: a */
    private final void m19588a(Exception exception, String str, boolean z) {
        if (!this.f15946d.get()) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 30);
            stringBuilder.append("Invoke Firebase method ");
            stringBuilder.append(str);
            stringBuilder.append(" error.");
            hx.m19916e(stringBuilder.toString());
            if (z) {
                hx.m19916e("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f15946d.set(true);
            }
        }
    }

    /* renamed from: a */
    private final boolean m19589a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{context}));
            return true;
        } catch (Exception e) {
            m19588a(e, "getInstance", z);
            return false;
        }
    }

    /* renamed from: b */
    private final void m19590b(Context context, String str, String str2) {
        if (m19589a(context, "com.google.android.gms.measurement.AppMeasurement", this.f15948f, true)) {
            Method g = m19591g(context, str2);
            try {
                g.invoke(this.f15948f.get(), new Object[]{str});
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 37) + String.valueOf(str).length());
                stringBuilder.append("Invoke Firebase method ");
                stringBuilder.append(str2);
                stringBuilder.append(", Ad Unit Id: ");
                stringBuilder.append(str);
                ec.m27332a(stringBuilder.toString());
            } catch (Exception e) {
                m19588a(e, str2, false);
            }
        }
    }

    /* renamed from: g */
    private final Method m19591g(Context context, String str) {
        Method method = (Method) this.f15950h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.f15950h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m19588a(e, str, false);
            return null;
        }
    }

    /* renamed from: h */
    private final Method m19592h(Context context, String str) {
        Method method = (Method) this.f15950h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f15950h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m19588a(e, str, false);
            return null;
        }
    }

    /* renamed from: i */
    private final Method m19593i(Context context, String str) {
        Method method = (Method) this.f15950h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.f15950h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m19588a(e, str, false);
            return null;
        }
    }

    /* renamed from: k */
    private final Method m19594k(Context context) {
        Method method = (Method) this.f15950h.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.f15950h.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m19588a(e, "logEventInternal", true);
            return null;
        }
    }

    /* renamed from: a */
    public final void m19595a(Context context, String str) {
        if (m19598a(context)) {
            m19590b(context, str, "beginAdUnitExposure");
        }
    }

    /* renamed from: a */
    public final void m19596a(Context context, String str, String str2) {
        if (m19598a(context)) {
            m19587a(context, str, m19585a(context, str2, "_ac".equals(str)));
        }
    }

    /* renamed from: a */
    public final void m19597a(Context context, String str, String str2, String str3, int i) {
        if (m19598a(context)) {
            Bundle a = m19585a(context, str, false);
            a.putString("_ai", str2);
            a.putString("type", str3);
            a.putInt("value", i);
            m19587a(context, "_ar", a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str3).length() + 75);
            stringBuilder.append("Log a Firebase reward video event, reward type: ");
            stringBuilder.append(str3);
            stringBuilder.append(", reward value: ");
            stringBuilder.append(i);
            ec.m27332a(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final boolean m19598a(Context context) {
        if (!((Boolean) aja.m19221f().m19334a(alo.af)).booleanValue() || this.f15946d.get()) {
            return false;
        }
        if (this.f15947e.get() == -1) {
            aja.m19216a();
            if (!hn.m19877c(context)) {
                aja.m19216a();
                if (hn.m19880f(context)) {
                    hx.m19916e("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    this.f15947e.set(0);
                }
            }
            this.f15947e.set(1);
        }
        return this.f15947e.get() == 1;
    }

    /* renamed from: b */
    public final void m19599b(Context context, String str) {
        if (m19598a(context)) {
            m19590b(context, str, "endAdUnitExposure");
        }
    }

    /* renamed from: b */
    public final boolean m19600b(Context context) {
        return ((Boolean) aja.m19221f().m19334a(alo.ag)).booleanValue() && m19598a(context);
    }

    /* renamed from: c */
    public final void m19601c(Context context, String str) {
        if (m19598a(context) && (context instanceof Activity) && m19589a(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f15949g, false)) {
            Method i = m19593i(context, "setCurrentScreen");
            try {
                Activity activity = (Activity) context;
                i.invoke(this.f15949g.get(), new Object[]{activity, str, context.getPackageName()});
            } catch (Exception e) {
                m19588a(e, "setCurrentScreen", false);
            }
        }
    }

    /* renamed from: c */
    public final boolean m19602c(Context context) {
        return ((Boolean) aja.m19221f().m19334a(alo.ah)).booleanValue() && m19598a(context);
    }

    /* renamed from: d */
    public final void m19603d(Context context, String str) {
        m19596a(context, "_ac", str);
    }

    /* renamed from: d */
    public final boolean m19604d(Context context) {
        return ((Boolean) aja.m19221f().m19334a(alo.ai)).booleanValue() && m19598a(context);
    }

    /* renamed from: e */
    public final void m19605e(Context context, String str) {
        m19596a(context, "_ai", str);
    }

    /* renamed from: e */
    public final boolean m19606e(Context context) {
        return ((Boolean) aja.m19221f().m19334a(alo.aj)).booleanValue() && m19598a(context);
    }

    /* renamed from: f */
    public final String m19607f(Context context) {
        if (!m19598a(context)) {
            return "";
        }
        if (!m19589a(context, "com.google.android.gms.measurement.AppMeasurement", this.f15948f, true)) {
            return "";
        }
        try {
            String str = (String) m19592h(context, "getCurrentScreenName").invoke(this.f15948f.get(), new Object[0]);
            if (str == null) {
                str = (String) m19592h(context, "getCurrentScreenClass").invoke(this.f15948f.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception e) {
            m19588a(e, "getCurrentScreenName", false);
            return "";
        }
    }

    /* renamed from: f */
    public final void m19608f(Context context, String str) {
        m19596a(context, "_aq", str);
    }

    @Nullable
    /* renamed from: g */
    public final String m19609g(Context context) {
        if (!m19598a(context)) {
            return null;
        }
        synchronized (this.f15944b) {
            if (this.f15945c != null) {
                String str = this.f15945c;
                return str;
            }
            this.f15945c = (String) m19586a("getGmpAppId", context);
            str = this.f15945c;
            return str;
        }
    }

    @Nullable
    /* renamed from: h */
    public final String m19610h(Context context) {
        if (!m19598a(context)) {
            return null;
        }
        long longValue = ((Long) aja.m19221f().m19334a(alo.ap)).longValue();
        if (longValue < 0) {
            return (String) m19586a("getAppInstanceId", context);
        }
        if (this.f15943a.get() == null) {
            this.f15943a.compareAndSet(null, new ThreadPoolExecutor(((Integer) aja.m19221f().m19334a(alo.aq)).intValue(), ((Integer) aja.m19221f().m19334a(alo.aq)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new dg(this)));
        }
        Future submit = ((ThreadPoolExecutor) this.f15943a.get()).submit(new df(this, context));
        try {
            return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            submit.cancel(true);
            return e instanceof TimeoutException ? "TIME_OUT" : null;
        }
    }

    @Nullable
    /* renamed from: i */
    public final String m19611i(Context context) {
        if (!m19598a(context)) {
            return null;
        }
        Object a = m19586a("generateEventId", context);
        return a != null ? a.toString() : null;
    }

    /* renamed from: j */
    final /* synthetic */ String m19612j(Context context) throws Exception {
        return (String) m19586a("getAppInstanceId", context);
    }
}
