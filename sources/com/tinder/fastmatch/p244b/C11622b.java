package com.tinder.fastmatch.p244b;

import com.tinder.domain.fastmatch.repository.FastMatchRecsResponseRepository;
import com.tinder.fastmatch.p244b.C11621a.C9375b;
import com.tinder.fastmatch.p244b.C11621a.C9375b.C11619a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/fastmatch/data/FastMatchRecsResponseDataRepository;", "Lcom/tinder/domain/fastmatch/repository/FastMatchRecsResponseRepository;", "fastMatchRecsApiClient", "Lcom/tinder/fastmatch/data/FastMatchRecsApiClient;", "(Lcom/tinder/fastmatch/data/FastMatchRecsApiClient;)V", "observeResponseUpdate", "Lrx/Observable;", "", "observeToken", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.b.b */
public final class C11622b implements FastMatchRecsResponseRepository {
    /* renamed from: a */
    private final C11621a f38042a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$RecResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.b.b$a */
    static final class C13185a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13185a f41876a = new C13185a();

        C13185a() {
        }

        /* renamed from: a */
        public final void m51135a(C9375b c9375b) {
        }

        public /* synthetic */ Object call(Object obj) {
            m51135a((C9375b) obj);
            return C15813i.f49016a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$RecResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.b.b$b */
    static final class C13186b<T, R> implements Func1<C9375b, Boolean> {
        /* renamed from: a */
        public static final C13186b f41877a = new C13186b();

        C13186b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51136a((C9375b) obj));
        }

        /* renamed from: a */
        public final boolean m51136a(C9375b c9375b) {
            return c9375b instanceof C11619a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$RecResponse$FirstPage;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.b.b$c */
    static final class C13187c<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        public static final C13187c f41878a = new C13187c();

        C13187c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51137a((C11619a) obj);
        }

        /* renamed from: a */
        public final Observable<String> m51137a(C11619a c11619a) {
            c11619a = c11619a.m47355a().data();
            if (c11619a != null) {
                c11619a = c11619a.newCountToken();
                if (c11619a != null) {
                    return Observable.a(c11619a);
                }
            }
            return Observable.c();
        }
    }

    public C11622b(@NotNull C11621a c11621a) {
        C2668g.b(c11621a, "fastMatchRecsApiClient");
        this.f38042a = c11621a;
    }

    @NotNull
    public Observable<String> observeToken() {
        Observable<String> h = this.f38042a.m47366b().f(C13186b.f41877a).a(C11619a.class).h(C13187c.f41878a);
        C2668g.a(h, "fastMatchRecsApiClient.o…(token)\n                }");
        return h;
    }

    @NotNull
    public Observable<C15813i> observeResponseUpdate() {
        Observable<C15813i> k = this.f38042a.m47366b().k(C13185a.f41876a);
        C2668g.a(k, "fastMatchRecsApiClient.o…ponse().map { _ -> Unit }");
        return k;
    }
}
