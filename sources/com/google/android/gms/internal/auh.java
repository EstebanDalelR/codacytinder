package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.internal.ad;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@zzzv
public abstract class auh implements zzaif<Void>, zzanm {
    /* renamed from: a */
    protected final Context f23163a;
    /* renamed from: b */
    protected final zzanh f23164b;
    /* renamed from: c */
    protected zzaax f23165c;
    /* renamed from: d */
    private zzyb f23166d;
    /* renamed from: e */
    private dm f23167e;
    /* renamed from: f */
    private Runnable f23168f;
    /* renamed from: g */
    private Object f23169g = new Object();
    /* renamed from: h */
    private AtomicBoolean f23170h = new AtomicBoolean(true);

    protected auh(Context context, dm dmVar, zzanh zzanh, zzyb zzyb) {
        this.f23163a = context;
        this.f23167e = dmVar;
        this.f23165c = this.f23167e.f15996b;
        this.f23164b = zzanh;
        this.f23166d = zzyb;
    }

    /* renamed from: a */
    protected abstract void mo6852a();

    /* renamed from: a */
    protected void mo7430a(int i) {
        auh auh = this;
        int i2 = i;
        if (i2 != -2) {
            auh.f23165c = new zzaax(i2, auh.f23165c.zzcdq);
        }
        auh.f23164b.zzst();
        zzyb zzyb = auh.f23166d;
        zzaat zzaat = auh.f23167e.f15995a;
        zzjj zzjj = zzaat.zzcnd;
        zzanh zzanh = auh.f23164b;
        List list = auh.f23165c.zzcdk;
        List list2 = auh.f23165c.zzcdl;
        List list3 = auh.f23165c.zzcoy;
        int i3 = auh.f23165c.orientation;
        long j = auh.f23165c.zzcdq;
        String str = zzaat.zzcng;
        boolean z = auh.f23165c.zzcow;
        long j2 = auh.f23165c.zzcox;
        zzjn zzjn = auh.f23167e.f15998d;
        long j3 = j2;
        zzyb zzyb2 = zzyb;
        long j4 = auh.f23165c.zzcov;
        long j5 = auh.f23167e.f16000f;
        long j6 = auh.f23165c.zzcpa;
        String str2 = auh.f23165c.zzcpb;
        JSONObject jSONObject = auh.f23167e.f16002h;
        zzaeq zzaeq = auh.f23165c.zzcpl;
        List list4 = auh.f23165c.zzcpm;
        List list5 = auh.f23165c.zzcpn;
        boolean z2 = auh.f23165c.zzcpo;
        zzaaz zzaaz = auh.f23165c.zzcpp;
        List list6 = auh.f23165c.zzcdn;
        String str3 = auh.f23165c.zzcps;
        ahw ahw = auh.f23167e.f16003i;
        String str4 = str2;
        zzva zzva = null;
        dl dlVar = r41;
        zzyb zzyb3 = zzyb2;
        String str5 = null;
        arj arj = null;
        ark ark = null;
        long j7 = j3;
        long j8 = j4;
        long j9 = j5;
        long j10 = j6;
        dl dlVar2 = new dl(zzjj, zzanh, list, i2, list2, list3, i3, j, str, z, null, zzva, str5, arj, ark, j7, zzjn, j8, j9, j10, str4, jSONObject, null, zzaeq, list4, list5, z2, zzaaz, null, list6, str3, ahw, auh.f23167e.f15996b.zzaqv, auh.f23167e.f16004j);
        zzyb3.zzb(dlVar);
    }

    public void cancel() {
        if (this.f23170h.getAndSet(false)) {
            this.f23164b.stopLoading();
            ar.g();
            fq.m19761a(this.f23164b);
            mo7430a(-1);
            fk.f16060a.removeCallbacks(this.f23168f);
        }
    }

    public final void zza(zzanh zzanh, boolean z) {
        hx.m19911b("WebView finished loading.");
        int i = 0;
        if (this.f23170h.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            mo7430a(i);
            fk.f16060a.removeCallbacks(this.f23168f);
        }
    }

    public final /* synthetic */ Object zznd() {
        ad.b("Webview render task needs to be called on UI thread.");
        this.f23168f = new aui(this);
        fk.f16060a.postDelayed(this.f23168f, ((Long) aja.m19221f().m19334a(alo.bn)).longValue());
        mo6852a();
        return null;
    }
}
