package com.google.android.gms.ads;

import android.support.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.aky;
import com.google.android.gms.internal.hx;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: com.google.android.gms.ads.j */
public final class C2412j {
    /* renamed from: a */
    private final Object f7324a = new Object();
    @Nullable
    /* renamed from: b */
    private zzll f7325b;
    @Nullable
    /* renamed from: c */
    private C2411a f7326c;

    /* renamed from: com.google.android.gms.ads.j$a */
    public static abstract class C2411a {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    /* renamed from: a */
    public final zzll m8746a() {
        zzll zzll;
        synchronized (this.f7324a) {
            zzll = this.f7325b;
        }
        return zzll;
    }

    /* renamed from: a */
    public final void m8747a(C2411a c2411a) {
        ad.m9046a((Object) c2411a, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f7324a) {
            this.f7326c = c2411a;
            if (this.f7325b == null) {
                return;
            }
            try {
                this.f7325b.zza(new aky(c2411a));
            } catch (Throwable e) {
                hx.b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    /* renamed from: a */
    public final void m8748a(zzll zzll) {
        synchronized (this.f7324a) {
            this.f7325b = zzll;
            if (this.f7326c != null) {
                m8747a(this.f7326c);
            }
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public final void m8749a(boolean z) {
        synchronized (this.f7324a) {
            if (this.f7325b == null) {
                return;
            }
            try {
                this.f7325b.mute(z);
            } catch (Throwable e) {
                hx.b("Unable to call mute on video controller.", e);
            }
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public final void m8750b() {
        synchronized (this.f7324a) {
            if (this.f7325b == null) {
                return;
            }
            try {
                this.f7325b.play();
            } catch (Throwable e) {
                hx.b("Unable to call play on video controller.", e);
            }
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public final void m8751c() {
        synchronized (this.f7324a) {
            if (this.f7325b == null) {
                return;
            }
            try {
                this.f7325b.pause();
            } catch (Throwable e) {
                hx.b("Unable to call pause on video controller.", e);
            }
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public final boolean m8752d() {
        synchronized (this.f7324a) {
            if (this.f7325b == null) {
                return true;
            }
            try {
                boolean isMuted = this.f7325b.isMuted();
                return isMuted;
            } catch (Throwable e) {
                hx.b("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    /* renamed from: e */
    public final boolean m8753e() {
        boolean z;
        synchronized (this.f7324a) {
            z = this.f7325b != null;
        }
        return z;
    }

    /* renamed from: f */
    public final float m8754f() {
        synchronized (this.f7324a) {
            if (this.f7325b == null) {
                return 0.0f;
            }
            try {
                float aspectRatio = this.f7325b.getAspectRatio();
                return aspectRatio;
            } catch (Throwable e) {
                hx.b("Unable to call getAspectRatio on video controller.", e);
                return 0.0f;
            }
        }
    }
}
