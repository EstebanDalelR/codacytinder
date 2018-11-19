package com.tinder.purchase.job;

import com.tinder.purchase.logging.C14522a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.job.a */
public final class C16230a implements MembersInjector<ReportBillingTimeoutService> {
    /* renamed from: a */
    private final Provider<C14522a> f50562a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61281a((ReportBillingTimeoutService) obj);
    }

    /* renamed from: a */
    public void m61281a(ReportBillingTimeoutService reportBillingTimeoutService) {
        C16230a.m61280a(reportBillingTimeoutService, (C14522a) this.f50562a.get());
    }

    /* renamed from: a */
    public static void m61280a(ReportBillingTimeoutService reportBillingTimeoutService, C14522a c14522a) {
        reportBillingTimeoutService.f50561a = c14522a;
    }
}
