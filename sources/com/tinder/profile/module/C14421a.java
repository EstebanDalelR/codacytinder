package com.tinder.profile.module;

import android.arch.lifecycle.Lifecycle;
import android.support.v7.app.AppCompatActivity;
import com.tinder.recs.model.TappyConfig;
import com.tinder.recs.provider.TappyConfigProvider;
import com.tinder.scope.ActivityScope;
import dagger.Module;
import dagger.Provides;

@Module
/* renamed from: com.tinder.profile.module.a */
public class C14421a {
    @ActivityScope
    @Provides
    /* renamed from: a */
    TappyConfig m54970a(TappyConfigProvider tappyConfigProvider) {
        return tappyConfigProvider.get();
    }

    @Provides
    /* renamed from: a */
    Lifecycle m54969a(AppCompatActivity appCompatActivity) {
        return appCompatActivity.getLifecycle();
    }
}
