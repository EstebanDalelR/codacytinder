package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.ad;
import java.util.Iterator;
import java.util.LinkedList;

@zzzv
final class aqq {
    /* renamed from: a */
    private final LinkedList<aqr> f15588a = new LinkedList();
    /* renamed from: b */
    private zzjj f15589b;
    /* renamed from: c */
    private final String f15590c;
    /* renamed from: d */
    private final int f15591d;
    /* renamed from: e */
    private boolean f15592e;

    aqq(zzjj zzjj, String str, int i) {
        ad.a(zzjj);
        ad.a(str);
        this.f15589b = zzjj;
        this.f15590c = str;
        this.f15591d = i;
    }

    /* renamed from: a */
    final aqr m19427a(@Nullable zzjj zzjj) {
        if (zzjj != null) {
            this.f15589b = zzjj;
        }
        return (aqr) this.f15588a.remove();
    }

    /* renamed from: a */
    final zzjj m19428a() {
        return this.f15589b;
    }

    /* renamed from: a */
    final void m19429a(apk apk, zzjj zzjj) {
        this.f15588a.add(new aqr(this, apk, zzjj));
    }

    /* renamed from: a */
    final boolean m19430a(apk apk) {
        aqr aqr = new aqr(this, apk);
        this.f15588a.add(aqr);
        return aqr.m19438a();
    }

    /* renamed from: b */
    final int m19431b() {
        return this.f15591d;
    }

    /* renamed from: c */
    final String m19432c() {
        return this.f15590c;
    }

    /* renamed from: d */
    final int m19433d() {
        return this.f15588a.size();
    }

    /* renamed from: e */
    final int m19434e() {
        Iterator it = this.f15588a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((aqr) it.next()).f15597e) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: f */
    final int m19435f() {
        Iterator it = this.f15588a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((aqr) it.next()).m19438a()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: g */
    final void m19436g() {
        this.f15592e = true;
    }

    /* renamed from: h */
    final boolean m19437h() {
        return this.f15592e;
    }
}
