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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/fastmatch/analytics/AddLikesYouPillChangeEvent;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "likesYouEtlEventFactory", "Lcom/tinder/fastmatch/analytics/LikesYouListEtlEventsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/fastmatch/analytics/LikesYouListEtlEventsFactory;)V", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.analytics.d */
public final class C11616d implements SimpleVoidUseCase {
    /* renamed from: a */
    private final C2630h f38026a;
    /* renamed from: b */
    private final LikesYouListEtlEventsFactory f38027b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.analytics.d$a */
    static final class C13916a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C11616d f44037a;

        C13916a(C11616d c11616d) {
            this.f44037a = c11616d;
        }

        public final void call() {
            this.f44037a.f38026a.a(this.f44037a.f38027b.m39242b());
        }
    }

    @Inject
    public C11616d(@NotNull C2630h c2630h, @NotNull LikesYouListEtlEventsFactory likesYouListEtlEventsFactory) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(likesYouListEtlEventsFactory, "likesYouEtlEventFactory");
        this.f38026a = c2630h;
        this.f38027b = likesYouListEtlEventsFactory;
    }

    public void execute() {
        Completable.a(new C13916a(this)).b(Schedulers.io()).b(RxUtils.b());
    }
}
