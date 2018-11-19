package com.tinder.services;

import com.tinder.domain.pushnotifications.usecase.RegisterPushToken;
import com.tinder.managers.bk;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.services.c */
public final class C16573c implements MembersInjector<GCMRegistrationIntentService> {
    /* renamed from: a */
    private final Provider<bk> f51271a;
    /* renamed from: b */
    private final Provider<RegisterPushToken> f51272b;

    public /* synthetic */ void injectMembers(Object obj) {
        m62003a((GCMRegistrationIntentService) obj);
    }

    /* renamed from: a */
    public void m62003a(GCMRegistrationIntentService gCMRegistrationIntentService) {
        C16573c.m62002a(gCMRegistrationIntentService, (bk) this.f51271a.get());
        C16573c.m62001a(gCMRegistrationIntentService, (RegisterPushToken) this.f51272b.get());
    }

    /* renamed from: a */
    public static void m62002a(GCMRegistrationIntentService gCMRegistrationIntentService, bk bkVar) {
        gCMRegistrationIntentService.f46437a = bkVar;
    }

    /* renamed from: a */
    public static void m62001a(GCMRegistrationIntentService gCMRegistrationIntentService, RegisterPushToken registerPushToken) {
        gCMRegistrationIntentService.f46438b = registerPushToken;
    }
}
