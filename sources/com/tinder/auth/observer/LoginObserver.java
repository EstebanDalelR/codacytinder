package com.tinder.auth.observer;

import com.tinder.auth.model.C8288b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/auth/observer/LoginObserver;", "", "onLoggedIn", "", "authResult", "Lcom/tinder/auth/model/AuthResult;", "onVerificationRequired", "domain"}, k = 1, mv = {1, 1, 10})
public interface LoginObserver {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.observer.LoginObserver$a */
    public static final class C8293a {
        /* renamed from: a */
        public static void m35387a(LoginObserver loginObserver) {
        }
    }

    void onLoggedIn(@NotNull C8288b c8288b);

    void onVerificationRequired();
}
