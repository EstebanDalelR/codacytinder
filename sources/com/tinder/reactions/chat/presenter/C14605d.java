package com.tinder.reactions.chat.presenter;

import com.tinder.chat.view.model.MessageViewModel;
import com.tinder.chat.view.model.ag;
import com.tinder.chat.view.provider.ChatEmptyStateProvider;
import com.tinder.chat.view.provider.ChatNewMessagesProvider;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.profile.model.Tutorial.ReactionsTooltip;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.managers.bk;
import com.tinder.reactions.analytics.C16272a;
import com.tinder.reactions.analytics.C16272a.C14579a;
import com.tinder.reactions.analytics.C16274d;
import com.tinder.reactions.analytics.C16274d.C14581a;
import com.tinder.reactions.analytics.GestureIntroFrom;
import com.tinder.reactions.analytics.model.GestureRespondIntro;
import com.tinder.reactions.chat.target.ReactionTutorialFeatureTarget;
import com.tinder.reactions.gestures.common.ReactionEvent;
import com.tinder.reactions.gestures.common.ReactionEvent.State;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.p385c.C16284c;
import io.reactivex.C3956a;
import io.reactivex.C3958c;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BY\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\b\u0010'\u001a\u00020%H\u0002J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001cH\u0002J\u0006\u0010*\u001a\u00020%J\u0006\u0010+\u001a\u00020%J\u0006\u0010,\u001a\u00020%J\u0006\u0010-\u001a\u00020%J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0/H\u0002J\b\u00100\u001a\u00020%H\u0002J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u001c0/H\u0002J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020%0/H\u0002J\r\u00103\u001a\u00020%H\u0001¢\u0006\u0002\b4J\r\u00105\u001a\u00020%H\u0001¢\u0006\u0002\b6J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u001c08H\u0002J\b\u00109\u001a\u00020%H\u0002J\b\u0010:\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/tinder/reactions/chat/presenter/ReactionTutorialFromChatInputPresenter;", "", "matchId", "", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "animationMediator", "Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "chatNewMessagesProvider", "Lcom/tinder/chat/view/provider/ChatNewMessagesProvider;", "chatEmptyStateProvider", "Lcom/tinder/chat/view/provider/ChatEmptyStateProvider;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "managerSharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "confirmTinderReactionsChatTutorial", "Lcom/tinder/reactions/usecase/ConfirmTinderReactionsChatTutorial;", "addGrandGestureShowChatIntroEvent", "Lcom/tinder/reactions/analytics/AddGrandGestureShowChatIntroEvent;", "addGrandGestureDismissChatIntroEvent", "Lcom/tinder/reactions/analytics/AddGrandGestureDismissChatIntroEvent;", "(Ljava/lang/String;Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;Lcom/tinder/chat/view/provider/ChatNewMessagesProvider;Lcom/tinder/chat/view/provider/ChatEmptyStateProvider;Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/reactions/usecase/ConfirmTinderReactionsChatTutorial;Lcom/tinder/reactions/analytics/AddGrandGestureShowChatIntroEvent;Lcom/tinder/reactions/analytics/AddGrandGestureDismissChatIntroEvent;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "isReplyReactionDialogShown", "", "target", "Lcom/tinder/reactions/chat/target/ReactionTutorialFeatureTarget;", "getTarget$Tinder_release", "()Lcom/tinder/reactions/chat/target/ReactionTutorialFeatureTarget;", "setTarget$Tinder_release", "(Lcom/tinder/reactions/chat/target/ReactionTutorialFeatureTarget;)V", "tooltipDialogClicked", "addTooltipDialogClickedDismiss", "", "addTooltipDialogOtherDismiss", "confirmReactionsTutorialChatDismissed", "handleNewMessages", "hasNewReactionMessage", "handleShowReactionEmptyTutorial", "handleShowReactionReplyTutorial", "handleTooltipDialogClicked", "handleTooltipDialogDismiss", "observeEmptyChat", "Lrx/Observable;", "observeNewMessages", "observeNewReactionMessage", "observeReactionAnimationCompleted", "onDrop", "onDrop$Tinder_release", "onTake", "onTake$Tinder_release", "shouldShowReactionButtonTutorial", "Lio/reactivex/Maybe;", "showEmptyTutorialDialogIfNeeded", "showReplyTutorialDialogIfNeeded", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.chat.presenter.d */
public final class C14605d {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public ReactionTutorialFeatureTarget f46086a;
    /* renamed from: b */
    private final C17356a f46087b = new C17356a();
    /* renamed from: c */
    private C19573b f46088c = new C19573b();
    /* renamed from: d */
    private boolean f46089d;
    /* renamed from: e */
    private boolean f46090e;
    /* renamed from: f */
    private final String f46091f;
    /* renamed from: g */
    private final AbTestUtility f46092g;
    /* renamed from: h */
    private final C14641a f46093h;
    /* renamed from: i */
    private final ChatNewMessagesProvider f46094i;
    /* renamed from: j */
    private final ChatEmptyStateProvider f46095j;
    /* renamed from: k */
    private final CheckTutorialViewed f46096k;
    /* renamed from: l */
    private final bk f46097l;
    /* renamed from: m */
    private final C16284c f46098m;
    /* renamed from: n */
    private final C16274d f46099n;
    /* renamed from: o */
    private final C16272a f46100o;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$a */
    static final class C16300a implements Action {
        /* renamed from: a */
        public static final C16300a f50737a = new C16300a();

