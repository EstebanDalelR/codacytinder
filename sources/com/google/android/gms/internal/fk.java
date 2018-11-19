package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PowerManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.util.C2526k;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
public final class fk {
    /* renamed from: a */
    public static final Handler f16060a = new ed(Looper.getMainLooper());
    /* renamed from: b */
    private final Object f16061b = new Object();
    /* renamed from: c */
    private boolean f16062c = true;
    /* renamed from: d */
    private String f16063d;
    /* renamed from: e */
    private boolean f16064e = false;
    /* renamed from: f */
    private boolean f16065f = false;
    /* renamed from: g */
    private Pattern f16066g;
    /* renamed from: h */
    private Pattern f16067h;

    /* renamed from: a */
    public static Bitmap m19679a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    /* renamed from: a */
    public static Uri m19680a(String str, String str2, String str3) throws UnsupportedOperationException {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        indexOf++;
        StringBuilder stringBuilder = new StringBuilder(str.substring(0, indexOf));
        stringBuilder.append(str2);
        stringBuilder.append("=");
        stringBuilder.append(str3);
        stringBuilder.append("&");
        stringBuilder.append(str.substring(indexOf));
        return Uri.parse(stringBuilder.toString());
    }

    /* renamed from: a */
    public static Bundle m19681a(ags ags) {
        if (ags == null) {
            return null;
        }
        if (!((Boolean) aja.m19221f().m19334a(alo.f15439Q)).booleanValue()) {
            if (!((Boolean) aja.m19221f().m19334a(alo.f15441S)).booleanValue()) {
                return null;
            }
        }
        if (ar.i().m27299a() && ar.i().m27303b()) {
            return null;
        }
        String b;
        String c;
        String d;
        if (ags.m19154d()) {
            ags.m19153c();
        }
        agn b2 = ags.m19152b();
        if (b2 != null) {
            b = b2.m19118b();
            c = b2.m19120c();
            d = b2.m19121d();
            if (b != null) {
                ar.i().m27291a(b);
            }
            if (d != null) {
                ar.i().m27301b(d);
            }
        } else {
            b = ar.i().m27309g();
            d = ar.i().m27310h();
            c = null;
        }
        Bundle bundle = new Bundle(1);
        if (d != null) {
            if (((Boolean) aja.m19221f().m19334a(alo.f15441S)).booleanValue() && !ar.i().m27303b()) {
                bundle.putString("v_fp_vertical", d);
            }
        }
        if (b != null) {
            if (((Boolean) aja.m19221f().m19334a(alo.f15439Q)).booleanValue() && !ar.i().m27299a()) {
                bundle.putString("fingerprint", b);
                if (!b.equals(c)) {
                    bundle.putString("v_fp", c);
                }
            }
        }
        return !bundle.isEmpty() ? bundle : null;
    }

    /* renamed from: a */
    public static DisplayMetrics m19682a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: a */
    public static PopupWindow m19683a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    /* renamed from: a */
    public static String m19685a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static String m19686a(Context context, View view, zzjn zzjn) {
        if (!((Boolean) aja.m19221f().m19334a(alo.ae)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", zzjn.width);
            jSONObject2.put("height", zzjn.height);
            jSONObject.put(ManagerWebServices.PARAM_SIZE, jSONObject2);
            jSONObject.put("activity", m19744p(context));
            if (!zzjn.zzbel) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (Throwable e) {
            hx.m19914c("Fail to get view hierarchy json", e);
            return null;
        }
    }

    /* renamed from: a */
    public static java.lang.String m19687a(android.content.Context r2, com.google.android.gms.internal.tb r3, java.lang.String r4, android.view.View r5, android.app.Activity r6) {
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
        if (r3 != 0) goto L_0x0003;
    L_0x0002:
        return r4;
    L_0x0003:
        r0 = android.net.Uri.parse(r4);	 Catch:{ Exception -> 0x0016 }
        r1 = r3.m20183b(r0);	 Catch:{ Exception -> 0x0016 }
        if (r1 == 0) goto L_0x0011;	 Catch:{ Exception -> 0x0016 }
    L_0x000d:
        r0 = r3.m20179a(r0, r2, r5, r6);	 Catch:{ Exception -> 0x0016 }
    L_0x0011:
        r2 = r0.toString();	 Catch:{ Exception -> 0x0016 }
        return r2;
    L_0x0016:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fk.a(android.content.Context, com.google.android.gms.internal.tb, java.lang.String, android.view.View, android.app.Activity):java.lang.String");
    }

    /* renamed from: a */
    public static String m19689a(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder(8192);
        char[] cArr = new char[ItemAnimator.FLAG_MOVED];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return stringBuilder.toString();
            }
            stringBuilder.append(cArr, 0, read);
        }
    }

