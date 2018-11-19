package com.tinder.paywall.paywallflow;

import android.app.Activity;
import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.boost.dialog.BoostPaywallDialog;
import com.tinder.fastmatch.view.TinderGoldPaywallDialog.C9413a;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o.C10074a;
import com.tinder.paywall.paywallflow.C10076o.C10075b;
import com.tinder.paywall.paywallflow.C12268a.C12267a;
import com.tinder.paywall.viewmodels.C10083b;
import com.tinder.superlike.dialog.SuperlikePaywallDialog;
import com.tinder.tinderplus.dialog.TinderPlusPaywallDialog.C15203a;
import com.tinder.toppicks.dialog.TopPicksPaywallDialog;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C15813i;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.subjects.PublishSubject;

@Singleton
/* renamed from: com.tinder.paywall.paywallflow.h */
public class C10072h {
    /* renamed from: a */
    private final C10083b f32960a;

    /* renamed from: com.tinder.paywall.paywallflow.h$a */
    public static abstract class C10071a {

        /* renamed from: com.tinder.paywall.paywallflow.h$a$a */
        public static abstract class C10070a {
            /* renamed from: a */
            public abstract C10070a mo10704a(Dialog dialog);

            /* renamed from: a */
            public abstract C10070a mo10705a(Observable<String> observable);

            /* renamed from: a */
            public abstract C10071a mo10706a();
        }

        /* renamed from: a */
        public abstract Dialog mo10707a();

        /* renamed from: b */
        public abstract Observable<String> mo10708b();

        /* renamed from: c */
        public static C10070a m41137c() {
            return new C12267a();
        }
    }

    @Inject
    public C10072h(C10083b c10083b) {
        this.f32960a = c10083b;
    }

    @NonNull
    /* renamed from: a */
    public C10071a m41145a(Activity activity, C10074a c10074a) {
        PaywallTypeSource a = c10074a.mo10720a();
        C10075b d = c10074a.mo10723d();
        List b = c10074a.mo10721b();
        switch (a.getProductType()) {
            case PLUS:
                return m41143a(activity, a, b, c10074a.mo10723d());
            case BOOST:
                return m41140a(activity, a);
            case SUPERLIKE:
                return m41141a(activity, a, d);
            case GOLD:
                return m41142a(activity, a, c10074a.mo10722c());
            case TOP_PICKS:
                return m41144a(activity, a, c10074a.mo10724e(), c10074a.mo10725f());
            default:
                throw new IllegalArgumentException("Unsupported ProductType");
        }
    }

    @NonNull
    /* renamed from: a */
    private C10071a m41143a(Activity activity, PaywallTypeSource paywallTypeSource, @Nullable List<Integer> list, @Nullable C10075b c10075b) {
        PublishSubject w = PublishSubject.w();
        activity = new C15203a(activity).a(paywallTypeSource.getAnalyticsSource()).a(this.f32960a.m41200a(paywallTypeSource)).a(list).a(paywallTypeSource == PlusPaywallSource.DISCOUNT_NOTIFICATION ? true : null);
        w.getClass();
        activity = activity.a(C12275i.m48494a(w));
        if (c10075b != null) {
            activity.a(c10075b);
        }
        return C10071a.m41137c().mo10704a(activity.a()).mo10705a(w.e()).mo10706a();
    }

    @NonNull
    /* renamed from: a */
    private C10071a m41144a(Activity activity, PaywallTypeSource paywallTypeSource, Function0<C15813i> function0, Function0<C15813i> function02) {
        PublishSubject w = PublishSubject.w();
        paywallTypeSource = paywallTypeSource.getAnalyticsSource();
        w.getClass();
        Dialog topPicksPaywallDialog = new TopPicksPaywallDialog(activity, paywallTypeSource, C12276j.m48495a(w));
        if (function0 != null) {
            topPicksPaywallDialog.a(function0);
        }
        if (function02 != null) {
            topPicksPaywallDialog.b(function02);
        }
        return C10071a.m41137c().mo10704a(topPicksPaywallDialog).mo10705a(w.e()).mo10706a();
    }

    @NonNull
    /* renamed from: a */
    private C10071a m41140a(Activity activity, PaywallTypeSource paywallTypeSource) {
        PublishSubject w = PublishSubject.w();
        paywallTypeSource = paywallTypeSource.getAnalyticsSource();
        w.getClass();
        return C10071a.m41137c().mo10704a(new BoostPaywallDialog(activity, paywallTypeSource, C12277k.m48496a(w))).mo10705a(w.e()).mo10706a();
    }

    @NonNull
    /* renamed from: a */
    private C10071a m41141a(Activity activity, PaywallTypeSource paywallTypeSource, @Nullable C10075b c10075b) {
        PublishSubject w = PublishSubject.w();
        paywallTypeSource = paywallTypeSource.getAnalyticsSource();
        w.getClass();
        return C10071a.m41137c().mo10704a(new SuperlikePaywallDialog(activity, paywallTypeSource, C12278l.m48497a(w), c10075b)).mo10705a(w.e()).mo10706a();
    }

    /* renamed from: a */
    private C10071a m41142a(Activity activity, PaywallTypeSource paywallTypeSource, @Nullable List<String> list) {
        PublishSubject w = PublishSubject.w();
        activity = new C9413a(activity, paywallTypeSource.getAnalyticsSource()).m39359a(this.f32960a.m41200a(paywallTypeSource));
        w.getClass();
        activity = activity.m39358a(C12279m.m48498a(w));
        if (list != null && list.size() > null) {
            activity.m39360a((List) list);
        }
        return C10071a.m41137c().mo10704a(activity.m39361a()).mo10705a(w.e()).mo10706a();
    }
}
