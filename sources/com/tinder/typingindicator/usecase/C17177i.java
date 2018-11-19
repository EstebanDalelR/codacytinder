package com.tinder.typingindicator.usecase;

import com.tinder.domain.common.reactivex.usecase.FlowableResultUseCase;
import io.reactivex.C3957b;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/typingindicator/usecase/ObserveThrottledTypingEmissions;", "Lcom/tinder/domain/common/reactivex/usecase/FlowableResultUseCase;", "", "observeTypingHeartbeat", "Lcom/tinder/typingindicator/usecase/ObserveTypingHeartbeat;", "typingEmissionsThrottler", "Lcom/tinder/typingindicator/usecase/TypingEmissionsThrottler;", "(Lcom/tinder/typingindicator/usecase/ObserveTypingHeartbeat;Lcom/tinder/typingindicator/usecase/TypingEmissionsThrottler;)V", "execute", "Lio/reactivex/Flowable;", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.usecase.i */
public final class C17177i implements FlowableResultUseCase<C15813i> {
    /* renamed from: a */
    private final C17181k f52719a;
    /* renamed from: b */
    private final C17190r f52720b;

    @Inject
    public C17177i(@NotNull C17181k c17181k, @NotNull C17190r c17190r) {
        C2668g.b(c17181k, "observeTypingHeartbeat");
        C2668g.b(c17190r, "typingEmissionsThrottler");
        this.f52719a = c17181k;
        this.f52720b = c17190r;
    }

    @NotNull
    public C3957b<C15813i> execute() {
        C3957b<C15813i> a = this.f52719a.execute().a(this.f52720b);
        C2668g.a(a, "observeTypingHeartbeat.e…typingEmissionsThrottler)");
        return a;
    }
}
