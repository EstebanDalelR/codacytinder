package com.tinder.settings.module;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.scope.ActivityScope;
import com.tinder.settings.analytics.TrackExitSurveyEvent;
import dagger.Module;
import dagger.Provides;

@Module
/* renamed from: com.tinder.settings.module.a */
public class C2656a {
    @ActivityScope
    @Provides
    /* renamed from: a */
    TrackExitSurveyEvent m10163a(C2630h c2630h) {
        return new TrackExitSurveyEvent(c2630h);
    }
}
