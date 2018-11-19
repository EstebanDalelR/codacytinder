package com.facebook.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.ads.NativeAd.MediaCacheFlag;
import com.facebook.ads.internal.C1373b;
import com.facebook.ads.internal.C3297h;
import com.facebook.ads.internal.C3297h.C1419a;
import com.facebook.ads.internal.adapters.C3276y;
import com.facebook.ads.internal.p036c.C1374a;
import com.facebook.ads.internal.p036c.C1380b;
import com.facebook.ads.internal.protocol.C1521b;
import com.facebook.ads.internal.protocol.C1522c;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class NativeAdsManager {
    /* renamed from: a */
    private static final String f3586a = "NativeAdsManager";
    /* renamed from: b */
    private static final C1521b f3587b = C1521b.ADS;
    /* renamed from: c */
    private final Context f3588c;
    /* renamed from: d */
    private final String f3589d;
    /* renamed from: e */
    private final int f3590e;
    /* renamed from: f */
    private final List<NativeAd> f3591f;
    /* renamed from: g */
    private int f3592g;
    /* renamed from: h */
    private Listener f3593h;
    /* renamed from: i */
    private C3297h f3594i;
    /* renamed from: j */
    private boolean f3595j;
    /* renamed from: k */
    private boolean f3596k;

    public interface Listener {
        void onAdError(AdError adError);

        void onAdsLoaded();
    }

    public NativeAdsManager(Context context, String str, int i) {
        if (context == null) {
            throw new IllegalArgumentException("context can not be null");
        }
        this.f3588c = context;
        this.f3589d = str;
        this.f3590e = Math.max(i, 0);
        this.f3591f = new ArrayList(i);
        this.f3592g = -1;
        this.f3596k = false;
        this.f3595j = false;
        try {
            CookieManager.getInstance();
            if (VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(context);
            }
        } catch (Throwable e) {
            Log.w(f3586a, "Failed to initialize CookieManager.", e);
        }
    }

    public void disableAutoRefresh() {
        this.f3595j = true;
        if (this.f3594i != null) {
            this.f3594i.m12726c();
        }
    }

    public int getUniqueNativeAdCount() {
        return this.f3591f.size();
    }

    public boolean isLoaded() {
        return this.f3596k;
    }

    public void loadAds() {
        loadAds(EnumSet.of(MediaCacheFlag.NONE));
    }

    public void loadAds(final EnumSet<MediaCacheFlag> enumSet) {
        C1522c c1522c = C1522c.NATIVE_UNKNOWN;
        int i = this.f3590e;
        if (this.f3594i != null) {
            this.f3594i.m12725b();
        }
        this.f3594i = new C3297h(this.f3588c, this.f3589d, c1522c, null, f3587b, i, enumSet);
        if (this.f3595j) {
            this.f3594i.m12726c();
        }
        this.f3594i.m12723a(new C1419a(this) {
            /* renamed from: b */
            final /* synthetic */ NativeAdsManager f9904b;

            /* renamed from: a */
            public void mo1688a(C1373b c1373b) {
                if (this.f9904b.f3593h != null) {
                    this.f9904b.f3593h.onAdError(c1373b.m4796b());
                }
            }

            /* renamed from: a */
            public void mo1689a(final List<C3276y> list) {
                C1380b c1380b = new C1380b(this.f9904b.f3588c);
                for (C3276y c3276y : list) {
                    if (enumSet.contains(MediaCacheFlag.ICON) && c3276y.mo3311k() != null) {
                        c1380b.m4807a(c3276y.mo3311k().getUrl());
                    }
                    if (enumSet.contains(MediaCacheFlag.IMAGE) && c3276y.mo3312l() != null) {
                        c1380b.m4807a(c3276y.mo3312l().getUrl());
                    }
                    if (enumSet.contains(MediaCacheFlag.VIDEO) && !TextUtils.isEmpty(c3276y.mo3324w())) {
                        c1380b.m4808b(c3276y.mo3324w());
                    }
                }
                c1380b.m4806a(new C1374a(this) {
                    /* renamed from: b */
                    final /* synthetic */ C32411 f9902b;

                    /* renamed from: c */
                    private void m12410c() {
                        this.f9902b.f9904b.f3596k = true;
                        this.f9902b.f9904b.f3591f.clear();
                        this.f9902b.f9904b.f3592g = 0;
                        for (C3276y nativeAd : list) {
                            this.f9902b.f9904b.f3591f.add(new NativeAd(this.f9902b.f9904b.f3588c, nativeAd, null));
                        }
                        if (this.f9902b.f9904b.f3593h != null) {
                            this.f9902b.f9904b.f3593h.onAdsLoaded();
                        }
                    }

                    /* renamed from: a */
                    public void mo1673a() {
                        m12410c();
                    }

                    /* renamed from: b */
                    public void mo1674b() {
                        m12410c();
                    }
                });
            }
        });
        this.f3594i.m12721a();
    }

    public NativeAd nextNativeAd() {
        if (this.f3591f.size() == 0) {
            return null;
        }
        int i = this.f3592g;
        this.f3592g = i + 1;
        NativeAd nativeAd = (NativeAd) this.f3591f.get(i % this.f3591f.size());
        return i >= this.f3591f.size() ? new NativeAd(nativeAd) : nativeAd;
    }

    public void setListener(Listener listener) {
        this.f3593h = listener;
    }
}
