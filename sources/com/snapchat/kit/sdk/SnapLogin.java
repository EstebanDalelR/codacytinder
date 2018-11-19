package com.snapchat.kit.sdk;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.login.C5955a.C5953b;
import com.snapchat.kit.sdk.login.C7165b;
import com.snapchat.kit.sdk.login.LoginComponent;
import com.snapchat.kit.sdk.login.networking.FetchUserDataCallback;

public class SnapLogin {
    @VisibleForTesting
    /* renamed from: a */
    static LoginComponent f21559a;

    /* renamed from: a */
    static synchronized LoginComponent m25384a(@NonNull Context context) {
        synchronized (SnapLogin.class) {
            if (f21559a == null) {
                f21559a = C7165b.m30821a().m25574a(SnapKit.getComponent(context)).m25573a();
            }
            context = f21559a;
        }
        return context;
    }

    public static View getButton(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C5953b.snap_connect_login_button, viewGroup, false);
        m25384a(context).loginButtonController().m30820a(inflate);
        viewGroup.addView(inflate);
        return inflate;
    }

    public static LoginStateController getLoginStateController(Context context) {
        return SnapKit.getComponent(context).logoutController();
    }

    public static boolean isUserLoggedIn(Context context) {
        return SnapKit.getComponent(context).authTokenManager().isUserLoggedIn();
    }

    public static AuthTokenManager getAuthTokenManager(Context context) {
        return SnapKit.getComponent(context).authTokenManager();
    }

    public static void fetchUserData(@NonNull Context context, @NonNull String str, @Nullable String str2, @NonNull FetchUserDataCallback fetchUserDataCallback) {
        m25384a(context).snapLoginClient().m25576a(str, str2, fetchUserDataCallback);
    }
}