    /* renamed from: a */
    public static String m19690a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    /* renamed from: a */
    public static Map<String, String> m19691a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Map hashMap = new HashMap();
        for (String str : ar.g().mo6864a(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    /* renamed from: a */
    private final JSONArray m19692a(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m19701a(jSONArray, a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private final JSONObject m19693a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m19702a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m19694a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: a */
    public static void m19695a(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
        }
    }

    /* renamed from: a */
    public static void m19696a(android.content.Context r1, android.content.Intent r2) {
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
        r1.startActivity(r2);	 Catch:{ Throwable -> 0x0004 }
        return;
    L_0x0004:
        r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r2.addFlags(r0);
        r1.startActivity(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fk.a(android.content.Context, android.content.Intent):void");
    }

    @TargetApi(18)
    /* renamed from: a */
    public static void m19697a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            if (((Boolean) aja.m19221f().m19334a(alo.cv)).booleanValue()) {
                m19716b(context, intent);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(uri2).length() + 26);
            stringBuilder.append("Opening ");
            stringBuilder.append(uri2);
            stringBuilder.append(" in a new browser.");
            hx.m19911b(stringBuilder.toString());
        } catch (Throwable e) {
            hx.m19912b("No browser is found.", e);
        }
    }

    /* renamed from: a */
    public static void m19698a(Context context, String str, List<String> list) {
        for (String hdVar : list) {
            new hd(context, str, hdVar).zznd();
        }
    }

    /* renamed from: a */
    public static void m19699a(zzjj zzjj, boolean z) {
        Bundle bundle = zzjj.zzbdp != null ? zzjj.zzbdp : new Bundle();
        if (bundle.getBundle(AdMobAdapter.class.getName()) != null) {
            bundle = bundle.getBundle(AdMobAdapter.class.getName());
        } else {
            Bundle bundle2 = new Bundle();
            bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            bundle = bundle2;
        }
        bundle.putBoolean("render_test_label", true);
    }

    /* renamed from: a */
    public static void m19700a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f16060a.post(runnable);
        }
    }

    /* renamed from: a */
    private final void m19701a(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            obj = m19693a((Bundle) obj);
        } else if (obj instanceof Map) {
            obj = m19748a((Map) obj);
        } else if (obj instanceof Collection) {
            obj = m19692a((Collection) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray();
            for (Object a : objArr) {
                m19701a(jSONArray2, a);
            }
            jSONArray.put(jSONArray2);
            return;
        } else {
            jSONArray.put(obj);
            return;
        }
        jSONArray.put(obj);
    }

