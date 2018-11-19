package com.google.android.gms.internal;

import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.util.C2520d;
import java.util.HashMap;
import java.util.Map;

@zzzv
public final class li extends ajz {
    /* renamed from: a */
    private final zzamp f26915a;
    /* renamed from: b */
    private final Object f26916b = new Object();
    /* renamed from: c */
    private final boolean f26917c;
    /* renamed from: d */
    private final boolean f26918d;
    /* renamed from: e */
    private final float f26919e;
    /* renamed from: f */
    private int f26920f;
    /* renamed from: g */
    private zzlo f26921g;
    /* renamed from: h */
    private boolean f26922h;
    /* renamed from: i */
    private boolean f26923i = true;
    /* renamed from: j */
    private float f26924j;
    /* renamed from: k */
    private float f26925k;
    /* renamed from: l */
    private boolean f26926l = true;
    /* renamed from: m */
    private boolean f26927m;
    /* renamed from: n */
    private boolean f26928n;

    public li(zzamp zzamp, float f, boolean z, boolean z2) {
        this.f26915a = zzamp;
        this.f26919e = f;
        this.f26917c = z;
        this.f26918d = z2;
    }

    /* renamed from: a */
    private final void m31599a(String str, @Nullable Map<String, String> map) {
        Map hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        ar.e();
        fk.m19700a(new lj(this, hashMap));
    }

    /* renamed from: a */
    public final void m31604a(float f, int i, boolean z, float f2) {
        boolean z2;
        int i2;
        synchronized (this.f26916b) {
            this.f26924j = f;
            z2 = this.f26923i;
            this.f26923i = z;
            i2 = this.f26920f;
            this.f26920f = i;
            f = this.f26925k;
            this.f26925k = f2;
            if (Math.abs(this.f26925k - f) > 1.0E-4f) {
                zzamp zzamp = this.f26915a;
                if (zzamp == null) {
                    throw null;
                }
                ((View) zzamp).invalidate();
            }
        }
        ar.e();
        fk.m19700a(new lk(this, i2, i, z2, z));
    }

    /* renamed from: a */
    public final void m31605a(zzmr zzmr) {
        synchronized (this.f26916b) {
            this.f26926l = zzmr.zzbgx;
            this.f26927m = zzmr.zzbgy;
            this.f26928n = zzmr.zzbgz;
        }
        m31599a("initialState", C2520d.a("muteStart", zzmr.zzbgx ? "1" : "0", "customControlsRequested", zzmr.zzbgy ? "1" : "0", "clickToExpandRequested", zzmr.zzbgz ? "1" : "0"));
    }

    public final float getAspectRatio() {
        float f;
        synchronized (this.f26916b) {
            f = this.f26925k;
        }
        return f;
    }

    public final int getPlaybackState() {
        int i;
        synchronized (this.f26916b) {
            i = this.f26920f;
        }
        return i;
    }

    public final boolean isClickToExpandEnabled() {
        boolean isCustomControlsEnabled = isCustomControlsEnabled();
        synchronized (this.f26916b) {
            if (!isCustomControlsEnabled) {
                if (this.f26928n && this.f26918d) {
                    isCustomControlsEnabled = true;
                }
            }
            isCustomControlsEnabled = false;
        }
        return isCustomControlsEnabled;
    }

    public final boolean isCustomControlsEnabled() {
        boolean z;
        synchronized (this.f26916b) {
            z = this.f26917c && this.f26927m;
        }
        return z;
    }

    public final boolean isMuted() {
        boolean z;
        synchronized (this.f26916b) {
            z = this.f26923i;
        }
        return z;
    }

    public final void mute(boolean z) {
        m31599a(z ? "mute" : "unmute", null);
    }

    public final void pause() {
        m31599a("pause", null);
    }

    public final void play() {
        m31599a("play", null);
    }

    public final void zza(zzlo zzlo) {
        synchronized (this.f26916b) {
            this.f26921g = zzlo;
        }
    }

    public final float zzih() {
        return this.f26919e;
    }

    public final float zzii() {
        float f;
        synchronized (this.f26916b) {
            f = this.f26924j;
        }
        return f;
    }

    public final zzlo zzij() throws RemoteException {
        zzlo zzlo;
        synchronized (this.f26916b) {
            zzlo = this.f26921g;
        }
        return zzlo;
    }
}
