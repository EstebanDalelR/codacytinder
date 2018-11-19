package com.tinder.match.views;

import com.tinder.match.presenter.C13431s;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.match.views.o */
public final class C12112o implements MembersInjector<NewMatchesView> {
    /* renamed from: a */
    private final Provider<C13431s> f39289a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48253a((NewMatchesView) obj);
    }

    /* renamed from: a */
    public void m48253a(NewMatchesView newMatchesView) {
        C12112o.m48252a(newMatchesView, (C13431s) this.f39289a.get());
    }

    /* renamed from: a */
    public static void m48252a(NewMatchesView newMatchesView, C13431s c13431s) {
        newMatchesView.f39270a = c13431s;
    }
}
