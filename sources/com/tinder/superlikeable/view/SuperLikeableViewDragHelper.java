package com.tinder.superlikeable.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.cardstack.p180a.p181a.C8360a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0019\b\u0001\u0018\u00002\u00020\u0001:\u0006&'()*+Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J.\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007J\u001e\u0010 \u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010%\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper;", "", "parentView", "Landroid/view/ViewGroup;", "onViewMovedListener", "Lkotlin/Function3;", "Landroid/view/View;", "", "", "Lcom/tinder/superlikeable/view/OnViewMovedListener;", "dragValueConverter", "Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$DragValueConverter;", "dragStateChangeCallback", "Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$DragStateChangeCallback;", "animatorHolder", "Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$ValueAnimatorHolder;", "swipeOutInterpolatorFactory", "Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$SwipeOutInterpolatorFactory;", "tempLocation", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function3;Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$DragValueConverter;Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$DragStateChangeCallback;Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$ValueAnimatorHolder;Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$SwipeOutInterpolatorFactory;[I)V", "getOnViewMovedListener", "()Lkotlin/jvm/functions/Function3;", "setOnViewMovedListener", "(Lkotlin/jvm/functions/Function3;)V", "notifyViewMoved", "view", "onViewDrag", "dx", "dy", "startX", "startY", "onViewFling", "velocityX", "velocityY", "onViewSelected", "onViewUnselected", "setDragStateChangeCallback", "BitwiseDragValueDamper", "DragStateChangeCallback", "DragValueConverter", "SimpleDragStateChangeCallback", "SwipeOutInterpolatorFactory", "ValueAnimatorHolder", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
@UiThread
public final class SuperLikeableViewDragHelper {
    /* renamed from: a */
    private final ViewGroup f47188a;
    @NotNull
    /* renamed from: b */
    private Function3<? super View, ? super Float, ? super Float, C15813i> f47189b;
    /* renamed from: c */
    private final DragValueConverter f47190c;
    /* renamed from: d */
    private DragStateChangeCallback f47191d;
    /* renamed from: e */
    private final C15164d f47192e;
    /* renamed from: f */
    private final C15163c f47193f;
    /* renamed from: g */
    private final int[] f47194g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$DragStateChangeCallback;", "", "onDragStateChange", "", "dragState", "", "Lcom/tinder/superlikeable/view/DragState;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public interface DragStateChangeCallback {
        void onDragStateChange(byte b);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$DragValueConverter;", "", "convertX", "", "dx", "convertY", "dy", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public interface DragValueConverter {
        float convertX(float f);

        float convertY(float f);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$SwipeOutInterpolatorFactory;", "", "()V", "create", "Lcom/tinder/cardstack/animation/interpolator/SwipeOutInterpolator;", "distanceToCover", "", "velocityPixels", "", "duration", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewDragHelper$c */
    public static final class C15163c {
        @NotNull
        /* renamed from: a */
        public final C8360a m57040a(int i, float f, long j) {
            return new C8360a((float) i, f, j);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\u0003J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$ValueAnimatorHolder;", "", "animator", "Landroid/animation/ValueAnimator;", "propertyForScale", "Landroid/animation/PropertyValuesHolder;", "propertyForTranslationX", "propertyForTranslationY", "(Landroid/animation/ValueAnimator;Landroid/animation/PropertyValuesHolder;Landroid/animation/PropertyValuesHolder;Landroid/animation/PropertyValuesHolder;)V", "resetAndGet", "resetAndGetPropertyForScale", "start", "", "end", "resetAndGetPropertyForTranslateX", "resetAndGetPropertyForTranslateY", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewDragHelper$d */
    public static final class C15164d {
        /* renamed from: a */
        private final ValueAnimator f47173a;
        /* renamed from: b */
        private final PropertyValuesHolder f47174b;
        /* renamed from: c */
        private final PropertyValuesHolder f47175c;
        /* renamed from: d */
        private final PropertyValuesHolder f47176d;

        public C15164d() {
            this(null, null, null, null, 15, null);
        }

        public C15164d(@NotNull ValueAnimator valueAnimator, @NotNull PropertyValuesHolder propertyValuesHolder, @NotNull PropertyValuesHolder propertyValuesHolder2, @NotNull PropertyValuesHolder propertyValuesHolder3) {
            C2668g.b(valueAnimator, "animator");
            C2668g.b(propertyValuesHolder, "propertyForScale");
            C2668g.b(propertyValuesHolder2, "propertyForTranslationX");
            C2668g.b(propertyValuesHolder3, "propertyForTranslationY");
            this.f47173a = valueAnimator;
            this.f47174b = propertyValuesHolder;
            this.f47175c = propertyValuesHolder2;
            this.f47176d = propertyValuesHolder3;
        }

        public /* synthetic */ C15164d(ValueAnimator valueAnimator, PropertyValuesHolder propertyValuesHolder, PropertyValuesHolder propertyValuesHolder2, PropertyValuesHolder propertyValuesHolder3, int i, C15823e c15823e) {
            if ((i & 1) != null) {
                valueAnimator = new ValueAnimator();
            }
            if ((i & 2) != null) {
                propertyValuesHolder = C15178e.m57068a("scale", 1.0f);
            }
            if ((i & 4) != null) {
                propertyValuesHolder2 = C15178e.m57068a("translate_x", 0.0f);
            }
            if ((i & 8) != 0) {
                propertyValuesHolder3 = C15178e.m57068a("translate_y", 0.0f);
            }
            this(valueAnimator, propertyValuesHolder, propertyValuesHolder2, propertyValuesHolder3);
        }

        @NotNull
        /* renamed from: a */
        public final ValueAnimator m57042a() {
            this.f47173a.cancel();
            this.f47173a.removeAllListeners();
            this.f47173a.removeAllUpdateListeners();
            this.f47173a.setStartDelay(0);
            this.f47173a.setDuration(300);
            this.f47173a.setInterpolator((TimeInterpolator) null);
            return this.f47173a;
        }

        @NotNull
        /* renamed from: a */
        public final PropertyValuesHolder m57041a(float f, float f2) {
            this.f47174b.setFloatValues(new float[]{f, f2});
            return this.f47174b;
        }

        @NotNull
        /* renamed from: b */
        public final PropertyValuesHolder m57043b(float f, float f2) {
            this.f47175c.setFloatValues(new float[]{f, f2});
            return this.f47175c;
        }

        @NotNull
        /* renamed from: c */
        public final PropertyValuesHolder m57044c(float f, float f2) {
            this.f47176d.setFloatValues(new float[]{f, f2});
            return this.f47176d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewDragHelper$e */
    static final class C15165e implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ SuperLikeableViewDragHelper f47177a;
        /* renamed from: b */
        final /* synthetic */ View f47178b;

        C15165e(SuperLikeableViewDragHelper superLikeableViewDragHelper, View view) {
            this.f47177a = superLikeableViewDragHelper;
            this.f47178b = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f47178b;
            valueAnimator = valueAnimator.getAnimatedValue("translate_y");
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            view.setTranslationY(((Float) valueAnimator).floatValue());
            this.f47177a.m57047c(this.f47178b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/superlikeable/view/SuperLikeableViewDragHelper$onViewFling$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper;Landroid/view/View;F)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewDragHelper$f */
    public static final class C15166f extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ SuperLikeableViewDragHelper f47179a;
        /* renamed from: b */
        final /* synthetic */ View f47180b;
        /* renamed from: c */
        final /* synthetic */ float f47181c;

        C15166f(SuperLikeableViewDragHelper superLikeableViewDragHelper, View view, float f) {
            this.f47179a = superLikeableViewDragHelper;
            this.f47180b = view;
            this.f47181c = f;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f47180b.setTranslationY(this.f47181c);
            this.f47180b.setVisibility(8);
            this.f47179a.m57047c(this.f47180b);
            this.f47179a.f47191d.onDragStateChange((byte) 5);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewDragHelper$g */
    static final class C15167g implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ View f47182a;

        C15167g(View view) {
            this.f47182a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            valueAnimator = valueAnimator.getAnimatedValue("scale");
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            valueAnimator = ((Float) valueAnimator).floatValue();
            this.f47182a.setScaleX(valueAnimator);
            this.f47182a.setScaleY(valueAnimator);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/superlikeable/view/SuperLikeableViewDragHelper$onViewSelected$2", "Landroid/animation/AnimatorListenerAdapter;", "(Landroid/view/View;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewDragHelper$h */
    public static final class C15168h extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ View f47183a;

        C15168h(View view) {
            this.f47183a = view;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f47183a.setScaleX(1.05f);
            this.f47183a.setScaleY(1.05f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewDragHelper$i */
    static final class C15169i implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ SuperLikeableViewDragHelper f47184a;
        /* renamed from: b */
        final /* synthetic */ View f47185b;

        C15169i(SuperLikeableViewDragHelper superLikeableViewDragHelper, View view) {
            this.f47184a = superLikeableViewDragHelper;
            this.f47185b = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue("scale");
            if (animatedValue == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            float floatValue = ((Float) animatedValue).floatValue();
            this.f47185b.setScaleX(floatValue);
            this.f47185b.setScaleY(floatValue);
            View view = this.f47185b;
            Object animatedValue2 = valueAnimator.getAnimatedValue("translate_x");
            if (animatedValue2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            view.setTranslationX(((Float) animatedValue2).floatValue());
            view = this.f47185b;
            valueAnimator = valueAnimator.getAnimatedValue("translate_y");
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            view.setTranslationY(((Float) valueAnimator).floatValue());
            this.f47184a.m57047c(this.f47185b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/superlikeable/view/SuperLikeableViewDragHelper$onViewUnselected$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper;Landroid/view/View;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewDragHelper$j */
    public static final class C15170j extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ SuperLikeableViewDragHelper f47186a;
        /* renamed from: b */
        final /* synthetic */ View f47187b;

        C15170j(SuperLikeableViewDragHelper superLikeableViewDragHelper, View view) {
            this.f47186a = superLikeableViewDragHelper;
            this.f47187b = view;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f47187b.setScaleX(1.0f);
            this.f47187b.setScaleY(1.0f);
            this.f47187b.setTranslationX(0.0f);
            this.f47187b.setTranslationY(0.0f);
            this.f47186a.m57047c(this.f47187b);
            this.f47186a.f47191d.onDragStateChange((byte) 0);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$BitwiseDragValueDamper;", "Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$DragValueConverter;", "()V", "convertX", "", "dx", "convertY", "dy", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewDragHelper$a */
    public static final class C16903a implements DragValueConverter {
        public float convertY(float f) {
            return f > ((float) 0) ? (float) ((((int) f) >> 4) << 1) : f;
        }

        public float convertX(float f) {
            return (float) (((((int) Math.abs(f)) >> 4) << 1) * (f >= ((float) 0) ? 1 : -1));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$SimpleDragStateChangeCallback;", "Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$DragStateChangeCallback;", "()V", "onDragStateChange", "", "dragState", "", "Lcom/tinder/superlikeable/view/DragState;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewDragHelper$b */
    private static final class C16904b implements DragStateChangeCallback {
        public void onDragStateChange(byte b) {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "invoke"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewDragHelper$1 */
    static final class C189511 extends Lambda implements Function3<View, Float, Float, C15813i> {
        /* renamed from: a */
        public static final C189511 f58625a = new C189511();

        C189511() {
            super(3);
        }

        /* renamed from: a */
        public final void m67458a(@NotNull View view, float f, float f2) {
            C2668g.b(view, "<anonymous parameter 0>");
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m67458a((View) obj, ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
            return C15813i.f49016a;
        }
    }

    public SuperLikeableViewDragHelper(@NotNull ViewGroup viewGroup, @NotNull Function3<? super View, ? super Float, ? super Float, C15813i> function3, @NotNull DragValueConverter dragValueConverter, @NotNull DragStateChangeCallback dragStateChangeCallback, @NotNull C15164d c15164d, @NotNull C15163c c15163c, @NotNull int[] iArr) {
        C2668g.b(viewGroup, "parentView");
        C2668g.b(function3, "onViewMovedListener");
        C2668g.b(dragValueConverter, "dragValueConverter");
        C2668g.b(dragStateChangeCallback, "dragStateChangeCallback");
        C2668g.b(c15164d, "animatorHolder");
        C2668g.b(c15163c, "swipeOutInterpolatorFactory");
        C2668g.b(iArr, "tempLocation");
        this.f47188a = viewGroup;
        this.f47189b = function3;
        this.f47190c = dragValueConverter;
        this.f47191d = dragStateChangeCallback;
        this.f47192e = c15164d;
        this.f47193f = c15163c;
        this.f47194g = iArr;
    }

    public /* synthetic */ SuperLikeableViewDragHelper(ViewGroup viewGroup, Function3 function3, DragValueConverter dragValueConverter, DragStateChangeCallback dragStateChangeCallback, C15164d c15164d, C15163c c15163c, int[] iArr, int i, C15823e c15823e) {
        this(viewGroup, (i & 2) != 0 ? C189511.f58625a : function3, (i & 4) != 0 ? new C16903a() : dragValueConverter, (i & 8) != 0 ? new C16904b() : dragStateChangeCallback, (i & 16) != 0 ? new C15164d(null, null, null, null, 15, null) : c15164d, (i & 32) != 0 ? new C15163c() : c15163c, (i & 64) != 0 ? new int[2] : iArr);
    }

    /* renamed from: a */
    public final void m57052a(@NotNull Function3<? super View, ? super Float, ? super Float, C15813i> function3) {
        C2668g.b(function3, "<set-?>");
        this.f47189b = function3;
    }

    /* renamed from: a */
    public final void m57051a(@NotNull DragStateChangeCallback dragStateChangeCallback) {
        C2668g.b(dragStateChangeCallback, "dragStateChangeCallback");
        this.f47191d = dragStateChangeCallback;
    }

    /* renamed from: a */
    public final void m57048a(@NotNull View view) {
        C2668g.b(view, "view");
        this.f47191d.onDragStateChange((byte) 1);
        ValueAnimator a = this.f47192e.m57042a();
        a.setValues(new PropertyValuesHolder[]{this.f47192e.m57041a(1.0f, 1.05f)});
        a.setDuration(50);
        a.addUpdateListener(new C15167g(view));
        a.addListener(new C15168h(view));
        a.start();
    }

    /* renamed from: b */
    public final void m57053b(@NotNull View view) {
        C2668g.b(view, "view");
        this.f47191d.onDragStateChange((byte) 2);
        ValueAnimator a = this.f47192e.m57042a();
        PropertyValuesHolder a2 = this.f47192e.m57041a(view.getScaleX(), 1.0f);
        PropertyValuesHolder b = this.f47192e.m57043b(view.getTranslationX(), 0.0f);
        PropertyValuesHolder c = this.f47192e.m57044c(view.getTranslationY(), 0.0f);
        a.setValues(new PropertyValuesHolder[]{a2, b, c});
        a.setDuration(120);
        a.addUpdateListener(new C15169i(this, view));
        a.addListener(new C15170j(this, view));
        a.start();
    }

    /* renamed from: a */
    public final void m57050a(@NotNull View view, float f, float f2, float f3, float f4) {
        C2668g.b(view, "view");
        this.f47191d.onDragStateChange(4.2E-45f);
        view.setTranslationX(this.f47190c.convertX(f));
        view.setTranslationY(this.f47190c.convertY(f2));
        m57047c(view);
    }

    /* renamed from: a */
    public final void m57049a(@NotNull View view, float f, float f2) {
        C2668g.b(view, "view");
        this.f47191d.onDragStateChange((byte) 4);
        f = Math.abs(f2) / ((float) 1.401E-42f);
        view.getLocationOnScreen(this.f47194g);
        f2 = this.f47194g[1] + view.getHeight();
        float translationY = view.getTranslationY() - ((float) f2);
        ValueAnimator a = this.f47192e.m57042a();
        a.setValues(new PropertyValuesHolder[]{this.f47192e.m57044c(view.getTranslationY(), translationY)});
        a.setInterpolator(this.f47193f.m57040a(f2, f, 300));
        a.setDuration(300);
        a.addUpdateListener((AnimatorUpdateListener) new C15165e(this, view));
        a.addListener((AnimatorListener) new C15166f(this, view, translationY));
        a.start();
    }

    /* renamed from: c */
    private final void m57047c(View view) {
        this.f47189b.invoke(view, Float.valueOf(view.getTranslationX()), Float.valueOf(view.getTranslationY()));
    }
}
