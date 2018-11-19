package com.tinder.smsauth.ui;

import android.arch.lifecycle.LifecycleObserver;
import android.support.v4.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.ui.l */
public final class C16787l implements MembersInjector<SmsAuthActivity> {
    /* renamed from: a */
    private final Provider<DispatchingAndroidInjector<Fragment>> f51807a;
    /* renamed from: b */
    private final Provider<SmsAuthViewModelFactory> f51808b;
    /* renamed from: c */
    private final Provider<Set<LifecycleObserver>> f51809c;

    public /* synthetic */ void injectMembers(Object obj) {
        m62315a((SmsAuthActivity) obj);
    }

    /* renamed from: a */
    public void m62315a(SmsAuthActivity smsAuthActivity) {
        C16787l.m62313a(smsAuthActivity, (DispatchingAndroidInjector) this.f51807a.get());
        C16787l.m62312a(smsAuthActivity, (SmsAuthViewModelFactory) this.f51808b.get());
        C16787l.m62314a(smsAuthActivity, (Set) this.f51809c.get());
    }

    /* renamed from: a */
    public static void m62313a(SmsAuthActivity smsAuthActivity, DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector) {
        smsAuthActivity.f59936a = dispatchingAndroidInjector;
    }

    /* renamed from: a */
    public static void m62312a(SmsAuthActivity smsAuthActivity, SmsAuthViewModelFactory smsAuthViewModelFactory) {
        smsAuthActivity.f59937b = smsAuthViewModelFactory;
    }

    /* renamed from: a */
    public static void m62314a(SmsAuthActivity smsAuthActivity, Set<LifecycleObserver> set) {
        smsAuthActivity.f59938c = set;
    }
}
