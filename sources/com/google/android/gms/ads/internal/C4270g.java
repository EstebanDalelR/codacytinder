package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.util.C0562m;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.ajh;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.internal.zzqq;
import com.google.android.gms.internal.zzqt;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.internal.zzrc;
import com.google.android.gms.internal.zzrf;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.g */
public final class C4270g extends ajh {
    /* renamed from: a */
    private final Context f13856a;
    /* renamed from: b */
    private final zzkh f13857b;
    /* renamed from: c */
    private final zzux f13858c;
    @Nullable
    /* renamed from: d */
    private final zzqq f13859d;
    @Nullable
    /* renamed from: e */
    private final zzrc f13860e;
    @Nullable
    /* renamed from: f */
    private final zzqt f13861f;
    @Nullable
    /* renamed from: g */
    private final zzrf f13862g;
    @Nullable
    /* renamed from: h */
    private final zzjn f13863h;
    @Nullable
    /* renamed from: i */
    private final PublisherAdViewOptions f13864i;
    /* renamed from: j */
    private final C0562m<String, zzqz> f13865j;
    /* renamed from: k */
    private final C0562m<String, zzqw> f13866k;
    /* renamed from: l */
    private final zzpe f13867l;
    /* renamed from: m */
    private final List<String> f13868m;
    /* renamed from: n */
    private final zzld f13869n;
    /* renamed from: o */
    private final String f13870o;
    /* renamed from: p */
    private final zzakd f13871p;
    @Nullable
    /* renamed from: q */
    private WeakReference<av> f13872q;
    /* renamed from: r */
    private final bn f13873r;
    /* renamed from: s */
    private final Object f13874s = new Object();

    C4270g(Context context, String str, zzux zzux, zzakd zzakd, zzkh zzkh, zzqq zzqq, zzrc zzrc, zzqt zzqt, C0562m<String, zzqz> c0562m, C0562m<String, zzqw> c0562m2, zzpe zzpe, zzld zzld, bn bnVar, zzrf zzrf, zzjn zzjn, PublisherAdViewOptions publisherAdViewOptions) {
        this.f13856a = context;
        this.f13870o = str;
        this.f13858c = zzux;
        this.f13871p = zzakd;
        this.f13857b = zzkh;
        this.f13861f = zzqt;
        this.f13859d = zzqq;
        this.f13860e = zzrc;
        this.f13865j = c0562m;
        this.f13866k = c0562m2;
        this.f13867l = zzpe;
        this.f13868m = m17128c();
        this.f13869n = zzld;
        this.f13873r = bnVar;
        this.f13862g = zzrf;
        this.f13863h = zzjn;
        this.f13864i = publisherAdViewOptions;
        alo.a(this.f13856a);
    }

