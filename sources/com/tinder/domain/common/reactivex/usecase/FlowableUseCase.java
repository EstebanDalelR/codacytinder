package com.tinder.domain.common.reactivex.usecase;

import io.reactivex.C3957b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/domain/common/reactivex/usecase/FlowableUseCase;", "REQUEST", "RESULT", "", "execute", "Lio/reactivex/Flowable;", "request", "(Ljava/lang/Object;)Lio/reactivex/Flowable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface FlowableUseCase<REQUEST, RESULT> {
    @NotNull
    C3957b<RESULT> execute(REQUEST request);
}
