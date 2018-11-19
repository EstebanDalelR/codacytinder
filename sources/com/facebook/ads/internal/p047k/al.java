package com.facebook.ads.internal.p047k;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings.System;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.p035b.C1370b;
import com.facebook.ads.internal.p035b.C1372c;
import com.facebook.ads.internal.p035b.C1372c.C1371a;
import com.facebook.ads.internal.p035b.C3277a;
import com.facebook.ads.internal.p041h.C1425f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.k.al */
public class al implements ag<Bundle> {
    /* renamed from: a */
    private final String f10114a;
    /* renamed from: b */
    private boolean f10115b;
    /* renamed from: c */
    private final Context f10116c;
    /* renamed from: d */
    private final C1425f f10117d;
    /* renamed from: e */
    private final C1477a f10118e;
    /* renamed from: f */
    private final C3277a f10119f;
    /* renamed from: g */
    private int f10120g;
    /* renamed from: h */
    private int f10121h;
    /* renamed from: i */
    private final ac f10122i;

    /* renamed from: com.facebook.ads.internal.k.al$a */
    public interface C1477a {
        /* renamed from: a */
        boolean mo1835a();

        /* renamed from: b */
        boolean mo1836b();

        int getCurrentPosition();

        boolean getGlobalVisibleRect(Rect rect);

        long getInitialBufferTime();

        int getMeasuredHeight();

        int getMeasuredWidth();

        VideoStartReason getVideoStartReason();

        float getVolume();
    }

    /* renamed from: com.facebook.ads.internal.k.al$b */
    protected enum C1478b {
        PLAY(0),
        SKIP(1),
        TIME(2),
        MRC(3),
        PAUSE(4),
        RESUME(5),
        MUTE(6),
        UNMUTE(7),
        VIEWABLE_IMPRESSION(10);
        
        /* renamed from: j */
        public final int f4088j;

        private C1478b(int i) {
            this.f4088j = i;
        }
    }

    public al(Context context, C1425f c1425f, C1477a c1477a, List<C1370b> list, String str) {
        this(context, c1425f, c1477a, list, str, null);
    }

    public al(Context context, C1425f c1425f, C1477a c1477a, List<C1370b> list, String str, @Nullable Bundle bundle) {
        Context context2 = context;
        C1477a c1477a2 = c1477a;
        List<C1370b> list2 = list;
        Bundle bundle2 = bundle;
        this.f10115b = true;
        this.f10120g = 0;
        this.f10121h = 0;
        this.f10116c = context2;
        C1425f c1425f2 = c1425f;
        this.f10117d = c1425f2;
        this.f10118e = c1477a2;
        this.f10114a = str;
        C33181 c33181 = r0;
        final C1425f c1425f3 = c1425f2;
        final String str2 = str;
        C33181 c331812 = new C1370b(this, 0.5d, -1.0d, 2.0d, true) {
            /* renamed from: g */
            final /* synthetic */ al f10110g;

            /* renamed from: a */
            protected void mo1727a(boolean z, boolean z2, C1372c c1372c) {
                c1425f3.mo1750d(str2, this.f10110g.m12803a(C1478b.MRC));
            }
        };
        list2.add(c33181);
        c1425f3 = c1425f;
        C33192 c33192 = r0;
        str2 = str;
        C33192 c331922 = new C1370b(this, 1.0E-7d, -1.0d, 0.001d, false) {
            /* renamed from: g */
            final /* synthetic */ al f10113g;

            /* renamed from: a */
            protected void mo1727a(boolean z, boolean z2, C1372c c1372c) {
                c1425f3.mo1750d(str2, this.f10113g.m12803a(C1478b.VIEWABLE_IMPRESSION));
            }
        };
        list2.add(c33192);
        if (bundle2 != null) {
            this.f10119f = new C3277a(context2, (View) c1477a2, list2, bundle2.getBundle("adQualityManager"));
            this.f10120g = bundle2.getInt("lastProgressTimeMS");
            this.f10121h = bundle2.getInt("lastBoundaryTimeMS");
        } else {
            this.f10119f = new C3277a(context2, (View) c1477a2, list2);
        }
        r1.f10122i = new ac(new Handler(), r1);
    }

    /* renamed from: a */
    private Map<String, String> m12803a(C1478b c1478b) {
        return m12804a(c1478b, this.f10118e.getCurrentPosition());
    }

    /* renamed from: a */
    private Map<String, String> m12804a(C1478b c1478b, int i) {
        Map<String, String> c = m12810c(i);
        c.put("action", String.valueOf(c1478b.f4088j));
        return c;
    }

    /* renamed from: a */
    private void m12806a(int i, boolean z) {
        if (((double) i) > 0.0d && i >= this.f10120g) {
            if (i > this.f10120g) {
                this.f10119f.m12637a((double) (((float) (i - this.f10120g)) / 1000.0f), (double) m12817d());
                this.f10120g = i;
                if (i - this.f10121h >= 5000) {
                    this.f10117d.mo1750d(this.f10114a, m12804a(C1478b.TIME, i));
                    this.f10121h = this.f10120g;
                    this.f10119f.m12636a();
                    return;
                }
            }
            if (z) {
                this.f10117d.mo1750d(this.f10114a, m12804a(C1478b.TIME, i));
            }
        }
    }

