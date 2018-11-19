package com.tinder.auth.observer;

import com.tinder.auth.model.C8288b;
import com.tinder.managers.C2652a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/auth/observer/AuthenticationManagerLoginObserver;", "Lcom/tinder/auth/observer/LoginObserver;", "authenticationManager", "Lcom/tinder/managers/AuthenticationManager;", "(Lcom/tinder/managers/AuthenticationManager;)V", "onLoggedIn", "", "authResult", "Lcom/tinder/auth/model/AuthResult;", "onVerificationRequired", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.observer.b */
public final class C10339b implements LoginObserver {
    /* renamed from: a */
    private final C2652a f33760a;

    public C10339b(@NotNull C2652a c2652a) {
        C2668g.b(c2652a, "authenticationManager");
        this.f33760a = c2652a;
    }

    public void onLoggedIn(@NotNull C8288b c8288b) {
        C2668g.b(c8288b, "authResult");
        this.f33760a.a(true);
    }

    public void onVerificationRequired() {
        this.f33760a.a(false);
    }
}
