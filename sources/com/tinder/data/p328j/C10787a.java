package com.tinder.data.p328j;

import com.tinder.api.TinderUserApi;
import com.tinder.domain.verification.VerificationRepository;
import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/verification/SmsVerificationDismissedRepository;", "Lcom/tinder/domain/verification/VerificationRepository;", "tinderUserApi", "Lcom/tinder/api/TinderUserApi;", "(Lcom/tinder/api/TinderUserApi;)V", "saveSmsCollectionModalDismissed", "Lio/reactivex/Completable;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.j.a */
public final class C10787a implements VerificationRepository {
    /* renamed from: a */
    private final TinderUserApi f35221a;

    public C10787a(@NotNull TinderUserApi tinderUserApi) {
        C2668g.b(tinderUserApi, "tinderUserApi");
        this.f35221a = tinderUserApi;
    }

    @NotNull
    public C3956a saveSmsCollectionModalDismissed() {
        C3956a postSmsCollectionDismissed = this.f35221a.postSmsCollectionDismissed();
        C2668g.a(postSmsCollectionDismissed, "tinderUserApi.postSmsCollectionDismissed()");
        return postSmsCollectionDismissed;
    }
}
