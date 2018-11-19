package com.tinder.auth.interactor;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitLoginResult;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.tinder.auth.accountkit.C10326a;
import javax.inject.Inject;
import javax.inject.Named;

/* renamed from: com.tinder.auth.interactor.b */
public class C8276b {
    @NonNull
    /* renamed from: a */
    private final AccountKitConfiguration f29523a;
    @NonNull
    /* renamed from: b */
    private final AccountKitConfiguration f29524b;
    @NonNull
    /* renamed from: c */
    private final C10326a f29525c;

    @Inject
    public C8276b(@NonNull @Named("login_configuration") AccountKitConfiguration accountKitConfiguration, @NonNull @Named("validate_configuration") AccountKitConfiguration accountKitConfiguration2, @NonNull C10326a c10326a) {
        this.f29523a = accountKitConfiguration;
        this.f29524b = accountKitConfiguration2;
        this.f29525c = c10326a;
    }

    /* renamed from: a */
    public boolean m35330a(@Nullable AccountKitLoginResult accountKitLoginResult) {
        if (!(accountKitLoginResult == null || accountKitLoginResult.wasCancelled())) {
            if (accountKitLoginResult.getError() == null) {
                return true;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public AccountKitError m35331b(@Nullable AccountKitLoginResult accountKitLoginResult) {
        return accountKitLoginResult == null ? null : accountKitLoginResult.getError();
    }

    /* renamed from: a */
    public AccountKitConfiguration m35329a() {
        return this.f29523a;
    }

    /* renamed from: b */
    public AccountKitConfiguration m35332b() {
        return this.f29524b;
    }

    /* renamed from: c */
    void m35333c() {
        AccountKit.c();
    }
}
