package com.tinder.recsgrid;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.tinder.base.view.TouchBlockingFrameLayout;
import com.tinder.base.view.p176a.C8318a;
import com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout;
import com.tinder.utils.an;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J \u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0011\u001a\u00020\u0012J.\u0010\u0019\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u001a\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u0010H\u0002J\u0012\u0010\u001b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/recsgrid/GridCollectionTutorialRunner;", "", "()V", "animatorFactory", "Lcom/tinder/recsgrid/GridCollectionTutorialRunner$AnimatorFactory;", "animatorSet", "Landroid/animation/AnimatorSet;", "started", "", "cancel", "", "findVisibleChildViews", "Lio/reactivex/Single;", "", "Landroid/view/View;", "cardGridLayout", "Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;", "firstCard", "", "resetViews", "views", "start", "cardCollectionLayout", "touchBlockingFrameLayout", "Lcom/tinder/base/view/TouchBlockingFrameLayout;", "startAnimation", "fadeAlpha", "reverseAlpha", "AnimatorFactory", "recs-grid_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsgrid.a */
public final class C14780a {
    /* renamed from: a */
    private final C14777a f46350a = new C14777a();
    /* renamed from: b */
    private boolean f46351b;
    /* renamed from: c */
    private AnimatorSet f46352c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lcom/tinder/recsgrid/GridCollectionTutorialRunner$AnimatorFactory;", "", "()V", "createAlpha", "Landroid/animation/ValueAnimator;", "createRecover", "fromX", "", "toX", "createReverseAlpha", "createSwipeLeft", "createSwipeRight", "recs-grid_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsgrid.a$a */
    private static final class C14777a {
        @NotNull
        /* renamed from: a */
        public final ValueAnimator m56036a(float f, float f2) {
            f = ValueAnimator.ofFloat(new float[]{f, f2});
            f.setDuration(200);
            f.setStartDelay(300);
            f.setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
            C2668g.a(f, "ValueAnimator.ofFloat(fr…erpolator()\n            }");
            return f;
        }

        @NotNull
        /* renamed from: b */
        public final ValueAnimator m56038b(float f, float f2) {
            f = ValueAnimator.ofFloat(new float[]{f, f2});
            f.setDuration(200);
            f.setStartDelay(1000);
            f.setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
            C2668g.a(f, "ValueAnimator.ofFloat(fr…erpolator()\n            }");
            return f;
        }

        @NotNull
        /* renamed from: c */
        public final ValueAnimator m56039c(float f, float f2) {
            f = ValueAnimator.ofFloat(new float[]{f, f2});
            f.setDuration(200);
            f.setStartDelay(1000);
            f.setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
            C2668g.a(f, "ValueAnimator.ofFloat(fr…erpolator()\n            }");
            return f;
        }

