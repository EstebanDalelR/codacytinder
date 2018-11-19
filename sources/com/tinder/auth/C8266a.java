package com.tinder.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import com.facebook.CallbackManager;
import com.facebook.CallbackManager.C1165a;
import com.facebook.accountkit.ui.AccountKitActivity.ResponseType;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.accountkit.ui.AccountKitConfiguration.C1255a;
import com.facebook.accountkit.ui.LoginType;
import com.facebook.accountkit.ui.UIManager;
import com.tinder.R;
import com.tinder.account.data.C3878a;
import com.tinder.account.data.UpdateAccountDataStore;
import com.tinder.account.provider.C7268a;
import com.tinder.account.provider.UpdateAccountPasswordLastShownDateProvider;
import com.tinder.analytics.C7333h;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.aa;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.InstallIdHeaderInterceptor;
import com.tinder.api.buckets.BucketsService;
import com.tinder.api.buckets.BucketsServiceFactory;
import com.tinder.api.module.OkHttpQualifiers$AuthHeaders;
import com.tinder.api.module.OkHttpQualifiers$Public;
import com.tinder.api.module.RetrofitModule;
import com.tinder.api.retrofit.TinderHeaderInterceptor;
import com.tinder.app.dagger.module.C8244a;
import com.tinder.auth.accountkit.C10326a;
import com.tinder.auth.accountkit.LoginAccountKitUiManager;
import com.tinder.auth.accountkit.ValidateAccountKitUiManager;
import com.tinder.auth.interactor.AddSmsValidateEvent;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.observer.AuthObserver;
import com.tinder.auth.observer.C10341d;
import com.tinder.auth.p168c.C8274f;
import com.tinder.auth.repository.AccountService;
import com.tinder.auth.repository.AuthLedgerRepository;
import com.tinder.auth.repository.AuthRepository;
import com.tinder.auth.repository.AuthService;
import com.tinder.auth.repository.AuthSessionDataStore;
import com.tinder.auth.repository.AuthSessionRepository;
import com.tinder.auth.repository.C10346a;
import com.tinder.auth.repository.C10347b;
import com.tinder.auth.repository.C10348i;
import com.tinder.auth.repository.C10349j;
import com.tinder.auth.repository.C10350m;
import com.tinder.auth.repository.C10351n;
import com.tinder.common.p077b.C8524b;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.auth.C10747a;
import com.tinder.data.buckets.C8631f;
import com.tinder.domain.auth.AuthStatusRepository;
import com.tinder.domain.auth.UniqueIdFactory;
import com.tinder.managers.bk;
import com.tinder.model.network.ErrorResponseConverter;
import com.tinder.module.Default;
import com.tinder.module.ForApplication;
import com.tinder.p071a.C2602d;
import com.tinder.smsauth.entity.SmsAuthType;
import com.tinder.smsauth.sdk.C14987c;
import dagger.Module;
import dagger.Provides;
import io.reactivex.schedulers.C15756a;
import java.util.Locale;
import javax.inject.Named;
import javax.inject.Singleton;
import okhttp3.C17692o;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = {RetrofitModule.class, C8244a.class, C8631f.class})
/* renamed from: com.tinder.auth.a */
public class C8266a {
    @Provides
    /* renamed from: a */
    UniqueIdFactory m35302a(C10351n c10351n) {
        return c10351n;
    }

    @Singleton
    @Provides
    /* renamed from: a */
    CallbackManager m35288a() {
        return C1165a.a();
    }

    @Singleton
    @Provides
    @Named("login_ui_manager")
    /* renamed from: a */
    UIManager m35291a(C10333h c10333h) {
        return new LoginAccountKitUiManager(R.style.TinderAccountKit, c10333h);
    }

    @Singleton
    @Provides
    @Named("validate_ui_manager")
    /* renamed from: a */
    UIManager m35290a(AddSmsValidateEvent addSmsValidateEvent) {
        return new ValidateAccountKitUiManager(R.style.TinderAccountKit, addSmsValidateEvent);
    }

    @Singleton
    @Provides
    /* renamed from: b */
    LoginType m35305b() {
        return LoginType.PHONE;
    }

    @Singleton
    @Provides
    /* renamed from: c */
    ResponseType m35307c() {
        return ResponseType.TOKEN;
    }

