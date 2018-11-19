package com.snapchat.kit.sdk.login.p158b;

import android.view.View;
import android.view.View.OnClickListener;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStartListener;
import com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.login.C5955a.C5952a;
import com.snapchat.kit.sdk.login.dagger.scope.LoginScope;
import com.snapchat.kit.sdk.login.p150a.C5954a;
import javax.inject.Inject;

@LoginScope
/* renamed from: com.snapchat.kit.sdk.login.b.a */
public class C7164a implements OnClickListener, OnLoginStartListener, OnLoginStateChangedListener {
    /* renamed from: a */
    private final AuthTokenManager f25909a;
    /* renamed from: b */
    private final LoginStateController f25910b;
    /* renamed from: c */
    private final C5954a f25911c;
    /* renamed from: d */
    private View f25912d;
    /* renamed from: e */
    private View f25913e;
    /* renamed from: f */
    private View f25914f;

    public void onLoginSucceeded() {
    }

    @Inject
    C7164a(AuthTokenManager authTokenManager, LoginStateController loginStateController, C5954a c5954a) {
        this.f25909a = authTokenManager;
        this.f25910b = loginStateController;
        this.f25911c = c5954a;
    }

    /* renamed from: a */
    public void m30820a(View view) {
        this.f25912d = view;
        this.f25913e = view.findViewById(C5952a.snap_connect_login_text_button);
        this.f25914f = view.findViewById(C5952a.snap_connect_login_loading_icon);
        this.f25910b.addOnLoginStateChangedListener(this);
        this.f25910b.addOnLoginStartListener(this);
        this.f25911c.m25570a("loginButton", 1);
        this.f25912d.setOnClickListener(this);
    }

    public void onClick(View view) {
        this.f25909a.startTokenGrant();
    }

    public void onLoginFailed() {
        m30819a(true);
    }

    public void onLogout() {
        m30819a(true);
    }

    public void onLoginStart() {
        m30819a(false);
    }

    /* renamed from: a */
    private void m30819a(boolean z) {
        int i = 0;
        this.f25914f.setVisibility(z ? 8 : 0);
        View view = this.f25913e;
        if (!z) {
            i = 4;
        }
        view.setVisibility(i);
        this.f25912d.setEnabled(z);
    }
}
