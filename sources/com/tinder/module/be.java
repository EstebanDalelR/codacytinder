package com.tinder.module;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.tinder.common.C10656b;
import com.tinder.common.C8540g;
import com.tinder.common.CrashReporter;
import com.tinder.data.user.CurrentUserProvider;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Published
@Module(includes = {bl.class})
public class be {
    @Singleton
    @Provides
    /* renamed from: a */
    CrashReporter m40789a(C8540g c8540g, CrashlyticsCore crashlyticsCore, Beta beta, Answers answers, CurrentUserProvider currentUserProvider) {
        return new C10656b(c8540g, crashlyticsCore, beta, answers, currentUserProvider);
    }
}
