package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.C2412j;
import com.google.android.gms.ads.formats.C2353b;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.C4296b;
import java.util.List;
import java.util.WeakHashMap;

@zzzv
public final class aof implements NativeCustomTemplateAd {
    /* renamed from: a */
    private static WeakHashMap<IBinder, aof> f23030a = new WeakHashMap();
    /* renamed from: b */
    private final zzqm f23031b;
    /* renamed from: c */
    private final C2353b f23032c;
    /* renamed from: d */
    private final C2412j f23033d = new C2412j();

    private aof(zzqm zzqm) {
        Context context;
        this.f23031b = zzqm;
        C2353b c2353b = null;
        try {
            context = (Context) C4296b.a(zzqm.zzka());
        } catch (Throwable e) {
            hx.m19912b("Unable to inflate MediaView.", e);
            context = null;
        }
        if (context != null) {
            C2353b c2353b2 = new C2353b(context);
            try {
                if (this.f23031b.zzf(C4296b.a(c2353b2))) {
                    c2353b = c2353b2;
                }
            } catch (Throwable e2) {
                hx.m19912b("Unable to render video in MediaView.", e2);
            }
        }
        this.f23032c = c2353b;
    }

    /* renamed from: a */
    public static aof m27165a(zzqm zzqm) {
        synchronized (f23030a) {
            aof aof = (aof) f23030a.get(zzqm.asBinder());
            if (aof != null) {
                return aof;
            }
            aof = new aof(zzqm);
            f23030a.put(zzqm.asBinder(), aof);
            return aof;
        }
    }

    /* renamed from: a */
    public final zzqm m27166a() {
        return this.f23031b;
    }

    public final void destroy() {
        try {
            this.f23031b.destroy();
        } catch (Throwable e) {
            hx.m19912b("Failed to destroy ad.", e);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.f23031b.getAvailableAssetNames();
        } catch (Throwable e) {
            hx.m19912b("Failed to get available asset names.", e);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.f23031b.getCustomTemplateId();
        } catch (Throwable e) {
            hx.m19912b("Failed to get custom template id.", e);
            return null;
        }
    }

    public final C2355b getImage(String str) {
        try {
            zzpq zzaq = this.f23031b.zzaq(str);
            if (zzaq != null) {
                return new anq(zzaq);
            }
        } catch (Throwable e) {
            hx.m19912b("Failed to get image.", e);
        }
        return null;
    }

    public final CharSequence getText(String str) {
        try {
            return this.f23031b.zzap(str);
        } catch (Throwable e) {
            hx.m19912b("Failed to get string.", e);
            return null;
        }
    }

    public final C2412j getVideoController() {
        try {
            zzll videoController = this.f23031b.getVideoController();
            if (videoController != null) {
                this.f23033d.a(videoController);
            }
        } catch (Throwable e) {
            hx.m19912b("Exception occurred while getting video controller", e);
        }
        return this.f23033d;
    }

    public final C2353b getVideoMediaView() {
        return this.f23032c;
    }

    public final void performClick(String str) {
        try {
            this.f23031b.performClick(str);
        } catch (Throwable e) {
            hx.m19912b("Failed to perform click.", e);
        }
    }

    public final void recordImpression() {
        try {
            this.f23031b.recordImpression();
        } catch (Throwable e) {
            hx.m19912b("Failed to record impression.", e);
        }
    }
}
