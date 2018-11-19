package com.tinder.settings.p404b;

import com.tinder.listeners.ListenerDeleteAccount;
import com.tinder.managers.C2652a;
import com.tinder.managers.bj;
import javax.inject.Inject;

/* renamed from: com.tinder.settings.b.b */
public class C14865b {
    /* renamed from: a */
    private final bj f46540a;
    /* renamed from: b */
    private final C2652a f46541b;

    @Inject
    C14865b(bj bjVar, C2652a c2652a) {
        this.f46540a = bjVar;
        this.f46541b = c2652a;
    }

    /* renamed from: a */
    public void m56286a(ListenerDeleteAccount listenerDeleteAccount) {
        this.f46541b.a(listenerDeleteAccount);
    }

    /* renamed from: a */
    public void m56287a(boolean z, boolean z2) {
        if (!(z == this.f46540a.f() && z2 == this.f46540a.e())) {
            this.f46540a.f(true);
        }
        this.f46540a.d(z);
        this.f46540a.c(z2);
    }
}
