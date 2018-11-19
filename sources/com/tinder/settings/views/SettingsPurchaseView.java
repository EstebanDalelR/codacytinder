package com.tinder.settings.views;

import android.content.Context;
import android.support.v4.content.C0432b;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.paywall.legacy.BoostPaywallSource;
import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.legacy.SuperlikePaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.settings.presenter.bf;
import com.tinder.settings.targets.SettingsPurchaseTarget;
import javax.inject.Inject;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u00020IH\u0016J\b\u0010K\u001a\u00020IH\u0016J\b\u0010L\u001a\u00020IH\u0016J\u0010\u0010M\u001a\u00020I2\u0006\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020IH\u0014J\b\u0010Q\u001a\u00020IH\u0014J\b\u0010R\u001a\u00020IH\u0002J\b\u0010S\u001a\u00020IH\u0016J\u0018\u0010T\u001a\u00020I2\u0006\u0010U\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020\u0011H\u0002J\b\u0010W\u001a\u00020IH\u0016J\b\u0010X\u001a\u00020IH\u0016J\b\u0010Y\u001a\u00020IH\u0016J\b\u0010Z\u001a\u00020IH\u0016J\b\u0010[\u001a\u00020IH\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8FX\u0002¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR#\u0010!\u001a\n \u001d*\u0004\u0018\u00010\"0\"8FX\u0002¢\u0006\f\n\u0004\b%\u0010\u0015\u001a\u0004\b#\u0010$R#\u0010&\u001a\n \u001d*\u0004\u0018\u00010\"0\"8FX\u0002¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b'\u0010$R#\u0010)\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8FX\u0002¢\u0006\f\n\u0004\b+\u0010\u0015\u001a\u0004\b*\u0010\u001fR#\u0010,\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8FX\u0002¢\u0006\f\n\u0004\b.\u0010\u0015\u001a\u0004\b-\u0010\u001fR#\u0010/\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8FX\u0002¢\u0006\f\n\u0004\b1\u0010\u0015\u001a\u0004\b0\u0010\u001fR\u001b\u00102\u001a\u00020\u00118FX\u0002¢\u0006\f\n\u0004\b4\u0010\u0015\u001a\u0004\b3\u0010\u0013R\u001b\u00105\u001a\u00020\u00178FX\u0002¢\u0006\f\n\u0004\b7\u0010\u0015\u001a\u0004\b6\u0010\u0019R\u001e\u00108\u001a\u0002098\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001b\u0010>\u001a\u00020\u00178FX\u0002¢\u0006\f\n\u0004\b@\u0010\u0015\u001a\u0004\b?\u0010\u0019R\u0011\u0010A\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u000bR#\u0010C\u001a\n \u001d*\u0004\u0018\u00010\"0\"8FX\u0002¢\u0006\f\n\u0004\bE\u0010\u0015\u001a\u0004\bD\u0010$R\u0011\u0010F\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\u000f¨\u0006\\"}, d2 = {"Lcom/tinder/settings/views/SettingsPurchaseView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/settings/targets/SettingsPurchaseTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "boostDescription", "Landroid/widget/TextView;", "getBoostDescription", "()Landroid/widget/TextView;", "boostLogo", "Landroid/widget/ImageView;", "getBoostLogo", "()Landroid/widget/ImageView;", "buttonElevation", "", "getButtonElevation", "()F", "buttonElevation$delegate", "Lkotlin/Lazy;", "consumableMargin", "", "getConsumableMargin", "()I", "consumableMargin$delegate", "getBoostButton", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getGetBoostButton", "()Landroid/view/View;", "getBoostButton$delegate", "getBoostLongText", "", "getGetBoostLongText", "()Ljava/lang/String;", "getBoostLongText$delegate", "getBoostShortText", "getGetBoostShortText", "getBoostShortText$delegate", "getSuperlikesButton", "getGetSuperlikesButton", "getSuperlikesButton$delegate", "getTinderGoldButton", "getGetTinderGoldButton", "getTinderGoldButton$delegate", "getTinderPlusButton", "getGetTinderPlusButton", "getTinderPlusButton$delegate", "iconElevation", "getIconElevation", "iconElevation$delegate", "padding", "getPadding", "padding$delegate", "presenter", "Lcom/tinder/settings/presenter/SettingsPurchasePresenter;", "getPresenter", "()Lcom/tinder/settings/presenter/SettingsPurchasePresenter;", "setPresenter", "(Lcom/tinder/settings/presenter/SettingsPurchasePresenter;)V", "standalonePadding", "getStandalonePadding", "standalonePadding$delegate", "superlikeDescription", "getSuperlikeDescription", "superlikeDescriptionText", "getSuperlikeDescriptionText", "superlikeDescriptionText$delegate", "superlikeLogo", "getSuperlikeLogo", "hideBoost", "", "hideSuperlike", "hideTinderGold", "hideTinderPlus", "launchPaywall", "source", "Lcom/tinder/paywall/legacy/PaywallTypeSource;", "onAttachedToWindow", "onDetachedFromWindow", "setClickListeners", "showBoost", "showButton", "view", "viewElevation", "showStandaloneBoost", "showStandaloneSuperlike", "showSuperlike", "showTinderGold", "showTinderPlus", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SettingsPurchaseView extends LinearLayout implements SettingsPurchaseTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f51633a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsPurchaseView.class), "getTinderPlusButton", "getGetTinderPlusButton()Landroid/view/View;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsPurchaseView.class), "getTinderGoldButton", "getGetTinderGoldButton()Landroid/view/View;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsPurchaseView.class), "getBoostButton", "getGetBoostButton()Landroid/view/View;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsPurchaseView.class), "getSuperlikesButton", "getGetSuperlikesButton()Landroid/view/View;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsPurchaseView.class), "getBoostShortText", "getGetBoostShortText()Ljava/lang/String;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsPurchaseView.class), "getBoostLongText", "getGetBoostLongText()Ljava/lang/String;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsPurchaseView.class), "superlikeDescriptionText", "getSuperlikeDescriptionText()Ljava/lang/String;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsPurchaseView.class), "buttonElevation", "getButtonElevation()F")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsPurchaseView.class), "iconElevation", "getIconElevation()F")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsPurchaseView.class), "consumableMargin", "getConsumableMargin()I")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsPurchaseView.class), "padding", "getPadding()I")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsPurchaseView.class), "standalonePadding", "getStandalonePadding()I"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public bf f51634b;
    /* renamed from: c */
    private final Lazy f51635c = C15810e.m59833a((Function0) new SettingsPurchaseView$getTinderPlusButton$2(this));
    /* renamed from: d */
    private final Lazy f51636d = C15810e.m59833a((Function0) new SettingsPurchaseView$getTinderGoldButton$2(this));
    /* renamed from: e */
    private final Lazy f51637e = C15810e.m59833a((Function0) new SettingsPurchaseView$getBoostButton$2(this));
    @NotNull
    /* renamed from: f */
    private final ImageView f51638f;
    @NotNull
    /* renamed from: g */
    private final TextView f51639g;
    /* renamed from: h */
    private final Lazy f51640h = C15810e.m59833a((Function0) new SettingsPurchaseView$getSuperlikesButton$2(this));
    @NotNull
    /* renamed from: i */
    private final ImageView f51641i;
    @NotNull
    /* renamed from: j */
    private final TextView f51642j;
    /* renamed from: k */
    private final Lazy f51643k;
    /* renamed from: l */
    private final Lazy f51644l;
    /* renamed from: m */
    private final Lazy f51645m;
    @NotNull
    /* renamed from: n */
    private final Lazy f51646n;
    @NotNull
    /* renamed from: o */
    private final Lazy f51647o;
    @NotNull
    /* renamed from: p */
    private final Lazy f51648p;
    @NotNull
    /* renamed from: q */
    private final Lazy f51649q;
    @NotNull
    /* renamed from: r */
    private final Lazy f51650r;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.views.SettingsPurchaseView$a */
    static final class C14905a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SettingsPurchaseView f46604a;

        C14905a(SettingsPurchaseView settingsPurchaseView) {
            this.f46604a = settingsPurchaseView;
        }

        public final void onClick(View view) {
            this.f46604a.m62170a(PlusPaywallSource.SETTINGS_PLUS_BUTTON);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.views.SettingsPurchaseView$b */
    static final class C14906b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SettingsPurchaseView f46605a;

        C14906b(SettingsPurchaseView settingsPurchaseView) {
            this.f46605a = settingsPurchaseView;
        }

        public final void onClick(View view) {
            this.f46605a.m62170a(GoldPaywallSource.SETTINGS_BUTTON);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.views.SettingsPurchaseView$c */
    static final class C14907c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SettingsPurchaseView f46606a;

        C14907c(SettingsPurchaseView settingsPurchaseView) {
            this.f46606a = settingsPurchaseView;
        }

        public final void onClick(View view) {
            this.f46606a.m62170a(BoostPaywallSource.SETTINGS_BOOST_BUTTON);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.views.SettingsPurchaseView$d */
    static final class C14908d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SettingsPurchaseView f46607a;

        C14908d(SettingsPurchaseView settingsPurchaseView) {
            this.f46607a = settingsPurchaseView;
        }

        public final void onClick(View view) {
            this.f46607a.m62170a(SuperlikePaywallSource.SETTINGS_SUPERLIKE_BUTTON);
        }
    }

    public final float getButtonElevation() {
        Lazy lazy = this.f51646n;
        KProperty kProperty = f51633a[7];
        return ((Number) lazy.getValue()).floatValue();
    }

    public final int getConsumableMargin() {
        Lazy lazy = this.f51648p;
        KProperty kProperty = f51633a[9];
        return ((Number) lazy.getValue()).intValue();
    }

    public final View getGetBoostButton() {
        Lazy lazy = this.f51637e;
        KProperty kProperty = f51633a[2];
        return (View) lazy.getValue();
    }

    public final String getGetBoostLongText() {
        Lazy lazy = this.f51644l;
        KProperty kProperty = f51633a[5];
        return (String) lazy.getValue();
    }

    public final String getGetBoostShortText() {
        Lazy lazy = this.f51643k;
        KProperty kProperty = f51633a[4];
        return (String) lazy.getValue();
    }

    public final View getGetSuperlikesButton() {
        Lazy lazy = this.f51640h;
        KProperty kProperty = f51633a[3];
        return (View) lazy.getValue();
    }

    public final View getGetTinderGoldButton() {
        Lazy lazy = this.f51636d;
        KProperty kProperty = f51633a[1];
        return (View) lazy.getValue();
    }

    public final View getGetTinderPlusButton() {
        Lazy lazy = this.f51635c;
        KProperty kProperty = f51633a[0];
        return (View) lazy.getValue();
    }

    public final float getIconElevation() {
        Lazy lazy = this.f51647o;
        KProperty kProperty = f51633a[8];
        return ((Number) lazy.getValue()).floatValue();
    }

    public final int getPadding() {
        Lazy lazy = this.f51649q;
        KProperty kProperty = f51633a[10];
        return ((Number) lazy.getValue()).intValue();
    }

    public final int getStandalonePadding() {
        Lazy lazy = this.f51650r;
        KProperty kProperty = f51633a[11];
        return ((Number) lazy.getValue()).intValue();
    }

    public final String getSuperlikeDescriptionText() {
        Lazy lazy = this.f51645m;
        KProperty kProperty = f51633a[6];
        return (String) lazy.getValue();
    }

    public SettingsPurchaseView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        this.f51643k = C15810e.m59833a((Function0) new SettingsPurchaseView$getBoostShortText$2(context));
        this.f51644l = C15810e.m59833a((Function0) new SettingsPurchaseView$getBoostLongText$2(context));
        this.f51645m = C15810e.m59833a((Function0) new SettingsPurchaseView$superlikeDescriptionText$2(context));
        this.f51646n = C15810e.m59833a((Function0) new SettingsPurchaseView$buttonElevation$2(context));
        this.f51647o = C15810e.m59833a((Function0) new SettingsPurchaseView$iconElevation$2(context));
        this.f51648p = C15810e.m59833a((Function0) new SettingsPurchaseView$consumableMargin$2(context));
        this.f51649q = C15810e.m59833a((Function0) new SettingsPurchaseView$padding$2(context));
        this.f51650r = C15810e.m59833a((Function0) new SettingsPurchaseView$standalonePadding$2(context));
        View.inflate(context, R.layout.settings_purchase_view, this);
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
        setOrientation(1);
        setClipToPadding(false);
        setClipChildren(false);
        context = getGetBoostButton().findViewById(R.id.consumable_description);
        C2668g.a(context, "getBoostButton.findViewB…d.consumable_description)");
        this.f51639g = (TextView) context;
        context = getGetBoostButton().findViewById(R.id.consumable_logo);
        C2668g.a(context, "getBoostButton.findViewB…ew>(R.id.consumable_logo)");
        this.f51638f = (ImageView) context;
        context = getGetSuperlikesButton().findViewById(R.id.consumable_description);
        C2668g.a(context, "getSuperlikesButton.find…d.consumable_description)");
        this.f51642j = (TextView) context;
        context = getGetSuperlikesButton().findViewById(R.id.consumable_logo);
        C2668g.a(context, "getSuperlikesButton.find…ew>(R.id.consumable_logo)");
        this.f51641i = (ImageView) context;
    }

    @NotNull
    public final ImageView getBoostLogo() {
        return this.f51638f;
    }

    @NotNull
    public final TextView getBoostDescription() {
        return this.f51639g;
    }

    @NotNull
    public final ImageView getSuperlikeLogo() {
        return this.f51641i;
    }

    @NotNull
    public final TextView getSuperlikeDescription() {
        return this.f51642j;
    }

    @NotNull
    public final bf getPresenter() {
        bf bfVar = this.f51634b;
        if (bfVar == null) {
            C2668g.b("presenter");
        }
        return bfVar;
    }

    public final void setPresenter(@NotNull bf bfVar) {
        C2668g.b(bfVar, "<set-?>");
        this.f51634b = bfVar;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        bf bfVar = this.f51634b;
        if (bfVar == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, bfVar);
        m62168a();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void showTinderPlus() {
        View getTinderPlusButton = getGetTinderPlusButton();
        C2668g.a(getTinderPlusButton, "getTinderPlusButton");
        m62169a(getTinderPlusButton, getButtonElevation());
        getGetTinderPlusButton().setPadding(0, getPadding(), 0, getPadding());
    }

    public void hideTinderPlus() {
        View getTinderPlusButton = getGetTinderPlusButton();
        C2668g.a(getTinderPlusButton, "getTinderPlusButton");
        getTinderPlusButton.setVisibility(8);
    }

    public void showTinderGold() {
        View getTinderGoldButton = getGetTinderGoldButton();
        C2668g.a(getTinderGoldButton, "getTinderGoldButton");
        m62169a(getTinderGoldButton, getButtonElevation());
        getGetTinderGoldButton().setPadding(0, getPadding(), 0, getPadding());
    }

    public void hideTinderGold() {
        View getTinderGoldButton = getGetTinderGoldButton();
        C2668g.a(getTinderGoldButton, "getTinderGoldButton");
        getTinderGoldButton.setVisibility(8);
    }

    public void showBoost() {
        this.f51638f.setImageResource(R.drawable.perk_boost_icon);
        this.f51639g.setTextColor(C0432b.c(getContext(), R.color.purple1));
        View getBoostButton = getGetBoostButton();
        C2668g.a(getBoostButton, "getBoostButton");
        m62169a(getBoostButton, getButtonElevation());
        ViewCompat.i(this.f51638f, getIconElevation());
        getBoostButton = getGetBoostButton();
        C2668g.a(getBoostButton, "getBoostButton");
        LayoutParams layoutParams = getBoostButton.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        ((LinearLayout.LayoutParams) layoutParams).setMargins(0, 0, getConsumableMargin(), 0);
        getBoostButton = getGetBoostButton();
        View getBoostButton2 = getGetBoostButton();
        C2668g.a(getBoostButton2, "getBoostButton");
        int paddingLeft = getBoostButton2.getPaddingLeft();
        int padding = getPadding();
        View getBoostButton3 = getGetBoostButton();
        C2668g.a(getBoostButton3, "getBoostButton");
        getBoostButton.setPadding(paddingLeft, padding, getBoostButton3.getPaddingRight(), getPadding());
        this.f51639g.setText(getGetBoostShortText());
    }

    public void showStandaloneBoost() {
        this.f51639g.setText(getGetBoostLongText());
        View getBoostButton = getGetBoostButton();
        C2668g.a(getBoostButton, "getBoostButton");
        LayoutParams layoutParams = getBoostButton.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        ((LinearLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, 0);
        getBoostButton = getGetBoostButton();
        View getBoostButton2 = getGetBoostButton();
        C2668g.a(getBoostButton2, "getBoostButton");
        int paddingLeft = getBoostButton2.getPaddingLeft();
        int standalonePadding = getStandalonePadding();
        View getBoostButton3 = getGetBoostButton();
        C2668g.a(getBoostButton3, "getBoostButton");
        getBoostButton.setPadding(paddingLeft, standalonePadding, getBoostButton3.getPaddingRight(), getStandalonePadding());
    }

    public void hideBoost() {
        View getBoostButton = getGetBoostButton();
        C2668g.a(getBoostButton, "getBoostButton");
        getBoostButton.setVisibility(8);
    }

    public void showSuperlike() {
        this.f51641i.setImageResource(R.drawable.perk_superlike_icon);
        this.f51642j.setTextColor(C0432b.c(getContext(), R.color.blue2));
        this.f51642j.setText(getSuperlikeDescriptionText());
        View getSuperlikesButton = getGetSuperlikesButton();
        C2668g.a(getSuperlikesButton, "getSuperlikesButton");
        m62169a(getSuperlikesButton, getButtonElevation());
        ViewCompat.i(this.f51641i, getIconElevation());
        getSuperlikesButton = getGetSuperlikesButton();
        C2668g.a(getSuperlikesButton, "getSuperlikesButton");
        LayoutParams layoutParams = getSuperlikesButton.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        ((LinearLayout.LayoutParams) layoutParams).setMargins(getConsumableMargin(), 0, 0, 0);
        getSuperlikesButton = getGetSuperlikesButton();
        View getSuperlikesButton2 = getGetSuperlikesButton();
        C2668g.a(getSuperlikesButton2, "getSuperlikesButton");
        int paddingLeft = getSuperlikesButton2.getPaddingLeft();
        int padding = getPadding();
        View getSuperlikesButton3 = getGetSuperlikesButton();
        C2668g.a(getSuperlikesButton3, "getSuperlikesButton");
        getSuperlikesButton.setPadding(paddingLeft, padding, getSuperlikesButton3.getPaddingRight(), getPadding());
    }

    public void showStandaloneSuperlike() {
        View getSuperlikesButton = getGetSuperlikesButton();
        C2668g.a(getSuperlikesButton, "getSuperlikesButton");
        LayoutParams layoutParams = getSuperlikesButton.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        ((LinearLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, 0);
        getSuperlikesButton = getGetSuperlikesButton();
        View getSuperlikesButton2 = getGetSuperlikesButton();
        C2668g.a(getSuperlikesButton2, "getSuperlikesButton");
        int paddingLeft = getSuperlikesButton2.getPaddingLeft();
        int standalonePadding = getStandalonePadding();
        View getSuperlikesButton3 = getGetSuperlikesButton();
        C2668g.a(getSuperlikesButton3, "getSuperlikesButton");
        getSuperlikesButton.setPadding(paddingLeft, standalonePadding, getSuperlikesButton3.getPaddingRight(), getStandalonePadding());
    }

    public void hideSuperlike() {
        View getSuperlikesButton = getGetSuperlikesButton();
        C2668g.a(getSuperlikesButton, "getSuperlikesButton");
        getSuperlikesButton.setVisibility(8);
    }

    /* renamed from: a */
    private final void m62169a(View view, float f) {
        view.setVisibility(0);
        ViewCompat.i(view, f);
    }

    /* renamed from: a */
    private final void m62168a() {
        getGetTinderPlusButton().setOnClickListener(new C14905a(this));
        getGetTinderGoldButton().setOnClickListener(new C14906b(this));
        getGetBoostButton().setOnClickListener(new C14907c(this));
        getGetSuperlikesButton().setOnClickListener(new C14908d(this));
    }

    /* renamed from: a */
    private final void m62170a(PaywallTypeSource paywallTypeSource) {
        C10076o.a(paywallTypeSource).a(getContext());
    }
}
