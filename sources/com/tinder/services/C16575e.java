package com.tinder.services;

import com.tinder.api.ManagerNetwork;
import com.tinder.managers.ManagerProfile;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.services.e */
public final class C16575e implements MembersInjector<ProcessingPhotosTaskService> {
    /* renamed from: a */
    private final Provider<ManagerProfile> f51274a;
    /* renamed from: b */
    private final Provider<ManagerNetwork> f51275b;
    /* renamed from: c */
    private final Provider<C2664c> f51276c;

    public /* synthetic */ void injectMembers(Object obj) {
        m62007a((ProcessingPhotosTaskService) obj);
    }

    /* renamed from: a */
    public void m62007a(ProcessingPhotosTaskService processingPhotosTaskService) {
        C16575e.m62005a(processingPhotosTaskService, (ManagerProfile) this.f51274a.get());
        C16575e.m62004a(processingPhotosTaskService, (ManagerNetwork) this.f51275b.get());
        C16575e.m62006a(processingPhotosTaskService, (C2664c) this.f51276c.get());
    }

    /* renamed from: a */
    public static void m62005a(ProcessingPhotosTaskService processingPhotosTaskService, ManagerProfile managerProfile) {
        processingPhotosTaskService.f51268a = managerProfile;
    }

    /* renamed from: a */
    public static void m62004a(ProcessingPhotosTaskService processingPhotosTaskService, ManagerNetwork managerNetwork) {
        processingPhotosTaskService.f51269b = managerNetwork;
    }

    /* renamed from: a */
    public static void m62006a(ProcessingPhotosTaskService processingPhotosTaskService, C2664c c2664c) {
        processingPhotosTaskService.f51270c = c2664c;
    }
}
