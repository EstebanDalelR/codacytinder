package com.tinder.toppicks.tooltip;

import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p235d.C11141b;
import com.tinder.discovery.tooltip.C11145a.C8892a;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.profile.model.Tutorial.TopPicksTooltip;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.fireboarding.domain.C11806k;
import com.tinder.main.tooltip.C9835c;
import com.tinder.main.trigger.Trigger.RunStrategy;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.C15756a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001*BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010!\u001a\u00020\u001bH\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020%H\u0016J\u0014\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100)H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/tinder/toppicks/tooltip/TopPicksNewUserTooltipTrigger;", "Lcom/tinder/discovery/trigger/DiscoveryTabTooltipTrigger;", "swipeCountRepository", "Lcom/tinder/recs/domain/repository/SwipeCountRepository;", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "tooltipText", "", "isNewAccount", "Lcom/tinder/fireboarding/domain/IsNewAccount;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "segmentAppearedRelay", "Lio/reactivex/Observable;", "", "tooltipQueue", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;", "discoveryTooltipRequestFactory", "Lcom/tinder/discovery/tooltip/DiscoveryTooltipRequest$Factory;", "(Lcom/tinder/recs/domain/repository/SwipeCountRepository;Lcom/tinder/domain/config/TopPicksConfig;Ljava/lang/CharSequence;Lcom/tinder/fireboarding/domain/IsNewAccount;Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;Lio/reactivex/Observable;Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;Lcom/tinder/discovery/tooltip/DiscoveryTooltipRequest$Factory;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "checkForNewAccountStatusThenObserveSwipeThreshold", "checkForTopPicksTooltipTutorialStatus", "determineTooltipTriggerCondition", "Lcom/tinder/toppicks/tooltip/TopPicksNewUserTooltipTrigger$TriggerCondition;", "tutorialAvailable", "isExistingUser", "getRunStrategy", "Lcom/tinder/main/trigger/Trigger$RunStrategy;", "handleTooltipTriggerCondition", "condition", "observeIsNewAccount", "observeSwipeCountForThreshold", "onCancelled", "", "onCompleted", "run", "waitForSegmentToAppear", "Lio/reactivex/ObservableTransformer;", "TriggerCondition", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksNewUserTooltipTrigger extends C11141b {
    /* renamed from: a */
    private Disposable f56544a;
    /* renamed from: b */
    private final SwipeCountRepository f56545b;
    /* renamed from: c */
    private final TopPicksConfig f56546c;
    /* renamed from: d */
    private final CharSequence f56547d;
    /* renamed from: e */
    private final C11806k f56548e;
    /* renamed from: f */
    private final CheckTutorialViewed f56549f;
    /* renamed from: g */
    private final ConfirmTutorialsViewed f56550g;
    /* renamed from: h */
    private final C3959e<Boolean> f56551h;
    /* renamed from: i */
    private final C8892a f56552i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/toppicks/tooltip/TopPicksNewUserTooltipTrigger$TriggerCondition;", "", "(Ljava/lang/String;I)V", "SWIPE_COUNT", "IMMEDIATELY", "NEVER", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    private enum TriggerCondition {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/toppicks/tooltip/TopPicksNewUserTooltipTrigger$TriggerCondition;", "t1", "", "t2", "apply", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tinder/toppicks/tooltip/TopPicksNewUserTooltipTrigger$TriggerCondition;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.tooltip.TopPicksNewUserTooltipTrigger$a */
    static final class C17135a<T1, T2, R> implements BiFunction<Boolean, Boolean, TriggerCondition> {
        /* renamed from: a */
        final /* synthetic */ TopPicksNewUserTooltipTrigger f52646a;

        C17135a(TopPicksNewUserTooltipTrigger topPicksNewUserTooltipTrigger) {
            this.f52646a = topPicksNewUserTooltipTrigger;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m63004a((Boolean) obj, (Boolean) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final TriggerCondition m63004a(@NotNull Boolean bool, @NotNull Boolean bool2) {
            C2668g.b(bool, "t1");
            C2668g.b(bool2, "t2");
            return this.f52646a.m66107a((boolean) bool.booleanValue(), (boolean) bool2.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.tooltip.TopPicksNewUserTooltipTrigger$b */
    static final class C17136b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C17136b f52647a = new C17136b();

        C17136b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m63005a((TutorialViewStatus) obj));
        }

        /* renamed from: a */
        public final boolean m63005a(@NotNull TutorialViewStatus tutorialViewStatus) {
            C2668g.b(tutorialViewStatus, "it");
            return tutorialViewStatus == TutorialViewStatus.UNSEEN ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "test", "(Ljava/lang/Integer;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.tooltip.TopPicksNewUserTooltipTrigger$c */
    static final class C17137c<T> implements Predicate<Integer> {
        /* renamed from: a */
        final /* synthetic */ TopPicksNewUserTooltipTrigger f52648a;

        C17137c(TopPicksNewUserTooltipTrigger topPicksNewUserTooltipTrigger) {
            this.f52648a = topPicksNewUserTooltipTrigger;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m63006a((Integer) obj);
        }

        /* renamed from: a */
        public final boolean m63006a(@NotNull Integer num) {
            C2668g.b(num, "it");
            return C2668g.a(num.intValue(), this.f52648a.f56546c.getTooltipSwipeThreshold()) < null ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "apply", "(Ljava/lang/Integer;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.tooltip.TopPicksNewUserTooltipTrigger$d */
    static final class C17138d<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C17138d f52649a = new C17138d();

        C17138d() {
        }

        /* renamed from: a */
        public final boolean m63007a(@NotNull Integer num) {
            C2668g.b(num, "it");
            return true;
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m63007a((Integer) obj));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.tooltip.TopPicksNewUserTooltipTrigger$e */
    static final class C17139e implements Action {
        /* renamed from: a */
        public static final C17139e f52650a = new C17139e();

        C17139e() {
        }

        public final void run() {
            C0001a.c("Top Picks Tooltip Tutorial marked as complete", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.tooltip.TopPicksNewUserTooltipTrigger$f */
    static final class C17140f<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17140f f52651a = new C17140f();

        C17140f() {
        }

        public /* synthetic */ void accept(Object obj) {
            m63008a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63008a(Throwable th) {
            C0001a.c(th, "Top Picks Tooltip Tutorial not marked as complete", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "shouldTriggerTooltip", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.tooltip.TopPicksNewUserTooltipTrigger$g */
    static final class C17141g<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ TopPicksNewUserTooltipTrigger f52652a;

        C17141g(TopPicksNewUserTooltipTrigger topPicksNewUserTooltipTrigger) {
            this.f52652a = topPicksNewUserTooltipTrigger;
        }

        public /* synthetic */ void accept(Object obj) {
            m63009a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m63009a(Boolean bool) {
            C2668g.a(bool, "shouldTriggerTooltip");
            if (bool.booleanValue() != null) {
                this.f52652a.a(this.f52652a.f56552i.a(this.f52652a, this.f52652a.f56547d.toString()));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.tooltip.TopPicksNewUserTooltipTrigger$h */
    static final class C17142h<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17142h f52653a = new C17142h();

        C17142h() {
        }

        public /* synthetic */ void accept(Object obj) {
            m63010a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63010a(Throwable th) {
            C0001a.c(th, "Error while figuring out to show Top Picks Trigger", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "observable", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.tooltip.TopPicksNewUserTooltipTrigger$i */
    static final class C17145i<Upstream, Downstream> implements ObservableTransformer<Boolean, Boolean> {
        /* renamed from: a */
        final /* synthetic */ TopPicksNewUserTooltipTrigger f52656a;

        C17145i(TopPicksNewUserTooltipTrigger topPicksNewUserTooltipTrigger) {
            this.f52656a = topPicksNewUserTooltipTrigger;
        }

        public /* synthetic */ ObservableSource apply(C3959e c3959e) {
            return m63013a(c3959e);
        }

        /* renamed from: a */
        public final C3959e<Boolean> m63013a(@NotNull C3959e<Boolean> c3959e) {
            C2668g.b(c3959e, "observable");
            return c3959e.switchMap(new Function<T, ObservableSource<? extends R>>() {

                @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Z"}, k = 3, mv = {1, 1, 10})
                /* renamed from: com.tinder.toppicks.tooltip.TopPicksNewUserTooltipTrigger$i$1$1 */
                static final class C171431<T> implements Predicate<Boolean> {
                    /* renamed from: a */
                    public static final C171431 f52654a = new C171431();

                    C171431() {
                    }

                    public /* synthetic */ boolean test(Object obj) {
                        return m63011a((Boolean) obj);
                    }

                    /* renamed from: a */
                    public final boolean m63011a(@NotNull Boolean bool) {
                        C2668g.b(bool, "it");
                        return bool.booleanValue() ^ 1;
                    }
                }

                public /* synthetic */ Object apply(Object obj) {
                    return m63012a((Boolean) obj);
                }

                /* renamed from: a */
                public final C3959e<Boolean> m63012a(@NotNull Boolean bool) {
                    C2668g.b(bool, "shouldShow");
                    if (bool.booleanValue() != null) {
                        return this.f52656a.f56551h.hide().skipWhile(C171431.f52654a);
                    }
                    return C3959e.just(Boolean.valueOf(null));
                }
            });
        }
    }

    public TopPicksNewUserTooltipTrigger(@NotNull SwipeCountRepository swipeCountRepository, @NotNull TopPicksConfig topPicksConfig, @NotNull CharSequence charSequence, @NotNull C11806k c11806k, @NotNull CheckTutorialViewed checkTutorialViewed, @NotNull ConfirmTutorialsViewed confirmTutorialsViewed, @NotNull C3959e<Boolean> c3959e, @NotNull C9835c c9835c, @NotNull C8892a c8892a) {
        C2668g.b(swipeCountRepository, "swipeCountRepository");
        C2668g.b(topPicksConfig, "topPicksConfig");
        C2668g.b(charSequence, "tooltipText");
        C2668g.b(c11806k, "isNewAccount");
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        C2668g.b(confirmTutorialsViewed, "confirmTutorialsViewed");
        C2668g.b(c3959e, "segmentAppearedRelay");
        C2668g.b(c9835c, "tooltipQueue");
        C2668g.b(c8892a, "discoveryTooltipRequestFactory");
        super(DiscoverySegment.TOP_PICKS, c9835c);
        this.f56545b = swipeCountRepository;
        this.f56546c = topPicksConfig;
        this.f56547d = charSequence;
        this.f56548e = c11806k;
        this.f56549f = checkTutorialViewed;
        this.f56550g = confirmTutorialsViewed;
        this.f56551h = c3959e;
        this.f56552i = c8892a;
    }

    public void u_() {
        if (this.f56546c.isEnabled()) {
            this.f56544a = m66113e().compose(m66117k()).firstOrError().b(C15756a.m59010b()).a(new C17141g(this), C17142h.f52653a);
        }
    }

    /* renamed from: e */
    private final C3959e<Boolean> m66113e() {
        C3959e<Boolean> switchMap = C3959e.zip(m66114h(), m66115i(), new C17135a(this)).switchMap(new C17146b(new C19171x919f119d(this)));
        C2668g.a(switchMap, "Observable.zip(\n        …eTooltipTriggerCondition)");
        return switchMap;
    }

    /* renamed from: a */
    private final C3959e<Boolean> m66108a(TriggerCondition triggerCondition) {
        switch (C15302a.f47473a[triggerCondition.ordinal()]) {
            case 1:
                triggerCondition = C3959e.just(Boolean.valueOf(true));
                C2668g.a(triggerCondition, "Observable.just(true)");
                return triggerCondition;
            case 2:
                return m66116j();
            case 3:
                triggerCondition = C3959e.just(Boolean.valueOf(null));
                C2668g.a(triggerCondition, "Observable.just(false)");
                return triggerCondition;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final TriggerCondition m66107a(boolean z, boolean z2) {
        if (!z) {
            return TriggerCondition.NEVER;
        }
        if (z2) {
            z = TriggerCondition.IMMEDIATELY;
        } else if (z2) {
            throw new NoWhenBranchMatchedException();
        } else {
            z = TriggerCondition.SWIPE_COUNT;
        }
        return z;
    }

    /* renamed from: h */
    private final C3959e<Boolean> m66114h() {
        C3959e<Boolean> map = this.f56549f.execute(TopPicksTooltip.INSTANCE).e().map(C17136b.f52647a);
        C2668g.a(map, "checkTutorialViewed.exec…torialViewStatus.UNSEEN }");
        return map;
    }

    /* renamed from: i */
    private final C3959e<Boolean> m66115i() {
        C3959e<Boolean> e = this.f56548e.execute().e();
        C2668g.a(e, "isNewAccount.execute().toObservable()");
        return e;
    }

    /* renamed from: j */
    private final C3959e<Boolean> m66116j() {
        C3959e<Boolean> take = this.f56545b.observeSwipeCount().skipWhile(new C17137c(this)).map(C17138d.f52649a).take(1);
        C2668g.a(take, "swipeCountRepository.obs…\n                .take(1)");
        return take;
    }

    /* renamed from: k */
    private final ObservableTransformer<Boolean, Boolean> m66117k() {
        return new C17145i(this);
    }

    /* renamed from: d */
    public void m66120d() {
        Disposable disposable = this.f56544a;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: b */
    public void m66119b() {
        Disposable disposable = this.f56544a;
        if (disposable != null) {
            disposable.dispose();
        }
        if (this.f56546c.isEnabled()) {
            this.f56550g.execute(TopPicksTooltip.INSTANCE).b(C15756a.m59010b()).a(C17139e.f52650a, C17140f.f52651a);
        }
    }

    @NotNull
    /* renamed from: a */
    public RunStrategy m66118a() {
        return RunStrategy.TRANSIENT;
    }
}
