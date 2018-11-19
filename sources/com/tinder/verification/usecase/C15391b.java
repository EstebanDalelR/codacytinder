package com.tinder.verification.usecase;

import com.tinder.domain.verification.VerificationRepository;
import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/verification/usecase/SaveSmsVerificationDismissed;", "", "verificationRepository", "Lcom/tinder/domain/verification/VerificationRepository;", "(Lcom/tinder/domain/verification/VerificationRepository;)V", "execute", "Lio/reactivex/Completable;", "verification_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.verification.usecase.b */
public final class C15391b {
    /* renamed from: a */
    private final VerificationRepository f47664a;

    public C15391b(@NotNull VerificationRepository verificationRepository) {
        C2668g.b(verificationRepository, "verificationRepository");
        this.f47664a = verificationRepository;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m57722a() {
        return this.f47664a.saveSmsCollectionModalDismissed();
    }
}
