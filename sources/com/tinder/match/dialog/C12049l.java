package com.tinder.match.dialog;

import com.tinder.chat.activity.C8406b;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.apprating.AppRatingRepository;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.match.dialog.l */
public final class C12049l implements MembersInjector<C12043a> {
    /* renamed from: a */
    private final Provider<C9862h> f39186a;
    /* renamed from: b */
    private final Provider<C8406b> f39187b;
    /* renamed from: c */
    private final Provider<AppRatingRepository> f39188c;
    /* renamed from: d */
    private final Provider<AbTestUtility> f39189d;

    public /* synthetic */ void injectMembers(Object obj) {
        m48163a((C12043a) obj);
    }

    /* renamed from: a */
    public void m48163a(C12043a c12043a) {
        C12049l.m48162a(c12043a, (C9862h) this.f39186a.get());
        C12049l.m48159a(c12043a, (C8406b) this.f39187b.get());
        C12049l.m48161a(c12043a, (AppRatingRepository) this.f39188c.get());
        C12049l.m48160a(c12043a, (AbTestUtility) this.f39189d.get());
    }

    /* renamed from: a */
    public static void m48162a(C12043a c12043a, C9862h c9862h) {
        c12043a.f39157a = c9862h;
    }

    /* renamed from: a */
    public static void m48159a(C12043a c12043a, C8406b c8406b) {
        c12043a.f39158b = c8406b;
    }

    /* renamed from: a */
    public static void m48161a(C12043a c12043a, AppRatingRepository appRatingRepository) {
        c12043a.f39159c = appRatingRepository;
    }

    /* renamed from: a */
    public static void m48160a(C12043a c12043a, AbTestUtility abTestUtility) {
        c12043a.f39160d = abTestUtility;
    }
}
