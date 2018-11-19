package com.tinder.auth.observer;

import com.tinder.auth.model.C8288b;
import com.tinder.auth.observer.LoginObserver.C8293a;
import com.tinder.managers.bj;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/auth/observer/ManagerSettingsLoginObserver;", "Lcom/tinder/auth/observer/LoginObserver;", "managerSettings", "Lcom/tinder/managers/ManagerSettings;", "(Lcom/tinder/managers/ManagerSettings;)V", "onLoggedIn", "", "authResult", "Lcom/tinder/auth/model/AuthResult;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.observer.c */
public final class C10340c implements LoginObserver {
    /* renamed from: a */
    private final bj f33761a;

    public C10340c(@NotNull bj bjVar) {
        C2668g.b(bjVar, "managerSettings");
        this.f33761a = bjVar;
    }

    public void onVerificationRequired() {
        C8293a.m35387a(this);
    }

    public void onLoggedIn(@NotNull C8288b c8288b) {
        C2668g.b(c8288b, "authResult");
        this.f33761a.b(true);
    }
}