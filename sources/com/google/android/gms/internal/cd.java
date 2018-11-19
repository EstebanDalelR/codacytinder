package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.C2342c;
import com.google.android.gms.ads.doubleclick.C2345a;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.C4296b;

@zzzv
public final class cd implements RewardedVideoAd {
    /* renamed from: a */
    private final zzadk f23237a;
    /* renamed from: b */
    private final Context f23238b;
    /* renamed from: c */
    private final Object f23239c = new Object();
    /* renamed from: d */
    private RewardedVideoAdListener f23240d;
    /* renamed from: e */
    private String f23241e;

    public cd(Context context, zzadk zzadk) {
        this.f23237a = zzadk;
        this.f23238b = context;
    }

    /* renamed from: a */
    private final void m27273a(String str, ake ake) {
        synchronized (this.f23239c) {
            if (this.f23237a == null) {
                return;
            }
            try {
                this.f23237a.zza(new zzadv(ain.m19196a(this.f23238b, ake), str));
            } catch (Throwable e) {
                hx.m19914c("Could not forward loadAd to RewardedVideoAd", e);
            }
        }
    }

    public final void destroy() {
        destroy(null);
    }

    public final void destroy(Context context) {
        synchronized (this.f23239c) {
            if (this.f23237a == null) {
                return;
            }
            try {
                this.f23237a.zzd(C4296b.a(context));
            } catch (Throwable e) {
                hx.m19914c("Could not forward destroy to RewardedVideoAd", e);
            }
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.f23237a != null) {
                return this.f23237a.getMediationAdapterClassName();
            }
        } catch (Throwable e) {
            hx.m19914c("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener rewardedVideoAdListener;
        synchronized (this.f23239c) {
            rewardedVideoAdListener = this.f23240d;
        }
        return rewardedVideoAdListener;
    }

    public final String getUserId() {
        String str;
        synchronized (this.f23239c) {
            str = this.f23241e;
        }
        return str;
    }

    public final boolean isLoaded() {
        synchronized (this.f23239c) {
            if (this.f23237a == null) {
                return false;
            }
            try {
                boolean isLoaded = this.f23237a.isLoaded();
                return isLoaded;
            } catch (Throwable e) {
                hx.m19914c("Could not forward isLoaded to RewardedVideoAd", e);
                return false;
            }
        }
    }

    public final void loadAd(String str, C2342c c2342c) {
        m27273a(str, c2342c.a());
    }

    public final void loadAd(String str, C2345a c2345a) {
        m27273a(str, c2345a.a());
    }

    public final void pause() {
        pause(null);
    }

    public final void pause(Context context) {
        synchronized (this.f23239c) {
            if (this.f23237a == null) {
                return;
            }
            try {
                this.f23237a.zzb(C4296b.a(context));
            } catch (Throwable e) {
                hx.m19914c("Could not forward pause to RewardedVideoAd", e);
            }
        }
    }

    public final void resume() {
        resume(null);
    }

    public final void resume(Context context) {
        synchronized (this.f23239c) {
            if (this.f23237a == null) {
                return;
            }
            try {
                this.f23237a.zzc(C4296b.a(context));
            } catch (Throwable e) {
                hx.m19914c("Could not forward resume to RewardedVideoAd", e);
            }
        }
    }

    public final void setImmersiveMode(boolean z) {
        synchronized (this.f23239c) {
            if (this.f23237a != null) {
                try {
                    this.f23237a.setImmersiveMode(z);
                } catch (Throwable e) {
                    hx.m19914c("Could not forward setImmersiveMode to RewardedVideoAd", e);
                }
            }
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.f23239c) {
            this.f23240d = rewardedVideoAdListener;
            if (this.f23237a != null) {
                try {
                    this.f23237a.zza(new cb(rewardedVideoAdListener));
                } catch (Throwable e) {
                    hx.m19914c("Could not forward setRewardedVideoAdListener to RewardedVideoAd", e);
                }
            }
        }
    }

    public final void setUserId(String str) {
        synchronized (this.f23239c) {
            this.f23241e = str;
            if (this.f23237a != null) {
                try {
                    this.f23237a.setUserId(str);
                } catch (Throwable e) {
                    hx.m19914c("Could not forward setUserId to RewardedVideoAd", e);
                }
            }
        }
    }

    public final void show() {
        synchronized (this.f23239c) {
            if (this.f23237a == null) {
                return;
            }
            try {
                this.f23237a.show();
            } catch (Throwable e) {
                hx.m19914c("Could not forward show to RewardedVideoAd", e);
            }
        }
    }
}
