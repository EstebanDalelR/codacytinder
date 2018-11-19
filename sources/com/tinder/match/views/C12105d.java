package com.tinder.match.views;

import android.view.inputmethod.InputMethodManager;
import com.tinder.home.p259b.C9695a;
import com.tinder.match.presenter.C9865a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.match.views.d */
public final class C12105d implements MembersInjector<MatchListView> {
    /* renamed from: a */
    private final Provider<C9865a> f39273a;
    /* renamed from: b */
    private final Provider<InputMethodManager> f39274b;
    /* renamed from: c */
    private final Provider<C9695a> f39275c;

    public /* synthetic */ void injectMembers(Object obj) {
        m48236a((MatchListView) obj);
    }

    /* renamed from: a */
    public void m48236a(MatchListView matchListView) {
        C12105d.m48235a(matchListView, (C9865a) this.f39273a.get());
        C12105d.m48233a(matchListView, (InputMethodManager) this.f39274b.get());
        C12105d.m48234a(matchListView, (C9695a) this.f39275c.get());
    }

    /* renamed from: a */
    public static void m48235a(MatchListView matchListView, C9865a c9865a) {
        matchListView.f12421a = c9865a;
    }

    /* renamed from: a */
    public static void m48233a(MatchListView matchListView, InputMethodManager inputMethodManager) {
        matchListView.f12422b = inputMethodManager;
    }

    /* renamed from: a */
    public static void m48234a(MatchListView matchListView, C9695a c9695a) {
        matchListView.f12423c = c9695a;
    }
}
