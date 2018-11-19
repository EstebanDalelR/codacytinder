package com.tinder.match.dialog;

import com.tinder.analytics.chat.Origin;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.apprating.enums.AppRatingType;
import com.tinder.apprating.p086a.C8259d;
import com.tinder.apprating.p165c.C8264a;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.navigation.Screen.C10687f;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.match.usecase.CountMatches;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.etl.event.lm;
import com.tinder.etl.event.ln;
import com.tinder.etl.event.ls;
import com.tinder.itsamatch.ItsAMatchDialogModel;
import com.tinder.itsamatch.ItsAMatchDialogModel.Attribution;
import com.tinder.screenshot.analytics.C16562a;
import com.tinder.screenshot.analytics.C16562a.C14824a;
import com.tinder.screenshotty.C14830c;
import com.tinder.screenshotty.p401a.C14826a;
import com.tinder.screenshotty.p401a.C14826a.C16570a;
import io.reactivex.C3959e;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\b\u0010\u001f\u001a\u00020 H\u0007J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020 J\u000e\u0010%\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J\u0006\u0010&\u001a\u00020 J\u000e\u0010'\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J\u0018\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010*J\u000e\u0010,\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J\u0006\u0010-\u001a\u00020 J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020#H\u0002J\u0010\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020#H\u0002J\u0012\u00102\u001a\u00020 2\b\u00103\u001a\u0004\u0018\u00010*H\u0002J\u000e\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020#J\u0010\u00106\u001a\u00020 2\u0006\u00100\u001a\u00020#H\u0002J\u0010\u00107\u001a\u00020 2\u0006\u00100\u001a\u00020#H\u0002J\u0010\u00108\u001a\u00020 2\u0006\u00100\u001a\u00020#H\u0002J\b\u00109\u001a\u00020 H\u0007R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/tinder/match/dialog/ItsAMatchDialogPresenter;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "countMatches", "Lcom/tinder/domain/match/usecase/CountMatches;", "legacyAppRatingDialogProvider", "Lcom/tinder/apprating/legacy/LegacyAppRatingDialogProvider;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "appRatingDialogProvider", "Lcom/tinder/apprating/provider/AppRatingDialogProvider;", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "currentScreenNotifier", "Lcom/tinder/common/navigation/CurrentScreenNotifier;", "screenshotty", "Lcom/tinder/screenshotty/Screenshotty;", "addAppScreenshotEvent", "Lcom/tinder/screenshot/analytics/AddAppScreenshotEvent;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/domain/match/usecase/CountMatches;Lcom/tinder/apprating/legacy/LegacyAppRatingDialogProvider;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/apprating/provider/AppRatingDialogProvider;Lcom/tinder/domain/config/TopPicksConfig;Lcom/tinder/common/navigation/CurrentScreenNotifier;Lcom/tinder/screenshotty/Screenshotty;Lcom/tinder/screenshot/analytics/AddAppScreenshotEvent;)V", "screenshotDisposable", "Lio/reactivex/disposables/Disposable;", "target", "Lcom/tinder/match/dialog/ItsAMatchDialogTarget;", "getTarget$Tinder_release", "()Lcom/tinder/match/dialog/ItsAMatchDialogTarget;", "setTarget$Tinder_release", "(Lcom/tinder/match/dialog/ItsAMatchDialogTarget;)V", "notifyItsAMatchAsCurrentScreen", "", "onAvatarMatchClicked", "itsAMatchDialogModel", "Lcom/tinder/itsamatch/ItsAMatchDialogModel;", "onAvatarSelfClicked", "onChatClicked", "onFastMatchAttribution", "onKeepPlayingClicked", "onPlacesMatchAttribution", "personName", "", "placeName", "onShareClicked", "onTopPicksMatchAttribution", "resolveDidSuperLike", "", "viewModel", "resolveSuperLike", "sendScreenshotAnalytics", "otherId", "setup", "model", "trackChatClickEvent", "trackKeepPlayingEvent", "trackShareClickEvent", "unsubscribeFromScreenShotty", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.dialog.h */
public final class C9862h {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public ItsAMatchDialogTarget f32647a;
    /* renamed from: b */
    private Disposable f32648b;
    /* renamed from: c */
    private final C2630h f32649c;
    /* renamed from: d */
    private final CountMatches f32650d;
    /* renamed from: e */
    private final C8259d f32651e;
    /* renamed from: f */
    private final FastMatchConfigProvider f32652f;
    /* renamed from: g */
    private final SubscriptionProvider f32653g;
    /* renamed from: h */
    private final C8264a f32654h;
    /* renamed from: i */
    private final TopPicksConfig f32655i;
    /* renamed from: j */
    private final CurrentScreenNotifier f32656j;
    /* renamed from: k */
    private final C14830c f32657k;
    /* renamed from: l */
    private final C16562a f32658l;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "numberOfMatches", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.dialog.h$a */
    static final class C12044a<T> implements Consumer<Long> {
        /* renamed from: a */
        final /* synthetic */ C9862h f39181a;

