package com.tinder.application;

import com.tinder.base.p172b.C12612b;
import com.tinder.domain.settings.feed.usecase.LoadFeedSettings_Factory;
import com.tinder.domain.settings.feed.usecase.SaveFeedSettings_Factory;
import com.tinder.settings.feed.analytics.C18066a;
import com.tinder.settings.feed.analytics.C18068c;
import com.tinder.settings.feed.injection.FeedSettingsActivityComponent;
import com.tinder.settings.feed.p406a.C14868a;
import com.tinder.settings.feed.p406a.C18063c;
import com.tinder.settings.feed.presenter.C14876c;
import com.tinder.settings.feed.presenter.C18069f;
import com.tinder.settings.feed.provider.C14879a;
import com.tinder.settings.feed.provider.C18070c;
import com.tinder.settings.feed.view.C16640b;
import com.tinder.settings.feed.view.FeedSettingsView;
import dagger.internal.C17281c;
import javax.inject.Provider;

final class a$l implements FeedSettingsActivityComponent {
    /* renamed from: a */
    final /* synthetic */ C4423a f33543a;
    /* renamed from: b */
    private LoadFeedSettings_Factory f33544b;
    /* renamed from: c */
    private Provider<C14879a> f33545c;
    /* renamed from: d */
    private Provider<C14876c> f33546d;
    /* renamed from: e */
    private SaveFeedSettings_Factory f33547e;
    /* renamed from: f */
    private C18066a f33548f;
    /* renamed from: g */
    private C18068c f33549g;
    /* renamed from: h */
    private Provider<C14868a> f33550h;

    private a$l(C4423a c4423a, a$k a_k) {
        this.f33543a = c4423a;
        m41848a(a_k);
    }

    /* renamed from: a */
    private void m41848a(a$k a_k) {
        this.f33544b = LoadFeedSettings_Factory.create(C4423a.eR(this.f33543a));
        this.f33545c = C17281c.a(C18070c.b(this.f33544b, C12612b.m49817c()));
        this.f33546d = C17281c.a(C18069f.b(this.f33545c));
        this.f33547e = SaveFeedSettings_Factory.create(C4423a.eS(this.f33543a), C4423a.bN(this.f33543a));
        this.f33548f = C18066a.b(C4423a.u(this.f33543a));
        this.f33549g = C18068c.b(C4423a.u(this.f33543a));
        this.f33550h = C17281c.a(C18063c.b(this.f33545c, this.f33547e, this.f33548f, this.f33549g));
    }

    public void inject(FeedSettingsView feedSettingsView) {
        m41847a(feedSettingsView);
    }

    /* renamed from: a */
    private FeedSettingsView m41847a(FeedSettingsView feedSettingsView) {
        C16640b.a(feedSettingsView, (C14876c) this.f33546d.get());
        C16640b.a(feedSettingsView, (C14868a) this.f33550h.get());
        return feedSettingsView;
    }
}
