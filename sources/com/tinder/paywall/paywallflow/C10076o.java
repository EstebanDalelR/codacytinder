package com.tinder.paywall.paywallflow;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.managers.ManagerApp;
import com.tinder.paywall.legacy.PaywallFlowFailureListener;
import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.paywallflow.C12272b.C12271a;
import com.tinder.profile.p365d.C14398a;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.jvm.functions.Function0;

/* renamed from: com.tinder.paywall.paywallflow.o */
public class C10076o {
    @Inject
    /* renamed from: a */
    C10079r f32961a;
    @NonNull
    /* renamed from: b */
    private final C10073a f32962b;

    /* renamed from: com.tinder.paywall.paywallflow.o$a */
    public static abstract class C10074a {

        /* renamed from: com.tinder.paywall.paywallflow.o$a$a */
        public static abstract class C10073a {
            /* renamed from: a */
            public abstract C10073a mo10711a(PaywallFlowFailureListener paywallFlowFailureListener);

            /* renamed from: a */
            public abstract C10073a mo10712a(PaywallFlowSuccessListener paywallFlowSuccessListener);

            /* renamed from: a */
            public abstract C10073a mo10713a(PaywallTypeSource paywallTypeSource);

            /* renamed from: a */
            public abstract C10073a mo10714a(C10075b c10075b);

            /* renamed from: a */
            public abstract C10073a mo10715a(List<Integer> list);

            /* renamed from: a */
            public abstract C10073a mo10716a(Function0<C15813i> function0);

            /* renamed from: a */
            public abstract C10074a mo10717a();

            /* renamed from: b */
            public abstract C10073a mo10718b(List<String> list);

            /* renamed from: b */
            public abstract C10073a mo10719b(Function0<C15813i> function0);
        }

        @NonNull
        /* renamed from: a */
        public abstract PaywallTypeSource mo10720a();

        @NonNull
        /* renamed from: b */
        public abstract List<Integer> mo10721b();

        @Nullable
        /* renamed from: c */
        public abstract List<String> mo10722c();

        @Nullable
        /* renamed from: d */
        public abstract C10075b mo10723d();

        @Nullable
        /* renamed from: e */
        public abstract Function0<C15813i> mo10724e();

        @Nullable
        /* renamed from: f */
        public abstract Function0<C15813i> mo10725f();

        @Nullable
        /* renamed from: g */
        public abstract PaywallFlowSuccessListener mo10726g();

        @Nullable
        /* renamed from: h */
        public abstract PaywallFlowFailureListener mo10727h();

        /* renamed from: i */
        public static C10073a m41155i() {
            return new C12271a().mo10715a(Collections.emptyList());
        }
    }

    /* renamed from: com.tinder.paywall.paywallflow.o$b */
    public static abstract class C10075b {
        /* renamed from: a */
        public abstract String mo10728a();

        /* renamed from: b */
        public abstract String mo10729b();

        /* renamed from: a */
        public static C10075b m41164a(String str, String str2) {
            return new C12273c(str, str2);
        }
    }

    /* renamed from: a */
    public static C10076o m41167a(PaywallTypeSource paywallTypeSource) {
        return new C10076o(paywallTypeSource);
    }

    private C10076o(@NonNull PaywallTypeSource paywallTypeSource) {
        this.f32962b = C10074a.m41155i().mo10713a(paywallTypeSource);
        ManagerApp.e().inject(this);
    }

    @NonNull
    /* renamed from: a */
    public C10074a m41168a() {
        return this.f32962b.mo10717a();
    }

    @NonNull
    /* renamed from: a */
    public C10076o m41172a(@NonNull List<Integer> list) {
        this.f32962b.mo10715a((List) list);
        return this;
    }

    @NonNull
    /* renamed from: a */
    public C10076o m41173a(@NonNull Function0<C15813i> function0) {
        this.f32962b.mo10716a((Function0) function0);
        return this;
    }

    @NonNull
    /* renamed from: b */
    C10076o m41177b(@NonNull Function0<C15813i> function0) {
        this.f32962b.mo10719b((Function0) function0);
        return this;
    }

    @NonNull
    /* renamed from: a */
    public C10076o m41171a(@NonNull C10075b c10075b) {
        this.f32962b.mo10714a(c10075b);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public C10076o m41176b(@NonNull List<String> list) {
        this.f32962b.mo10718b((List) list);
        return this;
    }

    @NonNull
    /* renamed from: a */
    public C10076o m41170a(@NonNull PaywallFlowSuccessListener paywallFlowSuccessListener) {
        this.f32962b.mo10712a(paywallFlowSuccessListener);
        return this;
    }

    @NonNull
    /* renamed from: a */
    public C10076o m41169a(@NonNull PaywallFlowFailureListener paywallFlowFailureListener) {
        this.f32962b.mo10711a(paywallFlowFailureListener);
        return this;
    }

    /* renamed from: a */
    public void m41175a(Context context) {
        context = C14398a.a(context);
        if (context != null && (context instanceof Activity)) {
            m41174a((Activity) context);
        }
    }

    /* renamed from: a */
    public void m41174a(Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            this.f32961a.m41190a(this, activity);
        }
    }
}