        C16300a() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Observable;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$d */
    static final class C16301d<T, R> implements Function<T, ObservableSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C14605d f50738a;

        C16301d(C14605d c14605d) {
            this.f50738a = c14605d;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m61507a((Boolean) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3959e<Boolean> m61507a(@NotNull Boolean bool) {
            C2668g.b(bool, "<anonymous parameter 0>");
            bool = Observable.b(this.f50738a.m55723m(), this.f50738a.m55722l()).c(1);
            C2668g.a(bool, "Observable.merge(observe…                 .take(1)");
            return RxJavaInteropExtKt.toV2Observable(bool);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$e */
    static final class C16302e<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C14605d f50739a;

        C16302e(C14605d c14605d) {
            this.f50739a = c14605d;
        }

        public /* synthetic */ void accept(Object obj) {
            m61508a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m61508a(Boolean bool) {
            C14605d c14605d = this.f50739a;
            C2668g.a(bool, "it");
            c14605d.m55714a((boolean) bool.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$f */
    static final class C16303f<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16303f f50740a = new C16303f();

        C16303f() {
        }

        public /* synthetic */ void accept(Object obj) {
            m61509a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m61509a(Throwable th) {
            C0001a.c(th, "Unable to observe new inbound messages", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$l */
    static final class C16304l<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C14605d f50741a;

        C16304l(C14605d c14605d) {
            this.f50741a = c14605d;
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m61510a((TutorialViewStatus) obj));
        }

        /* renamed from: a */
        public final boolean m61510a(@NotNull TutorialViewStatus tutorialViewStatus) {
            C2668g.b(tutorialViewStatus, "it");
            return (tutorialViewStatus == TutorialViewStatus.UNSEEN && this.f50741a.f46097l.ah() == null) ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$m */
    static final class C16305m<T> implements Predicate<Boolean> {
        /* renamed from: a */
        public static final C16305m f50742a = new C16305m();

        C16305m() {
        }

        @NotNull
        /* renamed from: a */
        public final Boolean m61511a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return bool;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m61511a((Boolean) obj).booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$n */
    static final class C16306n<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C14605d f50743a;

        C16306n(C14605d c14605d) {
            this.f50743a = c14605d;
        }

        public /* synthetic */ void accept(Object obj) {
            m61512a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m61512a(Boolean bool) {
            this.f50743a.m55728a().showReactionButtonEmptyTutorialDialog();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$o */
    static final class C16307o<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C14605d f50744a;

        C16307o(C14605d c14605d) {
            this.f50744a = c14605d;
        }

        public /* synthetic */ void accept(Object obj) {
            m61513a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m61513a(Boolean bool) {
            this.f50744a.m55728a().showReactionButtonReplyTutorialDialog();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Lkotlin/Unit;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$c */
    static final class C17950c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17950c f55871a = new C17950c();

        C17950c() {
        }

        /* renamed from: a */
        public final boolean m65277a(C15813i c15813i) {
            return false;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65277a((C15813i) obj));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004 \u0005*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/chat/view/model/MessageViewModel;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$g */
    static final class C17951g<T, R> implements Func1<List<? extends MessageViewModel<?>>, Boolean> {
        /* renamed from: a */
        public static final C17951g f55872a = new C17951g();

        C17951g() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65278a((List) obj));
        }

        /* renamed from: a */
        public final boolean m65278a(List<? extends MessageViewModel<?>> list) {
            C2668g.a(list, "it");
            return list.isEmpty() ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004 \u0005*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/chat/view/model/ReactionMessageViewModel;", "newMessages", "Lcom/tinder/chat/view/model/MessageViewModel;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$h */
    static final class C17952h<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17952h f55873a = new C17952h();

        C17952h() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65279a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<ag> m65279a(List<? extends MessageViewModel<?>> list) {
            C2668g.a(list, "newMessages");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (next instanceof ag) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "newMessages", "", "Lcom/tinder/chat/view/model/ReactionMessageViewModel;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$i */
    static final class C17953i<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17953i f55874a = new C17953i();

        C17953i() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65280a((List) obj));
        }

        /* renamed from: a */
        public final boolean m65280a(List<ag> list) {
            return list.isEmpty() ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lcom/tinder/reactions/gestures/common/ReactionEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$j */
    static final class C17954j<T, R> implements Func1<ReactionEvent, Boolean> {
        /* renamed from: a */
        public static final C17954j f55875a = new C17954j();

        C17954j() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65281a((ReactionEvent) obj));
        }

        /* renamed from: a */
        public final boolean m65281a(ReactionEvent reactionEvent) {
            return reactionEvent.m55892a() == State.REACTION_COMPLETED ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/reactions/gestures/common/ReactionEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$k */
    static final class C17955k<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17955k f55876a = new C17955k();

        C17955k() {
        }

        /* renamed from: a */
        public final void m65282a(ReactionEvent reactionEvent) {
        }

        public /* synthetic */ Object call(Object obj) {
            m65282a((ReactionEvent) obj);
            return C15813i.f49016a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "call", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.presenter.d$b */
    static final class C18689b<T> implements Action1<C15813i> {
        /* renamed from: a */
        final /* synthetic */ C14605d f58168a;

        C18689b(C14605d c14605d) {
            this.f58168a = c14605d;
        }

        public /* synthetic */ void call(Object obj) {
            m67122a((C15813i) obj);
        }

        /* renamed from: a */
        public final void m67122a(C15813i c15813i) {
            this.f58168a.m55719i();
        }
    }

    @Inject
    public C14605d(@NotNull String str, @NotNull AbTestUtility abTestUtility, @NotNull C14641a c14641a, @NotNull ChatNewMessagesProvider chatNewMessagesProvider, @NotNull ChatEmptyStateProvider chatEmptyStateProvider, @NotNull CheckTutorialViewed checkTutorialViewed, @NotNull bk bkVar, @NotNull C16284c c16284c, @NotNull C16274d c16274d, @NotNull C16272a c16272a) {
        C2668g.b(str, "matchId");
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(c14641a, "animationMediator");
        C2668g.b(chatNewMessagesProvider, "chatNewMessagesProvider");
        C2668g.b(chatEmptyStateProvider, "chatEmptyStateProvider");
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        C2668g.b(bkVar, "managerSharedPreferences");
        C2668g.b(c16284c, "confirmTinderReactionsChatTutorial");
        C2668g.b(c16274d, "addGrandGestureShowChatIntroEvent");
        C2668g.b(c16272a, "addGrandGestureDismissChatIntroEvent");
        this.f46091f = str;
        this.f46092g = abTestUtility;
        this.f46093h = c14641a;
        this.f46094i = chatNewMessagesProvider;
        this.f46095j = chatEmptyStateProvider;
        this.f46096k = checkTutorialViewed;
        this.f46097l = bkVar;
        this.f46098m = c16284c;
        this.f46099n = c16274d;
        this.f46100o = c16272a;
    }

    @NotNull
    /* renamed from: a */
    public final ReactionTutorialFeatureTarget m55728a() {
        ReactionTutorialFeatureTarget reactionTutorialFeatureTarget = this.f46086a;
        if (reactionTutorialFeatureTarget == null) {
            C2668g.b("target");
        }
        return reactionTutorialFeatureTarget;
    }

    @Take
    /* renamed from: b */
    public final void m55729b() {
        if (this.f46092g.isGrandGesturesEnabled() && !this.f46092g.isBitmojiEnabled()) {
            m55718h();
        }
    }

    @Drop
    /* renamed from: c */
    public final void m55730c() {
        this.f46088c.a();
        this.f46087b.m63446a();
    }

    /* renamed from: d */
    public final void m55731d() {
        this.f46099n.m61455a(new C14581a(this.f46091f, GestureIntroFrom.CHAT_NO_GESTURE));
    }

    /* renamed from: e */
    public final void m55732e() {
        this.f46089d = true;
        this.f46099n.m61455a(new C14581a(this.f46091f, GestureIntroFrom.CHAT_WITH_GESTURE));
    }

    /* renamed from: f */
    public final void m55733f() {
        m55725o();
        if (this.f46090e) {
            m55726p();
        } else {
            m55727q();
        }
        this.f46089d = false;
        this.f46090e = false;
    }

    /* renamed from: g */
    public final void m55734g() {
        this.f46090e = true;
        ReactionTutorialFeatureTarget reactionTutorialFeatureTarget = this.f46086a;
        if (reactionTutorialFeatureTarget == null) {
            C2668g.b("target");
        }
        reactionTutorialFeatureTarget.dismissTooltipDialog();
    }

    /* renamed from: h */
    private final void m55718h() {
        this.f46087b.add(m55721k().b(new C16301d(this)).subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C16302e(this), C16303f.f50740a));
    }

    /* renamed from: a */
    private final void m55714a(boolean z) {
        if (z) {
            m55724n().c(1).a(C19397a.a()).d(new C18689b(this));
        } else {
            m55720j();
        }
    }

    /* renamed from: i */
    private final void m55719i() {
        this.f46087b.add(m55721k().b(C15756a.m59010b()).a(C15674a.m58830a()).d(new C16307o(this)));
    }

    /* renamed from: j */
    private final void m55720j() {
        this.f46087b.add(m55721k().b(C15756a.m59010b()).a(C15674a.m58830a()).d(new C16306n(this)));
    }

    /* renamed from: k */
    private final C3958c<Boolean> m55721k() {
        C3958c<Boolean> a = this.f46096k.execute(ReactionsTooltip.INSTANCE).e(new C16304l(this)).a(C16305m.f50742a);
        C2668g.a(a, "checkTutorialViewed.exec…           .filter { it }");
        return a;
    }

    /* renamed from: l */
    private final Observable<Boolean> m55722l() {
        Observable<Boolean> k = this.f46095j.observeEmptyChat().k(C17950c.f55871a);
        C2668g.a(k, "chatEmptyStateProvider.o…           .map { false }");
        return k;
    }

    /* renamed from: m */
    private final Observable<Boolean> m55723m() {
        Observable<Boolean> k = this.f46094i.observeNewInboundMessages().f(C17951g.f55872a).k(C17952h.f55873a).k(C17953i.f55874a);
        C2668g.a(k, "chatNewMessagesProvider.… !newMessages.isEmpty() }");
        return k;
    }

    /* renamed from: n */
    private final Observable<C15813i> m55724n() {
        Observable<C15813i> k = this.f46093h.m55832b().f(C17954j.f55875a).k(C17955k.f55876a);
        C2668g.a(k, "animationMediator.getRea…            .map { Unit }");
        return k;
    }

    /* renamed from: o */
    private final void m55725o() {
        C3956a b = this.f46098m.execute().b(C15756a.m59010b());
        Action action = C16300a.f50737a;
        Function1 function1 = C19164x376ad41a.f59370a;
        if (function1 != null) {
            function1 = new C16308e(function1);
        }
        this.f46087b.add(b.a(action, (Consumer) function1));
    }

    /* renamed from: p */
    private final void m55726p() {
        GestureIntroFrom gestureIntroFrom;
        C16272a c16272a = this.f46100o;
        String str = this.f46091f;
        if (this.f46089d) {
            gestureIntroFrom = GestureIntroFrom.CHAT_WITH_GESTURE;
        } else {
            gestureIntroFrom = GestureIntroFrom.CHAT_NO_GESTURE;
        }
        c16272a.m61451a(new C14579a(str, gestureIntroFrom, GestureRespondIntro.CHAT_BUBBLE));
    }

    /* renamed from: q */
    private final void m55727q() {
        GestureIntroFrom gestureIntroFrom;
        C16272a c16272a = this.f46100o;
        String str = this.f46091f;
        if (this.f46089d) {
            gestureIntroFrom = GestureIntroFrom.CHAT_WITH_GESTURE;
        } else {
            gestureIntroFrom = GestureIntroFrom.CHAT_NO_GESTURE;
        }
        c16272a.m61451a(new C14579a(str, gestureIntroFrom, GestureRespondIntro.CHAT_OTHER));
    }
}
