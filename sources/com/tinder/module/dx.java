package com.tinder.module;

import com.tinder.p071a.C2602d;
import com.tinder.p071a.C3868l;
import com.tinder.p071a.C3870m;
import dagger.Module;
import dagger.Provides;

@Published
@Module
public class dx {
    @Provides
    /* renamed from: a */
    C3870m m40875a(C2602d c2602d) {
        return c2602d.b();
    }

    @Provides
    /* renamed from: b */
    C3868l m40876b(C2602d c2602d) {
        return c2602d.a();
    }
}
