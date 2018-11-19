package com.tinder.match.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.common.provider.C8550g;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.domain.ads.PingTrackingUrls;
import com.tinder.domain.ads.SponsoredMessagePingTrackingUrls;
import com.tinder.domain.ads.SponsoredMessagePingTrackingUrls.Request;
import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.domain.common.TrackingUrl.Event;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.MessageAdMatch.Type;
import com.tinder.home.p259b.C9695a;
import com.tinder.main.model.MainPage;
import com.tinder.match.analytics.C12036c;
import com.tinder.match.target.MatchMessageRowTarget;
import com.tinder.messageads.model.MessageAdTrackingEvent;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import rx.Subscription;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.match.presenter.e */
public class C9868e {
    @DeadshotTarget
    /* renamed from: a */
    MatchMessageRowTarget f32673a;
    /* renamed from: b */
    private final FastMatchConfigProvider f32674b;
    /* renamed from: c */
    private final C12036c f32675c;
    /* renamed from: d */
    private final SponsoredMessagePingTrackingUrls f32676d;
    /* renamed from: e */
    private final C9695a f32677e;
    /* renamed from: f */
    private final C8550g f32678f;
    /* renamed from: g */
    private final AppRatingRepository f32679g;
    /* renamed from: h */
    private final TopPicksConfig f32680h;
    /* renamed from: i */
    private final AdUrlTracker f32681i;
    @Nullable
    /* renamed from: j */
    private Subscription f32682j;
    @Nullable
    /* renamed from: k */
    private Request f32683k;

    @Inject
    C9868e(FastMatchConfigProvider fastMatchConfigProvider, C12036c c12036c, SponsoredMessagePingTrackingUrls sponsoredMessagePingTrackingUrls, C9695a c9695a, C8550g c8550g, AppRatingRepository appRatingRepository, TopPicksConfig topPicksConfig, AdUrlTracker adUrlTracker) {
        this.f32674b = fastMatchConfigProvider;
        this.f32675c = c12036c;
        this.f32676d = sponsoredMessagePingTrackingUrls;
        this.f32677e = c9695a;
        this.f32678f = c8550g;
        this.f32679g = appRatingRepository;
        this.f32680h = topPicksConfig;
        this.f32681i = adUrlTracker;
    }

    @Drop
    /* renamed from: a */
    void m40602a() {
        RxUtils.b(this.f32682j);
    }

    /* renamed from: a */
    public void m40603a(@NonNull Match match) {
        String id = match.getId();
        this.f32673a.navigateToChat(match);
        this.f32675c.m48137a(id);
    }

    /* renamed from: b */
    public boolean m40607b() {
        return this.f32674b.get().isEnabled();
    }

    /* renamed from: c */
    public boolean m40608c() {
        return this.f32680h.isEnabled();
    }

    /* renamed from: b */
    public void m40606b(Match match) {
        if (match instanceof MessageAdMatch) {
            m40598a((MessageAdMatch) match);
        } else {
            m40601d();
        }
    }

    /* renamed from: a */
    private void m40598a(MessageAdMatch messageAdMatch) {
        this.f32682j = this.f32677e.m40151a().f(C13428f.f42600a).b(Schedulers.io()).a(new C14059g(this, messageAdMatch), C14060h.f44572a);
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m40597a(TabbedPageLayout$Page tabbedPageLayout$Page) {
        return Boolean.valueOf(tabbedPageLayout$Page == MainPage.MATCHES ? true : null);
    }

    /* renamed from: a */
    final /* synthetic */ void m40604a(MessageAdMatch messageAdMatch, TabbedPageLayout$Page tabbedPageLayout$Page) {
        if (messageAdMatch.getMessageAdType() == Type.BRANDED_PROFILE_CARD) {
            this.f32681i.a(messageAdMatch.getId(), MessageAdTrackingEvent.SECONDARY_IMPRESSION);
        } else if (messageAdMatch.getMessageAdType() == Type.SPONSORED) {
            this.f32681i.a(messageAdMatch.getId(), MessageAdTrackingEvent.IMPRESSION);
        } else {
            m40599a(messageAdMatch.getTemplateId(), Event.IMPRESSION);
        }
    }

    /* renamed from: d */
    private void m40601d() {
        this.f32683k = null;
        RxUtils.b(this.f32682j);
    }

    /* renamed from: a */
    private void m40599a(String str, Event event) {
        this.f32683k = new Request(str, Event.IMPRESSION, this.f32678f.m36535b());
        this.f32676d.execute((PingTrackingUrls.Request) this.f32683k).b(Schedulers.io()).b(RxUtils.b());
    }

    /* renamed from: a */
    public void m40605a(boolean z) {
        this.f32679g.writeNewChatMessageRead(z);
    }
}
