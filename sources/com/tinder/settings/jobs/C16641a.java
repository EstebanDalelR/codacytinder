package com.tinder.settings.jobs;

import com.tinder.settings.p404b.C14864a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.jobs.a */
public final class C16641a implements MembersInjector<ReactivateAccountJob> {
    /* renamed from: a */
    private final Provider<C14864a> f51523a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62106a((ReactivateAccountJob) obj);
    }

    /* renamed from: a */
    public void m62106a(ReactivateAccountJob reactivateAccountJob) {
        C16641a.m62105a(reactivateAccountJob, (C14864a) this.f51523a.get());
    }

    /* renamed from: a */
    public static void m62105a(ReactivateAccountJob reactivateAccountJob, C14864a c14864a) {
        reactivateAccountJob.f51521a = c14864a;
    }
}
