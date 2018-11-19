package com.tinder.places.settings.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.deadshot.Deadshot;
import com.tinder.dialogs.C8858i;
import com.tinder.dialogs.C8858i.C8857a;
import com.tinder.learnmore.LearnMoreActivity;
import com.tinder.places.injection.Place;
import com.tinder.places.injection.PlacesSettingsComponentProvider;
import com.tinder.places.main.view.PlacesPinDropView;
import com.tinder.places.p307b.C12296e;
import com.tinder.places.p307b.C12296e.C10124a;
import com.tinder.places.p307b.C14152b;
import com.tinder.places.settings.activity.PlacesDisabledSurveyActivity;
import com.tinder.places.settings.activity.PlacesDisabledSurveyActivity.C10289a;
import com.tinder.places.settings.activity.PlacesSettingsActivity;
import com.tinder.places.settings.presenter.C14318c;
import com.tinder.places.settings.target.PlacesSettingsActivityTarget;
import com.tinder.places.settings.target.PlacesSettingsTarget;
import com.tinder.places.viewmodel.C14353d;
import com.tinder.utils.C15365p;
import com.tinder.utils.au;
import com.tinder.views.CustomSwitch;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15810e;
import kotlin.C15813i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 ^2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001^B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020'H\u0016J\u0006\u0010+\u001a\u00020'J\b\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001fH\u0002J\b\u00101\u001a\u00020'H\u0014J\b\u00102\u001a\u00020'H\u0014J\u0010\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020\u000bH\u0016J\u0010\u00105\u001a\u00020'2\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020'2\u0006\u00109\u001a\u00020\u000bH\u0016J\u0010\u0010:\u001a\u00020'2\u0006\u00109\u001a\u00020\u000bH\u0016J\u0010\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u000207H\u0016J\u0010\u0010=\u001a\u00020'2\u0006\u0010>\u001a\u000207H\u0016J\u0010\u0010?\u001a\u00020'2\u0006\u0010>\u001a\u000207H\u0016J\u0010\u0010@\u001a\u00020'2\u0006\u0010<\u001a\u000207H\u0016J\u0010\u0010A\u001a\u00020'2\u0006\u0010<\u001a\u000207H\u0016J\b\u0010B\u001a\u00020'H\u0016J\b\u0010C\u001a\u00020'H\u0016J\b\u0010D\u001a\u00020'H\u0016J\u0010\u0010E\u001a\u00020'2\u0006\u0010F\u001a\u000207H\u0016J\u0010\u0010G\u001a\u00020'2\u0006\u0010H\u001a\u000207H\u0016J\b\u0010I\u001a\u00020'H\u0002J\u0010\u0010J\u001a\u00020'2\u0006\u0010K\u001a\u000207H\u0002J\b\u0010L\u001a\u00020'H\u0002J\b\u0010M\u001a\u00020'H\u0002JF\u0010N\u001a\u00020'2<\u0010O\u001a8\u0012\u0013\u0012\u001107¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(S\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\b(T\u0012\u0004\u0012\u00020'0PH\u0016J\b\u0010U\u001a\u00020'H\u0016J\b\u0010V\u001a\u00020'H\u0016J\b\u0010W\u001a\u00020'H\u0016J\u0010\u0010X\u001a\u00020'2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010[\u001a\u00020'2\u0006\u0010\\\u001a\u00020]H\u0016R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\n8BX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010\rR!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\n8BX\u0002¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b$\u0010\r¨\u0006_"}, d2 = {"Lcom/tinder/places/settings/view/PlacesSettingsView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/places/settings/target/PlacesSettingsTarget;", "Lcom/tinder/places/settings/view/PlaceCountListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "categories", "", "", "getCategories", "()Ljava/util/List;", "setCategories", "(Ljava/util/List;)V", "disableDialog", "Lcom/tinder/dialogs/DialogBinaryBase;", "getDisableDialog", "()Lcom/tinder/dialogs/DialogBinaryBase;", "setDisableDialog", "(Lcom/tinder/dialogs/DialogBinaryBase;)V", "presenter", "Lcom/tinder/places/settings/presenter/PlacesSettingsPresenter;", "getPresenter", "()Lcom/tinder/places/settings/presenter/PlacesSettingsPresenter;", "setPresenter", "(Lcom/tinder/places/settings/presenter/PlacesSettingsPresenter;)V", "telemetryDialog", "Landroid/support/v7/app/AlertDialog;", "visibleWhenDisabledViews", "Landroid/view/View;", "getVisibleWhenDisabledViews", "visibleWhenDisabledViews$delegate", "Lkotlin/Lazy;", "visibleWhenEnabledViews", "getVisibleWhenEnabledViews", "visibleWhenEnabledViews$delegate", "add", "", "fromPlace", "Lcom/tinder/places/viewmodel/PlaceSettingViewModel;", "closeTelemetryDialog", "editButtonPressed", "enterEditPlacesUi", "exitEditPlacesUi", "findParentScrollView", "Landroid/support/v4/widget/NestedScrollView;", "childView", "onAttachedToWindow", "onDetachedFromWindow", "openBrowserWindow", "url", "openMapboxTelemetryDialog", "telemetryEnabled", "", "placeTapped", "id", "remove", "setDeleteButtonEnabled", "enabled", "setDeleteButtonVisibility", "visible", "setEditButtonVisibility", "setFeatureSwitchChecked", "setFeatureToggleEnabled", "setFemaleGenderPreference", "setMaleGenderPreference", "setNeutralGenderPreference", "setPlacesListEditable", "editable", "setPlacesListExpanded", "expanded", "setupDisableDialog", "setupEnabledSwitchListener", "shouldListen", "setupMinimumHeight", "setupPinDropView", "showDeletePlacesDialog", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "confirmed", "placeIds", "showDisableConfirmationDialog", "showDisabledUI", "showEnabledUI", "showErrorDialog", "exception", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "updatePlaceCount", "count", "", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesSettingsView extends FrameLayout implements PlacesSettingsTarget, PlaceCountListener {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f49797a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(PlacesSettingsView.class), "visibleWhenEnabledViews", "getVisibleWhenEnabledViews()Ljava/util/List;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(PlacesSettingsView.class), "visibleWhenDisabledViews", "getVisibleWhenDisabledViews()Ljava/util/List;"))};
    /* renamed from: e */
    public static final C14333a f49798e = new C14333a();
    @Inject
    @NotNull
    /* renamed from: b */
    public C14318c f49799b;
    @Place
    @Inject
    @NotNull
    /* renamed from: c */
    public List<String> f49800c;
    @NotNull
    /* renamed from: d */
    public C8858i f49801d;
    /* renamed from: f */
    private AlertDialog f49802f;
    /* renamed from: g */
    private final Lazy f49803g = C15810e.m59833a((Function0) new PlacesSettingsView$visibleWhenEnabledViews$2(this));
    /* renamed from: h */
    private final Lazy f49804h = C15810e.m59833a((Function0) new PlacesSettingsView$visibleWhenDisabledViews$2(this));
    /* renamed from: i */
    private HashMap f49805i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/settings/view/PlacesSettingsView$Companion;", "", "()V", "RESULT_CODE_EXIT_SURVEY", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSettingsView$a */
    public static final class C14333a {
        private C14333a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSettingsView$b */
    static final class C14334b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlacesSettingsView f45500a;

        C14334b(PlacesSettingsView placesSettingsView) {
            this.f45500a = placesSettingsView;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f45500a.getPresenter().m54634r();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSettingsView$c */
    static final class C14335c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlacesSettingsView f45501a;

        C14335c(PlacesSettingsView placesSettingsView) {
            this.f45501a = placesSettingsView;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f45501a.getPresenter().m54635s();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSettingsView$d */
    static final class C14336d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlacesSettingsView f45502a;

        C14336d(PlacesSettingsView placesSettingsView) {
            this.f45502a = placesSettingsView;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f45502a.getPresenter().m54636t();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/tinder/places/settings/view/PlacesSettingsView$setPlacesListExpanded$1", "Landroid/view/animation/Animation$AnimationListener;", "(Lcom/tinder/places/settings/view/PlacesSettingsView;)V", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSettingsView$e */
    public static final class C14337e implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ PlacesSettingsView f45503a;

        public void onAnimationRepeat(@Nullable Animation animation) {
        }

        public void onAnimationStart(@Nullable Animation animation) {
        }

        C14337e(PlacesSettingsView placesSettingsView) {
            this.f45503a = placesSettingsView;
        }

        public void onAnimationEnd(@Nullable Animation animation) {
            CardView cardView = (CardView) this.f45503a.m60796a(C6248a.placesSettingsListContainer);
            C2668g.a(cardView, "placesSettingsListContainer");
            cardView.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSettingsView$f */
    static final class C14338f implements View.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlacesSettingsView f45504a;

        C14338f(PlacesSettingsView placesSettingsView) {
            this.f45504a = placesSettingsView;
        }

        public final void onClick(View view) {
            this.f45504a.setFeatureSwitchChecked(true);
            this.f45504a.getDisableDialog().dismiss();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSettingsView$g */
    static final class C14339g implements View.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlacesSettingsView f45505a;

        C14339g(PlacesSettingsView placesSettingsView) {
            this.f45505a = placesSettingsView;
        }

        public final void onClick(View view) {
            this.f45505a.getPresenter().m54616a(false);
            this.f45505a.getDisableDialog().dismiss();
            view = this.f45505a.getContext();
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            Activity activity = (Activity) view;
            C10289a c10289a = PlacesDisabledSurveyActivity.f45450a;
            Context context = this.f45505a.getContext();
            C2668g.a(context, "context");
            activity.startActivityForResult(c10289a.a(context), 0);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "view", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSettingsView$h */
    static final class C14340h implements OnCheckedChangeListener {
        /* renamed from: a */
        final /* synthetic */ PlacesSettingsView f45506a;

        C14340h(PlacesSettingsView placesSettingsView) {
            this.f45506a = placesSettingsView;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f45506a.getPresenter().m54632p();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JP\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0010¸\u0006\u0011"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "(Lkotlin/jvm/functions/Function1;)V", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSettingsView$i */
    public static final class C14341i implements OnLayoutChangeListener {
        /* renamed from: a */
        final /* synthetic */ PlacesSettingsView f45507a;
        /* renamed from: b */
        final /* synthetic */ NestedScrollView f45508b;

        public C14341i(PlacesSettingsView placesSettingsView, NestedScrollView nestedScrollView) {
            this.f45507a = placesSettingsView;
            this.f45508b = nestedScrollView;
        }

        public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            view = this.f45507a.m60796a(C6248a.minimumHeightView);
            C2668g.a(view, "minimumHeightView");
            view = view.getLayoutParams();
            view.height = this.f45508b.getHeight();
            i = this.f45507a.m60796a(C6248a.minimumHeightView);
            C2668g.a(i, "minimumHeightView");
            i.setLayoutParams(view);
        }
    }

    private final List<View> getVisibleWhenDisabledViews() {
        Lazy lazy = this.f49804h;
        KProperty kProperty = f49797a[1];
        return (List) lazy.getValue();
    }

    private final List<View> getVisibleWhenEnabledViews() {
        Lazy lazy = this.f49803g;
        KProperty kProperty = f49797a[0];
        return (List) lazy.getValue();
    }

    /* renamed from: a */
    public View m60796a(int i) {
        if (this.f49805i == null) {
            this.f49805i = new HashMap();
        }
        View view = (View) this.f49805i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f49805i.put(Integer.valueOf(i), view);
        return view;
    }

    public PlacesSettingsView(@NotNull final Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ((PlacesSettingsComponentProvider) context).getPlacesSettingsComponent().inject(this);
        View.inflate(context, R.layout.view_places_settings, this);
        ((FloatingActionButton) m60796a(C6248a.placeSettingsDeleteFab)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                this.getPresenter().m54624h();
            }
        });
        ((ImageView) m60796a(C6248a.mapBoxLogo)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                this.getPresenter().m54628l();
            }
        });
        ((ImageView) m60796a(C6248a.foursquareLogo)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                this.getPresenter().m54629m();
            }
        });
        ((TextView) m60796a(C6248a.mapBoxButton)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                this.getPresenter().m54627k();
            }
        });
        ((TextView) m60796a(C6248a.openStreetMapButton)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                this.getPresenter().m54630n();
            }
        });
        ((TextView) m60796a(C6248a.improveMapButton)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                this.getPresenter().m54631o();
            }
        });
        ((TextView) m60796a(C6248a.mapBoxTelemetryButton)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                this.getPresenter().m54633q();
            }
        });
        ((TextView) m60796a(C6248a.turnPlacesOnCta)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                this.getPresenter().m54616a(true);
            }
        });
        ((CardView) m60796a(C6248a.learnMoreButton)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                view = context;
                if (view == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
                ((Activity) view).startActivity(new Intent(context, LearnMoreActivity.class));
            }
        });
        ((EditablePlacesRecyclerView) m60796a(C6248a.placesList)).setPlaceCountListener(this);
        m60794c();
        setupEnabledSwitchListener(true);
        m60795d();
        m60793b();
    }

    @NotNull
    public final C14318c getPresenter() {
        C14318c c14318c = this.f49799b;
        if (c14318c == null) {
            C2668g.b("presenter");
        }
        return c14318c;
    }

    public final void setPresenter(@NotNull C14318c c14318c) {
        C2668g.b(c14318c, "<set-?>");
        this.f49799b = c14318c;
    }

    @NotNull
    public final List<String> getCategories() {
        List<String> list = this.f49800c;
        if (list == null) {
            C2668g.b("categories");
        }
        return list;
    }

    public final void setCategories(@NotNull List<String> list) {
        C2668g.b(list, "<set-?>");
        this.f49800c = list;
    }

    @NotNull
    public final C8858i getDisableDialog() {
        C8858i c8858i = this.f49801d;
        if (c8858i == null) {
            C2668g.b("disableDialog");
        }
        return c8858i;
    }

    public final void setDisableDialog(@NotNull C8858i c8858i) {
        C2668g.b(c8858i, "<set-?>");
        this.f49801d = c8858i;
    }

    /* renamed from: b */
    private final void m60793b() {
        PlacesPinDropView placesPinDropView = (PlacesPinDropView) m60796a(C6248a.pinDropView);
        List list = this.f49800c;
        if (list == null) {
            C2668g.b("categories");
        }
        placesPinDropView.a(C17554o.m64195a(), false, false, list, true);
    }

    /* renamed from: c */
    private final void m60794c() {
        C8858i a = new C8857a(getContext()).a(R.string.places_disable_confirm_title).b(R.string.places_disable_confirm_message).a();
        C2668g.a(a, "DialogBinaryBase.Builder…age)\n            .build()");
        this.f49801d = a;
        a = this.f49801d;
        if (a == null) {
            C2668g.b("disableDialog");
        }
        a.a(R.string.cancel, new C14338f(this));
        a = this.f49801d;
        if (a == null) {
            C2668g.b("disableDialog");
        }
        a.b(R.string.yes, new C14339g(this));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        C2668g.a(context, "context");
        context = C15365p.m57675b(context);
        if (!(context instanceof PlacesSettingsActivity)) {
            context = null;
        }
        PlacesSettingsActivity placesSettingsActivity = (PlacesSettingsActivity) context;
        if (placesSettingsActivity != null) {
            String d = placesSettingsActivity.d();
            if (d != null) {
                C14318c c14318c = this.f49799b;
                if (c14318c == null) {
                    C2668g.b("presenter");
                }
                c14318c.m54614a(d);
            }
        }
        C14318c c14318c2 = this.f49799b;
        if (c14318c2 == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c14318c2);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void setDeleteButtonEnabled(boolean z) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) m60796a(C6248a.placeSettingsDeleteFab);
        C2668g.a(floatingActionButton, "placeSettingsDeleteFab");
        floatingActionButton.setEnabled(z);
    }

    public void showDeletePlacesDialog(@NotNull Function2<? super Boolean, ? super List<String>, C15813i> function2) {
        C2668g.b(function2, "action");
        Context context = getContext();
        C2668g.a(context, "context");
        new C14152b(context, new PlacesSettingsView$showDeletePlacesDialog$1(this, function2)).show();
    }

    public void add(@NotNull C14353d c14353d) {
        C2668g.b(c14353d, "fromPlace");
        ((EditablePlacesRecyclerView) m60796a(C6248a.placesList)).m67033a(c14353d);
    }

    public void remove(@NotNull String str) {
        C2668g.b(str, "id");
        ((EditablePlacesRecyclerView) m60796a(C6248a.placesList)).m67034a(str);
    }

    public void updatePlaceCount(int i) {
        C14318c c14318c = this.f49799b;
        if (c14318c == null) {
            C2668g.b("presenter");
        }
        c14318c.m54613a(i);
    }

    public void placeTapped(@NotNull String str) {
        C2668g.b(str, "id");
        C14318c c14318c = this.f49799b;
        if (c14318c == null) {
            C2668g.b("presenter");
        }
        c14318c.m54618b(str);
    }

    public void showDisableConfirmationDialog() {
        C8858i c8858i = this.f49801d;
        if (c8858i == null) {
            C2668g.b("disableDialog");
        }
        c8858i.show();
    }

    /* renamed from: a */
    public final void m60797a() {
        C14318c c14318c = this.f49799b;
        if (c14318c == null) {
            C2668g.b("presenter");
        }
        c14318c.m54625i();
    }

    public void enterEditPlacesUi() {
        Context context = getContext();
        if (!(context instanceof PlacesSettingsActivityTarget)) {
            context = null;
        }
        PlacesSettingsActivityTarget placesSettingsActivityTarget = (PlacesSettingsActivityTarget) context;
        if (placesSettingsActivityTarget != null) {
            placesSettingsActivityTarget.setMenuActionCancel();
        }
        C14318c c14318c = this.f49799b;
        if (c14318c == null) {
            C2668g.b("presenter");
        }
        c14318c.m54613a(((EditablePlacesRecyclerView) m60796a(C6248a.placesList)).getSelectedItemIDs().size());
    }

    public void exitEditPlacesUi() {
        Context context = getContext();
        if (!(context instanceof PlacesSettingsActivityTarget)) {
            context = null;
        }
        PlacesSettingsActivityTarget placesSettingsActivityTarget = (PlacesSettingsActivityTarget) context;
        if (placesSettingsActivityTarget != null) {
            placesSettingsActivityTarget.setMenuActionEdit();
        }
    }

    public void setFeatureToggleEnabled(boolean z) {
        CustomSwitch customSwitch = (CustomSwitch) m60796a(C6248a.placesEnabledSwitch);
        C2668g.a(customSwitch, "placesEnabledSwitch");
        customSwitch.setEnabled(z);
    }

    public void setDeleteButtonVisibility(boolean z) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) m60796a(C6248a.placeSettingsDeleteFab);
        C2668g.a(floatingActionButton, "placeSettingsDeleteFab");
        floatingActionButton.setVisibility(z ? false : true);
    }

    public void setPlacesListEditable(boolean z) {
        ((EditablePlacesRecyclerView) m60796a(C6248a.placesList)).setEditable(z);
    }

    public void openMapboxTelemetryDialog(boolean z) {
        int i = z ? R.string.places_mapbox_telemetry_dialog_body_enabled : R.string.places_mapbox_telemetry_dialog_body_disabled;
        this.f49802f = new Builder(getContext()).setTitle(R.string.places_mapbox_telemetry_dialog_title).setMessage(i).setNeutralButton(R.string.places_mapbox_telemetry_dialog_tell_me_more, new C14334b(this)).setPositiveButton(z ? R.string.places_mapbox_telemetry_dialog_keep_opting_in : R.string.places_mapbox_telemetry_dialog_opt_in, new C14335c(this)).setNegativeButton(z ? true : true, new C14336d(this)).show();
    }

    public void closeTelemetryDialog() {
        AlertDialog alertDialog = this.f49802f;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.f49802f = (AlertDialog) null;
    }

    public void showEnabledUI() {
        for (View visibility : getVisibleWhenEnabledViews()) {
            visibility.setVisibility(0);
        }
        for (View visibility2 : getVisibleWhenDisabledViews()) {
            visibility2.setVisibility(8);
        }
    }

    public void showDisabledUI() {
        for (View visibility : getVisibleWhenEnabledViews()) {
            visibility.setVisibility(8);
        }
        for (View visibility2 : getVisibleWhenDisabledViews()) {
            visibility2.setVisibility(0);
        }
    }

    private final void setupEnabledSwitchListener(boolean z) {
        if (z) {
            ((CustomSwitch) m60796a(C6248a.placesEnabledSwitch)).setOnCheckedChangeListener(new C14340h(this));
        } else {
            ((CustomSwitch) m60796a(C6248a.placesEnabledSwitch)).setOnCheckedChangeListener(null);
        }
    }

    /* renamed from: d */
    private final void m60795d() {
        View a = m60796a(C6248a.minimumHeightView);
        C2668g.a(a, "minimumHeightView");
        NestedScrollView a2 = m60792a(a);
        View view = a2;
        if (!ViewCompat.z(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new C14341i(this, a2));
            return;
        }
        view = m60796a(C6248a.minimumHeightView);
        C2668g.a(view, "minimumHeightView");
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = a2.getHeight();
        a = m60796a(C6248a.minimumHeightView);
        C2668g.a(a, "minimumHeightView");
        a.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private final NestedScrollView m60792a(View view) {
        view = view.getParent();
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        view = view;
        NestedScrollView nestedScrollView = (NestedScrollView) (!(view instanceof NestedScrollView) ? null : view);
        return nestedScrollView != null ? nestedScrollView : m60792a(view);
    }

    public void setFeatureSwitchChecked(boolean z) {
        CustomSwitch customSwitch = (CustomSwitch) m60796a(C6248a.placesEnabledSwitch);
        C2668g.a(customSwitch, "placesEnabledSwitch");
        if (z != customSwitch.isChecked()) {
            setupEnabledSwitchListener(false);
            customSwitch = (CustomSwitch) m60796a(C6248a.placesEnabledSwitch);
            C2668g.a(customSwitch, "placesEnabledSwitch");
            customSwitch.setChecked(z);
            setupEnabledSwitchListener(true);
        }
    }

    public void setPlacesListExpanded(boolean z) {
        CardView cardView;
        if (z) {
            cardView = (CardView) m60796a(C6248a.placesSettingsListContainer);
            C2668g.a(cardView, "placesSettingsListContainer");
            z = new ScaleAnimation(1.0f, 1.0f, cardView.getScaleY(), 1.0f);
            CardView cardView2 = (CardView) m60796a(C6248a.placesSettingsListContainer);
            C2668g.a(cardView2, "placesSettingsListContainer");
            cardView2.setVisibility(0);
        } else {
            cardView = (CardView) m60796a(C6248a.placesSettingsListContainer);
            C2668g.a(cardView, "placesSettingsListContainer");
            z = new ScaleAnimation(1.0f, 1.0f, cardView.getScaleY(), 0.0f);
            z.setAnimationListener(new C14337e(this));
        }
        z.setFillAfter(true);
        z.setDuration(150);
        ((CardView) m60796a(C6248a.placesSettingsListContainer)).startAnimation((Animation) z);
    }

    public void showErrorDialog(@NotNull PlacesApiException placesApiException) {
        C2668g.b(placesApiException, "exception");
        C10124a c10124a = C12296e.f39820a;
        Context context = getContext();
        C2668g.a(context, "context");
        c10124a.a(placesApiException, context).show();
    }

    public void setEditButtonVisibility(boolean z) {
        Context context = getContext();
        if (!(context instanceof PlacesSettingsActivityTarget)) {
            context = null;
        }
        PlacesSettingsActivityTarget placesSettingsActivityTarget = (PlacesSettingsActivityTarget) context;
        if (placesSettingsActivityTarget == null) {
            return;
        }
        if (z) {
            placesSettingsActivityTarget.showMenuActions();
        } else {
            placesSettingsActivityTarget.hideMenuActions();
        }
    }

    public void openBrowserWindow(@NotNull String str) {
        C2668g.b(str, "url");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        str = getContext();
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        ((Activity) str).startActivity(intent);
    }

    public void setMaleGenderPreference() {
        String a = au.m57649a((View) this, (int) R.string.places_turn_back_on_men, new String[0]);
        TextView textView = (TextView) m60796a(C6248a.placesTurnOnDetail);
        C2668g.a(textView, "placesTurnOnDetail");
        textView.setText(a);
    }

    public void setFemaleGenderPreference() {
        String a = au.m57649a((View) this, (int) R.string.places_turn_back_on_women, new String[0]);
        TextView textView = (TextView) m60796a(C6248a.placesTurnOnDetail);
        C2668g.a(textView, "placesTurnOnDetail");
        textView.setText(a);
    }

    public void setNeutralGenderPreference() {
        String a = au.m57649a((View) this, (int) R.string.places_turn_back_on_people, new String[0]);
        TextView textView = (TextView) m60796a(C6248a.placesTurnOnDetail);
        C2668g.a(textView, "placesTurnOnDetail");
        textView.setText(a);
    }
}
