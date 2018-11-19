package com.tinder.tinderplus.adapters;

import com.tinder.boost.p178a.C10400d;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.bk;
import com.tinder.passport.p093d.C3945a;
import com.tinder.paywall.p305d.C10057a;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.tinderplus.p428a.C15193i;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.tinderplus.adapters.c */
public final class C16934c implements MembersInjector<RecyclerAdapterTPlusControl> {
    /* renamed from: a */
    private final Provider<C3945a> f52195a;
    /* renamed from: b */
    private final Provider<bk> f52196b;
    /* renamed from: c */
    private final Provider<ManagerAnalytics> f52197c;
    /* renamed from: d */
    private final Provider<C10400d> f52198d;
    /* renamed from: e */
    private final Provider<C15071e> f52199e;
    /* renamed from: f */
    private final Provider<C15193i> f52200f;
    /* renamed from: g */
    private final Provider<C10057a> f52201g;

    public /* synthetic */ void injectMembers(Object obj) {
        m62610a((RecyclerAdapterTPlusControl) obj);
    }

    /* renamed from: a */
    public void m62610a(RecyclerAdapterTPlusControl recyclerAdapterTPlusControl) {
        C16934c.m62606a(recyclerAdapterTPlusControl, (C3945a) this.f52195a.get());
        C16934c.m62605a(recyclerAdapterTPlusControl, (bk) this.f52196b.get());
        C16934c.m62604a(recyclerAdapterTPlusControl, (ManagerAnalytics) this.f52197c.get());
        C16934c.m62603a(recyclerAdapterTPlusControl, (C10400d) this.f52198d.get());
        C16934c.m62608a(recyclerAdapterTPlusControl, (C15071e) this.f52199e.get());
        C16934c.m62609a(recyclerAdapterTPlusControl, (C15193i) this.f52200f.get());
        C16934c.m62607a(recyclerAdapterTPlusControl, (C10057a) this.f52201g.get());
    }

    /* renamed from: a */
    public static void m62606a(RecyclerAdapterTPlusControl recyclerAdapterTPlusControl, C3945a c3945a) {
        recyclerAdapterTPlusControl.f52180a = c3945a;
    }

    /* renamed from: a */
    public static void m62605a(RecyclerAdapterTPlusControl recyclerAdapterTPlusControl, bk bkVar) {
        recyclerAdapterTPlusControl.f52181b = bkVar;
    }

    /* renamed from: a */
    public static void m62604a(RecyclerAdapterTPlusControl recyclerAdapterTPlusControl, ManagerAnalytics managerAnalytics) {
        recyclerAdapterTPlusControl.f52182c = managerAnalytics;
    }

    /* renamed from: a */
    public static void m62603a(RecyclerAdapterTPlusControl recyclerAdapterTPlusControl, C10400d c10400d) {
        recyclerAdapterTPlusControl.f52183d = c10400d;
    }

    /* renamed from: a */
    public static void m62608a(RecyclerAdapterTPlusControl recyclerAdapterTPlusControl, C15071e c15071e) {
        recyclerAdapterTPlusControl.f52184e = c15071e;
    }

    /* renamed from: a */
    public static void m62609a(RecyclerAdapterTPlusControl recyclerAdapterTPlusControl, C15193i c15193i) {
        recyclerAdapterTPlusControl.f52185f = c15193i;
    }

    /* renamed from: a */
    public static void m62607a(RecyclerAdapterTPlusControl recyclerAdapterTPlusControl, C10057a c10057a) {
        recyclerAdapterTPlusControl.f52186g = c10057a;
    }
}
