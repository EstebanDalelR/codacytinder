package com.tinder.base;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.common.C3813b;
import com.tinder.activities.LoginActivity;
import com.tinder.apprating.p086a.C3919h;
import com.tinder.apprating.p086a.C8257a;
import com.tinder.apprating.p086a.C8259d;
import com.tinder.apprating.view.AppRatingDialog;
import com.tinder.events.EventGlobalsLoaded;
import com.tinder.events.EventLoggedOut;
import com.tinder.events.auth.EventAuthFailed;
import com.tinder.itsamatch.ItsAMatchDialogModel;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.bk;
import com.tinder.managers.bq;
import com.tinder.match.dialog.C12043a;
import com.tinder.match.dialog.C9861g;
import com.tinder.match.dialog.ItsAMatchDialogLauncherTarget;
import com.tinder.model.ReportNotification;
import com.tinder.model.auth.LogoutFrom$FORCED;
import com.tinder.module.Notification;
import com.tinder.paywall.p360c.C13548a;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.paywall.target.PaywallLauncherTarget;
import com.tinder.presenters.C14354a;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.InAppNotificationsPredicateHost;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.presenter.InAppNotificationsPresenter;
import com.tinder.pushnotifications.target.InAppNotificationsTarget;
import com.tinder.services.GCMRegistrationIntentService;
import com.tinder.targets.ActivitySignedInBaseTarget;
import com.tinder.updates.UpdatesScheduler;
import com.tinder.utils.ad;
import com.tinder.utils.av;
import de.greenrobot.event.C2664c;
import java.util.List;
import java8.util.function.Predicate;
import javax.inject.Inject;
import rx.p500e.C19573b;

public abstract class ActivitySignedInBase extends ActivityBase implements ItsAMatchDialogLauncherTarget, PaywallLauncherTarget, InAppNotificationsPredicateHost, InAppNotificationsTarget, ActivitySignedInBaseTarget {
    @Inject
    /* renamed from: G */
    bk f14898G;
    @Inject
    /* renamed from: H */
    ManagerProfile f14899H;
    @Inject
    /* renamed from: I */
    UpdatesScheduler f14900I;
    @Inject
    /* renamed from: J */
    ManagerDeepLinking f14901J;
    @Inject
    /* renamed from: K */
    bq f14902K;
    @Inject
    /* renamed from: L */
    C13548a f14903L;
    @Inject
    /* renamed from: M */
    C9861g f14904M;
    @Notification
    @Inject
    /* renamed from: N */
    C2664c f14905N;
    @Inject
    /* renamed from: O */
    Register f14906O;
    @Inject
    /* renamed from: P */
    protected C8259d f14907P;
    @Inject
    /* renamed from: Q */
    C14354a f14908Q;
    @Inject
    /* renamed from: R */
    InAppNotificationsPresenter f14909R;
    /* renamed from: S */
    protected Dialog f14910S;
    @Nullable
    /* renamed from: a */
    private List<ReportNotification> f14911a;
    /* renamed from: b */
    private C12043a f14912b;
    /* renamed from: c */
    private boolean f14913c = false;
    /* renamed from: d */
    private ViewGroup f14914d;
    /* renamed from: e */
    private C19573b f14915e = new C19573b();
    @Nullable
    /* renamed from: f */
    private AppRatingDialog f14916f;
    /* renamed from: g */
    private final Interpolator f14917g = new OvershootInterpolator(0.8f);
    /* renamed from: h */
    private final Interpolator f14918h = new AccelerateInterpolator();
    /* renamed from: i */
    private final LayoutParams f14919i = new LayoutParams(-1, -2);
    /* renamed from: j */
    private View f14920j;
    /* renamed from: k */
    private OnPreDrawListener f14921k;
    /* renamed from: l */
    private Animator f14922l;
    /* renamed from: m */
    private Animator f14923m;

    /* renamed from: n */
    protected int m18765n() {
        return 48;
    }

