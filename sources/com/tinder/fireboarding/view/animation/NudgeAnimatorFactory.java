package com.tinder.fireboarding.view.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.animation.Interpolator;
import com.tinder.base.view.p176a.C8318a;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJH\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u001a"}, d2 = {"Lcom/tinder/fireboarding/view/animation/NudgeAnimatorFactory;", "", "()V", "create", "Lio/reactivex/Completable;", "view", "Landroid/view/View;", "fromPosition", "Lcom/tinder/fireboarding/view/animation/NudgeAnimatorFactory$Position;", "toPosition", "interpolator", "Landroid/view/animation/Interpolator;", "animationDuration", "", "onAnimationStart", "Lkotlin/Function0;", "", "onAnimationEnd", "prepareAnimator", "Landroid/animation/ValueAnimator;", "animator", "sourcePosition", "destinationPosition", "toViewX", "", "Position", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
public final class NudgeAnimatorFactory {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/fireboarding/view/animation/NudgeAnimatorFactory$Position;", "", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    public enum Position {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.NudgeAnimatorFactory$a */
    static final class C9572a<V> implements Callable<D> {
        /* renamed from: a */
        public static final C9572a f31999a = new C9572a();

        C9572a() {
        }

        public /* synthetic */ Object call() {
            return m39900a();
        }

