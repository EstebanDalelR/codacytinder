package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings.System;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.ar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
public final class afe implements OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: a */
    protected final afc f15127a;
    /* renamed from: b */
    private Object f15128b = new Object();
    /* renamed from: c */
    private final WeakReference<dl> f15129c;
    /* renamed from: d */
    private WeakReference<ViewTreeObserver> f15130d;
    /* renamed from: e */
    private final zzhd f15131e;
    /* renamed from: f */
    private final Context f15132f;
    /* renamed from: g */
    private final WindowManager f15133g;
    /* renamed from: h */
    private final PowerManager f15134h;
    /* renamed from: i */
    private final KeyguardManager f15135i;
    /* renamed from: j */
    private final DisplayMetrics f15136j;
    @Nullable
    /* renamed from: k */
    private zzga f15137k;
    /* renamed from: l */
    private boolean f15138l;
    /* renamed from: m */
    private boolean f15139m = false;
    /* renamed from: n */
    private boolean f15140n = false;
    /* renamed from: o */
    private boolean f15141o;
    /* renamed from: p */
    private boolean f15142p;
    /* renamed from: q */
    private boolean f15143q;
    @Nullable
    /* renamed from: r */
    private BroadcastReceiver f15144r;
    /* renamed from: s */
    private final HashSet<Object> f15145s = new HashSet();
    /* renamed from: t */
    private he f15146t;
    /* renamed from: u */
    private final HashSet<zzgo> f15147u = new HashSet();
    /* renamed from: v */
    private final Rect f15148v = new Rect();
    /* renamed from: w */
    private final afj f15149w;
    /* renamed from: x */
    private float f15150x;

    public afe(Context context, zzjn zzjn, dl dlVar, zzakd zzakd, zzhd zzhd) {
        this.f15129c = new WeakReference(dlVar);
        this.f15131e = zzhd;
        this.f15130d = new WeakReference(null);
        this.f15141o = true;
        this.f15143q = false;
        this.f15146t = new he(200);
        this.f15127a = new afc(UUID.randomUUID().toString(), zzakd, zzjn.zzbek, dlVar.f15978j, dlVar.m19615a(), zzjn.zzben);
        this.f15133g = (WindowManager) context.getSystemService("window");
        this.f15134h = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f15135i = (KeyguardManager) context.getSystemService("keyguard");
        this.f15132f = context;
        this.f15149w = new afj(this, new Handler());
        this.f15132f.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.f15149w);
        this.f15136j = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.f15133g.getDefaultDisplay();
        this.f15148v.right = defaultDisplay.getWidth();
        this.f15148v.bottom = defaultDisplay.getHeight();
        m19085a();
    }

    /* renamed from: a */
    private static int m19077a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    /* renamed from: a */
    private final JSONObject m19078a(@Nullable View view, @Nullable Boolean bool) throws JSONException {
        if (view == null) {
            return m19083i().put("isAttachedToWindow", false).put("isScreenOn", m19084j()).put("isVisible", false);
        }
        boolean a = ar.g().mo8354a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Throwable e) {
            hx.m19912b("Failure getting view location.", e);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject i = m19083i();
        i.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", a).put("viewBox", new JSONObject().put("top", m19077a(this.f15148v.top, this.f15136j)).put("bottom", m19077a(this.f15148v.bottom, this.f15136j)).put("left", m19077a(this.f15148v.left, this.f15136j)).put("right", m19077a(this.f15148v.right, this.f15136j))).put("adBox", new JSONObject().put("top", m19077a(rect.top, this.f15136j)).put("bottom", m19077a(rect.bottom, this.f15136j)).put("left", m19077a(rect.left, this.f15136j)).put("right", m19077a(rect.right, this.f15136j))).put("globalVisibleBox", new JSONObject().put("top", m19077a(rect2.top, this.f15136j)).put("bottom", m19077a(rect2.bottom, this.f15136j)).put("left", m19077a(rect2.left, this.f15136j)).put("right", m19077a(rect2.right, this.f15136j))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", m19077a(rect3.top, this.f15136j)).put("bottom", m19077a(rect3.bottom, this.f15136j)).put("left", m19077a(rect3.left, this.f15136j)).put("right", m19077a(rect3.right, this.f15136j))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", m19077a(rect4.top, this.f15136j)).put("bottom", m19077a(rect4.bottom, this.f15136j)).put("left", m19077a(rect4.left, this.f15136j)).put("right", m19077a(rect4.right, this.f15136j))).put("screenDensity", (double) this.f15136j.density);
        if (bool == null) {
            bool = Boolean.valueOf(ar.e().m19753a(view, this.f15134h, this.f15135i));
        }
        i.put("isVisible", bool.booleanValue());
        return i;
    }

    /* renamed from: a */
    private static JSONObject m19079a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m19080a(JSONObject jSONObject, boolean z) {
        try {
            jSONObject = m19079a(jSONObject);
            ArrayList arrayList = new ArrayList(this.f15147u);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((zzgo) obj).zzb(jSONObject, z);
            }
        } catch (Throwable th) {
            hx.m19912b("Skipping active view message.", th);
        }
    }

    /* renamed from: g */
    private final void m19081g() {
        if (this.f15137k != null) {
            this.f15137k.zza(this);
        }
    }

    /* renamed from: h */
    private final void m19082h() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f15130d.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    /* renamed from: i */
    private final JSONObject m19083i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ar.e();
        ar.e();
        jSONObject.put("afmaVersion", this.f15127a.m19072b()).put("activeViewJSON", this.f15127a.m19073c()).put("timestamp", ar.k().elapsedRealtime()).put("adFormat", this.f15127a.m19071a()).put("hashCode", this.f15127a.m19074d()).put("isMraid", this.f15127a.m19075e()).put("isStopped", this.f15140n).put("isPaused", this.f15139m).put("isNative", this.f15127a.m19076f()).put("isScreenOn", m19084j()).put("appMuted", fk.m19725d()).put("appVolume", (double) fk.m19719c()).put("deviceVolume", (double) this.f15150x);
        return jSONObject;
    }

    /* renamed from: j */
    private final boolean m19084j() {
        return VERSION.SDK_INT >= 20 ? this.f15134h.isInteractive() : this.f15134h.isScreenOn();
    }

    /* renamed from: a */
    public final void m19085a() {
        ar.e();
        this.f15150x = fk.m19738j(this.f15132f);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected final void m19086a(int r8) {
        /*
        r7 = this;
        r0 = r7.f15128b;
        monitor-enter(r0);
        r1 = r7.f15147u;	 Catch:{ all -> 0x00ce }
        r1 = r1.iterator();	 Catch:{ all -> 0x00ce }
    L_0x0009:
        r2 = r1.hasNext();	 Catch:{ all -> 0x00ce }
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x001f;
    L_0x0011:
        r2 = r1.next();	 Catch:{ all -> 0x00ce }
        r2 = (com.google.android.gms.internal.zzgo) r2;	 Catch:{ all -> 0x00ce }
        r2 = r2.zzgg();	 Catch:{ all -> 0x00ce }
        if (r2 == 0) goto L_0x0009;
    L_0x001d:
        r1 = 1;
        goto L_0x0020;
    L_0x001f:
        r1 = 0;
    L_0x0020:
        if (r1 == 0) goto L_0x00cc;
    L_0x0022:
        r1 = r7.f15141o;	 Catch:{ all -> 0x00ce }
        if (r1 != 0) goto L_0x0028;
    L_0x0026:
        goto L_0x00cc;
    L_0x0028:
        r1 = r7.f15131e;	 Catch:{ all -> 0x00ce }
        r1 = r1.zzgd();	 Catch:{ all -> 0x00ce }
        if (r1 == 0) goto L_0x0040;
    L_0x0030:
        r2 = com.google.android.gms.ads.internal.ar.e();	 Catch:{ all -> 0x00ce }
        r5 = r7.f15134h;	 Catch:{ all -> 0x00ce }
        r6 = r7.f15135i;	 Catch:{ all -> 0x00ce }
        r2 = r2.m19753a(r1, r5, r6);	 Catch:{ all -> 0x00ce }
        if (r2 == 0) goto L_0x0040;
    L_0x003e:
        r2 = 1;
        goto L_0x0041;
    L_0x0040:
        r2 = 0;
    L_0x0041:
        if (r1 == 0) goto L_0x0053;
    L_0x0043:
        if (r2 == 0) goto L_0x0053;
    L_0x0045:
        r5 = new android.graphics.Rect;	 Catch:{ all -> 0x00ce }
        r5.<init>();	 Catch:{ all -> 0x00ce }
        r6 = 0;
        r5 = r1.getGlobalVisibleRect(r5, r6);	 Catch:{ all -> 0x00ce }
        if (r5 == 0) goto L_0x0053;
    L_0x0051:
        r5 = 1;
        goto L_0x0054;
    L_0x0053:
        r5 = 0;
    L_0x0054:
        r6 = r7.f15131e;	 Catch:{ all -> 0x00ce }
        r6 = r6.zzge();	 Catch:{ all -> 0x00ce }
        if (r6 == 0) goto L_0x0061;
    L_0x005c:
        r7.m19091b();	 Catch:{ all -> 0x00ce }
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x0061:
        if (r8 != r4) goto L_0x0071;
    L_0x0063:
        r6 = r7.f15146t;	 Catch:{ all -> 0x00ce }
        r6 = r6.m19841a();	 Catch:{ all -> 0x00ce }
        if (r6 != 0) goto L_0x0071;
    L_0x006b:
        r6 = r7.f15143q;	 Catch:{ all -> 0x00ce }
        if (r5 != r6) goto L_0x0071;
    L_0x006f:
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x0071:
        if (r5 != 0) goto L_0x007b;
    L_0x0073:
        r6 = r7.f15143q;	 Catch:{ all -> 0x00ce }
        if (r6 != 0) goto L_0x007b;
    L_0x0077:
        if (r8 != r4) goto L_0x007b;
    L_0x0079:
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x007b:
        r8 = java.lang.Boolean.valueOf(r2);	 Catch:{ JSONException -> 0x0089, JSONException -> 0x0089 }
        r8 = r7.m19078a(r1, r8);	 Catch:{ JSONException -> 0x0089, JSONException -> 0x0089 }
        r7.m19080a(r8, r3);	 Catch:{ JSONException -> 0x0089, JSONException -> 0x0089 }
        r7.f15143q = r5;	 Catch:{ JSONException -> 0x0089, JSONException -> 0x0089 }
        goto L_0x008f;
    L_0x0089:
        r8 = move-exception;
        r1 = "Active view update failed.";
        com.google.android.gms.internal.hx.m19909a(r1, r8);	 Catch:{ all -> 0x00ce }
    L_0x008f:
        r8 = r7.f15131e;	 Catch:{ all -> 0x00ce }
        r8 = r8.zzgf();	 Catch:{ all -> 0x00ce }
        r8 = r8.zzgd();	 Catch:{ all -> 0x00ce }
        if (r8 == 0) goto L_0x00c7;
    L_0x009b:
        r1 = r7.f15130d;	 Catch:{ all -> 0x00ce }
        r1 = r1.get();	 Catch:{ all -> 0x00ce }
        r1 = (android.view.ViewTreeObserver) r1;	 Catch:{ all -> 0x00ce }
        r8 = r8.getViewTreeObserver();	 Catch:{ all -> 0x00ce }
        if (r8 == r1) goto L_0x00c7;
    L_0x00a9:
        r7.m19082h();	 Catch:{ all -> 0x00ce }
        r2 = r7.f15138l;	 Catch:{ all -> 0x00ce }
        if (r2 == 0) goto L_0x00b8;
    L_0x00b0:
        if (r1 == 0) goto L_0x00c0;
    L_0x00b2:
        r1 = r1.isAlive();	 Catch:{ all -> 0x00ce }
        if (r1 == 0) goto L_0x00c0;
    L_0x00b8:
        r7.f15138l = r4;	 Catch:{ all -> 0x00ce }
        r8.addOnScrollChangedListener(r7);	 Catch:{ all -> 0x00ce }
        r8.addOnGlobalLayoutListener(r7);	 Catch:{ all -> 0x00ce }
    L_0x00c0:
        r1 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x00ce }
        r1.<init>(r8);	 Catch:{ all -> 0x00ce }
        r7.f15130d = r1;	 Catch:{ all -> 0x00ce }
    L_0x00c7:
        r7.m19081g();	 Catch:{ all -> 0x00ce }
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x00cc:
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x00ce:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.afe.a(int):void");
    }

    /* renamed from: a */
    public final void m19087a(zzga zzga) {
        synchronized (this.f15128b) {
            this.f15137k = zzga;
        }
    }

    /* renamed from: a */
    public final void m19088a(zzgo zzgo) {
        if (this.f15147u.isEmpty()) {
            synchronized (this.f15128b) {
                if (this.f15144r == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.f15144r = new afh(this);
                    ar.C().m19851a(this.f15132f, this.f15144r, intentFilter);
                }
            }
            m19086a(3);
        }
        this.f15147u.add(zzgo);
        try {
            zzgo.zzb(m19079a(m19078a(this.f15131e.zzgd(), null)), false);
        } catch (Throwable e) {
            hx.m19912b("Skipping measurement update for new client.", e);
        }
    }

    /* renamed from: a */
    final void m19089a(zzgo zzgo, Map<String, String> map) {
        String str = "Received request to untrack: ";
        String valueOf = String.valueOf(this.f15127a.m19074d());
        hx.m19911b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        m19092b(zzgo);
    }

    /* renamed from: a */
    final boolean m19090a(@Nullable Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f15127a.m19074d());
    }

    /* renamed from: b */
    public final void m19091b() {
        String str;
        String str2;
        synchronized (this.f15128b) {
            if (this.f15141o) {
                this.f15142p = true;
                try {
                    JSONObject i = m19083i();
                    i.put("doneReasonCode", "u");
                    m19080a(i, true);
                } catch (JSONException e) {
                    Throwable e2 = e;
                    str = "JSON failure while processing active view data.";
                    hx.m19912b(str, e2);
                    str2 = "Untracking ad unit: ";
                    str = String.valueOf(this.f15127a.m19074d());
                    hx.m19911b(str.length() != 0 ? new String(str2) : str2.concat(str));
                } catch (RuntimeException e3) {
                    e2 = e3;
                    str = "Failure while processing active view data.";
                    hx.m19912b(str, e2);
                    str2 = "Untracking ad unit: ";
                    str = String.valueOf(this.f15127a.m19074d());
                    if (str.length() != 0) {
                    }
                    hx.m19911b(str.length() != 0 ? new String(str2) : str2.concat(str));
                }
                str2 = "Untracking ad unit: ";
                str = String.valueOf(this.f15127a.m19074d());
                if (str.length() != 0) {
                }
                hx.m19911b(str.length() != 0 ? new String(str2) : str2.concat(str));
            }
        }
    }

    /* renamed from: b */
    public final void m19092b(zzgo zzgo) {
        this.f15147u.remove(zzgo);
        zzgo.zzgh();
        if (this.f15147u.isEmpty()) {
            synchronized (this.f15128b) {
                m19082h();
                synchronized (this.f15128b) {
                    if (this.f15144r != null) {
                        try {
                            ar.C().m19850a(this.f15132f, this.f15144r);
                        } catch (Throwable e) {
                            hx.m19912b("Failed trying to unregister the receiver", e);
                        } catch (Throwable e2) {
                            ar.i().m27296a(e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.f15144r = null;
                    }
                }
                this.f15132f.getContentResolver().unregisterContentObserver(this.f15149w);
                int i = 0;
                this.f15141o = false;
                m19081g();
                ArrayList arrayList = new ArrayList(this.f15147u);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    m19092b((zzgo) obj);
                }
            }
        }
    }

    /* renamed from: b */
    final void m19093b(Map<String, String> map) {
        m19086a(3);
    }

    /* renamed from: c */
    final void m19094c(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            if (!"1".equals(map.get("isVisible"))) {
                "true".equals(map.get("isVisible"));
            }
            Iterator it = this.f15145s.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: c */
    public final boolean m19095c() {
        boolean z;
        synchronized (this.f15128b) {
            z = this.f15141o;
        }
        return z;
    }

    /* renamed from: d */
    public final void m19096d() {
        synchronized (this.f15128b) {
            this.f15140n = true;
            m19086a(3);
        }
    }

    /* renamed from: e */
    public final void m19097e() {
        synchronized (this.f15128b) {
            this.f15139m = true;
            m19086a(3);
        }
    }

    /* renamed from: f */
    public final void m19098f() {
        synchronized (this.f15128b) {
            this.f15139m = false;
            m19086a(3);
        }
    }

    public final void onGlobalLayout() {
        m19086a(2);
    }

    public final void onScrollChanged() {
        m19086a(1);
    }
}
