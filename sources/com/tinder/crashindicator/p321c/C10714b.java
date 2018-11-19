package com.tinder.crashindicator.p321c;

import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.domain.crash.gateway.CrashTimeStampGateway;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/crashindicator/usecase/ClearCrashStoreTimeStamp;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "crashTimeStampGateway", "Lcom/tinder/domain/crash/gateway/CrashTimeStampGateway;", "(Lcom/tinder/domain/crash/gateway/CrashTimeStampGateway;)V", "execute", "Lrx/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.crashindicator.c.b */
public final class C10714b implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final CrashTimeStampGateway f35075a;

    @Inject
    public C10714b(@NotNull CrashTimeStampGateway crashTimeStampGateway) {
        C2668g.b(crashTimeStampGateway, "crashTimeStampGateway");
        this.f35075a = crashTimeStampGateway;
    }

    @NotNull
    public Completable execute() {
        return this.f35075a.clear();
    }
}