    @Singleton
    @Provides
    @Named("login_configuration")
    /* renamed from: a */
    AccountKitConfiguration m35289a(@NonNull @Named("login_ui_manager") UIManager uIManager, @NonNull LoginType loginType, @NonNull ResponseType responseType) {
        return m35287c(uIManager, loginType, responseType);
    }

    @Singleton
    @Provides
    @Named("validate_configuration")
    /* renamed from: b */
    AccountKitConfiguration m35304b(@NonNull @Named("validate_ui_manager") UIManager uIManager, @NonNull LoginType loginType, @NonNull ResponseType responseType) {
        return m35287c(uIManager, loginType, responseType);
    }

    /* renamed from: c */
    private AccountKitConfiguration m35287c(@NonNull UIManager uIManager, @NonNull LoginType loginType, @NonNull ResponseType responseType) {
        C1255a c1255a = new C1255a(loginType, responseType);
        c1255a.a(uIManager);
        c1255a.a(Locale.getDefault().getCountry());
        return c1255a.a();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    AuthRepository m35298a(AuthService authService, ErrorResponseConverter errorResponseConverter, C2602d c2602d, C10333h c10333h, UniqueIdFactory uniqueIdFactory, C2630h c2630h, AbTestUtility abTestUtility, aa aaVar) {
        return new C10347b(authService, errorResponseConverter, c2602d, c10333h, uniqueIdFactory, c2630h, abTestUtility, aaVar);
    }

    @Singleton
    @Provides
    /* renamed from: d */
    C10350m m35308d() {
        return new C10350m();
    }

    @Singleton
    @Provides
    /* renamed from: e */
    C10326a m35309e() {
        return new C10326a();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    AuthSessionDataStore m35299a(@ForApplication Context context) {
        return new C10349j(context.getSharedPreferences("authsession", 0));
    }

    @Singleton
    @Provides
    /* renamed from: a */
    AuthStatusRepository m35301a(@Default SharedPreferences sharedPreferences) {
        return new C10747a(sharedPreferences, "TOKEN_TINDER");
    }

    @Singleton
    @Provides
    /* renamed from: a */
    AuthSessionRepository m35300a(AuthSessionDataStore authSessionDataStore) {
        return new C10348i(authSessionDataStore);
    }

    @Provides
    /* renamed from: a */
    AccountService m35297a(Builder builder, @OkHttpQualifiers$AuthHeaders C17692o c17692o, RxJavaCallAdapterFactory rxJavaCallAdapterFactory, GsonConverterFactory gsonConverterFactory, EnvironmentProvider environmentProvider) {
        return (AccountService) builder.baseUrl(environmentProvider.getUrlBase()).client(c17692o).addCallAdapterFactory(rxJavaCallAdapterFactory).addConverterFactory(gsonConverterFactory).build().create(AccountService.class);
    }

    @Provides
    /* renamed from: a */
    BucketsService m35294a(@OkHttpQualifiers$Public C17692o c17692o, EnvironmentProvider environmentProvider) {
        return BucketsServiceFactory.create(environmentProvider.getUrlBase(), c17692o);
    }

    @Provides
    /* renamed from: a */
    UpdateAccountPasswordLastShownDateProvider m35293a(@NonNull bk bkVar) {
        return new C7268a(bkVar);
    }

    @Provides
    /* renamed from: a */
    UpdateAccountDataStore m35292a(AccountService accountService, ErrorResponseConverter errorResponseConverter) {
        return new C3878a(accountService, errorResponseConverter);
    }

    @Provides
    /* renamed from: b */
    AuthLedgerRepository m35306b(@Default SharedPreferences sharedPreferences) {
        return new C10346a(sharedPreferences, C15756a.a());
    }

    @Provides
    /* renamed from: a */
    C8274f m35295a(AuthLedgerRepository authLedgerRepository) {
        return new C8274f(authLedgerRepository);
    }

    @Provides
    /* renamed from: a */
    AuthObserver m35296a(C8274f c8274f) {
        return new C10341d(c8274f);
    }

    @Provides
    /* renamed from: a */
    C14987c m35303a(EnvironmentProvider environmentProvider, TinderHeaderInterceptor tinderHeaderInterceptor, InstallIdHeaderInterceptor installIdHeaderInterceptor, C7333h c7333h) {
        return new C14987c(environmentProvider.getUrlBase(), SmsAuthType.SMS, C8524b.m36482b(tinderHeaderInterceptor, installIdHeaderInterceptor), c7333h);
    }
}
