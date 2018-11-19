package com.tinder.discovery.view.animator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tinder.base.p170a.p171a.C8299a;
import com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher.C8908a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/discovery/view/animator/PlacesDiscoveryViewAnimator;", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$ChildViewAnimator;", "animationDuration", "", "startDelay", "(JJ)V", "animator", "Landroid/animation/ValueAnimator;", "animate", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "fromAlpha", "", "toAlpha", "onDisappearFinished", "Lkotlin/Function0;", "", "endAnimation", "startAppearingAnimation", "adapterPosition", "", "startDisappearingAnimation", "AnimatablePlacesDiscoveryView", "discovery_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesDiscoveryViewAnimator extends C8908a {
    /* renamed from: a */
    private final ValueAnimator f36056a = new ValueAnimator();
    /* renamed from: b */
    private final long f36057b;
    /* renamed from: c */
    private final long f36058c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/discovery/view/animator/PlacesDiscoveryViewAnimator$animate$2$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.animator.PlacesDiscoveryViewAnimator$a */
    static final class C8897a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ PlacesDiscoveryViewAnimator f31134a;
        /* renamed from: b */
        final /* synthetic */ float f31135b;
        /* renamed from: c */
        final /* synthetic */ float f31136c;
        /* renamed from: d */
        final /* synthetic */ View f31137d;
        /* renamed from: e */
        final /* synthetic */ Function0 f31138e;

        C8897a(PlacesDiscoveryViewAnimator placesDiscoveryViewAnimator, float f, float f2, View view, Function0 function0) {
            this.f31134a = placesDiscoveryViewAnimator;
            this.f31135b = f;
            this.f31136c = f2;
            this.f31137d = view;
            this.f31138e = function0;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f31137d;
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            view.setAlpha(((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/discovery/view/animator/PlacesDiscoveryViewAnimator$animate$2$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/discovery/view/animator/PlacesDiscoveryViewAnimator$animate$2;Landroid/animation/ValueAnimator;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.animator.PlacesDiscoveryViewAnimator$b */
    public static final class C8898b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ ValueAnimator f31139a;
        /* renamed from: b */
        final /* synthetic */ PlacesDiscoveryViewAnimator f31140b;
        /* renamed from: c */
        final /* synthetic */ float f31141c;
        /* renamed from: d */
        final /* synthetic */ float f31142d;
        /* renamed from: e */
        final /* synthetic */ View f31143e;
        /* renamed from: f */
        final /* synthetic */ Function0 f31144f;

        C8898b(ValueAnimator valueAnimator, PlacesDiscoveryViewAnimator placesDiscoveryViewAnimator, float f, float f2, View view, Function0 function0) {
            this.f31139a = valueAnimator;
            this.f31140b = placesDiscoveryViewAnimator;
            this.f31141c = f;
            this.f31142d = f2;
            this.f31143e = view;
            this.f31144f = function0;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f31139a.removeListener(this);
            this.f31143e.setAlpha(this.f31142d);
            this.f31144f.invoke();
            this.f31140b.m37712b(this.f31143e);
        }
    }

    public PlacesDiscoveryViewAnimator(long j, long j2) {
        this.f36057b = j;
        this.f36058c = j2;
    }

    /* renamed from: a */
    public void mo10009a(int i, @NotNull View view) {
        C2668g.b(view, "view");
        i = m43905a(view, 0.0f, 1.0f, (Function0) PlacesDiscoveryViewAnimator$startAppearingAnimation$1.f44032a);
        i.setStartDelay(this.f36058c);
        i.start();
    }

    /* renamed from: b */
    public void mo10010b(int i, @NotNull View view) {
        C2668g.b(view, "view");
        m43905a(view, 1.0f, 0.0f, (Function0) PlacesDiscoveryViewAnimator$startDisappearingAnimation$1.f44033a).start();
    }

    /* renamed from: a */
    public void mo10008a() {
        C8299a.m35391a(this.f36056a);
    }

    /* renamed from: a */
    private final Animator m43905a(View view, float f, float f2, Function0<C15813i> function0) {
        PlacesDiscoveryViewAnimator placesDiscoveryViewAnimator = this;
        View view2 = view;
        if (view2 instanceof PlacesDiscoveryViewAnimator$AnimatablePlacesDiscoveryView) {
            view2.setAlpha(f);
            m37709a(view2);
            ValueAnimator valueAnimator = placesDiscoveryViewAnimator.f36056a;
            C8299a.m35391a(valueAnimator);
            valueAnimator.setDuration(placesDiscoveryViewAnimator.f36057b);
            valueAnimator.setFloatValues(new float[]{f, f2});
            valueAnimator.addUpdateListener(new C8897a(placesDiscoveryViewAnimator, f, f2, view2, function0));
            valueAnimator.addListener(new C8898b(valueAnimator, placesDiscoveryViewAnimator, f, f2, view2, function0));
            return valueAnimator;
        }
        throw new IllegalArgumentException("View must implement AnimatablePlacesDiscoveryView".toString());
    }
}
