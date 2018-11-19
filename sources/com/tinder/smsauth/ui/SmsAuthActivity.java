package com.tinder.smsauth.ui;

import android.arch.lifecycle.C0029n;
import android.arch.lifecycle.C0030o;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.C0405n;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.smsauth.di.Injectable;
import com.tinder.smsauth.entity.C16747a;
import com.tinder.smsauth.entity.C16749e;
import com.tinder.smsauth.entity.Flow.C14972a.C16730f;
import com.tinder.smsauth.entity.Flow.C14974c;
import com.tinder.smsauth.entity.Flow.C14974c.C16739a;
import com.tinder.smsauth.entity.Flow.C14974c.C16740b;
import com.tinder.smsauth.entity.Flow.C14974c.C16741c;
import com.tinder.smsauth.entity.Flow.C14974c.C16742d;
import com.tinder.smsauth.entity.Flow.C14974c.C16743e;
import com.tinder.smsauth.entity.Flow.C14974c.C16744f;
import com.tinder.smsauth.entity.Flow.C14974c.C16745g;
import com.tinder.smsauth.entity.Flow.C14974c.C16746h;
import com.tinder.smsauth.ui.C15008k.C15002a;
import com.tinder.smsauth.ui.C15008k.C15003b;
import com.tinder.smsauth.ui.C15008k.C15005d;
import com.tinder.smsauth.ui.C15008k.C15006e;
import com.tinder.smsauth.ui.C15008k.C15007f;
import com.tinder.smsauth.ui.view.CountryCodeSearchView;
import com.tinder.smsauth.ui.view.CountryCodeSearchView.Listener;
import com.tinder.smsauth.ui.view.p413a.C15030c;
import com.tinder.smsauth.ui.viewmodel.CountryCodeSelectionViewModel;
import com.tinder.smsauth.ui.viewmodel.SmsAuthNavigationViewModel;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;
import java.util.HashMap;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0002J\b\u0010'\u001a\u00020%H\u0016J\u0012\u0010(\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0,H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR)\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u00130\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/tinder/smsauth/ui/SmsAuthActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/tinder/smsauth/di/Injectable;", "Ldagger/android/support/HasSupportFragmentInjector;", "()V", "actionBarColorDrawable", "Landroid/graphics/drawable/ColorDrawable;", "countryCodeSelectionViewModel", "Lcom/tinder/smsauth/ui/viewmodel/CountryCodeSelectionViewModel;", "dispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/support/v4/app/Fragment;", "getDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "lifecycleObservers", "", "Landroid/arch/lifecycle/LifecycleObserver;", "Lkotlin/jvm/JvmSuppressWildcards;", "getLifecycleObservers", "()Ljava/util/Set;", "setLifecycleObservers", "(Ljava/util/Set;)V", "viewModel", "Lcom/tinder/smsauth/ui/viewmodel/SmsAuthNavigationViewModel;", "viewModelFactory", "Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;", "getViewModelFactory", "()Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;", "setViewModelFactory", "(Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;)V", "createResultIntent", "Landroid/content/Intent;", "state", "Lcom/tinder/smsauth/entity/Flow$State$LoginSuccessful;", "navigateToFragment", "", "fragment", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "supportFragmentInjector", "Ldagger/android/AndroidInjector;", "Companion", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class SmsAuthActivity extends AppCompatActivity implements Injectable, HasSupportFragmentInjector {
    /* renamed from: d */
    public static final C14999a f59935d = new C14999a();
    @Inject
    @NotNull
    /* renamed from: a */
    public DispatchingAndroidInjector<Fragment> f59936a;
    @Inject
    @NotNull
    /* renamed from: b */
    public SmsAuthViewModelFactory f59937b;
    @Inject
    @NotNull
    /* renamed from: c */
    public Set<LifecycleObserver> f59938c;
    /* renamed from: e */
    private SmsAuthNavigationViewModel f59939e;
    /* renamed from: f */
    private CountryCodeSelectionViewModel f59940f;
    /* renamed from: g */
    private ColorDrawable f59941g;
    /* renamed from: h */
    private HashMap f59942h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/smsauth/ui/SmsAuthActivity$Companion;", "", "()V", "ACCESS_TOKEN_KEY", "", "ONBOARDING_TOKEN_KEY", "REFRESH_TOKEN_KEY", "newIntent", "Landroid/content/Intent;", "activity", "Landroid/content/Context;", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.SmsAuthActivity$a */
    public static final class C14999a {
        private C14999a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final Intent m56606a(@NotNull Context context) {
            C2668g.b(context, "activity");
            return new Intent(context, SmsAuthActivity.class);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.SmsAuthActivity$b */
    static final class C15000b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SmsAuthActivity f46772a;

        C15000b(SmsAuthActivity smsAuthActivity) {
            this.f46772a = smsAuthActivity;
        }

        public final void onClick(View view) {
            this.f46772a.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/smsauth/entity/Flow$State;", "onChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.SmsAuthActivity$c */
    static final class C16770c<T> implements Observer<C14974c> {
        /* renamed from: a */
        final /* synthetic */ SmsAuthActivity f51787a;

        C16770c(SmsAuthActivity smsAuthActivity) {
            this.f51787a = smsAuthActivity;
        }

        public /* synthetic */ void onChanged(Object obj) {
            m62293a((C14974c) obj);
        }

        /* renamed from: a */
        public final void m62293a(@Nullable C14974c c14974c) {
            if (c14974c == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.smsauth.entity.Flow.State");
            }
            ActionBar supportActionBar = this.f51787a.getSupportActionBar();
            if (supportActionBar == null) {
                C2668g.a();
            }
            boolean z = c14974c instanceof C16744f;
            if (z) {
                supportActionBar.setBackgroundDrawable(SmsAuthActivity.m68607a(this.f51787a));
            } else {
                supportActionBar.setBackgroundDrawable(null);
            }
            if (c14974c instanceof C16740b) {
                this.f51787a.m68608a((Fragment) new C18141i());
            } else if (z) {
                this.f51787a.m68608a((Fragment) new C18136a());
            } else if (c14974c instanceof C16743e) {
                this.f51787a.m68608a((Fragment) new C18139g());
            } else if (c14974c instanceof C16741c) {
                this.f51787a.m68608a((Fragment) new C18137c());
            } else if (c14974c instanceof C16739a) {
                this.f51787a.m68608a((Fragment) new C18138e());
            } else if (c14974c instanceof C16746h) {
                this.f51787a.m68608a((Fragment) new C18140h());
            } else if (c14974c instanceof C16745g) {
                this.f51787a.m68608a((Fragment) new C18137c());
            } else if (c14974c instanceof C16742d) {
                Context context = this.f51787a;
                String string = this.f51787a.getString(C15007f.sms_auth_login_successful);
                C2668g.a(string, "getString(R.string.sms_auth_login_successful)");
                C15030c.m56630a(context, string);
                this.f51787a.setResult(-1, this.f51787a.m68605a((C16742d) c14974c));
                this.f51787a.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordRequestSucceeded;", "onChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.SmsAuthActivity$d */
    static final class C16771d<T> implements Observer<C16730f> {
        /* renamed from: a */
        final /* synthetic */ SmsAuthActivity f51788a;

        C16771d(SmsAuthActivity smsAuthActivity) {
            this.f51788a = smsAuthActivity;
        }

        public /* synthetic */ void onChanged(Object obj) {
            m62294a((C16730f) obj);
        }

        /* renamed from: a */
        public final void m62294a(@Nullable C16730f c16730f) {
            c16730f = this.f51788a;
            String string = this.f51788a.getString(C15007f.sms_auth_sent_confirmation);
            C2668g.a(string, "getString(R.string.sms_auth_sent_confirmation)");
            C15030c.m56630a(c16730f, string);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/smsauth/ui/SmsAuthActivity$onCreate$6", "Lcom/tinder/smsauth/ui/view/CountryCodeSearchView$Listener;", "(Lcom/tinder/smsauth/ui/SmsAuthActivity;)V", "onQueryChanged", "", "query", "", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.SmsAuthActivity$e */
    public static final class C16772e implements Listener {
        /* renamed from: a */
        final /* synthetic */ SmsAuthActivity f51789a;

        C16772e(SmsAuthActivity smsAuthActivity) {
            this.f51789a = smsAuthActivity;
        }

        public void onQueryChanged(@NotNull String str) {
            C2668g.b(str, "query");
            SmsAuthActivity.m68610b(this.f51789a).m62349b().b(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/smsauth/entity/Flow$State;", "onChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.SmsAuthActivity$f */
    static final class C16773f<T> implements Observer<C14974c> {
        /* renamed from: a */
        final /* synthetic */ SmsAuthActivity f51790a;

        C16773f(SmsAuthActivity smsAuthActivity) {
            this.f51790a = smsAuthActivity;
        }

        public /* synthetic */ void onChanged(Object obj) {
            m62295a((C14974c) obj);
        }

        /* renamed from: a */
        public final void m62295a(@Nullable C14974c c14974c) {
            if (c14974c == null) {
                C2668g.a();
            }
            if ((c14974c instanceof C16744f) != null) {
                CountryCodeSearchView countryCodeSearchView = (CountryCodeSearchView) this.f51790a.m68611a(C15005d.countryCodeSearchView);
                C2668g.a(countryCodeSearchView, "countryCodeSearchView");
                countryCodeSearchView.setVisibility(0);
                return;
            }
            countryCodeSearchView = (CountryCodeSearchView) this.f51790a.m68611a(C15005d.countryCodeSearchView);
            C2668g.a(countryCodeSearchView, "countryCodeSearchView");
            countryCodeSearchView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public View m68611a(int i) {
        if (this.f59942h == null) {
            this.f59942h = new HashMap();
        }
        View view = (View) this.f59942h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f59942h.put(Integer.valueOf(i), view);
        return view;
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ ColorDrawable m68607a(SmsAuthActivity smsAuthActivity) {
        smsAuthActivity = smsAuthActivity.f59941g;
        if (smsAuthActivity == null) {
            C2668g.b("actionBarColorDrawable");
        }
        return smsAuthActivity;
    }

    @NotNull
    /* renamed from: b */
    public static final /* synthetic */ CountryCodeSelectionViewModel m68610b(SmsAuthActivity smsAuthActivity) {
        smsAuthActivity = smsAuthActivity.f59940f;
        if (smsAuthActivity == null) {
            C2668g.b("countryCodeSelectionViewModel");
        }
        return smsAuthActivity;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C15006e.sms_auth_activity);
        setSupportActionBar((Toolbar) findViewById(C15005d.toolbar));
        this.f59941g = new ColorDrawable(getResources().getColor(C15002a.action_bar));
        ((Toolbar) m68611a(C15005d.toolbar)).setNavigationOnClickListener(new C15000b(this));
        bundle = getSupportActionBar();
        if (bundle == null) {
            C2668g.a();
        }
        bundle.setDisplayShowTitleEnabled(false);
        bundle.setElevation(getResources().getDimension(C15003b.space_xxs));
        bundle.setBackgroundDrawable(null);
        bundle = this.f59938c;
        if (bundle == null) {
            C2668g.b("lifecycleObservers");
        }
        for (LifecycleObserver a : (Iterable) bundle) {
            getLifecycle().a(a);
        }
        FragmentActivity fragmentActivity = this;
        SmsAuthViewModelFactory smsAuthViewModelFactory = this.f59937b;
        if (smsAuthViewModelFactory == null) {
            C2668g.b("viewModelFactory");
        }
        C0029n a2 = C0030o.a(fragmentActivity, smsAuthViewModelFactory).a(SmsAuthNavigationViewModel.class);
        C2668g.a(a2, "ViewModelProviders.of(th…ionViewModel::class.java)");
        this.f59939e = (SmsAuthNavigationViewModel) a2;
        SmsAuthNavigationViewModel smsAuthNavigationViewModel = this.f59939e;
        if (smsAuthNavigationViewModel == null) {
            C2668g.b("viewModel");
        }
        LifecycleOwner lifecycleOwner = this;
        smsAuthNavigationViewModel.m62374b().a(lifecycleOwner, new C16770c(this));
        smsAuthNavigationViewModel = this.f59939e;
        if (smsAuthNavigationViewModel == null) {
            C2668g.b("viewModel");
        }
        smsAuthNavigationViewModel.m62375c().a(lifecycleOwner, new C16771d(this));
        smsAuthViewModelFactory = this.f59937b;
        if (smsAuthViewModelFactory == null) {
            C2668g.b("viewModelFactory");
        }
        bundle = C0030o.a(fragmentActivity, smsAuthViewModelFactory).a(CountryCodeSelectionViewModel.class);
        C2668g.a(bundle, "ViewModelProviders.of(th…ionViewModel::class.java)");
        this.f59940f = (CountryCodeSelectionViewModel) bundle;
        ((CountryCodeSearchView) m68611a(C15005d.countryCodeSearchView)).setListener(new C16772e(this));
        bundle = this.f59939e;
        if (bundle == null) {
            C2668g.b("viewModel");
        }
        bundle.m62374b().a(lifecycleOwner, new C16773f(this));
    }

    /* renamed from: a */
    private final void m68608a(Fragment fragment) {
        Fragment a = getSupportFragmentManager().a(C15005d.container);
        C0405n a2 = getSupportFragmentManager().a();
        if (a == null) {
            a2.a(C15005d.container, fragment);
        } else {
            a2.a(17432576, 17432577);
            a2.b(C15005d.container, fragment);
        }
        a2.e();
    }

    @NotNull
    public AndroidInjector<Fragment> supportFragmentInjector() {
        DispatchingAndroidInjector dispatchingAndroidInjector = this.f59936a;
        if (dispatchingAndroidInjector == null) {
            C2668g.b("dispatchingAndroidInjector");
        }
        return dispatchingAndroidInjector;
    }

    public void onBackPressed() {
        SmsAuthNavigationViewModel smsAuthNavigationViewModel = this.f59939e;
        if (smsAuthNavigationViewModel == null) {
            C2668g.b("viewModel");
        }
        if (smsAuthNavigationViewModel.m62376d()) {
            smsAuthNavigationViewModel = this.f59939e;
            if (smsAuthNavigationViewModel == null) {
                C2668g.b("viewModel");
            }
            smsAuthNavigationViewModel.m62377e().m65686a();
            return;
        }
        setResult(0);
        super.onBackPressed();
    }

    /* renamed from: a */
    private final Intent m68605a(C16742d c16742d) {
        Intent intent = new Intent();
        c16742d = c16742d.m62254b();
        intent.putExtra("refresh_token", c16742d.m56564b());
        if (c16742d instanceof C16749e) {
            intent.putExtra("onboarding_token", ((C16749e) c16742d).m62263a());
        } else if (c16742d instanceof C16747a) {
            intent.putExtra("access_token", ((C16747a) c16742d).m62262a());
        }
        return intent;
    }
}
