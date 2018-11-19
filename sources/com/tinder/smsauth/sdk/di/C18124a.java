package com.tinder.smsauth.sdk.di;

import android.app.Activity;
import android.arch.lifecycle.C0029n;
import android.arch.lifecycle.LifecycleObserver;
import android.content.Context;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.GoogleApiClient;
import com.tinder.common.p194f.C12778b;
import com.tinder.smsauth.core.C14964a;
import com.tinder.smsauth.core.C18084b;
import com.tinder.smsauth.core.C18085d;
import com.tinder.smsauth.domain.usecase.C18093b;
import com.tinder.smsauth.domain.usecase.C18095d;
import com.tinder.smsauth.domain.usecase.C18096e;
import com.tinder.smsauth.domain.usecase.C18097f;
import com.tinder.smsauth.domain.usecase.C18098g;
import com.tinder.smsauth.domain.usecase.C18099h;
import com.tinder.smsauth.domain.usecase.C18101j;
import com.tinder.smsauth.domain.usecase.C18103m;
import com.tinder.smsauth.domain.usecase.C18105o;
import com.tinder.smsauth.domain.usecase.C18107q;
import com.tinder.smsauth.domain.usecase.C18109s;
import com.tinder.smsauth.domain.usecase.C18111u;
import com.tinder.smsauth.domain.usecase.C18113w;
import com.tinder.smsauth.entity.SmsAuthRepository;
import com.tinder.smsauth.sdk.GooglePhoneNumberCollector;
import com.tinder.smsauth.sdk.analytics.SmsAuthAnalyticsWorker;
import com.tinder.smsauth.sdk.analytics.SmsAuthTracker;
import com.tinder.smsauth.sdk.di.C14988xcb25492d.OneTimePasswordCollectionFragmentSubcomponent;
import com.tinder.smsauth.sdk.di.C14988xcb25492d.OneTimePasswordCollectionFragmentSubcomponent.C18117a;
import com.tinder.smsauth.sdk.di.SmsAuthActivityModule_SmsAuthActivity.SmsAuthActivitySubcomponent;
import com.tinder.smsauth.sdk.di.SmsAuthActivityModule_SmsAuthActivity.SmsAuthActivitySubcomponent.C18114a;
import com.tinder.smsauth.sdk.di.SmsAuthComponent.Parent;
import com.tinder.smsauth.sdk.di.SmsAuthFragmentModule_ContributeCountryCodeSelectionFragment.CountryCodeSelectionFragmentSubcomponent;
import com.tinder.smsauth.sdk.di.SmsAuthFragmentModule_ContributeCountryCodeSelectionFragment.CountryCodeSelectionFragmentSubcomponent.C18115a;
import com.tinder.smsauth.sdk.di.SmsAuthFragmentModule_ContributeErrorFragment.ErrorFragmentSubcomponent;
import com.tinder.smsauth.sdk.di.SmsAuthFragmentModule_ContributeErrorFragment.ErrorFragmentSubcomponent.C18116a;
import com.tinder.smsauth.sdk.di.SmsAuthFragmentModule_ContributePhoneNumberCollectionFragment.PhoneNumberCollectionFragmentSubcomponent;
import com.tinder.smsauth.sdk.di.SmsAuthFragmentModule_ContributePhoneNumberCollectionFragment.PhoneNumberCollectionFragmentSubcomponent.C18118a;
import com.tinder.smsauth.sdk.reader.C18135b;
import com.tinder.smsauth.ui.C16776b;
import com.tinder.smsauth.ui.C16779d;
import com.tinder.smsauth.ui.C16782f;
import com.tinder.smsauth.ui.C16786j;
import com.tinder.smsauth.ui.C16787l;
import com.tinder.smsauth.ui.C18136a;
import com.tinder.smsauth.ui.C18137c;
import com.tinder.smsauth.ui.C18138e;
import com.tinder.smsauth.ui.C18141i;
import com.tinder.smsauth.ui.SmsAuthActivity;
import com.tinder.smsauth.ui.SmsAuthViewModelFactory;
import com.tinder.smsauth.ui.viewmodel.C18142a;
import com.tinder.smsauth.ui.viewmodel.C18143b;
import com.tinder.smsauth.ui.viewmodel.C18144c;
import com.tinder.smsauth.ui.viewmodel.C18145d;
import com.tinder.smsauth.ui.viewmodel.C18146e;
import com.tinder.smsauth.ui.viewmodel.CountryCodeSelectionViewModel;
import com.tinder.smsauth.ui.viewmodel.ErrorViewModel;
import com.tinder.smsauth.ui.viewmodel.OneTimePasswordCollectionViewModel;
import com.tinder.smsauth.ui.viewmodel.PhoneNumberCollectionViewModel;
import com.tinder.smsauth.ui.viewmodel.SmsAuthNavigationViewModel;
import dagger.android.AndroidInjector;
import dagger.android.AndroidInjector$Factory;
import dagger.android.C18315c;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.C15515e;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.C18319g;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.sdk.di.a */
public final class C18124a implements SmsAuthComponent {
    /* renamed from: A */
    private C18129l f56218A;
    /* renamed from: B */
    private C18095d f56219B;
    /* renamed from: C */
    private C18142a f56220C;
    /* renamed from: D */
    private Provider<C0029n> f56221D;
    /* renamed from: E */
    private C18143b f56222E;
    /* renamed from: F */
    private Provider<Map<Class<? extends C0029n>, Provider<C0029n>>> f56223F;
    /* renamed from: G */
    private Provider<C18127f> f56224G;
    /* renamed from: a */
    private Parent f56225a;
    /* renamed from: b */
    private C14996k f56226b;
    /* renamed from: c */
    private Provider<C18114a> f56227c;
    /* renamed from: d */
    private C18132o f56228d;
    /* renamed from: e */
    private C18130m f56229e;
    /* renamed from: f */
    private C18133p f56230f;
    /* renamed from: g */
    private C18131n f56231g;
    /* renamed from: h */
    private C18085d f56232h;
    /* renamed from: i */
    private C16760e f56233i;
    /* renamed from: j */
    private C18134q f56234j;
    /* renamed from: k */
    private Provider<C14964a> f56235k;
    /* renamed from: l */
    private C18093b f56236l;
    /* renamed from: m */
    private C18099h f56237m;
    /* renamed from: n */
    private C18097f f56238n;
    /* renamed from: o */
    private C18146e f56239o;
    /* renamed from: p */
    private C18105o f56240p;
    /* renamed from: q */
    private C18113w f56241q;
    /* renamed from: r */
    private C18101j f56242r;
    /* renamed from: s */
    private C18145d f56243s;
    /* renamed from: t */
    private C18111u f56244t;
    /* renamed from: u */
    private C18107q f56245u;
    /* renamed from: v */
    private C16759d f56246v;
    /* renamed from: w */
    private C18135b f56247w;
    /* renamed from: x */
    private C18103m f56248x;
    /* renamed from: y */
    private C18144c f56249y;
    /* renamed from: z */
    private C18109s f56250z;

