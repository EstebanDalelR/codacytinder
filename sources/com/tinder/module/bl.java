package com.tinder.module;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsCore.Builder;
import com.tinder.common.C8540g;
import dagger.Module;
import dagger.Provides;

@Internal
@Module
public class bl {
    @Provides
    /* renamed from: a */
    CrashlyticsCore m40793a() {
        return new Builder().build();
    }

    @Provides
    /* renamed from: b */
    Beta m40794b() {
        return new Beta();
    }

    @Provides
    /* renamed from: c */
    Answers m40795c() {
        return new Answers();
    }

    @Provides
    /* renamed from: d */
    C8540g m40796d() {
        return new C8540g();
    }
}
