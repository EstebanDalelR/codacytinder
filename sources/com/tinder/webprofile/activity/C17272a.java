package com.tinder.webprofile.activity;

import android.view.inputmethod.InputMethodManager;
import com.tinder.webprofile.presenter.C15486a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.webprofile.activity.a */
public final class C17272a implements MembersInjector<WebProfileUsernameActivity> {
    /* renamed from: a */
    private final Provider<C15486a> f52940a;
    /* renamed from: b */
    private final Provider<InputMethodManager> f52941b;

    public /* synthetic */ void injectMembers(Object obj) {
        m63218a((WebProfileUsernameActivity) obj);
    }

    /* renamed from: a */
    public void m63218a(WebProfileUsernameActivity webProfileUsernameActivity) {
        C17272a.m63217a(webProfileUsernameActivity, (C15486a) this.f52940a.get());
        C17272a.m63216a(webProfileUsernameActivity, (InputMethodManager) this.f52941b.get());
    }

    /* renamed from: a */
    public static void m63217a(WebProfileUsernameActivity webProfileUsernameActivity, C15486a c15486a) {
        webProfileUsernameActivity.f59951b = c15486a;
    }

    /* renamed from: a */
    public static void m63216a(WebProfileUsernameActivity webProfileUsernameActivity, InputMethodManager inputMethodManager) {
        webProfileUsernameActivity.f59952c = inputMethodManager;
    }
}
