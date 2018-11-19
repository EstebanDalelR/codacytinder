package com.tinder.profile.view;

import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.profile.presenter.C14422a;
import com.tinder.recs.RecsPhotoUrlFactory;
import com.tinder.recs.card.CardSizeProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.view.c */
public final class C16157c implements MembersInjector<BasicInfoView> {
    /* renamed from: a */
    private final Provider<CardSizeProvider> f50326a;
    /* renamed from: b */
    private final Provider<RecsPhotoUrlFactory> f50327b;
    /* renamed from: c */
    private final Provider<FastMatchConfigProvider> f50328c;
    /* renamed from: d */
    private final Provider<TopPicksConfig> f50329d;
    /* renamed from: e */
    private final Provider<C14422a> f50330e;

    public /* synthetic */ void injectMembers(Object obj) {
        m61070a((BasicInfoView) obj);
    }

    /* renamed from: a */
    public void m61070a(BasicInfoView basicInfoView) {
        C16157c.m61069a(basicInfoView, (CardSizeProvider) this.f50326a.get());
        C16157c.m61068a(basicInfoView, (RecsPhotoUrlFactory) this.f50327b.get());
        C16157c.m61066a(basicInfoView, (FastMatchConfigProvider) this.f50328c.get());
        C16157c.m61065a(basicInfoView, (TopPicksConfig) this.f50329d.get());
        C16157c.m61067a(basicInfoView, (C14422a) this.f50330e.get());
    }

    /* renamed from: a */
    public static void m61069a(BasicInfoView basicInfoView, CardSizeProvider cardSizeProvider) {
        basicInfoView.f45743a = cardSizeProvider;
    }

    /* renamed from: a */
    public static void m61068a(BasicInfoView basicInfoView, RecsPhotoUrlFactory recsPhotoUrlFactory) {
        basicInfoView.f45744b = recsPhotoUrlFactory;
    }

    /* renamed from: a */
    public static void m61066a(BasicInfoView basicInfoView, FastMatchConfigProvider fastMatchConfigProvider) {
        basicInfoView.f45745c = fastMatchConfigProvider;
    }

    /* renamed from: a */
    public static void m61065a(BasicInfoView basicInfoView, TopPicksConfig topPicksConfig) {
        basicInfoView.f45746d = topPicksConfig;
    }

    /* renamed from: a */
    public static void m61067a(BasicInfoView basicInfoView, C14422a c14422a) {
        basicInfoView.f45747e = c14422a;
    }
}
