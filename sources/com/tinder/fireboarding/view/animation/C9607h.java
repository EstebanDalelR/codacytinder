package com.tinder.fireboarding.view.animation;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import com.tinder.base.view.TouchBlockingViewContainer;
import com.tinder.base.view.p176a.C8318a;
import com.tinder.fireboarding.view.animation.C9603f.C9601a;
import com.tinder.fireboarding.view.animation.NudgeAnimatorFactory.Position;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import tinder.com.tooltip.C19472b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 12\u00020\u0001:\u000212B%\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J \u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J0\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001f2\b\b\u0002\u0010'\u001a\u00020\u0019J\u0006\u0010(\u001a\u00020\u000fJ\b\u0010)\u001a\u00020\u0012H\u0002J\f\u0010*\u001a\u00020\u0019*\u00020\u0016H\u0002J\f\u0010+\u001a\u00020\u0019*\u00020\u0016H\u0002J\u001c\u0010,\u001a\u00020\u000f*\u00020\u00162\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0019H\u0002J\u001c\u0010/\u001a\u00020\u000f*\u00020\u00162\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0019H\u0002J\u001c\u00100\u001a\u00020\u000f*\u00020\u00162\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0019H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/tinder/fireboarding/view/animation/NudgeAnimation;", "", "fireboardingTooltipFactory", "Lcom/tinder/fireboarding/view/animation/FireboardingTooltipFactory;", "nudgeAnimatorFactory", "Lcom/tinder/fireboarding/view/animation/NudgeAnimatorFactory;", "completableFactory", "Lcom/tinder/fireboarding/view/animation/CompletableFactory;", "(Lcom/tinder/fireboarding/view/animation/FireboardingTooltipFactory;Lcom/tinder/fireboarding/view/animation/NudgeAnimatorFactory;Lcom/tinder/fireboarding/view/animation/CompletableFactory;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "likeTooltip", "Ltinder/com/tooltip/OverlayTooltipDialog;", "passTooltip", "dismissLikeTooltip", "", "dismissPassTooltip", "hideLikeTooltip", "Lio/reactivex/Completable;", "hidePassTooltip", "nudgeFromCenterToLeft", "view", "Landroid/view/View;", "nudgeFromCenterToRight", "startX", "", "startY", "nudgeFromLeftToCenter", "nudgeFromRightToCenter", "showLikeTooltip", "params", "Lcom/tinder/fireboarding/view/animation/FireboardingTooltipFactory$TooltipParams;", "showPassTooltip", "start", "touchBlockingViewContainer", "Lcom/tinder/base/view/TouchBlockingViewContainer;", "nudgeView", "likeTooltipParams", "passTooltipParams", "extraXOffsetToStartMovingCard", "stop", "wait", "centerX", "centerY", "dispatchActionDown", "x", "y", "dispatchActionMove", "dispatchActionUp", "Companion", "Factory", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.animation.h */
public final class C9607h {
    /* renamed from: a */
    public static final C9605a f32097a = new C9605a();
    /* renamed from: b */
    private Disposable f32098b;
    /* renamed from: c */
    private C19472b f32099c;
    /* renamed from: d */
    private C19472b f32100d;
    /* renamed from: e */
    private final C9603f f32101e;
    /* renamed from: f */
    private final NudgeAnimatorFactory f32102f;
    /* renamed from: g */
    private final C9579a f32103g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/fireboarding/view/animation/NudgeAnimation$Companion;", "", "()V", "extraXOffsetToStartMovingCard", "", "context", "Landroid/content/Context;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.h$a */
    public static final class C9605a {
        private C9605a() {
        }