    /* renamed from: a */
    private final void m19702a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            obj = m19693a((Bundle) obj);
        } else if (obj instanceof Map) {
            obj = m19748a((Map) obj);
        } else {
            Collection collection;
            if (obj instanceof Collection) {
                if (str == null) {
                    str = ManagerWebServices.NULL_STRING_VALUE;
                }
                collection = (Collection) obj;
            } else if (obj instanceof Object[]) {
                collection = Arrays.asList((Object[]) obj);
            } else {
                jSONObject.put(str, obj);
                return;
            }
            obj = m19692a(collection);
        }
        jSONObject.put(str, obj);
    }

    /* renamed from: a */
    private static boolean m19703a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @TargetApi(24)
    /* renamed from: a */
    public static boolean m19704a(Activity activity, Configuration configuration) {
        aja.m19216a();
        int a = hn.m19861a((Context) activity, configuration.screenHeightDp);
        int a2 = hn.m19861a((Context) activity, configuration.screenWidthDp);
        DisplayMetrics a3 = m19682a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a3.heightPixels;
        int i2 = a3.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        identifier = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) aja.m19221f().m19334a(alo.cF)).intValue();
        return m19703a(i, a + identifier, round) && m19703a(i2, a2, round);
    }

    /* renamed from: a */
    public static boolean m19705a(Context context) {
        String format;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity != null) {
            if (resolveActivity.activityInfo != null) {
                boolean z;
                String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
                if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
                    hx.m19916e(String.format(str, new Object[]{"keyboard"}));
                    z = false;
                } else {
                    z = true;
                }
                if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
                    hx.m19916e(String.format(str, new Object[]{"keyboardHidden"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                    hx.m19916e(String.format(str, new Object[]{"orientation"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
                    hx.m19916e(String.format(str, new Object[]{"screenLayout"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
                    hx.m19916e(String.format(str, new Object[]{"uiMode"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
                    hx.m19916e(String.format(str, new Object[]{"screenSize"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & ItemAnimator.FLAG_MOVED) != 0) {
                    return z;
                }
                format = String.format(str, new Object[]{"smallestScreenSize"});
                hx.m19916e(format);
                return false;
            }
        }
        format = "Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.";
        hx.m19916e(format);
        return false;
    }

    /* renamed from: a */
    public static boolean m19706a(Context context, String str, String str2) {
        return pl.m20131a(context).m20125a(str2, str) == 0;
    }

    /* renamed from: a */
    public static boolean m19708a(zzjj zzjj) {
        Bundle bundle = zzjj.zzbdp != null ? zzjj.zzbdp : new Bundle();
        return (bundle.getBundle(AdMobAdapter.class.getName()) != null ? bundle.getBundle(AdMobAdapter.class.getName()) : new Bundle()).getBoolean("render_test_label", false);
    }

    /* renamed from: a */
    public static boolean m19709a(java.lang.ClassLoader r1, java.lang.Class<?> r2, java.lang.String r3) {
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
        r0 = 0;
        r1 = java.lang.Class.forName(r3, r0, r1);	 Catch:{ Throwable -> 0x000a }
        r1 = r2.isAssignableFrom(r1);	 Catch:{ Throwable -> 0x000a }
        return r1;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fk.a(java.lang.ClassLoader, java.lang.Class, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static int[] m19710a(Activity activity) {
        Window window = activity.getWindow();
        if (window == null || window.findViewById(16908290) == null) {
            return m19735g();
        }
        return new int[]{window.findViewById(16908290).getWidth(), window.findViewById(16908290).getHeight()};
    }

    /* renamed from: b */
    public static int m19711b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            str = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
            stringBuilder.append("Could not parse value:");
            stringBuilder.append(str);
            hx.m19916e(stringBuilder.toString());
            return 0;
        }
    }

    /* renamed from: b */
    public static Bitmap m19712b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap f = m19729f(view);
        if (f == null) {
            f = m19727e(view);
        }
        return f;
    }

    /* renamed from: b */
    public static String m19713b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public static java.lang.String m19714b(android.content.Context r1, java.lang.String r2) {
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
        r1 = r1.openFileInput(r2);	 Catch:{ IOException -> 0x0011 }
        r2 = new java.lang.String;	 Catch:{ IOException -> 0x0011 }
        r0 = 1;	 Catch:{ IOException -> 0x0011 }
        r1 = com.google.android.gms.common.util.C2523h.a(r1, r0);	 Catch:{ IOException -> 0x0011 }
        r0 = "UTF-8";	 Catch:{ IOException -> 0x0011 }
        r2.<init>(r1, r0);	 Catch:{ IOException -> 0x0011 }
        return r2;
    L_0x0011:
        r1 = "Error reading from internal storage.";
        com.google.android.gms.internal.hx.m19911b(r1);
        r1 = "";
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fk.b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static void m19715b(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
    }

    @TargetApi(18)
    /* renamed from: b */
    public static void m19716b(Context context, Intent intent) {
        if (intent != null && C2526k.d()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    /* renamed from: b */
    public static void m19717b(Context context, String str, String str2) {
        List arrayList = new ArrayList();
        arrayList.add(str2);
        m19698a(context, str, arrayList);
    }

    /* renamed from: b */
    public static void m19718b(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            fe.m19676a(runnable);
        }
    }

    /* renamed from: c */
    public static float m19719c() {
        return ar.B().m19787a();
    }

    /* renamed from: c */
    public static void m19720c(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Throwable e) {
            hx.m19912b("Error writing to file in internal storage.", e);
        }
    }

    /* renamed from: c */
    public static boolean m19721c(View view) {
        Activity activity;
        Window window;
        view = view.getRootView();
        LayoutParams layoutParams = null;
        if (view != null) {
            Context context = view.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity == null) {
                    return false;
                }
                window = activity.getWindow();
                if (window == null) {
                    layoutParams = window.getAttributes();
                }
                return layoutParams == null && (layoutParams.flags & 524288) != 0;
            }
        }
        activity = null;
        if (activity == null) {
            return false;
        }
        window = activity.getWindow();
        if (window == null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams == null) {
        }
    }

    /* renamed from: c */
    public static boolean m19722c(String str) {
        return TextUtils.isEmpty(str) ? false : str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* renamed from: d */
    public static int m19723d(@Nullable View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        return parent == null ? -1 : ((AdapterView) parent).getPositionForView(view);
    }

    /* renamed from: d */
    protected static java.lang.String m19724d(android.content.Context r1) {
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
        r0 = new android.webkit.WebView;	 Catch:{ Throwable -> 0x000e }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x000e }
        r1 = r0.getSettings();	 Catch:{ Throwable -> 0x000e }
        r1 = r1.getUserAgentString();	 Catch:{ Throwable -> 0x000e }
        return r1;
    L_0x000e:
        r1 = m19731f();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fk.d(android.content.Context):java.lang.String");
    }

    /* renamed from: d */
    public static boolean m19725d() {
        return ar.B().m19790b();
    }

    /* renamed from: e */
    public static Builder m19726e(Context context) {
        return new Builder(context);
    }

    /* renamed from: e */
    private static Bitmap m19727e(@NonNull View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            hx.m19916e("Width or height of view is zero");
            return null;
        } catch (Throwable e) {
            hx.m19912b("Fail to capture the webview", e);
            return null;
        }
    }

    /* renamed from: e */
    public static Bundle m19728e() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) aja.m19221f().m19334a(alo.f15474y)).booleanValue()) {
                Parcelable memoryInfo = new MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (((Boolean) aja.m19221f().m19334a(alo.f15475z)).booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
            bundle.putInt("web_view_count", ar.i().m27327y());
            return bundle;
        } catch (Throwable e) {
            hx.m19914c("Unable to gather memory stats", e);
            return bundle;
        }
    }

    /* renamed from: f */
    private static Bitmap m19729f(@NonNull View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
            return bitmap;
        } catch (Throwable e) {
            hx.m19912b("Fail to capture the web view", e);
            return null;
        }
    }

    /* renamed from: f */
    public static ala m19730f(Context context) {
        return new ala(context);
    }

    /* renamed from: f */
    private static String m19731f() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            stringBuffer.append(" ");
            stringBuffer.append(VERSION.RELEASE);
        }
        stringBuffer.append("; ");
        stringBuffer.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuffer.append("; ");
            stringBuffer.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuffer.append(" Build/");
                stringBuffer.append(Build.DISPLAY);
            }
        }
        stringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer.toString();
    }

    /* renamed from: f */
    public static String m19732f(String str) {
        return TextUtils.isEmpty(str) ? "" : str.split(";")[0].trim();
    }

    /* renamed from: g */
    public static String m19733g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split(";");
        if (split.length == 1) {
            return "";
        }
        for (int i = 1; i < split.length; i++) {
            if (split[i].trim().startsWith("charset")) {
                String[] split2 = split[i].trim().split("=");
                if (split2.length > 1) {
                    return split2[1].trim();
                }
            }
        }
        return "";
    }

    /* renamed from: g */
    public static boolean m19734g(android.content.Context r6) {
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
        r0 = 0;
        r1 = "activity";	 Catch:{ Throwable -> 0x0055 }
        r1 = r6.getSystemService(r1);	 Catch:{ Throwable -> 0x0055 }
        r1 = (android.app.ActivityManager) r1;	 Catch:{ Throwable -> 0x0055 }
        r2 = "keyguard";	 Catch:{ Throwable -> 0x0055 }
        r2 = r6.getSystemService(r2);	 Catch:{ Throwable -> 0x0055 }
        r2 = (android.app.KeyguardManager) r2;	 Catch:{ Throwable -> 0x0055 }
        if (r1 == 0) goto L_0x0055;	 Catch:{ Throwable -> 0x0055 }
    L_0x0013:
        if (r2 != 0) goto L_0x0016;	 Catch:{ Throwable -> 0x0055 }
    L_0x0015:
        return r0;	 Catch:{ Throwable -> 0x0055 }
    L_0x0016:
        r1 = r1.getRunningAppProcesses();	 Catch:{ Throwable -> 0x0055 }
        if (r1 != 0) goto L_0x001d;	 Catch:{ Throwable -> 0x0055 }
    L_0x001c:
        return r0;	 Catch:{ Throwable -> 0x0055 }
    L_0x001d:
        r1 = r1.iterator();	 Catch:{ Throwable -> 0x0055 }
    L_0x0021:
        r3 = r1.hasNext();	 Catch:{ Throwable -> 0x0055 }
        if (r3 == 0) goto L_0x0055;	 Catch:{ Throwable -> 0x0055 }
    L_0x0027:
        r3 = r1.next();	 Catch:{ Throwable -> 0x0055 }
        r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3;	 Catch:{ Throwable -> 0x0055 }
        r4 = android.os.Process.myPid();	 Catch:{ Throwable -> 0x0055 }
        r5 = r3.pid;	 Catch:{ Throwable -> 0x0055 }
        if (r4 != r5) goto L_0x0021;	 Catch:{ Throwable -> 0x0055 }
    L_0x0035:
        r1 = r3.importance;	 Catch:{ Throwable -> 0x0055 }
        r3 = 100;	 Catch:{ Throwable -> 0x0055 }
        if (r1 != r3) goto L_0x0055;	 Catch:{ Throwable -> 0x0055 }
    L_0x003b:
        r1 = r2.inKeyguardRestrictedInputMode();	 Catch:{ Throwable -> 0x0055 }
        if (r1 != 0) goto L_0x0055;	 Catch:{ Throwable -> 0x0055 }
    L_0x0041:
        r1 = "power";	 Catch:{ Throwable -> 0x0055 }
        r6 = r6.getSystemService(r1);	 Catch:{ Throwable -> 0x0055 }
        r6 = (android.os.PowerManager) r6;	 Catch:{ Throwable -> 0x0055 }
        if (r6 != 0) goto L_0x004d;	 Catch:{ Throwable -> 0x0055 }
    L_0x004b:
        r6 = 0;	 Catch:{ Throwable -> 0x0055 }
        goto L_0x0051;	 Catch:{ Throwable -> 0x0055 }
    L_0x004d:
        r6 = r6.isScreenOn();	 Catch:{ Throwable -> 0x0055 }
    L_0x0051:
        if (r6 == 0) goto L_0x0055;
    L_0x0053:
        r6 = 1;
        return r6;
    L_0x0055:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fk.g(android.content.Context):boolean");
    }

    /* renamed from: g */
    private static int[] m19735g() {
        return new int[]{0, 0};
    }

    /* renamed from: h */
    public static Bitmap m19736h(Context context) {
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            Bitmap f;
            if (((Boolean) aja.m19221f().m19334a(alo.bF)).booleanValue()) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    f = m19729f(window.getDecorView().getRootView());
                }
                return null;
            }
            f = m19727e(((Activity) context).getWindow().getDecorView());
            return f;
        } catch (Throwable e) {
            hx.m19912b("Fail to capture screen shot", e);
        }
    }

    /* renamed from: i */
    public static AudioManager m19737i(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: j */
    public static float m19738j(Context context) {
        AudioManager i = m19737i(context);
        if (i == null) {
            return 0.0f;
        }
        int streamMaxVolume = i.getStreamMaxVolume(3);
        return streamMaxVolume == 0 ? 0.0f : ((float) i.getStreamVolume(3)) / ((float) streamMaxVolume);
    }

    /* renamed from: k */
    public static int m19739k(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
    }

    @TargetApi(16)
    /* renamed from: l */
    public static boolean m19740l(Context context) {
        if (context == null || !C2526k.b()) {
            return false;
        }
        KeyguardManager q = m19745q(context);
        if (q != null && q.isKeyguardLocked()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m19741m(android.content.Context r3) {
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
        r0 = 0;
        r3 = r3.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x001b, Throwable -> 0x000b }
        r1 = "com.google.android.gms.ads.internal.ClientApi";	 Catch:{ ClassNotFoundException -> 0x001b, Throwable -> 0x000b }
        r3.loadClass(r1);	 Catch:{ ClassNotFoundException -> 0x001b, Throwable -> 0x000b }
        return r0;
    L_0x000b:
        r3 = move-exception;
        r1 = "Error loading class.";
        com.google.android.gms.internal.hx.m19912b(r1, r3);
        r1 = com.google.android.gms.ads.internal.ar.i();
        r2 = "AdUtil.isLiteSdk";
        r1.m27296a(r3, r2);
        return r0;
    L_0x001b:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fk.m(android.content.Context):boolean");
    }

    /* renamed from: n */
    public static int m19742n(Context context) {
        return DynamiteModule.b(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: o */
    public static int m19743o(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: p */
    private static java.lang.String m19744p(android.content.Context r2) {
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
        r0 = 0;
        r1 = "activity";	 Catch:{ Exception -> 0x002d }
        r2 = r2.getSystemService(r1);	 Catch:{ Exception -> 0x002d }
        r2 = (android.app.ActivityManager) r2;	 Catch:{ Exception -> 0x002d }
        if (r2 != 0) goto L_0x000c;	 Catch:{ Exception -> 0x002d }
    L_0x000b:
        return r0;	 Catch:{ Exception -> 0x002d }
    L_0x000c:
        r1 = 1;	 Catch:{ Exception -> 0x002d }
        r2 = r2.getRunningTasks(r1);	 Catch:{ Exception -> 0x002d }
        if (r2 == 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0013:
        r1 = r2.isEmpty();	 Catch:{ Exception -> 0x002d }
        if (r1 != 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0019:
        r1 = 0;	 Catch:{ Exception -> 0x002d }
        r2 = r2.get(r1);	 Catch:{ Exception -> 0x002d }
        r2 = (android.app.ActivityManager.RunningTaskInfo) r2;	 Catch:{ Exception -> 0x002d }
        if (r2 == 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0022:
        r1 = r2.topActivity;	 Catch:{ Exception -> 0x002d }
        if (r1 == 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0026:
        r2 = r2.topActivity;	 Catch:{ Exception -> 0x002d }
        r2 = r2.getClassName();	 Catch:{ Exception -> 0x002d }
        return r2;
    L_0x002d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fk.p(android.content.Context):java.lang.String");
    }

    @Nullable
    /* renamed from: q */
    private static KeyguardManager m19745q(Context context) {
        Object systemService = context.getSystemService("keyguard");
        return (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
    }

    /* renamed from: a */
    public final java.lang.String m19746a(android.content.Context r5, java.lang.String r6) {
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
        r4 = this;
        r0 = r4.f16061b;
        monitor-enter(r0);
        r1 = r4.f16063d;	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x000b;	 Catch:{ all -> 0x00d2 }
    L_0x0007:
        r5 = r4.f16063d;	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        return r5;	 Catch:{ all -> 0x00d2 }
    L_0x000b:
        if (r6 != 0) goto L_0x0013;	 Catch:{ all -> 0x00d2 }
    L_0x000d:
        r5 = m19731f();	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        return r5;
    L_0x0013:
        r1 = com.google.android.gms.ads.internal.ar.g();	 Catch:{ Exception -> 0x001d }
        r1 = r1.mo7668a(r5);	 Catch:{ Exception -> 0x001d }
        r4.f16063d = r1;	 Catch:{ Exception -> 0x001d }
    L_0x001d:
        r1 = r4.f16063d;	 Catch:{ all -> 0x00d2 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x006e;	 Catch:{ all -> 0x00d2 }
    L_0x0025:
        com.google.android.gms.internal.aja.m19216a();	 Catch:{ all -> 0x00d2 }
        r1 = com.google.android.gms.internal.hn.m19874b();	 Catch:{ all -> 0x00d2 }
        if (r1 != 0) goto L_0x0068;	 Catch:{ all -> 0x00d2 }
    L_0x002e:
        r1 = 0;	 Catch:{ all -> 0x00d2 }
        r4.f16063d = r1;	 Catch:{ all -> 0x00d2 }
        r1 = f16060a;	 Catch:{ all -> 0x00d2 }
        r2 = new com.google.android.gms.internal.fm;	 Catch:{ all -> 0x00d2 }
        r2.<init>(r4, r5);	 Catch:{ all -> 0x00d2 }
        r1.post(r2);	 Catch:{ all -> 0x00d2 }
    L_0x003b:
        r1 = r4.f16063d;	 Catch:{ all -> 0x00d2 }
        if (r1 != 0) goto L_0x006e;
    L_0x003f:
        r1 = r4.f16061b;	 Catch:{ InterruptedException -> 0x0045 }
        r1.wait();	 Catch:{ InterruptedException -> 0x0045 }
        goto L_0x003b;
    L_0x0045:
        r1 = m19731f();	 Catch:{ all -> 0x00d2 }
        r4.f16063d = r1;	 Catch:{ all -> 0x00d2 }
        r1 = "Interrupted, use default user agent: ";	 Catch:{ all -> 0x00d2 }
        r2 = r4.f16063d;	 Catch:{ all -> 0x00d2 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00d2 }
        r3 = r2.length();	 Catch:{ all -> 0x00d2 }
        if (r3 == 0) goto L_0x005e;	 Catch:{ all -> 0x00d2 }
    L_0x0059:
        r1 = r1.concat(r2);	 Catch:{ all -> 0x00d2 }
        goto L_0x0064;	 Catch:{ all -> 0x00d2 }
    L_0x005e:
        r2 = new java.lang.String;	 Catch:{ all -> 0x00d2 }
        r2.<init>(r1);	 Catch:{ all -> 0x00d2 }
        r1 = r2;	 Catch:{ all -> 0x00d2 }
    L_0x0064:
        com.google.android.gms.internal.hx.m19916e(r1);	 Catch:{ all -> 0x00d2 }
        goto L_0x003b;	 Catch:{ all -> 0x00d2 }
    L_0x0068:
        r1 = m19724d(r5);	 Catch:{ all -> 0x00d2 }
        r4.f16063d = r1;	 Catch:{ all -> 0x00d2 }
    L_0x006e:
        r1 = r4.f16063d;	 Catch:{ all -> 0x00d2 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00d2 }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00d2 }
        r2 = r2.length();	 Catch:{ all -> 0x00d2 }
        r2 = r2 + 10;	 Catch:{ all -> 0x00d2 }
        r3 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x00d2 }
        r3 = r3.length();	 Catch:{ all -> 0x00d2 }
        r2 = r2 + r3;	 Catch:{ all -> 0x00d2 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d2 }
        r3.<init>(r2);	 Catch:{ all -> 0x00d2 }
        r3.append(r1);	 Catch:{ all -> 0x00d2 }
        r1 = " (Mobile; ";	 Catch:{ all -> 0x00d2 }
        r3.append(r1);	 Catch:{ all -> 0x00d2 }
        r3.append(r6);	 Catch:{ all -> 0x00d2 }
        r6 = r3.toString();	 Catch:{ all -> 0x00d2 }
        r4.f16063d = r6;	 Catch:{ all -> 0x00d2 }
        r5 = com.google.android.gms.internal.pl.m20131a(r5);	 Catch:{ Exception -> 0x00b6 }
        r5 = r5.m20127a();	 Catch:{ Exception -> 0x00b6 }
        if (r5 == 0) goto L_0x00c0;	 Catch:{ Exception -> 0x00b6 }
    L_0x00a7:
        r5 = r4.f16063d;	 Catch:{ Exception -> 0x00b6 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ Exception -> 0x00b6 }
        r6 = ";aia";	 Catch:{ Exception -> 0x00b6 }
        r5 = r5.concat(r6);	 Catch:{ Exception -> 0x00b6 }
        r4.f16063d = r5;	 Catch:{ Exception -> 0x00b6 }
        goto L_0x00c0;
    L_0x00b6:
        r5 = move-exception;
        r6 = com.google.android.gms.ads.internal.ar.i();	 Catch:{ all -> 0x00d2 }
        r1 = "AdUtil.getUserAgent";	 Catch:{ all -> 0x00d2 }
        r6.m27296a(r5, r1);	 Catch:{ all -> 0x00d2 }
    L_0x00c0:
        r5 = r4.f16063d;	 Catch:{ all -> 0x00d2 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x00d2 }
        r6 = ")";	 Catch:{ all -> 0x00d2 }
        r5 = r5.concat(r6);	 Catch:{ all -> 0x00d2 }
        r4.f16063d = r5;	 Catch:{ all -> 0x00d2 }
        r5 = r4.f16063d;	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        return r5;	 Catch:{ all -> 0x00d2 }
    L_0x00d2:
        r5 = move-exception;	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fk.a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final JSONObject m19747a(@Nullable Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return m19693a(bundle);
            } catch (Throwable e) {
                hx.m19912b("Error converting Bundle to JSON", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final JSONObject m19748a(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m19702a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String str2 = "Could not convert map to JSON: ";
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    /* renamed from: a */
    public final void m19749a(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            ar.e();
            bundle.putString("device", m19713b());
            bundle.putString("eids", TextUtils.join(",", alo.m19336a()));
        }
        aja.m19216a();
        hn.m19867a(context, str, str2, bundle, z, new fn(this, context, str));
    }

    /* renamed from: a */
    public final void m19750a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(ManagerWebServices.TIMEOUT_AUTH_MS);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(ManagerWebServices.TIMEOUT_AUTH_MS);
        httpURLConnection.setRequestProperty("User-Agent", m19746a(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public final void m19751a(Context context, List<String> list) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!TextUtils.isEmpty(aff.m19099a(activity))) {
                if (list == null) {
                    ec.m27332a("Cannot ping urls: empty list.");
                } else if (amj.m27136a(context)) {
                    amj amj = new amj();
                    amj.m27138a(new fl(this, list, amj, context));
                    amj.m27140b(activity);
                } else {
                    ec.m27332a("Cannot ping url because custom tabs is not supported");
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean m19752a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m19753a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m19745q(context));
    }

    /* renamed from: a */
    public final boolean m19753a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        Object obj;
        Object obj2;
        if (!ar.e().f16062c) {
            if (keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode()) {
                if (!((Boolean) aja.m19221f().m19334a(alo.ba)).booleanValue() || !m19721c(view)) {
                    obj = null;
                    if (view.getVisibility() == 0 && view.isShown()) {
                        if (powerManager != null) {
                            if (powerManager.isScreenOn()) {
                                obj2 = null;
                                if (!(obj2 == null || r6 == null)) {
                                    if (((Boolean) aja.m19221f().m19334a(alo.aY)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                                        return true;
                                    }
                                }
                            }
                        }
                        obj2 = 1;
                        if (((Boolean) aja.m19221f().m19334a(alo.aY)).booleanValue()) {
                        }
                        return true;
                    }
                    return false;
                }
            }
        }
        obj = 1;
        if (powerManager != null) {
            if (powerManager.isScreenOn()) {
                obj2 = null;
                if (((Boolean) aja.m19221f().m19334a(alo.aY)).booleanValue()) {
                }
                return true;
            }
        }
        obj2 = 1;
        if (((Boolean) aja.m19221f().m19334a(alo.aY)).booleanValue()) {
        }
        return true;
    }

    /* renamed from: b */
    public final void m19754b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) aja.m19221f().m19334a(alo.bd)).booleanValue()) {
            m19749a(context, str, str2, bundle, z);
        }
    }

    /* renamed from: b */
    public final boolean m19755b(Context context) {
        if (this.f16064e) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new fp(), intentFilter);
        this.f16064e = true;
        return true;
    }

    /* renamed from: b */
    public final int[] m19756b(Activity activity) {
        int[] a = m19710a(activity);
        r1 = new int[2];
        aja.m19216a();
        r1[0] = hn.m19871b((Context) activity, a[0]);
        aja.m19216a();
        r1[1] = hn.m19871b((Context) activity, a[1]);
        return r1;
    }

    /* renamed from: c */
    public final boolean m19757c(Context context) {
        if (this.f16065f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new fo(), intentFilter);
        this.f16065f = true;
        return true;
    }

    /* renamed from: c */
    public final int[] m19758c(Activity activity) {
        Window window = activity.getWindow();
        int[] g = (window == null || window.findViewById(16908290) == null) ? m19735g() : new int[]{window.findViewById(16908290).getTop(), window.findViewById(16908290).getBottom()};
        r0 = new int[2];
        aja.m19216a();
        r0[0] = hn.m19871b((Context) activity, g[0]);
        aja.m19216a();
        r0[1] = hn.m19871b((Context) activity, g[1]);
        return r0;
    }

    /* renamed from: d */
    public final boolean m19759d(java.lang.String r4) {
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
        r3 = this;
        r0 = android.text.TextUtils.isEmpty(r4);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        monitor-enter(r3);	 Catch:{ PatternSyntaxException -> 0x0046 }
        r0 = r3.f16066g;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0025;	 Catch:{ all -> 0x0043 }
    L_0x000d:
        r0 = com.google.android.gms.internal.alo.ak;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ all -> 0x0043 }
        r0 = r2.m19334a(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r2 = r3.f16066g;	 Catch:{ all -> 0x0043 }
        r2 = r2.pattern();	 Catch:{ all -> 0x0043 }
        r0 = r0.equals(r2);	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0037;	 Catch:{ all -> 0x0043 }
    L_0x0025:
        r0 = com.google.android.gms.internal.alo.ak;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ all -> 0x0043 }
        r0 = r2.m19334a(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r0 = java.util.regex.Pattern.compile(r0);	 Catch:{ all -> 0x0043 }
        r3.f16066g = r0;	 Catch:{ all -> 0x0043 }
    L_0x0037:
        r0 = r3.f16066g;	 Catch:{ all -> 0x0043 }
        r4 = r0.matcher(r4);	 Catch:{ all -> 0x0043 }
        r4 = r4.matches();	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        return r4;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r4 = move-exception;	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        throw r4;	 Catch:{ PatternSyntaxException -> 0x0046 }
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fk.d(java.lang.String):boolean");
    }

    /* renamed from: e */
    public final boolean m19760e(java.lang.String r4) {
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
        r3 = this;
        r0 = android.text.TextUtils.isEmpty(r4);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        monitor-enter(r3);	 Catch:{ PatternSyntaxException -> 0x0046 }
        r0 = r3.f16067h;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0025;	 Catch:{ all -> 0x0043 }
    L_0x000d:
        r0 = com.google.android.gms.internal.alo.al;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ all -> 0x0043 }
        r0 = r2.m19334a(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r2 = r3.f16067h;	 Catch:{ all -> 0x0043 }
        r2 = r2.pattern();	 Catch:{ all -> 0x0043 }
        r0 = r0.equals(r2);	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0037;	 Catch:{ all -> 0x0043 }
    L_0x0025:
        r0 = com.google.android.gms.internal.alo.al;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ all -> 0x0043 }
        r0 = r2.m19334a(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r0 = java.util.regex.Pattern.compile(r0);	 Catch:{ all -> 0x0043 }
        r3.f16067h = r0;	 Catch:{ all -> 0x0043 }
    L_0x0037:
        r0 = r3.f16067h;	 Catch:{ all -> 0x0043 }
        r4 = r0.matcher(r4);	 Catch:{ all -> 0x0043 }
        r4 = r4.matches();	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        return r4;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r4 = move-exception;	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        throw r4;	 Catch:{ PatternSyntaxException -> 0x0046 }
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fk.e(java.lang.String):boolean");
    }
}