        /* renamed from: a */
        public final ValueAnimator m39900a() {
            return ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/tinder/fireboarding/view/animation/NudgeAnimatorFactory$prepareAnimator$3$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/fireboarding/view/animation/NudgeAnimatorFactory$prepareAnimator$3;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.NudgeAnimatorFactory$d */
    public static final class C9573d extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ Function0 f32000a;
        /* renamed from: b */
        final /* synthetic */ Function0 f32001b;
        /* renamed from: c */
        final /* synthetic */ float f32002c;
        /* renamed from: d */
        final /* synthetic */ float f32003d;
        /* renamed from: e */
        final /* synthetic */ float f32004e;
        /* renamed from: f */
        final /* synthetic */ View f32005f;

        C9573d(Function0 function0, Function0 function02, float f, float f2, float f3, View view) {
            this.f32000a = function0;
            this.f32001b = function02;
            this.f32002c = f;
            this.f32003d = f2;
            this.f32004e = f3;
            this.f32005f = view;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            this.f32000a.invoke();
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f32001b.invoke();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/fireboarding/view/animation/NudgeAnimatorFactory$prepareAnimator$3$2"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.NudgeAnimatorFactory$e */
    static final class C9574e implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ Function0 f32006a;
        /* renamed from: b */
        final /* synthetic */ Function0 f32007b;
        /* renamed from: c */
        final /* synthetic */ float f32008c;
        /* renamed from: d */
        final /* synthetic */ float f32009d;
        /* renamed from: e */
        final /* synthetic */ float f32010e;
        /* renamed from: f */
        final /* synthetic */ View f32011f;

        C9574e(Function0 function0, Function0 function02, float f, float f2, float f3, View view) {
            this.f32006a = function0;
            this.f32007b = function02;
            this.f32008c = f;
            this.f32009d = f2;
            this.f32010e = f3;
            this.f32011f = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f = this.f32008c;
            float f2 = this.f32009d - this.f32008c;
            C2668g.a(valueAnimator, "it");
            this.f32011f.dispatchTouchEvent(C8318a.f29598a.m35425a(f + (f2 * valueAnimator.getAnimatedFraction()), this.f32010e));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Landroid/animation/ValueAnimator;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.NudgeAnimatorFactory$b */
    static final class C11826b<T, R> implements Function<D, ObservableSource<? extends T>> {
        /* renamed from: a */
        final /* synthetic */ NudgeAnimatorFactory f38557a;
        /* renamed from: b */
        final /* synthetic */ View f38558b;
        /* renamed from: c */
        final /* synthetic */ Position f38559c;
        /* renamed from: d */
        final /* synthetic */ Position f38560d;
        /* renamed from: e */
        final /* synthetic */ Function0 f38561e;
        /* renamed from: f */
        final /* synthetic */ Function0 f38562f;
        /* renamed from: g */
        final /* synthetic */ long f38563g;
        /* renamed from: h */
        final /* synthetic */ Interpolator f38564h;

        C11826b(NudgeAnimatorFactory nudgeAnimatorFactory, View view, Position position, Position position2, Function0 function0, Function0 function02, long j, Interpolator interpolator) {
            this.f38557a = nudgeAnimatorFactory;
            this.f38558b = view;
            this.f38559c = position;
            this.f38560d = position2;
            this.f38561e = function0;
            this.f38562f = function02;
            this.f38563g = j;
            this.f38564h = interpolator;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47737a((ValueAnimator) obj);
        }

        /* renamed from: a */
        public final C3959e<Void> m47737a(@NotNull final ValueAnimator valueAnimator) {
            C2668g.b(valueAnimator, "it");
            return C3959e.create(new ObservableOnSubscribe<T>() {
                public final void subscribe(@NotNull ObservableEmitter<Void> observableEmitter) {
                    C2668g.b(observableEmitter, "emitter");
                    observableEmitter = this.f38557a.m39902a(valueAnimator, this.f38558b, this.f38559c, this.f38560d, this.f38561e, new NudgeAnimatorFactory$create$observable$2$1$1(this, observableEmitter));
                    observableEmitter.setDuration(this.f38563g);
                    observableEmitter.setInterpolator(this.f38564h);
                    observableEmitter.start();
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.NudgeAnimatorFactory$c */
    static final class C11827c<T> implements Consumer<D> {
        /* renamed from: a */
        public static final C11827c f38565a = new C11827c();

        C11827c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47738a((ValueAnimator) obj);
        }

        /* renamed from: a */
        public final void m47738a(ValueAnimator valueAnimator) {
            valueAnimator.cancel();
        }
    }

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ C3956a m39904a(NudgeAnimatorFactory nudgeAnimatorFactory, View view, Position position, Position position2, Interpolator interpolator, long j, Function0 function0, Function0 function02, int i, Object obj) {
        return nudgeAnimatorFactory.m39905a(view, position, position2, interpolator, j, (i & 32) != 0 ? NudgeAnimatorFactory$create$1.f44437a : function0, (i & 64) != 0 ? NudgeAnimatorFactory$create$2.f44438a : function02);
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m39905a(@NotNull View view, @NotNull Position position, @NotNull Position position2, @NotNull Interpolator interpolator, long j, @NotNull Function0<C15813i> function0, @NotNull Function0<C15813i> function02) {
        View view2 = view;
        C2668g.b(view2, "view");
        Position position3 = position;
        C2668g.b(position3, "fromPosition");
        Position position4 = position2;
        C2668g.b(position4, "toPosition");
        Interpolator interpolator2 = interpolator;
        C2668g.b(interpolator2, "interpolator");
        Function0<C15813i> function03 = function0;
        C2668g.b(function03, "onAnimationStart");
        Function0<C15813i> function04 = function02;
        C2668g.b(function04, "onAnimationEnd");
        C3956a a = C3956a.a(C3959e.using(C9572a.f31999a, new C11826b(this, view2, position3, position4, function03, function04, j, interpolator2), C11827c.f38565a));
        C2668g.a(a, "Completable.fromObservable(observable)");
        return a;
    }

    /* renamed from: a */
    private final ValueAnimator m39902a(ValueAnimator valueAnimator, View view, Position position, Position position2, Function0<C15813i> function0, Function0<C15813i> function02) {
        position = m39901a(position, view);
        Function0<C15813i> function03 = function0;
        Function0<C15813i> function04 = function02;
        float f = position;
        float a = m39901a(position2, view);
        float height = ((float) view.getHeight()) / ((float) 2);
        View view2 = view;
        valueAnimator.addListener(new C9573d(function03, function04, f, a, height, view2));
        valueAnimator.addUpdateListener(new C9574e(function03, function04, f, a, height, view2));
        return valueAnimator;
    }

    /* renamed from: a */
    private final float m39901a(@NotNull Position position, View view) {
        switch (C9608i.f32104a[position.ordinal()]) {
            case 1:
                return null;
            case 2:
                return ((float) view.getWidth()) / ((float) 2);
            case 3:
                return (float) view.getWidth();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