        C12044a(C9862h c9862h) {
            this.f39181a = c9862h;
        }

        public /* synthetic */ void accept(Object obj) {
            m48156a((Long) obj);
        }

        /* renamed from: a */
        public final void m48156a(Long l) {
            ItsAMatchDialogTarget a = this.f39181a.m40562a();
            C2668g.a(l, "numberOfMatches");
            a.showShareMatches(l.longValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.dialog.h$b */
    static final class C12045b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12045b f39182a = new C12045b();

        C12045b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48157a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48157a(Throwable th) {
            C0001a.c(th, "Error counting matches", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "screenshot", "Lcom/tinder/screenshotty/model/Screenshot;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.dialog.h$c */
    static final class C12046c<T> implements Consumer<C14826a> {
        /* renamed from: a */
        final /* synthetic */ C9862h f39183a;
        /* renamed from: b */
        final /* synthetic */ String f39184b;

        C12046c(C9862h c9862h, String str) {
            this.f39183a = c9862h;
            this.f39184b = str;
        }

        public /* synthetic */ void accept(Object obj) {
            m48158a((C14826a) obj);
        }

        /* renamed from: a */
        public final void m48158a(C14826a c14826a) {
            this.f39183a.f32658l.a(new C14824a(C10687f.f35028a, null, this.f39184b, c14826a instanceof C16570a));
        }
    }

    @Inject
    public C9862h(@NotNull C2630h c2630h, @NotNull CountMatches countMatches, @NotNull C8259d c8259d, @NotNull FastMatchConfigProvider fastMatchConfigProvider, @NotNull SubscriptionProvider subscriptionProvider, @NotNull C8264a c8264a, @NotNull TopPicksConfig topPicksConfig, @NotNull CurrentScreenNotifier currentScreenNotifier, @NotNull C14830c c14830c, @NotNull C16562a c16562a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(countMatches, "countMatches");
        C2668g.b(c8259d, "legacyAppRatingDialogProvider");
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(c8264a, "appRatingDialogProvider");
        C2668g.b(topPicksConfig, "topPicksConfig");
        C2668g.b(currentScreenNotifier, "currentScreenNotifier");
        C2668g.b(c14830c, "screenshotty");
        C2668g.b(c16562a, "addAppScreenshotEvent");
        this.f32649c = c2630h;
        this.f32650d = countMatches;
        this.f32651e = c8259d;
        this.f32652f = fastMatchConfigProvider;
        this.f32653g = subscriptionProvider;
        this.f32654h = c8264a;
        this.f32655i = topPicksConfig;
        this.f32656j = currentScreenNotifier;
        this.f32657k = c14830c;
        this.f32658l = c16562a;
    }

    @NotNull
    /* renamed from: a */
    public final ItsAMatchDialogTarget m40562a() {
        ItsAMatchDialogTarget itsAMatchDialogTarget = this.f32647a;
        if (itsAMatchDialogTarget == null) {
            C2668g.b("target");
        }
        return itsAMatchDialogTarget;
    }

    @Take
    /* renamed from: b */
    public final void m40565b() {
        this.f32656j.notify(C10687f.f35028a);
    }

    @Drop
    /* renamed from: c */
    public final void m40567c() {
        Disposable disposable = this.f32648b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: a */
    public final void m40563a(@NotNull ItsAMatchDialogModel itsAMatchDialogModel) {
        C2668g.b(itsAMatchDialogModel, "model");
        ItsAMatchDialogTarget itsAMatchDialogTarget = this.f32647a;
        if (itsAMatchDialogTarget == null) {
            C2668g.b("target");
        }
        itsAMatchDialogTarget.setMatchName(itsAMatchDialogModel.m40260c(), itsAMatchDialogModel.m40261d(), itsAMatchDialogModel.m40265h());
        itsAMatchDialogTarget = this.f32647a;
        if (itsAMatchDialogTarget == null) {
            C2668g.b("target");
        }
        itsAMatchDialogTarget.setMyAvatar(itsAMatchDialogModel.m40262e());
        itsAMatchDialogTarget = this.f32647a;
        if (itsAMatchDialogTarget == null) {
            C2668g.b("target");
        }
        itsAMatchDialogTarget.setMatchAvatar(itsAMatchDialogModel.m40263f());
        m40556a(itsAMatchDialogModel.m40259b());
    }

    /* renamed from: b */
    public final void m40566b(@NotNull ItsAMatchDialogModel itsAMatchDialogModel) {
        C2668g.b(itsAMatchDialogModel, "itsAMatchDialogModel");
        m40559h(itsAMatchDialogModel);
        ItsAMatchDialogTarget itsAMatchDialogTarget = this.f32647a;
        if (itsAMatchDialogTarget == null) {
            C2668g.b("target");
        }
        itsAMatchDialogTarget.goToChat(Origin.MATCH_SCREEN, itsAMatchDialogModel.m40258a(), itsAMatchDialogModel.m40260c());
    }

    /* renamed from: c */
    public final void m40568c(@NotNull ItsAMatchDialogModel itsAMatchDialogModel) {
        C2668g.b(itsAMatchDialogModel, "itsAMatchDialogModel");
        this.f32651e.m35261a("newMatch");
        this.f32654h.m35284a(AppRatingType.NEW_MATCH);
        m40558g(itsAMatchDialogModel);
    }

    /* renamed from: d */
    public final void m40570d(@NotNull ItsAMatchDialogModel itsAMatchDialogModel) {
        Object obj;
        C2668g.b(itsAMatchDialogModel, "itsAMatchDialogModel");
        String b = itsAMatchDialogModel.m40259b();
        CharSequence charSequence = b;
        if (charSequence != null) {
            if (charSequence.length() != 0) {
                obj = null;
                if (obj == null) {
                    itsAMatchDialogModel = this.f32647a;
                    if (itsAMatchDialogModel == null) {
                        C2668g.b("target");
                    }
                    itsAMatchDialogModel.showNoUserError();
                }
                ItsAMatchDialogTarget itsAMatchDialogTarget;
                itsAMatchDialogTarget = this.f32647a;
                if (itsAMatchDialogTarget == null) {
                    C2668g.b("target");
                }
                itsAMatchDialogTarget.goToMatchProfile(b, itsAMatchDialogModel.m40258a());
                return;
            }
        }
        obj = 1;
        if (obj == null) {
            itsAMatchDialogTarget = this.f32647a;
            if (itsAMatchDialogTarget == null) {
                C2668g.b("target");
            }
            itsAMatchDialogTarget.goToMatchProfile(b, itsAMatchDialogModel.m40258a());
            return;
        }
        itsAMatchDialogModel = this.f32647a;
        if (itsAMatchDialogModel == null) {
            C2668g.b("target");
        }
        itsAMatchDialogModel.showNoUserError();
    }

    /* renamed from: d */
    public final void m40569d() {
        ItsAMatchDialogTarget itsAMatchDialogTarget = this.f32647a;
        if (itsAMatchDialogTarget == null) {
            C2668g.b("target");
        }
        itsAMatchDialogTarget.goToMyProfile();
    }

    /* renamed from: e */
    public final void m40572e(@NotNull ItsAMatchDialogModel itsAMatchDialogModel) {
        C2668g.b(itsAMatchDialogModel, "itsAMatchDialogModel");
        m40557f(itsAMatchDialogModel);
        this.f32650d.execute().firstOrError().b(C15756a.b()).a(C15674a.a()).a(new C12044a(this), C12045b.f39182a);
    }

    /* renamed from: e */
    public final void m40571e() {
        ItsAMatchDialogTarget itsAMatchDialogTarget;
        if (this.f32652f.get().isEnabled() && this.f32653g.get().isGold()) {
            itsAMatchDialogTarget = this.f32647a;
            if (itsAMatchDialogTarget == null) {
                C2668g.b("target");
            }
            itsAMatchDialogTarget.showFastMatchAttribution();
            return;
        }
        itsAMatchDialogTarget = this.f32647a;
        if (itsAMatchDialogTarget == null) {
            C2668g.b("target");
        }
        itsAMatchDialogTarget.hideMatchAttribution();
    }

    /* renamed from: f */
    public final void m40573f() {
        ItsAMatchDialogTarget itsAMatchDialogTarget;
        if (this.f32655i.isEnabled()) {
            itsAMatchDialogTarget = this.f32647a;
            if (itsAMatchDialogTarget == null) {
                C2668g.b("target");
            }
            itsAMatchDialogTarget.showTopPicksAttribution();
            return;
        }
        itsAMatchDialogTarget = this.f32647a;
        if (itsAMatchDialogTarget == null) {
            C2668g.b("target");
        }
        itsAMatchDialogTarget.hideMatchAttribution();
    }

    /* renamed from: a */
    public final void m40564a(@NotNull String str, @Nullable String str2) {
        C2668g.b(str, "personName");
        if (str2 != null) {
            str = this.f32647a;
            if (str == null) {
                C2668g.b("target");
            }
            str.showPlacesAttribution(str2);
            return;
        }
        ItsAMatchDialogTarget itsAMatchDialogTarget = this.f32647a;
        if (itsAMatchDialogTarget == null) {
            C2668g.b("target");
        }
        itsAMatchDialogTarget.setMatchName(Attribution.NONE, str, str2);
    }

    /* renamed from: f */
    private final void m40557f(ItsAMatchDialogModel itsAMatchDialogModel) {
        this.f32649c.a(lm.m45658a().m38516a(itsAMatchDialogModel.m40258a()).m38515a(Boolean.valueOf(m40560i(itsAMatchDialogModel))).m38518b(Boolean.valueOf(m40561j(itsAMatchDialogModel))).m38517a());
    }

    /* renamed from: g */
    private final void m40558g(ItsAMatchDialogModel itsAMatchDialogModel) {
        this.f32649c.a(ln.m45668a().m38520a(itsAMatchDialogModel.m40258a()).m38522b(Boolean.valueOf(m40560i(itsAMatchDialogModel))).m38519a(Boolean.valueOf(m40561j(itsAMatchDialogModel))).m38521a());
    }

    /* renamed from: h */
    private final void m40559h(ItsAMatchDialogModel itsAMatchDialogModel) {
        this.f32649c.a(ls.m45745a().m38546a(itsAMatchDialogModel.m40258a()).m38545a(Boolean.valueOf(m40560i(itsAMatchDialogModel))).m38548b(Boolean.valueOf(m40561j(itsAMatchDialogModel))).m38547a());
    }

    /* renamed from: a */
    private final void m40556a(String str) {
        C3959e subscribeOn = this.f32657k.c().subscribeOn(C15756a.b());
        Consumer c12046c = new C12046c(this, str);
        str = (Function1) ItsAMatchDialogPresenter$sendScreenshotAnalytics$2.f45323a;
        if (str != null) {
            str = new C12047i(str);
        }
        this.f32648b = subscribeOn.subscribe(c12046c, (Consumer) str);
    }

    /* renamed from: i */
    private final boolean m40560i(ItsAMatchDialogModel itsAMatchDialogModel) {
        return itsAMatchDialogModel.m40260c() == Attribution.SUPER_LIKE_BY_ME ? true : null;
    }

    /* renamed from: j */
    private final boolean m40561j(ItsAMatchDialogModel itsAMatchDialogModel) {
        return itsAMatchDialogModel.m40260c() == Attribution.SUPER_LIKE_BY_THEM ? true : null;
    }
}