        @NotNull
        /* renamed from: a */
        public final ValueAnimator m56035a() {
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.3f}).setDuration(200);
            C2668g.a(duration, "ValueAnimator.ofFloat(AL…HA_ANIMATION_DURATION_MS)");
            return duration;
        }

        @NotNull
        /* renamed from: b */
        public final ValueAnimator m56037b() {
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.3f, 1.0f}).setDuration(200);
            C2668g.a(duration, "ValueAnimator.ofFloat(AL…HA_ANIMATION_DURATION_MS)");
            return duration;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsgrid.a$b */
    static final class C14778b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ List f46346a;
        /* renamed from: b */
        final /* synthetic */ ValueAnimator f46347b;

        C14778b(List list, ValueAnimator valueAnimator) {
            this.f46346a = list;
            this.f46347b = valueAnimator;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            valueAnimator = this.f46347b.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            valueAnimator = ((Float) valueAnimator).floatValue();
            for (View alpha : this.f46346a) {
                alpha.setAlpha(valueAnimator);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsgrid.a$e */
    static final class C14779e implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ List f46348a;
        /* renamed from: b */
        final /* synthetic */ ValueAnimator f46349b;

        C14779e(List list, ValueAnimator valueAnimator) {
            this.f46348a = list;
            this.f46349b = valueAnimator;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            valueAnimator = this.f46349b.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            valueAnimator = ((Float) valueAnimator).floatValue();
            for (View alpha : this.f46348a) {
                alpha.setAlpha(valueAnimator);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "it", "", "apply", "(Ljava/lang/Long;)Ljava/util/List;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsgrid.a$c */
    static final class C16479c<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C14780a f51142a;
        /* renamed from: b */
        final /* synthetic */ BaseCardCollectionLayout f51143b;

        C16479c(C14780a c14780a, BaseCardCollectionLayout baseCardCollectionLayout) {
            this.f51142a = c14780a;
            this.f51143b = baseCardCollectionLayout;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m61913a((Long) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<View> m61913a(@NotNull Long l) {
            C2668g.b(l, "it");
            return this.f51142a.m56041a(this.f51143b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Landroid/view/View;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsgrid.a$d */
    static final class C16480d<T> implements Predicate<List<? extends View>> {
        /* renamed from: a */
        final /* synthetic */ int f51144a;

        C16480d(int i) {
            this.f51144a = i;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m61914a((List) obj);
        }

        /* renamed from: a */
        public final boolean m61914a(@NotNull List<? extends View> list) {
            C2668g.b(list, "it");
            return list.size() > this.f51144a ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/recsgrid/GridCollectionTutorialRunner$reverseAlpha$2", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lcom/tinder/recsgrid/GridCollectionTutorialRunner;Ljava/util/List;)V", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "recs-grid_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsgrid.a$f */
    public static final class C16481f extends an {
        /* renamed from: a */
        final /* synthetic */ C14780a f51145a;
        /* renamed from: b */
        final /* synthetic */ List f51146b;

        C16481f(C14780a c14780a, List<? extends View> list) {
            this.f51145a = c14780a;
            this.f51146b = list;
        }

        public void onAnimationCancel(@Nullable Animator animator) {
            this.f51145a.m56052c(this.f51146b);
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f51145a.m56052c(this.f51146b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "views", "", "Landroid/view/View;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsgrid.a$g */
    static final class C16482g<T> implements Consumer<List<? extends View>> {
        /* renamed from: a */
        final /* synthetic */ C14780a f51147a;
        /* renamed from: b */
        final /* synthetic */ BaseCardCollectionLayout f51148b;
        /* renamed from: c */
        final /* synthetic */ TouchBlockingFrameLayout f51149c;
        /* renamed from: d */
        final /* synthetic */ int f51150d;

        C16482g(C14780a c14780a, BaseCardCollectionLayout baseCardCollectionLayout, TouchBlockingFrameLayout touchBlockingFrameLayout, int i) {
            this.f51147a = c14780a;
            this.f51148b = baseCardCollectionLayout;
            this.f51149c = touchBlockingFrameLayout;
            this.f51150d = i;
        }

        public /* synthetic */ void accept(Object obj) {
            m61915a((List) obj);
        }

        /* renamed from: a */
        public final void m61915a(List<? extends View> list) {
            C14780a c14780a = this.f51147a;
            C2668g.a(list, "views");
            c14780a.m56048a(list, this.f51148b, this.f51149c, this.f51150d);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/recsgrid/GridCollectionTutorialRunner$startAnimation$1", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lcom/tinder/recsgrid/GridCollectionTutorialRunner;FFLcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;Ljava/util/List;)V", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "recs-grid_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsgrid.a$h */
    public static final class C16483h extends an {
        /* renamed from: a */
        final /* synthetic */ C14780a f51151a;
        /* renamed from: b */
        final /* synthetic */ float f51152b;
        /* renamed from: c */
        final /* synthetic */ float f51153c;
        /* renamed from: d */
        final /* synthetic */ BaseCardCollectionLayout f51154d;
        /* renamed from: e */
        final /* synthetic */ List f51155e;

        C16483h(C14780a c14780a, float f, float f2, BaseCardCollectionLayout baseCardCollectionLayout, List list) {
            this.f51151a = c14780a;
            this.f51152b = f;
            this.f51153c = f2;
            this.f51154d = baseCardCollectionLayout;
            this.f51155e = list;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            this.f51154d.dispatchTouchEvent(C8318a.f29598a.b(this.f51152b, this.f51153c));
            this.f51151a.m56047a(this.f51155e);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"com/tinder/recsgrid/GridCollectionTutorialRunner$startAnimation$2", "Lcom/tinder/utils/SimpleAnimatorListener;", "(FFLcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;)V", "end", "", "onAnimationCancel", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "recs-grid_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsgrid.a$i */
    public static final class C16484i extends an {
        /* renamed from: a */
        final /* synthetic */ float f51156a;
        /* renamed from: b */
        final /* synthetic */ float f51157b;
        /* renamed from: c */
        final /* synthetic */ BaseCardCollectionLayout f51158c;

        C16484i(float f, float f2, BaseCardCollectionLayout baseCardCollectionLayout) {
            this.f51156a = f;
            this.f51157b = f2;
            this.f51158c = baseCardCollectionLayout;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            m61916a();
        }

        public void onAnimationCancel(@Nullable Animator animator) {
            m61916a();
        }

        /* renamed from: a */
        private final void m61916a() {
            this.f51158c.dispatchTouchEvent(C8318a.f29598a.c(this.f51156a, this.f51157b));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"com/tinder/recsgrid/GridCollectionTutorialRunner$startAnimation$3", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lcom/tinder/recsgrid/GridCollectionTutorialRunner;Lcom/tinder/base/view/TouchBlockingFrameLayout;Ljava/util/List;)V", "end", "", "onAnimationCancel", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "recs-grid_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsgrid.a$j */
    public static final class C16485j extends an {
        /* renamed from: a */
        final /* synthetic */ C14780a f51159a;
        /* renamed from: b */
        final /* synthetic */ TouchBlockingFrameLayout f51160b;
        /* renamed from: c */
        final /* synthetic */ List f51161c;

        C16485j(C14780a c14780a, TouchBlockingFrameLayout touchBlockingFrameLayout, List list) {
            this.f51159a = c14780a;
            this.f51160b = touchBlockingFrameLayout;
            this.f51161c = list;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            m61917a();
        }

        public void onAnimationCancel(@Nullable Animator animator) {
            m61917a();
        }

        /* renamed from: a */
        private final void m61917a() {
            this.f51160b.stopBlocking();
            this.f51159a.f46351b = false;
            this.f51159a.m56050b(this.f51161c);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m56043a(C14780a c14780a, BaseCardCollectionLayout baseCardCollectionLayout, TouchBlockingFrameLayout touchBlockingFrameLayout, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        c14780a.m56054a(baseCardCollectionLayout, touchBlockingFrameLayout, i);
    }

    /* renamed from: a */
    public final void m56054a(@NotNull BaseCardCollectionLayout baseCardCollectionLayout, @NotNull TouchBlockingFrameLayout touchBlockingFrameLayout, int i) {
        C2668g.b(baseCardCollectionLayout, "cardCollectionLayout");
        C2668g.b(touchBlockingFrameLayout, "touchBlockingFrameLayout");
        if (!this.f46351b) {
            this.f46351b = true;
            C3960g a = m56040a(baseCardCollectionLayout, i);
            Consumer c16482g = new C16482g(this, baseCardCollectionLayout, touchBlockingFrameLayout, i);
            baseCardCollectionLayout = (Function1) GridCollectionTutorialRunner$start$2.f59391a;
            if (baseCardCollectionLayout != null) {
                baseCardCollectionLayout = new C16486c(baseCardCollectionLayout);
            }
            a.a(c16482g, (Consumer) baseCardCollectionLayout);
        }
    }

    /* renamed from: a */
    public final void m56053a() {
        if (this.f46351b) {
            AnimatorSet animatorSet = this.f46352c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
    }

    /* renamed from: a */
    private final void m56048a(List<? extends View> list, BaseCardCollectionLayout baseCardCollectionLayout, TouchBlockingFrameLayout touchBlockingFrameLayout, int i) {
        C14780a c14780a = this;
        List<? extends View> list2 = list;
        BaseCardCollectionLayout baseCardCollectionLayout2 = baseCardCollectionLayout;
        int i2 = i;
        if (list.size() > i2) {
            touchBlockingFrameLayout.startBlocking();
            View view = (View) list2.get(i2);
            Collection arrayList = new ArrayList();
            for (Object next : list2) {
                if ((C2668g.a((View) next, view) ^ 1) != 0) {
                    arrayList.add(next);
                }
            }
            List list3 = (List) arrayList;
            float x = view.getX() + (((float) view.getWidth()) / 2.0f);
            float y = view.getY() + (((float) view.getHeight()) / 2.0f);
            float x2 = view.getX() + ((float) view.getWidth());
            ValueAnimator a = c14780a.f46350a.m56036a(x, x2);
            float f = (float) null;
            ValueAnimator b = c14780a.f46350a.m56038b(x2, f);
            ValueAnimator c = c14780a.f46350a.m56039c(f, x);
            Function1 gridCollectionTutorialRunner$startAnimation$updateListener$1 = new GridCollectionTutorialRunner$startAnimation$updateListener$1(y, baseCardCollectionLayout2);
            a.addUpdateListener(new C14781b(gridCollectionTutorialRunner$startAnimation$updateListener$1));
            b.addUpdateListener(new C14781b(gridCollectionTutorialRunner$startAnimation$updateListener$1));
            c.addUpdateListener(new C14781b(gridCollectionTutorialRunner$startAnimation$updateListener$1));
            a.addListener(new C16483h(c14780a, x, y, baseCardCollectionLayout2, list3));
            c.addListener(new C16484i(x, y, baseCardCollectionLayout2));
            c14780a.f46352c = new AnimatorSet();
            AnimatorSet animatorSet = c14780a.f46352c;
            if (animatorSet != null) {
                animatorSet.playSequentially(new Animator[]{a, b, c});
            }
            animatorSet = c14780a.f46352c;
            if (animatorSet != null) {
                animatorSet.addListener(new C16485j(c14780a, touchBlockingFrameLayout, list3));
            }
            animatorSet = c14780a.f46352c;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }

    /* renamed from: a */
    private final C3960g<List<View>> m56040a(BaseCardCollectionLayout baseCardCollectionLayout, int i) {
        baseCardCollectionLayout = C3959e.interval(100, TimeUnit.MILLISECONDS, C15674a.m58830a()).map(new C16479c(this, baseCardCollectionLayout)).filter(new C16480d(i)).firstElement().e();
        C2668g.a(baseCardCollectionLayout, "Observable.interval(\n   …              .toSingle()");
        return baseCardCollectionLayout;
    }

    /* renamed from: a */
    private final void m56047a(@NotNull List<? extends View> list) {
        ValueAnimator a = this.f46350a.m56035a();
        a.addUpdateListener(new C14778b(list, a));
        a.start();
    }

    /* renamed from: b */
    private final void m56050b(@NotNull List<? extends View> list) {
        ValueAnimator b = this.f46350a.m56037b();
        b.addUpdateListener(new C14779e(list, b));
        b.addListener(new C16481f(this, list));
        b.start();
    }

    /* renamed from: c */
    private final void m56052c(List<? extends View> list) {
        for (View alpha : list) {
            alpha.setAlpha(1.0f);
        }
    }

    /* renamed from: a */
    private final List<View> m56041a(@NotNull BaseCardCollectionLayout baseCardCollectionLayout) {
        LayoutManager layoutManager = baseCardCollectionLayout.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            layoutManager = null;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (gridLayoutManager == null) {
            return C17554o.m64195a();
        }
        Iterable c18461c = new C18461c(gridLayoutManager.findFirstVisibleItemPosition(), gridLayoutManager.findLastVisibleItemPosition());
        Collection arrayList = new ArrayList();
        Iterator it = c18461c.iterator();
        while (it.hasNext()) {
            View findViewByPosition = baseCardCollectionLayout.getLayoutManager().findViewByPosition(((ab) it).mo13805b());
            if (findViewByPosition != null) {
                arrayList.add(findViewByPosition);
            }
        }
        return (List) arrayList;
    }
}
