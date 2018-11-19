package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.C1350a;
import com.facebook.ads.internal.C1373b;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.protocol.C1521b;
import com.facebook.ads.internal.server.AdPlacementType;
import java.util.EnumSet;

public class InterstitialAd implements Ad {
    /* renamed from: a */
    private static final C1521b f9850a = C1521b.ADS;
    /* renamed from: b */
    private final Context f9851b;
    /* renamed from: c */
    private final String f9852c;
    /* renamed from: d */
    private DisplayAdController f9853d;
    /* renamed from: e */
    private boolean f9854e;
    /* renamed from: f */
    private boolean f9855f;
    /* renamed from: g */
    private InterstitialAdListener f9856g;

    /* renamed from: com.facebook.ads.InterstitialAd$1 */
    class C32291 extends C1350a {
        /* renamed from: a */
        final /* synthetic */ InterstitialAd f9849a;

        C32291(InterstitialAd interstitialAd) {
            this.f9849a = interstitialAd;
        }

        /* renamed from: a */
        public void mo1636a() {
            if (this.f9849a.f9856g != null) {
                this.f9849a.f9856g.onAdClicked(this.f9849a);
            }
        }

        /* renamed from: a */
        public void mo1637a(View view) {
        }

        /* renamed from: a */
        public void mo1638a(AdAdapter adAdapter) {
            this.f9849a.f9854e = true;
            if (this.f9849a.f9856g != null) {
                this.f9849a.f9856g.onAdLoaded(this.f9849a);
            }
        }

        /* renamed from: a */
        public void mo1639a(C1373b c1373b) {
            if (this.f9849a.f9856g != null) {
                this.f9849a.f9856g.onError(this.f9849a, c1373b.m4796b());
            }
        }

        /* renamed from: b */
        public void mo1640b() {
            if (this.f9849a.f9856g != null) {
                this.f9849a.f9856g.onLoggingImpression(this.f9849a);
            }
        }

        /* renamed from: d */
        public void mo1663d() {
            if (this.f9849a.f9856g != null) {
                this.f9849a.f9856g.onInterstitialDisplayed(this.f9849a);
            }
        }

        /* renamed from: e */
        public void mo1664e() {
            this.f9849a.f9855f = false;
            if (this.f9849a.f9853d != null) {
                this.f9849a.f9853d.m12499c();
                this.f9849a.f9853d = null;
            }
            if (this.f9849a.f9856g != null) {
                this.f9849a.f9856g.onInterstitialDismissed(this.f9849a);
            }
        }
    }

    public InterstitialAd(Context context, String str) {
        this.f9851b = context;
        this.f9852c = str;
    }

    /* renamed from: a */
    private void m12338a(EnumSet<CacheFlag> enumSet, String str) {
        this.f9854e = false;
        if (this.f9855f) {
            throw new IllegalStateException("InterstitialAd cannot be loaded while being displayed. Make sure your adapter calls adapterListener.onInterstitialDismissed().");
        }
        if (this.f9853d != null) {
            this.f9853d.m12499c();
            this.f9853d = null;
        }
        this.f9853d = new DisplayAdController(this.f9851b, this.f9852c, C1490h.m5238a(this.f9851b.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, AdSize.INTERSTITIAL, f9850a, 1, true, enumSet);
        this.f9853d.m12491a(new C32291(this));
        this.f9853d.m12494a(str);
    }

    public void destroy() {
        if (this.f9853d != null) {
            this.f9853d.m12498b(true);
            this.f9853d = null;
        }
    }

    public String getPlacementId() {
        return this.f9852c;
    }

    public boolean isAdLoaded() {
        return this.f9854e;
    }

    public void loadAd() {
        loadAd(EnumSet.of(CacheFlag.NONE));
    }

    public void loadAd(EnumSet<CacheFlag> enumSet) {
        m12338a((EnumSet) enumSet, null);
    }

    public void loadAdFromBid(String str) {
        m12338a(EnumSet.of(CacheFlag.NONE), str);
    }

    public void loadAdFromBid(EnumSet<CacheFlag> enumSet, String str) {
        m12338a((EnumSet) enumSet, str);
    }

    public void setAdListener(InterstitialAdListener interstitialAdListener) {
        this.f9856g = interstitialAdListener;
    }

    public boolean show() {
        if (this.f9854e) {
            this.f9853d.m12496b();
            this.f9855f = true;
            this.f9854e = false;
            return true;
        }
        if (this.f9856g != null) {
            this.f9856g.onError(this, AdError.INTERNAL_ERROR);
        }
        return false;
    }
}
