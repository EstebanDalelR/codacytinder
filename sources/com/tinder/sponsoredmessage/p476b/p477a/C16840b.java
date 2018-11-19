package com.tinder.sponsoredmessage.p476b.p477a;

import com.tinder.ads.MessageAd;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.design.tabbedpagelayout.model.ScrollState;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.main.model.MainPage;
import com.tinder.match.p092d.C3942a;
import com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/sponsoredmessage/page/listener/V1SponsoredMessageMainPageSelectedListener;", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "v1SponsoredMessageAdMonitor", "Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor;", "createMessageAdMatch", "Lcom/tinder/match/usecase/CreateMessageAdMatch;", "(Lcom/tinder/match/sponsoredmessage/V1SponsoredMessageAdMonitor;Lcom/tinder/match/usecase/CreateMessageAdMatch;)V", "onPageReselected", "", "reselectedPage", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "onPageScrollChanged", "state", "Lcom/tinder/design/tabbedpagelayout/model/ScrollState;", "onPageSelected", "selectedPage", "previousPage", "onPageUnselected", "unselectedPage", "recordSponsoredMessageImpression", "messageAd", "Lcom/tinder/ads/MessageAd;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.sponsoredmessage.b.a.b */
public final class C16840b implements OnPageSelectedListener {
    /* renamed from: a */
    private final V1SponsoredMessageAdMonitor f51902a;
    /* renamed from: b */
    private final C3942a f51903b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "adOptional", "Ljava8/util/Optional;", "Lcom/tinder/ads/MessageAd;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b.a.b$a */
    static final class C18904a<T> implements Action1<Optional<MessageAd>> {
        /* renamed from: a */
        final /* synthetic */ C16840b f58547a;

        C18904a(C16840b c16840b) {
            this.f58547a = c16840b;
        }

        public /* synthetic */ void call(Object obj) {
            m67384a((Optional) obj);
        }

        /* renamed from: a */
        public final void m67384a(Optional<MessageAd> optional) {
            C2668g.a(optional, "adOptional");
            if (optional.m59132c()) {
                C16840b c16840b = this.f58547a;
                optional = optional.m59127b();
                C2668g.a(optional, "adOptional.get()");
                c16840b.m62392a((MessageAd) optional);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b.a.b$b */
    static final class C18905b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18905b f58548a = new C18905b();

        C18905b() {
        }

        public /* synthetic */ void call(Object obj) {
            m67385a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67385a(Throwable th) {
            C0001a.a(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/match/model/MessageAdMatch;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b.a.b$c */
    static final class C18906c<T> implements Action1<MessageAdMatch> {
        /* renamed from: a */
        final /* synthetic */ MessageAd f58549a;

        C18906c(MessageAd messageAd) {
            this.f58549a = messageAd;
        }

        public /* synthetic */ void call(Object obj) {
            m67386a((MessageAdMatch) obj);
        }

        /* renamed from: a */
        public final void m67386a(MessageAdMatch messageAdMatch) {
            this.f58549a.nativeCustomTemplateAd().recordImpression();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b.a.b$d */
    static final class C18907d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18907d f58550a = new C18907d();

        C18907d() {
        }

        public /* synthetic */ void call(Object obj) {
            m67387a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67387a(Throwable th) {
            C0001a.c(th);
        }
    }

    public void onPageReselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "reselectedPage");
    }

    public void onPageScrollChanged(@NotNull ScrollState scrollState) {
        C2668g.b(scrollState, "state");
    }

    public void onPageUnselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "unselectedPage");
    }

    public C16840b(@NotNull V1SponsoredMessageAdMonitor v1SponsoredMessageAdMonitor, @NotNull C3942a c3942a) {
        C2668g.b(v1SponsoredMessageAdMonitor, "v1SponsoredMessageAdMonitor");
        C2668g.b(c3942a, "createMessageAdMatch");
        this.f51902a = v1SponsoredMessageAdMonitor;
        this.f51903b = c3942a;
    }

    public void onPageSelected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page, @Nullable TabbedPageLayout$Page tabbedPageLayout$Page2) {
        C2668g.b(tabbedPageLayout$Page, "selectedPage");
        if (((MainPage) tabbedPageLayout$Page) == MainPage.MATCHES) {
            this.f51902a.c().b(Schedulers.io()).a((Action1) new C18904a(this), C18905b.f58548a);
        }
    }

    /* renamed from: a */
    private final void m62392a(MessageAd messageAd) {
        this.f51903b.a(messageAd).b(Schedulers.io()).a(C19397a.a()).a(new C18906c(messageAd), (Action1) C18907d.f58550a);
    }
}
