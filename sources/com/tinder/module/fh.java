package com.tinder.module;

import com.tinder.common.C10654a;
import com.tinder.common.CrashReporter;
import dagger.Module;
import dagger.Provides;

@Internal
@Module
public class fh {
    @Provides
    /* renamed from: a */
    C10654a m40900a(CrashReporter crashReporter) {
        return new C10654a(crashReporter);
    }
}