    /* renamed from: a */
    private void m12807a(Map<String, String> map) {
        map.put("exoplayer", String.valueOf(this.f10118e.mo1835a()));
        map.put("prep", Long.toString(this.f10118e.getInitialBufferTime()));
    }

    /* renamed from: a */
    private void m12808a(Map<String, String> map, int i) {
        map.put("ptime", String.valueOf(((float) this.f10121h) / 1000.0f));
        map.put("time", String.valueOf(((float) i) / 1000.0f));
    }

    /* renamed from: b */
    private void m12809b(Map<String, String> map) {
        C1372c b = this.f10119f.m12638b();
        C1371a b2 = b.m4790b();
        map.put("vwa", String.valueOf(b2.m4783c()));
        map.put("vwm", String.valueOf(b2.m4782b()));
        map.put("vwmax", String.valueOf(b2.m4784d()));
        map.put("vtime_ms", String.valueOf(b2.m4786f() * 1000.0d));
        map.put("mcvt_ms", String.valueOf(b2.m4787g() * 1000.0d));
        C1371a c = b.m4792c();
        map.put("vla", String.valueOf(c.m4783c()));
        map.put("vlm", String.valueOf(c.m4782b()));
        map.put("vlmax", String.valueOf(c.m4784d()));
        map.put("atime_ms", String.valueOf(c.m4786f() * 1000.0d));
        map.put("mcat_ms", String.valueOf(c.m4787g() * 1000.0d));
    }

    /* renamed from: c */
    private Map<String, String> m12810c(int i) {
        Map hashMap = new HashMap();
        am.m5200a(hashMap, this.f10118e.getVideoStartReason() == VideoStartReason.AUTO_STARTED, this.f10118e.mo1836b() ^ true);
        m12807a(hashMap);
        m12809b(hashMap);
        m12808a(hashMap, i);
        m12811c(hashMap);
        return hashMap;
    }

    /* renamed from: c */
    private void m12811c(Map<String, String> map) {
        Rect rect = new Rect();
        this.f10118e.getGlobalVisibleRect(rect);
        map.put("pt", String.valueOf(rect.top));
        map.put("pl", String.valueOf(rect.left));
        map.put("ph", String.valueOf(this.f10118e.getMeasuredHeight()));
        map.put("pw", String.valueOf(this.f10118e.getMeasuredWidth()));
        WindowManager windowManager = (WindowManager) this.f10116c.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        map.put("vph", String.valueOf(displayMetrics.heightPixels));
        map.put("vpw", String.valueOf(displayMetrics.widthPixels));
    }

    /* renamed from: a */
    public void m12812a(int i) {
        m12806a(i, false);
    }

    /* renamed from: a */
    public void m12813a(int i, int i2) {
        m12806a(i, true);
        this.f10121h = i2;
        this.f10120g = i2;
        this.f10119f.m12636a();
    }

    /* renamed from: b */
    public void m12814b() {
        this.f10116c.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.f10122i);
    }

    /* renamed from: b */
    public void m12815b(int i) {
        m12806a(i, true);
        this.f10121h = 0;
        this.f10120g = 0;
        this.f10119f.m12636a();
    }

    /* renamed from: c */
    public void m12816c() {
        this.f10116c.getContentResolver().unregisterContentObserver(this.f10122i);
    }

    /* renamed from: d */
    protected float m12817d() {
        return am.m5199a(this.f10116c) * this.f10118e.getVolume();
    }

    /* renamed from: e */
    public void m12818e() {
        boolean z;
        if (((double) m12817d()) < 0.05d) {
            if (this.f10115b) {
                m12819f();
                z = false;
            }
            return;
        }
        if (!this.f10115b) {
            m12820g();
            z = true;
        }
        return;
        this.f10115b = z;
    }

    /* renamed from: f */
    public void m12819f() {
        this.f10117d.mo1750d(this.f10114a, m12803a(C1478b.MUTE));
    }

    /* renamed from: g */
    public void m12820g() {
        this.f10117d.mo1750d(this.f10114a, m12803a(C1478b.UNMUTE));
    }

    public Bundle getSaveInstanceState() {
        m12813a(m12824k(), m12824k());
        Bundle bundle = new Bundle();
        bundle.putInt("lastProgressTimeMS", this.f10120g);
        bundle.putInt("lastBoundaryTimeMS", this.f10121h);
        bundle.putBundle("adQualityManager", this.f10119f.getSaveInstanceState());
        return bundle;
    }

    /* renamed from: h */
    public void m12821h() {
        this.f10117d.mo1750d(this.f10114a, m12803a(C1478b.SKIP));
    }

    /* renamed from: i */
    public void m12822i() {
        this.f10117d.mo1750d(this.f10114a, m12803a(C1478b.PAUSE));
    }

    /* renamed from: j */
    public void m12823j() {
        this.f10117d.mo1750d(this.f10114a, m12803a(C1478b.RESUME));
    }

    /* renamed from: k */
    public int m12824k() {
        return this.f10120g;
    }
}
