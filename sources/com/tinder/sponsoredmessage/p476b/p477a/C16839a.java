package com.tinder.sponsoredmessage.p476b.p477a;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.design.tabbedpagelayout.model.ScrollState;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.usecase.CreateMessageAdMatch;
import com.tinder.main.model.MainPage;
import com.tinder.messageads.model.C12131a;
import com.tinder.recsads.rule.C18793c.C14761a;
import com.tinder.sponsoredmessage.SponsoredMessageAdMonitor;
import hu.akarnokd.rxjava.interop.C15551e;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/sponsoredmessage/page/listener/SponsoredMessageMainPageSelectedListener;", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "sponsoredMessageAdMonitor", "Lcom/tinder/sponsoredmessage/SponsoredMessageAdMonitor;", "messageAdMatchFactory", "Lcom/tinder/recsads/rule/AddyV2BrandedProfileCardMatchInsertionRule$MessageAdMatchFactory;", "createMessageAdMatch", "Lcom/tinder/domain/match/usecase/CreateMessageAdMatch;", "(Lcom/tinder/sponsoredmessage/SponsoredMessageAdMonitor;Lcom/tinder/recsads/rule/AddyV2BrandedProfileCardMatchInsertionRule$MessageAdMatchFactory;Lcom/tinder/domain/match/usecase/CreateMessageAdMatch;)V", "onPageReselected", "", "reselectedPage", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "onPageScrollChanged", "state", "Lcom/tinder/design/tabbedpagelayout/model/ScrollState;", "onPageSelected", "selectedPage", "previousPage", "onPageUnselected", "unselectedPage", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.sponsoredmessage.b.a.a */
public final class C16839a implements OnPageSelectedListener {
    /* renamed from: a */
    private final SponsoredMessageAdMonitor f51899a;
    /* renamed from: b */
    private final C14761a f51900b;
    /* renamed from: c */
    private final CreateMessageAdMatch f51901c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "messageAd", "Lcom/tinder/messageads/model/MessageAd;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b.a.a$a */
    static final class C16834a<T> implements Consumer<C12131a> {
        /* renamed from: a */
        public static final C16834a f51894a = new C16834a();

        C16834a() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62386a((C12131a) obj);
        }

        /* renamed from: a */
        public final void m62386a(C12131a c12131a) {
            c12131a.a().recordImpression();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/MessageAdMatch;", "messageAd", "Lcom/tinder/messageads/model/MessageAd;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b.a.a$b */
    static final class C16835b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16839a f51895a;

        C16835b(C16839a c16839a) {
            this.f51895a = c16839a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62387a((C12131a) obj);
        }

        @NotNull
        /* renamed from: a */
        public final MessageAdMatch m62387a(@NotNull C12131a c12131a) {
            C2668g.b(c12131a, "messageAd");
            return this.f51895a.f51900b.m56032a(c12131a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "messageAdMatch", "Lcom/tinder/domain/match/model/MessageAdMatch;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b.a.a$c */
    static final class C16836c<T, R> implements Function<MessageAdMatch, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C16839a f51896a;

        C16836c(C16839a c16839a) {
            this.f51896a = c16839a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62388a((MessageAdMatch) obj);
        }

        /* renamed from: a */
        public final C3956a m62388a(@NotNull MessageAdMatch messageAdMatch) {
            C2668g.b(messageAdMatch, "messageAdMatch");
            return C15551e.m58073a(this.f51896a.f51901c.execute(messageAdMatch));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b.a.a$d */
    static final class C16837d implements Action {
        /* renamed from: a */
        public static final C16837d f51897a = new C16837d();

        C16837d() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b.a.a$e */
    static final class C16838e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16838e f51898a = new C16838e();

        C16838e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62389a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62389a(Throwable th) {
            C0001a.b(th);
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

    public C16839a(@NotNull SponsoredMessageAdMonitor sponsoredMessageAdMonitor, @NotNull C14761a c14761a, @NotNull CreateMessageAdMatch createMessageAdMatch) {
        C2668g.b(sponsoredMessageAdMonitor, "sponsoredMessageAdMonitor");
        C2668g.b(c14761a, "messageAdMatchFactory");
        C2668g.b(createMessageAdMatch, "createMessageAdMatch");
        this.f51899a = sponsoredMessageAdMonitor;
        this.f51900b = c14761a;
        this.f51901c = createMessageAdMatch;
    }

    public void onPageSelected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page, @Nullable TabbedPageLayout$Page tabbedPageLayout$Page2) {
        C2668g.b(tabbedPageLayout$Page, "selectedPage");
        if (((MainPage) tabbedPageLayout$Page) == MainPage.MATCHES) {
            this.f51899a.m56638c().a(C15674a.m58830a()).c((Consumer) C16834a.f51894a).a(C15756a.m59010b()).f((Function) new C16835b(this)).e((Function) new C16836c(this)).b(C15756a.m59010b()).a((Action) C16837d.f51897a, C16838e.f51898a);
        }
    }
}
