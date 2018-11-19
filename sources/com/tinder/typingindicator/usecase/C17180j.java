package com.tinder.typingindicator.usecase;

import com.tinder.domain.common.reactivex.usecase.FlowableResultUseCase;
import io.reactivex.C3957b;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/typingindicator/usecase/ObserveTypingEmissions;", "Lcom/tinder/domain/common/reactivex/usecase/FlowableResultUseCase;", "", "observeTextInputChanges", "Lcom/tinder/typingindicator/usecase/ObserveTextInputChanges;", "(Lcom/tinder/typingindicator/usecase/ObserveTextInputChanges;)V", "execute", "Lio/reactivex/Flowable;", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.usecase.j */
public final class C17180j implements FlowableResultUseCase<C15813i> {
    /* renamed from: a */
    private final C17176h f52723a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.usecase.j$a */
    static final class C17178a<T> implements Predicate<String> {
        /* renamed from: a */
        public static final C17178a f52721a = new C17178a();

        C17178a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m63049a((String) obj);
        }

        /* renamed from: a */
        public final boolean m63049a(@NotNull String str) {
            C2668g.b(str, "it");
            return ((CharSequence) str).length() > null ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.usecase.j$b */
    static final class C17179b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C17179b f52722a = new C17179b();

        C17179b() {
        }

        /* renamed from: a */
        public final void m63050a(@NotNull String str) {
            C2668g.b(str, "it");
        }

        public /* synthetic */ Object apply(Object obj) {
            m63050a((String) obj);
            return C15813i.f49016a;
        }
    }

    @Inject
    public C17180j(@NotNull C17176h c17176h) {
        C2668g.b(c17176h, "observeTextInputChanges");
        this.f52723a = c17176h;
    }

    @NotNull
    public C3957b<C15813i> execute() {
        C3957b<C15813i> f = this.f52723a.execute().a(C17178a.f52721a).f(C17179b.f52722a);
        C2668g.a(f, "observeTextInputChanges\n…            .map { Unit }");
        return f;
    }
}
