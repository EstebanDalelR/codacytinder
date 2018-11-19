package com.facebook.ads;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.C1350a;
import com.facebook.ads.internal.C1373b;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.aa;
import com.facebook.ads.internal.protocol.C1521b;
import com.facebook.ads.internal.protocol.C1522c;
import com.facebook.ads.internal.server.AdPlacementType;

public class RewardedVideoAd implements Ad {
    public static final int UNSET_VIDEO_DURATION = -1;
    /* renamed from: a */
    private static final String f9906a = "RewardedVideoAd";
    /* renamed from: b */
    private final Context f9907b;
    /* renamed from: c */
    private final String f9908c;
    /* renamed from: d */
    private DisplayAdController f9909d;
    /* renamed from: e */
    private boolean f9910e = false;
    /* renamed from: f */
    private RewardedVideoAdListener f9911f;
    /* renamed from: g */
    private RewardData f9912g;
    /* renamed from: h */
    private int f9913h = -1;

    /* renamed from: com.facebook.ads.RewardedVideoAd$1 */
    class C32421 extends C1350a {
        /* renamed from: a */
        final /* synthetic */ RewardedVideoAd f9905a;

        C32421(RewardedVideoAd rewardedVideoAd) {
            this.f9905a = rewardedVideoAd;
        }

        /* renamed from: a */
        public void mo1636a() {
            if (this.f9905a.f9911f != null) {
                this.f9905a.f9911f.onAdClicked(this.f9905a);
            }
        }

        /* renamed from: a */
        public void mo1638a(AdAdapter adAdapter) {
            aa aaVar = (aa) adAdapter;
            if (this.f9905a.f9912g != null) {
                aaVar.m12521a(this.f9905a.f9912g);
            }
            this.f9905a.f9913h = aaVar.mo3335b();
            this.f9905a.f9910e = true;
            if (this.f9905a.f9911f != null) {
                this.f9905a.f9911f.onAdLoaded(this.f9905a);
            }
        }

        /* renamed from: a */
        public void mo1639a(C1373b c1373b) {
            if (this.f9905a.f9911f != null) {
                this.f9905a.f9911f.onError(this.f9905a, c1373b.m4796b());
            }
        }

        /* renamed from: b */
        public void mo1640b() {
            if (this.f9905a.f9911f != null) {
                this.f9905a.f9911f.onLoggingImpression(this.f9905a);
            }
        }

        /* renamed from: f */
        public void mo1690f() {
            this.f9905a.f9911f.onRewardedVideoCompleted();
        }

        /* renamed from: g */
        public void mo1691g() {
            if (this.f9905a.f9911f != null) {
                this.f9905a.f9911f.onRewardedVideoClosed();
            }
        }

        /* renamed from: h */
        public void mo1692h() {
            if (this.f9905a.f9911f instanceof S2SRewardedVideoAdListener) {
                ((S2SRewardedVideoAdListener) this.f9905a.f9911f).onRewardServerFailed();
            }
        }

        /* renamed from: i */
        public void mo1693i() {
            if (this.f9905a.f9911f instanceof S2SRewardedVideoAdListener) {
                ((S2SRewardedVideoAdListener) this.f9905a.f9911f).onRewardServerSuccess();
            }
        }
    }

    public RewardedVideoAd(Context context, String str) {
        this.f9907b = context;
        this.f9908c = str;
    }

    /* renamed from: a */
    private void m12425a(String str, boolean z) {
        try {
            m12429b(str, z);
        } catch (Throwable e) {
            Log.e(f9906a, "Error loading rewarded video ad", e);
            if (this.f9911f != null) {
                this.f9911f.onError(this, AdError.INTERNAL_ERROR);
            }
        }
    }

    /* renamed from: a */
    private final void m12426a(boolean z) {
        if (this.f9909d != null) {
            this.f9909d.m12498b(z);
            this.f9909d = null;
        }
    }

    /* renamed from: b */
    private void m12429b(String str, boolean z) {
        m12426a(false);
        this.f9910e = false;
        this.f9909d = new DisplayAdController(this.f9907b, this.f9908c, C1522c.REWARDED_VIDEO, AdPlacementType.REWARDED_VIDEO, AdSize.INTERSTITIAL, C1521b.ADS, 1, true);
        this.f9909d.m12495a(z);
        this.f9909d.m12491a(new C32421(this));
        this.f9909d.m12494a(str);
    }

    public void destroy() {
        m12426a(true);
    }

    public String getPlacementId() {
        return this.f9908c;
    }

    public int getVideoDuration() {
        return this.f9913h;
    }

    public boolean isAdLoaded() {
        return this.f9910e;
    }

    public void loadAd() {
        m12425a(null, false);
    }

    public void loadAd(boolean z) {
        m12425a(null, z);
    }

    public void loadAdFromBid(String str) {
        m12425a(str, false);
    }

    public void loadAdFromBid(String str, boolean z) {
        m12425a(str, z);
    }

    public void setAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f9911f = rewardedVideoAdListener;
    }

    public void setRewardData(RewardData rewardData) {
        this.f9912g = rewardData;
    }

    public boolean show() {
        return show(-1);
    }

    public boolean show(int i) {
        if (this.f9910e) {
            this.f9909d.m12490a(i);
            this.f9909d.m12496b();
            this.f9910e = false;
            return true;
        }
        if (this.f9911f != null) {
            this.f9911f.onError(this, AdError.INTERNAL_ERROR);
        }
        return false;
    }
}
