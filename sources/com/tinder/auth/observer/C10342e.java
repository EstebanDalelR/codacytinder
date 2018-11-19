package com.tinder.auth.observer;

import com.tinder.auth.model.C8288b;
import com.tinder.auth.observer.LoginObserver.C8293a;
import com.tinder.interactors.C9719k;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/auth/observer/SyncProfileLoginObserver;", "Lcom/tinder/auth/observer/LoginObserver;", "profileInteractor", "Lcom/tinder/interactors/ProfileInteractor;", "(Lcom/tinder/interactors/ProfileInteractor;)V", "onLoggedIn", "", "authResult", "Lcom/tinder/auth/model/AuthResult;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.observer.e */
public final class C10342e implements LoginObserver {
    /* renamed from: a */
    private final C9719k f33763a;

    public C10342e(@NotNull C9719k c9719k) {
        C2668g.b(c9719k, "profileInteractor");
        this.f33763a = c9719k;
    }

    public void onVerificationRequired() {
        C8293a.m35387a(this);
    }

    public void onLoggedIn(@NotNull C8288b c8288b) {
        C2668g.b(c8288b, "authResult");
        this.f33763a.m40219a();
    }
}
