package com.tinder.places.main.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.common.view.C8579a;
import com.tinder.common.view.Container;
import com.tinder.common.view.ContainerRegistrar;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.deadshot.Deadshot;
import com.tinder.discovery.view.animator.PlacesDiscoveryViewAnimator$AnimatablePlacesDiscoveryView;
import com.tinder.managers.ManagerApp;
import com.tinder.places.injection.PlacesComponent;
import com.tinder.places.injection.PlacesComponentProvider;
import com.tinder.places.main.presenter.C10223f;
import com.tinder.places.main.target.PlacesTarget;
import com.tinder.places.map.view.C14217c;
import com.tinder.places.onboarding.PlacesOnboardingActivity;
import com.tinder.places.p307b.C12296e;
import com.tinder.places.p307b.C12296e.C10124a;
import com.tinder.places.recs.view.PlacesUserRecCardView;
import com.tinder.places.settings.activity.PlacesSettingsActivity;
import com.tinder.places.settings.activity.PlacesSettingsActivity.C10291a;
import com.tinder.recsgrid.C16488g;
import com.tinder.views.grid.GridInjector;
import com.tinder.views.grid.GridUserRecCardHeadlineView;
import com.tinder.views.grid.GridUserRecCardView;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001VB\u0019\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\b\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000208H\u0016J\b\u0010:\u001a\u000208H\u0016J\b\u0010;\u001a\u000208H\u0016J\u0010\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010<\u001a\u0002082\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u000208H\u0014J\b\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u000208H\u0014J\u0012\u0010E\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010H\u001a\u000208H\u0007J\b\u0010I\u001a\u000208H\u0007J\b\u0010J\u001a\u000208H\u0016J\b\u0010K\u001a\u000208H\u0002J\b\u0010L\u001a\u000208H\u0016J\u0012\u0010M\u001a\u0002082\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J \u0010P\u001a\u0002082\b\u0010N\u001a\u0004\u0018\u00010O2\f\u0010Q\u001a\b\u0012\u0004\u0012\u0002080RH\u0016J\b\u0010S\u001a\u000208H\u0016J\b\u0010T\u001a\u000208H\u0016J\b\u0010U\u001a\u000208H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b#\u0010$R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b,\u0010-R\u000e\u0010/\u001a\u000200X\u000e¢\u0006\u0002\n\u0000R\u001e\u00101\u001a\u0002028\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006W"}, d2 = {"Lcom/tinder/places/main/view/PlacesView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/places/main/target/PlacesTarget;", "Landroid/arch/lifecycle/LifecycleObserver;", "Lcom/tinder/places/main/view/BackButtonRegistrar;", "Lcom/tinder/common/view/Container;", "Lcom/tinder/views/grid/GridInjector;", "Lcom/tinder/discovery/view/animator/PlacesDiscoveryViewAnimator$AnimatablePlacesDiscoveryView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animatePlaceHolderMapOut", "Landroid/animation/Animator;", "backButtonHandler", "Lcom/tinder/places/main/view/BackButtonHandler;", "getBackButtonHandler", "()Lcom/tinder/places/main/view/BackButtonHandler;", "setBackButtonHandler", "(Lcom/tinder/places/main/view/BackButtonHandler;)V", "decorator", "Lcom/tinder/places/main/view/PlacesView$Decorator;", "getDecorator", "()Lcom/tinder/places/main/view/PlacesView$Decorator;", "setDecorator", "(Lcom/tinder/places/main/view/PlacesView$Decorator;)V", "disabledView", "Lcom/tinder/places/main/view/PlacesDisabledView;", "getDisabledView", "()Lcom/tinder/places/main/view/PlacesDisabledView;", "disabledView$delegate", "Lkotlin/Lazy;", "errorView", "Lcom/tinder/places/main/view/PlacesErrorView;", "getErrorView", "()Lcom/tinder/places/main/view/PlacesErrorView;", "errorView$delegate", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "lifecycle", "Landroid/arch/lifecycle/Lifecycle;", "onTouchEventInterceptedListener", "Lcom/tinder/recsgrid/ViewPagerBlockTouchInterceptor;", "getOnTouchEventInterceptedListener", "()Lcom/tinder/recsgrid/ViewPagerBlockTouchInterceptor;", "onTouchEventInterceptedListener$delegate", "placesComponent", "Lcom/tinder/places/injection/PlacesComponent;", "presenter", "Lcom/tinder/places/main/presenter/PlacesPresenter;", "getPresenter", "()Lcom/tinder/places/main/presenter/PlacesPresenter;", "setPresenter", "(Lcom/tinder/places/main/presenter/PlacesPresenter;)V", "addMapFragmentIfNotExists", "", "clearDisabledView", "clearErrorView", "hideLoadingMap", "inject", "gridUserRecCardHeadlineView", "Lcom/tinder/views/grid/GridUserRecCardHeadlineView;", "gridUserRecCardView", "Lcom/tinder/views/grid/GridUserRecCardView;", "onAttachedToWindow", "onBackPressed", "", "onDetachedFromWindow", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onParentActivityStarted", "onParentActivityStopped", "onPreAnimationFinished", "removeMapFragmentIfExists", "showDisabledView", "showErrorDialog", "exception", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "showErrorView", "retryAction", "Lkotlin/Function0;", "showLoadingMap", "showOnboarding", "showPlacesSettings", "Decorator", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesView extends FrameLayout implements LifecycleObserver, Container, PlacesDiscoveryViewAnimator$AnimatablePlacesDiscoveryView, PlacesTarget, BackButtonRegistrar, GridInjector {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f12452a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(PlacesView.class), "errorView", "getErrorView()Lcom/tinder/places/main/view/PlacesErrorView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(PlacesView.class), "disabledView", "getDisabledView()Lcom/tinder/places/main/view/PlacesDisabledView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(PlacesView.class), "onTouchEventInterceptedListener", "getOnTouchEventInterceptedListener()Lcom/tinder/recsgrid/ViewPagerBlockTouchInterceptor;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C10223f f12453b;
    @Inject
    @NotNull
    /* renamed from: c */
    public PlacesView$Decorator f12454c;
    @Nullable
    /* renamed from: d */
    private BackButtonHandler f12455d;
    /* renamed from: e */
    private Lifecycle f12456e;
    /* renamed from: f */
    private final Lazy f12457f;
    /* renamed from: g */
    private final Lazy f12458g;
    /* renamed from: h */
    private PlacesComponent f12459h;
    /* renamed from: i */
    private Animator f12460i;
    /* renamed from: j */
    private final FragmentManager f12461j;
    /* renamed from: k */
    private final Lazy f12462k;
    /* renamed from: l */
    private HashMap f12463l;

    private final C12370a getDisabledView() {
        Lazy lazy = this.f12458g;
        KProperty kProperty = f12452a[1];
        return (C12370a) lazy.getValue();
    }

    private final C12372c getErrorView() {
        Lazy lazy = this.f12457f;
        KProperty kProperty = f12452a[0];
        return (C12372c) lazy.getValue();
    }

    private final C16488g getOnTouchEventInterceptedListener() {
        Lazy lazy = this.f12462k;
        KProperty kProperty = f12452a[2];
        return (C16488g) lazy.getValue();
    }

    /* renamed from: a */
    public View m15087a(int i) {
        if (this.f12463l == null) {
            this.f12463l = new HashMap();
        }
        View view = (View) this.f12463l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f12463l.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ PlacesView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public PlacesView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        this.f12457f = C18451c.a((Function0) new PlacesView$errorView$2(context));
        this.f12458g = C18451c.a((Function0) new PlacesView$disabledView$2(context));
        AppCompatActivity appCompatActivity = (AppCompatActivity) context;
        this.f12456e = appCompatActivity.getLifecycle();
        Context applicationContext = appCompatActivity.getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        Object build = ((ManagerApp) applicationContext).m14877h().placesComponentBuilder().placesView(this).build();
        C2668g.m10305a(build, "(context.applicationCont…his)\n            .build()");
        this.f12459h = build;
        ((PlacesComponentProvider) context).setPlacesComponent(this.f12459h);
        this.f12459h.inject(this);
        View.inflate(context, R.layout.view_places, this);
        context = this.f12454c;
        if (context == null) {
            C2668g.m10310b("decorator");
        }
        context.decorate(this);
        setFitsSystemWindows(true);
        ((ImageView) m15087a(C6248a.placesSettingsButton)).setOnClickListener(new PlacesView$1(this));
        Object supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        C2668g.m10305a(supportFragmentManager, "activity.supportFragmentManager");
        this.f12461j = supportFragmentManager;
        this.f12462k = C18451c.a((Function0) new PlacesView$onTouchEventInterceptedListener$2(this));
    }

    @NotNull
    public final C10223f getPresenter() {
        C10223f c10223f = this.f12453b;
        if (c10223f == null) {
            C2668g.m10310b("presenter");
        }
        return c10223f;
    }

    public final void setPresenter(@NotNull C10223f c10223f) {
        C2668g.m10309b(c10223f, "<set-?>");
        this.f12453b = c10223f;
    }

    @NotNull
    public final PlacesView$Decorator getDecorator() {
        PlacesView$Decorator placesView$Decorator = this.f12454c;
        if (placesView$Decorator == null) {
            C2668g.m10310b("decorator");
        }
        return placesView$Decorator;
    }

    public final void setDecorator(@NotNull PlacesView$Decorator placesView$Decorator) {
        C2668g.m10309b(placesView$Decorator, "<set-?>");
        this.f12454c = placesView$Decorator;
    }

    @Nullable
    public BackButtonHandler getBackButtonHandler() {
        return this.f12455d;
    }

    public void setBackButtonHandler(@Nullable BackButtonHandler backButtonHandler) {
        this.f12455d = backButtonHandler;
    }

    @OnLifecycleEvent(Event.ON_START)
    public final void onParentActivityStarted() {
        m15084a();
        C10223f c10223f = this.f12453b;
        if (c10223f == null) {
            C2668g.m10310b("presenter");
        }
        Deadshot.take(this, c10223f);
    }

    @OnLifecycleEvent(Event.ON_STOP)
    public final void onParentActivityStopped() {
        Animator animator = this.f12460i;
        if (animator != null) {
            animator.cancel();
        }
        Deadshot.drop(this);
        m15086b();
    }

    public void showLoadingMap() {
        Object obj = (ImageView) m15087a(C6248a.placesLoadingBackground);
        C2668g.m10305a(obj, "placesLoadingBackground");
        obj.setVisibility(0);
    }

    public void hideLoadingMap() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) m15087a(C6248a.placesLoadingBackground), "alpha", new float[]{1.0f, 0.0f});
        ofFloat.addListener(new PlacesView$a(this));
        ofFloat.setDuration(500);
        ofFloat.start();
        this.f12460i = ofFloat;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10223f c10223f = this.f12453b;
        if (c10223f == null) {
            C2668g.m10310b("presenter");
        }
        Deadshot.take(this, c10223f);
        Lifecycle lifecycle = this.f12456e;
        if (lifecycle != null) {
            lifecycle.mo36a(this);
        }
        ContainerRegistrar a = C8579a.a(this);
        if (a != null) {
            a.setContainer(this);
        }
        m15084a();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C10223f c10223f = this.f12453b;
        if (c10223f == null) {
            C2668g.m10310b("presenter");
        }
        c10223f.k();
        Deadshot.drop(this);
        Lifecycle lifecycle = this.f12456e;
        if (lifecycle != null) {
            lifecycle.mo37b(this);
        }
    }

    public void showPlacesSettings() {
        Context context = getContext();
        C10291a c10291a = PlacesSettingsActivity.f45452a;
        Object context2 = getContext();
        C2668g.m10305a(context2, "context");
        context.startActivity(c10291a.a(context2));
    }

    public void showDisabledView() {
        if (getDisabledView().getParent() == null) {
            getDisabledView().findViewById(R.id.turnOnPlacesButton).setOnClickListener(new PlacesView$b(this));
            clearErrorView();
            addView(getDisabledView());
        }
    }

    public void clearDisabledView() {
        removeView(getDisabledView());
    }

    public void showErrorDialog(@Nullable PlacesApiException placesApiException) {
        C10124a c10124a = C12296e.f39820a;
        Object context = getContext();
        C2668g.m10305a(context, "context");
        c10124a.a(placesApiException, context).show();
    }

    public void showErrorView(@Nullable PlacesApiException placesApiException, @NotNull Function0<C15813i> function0) {
        C2668g.m10309b(function0, "retryAction");
        if (getErrorView().getParent() == null) {
            getErrorView().a(placesApiException, function0);
            addView(getErrorView());
        }
    }

    public void clearErrorView() {
        removeView(getErrorView());
    }

    public boolean onBackPressed() {
        BackButtonHandler backButtonHandler = getBackButtonHandler();
        return backButtonHandler != null ? backButtonHandler.onBackPressed() : false;
    }

    public void inject(@NotNull GridUserRecCardView gridUserRecCardView) {
        C2668g.m10309b(gridUserRecCardView, "gridUserRecCardView");
        this.f12459h.inject((PlacesUserRecCardView) gridUserRecCardView);
    }

    public void inject(@NotNull GridUserRecCardHeadlineView gridUserRecCardHeadlineView) {
        C2668g.m10309b(gridUserRecCardHeadlineView, "gridUserRecCardHeadlineView");
        this.f12459h.inject(gridUserRecCardHeadlineView);
    }

    public void showOnboarding() {
        Intent intent = new Intent(getContext(), PlacesOnboardingActivity.class);
        Context context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
        }
        ((AppCompatActivity) context).startActivityForResult(intent, 58345);
    }

    public boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        C16488g onTouchEventInterceptedListener = getOnTouchEventInterceptedListener();
        if (onTouchEventInterceptedListener != null) {
            onTouchEventInterceptedListener.onTouchEventIntercepted(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPreAnimationFinished() {
        m15086b();
    }

    /* renamed from: a */
    private final void m15084a() {
        if (this.f12461j.mo428a("placesMapFragment") == null) {
            this.f12461j.mo429a().mo403a(R.id.mapContainer, new C14217c(), "placesMapFragment").mo413e();
        }
    }

    /* renamed from: b */
    private final void m15086b() {
        Fragment a = this.f12461j.mo428a("placesMapFragment");
        if (a != null) {
            this.f12461j.mo429a().mo404a(a).mo414f();
        }
    }
}
