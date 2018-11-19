package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.doubleclick.C2345a;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.aii;
import com.google.android.gms.internal.ain;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.ake;
import com.google.android.gms.internal.aov;
import com.google.android.gms.internal.aow;
import com.google.android.gms.internal.aox;
import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.arv;
import com.google.android.gms.internal.hx;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzkn;
import com.google.android.gms.internal.zzpe;

/* renamed from: com.google.android.gms.ads.b */
public class C2340b {
    /* renamed from: a */
    private final ain f7028a;
    /* renamed from: b */
    private final Context f7029b;
    /* renamed from: c */
    private final zzkk f7030c;

    /* renamed from: com.google.android.gms.ads.b$a */
    public static class C2339a {
        /* renamed from: a */
        private final Context f7026a;
        /* renamed from: b */
        private final zzkn f7027b;

        private C2339a(Context context, zzkn zzkn) {
            this.f7026a = context;
            this.f7027b = zzkn;
        }

        public C2339a(Context context, String str) {
            this((Context) ad.m9046a((Object) context, (Object) "context cannot be null"), aja.b().a(context, str, new arv()));
        }

        /* renamed from: a */
        public C2339a m8542a(C2338a c2338a) {
            try {
                this.f7027b.zzb(new aii(c2338a));
                return this;
            } catch (Throwable e) {
                hx.c("Failed to set AdListener.", e);
                return this;
            }
        }

        /* renamed from: a */
        public C2339a m8543a(NativeAdOptions nativeAdOptions) {
            try {
                this.f7027b.zza(new zzpe(nativeAdOptions));
                return this;
            } catch (Throwable e) {
                hx.c("Failed to specify native ad options", e);
                return this;
            }
        }

        /* renamed from: a */
        public C2339a m8544a(OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.f7027b.zza(new aov(onAppInstallAdLoadedListener));
                return this;
            } catch (Throwable e) {
                hx.c("Failed to add app install ad listener", e);
                return this;
            }
        }

        /* renamed from: a */
        public C2339a m8545a(OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.f7027b.zza(new aow(onContentAdLoadedListener));
                return this;
            } catch (Throwable e) {
                hx.c("Failed to add content ad listener", e);
                return this;
            }
        }

        /* renamed from: a */
        public C2339a m8546a(String str, OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, OnCustomClickListener onCustomClickListener) {
            try {
                this.f7027b.zza(str, new aoy(onCustomTemplateAdLoadedListener), onCustomClickListener == null ? null : new aox(onCustomClickListener));
                return this;
            } catch (Throwable e) {
                hx.c("Failed to add custom template ad listener", e);
                return this;
            }
        }

        /* renamed from: a */
        public C2340b m8547a() {
            try {
                return new C2340b(this.f7026a, this.f7027b.zzdi());
            } catch (Throwable e) {
                hx.b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    C2340b(Context context, zzkk zzkk) {
        this(context, zzkk, ain.f15308a);
    }

    private C2340b(Context context, zzkk zzkk, ain ain) {
        this.f7029b = context;
        this.f7030c = zzkk;
        this.f7028a = ain;
    }

    /* renamed from: a */
    private final void m8548a(ake ake) {
        try {
            this.f7030c.zzd(ain.a(this.f7029b, ake));
        } catch (Throwable e) {
            hx.b("Failed to load ad.", e);
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public void m8549a(C2342c c2342c) {
        m8548a(c2342c.m8561a());
    }

    /* renamed from: a */
    public void m8550a(C2345a c2345a) {
        m8548a(c2345a.m8572a());
    }
}
