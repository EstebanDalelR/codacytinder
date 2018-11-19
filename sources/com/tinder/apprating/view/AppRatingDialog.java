package com.tinder.apprating.view;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.AppCompatRatingBar;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jakewharton.rxbinding.p130a.C5697b;
import com.jakewharton.rxbinding.p130a.C5698c;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.apprating.p164b.C8261a;
import com.tinder.apprating.target.AppRatingTarget;
import com.tinder.crashindicator.analytics.FeedbackAction;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.common.model.Subscription;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.RxUtils;
import com.tinder.utils.av;
import com.tinder.views.CustomEditText;
import com.tinder.views.CustomTextView;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u000203H\u0007J\b\u00105\u001a\u000203H\u0002J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\r07H\u0002J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u000707H\u0002J\b\u00109\u001a\u000203H\u0016J\b\u0010:\u001a\u000203H\u0016J\b\u0010;\u001a\u000203H\u0016J\b\u0010<\u001a\u000203H\u0002J\b\u0010=\u001a\u000203H\u0002J\b\u0010>\u001a\u000203H\u0007J\b\u0010?\u001a\u000203H\u0007J\b\u0010@\u001a\u000203H\u0002J\b\u0010A\u001a\u000203H\u0016J\b\u0010B\u001a\u000203H\u0002J\b\u0010C\u001a\u000203H\u0016J\b\u0010D\u001a\u000203H\u0016J\b\u0010E\u001a\u000203H\u0016J\b\u0010F\u001a\u000203H\u0016J\u0010\u0010G\u001a\u0002032\u0006\u0010H\u001a\u00020\u0007H\u0002J\u0010\u0010I\u001a\u0002032\u0006\u0010J\u001a\u00020\rH\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0012\u0010\tR\u001b\u0010\u0014\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0015\u0010\tR\u001b\u0010\u0017\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0018\u0010\u000fR\u001b\u0010\u001a\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001b\u0010\tR\u001b\u0010\u001d\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001e\u0010\u000fR\u001e\u0010 \u001a\u00020!8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b)\u0010\u000fR\u0010\u0010+\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b-\u0010\u000fR\u001b\u0010/\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b1\u0010\u000b\u001a\u0004\b0\u0010\t¨\u0006K"}, d2 = {"Lcom/tinder/apprating/view/AppRatingDialog;", "Landroid/support/v7/app/AppCompatDialog;", "Lcom/tinder/apprating/target/AppRatingTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "activeButtonText", "", "getActiveButtonText", "()I", "activeButtonText$delegate", "Lkotlin/Lazy;", "canYouTellUsHow", "", "getCanYouTellUsHow", "()Ljava/lang/String;", "canYouTellUsHow$delegate", "gold", "getGold", "gold$delegate", "grey", "getGrey", "grey$delegate", "howWouldYouRate", "getHowWouldYouRate", "howWouldYouRate$delegate", "inActiveButtonText", "getInActiveButtonText", "inActiveButtonText$delegate", "noBetterWay", "getNoBetterWay", "noBetterWay$delegate", "presenter", "Lcom/tinder/apprating/presenter/AppRatingPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/apprating/presenter/AppRatingPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/apprating/presenter/AppRatingPresenter;)V", "ratingChangeSubscription", "Lrx/Subscription;", "tapStars", "getTapStars", "tapStars$delegate", "textMessageChangeSubscription", "weLikeYouToo", "getWeLikeYouToo", "weLikeYouToo$delegate", "white", "getWhite", "white$delegate", "closeDialog", "", "continueSwipingButtonOnClick", "hideRatingView", "observeMessageTextChanges", "Lrx/Observable;", "observeRatingChanges", "onAttachedToWindow", "onBackPressed", "onDetachedFromWindow", "openPlayStoreIntent", "resetFeedbackView", "reviewButtonClick", "sendButtonOnClick", "setUpCustomRatingBar", "setUpRatingBar", "setupTextMessageEditText", "showFeedbackView", "showInitialRatingView", "showReviewButton", "showThankYouView", "updateRatingBar", "rating", "updateSendButtonState", "messageText", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AppRatingDialog extends AppCompatDialog implements AppRatingTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f40593a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(AppRatingDialog.class), "activeButtonText", "getActiveButtonText()I")), C15825i.a(new PropertyReference1Impl(C15825i.a(AppRatingDialog.class), "inActiveButtonText", "getInActiveButtonText()I")), C15825i.a(new PropertyReference1Impl(C15825i.a(AppRatingDialog.class), Subscription.GOLD, "getGold()I")), C15825i.a(new PropertyReference1Impl(C15825i.a(AppRatingDialog.class), "grey", "getGrey()I")), C15825i.a(new PropertyReference1Impl(C15825i.a(AppRatingDialog.class), "white", "getWhite()I")), C15825i.a(new PropertyReference1Impl(C15825i.a(AppRatingDialog.class), "canYouTellUsHow", "getCanYouTellUsHow()Ljava/lang/String;")), C15825i.a(new PropertyReference1Impl(C15825i.a(AppRatingDialog.class), "weLikeYouToo", "getWeLikeYouToo()Ljava/lang/String;")), C15825i.a(new PropertyReference1Impl(C15825i.a(AppRatingDialog.class), "noBetterWay", "getNoBetterWay()Ljava/lang/String;")), C15825i.a(new PropertyReference1Impl(C15825i.a(AppRatingDialog.class), "howWouldYouRate", "getHowWouldYouRate()Ljava/lang/String;")), C15825i.a(new PropertyReference1Impl(C15825i.a(AppRatingDialog.class), "tapStars", "getTapStars()Ljava/lang/String;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C8261a f40594b;
    /* renamed from: c */
    private final Lazy f40595c;
    /* renamed from: d */
    private final Lazy f40596d;
    /* renamed from: e */
    private final Lazy f40597e;
    /* renamed from: f */
    private final Lazy f40598f;
    /* renamed from: g */
    private final Lazy f40599g;
    /* renamed from: h */
    private final Lazy f40600h;
    /* renamed from: i */
    private final Lazy f40601i;
    /* renamed from: j */
    private final Lazy f40602j;
    /* renamed from: k */
    private final Lazy f40603k;
    /* renamed from: l */
    private final Lazy f40604l;
    /* renamed from: m */
    private rx.Subscription f40605m;
    /* renamed from: n */
    private rx.Subscription f40606n;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "charSequence", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.apprating.view.AppRatingDialog$a */
    static final class C12562a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12562a f40591a = new C12562a();

        C12562a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m49649a((CharSequence) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m49649a(@Nullable CharSequence charSequence) {
            return String.valueOf(charSequence);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "ratingFloat", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Float;)I"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.apprating.view.AppRatingDialog$b */
    static final class C12563b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12563b f40592a = new C12563b();

        C12563b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Integer.valueOf(m49650a((Float) obj));
        }

        /* renamed from: a */
        public final int m49650a(Float f) {
            return (int) f.floatValue();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "rating", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.apprating.view.AppRatingDialog$c */
    static final class C13610c<T> implements Action1<Integer> {
        /* renamed from: a */
        final /* synthetic */ AppRatingDialog f43376a;

        C13610c(AppRatingDialog appRatingDialog) {
            this.f43376a = appRatingDialog;
        }

        public /* synthetic */ void call(Object obj) {
            m53089a((Integer) obj);
        }

        /* renamed from: a */
        public final void m53089a(Integer num) {
            AppRatingDialog appRatingDialog = this.f43376a;
            C2668g.a(num, ManagerWebServices.PARAM_RATING);
            appRatingDialog.m49652a(num.intValue());
        }
    }

    /* renamed from: a */
    private final int m49651a() {
        Lazy lazy = this.f40595c;
        KProperty kProperty = f40593a[0];
        return ((Number) lazy.getValue()).intValue();
    }

    /* renamed from: b */
    private final int m49656b() {
        Lazy lazy = this.f40596d;
        KProperty kProperty = f40593a[1];
        return ((Number) lazy.getValue()).intValue();
    }

    /* renamed from: c */
    private final int m49657c() {
        Lazy lazy = this.f40597e;
        KProperty kProperty = f40593a[2];
        return ((Number) lazy.getValue()).intValue();
    }

    /* renamed from: d */
    private final int m49658d() {
        Lazy lazy = this.f40598f;
        KProperty kProperty = f40593a[3];
        return ((Number) lazy.getValue()).intValue();
    }

    /* renamed from: e */
    private final int m49659e() {
        Lazy lazy = this.f40599g;
        KProperty kProperty = f40593a[4];
        return ((Number) lazy.getValue()).intValue();
    }

    /* renamed from: f */
    private final String m49660f() {
        Lazy lazy = this.f40600h;
        KProperty kProperty = f40593a[5];
        return (String) lazy.getValue();
    }

    /* renamed from: g */
    private final String m49661g() {
        Lazy lazy = this.f40601i;
        KProperty kProperty = f40593a[6];
        return (String) lazy.getValue();
    }

    /* renamed from: h */
    private final String m49662h() {
        Lazy lazy = this.f40602j;
        KProperty kProperty = f40593a[7];
        return (String) lazy.getValue();
    }

    /* renamed from: i */
    private final String m49663i() {
        Lazy lazy = this.f40603k;
        KProperty kProperty = f40593a[8];
        return (String) lazy.getValue();
    }

    /* renamed from: j */
    private final String m49664j() {
        Lazy lazy = this.f40604l;
        KProperty kProperty = f40593a[9];
        return (String) lazy.getValue();
    }

    public AppRatingDialog(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context, R.style.Theme.FloatingDialog);
        this.f40595c = C18451c.a(LazyThreadSafetyMode.NONE, new AppRatingDialog$activeButtonText$2(context));
        this.f40596d = C18451c.a(LazyThreadSafetyMode.NONE, new AppRatingDialog$inActiveButtonText$2(context));
        this.f40597e = C18451c.a(LazyThreadSafetyMode.NONE, new AppRatingDialog$gold$2(context));
        this.f40598f = C18451c.a(LazyThreadSafetyMode.NONE, new AppRatingDialog$grey$2(context));
        this.f40599g = C18451c.a(LazyThreadSafetyMode.NONE, new AppRatingDialog$white$2(context));
        this.f40600h = C18451c.a(LazyThreadSafetyMode.NONE, new AppRatingDialog$canYouTellUsHow$2(context));
        this.f40601i = C18451c.a(LazyThreadSafetyMode.NONE, new AppRatingDialog$weLikeYouToo$2(context));
        this.f40602j = C18451c.a(LazyThreadSafetyMode.NONE, new AppRatingDialog$noBetterWay$2(context));
        this.f40603k = C18451c.a(LazyThreadSafetyMode.NONE, new AppRatingDialog$howWouldYouRate$2(context));
        this.f40604l = C18451c.a(LazyThreadSafetyMode.NONE, new AppRatingDialog$tapStars$2(context));
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
        getWindow().setWindowAnimations(R.style.dialog_up_down_animation);
        setContentView(R.layout.dialog_app_rating_all_views);
        ButterKnife.a(this);
        setCanceledOnTouchOutside(null);
        setCancelable(true);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8261a c8261a = this.f40594b;
        if (c8261a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c8261a);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RxUtils.b(this.f40605m);
        RxUtils.b(this.f40606n);
        Deadshot.drop(this);
    }

    public void showFeedbackView() {
        ((CustomEditText) findViewById(C6248a.feedbackEditText)).clearFocus();
        m49670p();
        CustomTextView customTextView = (CustomTextView) findViewById(C6248a.ratingTitle);
        C2668g.a(customTextView, "ratingTitle");
        customTextView.setText(m49660f());
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C6248a.feedbackView);
        C2668g.a(constraintLayout, "feedbackView");
        constraintLayout.setVisibility(0);
        m49666l();
        setUpRatingBar();
    }

    public void showThankYouView() {
        RxUtils.b(this.f40606n);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C6248a.thankYouView);
        C2668g.a(constraintLayout, "thankYouView");
        constraintLayout.setVisibility(0);
        constraintLayout = (ConstraintLayout) findViewById(C6248a.feedbackView);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        constraintLayout = (ConstraintLayout) findViewById(C6248a.ratingView);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        constraintLayout = (ConstraintLayout) findViewById(C6248a.ratingViewWithReviewButton);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        setCanceledOnTouchOutside(true);
        C8261a c8261a = this.f40594b;
        if (c8261a == null) {
            C2668g.b("presenter");
        }
        c8261a.m35279d();
    }

    public void closeDialog() {
        dismiss();
    }

    public void onBackPressed() {
        C8261a c8261a = this.f40594b;
        if (c8261a == null) {
            C2668g.b("presenter");
        }
        c8261a.m35274a(FeedbackAction.BACK_BUTTON);
        super.onBackPressed();
    }

    public void showReviewButton() {
        m49671q();
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C6248a.ratingViewWithReviewButton);
        C2668g.a(constraintLayout, "ratingViewWithReviewButton");
        constraintLayout.setVisibility(0);
        CustomTextView customTextView = (CustomTextView) findViewById(C6248a.ratingTitle);
        C2668g.a(customTextView, "ratingTitle");
        customTextView.setText(m49661g());
        customTextView = (CustomTextView) findViewById(C6248a.ratingBody);
        C2668g.a(customTextView, "ratingBody");
        customTextView.setText(m49662h());
        customTextView = (CustomTextView) findViewById(C6248a.reviewButton);
        if (customTextView != null) {
            customTextView.setVisibility(0);
        }
        View findViewById = findViewById(C6248a.notNowBorder2);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public void showInitialRatingView() {
        m49671q();
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C6248a.ratingViewWithReviewButton);
        C2668g.a(constraintLayout, "ratingViewWithReviewButton");
        constraintLayout.setVisibility(0);
        CustomTextView customTextView = (CustomTextView) findViewById(C6248a.ratingTitle);
        C2668g.a(customTextView, "ratingTitle");
        customTextView.setText(m49663i());
        customTextView = (CustomTextView) findViewById(C6248a.ratingBody);
        C2668g.a(customTextView, "ratingBody");
        customTextView.setText(m49664j());
        customTextView = (CustomTextView) findViewById(C6248a.reviewButton);
        if (customTextView != null) {
            customTextView.setVisibility(8);
        }
        View findViewById = findViewById(C6248a.notNowBorder2);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    @OnClick({2131362217, 2131362029, 2131362216})
    public final void continueSwipingButtonOnClick() {
        C8261a c8261a = this.f40594b;
        if (c8261a == null) {
            C2668g.b("presenter");
        }
        c8261a.m35274a(FeedbackAction.CANCEL);
    }

    @OnClick({2131363536})
    public final void sendButtonOnClick() {
        CustomEditText customEditText = (CustomEditText) findViewById(C6248a.feedbackEditText);
        C2668g.a(customEditText, "feedbackEditText");
        String obj = customEditText.getText().toString();
        C8261a c8261a = this.f40594b;
        if (c8261a == null) {
            C2668g.b("presenter");
        }
        c8261a.m35277b(obj);
        customEditText = (CustomEditText) findViewById(C6248a.feedbackEditText);
        C2668g.a(customEditText, "feedbackEditText");
        customEditText.getText().clear();
        av.c((CustomEditText) findViewById(C6248a.feedbackEditText));
    }

    @OnClick({2131363475})
    public final void reviewButtonClick() {
        C8261a c8261a = this.f40594b;
        if (c8261a == null) {
            C2668g.b("presenter");
        }
        c8261a.m35280e();
        m49665k();
    }

    public void setUpRatingBar() {
        m49668n();
        this.f40605m = m49669o().d(new C13610c(this));
    }

    /* renamed from: k */
    private final void m49665k() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x001a }
        r1 = "android.intent.action.VIEW";	 Catch:{ ActivityNotFoundException -> 0x001a }
        r2 = "market://details?id=com.tinder";	 Catch:{ ActivityNotFoundException -> 0x001a }
        r2 = android.net.Uri.parse(r2);	 Catch:{ ActivityNotFoundException -> 0x001a }
        r0.<init>(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x001a }
        r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;	 Catch:{ ActivityNotFoundException -> 0x001a }
        r0.setFlags(r1);	 Catch:{ ActivityNotFoundException -> 0x001a }
        r1 = r3.getContext();	 Catch:{ ActivityNotFoundException -> 0x001a }
        r1.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x001a }
        goto L_0x0038;
    L_0x001a:
        r0 = com.tinder.utils.at.f47621a;
        r1 = com.tinder.C6250b.C6248a.app_rating_base_view;
        r1 = r3.findViewById(r1);
        r1 = (android.support.v7.widget.CardView) r1;
        r2 = "app_rating_base_view";
        kotlin.jvm.internal.C2668g.a(r1, r2);
        r1 = r1.getRootView();
        r2 = "app_rating_base_view.rootView";
        kotlin.jvm.internal.C2668g.a(r1, r2);
        r2 = 2131821765; // 0x7f1104c5 float:1.9276282E38 double:1.053259897E-314;
        r0.a(r1, r2);
    L_0x0038:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.apprating.view.AppRatingDialog.k():void");
    }

    /* renamed from: l */
    private final void m49666l() {
        this.f40606n = m49667m().d(new C13611a(new AppRatingDialog$setupTextMessageEditText$1(this)));
    }

    /* renamed from: m */
    private final Observable<String> m49667m() {
        Observable<String> k = C5698c.a((CustomEditText) findViewById(C6248a.feedbackEditText)).k(C12562a.f40591a);
        C2668g.a(k, "RxTextView\n            .…harSequence.toString() })");
        return k;
    }

    /* renamed from: a */
    private final void m49655a(String str) {
        CustomTextView customTextView = (CustomTextView) findViewById(C6248a.sendButton);
        C2668g.a(customTextView, "sendButton");
        CharSequence charSequence = str;
        int i = 0;
        int i2 = charSequence.length() > 0 ? 1 : 0;
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        if (C19303i.b(charSequence).toString().length() > 0) {
            i = 1;
        }
        customTextView.setEnabled(i2 & i);
        customTextView = (CustomTextView) findViewById(C6248a.sendButton);
        C2668g.a(customTextView, "sendButton");
        if (customTextView.isEnabled()) {
            ((CustomTextView) findViewById(C6248a.sendButton)).setTextColor(m49651a());
        } else {
            ((CustomTextView) findViewById(C6248a.sendButton)).setTextColor(m49656b());
        }
        C8261a c8261a = this.f40594b;
        if (c8261a == null) {
            C2668g.b("presenter");
        }
        c8261a.m35275a(str);
    }

    /* renamed from: n */
    private final void m49668n() {
        AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) findViewById(C6248a.app_rating_bar);
        C2668g.a(appCompatRatingBar, "app_rating_bar");
        Drawable progressDrawable = appCompatRatingBar.getProgressDrawable();
        if (progressDrawable == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        }
        LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
        layerDrawable.getDrawable(2).setColorFilter(m49657c(), Mode.SRC_ATOP);
        layerDrawable.getDrawable(1).setColorFilter(m49659e(), Mode.SRC_ATOP);
        layerDrawable.getDrawable(0).setColorFilter(m49658d(), Mode.SRC_ATOP);
    }

    /* renamed from: o */
    private final Observable<Integer> m49669o() {
        Observable<Integer> b = C5697b.a((AppCompatRatingBar) findViewById(C6248a.app_rating_bar)).k(C12563b.f40592a).b(1);
        C2668g.a(b, "RxRatingBar\n            …gFloat.toInt() }).skip(1)");
        return b;
    }

    /* renamed from: a */
    private final void m49652a(int i) {
        C8261a c8261a = this.f40594b;
        if (c8261a == null) {
            C2668g.b("presenter");
        }
        c8261a.m35273a(i);
    }

    /* renamed from: p */
    private final void m49670p() {
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C6248a.ratingViewWithReviewButton);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }

    /* renamed from: q */
    private final void m49671q() {
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C6248a.feedbackView);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        av.c((CustomEditText) findViewById(C6248a.feedbackEditText));
    }
}