        /* renamed from: a */
        public final float m39971a(@NotNull Context context) {
            C2668g.b(context, "context");
            context = ViewConfiguration.get(context);
            float f = (float) -1;
            C2668g.a(context, "viewConfiguration");
            return f * (((float) Math.max(context.getScaledTouchSlop() / 2, 8)) + 0.1f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/fireboarding/view/animation/NudgeAnimation$Factory;", "", "()V", "create", "Lcom/tinder/fireboarding/view/animation/NudgeAnimation;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.h$b */
    public static final class C9606b {
        @NotNull
        /* renamed from: a */
        public final C9607h m39972a() {
            return new C9607h(null, null, null, 7, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Ljava/lang/Void;", "subscribe"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.h$c */
    static final class C11830c<T> implements ObservableOnSubscribe<T> {
        /* renamed from: a */
        final /* synthetic */ C9607h f38569a;

        C11830c(C9607h c9607h) {
            this.f38569a = c9607h;
        }

        public final void subscribe(@NotNull ObservableEmitter<Void> observableEmitter) {
            C2668g.b(observableEmitter, "emitter");
            if (this.f38569a.f32099c != null) {
                C19472b b = this.f38569a.f32099c;
                if (b != null) {
                    b.a(new NudgeAnimation$hideLikeTooltip$observable$1$1(this, observableEmitter));
                    return;
                }
                return;
            }
            observableEmitter.onComplete();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Ljava/lang/Void;", "subscribe"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.h$d */
    static final class C11831d<T> implements ObservableOnSubscribe<T> {
        /* renamed from: a */
        final /* synthetic */ C9607h f38570a;

        C11831d(C9607h c9607h) {
            this.f38570a = c9607h;
        }

        public final void subscribe(@NotNull ObservableEmitter<Void> observableEmitter) {
            C2668g.b(observableEmitter, "emitter");
            if (this.f38570a.f32100d != null) {
                C19472b d = this.f38570a.f32100d;
                if (d != null) {
                    d.a(new NudgeAnimation$hidePassTooltip$observable$1$1(this, observableEmitter));
                    return;
                }
                return;
            }
            observableEmitter.onComplete();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Ljava/lang/Void;", "subscribe"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.h$e */
    static final class C11832e<T> implements ObservableOnSubscribe<T> {
        /* renamed from: a */
        final /* synthetic */ C9607h f38571a;
        /* renamed from: b */
        final /* synthetic */ C9601a f38572b;

        C11832e(C9607h c9607h, C9601a c9601a) {
            this.f38571a = c9607h;
            this.f38572b = c9601a;
        }

        public final void subscribe(@NotNull ObservableEmitter<Void> observableEmitter) {
            C2668g.b(observableEmitter, "emitter");
            observableEmitter = this.f38571a.f32101e.m39969a(this.f38572b, new NudgeAnimation$showLikeTooltip$observable$1$1(observableEmitter));
            this.f38571a.f32099c = observableEmitter;
            observableEmitter.show();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Ljava/lang/Void;", "subscribe"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.h$f */
    static final class C11833f<T> implements ObservableOnSubscribe<T> {
        /* renamed from: a */
        final /* synthetic */ C9607h f38573a;
        /* renamed from: b */
        final /* synthetic */ C9601a f38574b;

        C11833f(C9607h c9607h, C9601a c9601a) {
            this.f38573a = c9607h;
            this.f38574b = c9601a;
        }

        public final void subscribe(@NotNull ObservableEmitter<Void> observableEmitter) {
            C2668g.b(observableEmitter, "emitter");
            observableEmitter = this.f38573a.f32101e.m39969a(this.f38574b, new NudgeAnimation$showPassTooltip$observable$1$1(observableEmitter));
            this.f38573a.f32100d = observableEmitter;
            observableEmitter.show();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.h$g */
    static final class C11834g implements Action {
        /* renamed from: a */
        final /* synthetic */ C9607h f38575a;
        /* renamed from: b */
        final /* synthetic */ View f38576b;
        /* renamed from: c */
        final /* synthetic */ float f38577c;
        /* renamed from: d */
        final /* synthetic */ float f38578d;
        /* renamed from: e */
        final /* synthetic */ TouchBlockingViewContainer f38579e;

        C11834g(C9607h c9607h, View view, float f, float f2, TouchBlockingViewContainer touchBlockingViewContainer) {
            this.f38575a = c9607h;
            this.f38576b = view;
            this.f38577c = f;
            this.f38578d = f2;
            this.f38579e = touchBlockingViewContainer;
        }

        public final void run() {
            this.f38575a.m39997e(this.f38576b, this.f38577c, this.f38578d);
            this.f38575a.m39995d(this.f38576b, this.f38577c, this.f38578d);
            this.f38579e.stopBlocking();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.h$h */
    static final class C11835h implements Action {
        /* renamed from: a */
        final /* synthetic */ TouchBlockingViewContainer f38580a;

        C11835h(TouchBlockingViewContainer touchBlockingViewContainer) {
            this.f38580a = touchBlockingViewContainer;
        }

        public final void run() {
            this.f38580a.stopBlocking();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.h$i */
    static final class C11836i<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ TouchBlockingViewContainer f38581a;

        C11836i(TouchBlockingViewContainer touchBlockingViewContainer) {
            this.f38581a = touchBlockingViewContainer;
        }

        public /* synthetic */ void accept(Object obj) {
            m47739a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47739a(Throwable th) {
            C0001a.c(th, "Error during NudgeAnimation", new Object[0]);
            this.f38581a.stopBlocking();
        }
    }

    public C9607h() {
        this(null, null, null, 7, null);
    }

    public C9607h(@NotNull C9603f c9603f, @NotNull NudgeAnimatorFactory nudgeAnimatorFactory, @NotNull C9579a c9579a) {
        C2668g.b(c9603f, "fireboardingTooltipFactory");
        C2668g.b(nudgeAnimatorFactory, "nudgeAnimatorFactory");
        C2668g.b(c9579a, "completableFactory");
        this.f32101e = c9603f;
        this.f32102f = nudgeAnimatorFactory;
        this.f32103g = c9579a;
    }

    public /* synthetic */ C9607h(C9603f c9603f, NudgeAnimatorFactory nudgeAnimatorFactory, C9579a c9579a, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            c9603f = new C9603f();
        }
        if ((i & 2) != null) {
            nudgeAnimatorFactory = new NudgeAnimatorFactory();
        }
        if ((i & 4) != 0) {
            c9579a = new C9579a();
        }
        this(c9603f, nudgeAnimatorFactory, c9579a);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39978a(C9607h c9607h, TouchBlockingViewContainer touchBlockingViewContainer, View view, C9601a c9601a, C9601a c9601a2, float f, int i, Object obj) {
        if ((i & 16) != 0) {
            f = f32097a;
            i = view.getContext();
            C2668g.a(i, "nudgeView.context");
            f = f.m39971a(i);
        }
        c9607h.m40001a(touchBlockingViewContainer, view, c9601a, c9601a2, f);
    }

    /* renamed from: a */
    public final void m40001a(@NotNull TouchBlockingViewContainer touchBlockingViewContainer, @NotNull View view, @NotNull C9601a c9601a, @NotNull C9601a c9601a2, float f) {
        C2668g.b(touchBlockingViewContainer, "touchBlockingViewContainer");
        C2668g.b(view, "nudgeView");
        C2668g.b(c9601a, "likeTooltipParams");
        C2668g.b(c9601a2, "passTooltipParams");
        touchBlockingViewContainer.startBlocking();
        float c = m39987c(view) + f;
        float d = m39992d(view);
        this.f32098b = m39976a(c9601a).b(m39999f()).b(m39975a(view, c, d)).b(m39999f()).b(m39974a(view)).b(m39980b()).b(m39999f()).b(m39983b(c9601a2)).b(m39981b(view)).b(m39999f()).b(m39982b(view, c, d)).b(m39993d()).c((Action) new C11834g(this, view, c, d, touchBlockingViewContainer)).a((Action) new C11835h(touchBlockingViewContainer), (Consumer) new C11836i(touchBlockingViewContainer));
    }

    /* renamed from: a */
    public final void m40000a() {
        m39988c();
        m39996e();
        Disposable disposable = this.f32098b;
        if (disposable != null) {
            disposable.dispose();
            this.f32098b = (Disposable) null;
        }
    }

    /* renamed from: a */
    private final C3956a m39976a(C9601a c9601a) {
        c9601a = C3959e.create(new C11832e(this, c9601a));
        C9579a c9579a = this.f32103g;
        C2668g.a(c9601a, "observable");
        return c9579a.m39912a(c9601a);
    }

    /* renamed from: b */
    private final C3956a m39980b() {
        C3959e create = C3959e.create(new C11830c(this));
        C9579a c9579a = this.f32103g;
        C2668g.a(create, "observable");
        return c9579a.m39912a(create);
    }

    /* renamed from: c */
    private final void m39988c() {
        C19472b c19472b = this.f32099c;
        if (c19472b != null) {
            c19472b.dismiss();
            this.f32099c = (C19472b) null;
        }
    }

    /* renamed from: b */
    private final C3956a m39983b(C9601a c9601a) {
        c9601a = C3959e.create(new C11833f(this, c9601a));
        C9579a c9579a = this.f32103g;
        C2668g.a(c9601a, "observable");
        return c9579a.m39912a(c9601a);
    }

    /* renamed from: d */
    private final C3956a m39993d() {
        C3959e create = C3959e.create(new C11831d(this));
        C9579a c9579a = this.f32103g;
        C2668g.a(create, "observable");
        return c9579a.m39912a(create);
    }

    /* renamed from: e */
    private final void m39996e() {
        C19472b c19472b = this.f32100d;
        if (c19472b != null) {
            c19472b.dismiss();
            this.f32100d = (C19472b) null;
        }
    }

    /* renamed from: a */
    private final C3956a m39975a(View view, float f, float f2) {
        Function0 nudgeAnimation$nudgeFromCenterToRight$1 = new NudgeAnimation$nudgeFromCenterToRight$1(this, view, f, f2);
        return NudgeAnimatorFactory.m39904a(this.f32102f, view, Position.CENTER, Position.RIGHT, (Interpolator) new DecelerateInterpolator(), 500, nudgeAnimation$nudgeFromCenterToRight$1, null, 64, null);
    }

    /* renamed from: a */
    private final C3956a m39974a(View view) {
        return NudgeAnimatorFactory.m39904a(this.f32102f, view, Position.RIGHT, Position.CENTER, new OvershootInterpolator(1.3f), 600, null, null, 96, null);
    }

    /* renamed from: b */
    private final C3956a m39981b(View view) {
        return NudgeAnimatorFactory.m39904a(this.f32102f, view, Position.CENTER, Position.LEFT, new DecelerateInterpolator(), 500, null, null, 96, null);
    }

    /* renamed from: b */
    private final C3956a m39982b(View view, float f, float f2) {
        Function0 nudgeAnimation$nudgeFromLeftToCenter$1 = new NudgeAnimation$nudgeFromLeftToCenter$1(this, view, f, f2);
        return NudgeAnimatorFactory.m39904a(this.f32102f, view, Position.LEFT, Position.CENTER, (Interpolator) new OvershootInterpolator(1.3f), 600, null, nudgeAnimation$nudgeFromLeftToCenter$1, 32, null);
    }

    /* renamed from: f */
    private final C3956a m39999f() {
        C3956a a = this.f32103g.m39911a(250, TimeUnit.MILLISECONDS).a(C15674a.a());
        C2668g.a(a, "completableFactory.timer…dSchedulers.mainThread())");
        return a;
    }

    /* renamed from: c */
    private final void m39989c(@NotNull View view, float f, float f2) {
        view.dispatchTouchEvent(C8318a.f29598a.m35427b(f, f2));
    }

    /* renamed from: d */
    private final void m39995d(@NotNull View view, float f, float f2) {
        view.dispatchTouchEvent(C8318a.f29598a.m35428c(f, f2));
    }

    /* renamed from: e */
    private final void m39997e(@NotNull View view, float f, float f2) {
        view.dispatchTouchEvent(C8318a.f29598a.m35425a(f, f2));
    }

    /* renamed from: c */
    private final float m39987c(@NotNull View view) {
        return ((float) view.getWidth()) / ((float) 2);
    }

    /* renamed from: d */
    private final float m39992d(@NotNull View view) {
        return ((float) view.getHeight()) / ((float) 2);
    }
}
