package com.tinder.fastmatch.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.fastmatch.analytics.LikesYouListEtlEventsFactory.PillResetSource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/fastmatch/analytics/AddLikesYouPillResetEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/fastmatch/analytics/LikesYouListEtlEventsFactory$PillResetSource;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "likesYouEtlEventFactory", "Lcom/tinder/fastmatch/analytics/LikesYouListEtlEventsFactory;", "fastMatchSessionManager", "Lcom/tinder/fastmatch/analytics/FastMatchSessionManager;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/fastmatch/analytics/LikesYouListEtlEventsFactory;Lcom/tinder/fastmatch/analytics/FastMatchSessionManager;)V", "execute", "", "from", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.analytics.f */
public final class C11618f implements VoidUseCase<PillResetSource> {
    /* renamed from: a */
    private final C2630h f38030a;
    /* renamed from: b */
    private final LikesYouListEtlEventsFactory f38031b;
    /* renamed from: c */
    private final C9372g f38032c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.analytics.f$a */
    static final class C13918a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C11618f f44039a;
        /* renamed from: b */
        final /* synthetic */ PillResetSource f44040b;

        C13918a(C11618f c11618f, PillResetSource pillResetSource) {
            this.f44039a = c11618f;
            this.f44040b = pillResetSource;
        }

        public final void call() {
            this.f44039a.f38030a.a(this.f44039a.f38031b.m39241a((Number) Integer.valueOf(this.f44040b.getSource())));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.analytics.f$b */
    static final class C13919b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C11618f f44041a;

        C13919b(C11618f c11618f) {
            this.f44041a = c11618f;
        }

        public final void call() {
            this.f44041a.f38032c.m39266r();
            this.f44041a.f38032c.m39267s();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.analytics.f$c */
    static final class C13920c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13920c f44042a = new C13920c();

        C13920c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53449a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53449a(Throwable th) {
            C0001a.c(th, "Failed to add AddLikesYouPillResetEvent to fireworkds", new Object[0]);
        }
    }

    @Inject
    public C11618f(@NotNull C2630h c2630h, @NotNull LikesYouListEtlEventsFactory likesYouListEtlEventsFactory, @NotNull C9372g c9372g) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(likesYouListEtlEventsFactory, "likesYouEtlEventFactory");
        C2668g.b(c9372g, "fastMatchSessionManager");
        this.f38030a = c2630h;
        this.f38031b = likesYouListEtlEventsFactory;
        this.f38032c = c9372g;
    }

    public /* synthetic */ void execute(Object obj) {
        m47354a((PillResetSource) obj);
    }

    /* renamed from: a */
    public void m47354a(@NotNull PillResetSource pillResetSource) {
        C2668g.b(pillResetSource, ManagerWebServices.PARAM_FROM);
        Completable.a(new C13918a(this, pillResetSource)).b(Schedulers.io()).a(new C13919b(this), C13920c.f44042a);
    }
}
