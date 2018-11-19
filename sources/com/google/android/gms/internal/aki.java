package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.C2338a;
import com.google.android.gms.ads.C2362g;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.C2347c;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@zzzv
public final class aki {
    /* renamed from: a */
    private final arv f15381a;
    /* renamed from: b */
    private final Context f15382b;
    /* renamed from: c */
    private final ain f15383c;
    /* renamed from: d */
    private C2338a f15384d;
    /* renamed from: e */
    private zzje f15385e;
    /* renamed from: f */
    private zzks f15386f;
    /* renamed from: g */
    private String f15387g;
    /* renamed from: h */
    private AppEventListener f15388h;
    /* renamed from: i */
    private C2347c f15389i;
    /* renamed from: j */
    private OnCustomRenderedAdLoadedListener f15390j;
    /* renamed from: k */
    private C2362g f15391k;
    /* renamed from: l */
    private RewardedVideoAdListener f15392l;
    /* renamed from: m */
    private boolean f15393m;
    /* renamed from: n */
    private boolean f15394n;

    public aki(Context context) {
        this(context, ain.f15308a, null);
    }

    private aki(Context context, ain ain, C2347c c2347c) {
        this.f15381a = new arv();
        this.f15382b = context;
        this.f15383c = ain;
        this.f15389i = c2347c;
    }

    /* renamed from: b */
    private final void m19294b(String str) {
        if (this.f15386f == null) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 63);
            stringBuilder.append("The ad unit ID must be set on InterstitialAd before ");
            stringBuilder.append(str);
            stringBuilder.append(" is called.");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final void m19295a() {
        try {
            m19294b("show");
            this.f15386f.showInterstitial();
        } catch (Throwable e) {
            hx.m19914c("Failed to show interstitial.", e);
        }
    }

    /* renamed from: a */
    public final void m19296a(C2338a c2338a) {
        try {
            this.f15384d = c2338a;
            if (this.f15386f != null) {
                this.f15386f.zza(c2338a != null ? new aii(c2338a) : null);
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to set the AdListener.", e);
        }
    }

    /* renamed from: a */
    public final void m19297a(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.f15392l = rewardedVideoAdListener;
            if (this.f15386f != null) {
                this.f15386f.zza(rewardedVideoAdListener != null ? new cb(rewardedVideoAdListener) : null);
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to set the AdListener.", e);
        }
    }

    /* renamed from: a */
    public final void m19298a(ake ake) {
        try {
            if (this.f15386f == null) {
                String str = "loadAd";
                if (this.f15387g == null) {
                    m19294b(str);
                }
                zzjn zzhs = this.f15393m ? zzjn.zzhs() : new zzjn();
                aiq b = aja.m19217b();
                Context context = this.f15382b;
                this.f15386f = (zzks) aiq.m19203a(context, false, new ait(b, context, zzhs, this.f15387g, this.f15381a));
                if (this.f15384d != null) {
                    this.f15386f.zza(new aii(this.f15384d));
                }
                if (this.f15385e != null) {
                    this.f15386f.zza(new aih(this.f15385e));
                }
                if (this.f15388h != null) {
                    this.f15386f.zza(new aip(this.f15388h));
                }
                if (this.f15390j != null) {
                    this.f15386f.zza(new ami(this.f15390j));
                }
                if (this.f15391k != null) {
                    this.f15386f.zza(this.f15391k.a());
                }
                if (this.f15392l != null) {
                    this.f15386f.zza(new cb(this.f15392l));
                }
                this.f15386f.setImmersiveMode(this.f15394n);
            }
            if (this.f15386f.zzb(ain.m19196a(this.f15382b, ake))) {
                this.f15381a.m31507a(ake.m19236j());
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public final void m19299a(zzje zzje) {
        try {
            this.f15385e = zzje;
            if (this.f15386f != null) {
                this.f15386f.zza(zzje != null ? new aih(zzje) : null);
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to set the AdClickListener.", e);
        }
    }

    /* renamed from: a */
    public final void m19300a(String str) {
        if (this.f15387g != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.f15387g = str;
    }

    /* renamed from: a */
    public final void m19301a(boolean z) {
        this.f15393m = true;
    }

    /* renamed from: b */
    public final void m19302b(boolean z) {
        try {
            this.f15394n = z;
            if (this.f15386f != null) {
                this.f15386f.setImmersiveMode(z);
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to set immersive mode", e);
        }
    }
}
