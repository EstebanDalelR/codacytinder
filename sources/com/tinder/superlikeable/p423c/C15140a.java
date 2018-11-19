package com.tinder.superlikeable.p423c;

import com.tinder.analytics.p154c.C6214c;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.model.Tutorial.Superlikeable;
import com.tinder.domain.profile.model.Tutorials;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import com.tinder.domain.superlikeable.usecase.EndSuperLikeableGame;
import com.tinder.domain.superlikeable.usecase.EndSuperLikeableGame.Reason;
import com.tinder.domain.superlikeable.usecase.LoadSuperLikeableGame;
import com.tinder.domain.superlikeable.usecase.SkipSuperLikeableGame;
import com.tinder.domain.utils.RxUtils;
import com.tinder.superlikeable.C15139b;
import com.tinder.superlikeable.view.target.SuperLikeableGameTarget;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u0019J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u0019J\u0006\u0010\u001f\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\u0019J\u0006\u0010!\u001a\u00020\u0019J\b\u0010\"\u001a\u00020\u0019H\u0002J\u0006\u0010#\u001a\u00020\u0019J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/tinder/superlikeable/presenter/SuperLikeableGamePresenter;", "", "loadSuperLikeableGame", "Lcom/tinder/domain/superlikeable/usecase/LoadSuperLikeableGame;", "endSuperLikeableGame", "Lcom/tinder/domain/superlikeable/usecase/EndSuperLikeableGame;", "skipSuperLikeableGame", "Lcom/tinder/domain/superlikeable/usecase/SkipSuperLikeableGame;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "trackSuperlikeableUsedEvent", "Lcom/tinder/analytics/usecase/TrackSuperlikeableUsedEvent;", "superLikeableConfig", "Lcom/tinder/superlikeable/SuperLikeableConfig;", "(Lcom/tinder/domain/superlikeable/usecase/LoadSuperLikeableGame;Lcom/tinder/domain/superlikeable/usecase/EndSuperLikeableGame;Lcom/tinder/domain/superlikeable/usecase/SkipSuperLikeableGame;Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lcom/tinder/analytics/usecase/TrackSuperlikeableUsedEvent;Lcom/tinder/superlikeable/SuperLikeableConfig;)V", "confirmTutorialDisposable", "Lio/reactivex/disposables/Disposable;", "loadGameSubscription", "Lrx/Subscription;", "loadTutorialsDisposable", "target", "Lcom/tinder/superlikeable/view/target/SuperLikeableGameTarget;", "dropSubscriptions", "", "dropTarget", "endGame", "reason", "Lcom/tinder/domain/superlikeable/usecase/EndSuperLikeableGame$Reason;", "handleEntranceAnimationEnd", "handleIntroAnimationEnd", "handleSuperLikeOnGridRec", "handleViewReadyForAnimation", "loadGame", "skipGame", "takeTarget", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.c.a */
public final class C15140a {
    /* renamed from: a */
    private SuperLikeableGameTarget f47108a;
    /* renamed from: b */
    private Subscription f47109b;
    /* renamed from: c */
    private Disposable f47110c;
    /* renamed from: d */
    private Disposable f47111d;
    /* renamed from: e */
    private final LoadSuperLikeableGame f47112e;
    /* renamed from: f */
    private final EndSuperLikeableGame f47113f;
    /* renamed from: g */
    private final SkipSuperLikeableGame f47114g;
    /* renamed from: h */
    private final ConfirmTutorialsViewed f47115h;
    /* renamed from: i */
    private final LoadProfileOptionData f47116i;
    /* renamed from: j */
    private final C6214c f47117j;
    /* renamed from: k */
    private final C15139b f47118k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "tutorialsOption", "Lcom/tinder/domain/profile/model/Tutorials;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.c.a$a */
    static final class C16896a<T> implements Consumer<Tutorials> {
        /* renamed from: a */
        final /* synthetic */ C15140a f52059a;

        C16896a(C15140a c15140a) {
            this.f52059a = c15140a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62496a((Tutorials) obj);
        }

