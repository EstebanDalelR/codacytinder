package com.tinder.reactions.gestures.animators;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Handler;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.LottieAnimationView;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.common.C14608a;
import com.tinder.reactions.gestures.animation.ReactionEntranceAnimationDecorator;
import com.tinder.reactions.gestures.animation.ReactionEntranceAnimationDecorator.State;
import com.tinder.reactions.gestures.animation.ReactionExitAnimationDecorator;
import com.tinder.reactions.gestures.animation.ReactionExitAnimationDecorator.ExitAnimationListener;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.gestures.view.GrandGestureReactionView;
import com.tinder.reactions.gestures.viewmodel.C14676f;
import com.tinder.reactions.p389d.C14620b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001d\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020 H\u0002J\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020 2\u0006\u0010#\u001a\u00020\fH\u0016J\u0006\u0010%\u001a\u00020 J\b\u0010&\u001a\u00020 H\u0002J\b\u0010'\u001a\u00020 H\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0003R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/tinder/reactions/gestures/animators/GrandGestureReactionAnimator;", "Landroid/animation/AnimatorListenerAdapter;", "reactionView", "Lcom/tinder/reactions/gestures/view/GrandGestureReactionView;", "mediator", "Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "viewModel", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureReactionViewModel;", "(Lcom/tinder/reactions/gestures/view/GrandGestureReactionView;Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;Lcom/tinder/reactions/gestures/viewmodel/GrandGestureReactionViewModel;)V", "animationFileName", "", "currentLottieDrawableAnimator", "Landroid/animation/Animator;", "enterAnimation", "Lcom/tinder/reactions/gestures/animation/ReactionEntranceAnimationDecorator;", "exitAnimation", "Lcom/tinder/reactions/gestures/animation/ReactionExitAnimationDecorator;", "getMediator", "()Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "reactionCache", "Lcom/tinder/reactions/common/ReactionCompositionCache;", "getReactionCache", "()Lcom/tinder/reactions/common/ReactionCompositionCache;", "setReactionCache", "(Lcom/tinder/reactions/common/ReactionCompositionCache;)V", "shouldAnimationLoop", "", "getViewModel", "()Lcom/tinder/reactions/gestures/viewmodel/GrandGestureReactionViewModel;", "enterAnimationIsNotRunning", "exitAnimationIsNotRunning", "gestureCompleted", "", "loadFromCache", "onAnimationEnd", "animation", "onAnimationStart", "playReaction", "setupDagger", "startEnterAnimation", "startExitAnimation", "startPlayingReaction", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.animators.f */
public final class C14650f extends AnimatorListenerAdapter {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14608a f46191a;
    /* renamed from: b */
    private ReactionEntranceAnimationDecorator f46192b = this.f46199i.m55928d();
    /* renamed from: c */
    private ReactionExitAnimationDecorator f46193c = this.f46199i.m55929e();
    /* renamed from: d */
    private final boolean f46194d;
    /* renamed from: e */
    private final String f46195e;
    /* renamed from: f */
    private Animator f46196f;
    /* renamed from: g */
    private final GrandGestureReactionView f46197g;
    @NotNull
    /* renamed from: h */
    private final C14641a f46198h;
    @NotNull
    /* renamed from: i */
    private final C14676f f46199i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.animators.f$c */
    static final class C14649c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C14650f f46190a;

        C14649c(C14650f c14650f) {
            this.f46190a = c14650f;
        }