    /* renamed from: a */
    private final void m17122a(zzjj zzjj) {
        C4269a biVar = new bi(this.f13856a, this.f13873r, this.f13863h, this.f13870o, this.f13858c, this.f13871p);
        this.f13872q = new WeakReference(biVar);
        zzrf zzrf = this.f13862g;
        ad.m9053b("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
        biVar.e.f7184x = zzrf;
        if (this.f13864i != null) {
            if (this.f13864i.zzbn() != null) {
                biVar.zza(this.f13864i.zzbn());
            }
            biVar.setManualImpressionsEnabled(this.f13864i.getManualImpressionsEnabled());
        }
        zzqq zzqq = this.f13859d;
        ad.m9053b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        biVar.e.f7177q = zzqq;
        zzqt zzqt = this.f13861f;
        ad.m9053b("setOnContentAdLoadedListener must be called on the main UI thread.");
        biVar.e.f7178r = zzqt;
        C0562m c0562m = this.f13865j;
        ad.m9053b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        biVar.e.f7180t = c0562m;
        c0562m = this.f13866k;
        ad.m9053b("setOnCustomClickListener must be called on the main UI thread.");
        biVar.e.f7179s = c0562m;
        zzpe zzpe = this.f13867l;
        ad.m9053b("setNativeAdOptions must be called on the main UI thread.");
        biVar.e.f7181u = zzpe;
        biVar.m18591b(m17128c());
        biVar.zza(this.f13857b);
        biVar.zza(this.f13869n);
        List arrayList = new ArrayList();
        if (m17126b()) {
            arrayList.add(Integer.valueOf(1));
        }
        if (this.f13862g != null) {
            arrayList.add(Integer.valueOf(2));
        }
        biVar.m18592c(arrayList);
        if (m17126b()) {
            zzjj.extras.putBoolean("ina", true);
        }
        if (this.f13862g != null) {
            zzjj.extras.putBoolean("iba", true);
        }
        biVar.zzb(zzjj);
    }

    /* renamed from: a */
    private final void m17123a(zzjj zzjj, int i) {
        C4269a aaVar = new aa(this.f13856a, this.f13873r, zzjn.zzf(this.f13856a), this.f13870o, this.f13858c, this.f13871p);
        this.f13872q = new WeakReference(aaVar);
        zzqq zzqq = this.f13859d;
        ad.m9053b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        aaVar.e.f7177q = zzqq;
        zzqt zzqt = this.f13861f;
        ad.m9053b("setOnContentAdLoadedListener must be called on the main UI thread.");
        aaVar.e.f7178r = zzqt;
        C0562m c0562m = this.f13865j;
        ad.m9053b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        aaVar.e.f7180t = c0562m;
        aaVar.zza(this.f13857b);
        c0562m = this.f13866k;
        ad.m9053b("setOnCustomClickListener must be called on the main UI thread.");
        aaVar.e.f7179s = c0562m;
        aaVar.m18567b(m17128c());
        zzpe zzpe = this.f13867l;
        ad.m9053b("setNativeAdOptions must be called on the main UI thread.");
        aaVar.e.f7181u = zzpe;
        aaVar.zza(this.f13869n);
        aaVar.m18566b(i);
        aaVar.zzb(zzjj);
    }

    /* renamed from: a */
    private static void m17124a(Runnable runnable) {
        fk.f16060a.post(runnable);
    }

    /* renamed from: a */
    private final boolean m17125a() {
        return ((Boolean) aja.f().a(alo.aA)).booleanValue() && this.f13862g != null;
    }

    /* renamed from: b */
    private final boolean m17126b() {
        if (this.f13859d == null && this.f13861f == null) {
            if (this.f13865j == null || this.f13865j.size() <= 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private final List<String> m17128c() {
        List<String> arrayList = new ArrayList();
        if (this.f13861f != null) {
            arrayList.add("1");
        }
        if (this.f13859d != null) {
            arrayList.add("2");
        }
        if (this.f13865j.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    public final java.lang.String getMediationAdapterClassName() {
        /*
        r3 = this;
        r0 = r3.f13874s;
        monitor-enter(r0);
        r1 = r3.f13872q;	 Catch:{ all -> 0x001a }
        r2 = 0;
        if (r1 == 0) goto L_0x0018;
    L_0x0008:
        r1 = r3.f13872q;	 Catch:{ all -> 0x001a }
        r1 = r1.get();	 Catch:{ all -> 0x001a }
        r1 = (com.google.android.gms.ads.internal.av) r1;	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0016;
    L_0x0012:
        r2 = r1.getMediationAdapterClassName();	 Catch:{ all -> 0x001a }
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x001a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.g.getMediationAdapterClassName():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isLoading() {
        /*
        r3 = this;
        r0 = r3.f13874s;
        monitor-enter(r0);
        r1 = r3.f13872q;	 Catch:{ all -> 0x001a }
        r2 = 0;
        if (r1 == 0) goto L_0x0018;
    L_0x0008:
        r1 = r3.f13872q;	 Catch:{ all -> 0x001a }
        r1 = r1.get();	 Catch:{ all -> 0x001a }
        r1 = (com.google.android.gms.ads.internal.av) r1;	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0016;
    L_0x0012:
        r2 = r1.isLoading();	 Catch:{ all -> 0x001a }
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x001a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.g.isLoading():boolean");
    }

    public final void zza(zzjj zzjj, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Number of ads has to be more than 0");
        }
        C4270g.m17124a(new C2381i(this, zzjj, i));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    public final java.lang.String zzcp() {
        /*
        r3 = this;
        r0 = r3.f13874s;
        monitor-enter(r0);
        r1 = r3.f13872q;	 Catch:{ all -> 0x001a }
        r2 = 0;
        if (r1 == 0) goto L_0x0018;
    L_0x0008:
        r1 = r3.f13872q;	 Catch:{ all -> 0x001a }
        r1 = r1.get();	 Catch:{ all -> 0x001a }
        r1 = (com.google.android.gms.ads.internal.av) r1;	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0016;
    L_0x0012:
        r2 = r1.zzcp();	 Catch:{ all -> 0x001a }
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x001a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.g.zzcp():java.lang.String");
    }

    public final void zzd(zzjj zzjj) {
        C4270g.m17124a(new C2380h(this, zzjj));
    }
}
