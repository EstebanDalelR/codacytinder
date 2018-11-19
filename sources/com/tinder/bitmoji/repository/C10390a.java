package com.tinder.bitmoji.repository;

import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.tinder.bitmoji.BitmojiAuthStatus;
import io.reactivex.C3959e;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016R2\u0010\b\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/bitmoji/repository/BitmojiAuthDataRepository;", "Lcom/tinder/bitmoji/repository/BitmojiAuthRepository;", "Lcom/snapchat/kit/sdk/core/controller/LoginStateController$OnLoginStateChangedListener;", "loginStateController", "Lcom/snapchat/kit/sdk/core/controller/LoginStateController;", "authTokenManager", "Lcom/snapchat/kit/sdk/core/networking/AuthTokenManager;", "(Lcom/snapchat/kit/sdk/core/controller/LoginStateController;Lcom/snapchat/kit/sdk/core/networking/AuthTokenManager;)V", "authStatusSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/tinder/bitmoji/BitmojiAuthStatus;", "kotlin.jvm.PlatformType", "connect", "", "disconnect", "isConnected", "", "observeBitmojiAuthStatus", "Lio/reactivex/Observable;", "onLoginFailed", "onLoginSucceeded", "onLogout", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.repository.a */
public final class C10390a implements OnLoginStateChangedListener, BitmojiAuthRepository {
    /* renamed from: a */
    private final PublishSubject<BitmojiAuthStatus> f33874a = PublishSubject.a();
    /* renamed from: b */
    private final AuthTokenManager f33875b;

    public C10390a(@NotNull LoginStateController loginStateController, @NotNull AuthTokenManager authTokenManager) {
        C2668g.b(loginStateController, "loginStateController");
        C2668g.b(authTokenManager, "authTokenManager");
        this.f33875b = authTokenManager;
        loginStateController.addOnLoginStateChangedListener(this);
    }

    public void connect() {
        this.f33875b.startTokenGrant();
    }

    public void disconnect() {
        this.f33875b.revokeToken();
    }

    public void onLogout() {
        this.f33874a.onNext(BitmojiAuthStatus.DISCONNECTED);
    }

    @NotNull
    public C3959e<BitmojiAuthStatus> observeBitmojiAuthStatus() {
        C3959e<BitmojiAuthStatus> hide = this.f33874a.hide();
        C2668g.a(hide, "authStatusSubject.hide()");
        return hide;
    }

    public void onLoginFailed() {
        this.f33874a.onNext(BitmojiAuthStatus.AUTH_FAILED);
    }

    public void onLoginSucceeded() {
        this.f33874a.onNext(BitmojiAuthStatus.CONNECTED);
    }

    public boolean isConnected() {
        return this.f33875b.isUserLoggedIn();
    }
}
