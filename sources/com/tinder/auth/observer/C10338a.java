package com.tinder.auth.observer;

import com.tinder.analytics.experiment.C6220a;
import com.tinder.analytics.experiment.VariantResetReason;
import com.tinder.auth.model.C8288b;
import com.tinder.auth.observer.LoginObserver.C8293a;
import com.tinder.auth.repository.AuthSessionRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/auth/observer/AbTestVariantsObserver;", "Lcom/tinder/auth/observer/LoginObserver;", "authSessionRepository", "Lcom/tinder/auth/repository/AuthSessionRepository;", "abTestVariantsReporter", "Lcom/tinder/analytics/experiment/AbTestVariantsReporter;", "(Lcom/tinder/auth/repository/AuthSessionRepository;Lcom/tinder/analytics/experiment/AbTestVariantsReporter;)V", "onLoggedIn", "", "authResult", "Lcom/tinder/auth/model/AuthResult;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.observer.a */
public final class C10338a implements LoginObserver {
    /* renamed from: a */
    private final AuthSessionRepository f33758a;
    /* renamed from: b */
    private final C6220a f33759b;

    @Inject
    public C10338a(@NotNull AuthSessionRepository authSessionRepository, @NotNull C6220a c6220a) {
        C2668g.b(authSessionRepository, "authSessionRepository");
        C2668g.b(c6220a, "abTestVariantsReporter");
        this.f33758a = authSessionRepository;
        this.f33759b = c6220a;
    }

    public void onVerificationRequired() {
        C8293a.m35387a(this);
    }

    public void onLoggedIn(@NotNull C8288b c8288b) {
        C2668g.b(c8288b, "authResult");
        if (this.f33758a.authSession().mo9233a() == null) {
            this.f33759b.a(VariantResetReason.FRESH_INSTALL);
        }
    }
}
