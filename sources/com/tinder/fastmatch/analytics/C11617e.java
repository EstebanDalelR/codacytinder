package com.tinder.fastmatch.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/fastmatch/analytics/AddLikesYouPillCountCheckEvent;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "likesYouEtlEventFactory", "Lcom/tinder/fastmatch/analytics/LikesYouListEtlEventsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/fastmatch/analytics/LikesYouListEtlEventsFactory;)V", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.analytics.e */
public final class C11617e implements SimpleVoidUseCase {
    /* renamed from: a */
    private final C2630h f38028a;
    /* renamed from: b */
    private final LikesYouListEtlEventsFactory f38029b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.analytics.e$a */
    static final class C13917a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C11617e f44038a;

        C13917a(C11617e c11617e) {
            this.f44038a = c11617e;
        }

        public final void call() {
            this.f44038a.f38028a.a(this.f44038a.f38029b.m39243c());
        }
    }

    @Inject
    public C11617e(@NotNull C2630h c2630h, @NotNull LikesYouListEtlEventsFactory likesYouListEtlEventsFactory) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(likesYouListEtlEventsFactory, "likesYouEtlEventFactory");
        this.f38028a = c2630h;
        this.f38029b = likesYouListEtlEventsFactory;
    }

    public void execute() {
        Completable.a(new C13917a(this)).b(Schedulers.io()).b(RxUtils.b());
    }
}