        public final void run() {
            this.f46190a.m55849g();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "lottieDrawable", "Lcom/airbnb/lottie/LottieDrawable;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.animators.f$a */
    static final class C18727a<T> implements Action1<C0792d> {
        /* renamed from: a */
        final /* synthetic */ C14650f f58213a;

        C18727a(C14650f c14650f) {
            this.f58213a = c14650f;
        }

        public /* synthetic */ void call(Object obj) {
            m67151a((C0792d) obj);
        }

        /* renamed from: a */
        public final void m67151a(C0792d c0792d) {
            GrandGestureReactionView a = this.f58213a.f46197g;
            C14676f c = this.f58213a.m55855c();
            C2668g.a(c0792d, "lottieDrawable");
            a.m68076a(c, c0792d);
            this.f58213a.m55847e();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.animators.f$b */
    static final class C18728b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C14650f f58214a;

        C18728b(C14650f c14650f) {
            this.f58214a = c14650f;
        }

        public /* synthetic */ void call(Object obj) {
            m67152a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67152a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't load ");
            stringBuilder.append(this.f58214a.f46195e);
            stringBuilder.append(" from cache");
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @NotNull
    /* renamed from: c */
    public final C14676f m55855c() {
        return this.f46199i;
    }

    public C14650f(@NotNull GrandGestureReactionView grandGestureReactionView, @NotNull C14641a c14641a, @NotNull C14676f c14676f) {
        C2668g.b(grandGestureReactionView, "reactionView");
        C2668g.b(c14641a, "mediator");
        C2668g.b(c14676f, "viewModel");
        this.f46197g = grandGestureReactionView;
        this.f46198h = c14641a;
        this.f46199i = c14676f;
        this.f46194d = this.f46199i.m55930f() > 0 ? true : null;
        this.f46195e = this.f46199i.m55926b();
        m55852j();
        this.f46193c.m61624a((ExitAnimationListener) new ExitAnimationListener() {
            public void onExitAnimationEnd() {
                this.m55854b();
            }
        });
    }

    /* renamed from: a */
    public final void m55853a() {
        C14608a c14608a = this.f46191a;
        if (c14608a == null) {
            C2668g.b("reactionCache");
        }
        if (c14608a.m55755b(this.f46195e)) {
            c14608a = this.f46191a;
            if (c14608a == null) {
                C2668g.b("reactionCache");
            }
            if (c14608a.m55753a((LottieAnimationView) this.f46197g, this.f46195e)) {
                m55845d();
                return;
            }
            this.f46197g.m68075a(this.f46199i);
            m55847e();
            return;
        }
        C14620b.f46124a.m55780a(this.f46197g, this.f46195e, new GrandGestureReactionAnimator$playReaction$1(this));
    }

    /* renamed from: d */
    private final void m55845d() {
        C14608a c14608a = this.f46191a;
        if (c14608a == null) {
            C2668g.b("reactionCache");
        }
        c14608a.m55751a(this.f46195e).b(Schedulers.io()).a(C19397a.a()).a(new C18727a(this), new C18728b(this));
    }

    /* renamed from: e */
    private final synchronized void m55847e() {
        m55848f();
        if (this.f46194d) {
            new Handler().postDelayed(new C14649c(this), this.f46199i.m55930f());
        }
    }

    /* renamed from: b */
    public final void m55854b() {
        this.f46198h.m55834c(this.f46199i.m55925a());
    }

    public void onAnimationStart(@NotNull Animator animator) {
        C2668g.b(animator, "animation");
        this.f46196f = animator;
    }

    public void onAnimationEnd(@NotNull Animator animator) {
        C2668g.b(animator, "animation");
        if ((C2668g.a(this.f46196f, animator) ^ 1) == null && this.f46194d == null) {
            m55849g();
        }
    }

    /* renamed from: f */
    private final void m55848f() {
        if (m55850h() && m55851i()) {
            this.f46197g.m68077c(this);
            this.f46198h.m55833b(this.f46199i.m55925a());
            this.f46192b.mo11965a(this.f46197g);
        }
    }

    /* renamed from: g */
    private final void m55849g() {
        if (m55851i()) {
            this.f46197g.m68078d(this);
            this.f46193c.mo11965a(this.f46197g);
        }
    }

    /* renamed from: h */
    private final boolean m55850h() {
        return this.f46192b.m55835a() != State.RUNNING;
    }

    /* renamed from: i */
    private final boolean m55851i() {
        return this.f46193c.m55835a() != State.RUNNING;
    }

    /* renamed from: j */
    private final void m55852j() {
        Context a = C14398a.m54830a(this.f46197g.getContext());
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) a).provideChatActivityComponent().inject(this);
    }
}
