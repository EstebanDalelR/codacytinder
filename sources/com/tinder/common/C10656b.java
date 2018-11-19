package com.tinder.common;

import android.app.Application;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.common.model.User;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.common.b */
public class C10656b implements CrashReporter {
    /* renamed from: a */
    private final C8540g f34947a;
    /* renamed from: b */
    private final CrashlyticsCore f34948b;
    /* renamed from: c */
    private final Beta f34949c;
    /* renamed from: d */
    private final Answers f34950d;
    /* renamed from: e */
    private final CurrentUserProvider f34951e;

    /* renamed from: a */
    final /* synthetic */ void m42973a(User user) {
        m42972b(user);
    }

    public C10656b(C8540g c8540g, CrashlyticsCore crashlyticsCore, Beta beta, Answers answers, CurrentUserProvider currentUserProvider) {
        this.f34947a = c8540g;
        this.f34948b = crashlyticsCore;
        this.f34949c = beta;
        this.f34950d = answers;
        this.f34951e = currentUserProvider;
    }

    public void initialize(Application application) {
        this.f34947a.m36522a(application, this.f34948b, this.f34949c, this.f34950d);
        this.f34951e.observe().f(C12776c.f41160a).b(Schedulers.io()).a(new C13761d(this), C13762e.f43745a);
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m42971a(ProfileUser profileUser) {
        return Boolean.valueOf(profileUser != null ? true : null);
    }

    public boolean isInitialized() {
        return this.f34947a.m36523a();
    }

    public void log(String str) {
        this.f34948b.log(str);
    }

    public void logException(Throwable th) {
        this.f34948b.logException(th);
    }

    /* renamed from: b */
    private void m42972b(User user) {
        this.f34948b.setUserName(user.name());
        this.f34948b.setUserIdentifier(user.id());
    }
}