        /* renamed from: a */
        public final void m62496a(Tutorials tutorials) {
            if (tutorials.getTutorials().contains(Superlikeable.INSTANCE) != null) {
                tutorials = this.f52059a.f47108a;
                if (tutorials != null) {
                    tutorials.startIntroTutorialAnimation();
                    return;
                }
                return;
            }
            tutorials = this.f52059a.f47108a;
            if (tutorials != null) {
                tutorials.enableInteraction();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.c.a$b */
    static final class C16897b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C15140a f52060a;

        C16897b(C15140a c15140a) {
            this.f52060a = c15140a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62497a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62497a(Throwable th) {
            C0001a.c(th);
            th = this.f52060a.f47108a;
            if (th != null) {
                th.enableInteraction();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.c.a$c */
    static final class C16898c implements Action {
        /* renamed from: a */
        public static final C16898c f52061a = new C16898c();

        C16898c() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.c.a$d */
    static final class C16899d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16899d f52062a = new C16899d();

        C16899d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62498a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62498a(Throwable th) {
            C0001a.b(th, "Error confirming superlikeable tutorials", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "kotlin.jvm.PlatformType", "it", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.c.a$e */
    static final class C18202e<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C15140a f56426a;

        C18202e(C15140a c15140a) {
            this.f56426a = c15140a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65988a((Optional) obj);
        }

        /* renamed from: a */
        public final SuperLikeableGame m65988a(Optional<SuperLikeableGame> optional) {
            C2668g.a(optional, "it");
            if (optional.m59132c()) {
                int size = ((SuperLikeableGame) optional.m59127b()).getSuperLikeableRecs().size();
                if ((size >= this.f56426a.f47118k.m56968a() ? 1 : null) != null) {
                    return (SuperLikeableGame) optional.m59127b();
                }
                optional = new StringBuilder();
                optional.append("Check Failed: ");
                optional.append(size);
                optional.append(" should be >= ");
                optional.append(this.f56426a.f47118k.m56968a());
                throw new IllegalStateException(optional.toString().toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/recs/model/UserRec;", "it", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.c.a$g */
    static final class C18203g<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C15140a f56427a;

        C18203g(C15140a c15140a) {
            this.f56427a = c15140a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65989a((SuperLikeableGame) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<UserRec> m65989a(SuperLikeableGame superLikeableGame) {
            return C19299w.m68820d((Iterable) superLikeableGame.getSuperLikeableRecs(), this.f56427a.f47118k.m56968a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.c.a$f */
    static final class C18938f<T> implements Action1<SuperLikeableGame> {
        /* renamed from: a */
        final /* synthetic */ C15140a f58596a;

        C18938f(C15140a c15140a) {
            this.f58596a = c15140a;
        }

        public /* synthetic */ void call(Object obj) {
            m67429a((SuperLikeableGame) obj);
        }

        /* renamed from: a */
        public final void m67429a(SuperLikeableGame superLikeableGame) {
            SuperLikeableGameTarget a = this.f58596a.f47108a;
            if (a != null) {
                C2668g.a(superLikeableGame, "it");
                a.notifyGameStart(superLikeableGame);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/domain/recs/model/UserRec;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.c.a$h */
    static final class C18939h<T> implements Action1<List<? extends UserRec>> {
        /* renamed from: a */
        final /* synthetic */ C15140a f58597a;

        C18939h(C15140a c15140a) {
            this.f58597a = c15140a;
        }

        public /* synthetic */ void call(Object obj) {
            m67430a((List) obj);
        }

        /* renamed from: a */
        public final void m67430a(List<? extends UserRec> list) {
            SuperLikeableGameTarget a = this.f58597a.f47108a;
            if (a != null) {
                C2668g.a(list, "it");
                a.bindRecs(list);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.c.a$i */
    static final class C18940i<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C15140a f58598a;

        C18940i(C15140a c15140a) {
            this.f58598a = c15140a;
        }

        public /* synthetic */ void call(Object obj) {
            m67431a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67431a(Throwable th) {
            C0001a.c(th, "A game should be available in memory cache at the moment of its presentation.", new Object[0]);
            th = this.f58598a.f47108a;
            if (th != null) {
                th.presentGameAbnormallyAbortedState();
            }
            this.f58598a.m56970a(Reason.GAME_ABORTED);
        }
    }

    @Inject
    public C15140a(@NotNull LoadSuperLikeableGame loadSuperLikeableGame, @NotNull EndSuperLikeableGame endSuperLikeableGame, @NotNull SkipSuperLikeableGame skipSuperLikeableGame, @NotNull ConfirmTutorialsViewed confirmTutorialsViewed, @NotNull LoadProfileOptionData loadProfileOptionData, @NotNull C6214c c6214c, @NotNull C15139b c15139b) {
        C2668g.b(loadSuperLikeableGame, "loadSuperLikeableGame");
        C2668g.b(endSuperLikeableGame, "endSuperLikeableGame");
        C2668g.b(skipSuperLikeableGame, "skipSuperLikeableGame");
        C2668g.b(confirmTutorialsViewed, "confirmTutorialsViewed");
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        C2668g.b(c6214c, "trackSuperlikeableUsedEvent");
        C2668g.b(c15139b, "superLikeableConfig");
        this.f47112e = loadSuperLikeableGame;
        this.f47113f = endSuperLikeableGame;
        this.f47114g = skipSuperLikeableGame;
        this.f47115h = confirmTutorialsViewed;
        this.f47116i = loadProfileOptionData;
        this.f47117j = c6214c;
        this.f47118k = c15139b;
    }

    /* renamed from: a */
    public final void m56976a(@NotNull SuperLikeableGameTarget superLikeableGameTarget) {
        C2668g.b(superLikeableGameTarget, "target");
        this.f47108a = superLikeableGameTarget;
        m56973g();
    }

    /* renamed from: a */
    public final void m56975a() {
        this.f47108a = (SuperLikeableGameTarget) null;
        m56974h();
    }

    /* renamed from: b */
    public final void m56977b() {
        this.f47114g.execute();
        m56970a(Reason.GAME_SKIPPED);
    }

    /* renamed from: c */
    public final void m56978c() {
        m56970a(Reason.GAME_PLAYED);
    }

    /* renamed from: d */
    public final void m56979d() {
        SuperLikeableGameTarget superLikeableGameTarget = this.f47108a;
        if (superLikeableGameTarget != null) {
            superLikeableGameTarget.startEntranceAnimation();
        }
    }

    /* renamed from: e */
    public final void m56980e() {
        Disposable disposable = this.f47111d;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f47111d = this.f47115h.execute(Superlikeable.INSTANCE).b(C15756a.m59010b()).a(C16898c.f52061a, C16899d.f52062a);
    }

    /* renamed from: f */
    public final void m56981f() {
        Disposable disposable = this.f47110c;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f47110c = this.f47116i.execute(ProfileOption.Tutorials.INSTANCE).first(new Tutorials(null, 1, null)).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C16896a(this), new C16897b(this));
    }

    /* renamed from: a */
    private final void m56970a(Reason reason) {
        this.f47113f.execute(reason);
        this.f47117j.a();
    }

    /* renamed from: g */
    private final void m56973g() {
        if (!RxUtils.INSTANCE.isSubscribed(this.f47109b)) {
            if ((this.f47118k.m56968a() > 0 ? 1 : null) == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SuperLikeableConfig expectedRecsCount should not be ");
                stringBuilder.append(this.f47118k.m56968a());
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
            this.f47109b = this.f47112e.execute().d(new C18202e(this)).d(new C18938f(this)).d(new C18203g(this)).b(Schedulers.io()).a(C19397a.a()).a(new C18939h(this), new C18940i(this));
        }
    }

    /* renamed from: h */
    private final void m56974h() {
        Subscription subscription = this.f47109b;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        Disposable disposable = this.f47110c;
        if (disposable != null) {
            disposable.dispose();
        }
        disposable = this.f47111d;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
