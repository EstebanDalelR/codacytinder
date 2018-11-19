package com.tinder.data.fastmatch.usecase;

import com.tinder.api.TinderApi;
import com.tinder.api.model.fastmatch.FastMatchPreviewResponse;
import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.domain.fastmatch.model.FastMatchStatus.Source;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.meta.providers.AuthStatusProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/data/fastmatch/usecase/FetchFastMatchPreview;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "api", "Lcom/tinder/api/TinderApi;", "provider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "authStatusProvider", "Lcom/tinder/domain/meta/providers/AuthStatusProvider;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;Lcom/tinder/domain/meta/providers/AuthStatusProvider;)V", "execute", "Lrx/Completable;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.fastmatch.usecase.d */
public final class C10771d implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final TinderApi f35177a;
    /* renamed from: b */
    private final FastMatchStatusProvider f35178b;
    /* renamed from: c */
    private final AuthStatusProvider f35179c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lcom/tinder/api/model/fastmatch/FastMatchPreviewResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.fastmatch.usecase.d$a */
    static final class C13804a<T> implements Action1<FastMatchPreviewResponse> {
        /* renamed from: a */
        final /* synthetic */ C10771d f43811a;

        C13804a(C10771d c10771d) {
            this.f43811a = c10771d;
        }

        public /* synthetic */ void call(Object obj) {
            m53375a((FastMatchPreviewResponse) obj);
        }

        /* renamed from: a */
        public final void m53375a(FastMatchPreviewResponse fastMatchPreviewResponse) {
            byte[] component1 = fastMatchPreviewResponse.component1();
            boolean component2 = fastMatchPreviewResponse.component2();
            int component3 = fastMatchPreviewResponse.component3();
            FastMatchStatus fastMatchStatus = this.f43811a.f35178b.get();
            if (component1 != null) {
                fastMatchStatus = FastMatchStatus.copy$default(fastMatchStatus, 0, false, component1, System.currentTimeMillis(), null, 19, null);
            }
            FastMatchStatus fastMatchStatus2 = fastMatchStatus;
            r0.f43811a.f35178b.update(FastMatchStatus.copy$default(component3 >= 0 ? FastMatchStatus.copy$default(fastMatchStatus2, component3, false, null, 0, null, 30, null) : fastMatchStatus2, 0, component2, null, 0, Source.PREVIEW, 13, null));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.fastmatch.usecase.d$b */
    static final class C13805b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C10771d f43812a;

        C13805b(C10771d c10771d) {
            this.f43812a = c10771d;
        }

        public /* synthetic */ void call(Object obj) {
            m53376a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53376a(Throwable th) {
            C0001a.c(th);
            this.f43812a.f35178b.update(FastMatchStatus.Companion.getEmptyState());
        }
    }

    @Inject
    public C10771d(@NotNull TinderApi tinderApi, @NotNull FastMatchStatusProvider fastMatchStatusProvider, @NotNull AuthStatusProvider authStatusProvider) {
        C2668g.b(tinderApi, "api");
        C2668g.b(fastMatchStatusProvider, "provider");
        C2668g.b(authStatusProvider, "authStatusProvider");
        this.f35177a = tinderApi;
        this.f35178b = fastMatchStatusProvider;
        this.f35179c = authStatusProvider;
    }

    @NotNull
    public Completable execute() {
        if (this.f35179c.hasAuthToken()) {
            Completable b = this.f35177a.fetchFastMatchPreview().d(new C13804a(this)).c(new C13805b(this)).b();
            C2668g.a(b, "api.fetchFastMatchPrevie…         .toCompletable()");
            return b;
        }
        b = Completable.a(new IllegalStateException("No auth token, can't reach fast-match/preview"));
        C2668g.a(b, "Completable.error(\n     …ach fast-match/preview\"))");
        return b;
    }
}
