package com.tinder.onboarding.module;

import com.tinder.api.EnvironmentProvider;
import com.tinder.api.module.OkHttpQualifiers$AuthHeaders;
import com.tinder.auth.interactor.C10333h;
import com.tinder.common.repository.C10698c;
import com.tinder.domain.OnboardingTokenProvider;
import com.tinder.onboarding.C12154a;
import com.tinder.onboarding.C12162c;
import com.tinder.onboarding.C12168e;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.model.OnboardingExperiments;
import com.tinder.onboarding.model.OnboardingPermissions;
import com.tinder.onboarding.repository.C12187s;
import com.tinder.onboarding.repository.OnboardingErrorHandler;
import com.tinder.onboarding.repository.OnboardingService;
import com.tinder.onboarding.repository.OnboardingUserRepository;
import com.tinder.onboarding.view.C12210c;
import com.tinder.onboarding.view.DateWidgetDateValidator;
import com.tinder.scope.ActivityScope;
import dagger.Module;
import dagger.Provides;
import okhttp3.C17692o;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
/* renamed from: com.tinder.onboarding.module.a */
public class C2655a {
    @Provides
    /* renamed from: a */
    OnboardingTokenProvider m10154a(C10698c c10698c) {
        return c10698c;
    }

    @ActivityScope
    @Provides
    /* renamed from: a */
    OnboardingAnalyticsInteractor m10155a(C10333h c10333h) {
        return c10333h;
    }

    @Provides
    /* renamed from: a */
    OnboardingExperiments m10156a(C12154a c12154a) {
        return c12154a;
    }

    @Provides
    /* renamed from: a */
    OnboardingPermissions m10157a(C12168e c12168e) {
        return c12168e;
    }

    @Provides
    /* renamed from: a */
    OnboardingErrorHandler m10158a(C12162c c12162c) {
        return c12162c;
    }

    @ActivityScope
    @Provides
    /* renamed from: a */
    OnboardingUserRepository m10160a(C12187s c12187s) {
        return c12187s;
    }

    @ActivityScope
    @Provides
    /* renamed from: a */
    OnboardingService m10159a(@OkHttpQualifiers$AuthHeaders C17692o c17692o, EnvironmentProvider environmentProvider) {
        return (OnboardingService) new Builder().baseUrl(environmentProvider.getUrlBase()).client(c17692o).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build().create(OnboardingService.class);
    }

    @ActivityScope
    @Provides
    /* renamed from: a */
    DateWidgetDateValidator m10161a() {
        return new C12210c();
    }
}
