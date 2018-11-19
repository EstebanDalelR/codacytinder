package com.tinder.places.settings.view;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import com.jakewharton.rxbinding2.p140b.C5716a;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.places.settings.activity.PlacesDisabledSurveyActivity;
import com.tinder.places.settings.activity.PlacesSurveyOtherActivity;
import com.tinder.places.settings.presenter.PlacesDisabledSurveyPresenter;
import com.tinder.places.settings.presenter.PlacesDisabledSurveyPresenter.Reason;
import com.tinder.places.settings.target.PlacesDisabledSurveyTarget;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/places/settings/view/PlacesDisabledSurveyView;", "Landroid/support/design/widget/CoordinatorLayout;", "Lcom/tinder/places/settings/target/PlacesDisabledSurveyTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "presenter", "Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter;", "getPresenter", "()Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter;", "setPresenter", "(Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter;)V", "reasonClickedSubscriber", "Lio/reactivex/disposables/Disposable;", "launchCustomReason", "", "onAttachedToWindow", "onDetachedFromWindow", "onSurveySuccess", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesDisabledSurveyView extends CoordinatorLayout implements PlacesDisabledSurveyTarget {
    /* renamed from: g */
    public static final C14323a f57837g = new C14323a();
    @Inject
    @NotNull
    /* renamed from: f */
    public PlacesDisabledSurveyPresenter f57838f;
    /* renamed from: h */
    private Disposable f57839h;
    /* renamed from: i */
    private HashMap f57840i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/settings/view/PlacesDisabledSurveyView$Companion;", "", "()V", "RESULT_CODE_OTHER_REASON", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesDisabledSurveyView$a */
    public static final class C14323a {
        private C14323a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter$Reason;", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesDisabledSurveyView$b */
    static final class C16025b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16025b f49789a = new C16025b();

        C16025b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m60784a(obj);
        }

        @NotNull
        /* renamed from: a */
        public final Reason m60784a(@NotNull Object obj) {
            C2668g.b(obj, "<anonymous parameter 0>");
            return Reason.MORE_CONTROL;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter$Reason;", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesDisabledSurveyView$c */
    static final class C16026c<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16026c f49790a = new C16026c();

        C16026c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m60785a(obj);
        }

        @NotNull
        /* renamed from: a */
        public final Reason m60785a(@NotNull Object obj) {
            C2668g.b(obj, "<anonymous parameter 0>");
            return Reason.NEED_A_BREAK;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter$Reason;", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesDisabledSurveyView$d */
    static final class C16027d<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16027d f49791a = new C16027d();

        C16027d() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m60786a(obj);
        }

        @NotNull
        /* renamed from: a */
        public final Reason m60786a(@NotNull Object obj) {
            C2668g.b(obj, "<anonymous parameter 0>");
            return Reason.SOMETHING_BROKEN;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter$Reason;", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesDisabledSurveyView$e */
    static final class C16028e<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16028e f49792a = new C16028e();

        C16028e() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m60787a(obj);
        }

        @NotNull
        /* renamed from: a */
        public final Reason m60787a(@NotNull Object obj) {
            C2668g.b(obj, "<anonymous parameter 0>");
            return Reason.CONFUSED;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter$Reason;", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesDisabledSurveyView$f */
    static final class C16029f<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16029f f49793a = new C16029f();

        C16029f() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m60788a(obj);
        }

        @NotNull
        /* renamed from: a */
        public final Reason m60788a(@NotNull Object obj) {
            C2668g.b(obj, "<anonymous parameter 0>");
            return Reason.PRIVACY;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter$Reason;", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesDisabledSurveyView$g */
    static final class C16030g<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16030g f49794a = new C16030g();

        C16030g() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m60789a(obj);
        }

        @NotNull
        /* renamed from: a */
        public final Reason m60789a(@NotNull Object obj) {
            C2668g.b(obj, "<anonymous parameter 0>");
            return Reason.OTHER;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/places/settings/presenter/PlacesDisabledSurveyPresenter$Reason;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesDisabledSurveyView$h */
    static final class C16031h<T> implements Consumer<Reason> {
        /* renamed from: a */
        final /* synthetic */ PlacesDisabledSurveyView f49795a;

        C16031h(PlacesDisabledSurveyView placesDisabledSurveyView) {
            this.f49795a = placesDisabledSurveyView;
        }

        public /* synthetic */ void accept(Object obj) {
            m60790a((Reason) obj);
        }

        /* renamed from: a */
        public final void m60790a(Reason reason) {
            PlacesDisabledSurveyPresenter presenter = this.f49795a.getPresenter();
            C2668g.a(reason, "it");
            presenter.m54603a(reason);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesDisabledSurveyView$i */
    static final class C16032i<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16032i f49796a = new C16032i();

        C16032i() {
        }

        public /* synthetic */ void accept(Object obj) {
            m60791a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m60791a(Throwable th) {
            C0001a.c(th, "Error handling clicks on Places Disabled survey", new Object[0]);
        }
    }

    /* renamed from: b */
    public View m67035b(int i) {
        if (this.f57840i == null) {
            this.f57840i = new HashMap();
        }
        View view = (View) this.f57840i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f57840i.put(Integer.valueOf(i), view);
        return view;
    }

    public PlacesDisabledSurveyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        attributeSet = context.getApplicationContext();
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) attributeSet).h().placesDisabledSurveyComponentBuilder().placesDisabledSurveyActivity((PlacesDisabledSurveyActivity) context).build().inject(this);
        View.inflate(context, R.layout.view_places_disabled_survey, this);
    }

    @NotNull
    public final PlacesDisabledSurveyPresenter getPresenter() {
        PlacesDisabledSurveyPresenter placesDisabledSurveyPresenter = this.f57838f;
        if (placesDisabledSurveyPresenter == null) {
            C2668g.b("presenter");
        }
        return placesDisabledSurveyPresenter;
    }

    public final void setPresenter(@NotNull PlacesDisabledSurveyPresenter placesDisabledSurveyPresenter) {
        C2668g.b(placesDisabledSurveyPresenter, "<set-?>");
        this.f57838f = placesDisabledSurveyPresenter;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        PlacesDisabledSurveyPresenter placesDisabledSurveyPresenter = this.f57838f;
        if (placesDisabledSurveyPresenter == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, placesDisabledSurveyPresenter);
        Disposable disposable = this.f57839h;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f57839h = C3959e.mergeArray(new ObservableSource[]{C5716a.b(m67035b(C6248a.controlContainer)).map(C16025b.f49789a), C5716a.b(m67035b(C6248a.breakContainer)).map(C16026c.f49790a), C5716a.b(m67035b(C6248a.brokenContainer)).map(C16027d.f49791a), C5716a.b(m67035b(C6248a.confusedContainer)).map(C16028e.f49792a), C5716a.b(m67035b(C6248a.privacyContainer)).map(C16029f.f49793a), C5716a.b(m67035b(C6248a.otherContainer)).map(C16030g.f49794a)}).subscribe(new C16031h(this), C16032i.f49796a);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
        Disposable disposable = this.f57839h;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public void launchCustomReason() {
        Context context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        Activity activity = (Activity) context;
        activity.startActivityForResult(PlacesSurveyOtherActivity.f45457a.a(activity), 0);
    }

    public void onSurveySuccess() {
        Context context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        Activity activity = (Activity) context;
        activity.setResult(-1);
        activity.finish();
    }
}
