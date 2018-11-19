package com.tinder.data.fastmatch.usecase;

import com.tinder.api.TinderApi;
import com.tinder.api.response.FastMatchCountResponse;
import com.tinder.data.fastmatch.p324a.C10766a;
import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.domain.fastmatch.model.FastMatchCount;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.domain.fastmatch.model.FastMatchStatus.Source;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.meta.providers.AuthStatusProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Single;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/data/fastmatch/usecase/FetchFastMatchCount;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "api", "Lcom/tinder/api/TinderApi;", "adapter", "Lcom/tinder/data/fastmatch/adapter/FastMatchCountAdapter;", "provider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "authStatusProvider", "Lcom/tinder/domain/meta/providers/AuthStatusProvider;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/fastmatch/adapter/FastMatchCountAdapter;Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;Lcom/tinder/domain/meta/providers/AuthStatusProvider;)V", "execute", "Lrx/Completable;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.fastmatch.usecase.b */
public final class C10770b implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final TinderApi f35173a;
    /* renamed from: b */
    private final C10766a f35174b;
    /* renamed from: c */
    private final FastMatchStatusProvider f35175c;
    /* renamed from: d */
    private final AuthStatusProvider f35176d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/fastmatch/model/FastMatchCount;", "it", "Lcom/tinder/api/response/FastMatchCountResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.fastmatch.usecase.b$a */
    static final class C12866a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10770b f41314a;

        C12866a(C10770b c10770b) {
            this.f41314a = c10770b;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50506a((FastMatchCountResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final FastMatchCount m50506a(FastMatchCountResponse fastMatchCountResponse) {
            C10766a a = this.f41314a.f35174b;
            C2668g.a(fastMatchCountResponse, "it");
            return a.m43169a(fastMatchCountResponse);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lcom/tinder/domain/fastmatch/model/FastMatchCount;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.fastmatch.usecase.b$b */
    static final class C13802b<T> implements Action1<FastMatchCount> {
        /* renamed from: a */
        final /* synthetic */ C10770b f43809a;

        C13802b(C10770b c10770b) {
            this.f43809a = c10770b;
        }

        public /* synthetic */ void call(Object obj) {
            m53374a((FastMatchCount) obj);
        }

        /* renamed from: a */
        public final void m53374a(FastMatchCount fastMatchCount) {
            int component1 = fastMatchCount.component1();
            boolean component2 = fastMatchCount.component2();
            if (component1 >= 0) {
                this.f43809a.f35175c.update(FastMatchStatus.copy$default(this.f43809a.f35175c.get(), component1, component2, null, 0, Source.COUNT, 12, null));
            }
        }
    }

    @Inject
    public C10770b(@NotNull TinderApi tinderApi, @NotNull C10766a c10766a, @NotNull FastMatchStatusProvider fastMatchStatusProvider, @NotNull AuthStatusProvider authStatusProvider) {
        C2668g.b(tinderApi, "api");
        C2668g.b(c10766a, "adapter");
        C2668g.b(fastMatchStatusProvider, "provider");
        C2668g.b(authStatusProvider, "authStatusProvider");
        this.f35173a = tinderApi;
        this.f35174b = c10766a;
        this.f35175c = fastMatchStatusProvider;
        this.f35176d = authStatusProvider;
    }

    @NotNull
    public Completable execute() {
        if (this.f35176d.hasAuthToken()) {
            Single d = this.f35173a.fetchFastMatchCount().d(new C12866a(this)).d(new C13802b(this));
            Function1 function1 = FetchFastMatchCount$execute$3.f45132a;
            if (function1 != null) {
                function1 = new C13803c(function1);
            }
            Completable b = d.c((Action1) function1).b();
            C2668g.a(b, "api.fetchFastMatchCount(…         .toCompletable()");
            return b;
        }
        b = Completable.a(new IllegalStateException("No auth token, can't reach fast-match/count"));
        C2668g.a(b, "Completable.error(\n     …reach fast-match/count\"))");
        return b;
    }
}
