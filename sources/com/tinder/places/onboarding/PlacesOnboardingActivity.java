package com.tinder.places.onboarding;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.places.model.PlacesOnboardingConfig;
import com.tinder.managers.ManagerApp;
import com.tinder.places.injection.PlacesOnboardingComponent;
import com.tinder.places.injection.PlacesOnboardingComponentProvider;
import com.tinder.places.main.util.PlacesSharedViewInjector;
import com.tinder.places.main.view.C12372c;
import com.tinder.places.main.view.PlacesPinDropView;
import com.tinder.places.onboarding.PlacesOnboardingViewPager.PlacesOnboardingEventListener;
import com.tinder.places.onboarding.presenter.C10267c;
import com.tinder.places.onboarding.target.PlacesOnboardingTarget;
import com.tinder.places.recs.view.PlacesUserRecCardView;
import com.tinder.views.grid.GridInjector;
import com.tinder.views.grid.GridUserRecCardHeadlineView;
import com.tinder.views.grid.GridUserRecCardView;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001=B\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016J\b\u0010!\u001a\u00020\tH\u0016J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u001aH\u0016J\u0012\u0010+\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020\u001aH\u0016J\u0010\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u001aH\u0014J\b\u00103\u001a\u00020\u001aH\u0014J\b\u00104\u001a\u00020\u001aH\u0016J\b\u00105\u001a\u00020\u001aH\u0016J\b\u00106\u001a\u00020\u001aH\u0016J\b\u00107\u001a\u00020\u001aH\u0002J \u00108\u001a\u00020\u001a2\b\u00109\u001a\u0004\u0018\u00010:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001a0<H\u0016R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006>"}, d2 = {"Lcom/tinder/places/onboarding/PlacesOnboardingActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/tinder/places/onboarding/target/PlacesOnboardingTarget;", "Lcom/tinder/places/injection/PlacesOnboardingComponentProvider;", "Lcom/tinder/views/grid/GridInjector;", "Lcom/tinder/places/main/util/PlacesSharedViewInjector;", "Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$PlacesOnboardingEventListener;", "()V", "component", "Lcom/tinder/places/injection/PlacesOnboardingComponent;", "errorView", "Lcom/tinder/places/main/view/PlacesErrorView;", "getErrorView", "()Lcom/tinder/places/main/view/PlacesErrorView;", "errorView$delegate", "Lkotlin/Lazy;", "pendingAnimations", "", "Landroid/animation/Animator;", "presenter", "Lcom/tinder/places/onboarding/presenter/PlacesOnboardingPresenter;", "getPresenter", "()Lcom/tinder/places/onboarding/presenter/PlacesOnboardingPresenter;", "setPresenter", "(Lcom/tinder/places/onboarding/presenter/PlacesOnboardingPresenter;)V", "bind", "", "config", "Lcom/tinder/domain/places/model/PlacesOnboardingConfig;", "bindShortOnboarding", "cancelOnboarding", "clearErrorView", "completeOnboarding", "getPlacesOnboardingComponent", "inject", "gridUserRecCardHeadlineView", "Lcom/tinder/views/grid/GridUserRecCardHeadlineView;", "gridUserRecCardView", "Lcom/tinder/views/grid/GridUserRecCardView;", "injectPlacesPinDropView", "placesPinDropView", "Lcom/tinder/places/main/view/PlacesPinDropView;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFirstScreenReady", "onLastScreenTransition", "position", "", "onStart", "onStop", "onUserAcceptsPlaces", "onUserDeclinesPlaces", "setupPageEnteringObserver", "showEntranceAnimation", "showErrorView", "exception", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "retryAction", "Lkotlin/Function0;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesOnboardingActivity extends AppCompatActivity implements PlacesOnboardingComponentProvider, PlacesSharedViewInjector, PlacesOnboardingEventListener, PlacesOnboardingTarget, GridInjector {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f45402a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(PlacesOnboardingActivity.class), "errorView", "getErrorView()Lcom/tinder/places/main/view/PlacesErrorView;"))};
    /* renamed from: c */
    public static final C10247a f45403c = new C10247a();
    @Inject
    @NotNull
    /* renamed from: b */
    public C10267c f45404b;
    /* renamed from: d */
    private PlacesOnboardingComponent f45405d;
    /* renamed from: e */
    private final Set<Animator> f45406e = new HashSet();
    /* renamed from: f */
    private final Lazy f45407f = C18451c.a(new PlacesOnboardingActivity$errorView$2(this));
    /* renamed from: g */
    private HashMap f45408g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/places/onboarding/PlacesOnboardingActivity$Companion;", "", "()V", "REQUEST_CODE_PLACES_ONBOARDING", "", "RESULT_ACCEPTED", "RESULT_REJECTED", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.PlacesOnboardingActivity$a */
    public static final class C10247a {
        private C10247a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/places/onboarding/PlacesOnboardingActivity$showEntranceAnimation$animator$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.PlacesOnboardingActivity$b */
    static final class C10248b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ PlacesOnboardingActivity f33364a;

        C10248b(PlacesOnboardingActivity placesOnboardingActivity) {
            this.f33364a = placesOnboardingActivity;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Guideline guideline = (Guideline) this.f33364a.m54535a(C6248a.mapBottomGuideline);
            C2668g.a(guideline, "mapBottomGuideline");
            LayoutParams layoutParams = guideline.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            layoutParams2.f300c = ((Float) valueAnimator).floatValue();
            Guideline guideline2 = (Guideline) this.f33364a.m54535a(C6248a.mapBottomGuideline);
            C2668g.a(guideline2, "mapBottomGuideline");
            guideline2.setLayoutParams(layoutParams2);
            ((ImageView) this.f33364a.m54535a(C6248a.onboardingMapImage)).invalidate();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/places/onboarding/PlacesOnboardingActivity$showEntranceAnimation$animator$1$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/places/onboarding/PlacesOnboardingActivity$showEntranceAnimation$animator$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.PlacesOnboardingActivity$c */
    public static final class C10249c extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ PlacesOnboardingActivity f33365a;

        C10249c(PlacesOnboardingActivity placesOnboardingActivity) {
            this.f33365a = placesOnboardingActivity;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f33365a.f45406e.remove(animator);
        }
    }

    /* renamed from: a */
    private final C12372c m54532a() {
        Lazy lazy = this.f45407f;
        KProperty kProperty = f45402a[0];
        return (C12372c) lazy.getValue();
    }

    /* renamed from: a */
    public View m54535a(int i) {
        if (this.f45408g == null) {
            this.f45408g = new HashMap();
        }
        View view = (View) this.f45408g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f45408g.put(Integer.valueOf(i), view);
        return view;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.view_places_onboarding);
        bundle = getApplicationContext();
        if (bundle == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        bundle = ((ManagerApp) bundle).h().placesOnboardingComponentBuilder().placesOnboardingActivity(this).build();
        C2668g.a(bundle, "(applicationContext as M…his)\n            .build()");
        this.f45405d = bundle;
        bundle = this.f45405d;
        if (bundle == null) {
            C2668g.b("component");
        }
        bundle.inject(this);
    }

    protected void onStart() {
        super.onStart();
        C10267c c10267c = this.f45404b;
        if (c10267c == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10267c);
    }

    protected void onStop() {
        super.onStop();
        Deadshot.drop(this);
        for (Animator cancel : this.f45406e) {
            cancel.cancel();
        }
        this.f45406e.clear();
        ((PlacesOnboardingViewPager) m54535a(C6248a.placesOnboardingPager)).m53035a();
    }

    public void completeOnboarding() {
        setResult(1);
        finish();
    }

    public void cancelOnboarding() {
        setResult(2);
        finish();
    }

    public void onBackPressed() {
        setResult(2);
        finish();
    }

    public void bind(@NotNull PlacesOnboardingConfig placesOnboardingConfig) {
        C2668g.b(placesOnboardingConfig, "config");
        ((PlacesOnboardingViewPager) m54535a(C6248a.placesOnboardingPager)).m53037a(placesOnboardingConfig, (PlacesOnboardingEventListener) this);
        ((CirclePageIndicator) m54535a(C6248a.placesOnboardingIndicator)).setViewPager((PlacesOnboardingViewPager) m54535a(C6248a.placesOnboardingPager), 0);
    }

    public void bindShortOnboarding(@NotNull PlacesOnboardingConfig placesOnboardingConfig) {
        C2668g.b(placesOnboardingConfig, "config");
        ((PlacesOnboardingViewPager) m54535a(C6248a.placesOnboardingPager)).m53040b(placesOnboardingConfig, (PlacesOnboardingEventListener) this);
        ((CirclePageIndicator) m54535a(C6248a.placesOnboardingIndicator)).setViewPager((PlacesOnboardingViewPager) m54535a(C6248a.placesOnboardingPager), 0);
    }

    @NotNull
    public PlacesOnboardingComponent getPlacesOnboardingComponent() {
        PlacesOnboardingComponent placesOnboardingComponent = this.f45405d;
        if (placesOnboardingComponent == null) {
            C2668g.b("component");
        }
        return placesOnboardingComponent;
    }

    public void inject(@NotNull GridUserRecCardView gridUserRecCardView) {
        C2668g.b(gridUserRecCardView, "gridUserRecCardView");
        PlacesOnboardingComponent placesOnboardingComponent = this.f45405d;
        if (placesOnboardingComponent == null) {
            C2668g.b("component");
        }
        placesOnboardingComponent.inject((PlacesUserRecCardView) gridUserRecCardView);
    }

    public void inject(@NotNull GridUserRecCardHeadlineView gridUserRecCardHeadlineView) {
        C2668g.b(gridUserRecCardHeadlineView, "gridUserRecCardHeadlineView");
        PlacesOnboardingComponent placesOnboardingComponent = this.f45405d;
        if (placesOnboardingComponent == null) {
            C2668g.b("component");
        }
        placesOnboardingComponent.inject(gridUserRecCardHeadlineView);
    }

    public void onFirstScreenReady() {
        m54534b();
    }

    public void onUserAcceptsPlaces() {
        C10267c c10267c = this.f45404b;
        if (c10267c == null) {
            C2668g.b("presenter");
        }
        c10267c.m41651e();
    }

    public void onUserDeclinesPlaces() {
        C10267c c10267c = this.f45404b;
        if (c10267c == null) {
            C2668g.b("presenter");
        }
        c10267c.m41652f();
    }

    public void onLastScreenTransition(float f) {
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) m54535a(C6248a.placesOnboardingIndicator);
        C2668g.a(circlePageIndicator, "placesOnboardingIndicator");
        circlePageIndicator.setAlpha(1.0f - f);
    }

    public void showErrorView(@Nullable PlacesApiException placesApiException, @NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "retryAction");
        if (m54532a().getParent() == null) {
            m54532a().m48774a(placesApiException, function0);
            ((FrameLayout) m54535a(C6248a.overlayFrame)).addView(m54532a());
        }
    }

    public void clearErrorView() {
        ((FrameLayout) m54535a(C6248a.overlayFrame)).removeView(m54532a());
    }

    public void setupPageEnteringObserver() {
        C10267c c10267c = this.f45404b;
        if (c10267c == null) {
            C2668g.b("presenter");
        }
        c10267c.m41647a(((PlacesOnboardingViewPager) m54535a(C6248a.placesOnboardingPager)).m53038b());
    }

    public void injectPlacesPinDropView(@NotNull PlacesPinDropView placesPinDropView) {
        C2668g.b(placesPinDropView, "placesPinDropView");
        PlacesOnboardingComponent placesOnboardingComponent = this.f45405d;
        if (placesOnboardingComponent == null) {
            C2668g.b("component");
        }
        placesOnboardingComponent.inject(placesPinDropView);
    }

    /* renamed from: b */
    private final void m54534b() {
        Guideline guideline = (Guideline) m54535a(C6248a.mapBottomGuideline);
        C2668g.a(guideline, "mapBottomGuideline");
        LayoutParams layoutParams = guideline.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
        }
        float f = ((ConstraintLayout.LayoutParams) layoutParams).f300c;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, f});
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(300);
        ofFloat.start();
        ofFloat.addUpdateListener(new C10248b(this));
        ofFloat.addListener(new C10249c(this));
        Set set = this.f45406e;
        C2668g.a(ofFloat, "animator");
        set.add(ofFloat);
    }
}
