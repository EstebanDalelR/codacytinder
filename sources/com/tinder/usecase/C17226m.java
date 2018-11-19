package com.tinder.usecase;

import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/usecase/StopBillingTimeoutJob;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "jobDispatcher", "Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;", "(Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;)V", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.usecase.m */
public final class C17226m implements SimpleVoidUseCase {
    /* renamed from: a */
    private final FirebaseJobDispatcher f52806a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.usecase.m$a */
    static final class C18987a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C17226m f58729a;

        C18987a(C17226m c17226m) {
            this.f58729a = c17226m;
        }

        public final void call() {
            this.f58729a.f52806a.a("billing-timeout-report-job");
        }
    }

    @Inject
    public C17226m(@NotNull FirebaseJobDispatcher firebaseJobDispatcher) {
        C2668g.b(firebaseJobDispatcher, "jobDispatcher");
        this.f52806a = firebaseJobDispatcher;
    }

    public void execute() {
        Completable.a(new C18987a(this)).b(Schedulers.io()).b(RxUtils.b());
    }
}
