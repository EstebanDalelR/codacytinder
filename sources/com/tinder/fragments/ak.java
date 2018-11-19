package com.tinder.fragments;

import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ad;
import com.tinder.managers.bk;
import com.tinder.presenters.C17744d;
import com.tinder.presenters.bf;
import com.tinder.utils.C15377z;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

public final class ak implements MembersInjector<FragmentEditProfile> {
    /* renamed from: a */
    private final Provider<bk> f38630a;
    /* renamed from: b */
    private final Provider<ad> f38631b;
    /* renamed from: c */
    private final Provider<ManagerAnalytics> f38632c;
    /* renamed from: d */
    private final Provider<LegacyBreadCrumbTracker> f38633d;
    /* renamed from: e */
    private final Provider<C17744d> f38634e;
    /* renamed from: f */
    private final Provider<C15377z> f38635f;
    /* renamed from: g */
    private final Provider<bf> f38636g;
    /* renamed from: h */
    private final Provider<C2664c> f38637h;

    public /* synthetic */ void injectMembers(Object obj) {
        m47789a((FragmentEditProfile) obj);
    }

    /* renamed from: a */
    public void m47789a(FragmentEditProfile fragmentEditProfile) {
        m47784a(fragmentEditProfile, (bk) this.f38630a.get());
        m47783a(fragmentEditProfile, (ad) this.f38631b.get());
        m47782a(fragmentEditProfile, (ManagerAnalytics) this.f38632c.get());
        m47781a(fragmentEditProfile, (LegacyBreadCrumbTracker) this.f38633d.get());
        m47786a(fragmentEditProfile, (C17744d) this.f38634e.get());
        m47787a(fragmentEditProfile, (C15377z) this.f38635f.get());
        m47785a(fragmentEditProfile, (bf) this.f38636g.get());
        m47788a(fragmentEditProfile, (C2664c) this.f38637h.get());
    }

    /* renamed from: a */
    public static void m47784a(FragmentEditProfile fragmentEditProfile, bk bkVar) {
        fragmentEditProfile.f42185a = bkVar;
    }

    /* renamed from: a */
    public static void m47783a(FragmentEditProfile fragmentEditProfile, ad adVar) {
        fragmentEditProfile.f42186b = adVar;
    }

    /* renamed from: a */
    public static void m47782a(FragmentEditProfile fragmentEditProfile, ManagerAnalytics managerAnalytics) {
        fragmentEditProfile.f42187c = managerAnalytics;
    }

    /* renamed from: a */
    public static void m47781a(FragmentEditProfile fragmentEditProfile, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        fragmentEditProfile.f42188d = legacyBreadCrumbTracker;
    }

    /* renamed from: a */
    public static void m47786a(FragmentEditProfile fragmentEditProfile, C17744d c17744d) {
        fragmentEditProfile.f42189e = c17744d;
    }

    /* renamed from: a */
    public static void m47787a(FragmentEditProfile fragmentEditProfile, C15377z c15377z) {
        fragmentEditProfile.f42190f = c15377z;
    }

    /* renamed from: a */
    public static void m47785a(FragmentEditProfile fragmentEditProfile, bf bfVar) {
        fragmentEditProfile.f42191g = bfVar;
    }

    /* renamed from: a */
    public static void m47788a(FragmentEditProfile fragmentEditProfile, C2664c c2664c) {
        fragmentEditProfile.f42192h = c2664c;
    }
}