    protected void s_() {
    }

    public ActivitySignedInBase() {
        super(false);
    }

    public ActivitySignedInBase(boolean z) {
        super(z);
    }

    protected void onCreate(Bundle bundle) {
        ManagerApp.m14858e().inject(this);
        m18752a(getIntent());
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getIntent().getExtras();
            if (!(bundle == null || !bundle.getBoolean("tinder_from_push") || bundle.getBoolean("is_discount") == null)) {
                this.f14913c = true;
            }
        }
        this.f14906O.initialize();
        this.f14914d = (ViewGroup) getWindow().findViewById(16908290);
    }

    protected void onStart() {
        super.onStart();
        this.f14915e.a(this.f14907P.a().a(new C13632c(this), C13633d.f43450a));
        this.f14908Q.a(this);
        this.f14908Q.b();
        this.f14909R.takeTarget(this);
        this.f14909R.subscribeToInAppNotifications(this);
        this.f14905N.m10254a((Object) this);
        this.f14903L.a(this);
        this.f14904M.a(this);
        this.f14903L.a(this.f14913c);
        this.f14913c = false;
    }

    public void onResume() {
        super.onResume();
        if (mo4103d()) {
            s_();
            mo4106e();
            this.f14900I.schedule();
            if (!(this.f14911a == null || this.f14911a.isEmpty())) {
                m18699a(this.f14911a);
            }
            return;
        }
        m18764m();
    }

    public void onPause() {
        super.onPause();
        av.m10215a(this.f14912b);
        this.f14912b = null;
    }

    protected void onStop() {
        super.onStop();
        this.f14908Q.a(null);
        this.f14909R.dropTarget();
        this.f14903L.a();
        this.f14904M.a();
        this.f14905N.m10259c(this);
        this.f14915e.a();
    }

    /* renamed from: d */
    private boolean mo4103d() {
        boolean z = false;
        if (!this.x.m10128d()) {
            return false;
        }
        if (C2652a.m10116a() != null) {
            z = true;
        }
        return z;
    }

    public void onNewIntent(Intent intent) {
        m18752a(intent);
        super.onNewIntent(intent);
    }

    /* renamed from: a */
    private void m18752a(Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals("android.intent.action.VIEW") && intent.getData() != null) {
            this.f14901J.a(intent.getData());
        }
    }

    /* renamed from: m */
    protected void m18764m() {
        Intent intent = new Intent(this, LoginActivity.class);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        startActivity(intent);
        finish();
    }

    public void onEventMainThread(EventGlobalsLoaded eventGlobalsLoaded) {
        eventGlobalsLoaded = eventGlobalsLoaded.getUserMeta();
        if (eventGlobalsLoaded == null) {
            return;
        }
        if (this.E) {
            m18699a((List) eventGlobalsLoaded.reportNotifications);
        } else {
            this.f14911a = eventGlobalsLoaded.reportNotifications;
        }
    }

    /* renamed from: e */
    private void mo4106e() {
        if (!mo4107f()) {
            return;
        }
        if (!this.f14898G.m15010x() || this.f14902K.f8351a) {
            startService(new Intent(this, GCMRegistrationIntentService.class));
        }
    }

    /* renamed from: f */
    private boolean mo4107f() {
        C3813b a = C3813b.m14425a();
        int a2 = a.mo2566a((Context) this);
        if (a2 == 0) {
            return true;
        }
        if (a.mo2568a(a2)) {
            a.m14431a((Activity) this, a2, 9000).show();
        } else {
            ad.m10196b("Google Play services error", "This device is not supported.");
        }
        return false;
    }

    public void onEventMainThread(EventAuthFailed eventAuthFailed) {
        this.x.m10121a(LogoutFrom$FORCED.INSTANCE);
    }

    public void onEvent(EventLoggedOut eventLoggedOut) {
        ManagerApp.m14858e().inject(this);
        eventLoggedOut = new Intent(this, LoginActivity.class);
        eventLoggedOut.setFlags(32768);
        eventLoggedOut.putExtra("extra_show_intro", "");
        startActivity(eventLoggedOut);
        finish();
    }

    public void showMatchedDialog(@NonNull ItsAMatchDialogModel itsAMatchDialogModel) {
        av.m10215a(this.f14912b);
        if ((this.f14912b == null || !this.f14912b.isShowing()) && m18766o()) {
            this.f14912b = new C12043a(this, itsAMatchDialogModel);
            this.f14912b.show();
        }
    }

    public void tryPresentAppRating(String str) {
        if (!isFinishing()) {
            if ((this.f14910S == null || !this.f14910S.isShowing()) && C3919h.m14697a().m14707j()) {
                this.f14910S = new C8257a(this, 0, str);
                this.f14910S.show();
            }
        }
    }

    public void launchPaywallFlow(C10076o c10076o) {
        c10076o.a(this);
    }

    public void showInAppNotification(@NonNull TinderNotification tinderNotification) {
        stopAnimationsAndRemoveView();
        this.f14920j = tinderNotification.d(this);
        this.f14919i.gravity = m18765n();
        this.f14914d.addView(this.f14920j, this.f14919i);
        this.f14921k = new ActivitySignedInBase$1(this);
        this.f14920j.getViewTreeObserver().addOnPreDrawListener(this.f14921k);
    }

    /* renamed from: g */
    private void m18761g() {
        this.f14920j.setTranslationY(m18747a(this.f14920j));
        this.f14922l = m18748a(this.f14920j, true);
        this.f14922l.addListener(new ActivitySignedInBase$2(this));
        this.f14922l.start();
    }

    public void hideInAppNotification() {
        if (this.f14920j != null && this.f14922l == null) {
            this.f14923m = m18748a(this.f14920j, false);
            this.f14923m.addListener(new ActivitySignedInBase$3(this));
            this.f14923m.start();
        }
    }

    public void stopAnimationsAndRemoveView() {
        if (this.f14922l != null) {
            this.f14922l.cancel();
        }
        if (this.f14923m != null) {
            this.f14923m.cancel();
        }
        m18762p();
    }

    /* renamed from: p */
    private void m18762p() {
        if (this.f14920j != null) {
            if (this.f14921k != null) {
                this.f14920j.getViewTreeObserver().removeOnPreDrawListener(this.f14921k);
                this.f14921k = null;
            }
            this.f14914d.removeView(this.f14920j);
            this.f14920j = null;
        }
    }

    /* renamed from: a */
    private Animator m18748a(View view, boolean z) {
        TimeInterpolator timeInterpolator;
        float f = 0.0f;
        if (z) {
            z = m18747a(view);
            timeInterpolator = this.f14917g;
        } else {
            z = m18747a(view);
            timeInterpolator = this.f14918h;
            f = z;
            z = false;
        }
        view = ObjectAnimator.ofFloat(view, "translationY", new float[]{z, f});
        view.setInterpolator(timeInterpolator);
        view.setDuration(300);
        return view;
    }

    /* renamed from: a */
    private float m18747a(View view) {
        view = (float) view.getHeight();
        return m18765n() == 48 ? -view : view;
    }

    public Predicate<TinderNotification> getNotificationPredicate() {
        return C10362e.f33814a;
    }

    /* renamed from: o */
    protected boolean m18766o() {
        return (isFinishing() || isDestroyed()) ? false : true;
    }

    public void showAppRatingDialog() {
        if (!isFinishing()) {
            if (this.f14916f == null) {
                this.f14916f = new AppRatingDialog(this);
                this.f14916f.setOnDismissListener(new C8309f(this));
                this.f14916f.show();
            } else if (!this.f14916f.isShowing()) {
                this.f14916f.show();
            }
        }
    }

    /* renamed from: e */
    final /* synthetic */ void m18763e(DialogInterface dialogInterface) {
        this.f14916f = null;
    }
}
