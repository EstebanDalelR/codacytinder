package com.tinder.module;

import android.content.Context;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deeplink.DeepLinkedSharedRecInterceptor;
import com.tinder.deeplink.p229b.C8819a;
import com.tinder.deeplink.p333a.C11099a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerProfile;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class bg {
    @Singleton
    @Provides
    /* renamed from: a */
    ManagerDeepLinking m40791a(ManagerProfile managerProfile, ManagerAnalytics managerAnalytics, @ForApplication Context context, DeepLinkedSharedRecInterceptor deepLinkedSharedRecInterceptor) {
        ManagerDeepLinking managerDeepLinking = new ManagerDeepLinking(managerProfile, managerAnalytics, context);
        managerDeepLinking.m40485a(deepLinkedSharedRecInterceptor);
        return managerDeepLinking;
    }

    @Singleton
    @Provides
    /* renamed from: a */
    DeepLinkedSharedRecInterceptor m40790a(AbTestUtility abTestUtility, C8819a c8819a) {
        return new C11099a(c8819a);
    }
}
