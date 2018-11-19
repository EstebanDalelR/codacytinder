package com.tinder.recs.provider;

import android.content.SharedPreferences;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.ObservingProvider;
import com.tinder.module.Default;
import com.tinder.recs.model.TappyConfig;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;
import rx.subjects.C19785a;

@Singleton
public class TappyConfigProvider implements ObservingProvider<TappyConfig> {
    private static final int INDICATOR_START_DELAY = 1500;
    private static final String KEY_SHOW_TAPPY_TUTORIAL = "SHOW_TAPPY_TUTORIAL";
    private final SharedPreferences sharedPreferences;
    private final C19785a<TappyConfig> subject;

    @Inject
    public TappyConfigProvider(AbTestUtility abTestUtility, @Default SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
        this.subject = C19785a.f(TappyConfig.builder().indicatorStartDelay(1500).isTutorialShown(sharedPreferences.getBoolean(KEY_SHOW_TAPPY_TUTORIAL, false)).build());
    }

    @Nullable
    public TappyConfig get() {
        return (TappyConfig) this.subject.A();
    }

    public Observable<TappyConfig> observe() {
        return this.subject.e();
    }

    public void update(TappyConfig tappyConfig) {
        this.sharedPreferences.edit().putBoolean(KEY_SHOW_TAPPY_TUTORIAL, tappyConfig.isTutorialShown()).apply();
        this.subject.onNext(tappyConfig);
    }
}
