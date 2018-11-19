package com.tinder.fastmatch.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.AppBarLayout.OnOffsetChangedListener;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout.LayoutParams;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.boost.view.BoostButtonView;
import com.tinder.boost.view.BoostButtonView$AnalyticsSource;
import com.tinder.boost.view.BoostButtonView$OnEmitterAttached;
import com.tinder.deadshot.Deadshot;
import com.tinder.fastmatch.FastMatchRecsActivityComponent;
import com.tinder.fastmatch.FastMatchRecsActivityComponentProvider;
import com.tinder.fastmatch.presenter.C11629g;
import com.tinder.fastmatch.target.FastMatchRecsActivityTarget;
import com.tinder.managers.ManagerApp;
import com.tinder.profile.module.ProfileComponent;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.InAppNotificationsPredicateHost;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.presenter.InAppNotificationsPresenter;
import com.tinder.pushnotifications.target.InAppNotificationsTarget;
import com.tinder.reactions.common.p388b.C14612a;
import com.tinder.recs.view.UserRecCardHeadLineView;
import com.tinder.utils.an;
import com.tinder.views.grid.GridInjector;
import com.tinder.views.grid.GridUserRecCardHeadlineView;
import com.tinder.views.grid.GridUserRecCardView;
import java.util.Arrays;
import java8.util.function.Predicate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0006\u0001\u0001\u0001B\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZH\u0016J\b\u0010[\u001a\u00020XH\u0016J\b\u0010\\\u001a\u00020XH\u0016J\b\u0010]\u001a\u00020XH\u0016J\b\u0010^\u001a\u00020\u001eH\u0016J\u000e\u0010_\u001a\b\u0012\u0004\u0012\u00020a0`H\u0016J\b\u0010b\u001a\u00020XH\u0007J\b\u0010c\u001a\u00020XH\u0007J\b\u0010d\u001a\u00020XH\u0016J\u0010\u0010e\u001a\u00020X2\u0006\u0010f\u001a\u00020gH\u0016J\u0010\u0010e\u001a\u00020X2\u0006\u0010h\u001a\u00020iH\u0016J\b\u0010j\u001a\u00020XH\u0016J\u0012\u0010k\u001a\u00020X2\b\u0010l\u001a\u0004\u0018\u00010mH\u0014J\b\u0010n\u001a\u00020XH\u0016J\b\u0010o\u001a\u00020XH\u0016J\b\u0010p\u001a\u00020XH\u0016J\b\u0010q\u001a\u00020EH\u0016J\n\u0010r\u001a\u0004\u0018\u00010PH\u0002J\b\u0010s\u001a\u00020XH\u0002J\u0010\u0010t\u001a\u00020X2\u0006\u0010u\u001a\u00020vH\u0016J\b\u0010w\u001a\u00020XH\u0002J\u0012\u0010x\u001a\u00020X2\b\u0010O\u001a\u0004\u0018\u00010PH\u0002J\b\u0010y\u001a\u00020XH\u0002J\b\u0010z\u001a\u00020XH\u0016J\u0010\u0010{\u001a\u00020X2\u0006\u0010|\u001a\u00020aH\u0016J\u0018\u0010}\u001a\u00020X2\u0006\u0010u\u001a\u00020v2\u0006\u0010~\u001a\u00020ZH\u0016J\u0011\u0010\u001a\u00020X2\u0007\u0010\u0001\u001a\u00020\u001cH\u0002J\t\u0010\u0001\u001a\u00020XH\u0016R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020 8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u000202X\u0004¢\u0006\u0002\n\u0000R\u001e\u00103\u001a\u0002048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u000e\u00109\u001a\u00020:X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010;\u001a\u00020:8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010>\u001a\u00020?8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u000e\u0010D\u001a\u00020EX.¢\u0006\u0002\n\u0000R\u001e\u0010F\u001a\u00020G8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0010\u0010L\u001a\u0004\u0018\u00010MX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u0004\u0018\u00010MX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010PX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010Q\u001a\u00020R8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V¨\u0006\u0001"}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchRecsActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/tinder/fastmatch/target/FastMatchRecsActivityTarget;", "Lcom/tinder/profile/module/ProfileComponentProvider;", "Lcom/tinder/fastmatch/FastMatchRecsActivityComponentProvider;", "Lcom/tinder/views/grid/GridInjector;", "Lcom/tinder/pushnotifications/InAppNotificationsPredicateHost;", "Lcom/tinder/pushnotifications/target/InAppNotificationsTarget;", "()V", "appBarLayout", "Landroid/support/design/widget/AppBarLayout;", "getAppBarLayout$Tinder_release", "()Landroid/support/design/widget/AppBarLayout;", "setAppBarLayout$Tinder_release", "(Landroid/support/design/widget/AppBarLayout;)V", "boostButtonView", "Lcom/tinder/boost/view/BoostButtonView;", "getBoostButtonView$Tinder_release", "()Lcom/tinder/boost/view/BoostButtonView;", "setBoostButtonView$Tinder_release", "(Lcom/tinder/boost/view/BoostButtonView;)V", "contentContainer", "Landroid/view/ViewGroup;", "getContentContainer$Tinder_release", "()Landroid/view/ViewGroup;", "setContentContainer$Tinder_release", "(Landroid/view/ViewGroup;)V", "currentNotificationView", "Landroid/view/View;", "fastMatchComponent", "Lcom/tinder/fastmatch/FastMatchRecsActivityComponent;", "fastMatchPillView", "Lcom/tinder/fastmatch/view/FastMatchPillView;", "getFastMatchPillView$Tinder_release", "()Lcom/tinder/fastmatch/view/FastMatchPillView;", "setFastMatchPillView$Tinder_release", "(Lcom/tinder/fastmatch/view/FastMatchPillView;)V", "fastMatchRecsView", "Lcom/tinder/fastmatch/view/FastMatchRecsView;", "getFastMatchRecsView$Tinder_release", "()Lcom/tinder/fastmatch/view/FastMatchRecsView;", "setFastMatchRecsView$Tinder_release", "(Lcom/tinder/fastmatch/view/FastMatchRecsView;)V", "fastMatchToolbarCountView", "Lcom/tinder/fastmatch/view/FastMatchRecsToolbarView;", "getFastMatchToolbarCountView$Tinder_release", "()Lcom/tinder/fastmatch/view/FastMatchRecsToolbarView;", "setFastMatchToolbarCountView$Tinder_release", "(Lcom/tinder/fastmatch/view/FastMatchRecsToolbarView;)V", "inAppNotificationLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "notificationsPresenter", "Lcom/tinder/pushnotifications/presenter/InAppNotificationsPresenter;", "getNotificationsPresenter", "()Lcom/tinder/pushnotifications/presenter/InAppNotificationsPresenter;", "setNotificationsPresenter", "(Lcom/tinder/pushnotifications/presenter/InAppNotificationsPresenter;)V", "pillOffset", "", "pillTopMargin", "preDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "presenter", "Lcom/tinder/fastmatch/presenter/FastMatchRecsActivityPresenter;", "getPresenter", "()Lcom/tinder/fastmatch/presenter/FastMatchRecsActivityPresenter;", "setPresenter", "(Lcom/tinder/fastmatch/presenter/FastMatchRecsActivityPresenter;)V", "profileComponent", "Lcom/tinder/profile/module/ProfileComponent;", "register", "Lcom/tinder/purchase/register/Register;", "getRegister", "()Lcom/tinder/purchase/register/Register;", "setRegister", "(Lcom/tinder/purchase/register/Register;)V", "slideInAnimation", "Landroid/animation/Animator;", "slideOutAnimation", "source", "Lcom/tinder/fastmatch/view/FastMatchRecsActivity$Source;", "toolbar", "Landroid/support/v7/widget/Toolbar;", "getToolbar$Tinder_release", "()Landroid/support/v7/widget/Toolbar;", "setToolbar$Tinder_release", "(Landroid/support/v7/widget/Toolbar;)V", "animateBoostButtonCounter", "", "count", "", "dismiss", "dismissPill", "finishActivity", "getFastMatchRecsActivityComponent", "getNotificationPredicate", "Ljava8/util/function/Predicate;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "handlePillOnClick", "handleToolbarOnClick", "hideInAppNotification", "inject", "gridUserRecCardHeadlineView", "Lcom/tinder/views/grid/GridUserRecCardHeadlineView;", "gridUserRecCardView", "Lcom/tinder/views/grid/GridUserRecCardView;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "popPillIfNeeded", "provideComponent", "readSourceFromIntent", "safelyRemoveNotification", "setNewLikesCount", "newCount", "", "setupBoostButton", "setupDagger", "setupPillView", "showBoostButtonTooltip", "showInAppNotification", "notification", "showNewLikesCount", "newCountString", "startEntranceAnimation", "notificationView", "stopAnimationsAndRemoveView", "Companion", "PillOnPreDrawListener", "Source", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchRecsActivity extends AppCompatActivity implements FastMatchRecsActivityComponentProvider, FastMatchRecsActivityTarget, ProfileComponentProvider, InAppNotificationsPredicateHost, InAppNotificationsTarget, GridInjector {
    /* renamed from: d */
    public static final C9407a f45362d = new C9407a();
    @Inject
    @NotNull
    /* renamed from: a */
    public C11629g f45363a;
    @NotNull
    @BindView(2131361892)
    public AppBarLayout appBarLayout;
    @Inject
    @NotNull
    /* renamed from: b */
    public Register f45364b;
    @NotNull
    @BindView(2131361947)
    public BoostButtonView boostButtonView;
    @Inject
    @NotNull
    /* renamed from: c */
    public InAppNotificationsPresenter f45365c;
    @NotNull
    @BindView(2131363863)
    public ViewGroup contentContainer;
    /* renamed from: e */
    private ProfileComponent f45366e;
    /* renamed from: f */
    private FastMatchRecsActivityComponent f45367f;
    @NotNull
    @BindView(2131362479)
    public FastMatchPillView fastMatchPillView;
    @NotNull
    @BindView(2131362480)
    public FastMatchRecsView fastMatchRecsView;
    @NotNull
    @BindView(2131362482)
    public FastMatchRecsToolbarView fastMatchToolbarCountView;
    /* renamed from: g */
    private Source f45368g;
    /* renamed from: h */
    private float f45369h;
    /* renamed from: i */
    private View f45370i;
    /* renamed from: j */
    private OnPreDrawListener f45371j;
    /* renamed from: k */
    private final LayoutParams f45372k;
    /* renamed from: l */
    private Animator f45373l;
    /* renamed from: m */
    private Animator f45374m;
    @BindDimen(2131165739)
    @JvmField
    public float pillTopMargin;
    @NotNull
    @BindView(2131362481)
    public Toolbar toolbar;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchRecsActivity$Source;", "", "(Ljava/lang/String;I)V", "PUSH", "MATCH_LIST", "MATCH_LIST_EMPTY", "PLACES", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Source {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchRecsActivity$Companion;", "", "()V", "EXTRA_SOURCE", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "source", "Lcom/tinder/fastmatch/view/FastMatchRecsActivity$Source;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsActivity$a */
    public static final class C9407a {
        private C9407a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final Intent m39355a(@NotNull Context context, @NotNull Source source) {
            C2668g.b(context, "context");
            C2668g.b(source, "source");
            Intent intent = new Intent(context, FastMatchRecsActivity.class);
            intent.putExtra("source", source.name());
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchRecsActivity$PillOnPreDrawListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Lcom/tinder/fastmatch/view/FastMatchRecsActivity;)V", "onPreDraw", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsActivity$b */
    private final class C9408b implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsActivity f31534a;

        public C9408b(FastMatchRecsActivity fastMatchRecsActivity) {
            this.f31534a = fastMatchRecsActivity;
        }

        public boolean onPreDraw() {
            this.f31534a.m54488a().getViewTreeObserver().removeOnPreDrawListener(this);
            this.f31534a.f45369h = this.f31534a.m54488a().getY() - ((this.f31534a.m54488a().getY() - ((float) this.f31534a.m54488a().getHeight())) + this.f31534a.pillTopMargin);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsActivity$e */
    static final class C9409e implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsActivity f31535a;

        C9409e(FastMatchRecsActivity fastMatchRecsActivity) {
            this.f31535a = fastMatchRecsActivity;
        }

        public final void onClick(View view) {
            this.f31535a.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/fastmatch/view/FastMatchRecsActivity$showInAppNotification$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Lcom/tinder/fastmatch/view/FastMatchRecsActivity;)V", "onPreDraw", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsActivity$i */
    public static final class C9410i implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsActivity f31536a;

        C9410i(FastMatchRecsActivity fastMatchRecsActivity) {
            this.f31536a = fastMatchRecsActivity;
        }

        public boolean onPreDraw() {
            View b = this.f31536a.f45370i;
            if (b == null || b.getHeight() <= 0) {
                return true;
            }
            b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f31536a.f45371j = (OnPreDrawListener) null;
            this.f31536a.m54475a(b);
            return false;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/tinder/pushnotifications/model/TinderNotification;", "kotlin.jvm.PlatformType", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsActivity$c */
    static final class C11659c<T> implements Predicate<TinderNotification> {
        /* renamed from: a */
        public static final C11659c f38131a = new C11659c();

        C11659c() {
        }

        /* renamed from: a */
        public final boolean m47463a(TinderNotification tinderNotification) {
            return true;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47463a((TinderNotification) obj);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/fastmatch/view/FastMatchRecsActivity$hideInAppNotification$1$1", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lcom/tinder/fastmatch/view/FastMatchRecsActivity$hideInAppNotification$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsActivity$d */
    public static final class C11660d extends an {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsActivity f38132a;

        C11660d(FastMatchRecsActivity fastMatchRecsActivity) {
            this.f38132a = fastMatchRecsActivity;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            super.onAnimationEnd(animator);
            this.f38132a.m54484e();
            this.f38132a.f45374m = (Animator) null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/fastmatch/view/FastMatchRecsActivity$onResume$1", "Lcom/tinder/boost/view/BoostButtonView$OnEmitterAttached;", "(Lcom/tinder/fastmatch/view/FastMatchRecsActivity;)V", "onAttached", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsActivity$f */
    public static final class C11661f implements BoostButtonView$OnEmitterAttached {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsActivity f38133a;

        C11661f(FastMatchRecsActivity fastMatchRecsActivity) {
            this.f38133a = fastMatchRecsActivity;
        }

        public void onAttached() {
            this.f38133a.m54489b().b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/support/design/widget/AppBarLayout;", "kotlin.jvm.PlatformType", "offset", "", "onOffsetChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsActivity$g */
    static final class C11662g implements OnOffsetChangedListener {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsActivity f38134a;

        C11662g(FastMatchRecsActivity fastMatchRecsActivity) {
            this.f38134a = fastMatchRecsActivity;
        }

        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            this.f38134a.m54488a().setTranslationY((((float) i) / ((float) this.f38134a.m54490c().getHeight())) * this.f38134a.f45369h);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/fastmatch/view/FastMatchRecsActivity$startEntranceAnimation$1$1", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lcom/tinder/fastmatch/view/FastMatchRecsActivity$startEntranceAnimation$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsActivity$j */
    public static final class C11663j extends an {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsActivity f38135a;

        C11663j(FastMatchRecsActivity fastMatchRecsActivity) {
            this.f38135a = fastMatchRecsActivity;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            super.onAnimationEnd(animator);
            this.f38135a.f45373l = (Animator) null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsActivity$h */
    static final class C13944h<T> implements Action1<View> {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsActivity f44069a;

        C13944h(FastMatchRecsActivity fastMatchRecsActivity) {
            this.f44069a = fastMatchRecsActivity;
        }

        public /* synthetic */ void call(Object obj) {
            m53468a((View) obj);
        }

        /* renamed from: a */
        public final void m53468a(View view) {
            view = this.f44069a.m54491d().getY() + ((float) this.f44069a.m54491d().getHeight());
            ViewGroup.LayoutParams layoutParams = this.f44069a.m54488a().getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            layoutParams2.topMargin = (int) view;
            this.f44069a.m54488a().setLayoutParams(layoutParams2);
        }
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final Intent m54474a(@NotNull Context context, @NotNull Source source) {
        return f45362d.m39355a(context, source);
    }

    public FastMatchRecsActivity() {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        this.f45372k = layoutParams;
    }

    @NotNull
    /* renamed from: a */
    public final FastMatchPillView m54488a() {
        FastMatchPillView fastMatchPillView = this.fastMatchPillView;
        if (fastMatchPillView == null) {
            C2668g.b("fastMatchPillView");
        }
        return fastMatchPillView;
    }

    @NotNull
    /* renamed from: b */
    public final BoostButtonView m54489b() {
        BoostButtonView boostButtonView = this.boostButtonView;
        if (boostButtonView == null) {
            C2668g.b("boostButtonView");
        }
        return boostButtonView;
    }

    @NotNull
    /* renamed from: c */
    public final AppBarLayout m54490c() {
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout == null) {
            C2668g.b("appBarLayout");
        }
        return appBarLayout;
    }

    @NotNull
    /* renamed from: d */
    public final FastMatchRecsToolbarView m54491d() {
        FastMatchRecsToolbarView fastMatchRecsToolbarView = this.fastMatchToolbarCountView;
        if (fastMatchRecsToolbarView == null) {
            C2668g.b("fastMatchToolbarCountView");
        }
        return fastMatchRecsToolbarView;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        this.f45368g = m54485f();
        if ((this.f45368g != null ? 1 : null) == null) {
            throw new IllegalStateException("source must not be null".toString());
        }
        m54476a(this.f45368g);
        super.onCreate(bundle);
        bundle = this.f45363a;
        if (bundle == null) {
            C2668g.b("presenter");
        }
        bundle.m47389b();
        setContentView(R.layout.activity_fast_match);
        ButterKnife.a(this);
        bundle = this.toolbar;
        if (bundle == null) {
            C2668g.b("toolbar");
        }
        setSupportActionBar(bundle);
        bundle = getSupportActionBar();
        if (bundle != null) {
            bundle.setDisplayShowTitleEnabled(false);
        }
        bundle = this.toolbar;
        if (bundle == null) {
            C2668g.b("toolbar");
        }
        bundle.setNavigationOnClickListener(new C9409e(this));
        m54486g();
    }

    public void showNewLikesCount(int i, @NotNull String str) {
        C2668g.b(str, "newCountString");
        C15828l c15828l = C15828l.f49033a;
        i = getResources().getQuantityString(R.plurals.tinder_gold_new_likes, i);
        C2668g.a(i, "resources.getQuantityStr…gold_new_likes, newCount)");
        Object[] objArr = new Object[]{str};
        i = String.format(i, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(i, "java.lang.String.format(format, *args)");
        str = this.fastMatchPillView;
        if (str == null) {
            C2668g.b("fastMatchPillView");
        }
        str.updateCount(i);
    }

    public void setNewLikesCount(int i) {
        FastMatchPillView fastMatchPillView = this.fastMatchPillView;
        if (fastMatchPillView == null) {
            C2668g.b("fastMatchPillView");
        }
        fastMatchPillView.setCount(i);
    }

    public void dismissPill() {
        FastMatchPillView fastMatchPillView = this.fastMatchPillView;
        if (fastMatchPillView == null) {
            C2668g.b("fastMatchPillView");
        }
        fastMatchPillView.dismiss();
    }

    public void popPillIfNeeded() {
        FastMatchPillView fastMatchPillView = this.fastMatchPillView;
        if (fastMatchPillView == null) {
            C2668g.b("fastMatchPillView");
        }
        fastMatchPillView.popUp();
        m54487h();
    }

    public void onResume() {
        super.onResume();
        C11629g c11629g = this.f45363a;
        if (c11629g == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c11629g);
        InAppNotificationsPresenter inAppNotificationsPresenter = this.f45365c;
        if (inAppNotificationsPresenter == null) {
            C2668g.b("notificationsPresenter");
        }
        inAppNotificationsPresenter.takeTarget(this);
        inAppNotificationsPresenter = this.f45365c;
        if (inAppNotificationsPresenter == null) {
            C2668g.b("notificationsPresenter");
        }
        inAppNotificationsPresenter.subscribeToInAppNotifications(this);
        c11629g = this.f45363a;
        if (c11629g == null) {
            C2668g.b("presenter");
        }
        c11629g.m47388a(this.f45368g);
        BoostButtonView boostButtonView = this.boostButtonView;
        if (boostButtonView == null) {
            C2668g.b("boostButtonView");
        }
        boostButtonView.setOnEmitterAttachedListener(new C11661f(this));
    }

    public void onPause() {
        super.onPause();
        InAppNotificationsPresenter inAppNotificationsPresenter = this.f45365c;
        if (inAppNotificationsPresenter == null) {
            C2668g.b("notificationsPresenter");
        }
        inAppNotificationsPresenter.dropTarget();
        Deadshot.drop(this);
        if (isFinishing()) {
            C11629g c11629g = this.f45363a;
            if (c11629g == null) {
                C2668g.b("presenter");
            }
            c11629g.m47396i();
        }
    }

    public void onBackPressed() {
        C11629g c11629g = this.f45363a;
        if (c11629g == null) {
            C2668g.b("presenter");
        }
        c11629g.m47397j();
    }

    public void dismiss() {
        FastMatchRecsView fastMatchRecsView = this.fastMatchRecsView;
        if (fastMatchRecsView == null) {
            C2668g.b("fastMatchRecsView");
        }
        if (!fastMatchRecsView.onBackPressed()) {
            super.onBackPressed();
        }
    }

    public void showBoostButtonTooltip() {
        BoostButtonView boostButtonView = this.boostButtonView;
        if (boostButtonView == null) {
            C2668g.b("boostButtonView");
        }
        boostButtonView.setShowBoostEmptyLoadTooltip(true);
    }

    public void animateBoostButtonCounter(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.FB_PARAM_FIELD_COUNT);
        BoostButtonView boostButtonView = this.boostButtonView;
        if (boostButtonView == null) {
            C2668g.b("boostButtonView");
        }
        boostButtonView.getBoostButton$Tinder_release().animateCounter(str, 1500);
    }

    @OnClick({2131362479})
    public final void handlePillOnClick() {
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout == null) {
            C2668g.b("appBarLayout");
        }
        appBarLayout.setExpanded(true);
        C11629g c11629g = this.f45363a;
        if (c11629g == null) {
            C2668g.b("presenter");
        }
        c11629g.m47398k();
    }

    @OnClick({2131362482})
    public final void handleToolbarOnClick() {
        FastMatchRecsView fastMatchRecsView = this.fastMatchRecsView;
        if (fastMatchRecsView == null) {
            C2668g.b("fastMatchRecsView");
        }
        fastMatchRecsView.smoothScrollToTop();
    }

    @NotNull
    public ProfileComponent provideComponent() {
        ProfileComponent profileComponent = this.f45366e;
        if (profileComponent == null) {
            C2668g.b("profileComponent");
        }
        return profileComponent;
    }

    @NotNull
    public FastMatchRecsActivityComponent getFastMatchRecsActivityComponent() {
        FastMatchRecsActivityComponent fastMatchRecsActivityComponent = this.f45367f;
        if (fastMatchRecsActivityComponent == null) {
            C2668g.b("fastMatchComponent");
        }
        return fastMatchRecsActivityComponent;
    }

    /* renamed from: a */
    private final void m54476a(Source source) {
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        source = ((ManagerApp) applicationContext).h().fastMatchRecsActivityComponentBuilder().source(source).build();
        C2668g.a(source, "(applicationContext as M…\n                .build()");
        this.f45367f = source;
        source = this.f45367f;
        if (source == null) {
            C2668g.b("fastMatchComponent");
        }
        source.inject(this);
        source = ManagerApp.e().profileComponentBuilder().profileActivityContext(this).build();
        C2668g.a(source, "ManagerApp.getTinderAppC…his)\n            .build()");
        this.f45366e = source;
    }

    public void inject(@NotNull GridUserRecCardView gridUserRecCardView) {
        C2668g.b(gridUserRecCardView, "gridUserRecCardView");
        FastMatchRecsActivityComponent fastMatchRecsActivityComponent = this.f45367f;
        if (fastMatchRecsActivityComponent == null) {
            C2668g.b("fastMatchComponent");
        }
        fastMatchRecsActivityComponent.inject((FastMatchUserRecCardView) gridUserRecCardView);
    }

    public void inject(@NotNull GridUserRecCardHeadlineView gridUserRecCardHeadlineView) {
        C2668g.b(gridUserRecCardHeadlineView, "gridUserRecCardHeadlineView");
        FastMatchRecsActivityComponent fastMatchRecsActivityComponent = this.f45367f;
        if (fastMatchRecsActivityComponent == null) {
            C2668g.b("fastMatchComponent");
        }
        fastMatchRecsActivityComponent.inject((UserRecCardHeadLineView) gridUserRecCardHeadlineView);
    }

    public void showInAppNotification(@NotNull TinderNotification tinderNotification) {
        C2668g.b(tinderNotification, "notification");
        stopAnimationsAndRemoveView();
        this.f45370i = tinderNotification.d(this);
        this.f45372k.gravity = 48;
        tinderNotification = this.contentContainer;
        if (tinderNotification == null) {
            C2668g.b("contentContainer");
        }
        tinderNotification.addView(this.f45370i, this.f45372k);
        this.f45371j = (OnPreDrawListener) new C9410i(this);
        tinderNotification = this.f45370i;
        if (tinderNotification != null) {
            tinderNotification = tinderNotification.getViewTreeObserver();
            if (tinderNotification != null) {
                tinderNotification.addOnPreDrawListener(this.f45371j);
            }
        }
    }

    @NotNull
    public Predicate<TinderNotification> getNotificationPredicate() {
        return C11659c.f38131a;
    }

    public void hideInAppNotification() {
        if (this.f45370i != null) {
            View view = this.f45370i;
            if (view == null) {
                C2668g.a();
            }
            float f = -((float) view.getHeight());
            View view2 = this.f45370i;
            if (view2 == null) {
                C2668g.a();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationY", new float[]{0.0f, f});
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.setDuration(300);
            ofFloat.addListener(new C11660d(this));
            ofFloat.start();
            this.f45374m = ofFloat;
        }
    }

    public void stopAnimationsAndRemoveView() {
        Animator animator = this.f45373l;
        if (animator != null) {
            animator.cancel();
        }
        animator = this.f45374m;
        if (animator != null) {
            animator.cancel();
        }
        m54484e();
    }

    public void finishActivity() {
        finish();
    }

    /* renamed from: e */
    private final void m54484e() {
        if (this.f45370i != null) {
            if (this.f45371j != null) {
                View view = this.f45370i;
                if (view != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeOnPreDrawListener(this.f45371j);
                    }
                }
                this.f45371j = (OnPreDrawListener) null;
            }
            ViewGroup viewGroup = this.contentContainer;
            if (viewGroup == null) {
                C2668g.b("contentContainer");
            }
            viewGroup.removeView(this.f45370i);
            this.f45370i = (View) null;
        }
    }

    /* renamed from: a */
    private final void m54475a(View view) {
        view.setTranslationY(-((float) view.getHeight()));
        view = ObjectAnimator.ofFloat(view, "translationY", new float[]{r0, 0.0f});
        view.setInterpolator(new OvershootInterpolator(0.8f));
        view.setDuration(300);
        view.addListener(new C11663j(this));
        view.start();
        this.f45373l = (Animator) view;
    }

    /* renamed from: f */
    private final Source m54485f() {
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("source");
                if (string != null) {
                    return Source.valueOf(string);
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    private final void m54486g() {
        BoostButtonView boostButtonView = this.boostButtonView;
        if (boostButtonView == null) {
            C2668g.b("boostButtonView");
        }
        boostButtonView.setAnalyticsSource(BoostButtonView$AnalyticsSource.FASTMATCH);
        boostButtonView = this.boostButtonView;
        if (boostButtonView == null) {
            C2668g.b("boostButtonView");
        }
        boostButtonView.setShowBoostStartTooltip(false);
        boostButtonView = this.boostButtonView;
        if (boostButtonView == null) {
            C2668g.b("boostButtonView");
        }
        ViewGroup viewGroup = this.contentContainer;
        if (viewGroup == null) {
            C2668g.b("contentContainer");
        }
        boostButtonView.setContentContainer(viewGroup);
    }

    /* renamed from: h */
    private final void m54487h() {
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout == null) {
            C2668g.b("appBarLayout");
        }
        appBarLayout.a(new C11662g(this));
        C14612a c14612a = C14612a.f46118a;
        FastMatchRecsToolbarView fastMatchRecsToolbarView = this.fastMatchToolbarCountView;
        if (fastMatchRecsToolbarView == null) {
            C2668g.b("fastMatchToolbarCountView");
        }
        c14612a.e(fastMatchRecsToolbarView).d(new C13944h(this));
        FastMatchPillView fastMatchPillView = this.fastMatchPillView;
        if (fastMatchPillView == null) {
            C2668g.b("fastMatchPillView");
        }
        fastMatchPillView.getViewTreeObserver().addOnPreDrawListener(new C9408b(this));
    }
}
