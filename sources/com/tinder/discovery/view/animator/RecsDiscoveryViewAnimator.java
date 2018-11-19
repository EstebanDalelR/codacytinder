package com.tinder.discovery.view.animator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.tinder.base.p170a.p171a.C8299a;
import com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher.C8908a;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0016J$\u0010\u0015\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/tinder/discovery/view/animator/RecsDiscoveryViewAnimator;", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$ChildViewAnimator;", "animationDuration", "", "startDelay", "(JJ)V", "animatorProvider", "Lcom/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$ValueAnimatorProvider;", "animatorSet", "Landroid/animation/AnimatorSet;", "cardStackEntranceAnimator", "Landroid/animation/ValueAnimator;", "cardStack", "Landroid/view/View;", "endAnimation", "", "startAppearingAnimation", "adapterPosition", "", "view", "startDisappearingAnimation", "prepareForEntranceAnimation", "interpolator", "Landroid/animation/TimeInterpolator;", "setScale", "scale", "", "AnimatableRecsDiscoveryView", "AnimatableViews", "ValueAnimatorProvider", "discovery_release"}, k = 1, mv = {1, 1, 10})
public final class RecsDiscoveryViewAnimator extends C8908a {
    /* renamed from: a */
    private final C8900b f36059a = new C8900b();
    /* renamed from: b */
    private AnimatorSet f36060b;
    /* renamed from: c */
    private final long f36061c;
    /* renamed from: d */
    private final long f36062d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$AnimatableViews;", "", "cardStack", "Landroid/view/View;", "gamepadButtons", "", "(Landroid/view/View;Ljava/util/List;)V", "getCardStack", "()Landroid/view/View;", "getGamepadButtons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator$a */
    public static final class C8899a {
        @NotNull
        /* renamed from: a */
        private final View f31145a;
        @NotNull
        /* renamed from: b */
        private final List<View> f31146b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8899a) {
                    C8899a c8899a = (C8899a) obj;
                    if (C2668g.a(this.f31145a, c8899a.f31145a) && C2668g.a(this.f31146b, c8899a.f31146b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            View view = this.f31145a;
            int i = 0;
            int hashCode = (view != null ? view.hashCode() : 0) * 31;
            List list = this.f31146b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AnimatableViews(cardStack=");
            stringBuilder.append(this.f31145a);
            stringBuilder.append(", gamepadButtons=");
            stringBuilder.append(this.f31146b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8899a(@NotNull View view, @NotNull List<? extends View> list) {
            C2668g.b(view, "cardStack");
            C2668g.b(list, "gamepadButtons");
            this.f31145a = view;
            this.f31146b = list;
        }

        @NotNull
        /* renamed from: a */
        public final View m37697a() {
            return this.f31145a;
        }

        @NotNull
        /* renamed from: b */
        public final List<View> m37698b() {
            return this.f31146b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$ValueAnimatorProvider;", "", "()V", "recyclableAnimators", "Ljava/util/Stack;", "Landroid/animation/ValueAnimator;", "getValueAnimator", "recycle", "", "animator", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator$b */
    private static final class C8900b {
        /* renamed from: a */
        private final Stack<ValueAnimator> f31147a = new Stack();

        @NotNull
        /* renamed from: a */
        public final ValueAnimator m37699a() {
            if (this.f31147a.isEmpty()) {
                return new ValueAnimator();
            }
            Object pop = this.f31147a.pop();
            C2668g.a(pop, "recyclableAnimators.pop()");
            return (ValueAnimator) pop;
        }

        /* renamed from: a */
        public final void m37700a(@NotNull ValueAnimator valueAnimator) {
            C2668g.b(valueAnimator, "animator");
            C8299a.m35391a(valueAnimator);
            this.f31147a.push(valueAnimator);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$cardStackEntranceAnimator$1$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$cardStackEntranceAnimator$1;Landroid/animation/ValueAnimator;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator$c */
    public static final class C8901c extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ ValueAnimator f31148a;
        /* renamed from: b */
        final /* synthetic */ RecsDiscoveryViewAnimator f31149b;
        /* renamed from: c */
        final /* synthetic */ View f31150c;

        C8901c(ValueAnimator valueAnimator, RecsDiscoveryViewAnimator recsDiscoveryViewAnimator, View view) {
            this.f31148a = valueAnimator;
            this.f31149b = recsDiscoveryViewAnimator;
            this.f31150c = view;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            this.f31150c.setVisibility(0);
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f31148a.removeListener(this);
            this.f31149b.f36059a.m37700a(this.f31148a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator$d */
    static final class C8902d implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ RecsDiscoveryViewAnimator f31151a;
        /* renamed from: b */
        final /* synthetic */ View f31152b;

        C8902d(RecsDiscoveryViewAnimator recsDiscoveryViewAnimator, View view) {
            this.f31151a = recsDiscoveryViewAnimator;
            this.f31152b = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            float floatValue = ((Float) animatedValue).floatValue();
            valueAnimator = Math.min(Math.max(0.8f, valueAnimator.getAnimatedFraction()), 1.0f);
            this.f31151a.m43911a(this.f31152b, floatValue);
            this.f31152b.setAlpha(valueAnimator);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$prepareForEntranceAnimation$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/discovery/view/animator/RecsDiscoveryViewAnimator;Landroid/animation/ValueAnimator;Landroid/view/View;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator$e */
    public static final class C8903e extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ RecsDiscoveryViewAnimator f31153a;
        /* renamed from: b */
        final /* synthetic */ ValueAnimator f31154b;
        /* renamed from: c */
        final /* synthetic */ View f31155c;

        C8903e(RecsDiscoveryViewAnimator recsDiscoveryViewAnimator, ValueAnimator valueAnimator, View view) {
            this.f31153a = recsDiscoveryViewAnimator;
            this.f31154b = valueAnimator;
            this.f31155c = view;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f31154b.removeListener(this);
            this.f31155c.setAlpha(1.0f);
            this.f31153a.m43911a(this.f31155c, 1.0f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\t"}, d2 = {"com/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$startAppearingAnimation$1$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$startAppearingAnimation$1$1$1;Landroid/animation/ValueAnimator;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "discovery_release", "com/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$$special$$inlined$let$lambda$1", "com/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$$special$$inlined$forEachIndexed$lambda$1"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator$f */
    public static final class C8904f extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ ValueAnimator f31156a;
        /* renamed from: b */
        final /* synthetic */ int f31157b;
        /* renamed from: c */
        final /* synthetic */ View f31158c;
        /* renamed from: d */
        final /* synthetic */ Builder f31159d;
        /* renamed from: e */
        final /* synthetic */ RecsDiscoveryViewAnimator f31160e;
        /* renamed from: f */
        final /* synthetic */ ValueAnimator f31161f;
        /* renamed from: g */
        final /* synthetic */ List f31162g;
        /* renamed from: h */
        final /* synthetic */ long f31163h;
        /* renamed from: i */
        final /* synthetic */ View f31164i;

        C8904f(ValueAnimator valueAnimator, int i, View view, Builder builder, RecsDiscoveryViewAnimator recsDiscoveryViewAnimator, ValueAnimator valueAnimator2, List list, long j, View view2) {
            this.f31156a = valueAnimator;
            this.f31157b = i;
            this.f31158c = view;
            this.f31159d = builder;
            this.f31160e = recsDiscoveryViewAnimator;
            this.f31161f = valueAnimator2;
            this.f31162g = list;
            this.f31163h = j;
            this.f31164i = view2;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f31156a.removeListener(this);
            this.f31160e.f36059a.m37700a(this.f31156a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$startAppearingAnimation$1$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$startAppearingAnimation$1;Landroid/animation/AnimatorSet;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator$g */
    public static final class C8905g extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ AnimatorSet f31165a;
        /* renamed from: b */
        final /* synthetic */ RecsDiscoveryViewAnimator f31166b;
        /* renamed from: c */
        final /* synthetic */ ValueAnimator f31167c;
        /* renamed from: d */
        final /* synthetic */ List f31168d;
        /* renamed from: e */
        final /* synthetic */ long f31169e;
        /* renamed from: f */
        final /* synthetic */ View f31170f;

        C8905g(AnimatorSet animatorSet, RecsDiscoveryViewAnimator recsDiscoveryViewAnimator, ValueAnimator valueAnimator, List list, long j, View view) {
            this.f31165a = animatorSet;
            this.f31166b = recsDiscoveryViewAnimator;
            this.f31167c = valueAnimator;
            this.f31168d = list;
            this.f31169e = j;
            this.f31170f = view;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f31165a.removeListener(this);
            this.f31166b.m37712b(this.f31170f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$startDisappearingAnimation$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator$h */
    static final class C8906h implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ RecsDiscoveryViewAnimator f31171a;
        /* renamed from: b */
        final /* synthetic */ View f31172b;
        /* renamed from: c */
        final /* synthetic */ List f31173c;
        /* renamed from: d */
        final /* synthetic */ ValueAnimator f31174d;
        /* renamed from: e */
        final /* synthetic */ View f31175e;

        C8906h(RecsDiscoveryViewAnimator recsDiscoveryViewAnimator, View view, List list, ValueAnimator valueAnimator, View view2) {
            this.f31171a = recsDiscoveryViewAnimator;
            this.f31172b = view;
            this.f31173c = list;
            this.f31174d = valueAnimator;
            this.f31175e = view2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            float floatValue = ((Float) animatedValue).floatValue();
            valueAnimator = Math.max(Math.min(((float) 1) - valueAnimator.getAnimatedFraction(), 1.0f), 0.8f);
            this.f31171a.m43911a(this.f31172b, floatValue);
            this.f31172b.setAlpha(valueAnimator);
            for (View view : this.f31173c) {
                this.f31171a.m43911a(view, floatValue);
                view.setAlpha(valueAnimator);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$startDisappearingAnimation$1$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/discovery/view/animator/RecsDiscoveryViewAnimator$startDisappearingAnimation$1;Landroid/animation/ValueAnimator;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator$i */
    public static final class C8907i extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ ValueAnimator f31176a;
        /* renamed from: b */
        final /* synthetic */ RecsDiscoveryViewAnimator f31177b;
        /* renamed from: c */
        final /* synthetic */ View f31178c;
        /* renamed from: d */
        final /* synthetic */ List f31179d;
        /* renamed from: e */
        final /* synthetic */ ValueAnimator f31180e;
        /* renamed from: f */
        final /* synthetic */ View f31181f;

        C8907i(ValueAnimator valueAnimator, RecsDiscoveryViewAnimator recsDiscoveryViewAnimator, View view, List list, ValueAnimator valueAnimator2, View view2) {
            this.f31176a = valueAnimator;
            this.f31177b = recsDiscoveryViewAnimator;
            this.f31178c = view;
            this.f31179d = list;
            this.f31180e = valueAnimator2;
            this.f31181f = view2;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f31176a.removeListener(this);
            this.f31178c.setAlpha(1.0f);
            for (View view : (Iterable) this.f31179d) {
                view.setAlpha(0.8f);
                this.f31177b.m43911a(view, 0.9f);
            }
            this.f31177b.f36059a.m37700a(this.f31180e);
            this.f31177b.m37712b(this.f31181f);
        }
    }

    public RecsDiscoveryViewAnimator(long j, long j2) {
        this.f36061c = j;
        this.f36062d = j2;
    }

    /* renamed from: a */
    public void mo10009a(int i, @NotNull View view) {
        RecsDiscoveryViewAnimator recsDiscoveryViewAnimator = this;
        View view2 = view;
        C2668g.b(view2, "view");
        if (view2 instanceof RecsDiscoveryViewAnimator$AnimatableRecsDiscoveryView) {
            List list;
            long j;
            AnimatorSet animatorSet;
            C8899a animatableViews = ((RecsDiscoveryViewAnimator$AnimatableRecsDiscoveryView) view2).getAnimatableViews();
            View a = animatableViews.m37697a();
            List b = animatableViews.m37698b();
            m37709a(view2);
            a.setVisibility(8);
            ValueAnimator c = m43913c(a);
            long size = recsDiscoveryViewAnimator.f36061c / ((long) b.size());
            mo10008a();
            AnimatorSet animatorSet2 = new AnimatorSet();
            recsDiscoveryViewAnimator.f36060b = animatorSet2;
            Builder play = animatorSet2.play(c);
            Iterator it = b.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                View view3 = (View) it.next();
                ValueAnimator a2 = recsDiscoveryViewAnimator.f36059a.m37699a();
                ValueAnimator valueAnimator = a2;
                m43910a(a2, view3, size * ((long) i2), new OvershootInterpolator());
                ValueAnimator valueAnimator2 = valueAnimator;
                List list2 = b;
                Iterator it2 = it;
                list = b;
                Builder builder = play;
                long j2 = size;
                j = size;
                animatorSet = animatorSet2;
                valueAnimator2.addListener(new C8904f(valueAnimator2, i2, view3, play, recsDiscoveryViewAnimator, c, list2, j2, view2));
                builder.with(valueAnimator2);
                play = builder;
                animatorSet2 = animatorSet;
                i2 = i3;
                b = list;
                it = it2;
                size = j;
            }
            list = b;
            j = size;
            animatorSet = animatorSet2;
            animatorSet.setStartDelay(recsDiscoveryViewAnimator.f36062d);
            animatorSet.addListener(new C8905g(animatorSet, recsDiscoveryViewAnimator, c, list, j, view2));
            animatorSet.start();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: b */
    public void mo10010b(int i, @NotNull View view) {
        C2668g.b(view, "view");
        if ((view instanceof RecsDiscoveryViewAnimator$AnimatableRecsDiscoveryView) == 0) {
            throw ((Throwable) new IllegalArgumentException("Failed requirement.".toString()));
        }
        i = ((RecsDiscoveryViewAnimator$AnimatableRecsDiscoveryView) view).getAnimatableViews();
        View a = i.m37697a();
        i = i.m37698b();
        m37709a(view);
        ValueAnimator a2 = this.f36059a.m37699a();
        C8299a.m35391a(a2);
        a2.setDuration(this.f36061c);
        a2.setFloatValues(new float[]{1.0f, 0.9f});
        a2.addUpdateListener(new C8906h(this, a, i, a2, view));
        a2.addListener(new C8907i(a2, this, a, i, a2, view));
        mo10008a();
        i = new AnimatorSet();
        this.f36060b = i;
        i.play(a2);
        i.start();
    }

    /* renamed from: a */
    public void mo10008a() {
        AnimatorSet animatorSet = this.f36060b;
        if (animatorSet != null) {
            animatorSet.end();
            animatorSet.removeAllListeners();
            this.f36060b = (AnimatorSet) null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final void m43910a(@org.jetbrains.annotations.NotNull android.animation.ValueAnimator r3, android.view.View r4, long r5, android.animation.TimeInterpolator r7) {
        /*
        r2 = this;
        com.tinder.base.p170a.p171a.C8299a.m35391a(r3);
        r0 = r2.f36061c;
        r3.setDuration(r0);
        r3.setStartDelay(r5);
        r5 = 1061158912; // 0x3f400000 float:0.75 double:5.24282163E-315;
        r4.setScaleX(r5);
        r4.setScaleY(r5);
        r5 = 2;
        r5 = new float[r5];
        r5 = {1061158912, 1065353216};
        r3.setFloatValues(r5);
        r5 = new com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator$d;
        r5.<init>(r2, r4);
        r5 = (android.animation.ValueAnimator.AnimatorUpdateListener) r5;
        r3.addUpdateListener(r5);
        r5 = new com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator$e;
        r5.<init>(r2, r3, r4);
        r5 = (android.animation.Animator.AnimatorListener) r5;
        r3.addListener(r5);
        r3.setInterpolator(r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.discovery.view.animator.RecsDiscoveryViewAnimator.a(android.animation.ValueAnimator, android.view.View, long, android.animation.TimeInterpolator):void");
    }

    /* renamed from: c */
    private final ValueAnimator m43913c(View view) {
        ValueAnimator a = this.f36059a.m37699a();
        m43910a(a, view, 0, new OvershootInterpolator(1.0f));
        a.addListener(new C8901c(a, this, view));
        return a;
    }

    /* renamed from: a */
    private final void m43911a(@NotNull View view, float f) {
        view.setScaleX(f);
        view.setScaleY(f);
    }
}
