package com.tinder.goingout.view;

import com.tinder.goingout.p357a.C13319a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.goingout.view.a */
public final class C11856a implements MembersInjector<TimeSinceTextView> {
    /* renamed from: a */
    private final Provider<C13319a> f38671a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47824a((TimeSinceTextView) obj);
    }

    /* renamed from: a */
    public void m47824a(TimeSinceTextView timeSinceTextView) {
        C11856a.m47823a(timeSinceTextView, (C13319a) this.f38671a.get());
    }

    /* renamed from: a */
    public static void m47823a(TimeSinceTextView timeSinceTextView, C13319a c13319a) {
        timeSinceTextView.f44456a = c13319a;
    }
}