    /* renamed from: com.tinder.smsauth.sdk.di.a$a */
    public static final class C14989a {
        /* renamed from: a */
        private C14996k f46768a;
        /* renamed from: b */
        private Parent f46769b;

        private C14989a() {
        }

        /* renamed from: a */
        public SmsAuthComponent m56596a() {
            if (this.f46768a == null) {
                this.f46768a = new C14996k();
            }
            if (this.f46769b != null) {
                return new C18124a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Parent.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C14989a m56597a(Parent parent) {
            this.f46769b = (Parent) C15521i.m58000a(parent);
            return this;
        }
    }

    /* renamed from: com.tinder.smsauth.sdk.di.a$1 */
    class C167541 implements Provider<C18114a> {
        /* renamed from: a */
        final /* synthetic */ C18124a f51767a;

        C167541(C18124a c18124a) {
            this.f51767a = c18124a;
        }

        public /* synthetic */ Object get() {
            return m62274a();
        }

        /* renamed from: a */
        public C18114a m62274a() {
            return new C18896b();
        }
    }

    /* renamed from: com.tinder.smsauth.sdk.di.a$d */
    private static class C16759d implements Provider<Context> {
        /* renamed from: a */
        private final Parent f51772a;

        public /* synthetic */ Object get() {
            return m62279a();
        }

        C16759d(Parent parent) {
            this.f51772a = parent;
        }

        /* renamed from: a */
        public Context m62279a() {
            return (Context) C15521i.m58001a(this.f51772a.context(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: com.tinder.smsauth.sdk.di.a$e */
    private static class C16760e implements Provider<SmsAuthRepository> {
        /* renamed from: a */
        private final Parent f51773a;

        public /* synthetic */ Object get() {
            return m62280a();
        }

        C16760e(Parent parent) {
            this.f51773a = parent;
        }

        /* renamed from: a */
        public SmsAuthRepository m62280a() {
            return (SmsAuthRepository) C15521i.m58001a(this.f51773a.smsAuthRepository(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: com.tinder.smsauth.sdk.di.a$c */
    private final class C18123c implements SmsAuthActivitySubcomponent {
        /* renamed from: a */
        final /* synthetic */ C18124a f56213a;
        /* renamed from: b */
        private Provider<C18118a> f56214b;
        /* renamed from: c */
        private Provider<C18117a> f56215c;
        /* renamed from: d */
        private Provider<C18115a> f56216d;
        /* renamed from: e */
        private Provider<C18116a> f56217e;

        /* renamed from: com.tinder.smsauth.sdk.di.a$c$1 */
        class C167551 implements Provider<C18118a> {
            /* renamed from: a */
            final /* synthetic */ C18123c f51768a;

            C167551(C18123c c18123c) {
                this.f51768a = c18123c;
            }

            public /* synthetic */ Object get() {
                return m62275a();
            }

            /* renamed from: a */
            public C18118a m62275a() {
                return new C18900g();
            }
        }

        /* renamed from: com.tinder.smsauth.sdk.di.a$c$2 */
        class C167562 implements Provider<C18117a> {
            /* renamed from: a */
            final /* synthetic */ C18123c f51769a;

            C167562(C18123c c18123c) {
                this.f51769a = c18123c;
            }

            public /* synthetic */ Object get() {
                return m62276a();
            }

            /* renamed from: a */
            public C18117a m62276a() {
                return new C18899e();
            }
        }

        /* renamed from: com.tinder.smsauth.sdk.di.a$c$3 */
        class C167573 implements Provider<C18115a> {
            /* renamed from: a */
            final /* synthetic */ C18123c f51770a;

            C167573(C18123c c18123c) {
                this.f51770a = c18123c;
            }

            public /* synthetic */ Object get() {
                return m62277a();
            }

            /* renamed from: a */
            public C18115a m62277a() {
                return new C18897a();
            }
        }

        /* renamed from: com.tinder.smsauth.sdk.di.a$c$4 */
        class C167584 implements Provider<C18116a> {
            /* renamed from: a */
            final /* synthetic */ C18123c f51771a;

            C167584(C18123c c18123c) {
                this.f51771a = c18123c;
            }

            public /* synthetic */ Object get() {
                return m62278a();
            }

            /* renamed from: a */
            public C18116a m62278a() {
                return new C18898c();
            }
        }

        /* renamed from: com.tinder.smsauth.sdk.di.a$c$b */
        private final class C18119b implements CountryCodeSelectionFragmentSubcomponent {
            /* renamed from: a */
            final /* synthetic */ C18123c f56209a;

            public /* synthetic */ void inject(Object obj) {
                m65733a((C18136a) obj);
            }

            private C18119b(C18123c c18123c, C18897a c18897a) {
                this.f56209a = c18123c;
            }

            /* renamed from: a */
            public void m65733a(C18136a c18136a) {
                m65732b(c18136a);
            }

            /* renamed from: b */
            private C18136a m65732b(C18136a c18136a) {
                C16776b.m62297a(c18136a, (SmsAuthViewModelFactory) this.f56209a.f56213a.f56224G.get());
                return c18136a;
            }
        }

        /* renamed from: com.tinder.smsauth.sdk.di.a$c$d */
        private final class C18120d implements ErrorFragmentSubcomponent {
            /* renamed from: a */
            final /* synthetic */ C18123c f56210a;

            public /* synthetic */ void inject(Object obj) {
                m65735a((C18137c) obj);
            }

            private C18120d(C18123c c18123c, C18898c c18898c) {
                this.f56210a = c18123c;
            }

            /* renamed from: a */
            public void m65735a(C18137c c18137c) {
                m65734b(c18137c);
            }

            /* renamed from: b */
            private C18137c m65734b(C18137c c18137c) {
                C16779d.m62300a(c18137c, (SmsAuthViewModelFactory) this.f56210a.f56213a.f56224G.get());
                return c18137c;
            }
        }

        /* renamed from: com.tinder.smsauth.sdk.di.a$c$f */
        private final class C18121f implements OneTimePasswordCollectionFragmentSubcomponent {
            /* renamed from: a */
            final /* synthetic */ C18123c f56211a;

            public /* synthetic */ void inject(Object obj) {
                m65737a((C18138e) obj);
            }

            private C18121f(C18123c c18123c, C18899e c18899e) {
                this.f56211a = c18123c;
            }

            /* renamed from: a */
            public void m65737a(C18138e c18138e) {
                m65736b(c18138e);
            }

            /* renamed from: b */
            private C18138e m65736b(C18138e c18138e) {
                C16782f.m62304a(c18138e, (SmsAuthViewModelFactory) this.f56211a.f56213a.f56224G.get());
                C16782f.m62303a(c18138e, C18130m.m65782c(this.f56211a.f56213a.f56226b));
                return c18138e;
            }
        }

        /* renamed from: com.tinder.smsauth.sdk.di.a$c$h */
        private final class C18122h implements PhoneNumberCollectionFragmentSubcomponent {
            /* renamed from: a */
            final /* synthetic */ C18123c f56212a;

            public /* synthetic */ void inject(Object obj) {
                m65740a((C18141i) obj);
            }

            private C18122h(C18123c c18123c, C18900g c18900g) {
                this.f56212a = c18123c;
            }

            /* renamed from: a */
            private GooglePhoneNumberCollector m65738a() {
                return new GooglePhoneNumberCollector(this.f56212a.m65748e());
            }

            /* renamed from: a */
            public void m65740a(C18141i c18141i) {
                m65739b(c18141i);
            }

            /* renamed from: b */
            private C18141i m65739b(C18141i c18141i) {
                C16786j.m62308a(c18141i, C18130m.m65782c(this.f56212a.f56213a.f56226b));
                C16786j.m62310a(c18141i, (SmsAuthViewModelFactory) this.f56212a.f56213a.f56224G.get());
                C16786j.m62309a(c18141i, m65738a());
                return c18141i;
            }
        }

        /* renamed from: com.tinder.smsauth.sdk.di.a$c$a */
        private final class C18897a extends C18115a {
            /* renamed from: a */
            final /* synthetic */ C18123c f58533a;
            /* renamed from: b */
            private C18136a f58534b;

            private C18897a(C18123c c18123c) {
                this.f58533a = c18123c;
            }

            /* renamed from: b */
            public /* synthetic */ AndroidInjector mo13977b() {
                return m67364a();
            }

            /* renamed from: a */
            public CountryCodeSelectionFragmentSubcomponent m67364a() {
                if (this.f58534b != null) {
                    return new C18119b(this);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(C18136a.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            }

            /* renamed from: a */
            public void m67365a(C18136a c18136a) {
                this.f58534b = (C18136a) C15521i.m58000a(c18136a);
            }
        }

        /* renamed from: com.tinder.smsauth.sdk.di.a$c$c */
        private final class C18898c extends C18116a {
            /* renamed from: a */
            final /* synthetic */ C18123c f58535a;
            /* renamed from: b */
            private C18137c f58536b;

            private C18898c(C18123c c18123c) {
                this.f58535a = c18123c;
            }

            /* renamed from: b */
            public /* synthetic */ AndroidInjector mo13977b() {
                return m67368a();
            }

            /* renamed from: a */
            public ErrorFragmentSubcomponent m67368a() {
                if (this.f58536b != null) {
                    return new C18120d(this);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(C18137c.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            }

            /* renamed from: a */
            public void m67369a(C18137c c18137c) {
                this.f58536b = (C18137c) C15521i.m58000a(c18137c);
            }
        }

        /* renamed from: com.tinder.smsauth.sdk.di.a$c$e */
        private final class C18899e extends C18117a {
            /* renamed from: a */
            final /* synthetic */ C18123c f58537a;
            /* renamed from: b */
            private C18138e f58538b;

            private C18899e(C18123c c18123c) {
                this.f58537a = c18123c;
            }

            /* renamed from: b */
            public /* synthetic */ AndroidInjector mo13977b() {
                return m67372a();
            }

            /* renamed from: a */
            public OneTimePasswordCollectionFragmentSubcomponent m67372a() {
                if (this.f58538b != null) {
                    return new C18121f(this);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(C18138e.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            }

            /* renamed from: a */
            public void m67373a(C18138e c18138e) {
                this.f58538b = (C18138e) C15521i.m58000a(c18138e);
            }
        }

        /* renamed from: com.tinder.smsauth.sdk.di.a$c$g */
        private final class C18900g extends C18118a {
            /* renamed from: a */
            final /* synthetic */ C18123c f58539a;
            /* renamed from: b */
            private C18141i f58540b;

            private C18900g(C18123c c18123c) {
                this.f58539a = c18123c;
            }

            /* renamed from: b */
            public /* synthetic */ AndroidInjector mo13977b() {
                return m67376a();
            }

            /* renamed from: a */
            public PhoneNumberCollectionFragmentSubcomponent m67376a() {
                if (this.f58540b != null) {
                    return new C18122h(this);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(C18141i.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            }

            /* renamed from: a */
            public void m67377a(C18141i c18141i) {
                this.f58540b = (C18141i) C15521i.m58000a(c18141i);
            }
        }

        public /* synthetic */ void inject(Object obj) {
            m65749a((SmsAuthActivity) obj);
        }

        private C18123c(C18124a c18124a, C18896b c18896b) {
            this.f56213a = c18124a;
            m65743a(c18896b);
        }

        /* renamed from: a */
        private Map<Class<? extends Fragment>, Provider<AndroidInjector$Factory<? extends Fragment>>> m65742a() {
            return C15515e.m57993a(4).m57994a(C18141i.class, this.f56214b).m57994a(C18138e.class, this.f56215c).m57994a(C18136a.class, this.f56216d).m57994a(C18137c.class, this.f56217e).m57995a();
        }

        /* renamed from: b */
        private DispatchingAndroidInjector<Fragment> m65745b() {
            return C18315c.m66327a(m65742a());
        }

        /* renamed from: c */
        private SmsAuthAnalyticsWorker m65746c() {
            return new SmsAuthAnalyticsWorker(this.f56213a.m65757d(), this.f56213a.m65759e(), (SmsAuthTracker) C15521i.m58001a(this.f56213a.f56225a.smsAuthTracker(), "Cannot return null from a non-@Nullable component method"), C18134q.m65798c(this.f56213a.f56226b), C18130m.m65782c(this.f56213a.f56226b));
        }

        /* renamed from: d */
        private Set<LifecycleObserver> m65747d() {
            return Collections.singleton(m65746c());
        }

        /* renamed from: e */
        private GoogleApiClient m65748e() {
            return C18126e.m65770a((Context) C15521i.m58001a(this.f56213a.f56225a.context(), "Cannot return null from a non-@Nullable component method"));
        }

        /* renamed from: a */
        private void m65743a(C18896b c18896b) {
            this.f56214b = new C167551(this);
            this.f56215c = new C167562(this);
            this.f56216d = new C167573(this);
            this.f56217e = new C167584(this);
        }

        /* renamed from: a */
        public void m65749a(SmsAuthActivity smsAuthActivity) {
            m65744b(smsAuthActivity);
        }

        /* renamed from: b */
        private SmsAuthActivity m65744b(SmsAuthActivity smsAuthActivity) {
            C16787l.m62313a(smsAuthActivity, m65745b());
            C16787l.m62312a(smsAuthActivity, (SmsAuthViewModelFactory) this.f56213a.f56224G.get());
            C16787l.m62314a(smsAuthActivity, m65747d());
            return smsAuthActivity;
        }
    }

    /* renamed from: com.tinder.smsauth.sdk.di.a$b */
    private final class C18896b extends C18114a {
        /* renamed from: a */
        final /* synthetic */ C18124a f58531a;
        /* renamed from: b */
        private SmsAuthActivity f58532b;

        private C18896b(C18124a c18124a) {
            this.f58531a = c18124a;
        }

        /* renamed from: b */
        public /* synthetic */ AndroidInjector mo13977b() {
            return m67360a();
        }

        /* renamed from: a */
        public SmsAuthActivitySubcomponent m67360a() {
            if (this.f58532b != null) {
                return new C18123c(this);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SmsAuthActivity.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public void m67361a(SmsAuthActivity smsAuthActivity) {
            this.f58532b = (SmsAuthActivity) C15521i.m58000a(smsAuthActivity);
        }
    }

    private C18124a(C14989a c14989a) {
        m65752a(c14989a);
    }

    /* renamed from: a */
    public static C14989a m65751a() {
        return new C14989a();
    }

    /* renamed from: b */
    private Map<Class<? extends Activity>, Provider<AndroidInjector$Factory<? extends Activity>>> m65754b() {
        return Collections.singletonMap(SmsAuthActivity.class, this.f56227c);
    }

    /* renamed from: c */
    private DispatchingAndroidInjector<Activity> m65756c() {
        return C18315c.m66327a(m65754b());
    }

    /* renamed from: d */
    private C18098g m65757d() {
        return new C18098g((C14964a) this.f56235k.get());
    }

    /* renamed from: e */
    private C18096e m65759e() {
        return new C18096e((C14964a) this.f56235k.get());
    }

    /* renamed from: a */
    private void m65752a(C14989a c14989a) {
        this.f56227c = new C167541(this);
        this.f56228d = C18132o.m65789b(c14989a.f46768a);
        this.f56229e = C18130m.m65781b(c14989a.f46768a);
        this.f56230f = C18133p.m65794b(c14989a.f46768a, this.f56228d, C12778b.c(), this.f56229e);
        this.f56231g = C18131n.m65785b(c14989a.f46768a);
        this.f56232h = C18085d.m65666b(this.f56230f, this.f56231g);
        this.f56233i = new C16760e(c14989a.f46769b);
        this.f56234j = C18134q.m65797b(c14989a.f46768a);
        this.f56235k = C17281c.m63229a(C18084b.m65663b(this.f56232h, this.f56233i, this.f56234j, this.f56229e));
        this.f56236l = C18093b.m65688b(this.f56235k);
        this.f56237m = C18099h.m65700b(this.f56235k);
        this.f56238n = C18097f.m65696b(this.f56235k);
        this.f56239o = C18146e.m65841b(this.f56236l, this.f56237m, this.f56238n);
        this.f56240p = C18105o.m65714b(this.f56235k);
        this.f56241q = C18113w.m65730b(this.f56235k);
        this.f56242r = C18101j.m65704b(this.f56235k);
        this.f56243s = C18145d.m65838b(this.f56240p, this.f56241q, this.f56242r, this.f56237m);
        this.f56244t = C18111u.m65726b(this.f56235k);
        this.f56245u = C18107q.m65718b(this.f56235k);
        this.f56246v = new C16759d(c14989a.f46769b);
        this.f56247w = C18135b.m65801b(this.f56246v, this.f56229e);
        this.f56248x = C18103m.m65710b(this.f56247w);
        this.f56249y = C18144c.m65835b(this.f56244t, this.f56242r, this.f56245u, this.f56229e, this.f56237m, this.f56248x);
        this.f56250z = C18109s.m65722b(this.f56235k);
        this.f56218A = C18129l.m65778b(c14989a.f46768a, this.f56228d, C12778b.c());
        this.f56219B = C18095d.m65692b(this.f56218A);
        this.f56220C = C18142a.m65829b(this.f56250z, this.f56219B, this.f56234j, this.f56229e);
        this.f56221D = C17281c.m63229a(this.f56220C);
        this.f56222E = C18143b.m65832b(this.f56236l, this.f56237m);
        this.f56223F = C18319g.m66334a(5).m57998a(SmsAuthNavigationViewModel.class, this.f56239o).m57998a(PhoneNumberCollectionViewModel.class, this.f56243s).m57998a(OneTimePasswordCollectionViewModel.class, this.f56249y).m57998a(CountryCodeSelectionViewModel.class, this.f56221D).m57998a(ErrorViewModel.class, this.f56222E).m57999a();
        this.f56224G = C17281c.m63229a(C18128g.m65774b(this.f56223F));
        this.f56225a = c14989a.f46769b;
        this.f56226b = c14989a.f46768a;
    }

    public AndroidInjector<Activity> activityInjector() {
        return m65756c();
    }
}
