package com.tinder.module;

import com.tinder.common.C10654a;
import com.tinder.common.log.C10681a.C8546a;
import com.tinder.common.log.LoggingInitializer;
import dagger.Module;
import dagger.Provides;

@Published
@Module(includes = {ea.class, fh.class})
public class ez {
    @Provides
    /* renamed from: a */
    LoggingInitializer m40895a(C8546a c8546a, C10654a c10654a) {
        return c8546a.m36529a(c10654a).m36530a();
    }
}
