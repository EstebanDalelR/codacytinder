package com.tinder.auth.interactor;

import android.support.annotation.NonNull;
import com.facebook.login.C1771d;
import com.facebook.login.LoginBehavior;
import com.tinder.common.p077b.C8524b;
import com.tinder.managers.ManagerApp;
import com.tinder.model.auth.facebook.FacebookPermission;
import java.util.Set;

/* renamed from: com.tinder.auth.interactor.o */
public class C8281o {
    /* renamed from: a */
    private static final Set<String> f29537a = C8524b.m36481a("email", FacebookPermission.USER_BIRTHDAY, FacebookPermission.USER_PHOTOS, FacebookPermission.USER_LIKES, FacebookPermission.USER_FRIENDS);

    @NonNull
    /* renamed from: a */
    public String[] m35345a() {
        return (String[]) f29537a.toArray(new String[f29537a.size()]);
    }

    @NonNull
    /* renamed from: b */
    public LoginBehavior m35346b() {
        return ManagerApp.f12345a ? LoginBehavior.NATIVE_WITH_FALLBACK : LoginBehavior.WEB_ONLY;
    }

    /* renamed from: c */
    public void m35347c() {
        C1771d.a().b();
    }
}
