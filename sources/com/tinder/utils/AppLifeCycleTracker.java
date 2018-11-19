package com.tinder.utils;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.tinder.analytics.C2634g;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.p077b.C2641a;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.model.SparksEvent;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.pushnotifications.p381b.C14552c;
import com.tinder.pushnotifications.usecase.NotifyPushServer;
import com.tinder.pushnotifications.usecase.NotifyPushServer.NotifyReason;
import com.tinder.tinderplus.p428a.C15192e;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import rx.Subscription;

@Deprecated
public class AppLifeCycleTracker implements ActivityLifecycleCallbacks {
    /* renamed from: a */
    public static boolean f8377a = false;
    /* renamed from: l */
    private static boolean f8378l = false;
    /* renamed from: m */
    private static boolean f8379m = true;
    /* renamed from: n */
    private static boolean f8380n = false;
    /* renamed from: o */
    private static AppLifeCycleTracker$b f8381o;
    /* renamed from: r */
    private static AppLifeCycleTracker f8382r;
    @Inject
    /* renamed from: b */
    C2652a f8383b;
    @Inject
    /* renamed from: c */
    ManagerFusedLocation f8384c;
    @Inject
    /* renamed from: d */
    ManagerDeepLinking f8385d;
    @Inject
    /* renamed from: e */
    C2630h f8386e;
    @Inject
    /* renamed from: f */
    ManagerAnalytics f8387f;
    @Inject
    /* renamed from: g */
    C2634g f8388g;
    @Inject
    /* renamed from: h */
    C15192e f8389h;
    @Inject
    /* renamed from: i */
    OfferRepository f8390i;
    @Inject
    /* renamed from: j */
    NotifyPushServer f8391j;
    @Inject
    /* renamed from: k */
    C14552c f8392k;
    @Nullable
    /* renamed from: p */
    private WeakReference<LifeCycleHelperInterface> f8393p;
    @Nullable
    /* renamed from: q */
    private Subscription f8394q;

    public interface LifeCycleHelperInterface {
        void onAppClosed();

        void onAppOpen();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    /* renamed from: a */
    public static synchronized AppLifeCycleTracker m10173a(@Nullable LifeCycleHelperInterface lifeCycleHelperInterface) {
        synchronized (AppLifeCycleTracker.class) {
            if (f8382r == null) {
                f8382r = new AppLifeCycleTracker(lifeCycleHelperInterface);
            }
            lifeCycleHelperInterface = f8382r;
        }
        return lifeCycleHelperInterface;
    }

    /* renamed from: b */
    public static synchronized void m10174b(@Nullable LifeCycleHelperInterface lifeCycleHelperInterface) {
        synchronized (AppLifeCycleTracker.class) {
            f8382r = new AppLifeCycleTracker(lifeCycleHelperInterface);
        }
    }

    private AppLifeCycleTracker() {
    }

    private AppLifeCycleTracker(@Nullable LifeCycleHelperInterface lifeCycleHelperInterface) {
        if (lifeCycleHelperInterface == null) {
            throw new IllegalArgumentException("LifeCycleHelperInterface cannot be null in constructor");
        }
        ManagerApp.m14858e().inject(this);
        this.f8393p = new WeakReference(lifeCycleHelperInterface);
        f8381o = new AppLifeCycleTracker$b(new C17230f(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m10180b() {
        m10179a(false);
        this.f8386e.m9862c();
        if (C15374w.a(this.f8393p)) {
            ((LifeCycleHelperInterface) this.f8393p.get()).onAppClosed();
        }
    }

    /* renamed from: a */
    public void m10177a() {
        m10175b(false);
    }

    /* renamed from: b */
    private void m10175b(boolean z) {
        if (z || !(this.f8384c.m14899d() == -100000.0d || this.f8384c.m14900e() == -100000.0d)) {
            if (!f8380n) {
                this.f8391j.a(NotifyReason.APP_OPENED);
                ad.m10190a("Logging App.Open");
                z = new StringBuilder();
                z.append("App.Open Latitude: ");
                z.append(this.f8384c.m14899d());
                ad.m10190a(z.toString());
                z = new StringBuilder();
                z.append("App.Open Longitude: ");
                z.append(this.f8384c.m14900e());
                ad.m10190a(z.toString());
                z = new SparksEvent("App.Open");
                z.put("resume", f8378l);
                f8378l = true;
                z.put("pushEnabled", this.f8392k.a());
                if (ManagerDeepLinking.c()) {
                    this.f8385d.a(z);
                } else {
                    this.f8385d.b(z);
                    z.put("registered", this.f8383b.m10128d());
                    this.f8387f.a(z);
                }
                this.f8388g.m9884c();
                this.f8388g.m9874a();
                ad.m10190a("Was app closed = false");
                f8380n = true;
            }
            return;
        }
        ad.m10190a("Not logging App.Open, location not set.");
    }

    /* renamed from: a */
    public void m10179a(boolean z) {
        m10175b(true);
        ad.m10190a("was app closed = true");
        f8379m = true;
        f8380n = false;
        this.f8388g.m9884c();
        this.f8388g.m9874a();
    }

    public void onActivityResumed(Activity activity) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Activity resumed: ");
        stringBuilder.append(activity.getClass().getSimpleName());
        ad.m10190a(stringBuilder.toString());
        f8377a = true;
        f8381o.b();
        if (f8379m) {
            if (C15374w.a(this.f8393p)) {
                ((LifeCycleHelperInterface) this.f8393p.get()).onAppOpen();
                this.f8394q = this.f8390i.observeOffers(ProductType.PLUS).f(new C18285g(this)).h().a(RxUtils.m10183a()).a(new C18990h(this, activity), C18991i.f58744a);
            }
            f8379m = null;
        }
        if (f8380n == null && this.f8383b.m10128d() != null) {
            m10177a();
        }
    }

    /* renamed from: a */
    final /* synthetic */ Boolean m10176a(List list) {
        if (C2641a.m9991a((Collection) list) != null) {
            return Boolean.valueOf(null);
        }
        return Boolean.valueOf(this.f8389h.a());
    }

    /* renamed from: a */
    final /* synthetic */ void m10178a(Activity activity, List list) {
        if (this.f8389h.a() != null) {
            C10076o.a(PlusPaywallSource.DISCOUNT_AVAILABLE).a(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Activity paused: ");
        stringBuilder.append(activity.getClass().getSimpleName());
        ad.m10190a(stringBuilder.toString());
        RxUtils.m10188b(this.f8394q);
        this.f8394q = null;
        f8377a = null;
        f8381o.a();
    }
}
