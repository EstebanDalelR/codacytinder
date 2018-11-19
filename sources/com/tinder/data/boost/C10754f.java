package com.tinder.data.boost;

import com.tinder.domain.boost.repository.BoostProfileFacesRepository;
import io.reactivex.C3956a;
import io.reactivex.C3958c;
import io.reactivex.C3960g;
import io.reactivex.functions.Action;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/data/boost/InMemoryBoostProfileFacesRepository;", "Lcom/tinder/domain/boost/repository/BoostProfileFacesRepository;", "()V", "profileFaceUrls", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "", "addProfileUrls", "Lio/reactivex/Single;", "", "urls", "", "clearUrls", "Lio/reactivex/Completable;", "loadNextUrl", "Lio/reactivex/Maybe;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.boost.f */
public final class C10754f implements BoostProfileFacesRepository {
    /* renamed from: a */
    private final ConcurrentLinkedQueue<String> f35151a = new ConcurrentLinkedQueue();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.boost.f$a */
    static final class C8624a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10754f f30476a;
        /* renamed from: b */
        final /* synthetic */ List f30477b;

        C8624a(C10754f c10754f, List list) {
            this.f30476a = c10754f;
            this.f30477b = list;
        }

        public /* synthetic */ Object call() {
            return Boolean.valueOf(m36769a());
        }

        /* renamed from: a */
        public final boolean m36769a() {
            return this.f30476a.f35151a.addAll(this.f30477b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.boost.f$c */
    static final class C8625c<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10754f f30478a;

        C8625c(C10754f c10754f) {
            this.f30478a = c10754f;
        }

        public /* synthetic */ Object call() {
            return m36770a();
        }

        /* renamed from: a */
        public final String m36770a() {
            return (String) this.f30478a.f35151a.poll();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.boost.f$b */
    static final class C10753b implements Action {
        /* renamed from: a */
        final /* synthetic */ C10754f f35150a;

        C10753b(C10754f c10754f) {
            this.f35150a = c10754f;
        }

        public final void run() {
            this.f35150a.f35151a.clear();
        }
    }

    @NotNull
    public C3958c<String> loadNextUrl() {
        C3958c<String> a = C3958c.a(new C8625c(this));
        C2668g.a(a, "Maybe.fromCallable { profileFaceUrls.poll() }");
        return a;
    }

    @NotNull
    public C3960g<Boolean> addProfileUrls(@NotNull List<String> list) {
        C2668g.b(list, "urls");
        list = C3960g.c(new C8624a(this, list));
        C2668g.a(list, "Single.fromCallable { pr…leFaceUrls.addAll(urls) }");
        return list;
    }

    @NotNull
    public C3956a clearUrls() {
        C3956a a = C3956a.a(new C10753b(this));
        C2668g.a(a, "Completable.fromAction { profileFaceUrls.clear() }");
        return a;
    }
}
