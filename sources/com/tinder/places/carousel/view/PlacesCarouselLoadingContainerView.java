package com.tinder.places.carousel.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter;
import com.tinder.places.carousel.target.PlacesCarouselLoadingContainerTarget;
import com.tinder.places.injection.PlacesComponentProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J*\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002J\b\u0010!\u001a\u00020\u0019H\u0014J\b\u0010\"\u001a\u00020\u0019H\u0014J\b\u0010#\u001a\u00020\u0019H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\fH\u0002J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010'\u001a\u00020\u0019H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/tinder/places/carousel/view/PlacesCarouselLoadingContainerView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/places/carousel/target/PlacesCarouselLoadingContainerTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "growAnimation", "Landroid/animation/Animator;", "possibleViews", "", "Landroid/view/View;", "getPossibleViews", "()Ljava/util/Set;", "possibleViews$delegate", "Lkotlin/Lazy;", "presenter", "Lcom/tinder/places/carousel/presenter/PlacesCarouselLoadingContainerPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/places/carousel/presenter/PlacesCarouselLoadingContainerPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/places/carousel/presenter/PlacesCarouselLoadingContainerPresenter;)V", "showCarouselRunnable", "Lkotlin/Function0;", "", "showEmptyStateRunnable", "shrinkAnimation", "animateScale", "view", "growing", "", "endCallback", "onAttachedToWindow", "onDetachedFromWindow", "showEmptyState", "showLoadingState", "showOnly", "showPlaces", "stopAnimations", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesCarouselLoadingContainerView extends FrameLayout implements PlacesCarouselLoadingContainerTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f39912a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(PlacesCarouselLoadingContainerView.class), "possibleViews", "getPossibleViews()Ljava/util/Set;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public PlacesCarouselLoadingContainerPresenter f39913b;
    /* renamed from: c */
    private Animator f39914c;
    /* renamed from: d */
    private Animator f39915d;
    /* renamed from: e */
    private final Lazy f39916e = C18451c.a((Function0) new PlacesCarouselLoadingContainerView$possibleViews$2(this));
    /* renamed from: f */
    private final Function0<C15813i> f39917f;
    /* renamed from: g */
    private final Function0<C15813i> f39918g;
    /* renamed from: h */
    private HashMap f39919h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/places/carousel/view/PlacesCarouselLoadingContainerView$animateScale$1$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/places/carousel/view/PlacesCarouselLoadingContainerView$animateScale$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.view.PlacesCarouselLoadingContainerView$a */
    public static final class C10199a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ PlacesCarouselLoadingContainerView f33255a;
        /* renamed from: b */
        final /* synthetic */ AnimatorSet f33256b;
        /* renamed from: c */
        final /* synthetic */ ObjectAnimator f33257c;
        /* renamed from: d */
        final /* synthetic */ boolean f33258d;
        /* renamed from: e */
        final /* synthetic */ View f33259e;
        /* renamed from: f */
        final /* synthetic */ Function0 f33260f;

        C10199a(PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView, AnimatorSet animatorSet, ObjectAnimator objectAnimator, boolean z, View view, Function0 function0) {
            this.f33255a = placesCarouselLoadingContainerView;
            this.f33256b = animatorSet;
            this.f33257c = objectAnimator;
            this.f33258d = z;
            this.f33259e = view;
            this.f33260f = function0;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            if (this.f33258d != null) {
                this.f33255a.f39915d = (Animator) null;
            } else {
                this.f33255a.f39914c = (Animator) null;
            }
            this.f33259e.setScaleX(1.0f);
            this.f33259e.setScaleY(1.0f);
            animator = this.f33260f;
            if (animator != null) {
                C15813i c15813i = (C15813i) animator.invoke();
            }
        }
    }

    private final Set<View> getPossibleViews() {
        Lazy lazy = this.f39916e;
        KProperty kProperty = f39912a[0];
        return (Set) lazy.getValue();
    }

    /* renamed from: a */
    public View m48707a(int i) {
        if (this.f39919h == null) {
            this.f39919h = new HashMap();
        }
        View view = (View) this.f39919h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f39919h.put(Integer.valueOf(i), view);
        return view;
    }

    public PlacesCarouselLoadingContainerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        ((PlacesComponentProvider) context).getPlacesComponent().inject(this);
        FrameLayout.inflate(context, R.layout.view_places_carousel, this);
        this.f39917f = (Function0) new PlacesCarouselLoadingContainerView$showEmptyStateRunnable$1(this);
        this.f39918g = (Function0) new PlacesCarouselLoadingContainerView$showCarouselRunnable$1(this);
    }

    @NotNull
    public final PlacesCarouselLoadingContainerPresenter getPresenter$Tinder_release() {
        PlacesCarouselLoadingContainerPresenter placesCarouselLoadingContainerPresenter = this.f39913b;
        if (placesCarouselLoadingContainerPresenter == null) {
            C2668g.b("presenter");
        }
        return placesCarouselLoadingContainerPresenter;
    }

    public final void setPresenter$Tinder_release(@NotNull PlacesCarouselLoadingContainerPresenter placesCarouselLoadingContainerPresenter) {
        C2668g.b(placesCarouselLoadingContainerPresenter, "<set-?>");
        this.f39913b = placesCarouselLoadingContainerPresenter;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        PlacesCarouselLoadingContainerPresenter placesCarouselLoadingContainerPresenter = this.f39913b;
        if (placesCarouselLoadingContainerPresenter == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, placesCarouselLoadingContainerPresenter);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
        m48702a();
    }

    public void showLoadingState() {
        PlacesCarouselLoadingView placesCarouselLoadingView = (PlacesCarouselLoadingView) m48707a(C6248a.placesLoading);
        C2668g.a(placesCarouselLoadingView, "placesLoading");
        m48703a((View) placesCarouselLoadingView);
    }

    public void showEmptyState() {
        PlacesCarouselLoadingView placesCarouselLoadingView = (PlacesCarouselLoadingView) m48707a(C6248a.placesLoading);
        C2668g.a(placesCarouselLoadingView, "placesLoading");
        this.f39914c = m48701a(this, placesCarouselLoadingView, false, null, 4, null);
        Handler handler = getHandler();
        Function0 function0 = this.f39917f;
        if (function0 != null) {
            function0 = new C10205g(function0);
        }
        handler.postDelayed((Runnable) function0, 150);
    }

    public void showPlaces() {
        PlacesCarouselLoadingView placesCarouselLoadingView = (PlacesCarouselLoadingView) m48707a(C6248a.placesLoading);
        C2668g.a(placesCarouselLoadingView, "placesLoading");
        this.f39914c = m48701a(this, placesCarouselLoadingView, false, null, 4, null);
        Handler handler = getHandler();
        Function0 function0 = this.f39918g;
        if (function0 != null) {
            function0 = new C10205g(function0);
        }
        handler.postDelayed((Runnable) function0, 150);
    }

    /* renamed from: a */
    private final void m48702a() {
        Handler handler = getHandler();
        Function0 function0 = this.f39917f;
        if (function0 != null) {
            function0 = new C10205g(function0);
        }
        handler.removeCallbacks((Runnable) function0);
        handler = getHandler();
        function0 = this.f39918g;
        if (function0 != null) {
            function0 = new C10205g(function0);
        }
        handler.removeCallbacks((Runnable) function0);
        Animator animator = this.f39915d;
        if (animator != null) {
            animator.cancel();
        }
        animator = this.f39914c;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: a */
    private final void m48703a(View view) {
        if (C2668g.a(view, (PlacesCarouselLoadingView) m48707a(C6248a.placesLoading))) {
            ((PlacesCarouselLoadingView) m48707a(C6248a.placesLoading)).m48710a();
        } else {
            ((PlacesCarouselLoadingView) m48707a(C6248a.placesLoading)).m48711b();
        }
        Collection arrayList = new ArrayList();
        for (Object next : getPossibleViews()) {
            if ((C2668g.a((View) next, view) ^ 1) != 0) {
                arrayList.add(next);
            }
        }
        for (View visibility : (List) arrayList) {
            visibility.setVisibility(4);
        }
        for (View visibility2 : getPossibleViews()) {
            if (C2668g.a(visibility2, view)) {
                visibility2.setVisibility(null);
                return;
            }
        }
        throw ((Throwable) new NoSuchElementException("Collection contains no element matching the predicate."));
    }

    /* renamed from: a */
    static /* synthetic */ Animator m48701a(PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView, View view, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        return placesCarouselLoadingContainerView.m48699a(view, z, function0);
    }

    /* renamed from: a */
    private final Animator m48699a(View view, boolean z, Function0<C15813i> function0) {
        float f = 0.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{f2, f});
        ofFloat.setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator());
        f = 0.7f;
        float f3 = z ? 0.7f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{f3, f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{f3, f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat3});
        animatorSet.setInterpolator(z ? new OvershootInterpolator() : new DecelerateInterpolator());
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{animatorSet, ofFloat});
        animatorSet2.setDuration(300);
        animatorSet2.addListener(new C10199a(this, animatorSet, ofFloat, z, view, function0));
        animatorSet2.start();
        return animatorSet2;
    }
}
