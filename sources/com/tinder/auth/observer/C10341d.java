package com.tinder.auth.observer;

import com.tinder.auth.model.C8288b;
import com.tinder.auth.p168c.C8274f;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/auth/observer/SaveLedgerAuthObserver;", "Lcom/tinder/auth/observer/AuthObserver;", "saveAuthLedger", "Lcom/tinder/auth/usecase/SaveAuthLedger;", "(Lcom/tinder/auth/usecase/SaveAuthLedger;)V", "onAuthenticated", "", "authResult", "Lcom/tinder/auth/model/AuthResult;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.observer.d */
public final class C10341d implements AuthObserver {
    /* renamed from: a */
    private final C8274f f33762a;

    public C10341d(@NotNull C8274f c8274f) {
        C2668g.b(c8274f, "saveAuthLedger");
        this.f33762a = c8274f;
    }

    public void onAuthenticated(@NotNull C8288b c8288b) {
        C2668g.b(c8288b, "authResult");
        this.f33762a.m35325a(c8288b).d();
    }
}
