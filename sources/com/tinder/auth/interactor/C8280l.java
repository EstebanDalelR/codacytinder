package com.tinder.auth.interactor;

import android.support.annotation.NonNull;
import com.tinder.auth.model.AuthType;
import com.tinder.managers.C2652a;
import com.tinder.typingindicator.worker.TypingIndicatorWorker;
import com.tinder.updates.UpdatesScheduler;
import io.reactivex.C3956a;
import javax.inject.Inject;

/* renamed from: com.tinder.auth.interactor.l */
public class C8280l {
    @NonNull
    /* renamed from: a */
    private final C2652a f29533a;
    @NonNull
    /* renamed from: b */
    private final C10333h f29534b;
    @NonNull
    /* renamed from: c */
    private final UpdatesScheduler f29535c;
    @NonNull
    /* renamed from: d */
    private final TypingIndicatorWorker f29536d;

    @Inject
    C8280l(@NonNull C2652a c2652a, @NonNull C10333h c10333h, @NonNull UpdatesScheduler updatesScheduler, @NonNull TypingIndicatorWorker typingIndicatorWorker) {
        this.f29533a = c2652a;
        this.f29534b = c10333h;
        this.f29535c = updatesScheduler;
        this.f29536d = typingIndicatorWorker;
    }

    /* renamed from: a */
    public C3956a m35343a(AuthType authType) {
        return C3956a.a(new C10334m(this, authType));
    }

    /* renamed from: b */
    final /* synthetic */ void m35344b(AuthType authType) throws Exception {
        this.f29533a.a(true);
        this.f29535c.schedule();
        this.f29534b.m42132a(authType, true);
        this.f29536d.start();
    }
}
