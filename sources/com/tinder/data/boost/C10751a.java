package com.tinder.data.boost;

import com.tinder.domain.boost.repository.BoostCursorRepository;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.functions.Action;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0007H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/data/boost/BoostCursorModelRepository;", "Lcom/tinder/domain/boost/repository/BoostCursorRepository;", "boostCursorModel", "Lcom/tinder/data/boost/BoostCursorModel;", "(Lcom/tinder/data/boost/BoostCursorModel;)V", "boostCursor", "Lio/reactivex/Single;", "", "getBoostCursor", "()Lio/reactivex/Single;", "setBoostCursor", "Lio/reactivex/Completable;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.boost.a */
public final class C10751a implements BoostCursorRepository {
    /* renamed from: a */
    private final BoostCursorModel f35148a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.boost.a$a */
    static final class C8621a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10751a f30474a;

        C8621a(C10751a c10751a) {
            this.f30474a = c10751a;
        }

        public /* synthetic */ Object call() {
            return m36767a();
        }

        @NotNull
        /* renamed from: a */
        public final String m36767a() {
            return this.f30474a.f35148a.getBoostCursor();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.boost.a$b */
    static final class C10750b implements Action {
        /* renamed from: a */
        final /* synthetic */ C10751a f35146a;
        /* renamed from: b */
        final /* synthetic */ String f35147b;

        C10750b(C10751a c10751a, String str) {
            this.f35146a = c10751a;
            this.f35147b = str;
        }

        public final void run() {
            this.f35146a.f35148a.setBoostCursor(this.f35147b);
        }
    }

    @Inject
    public C10751a(@NotNull BoostCursorModel boostCursorModel) {
        C2668g.b(boostCursorModel, "boostCursorModel");
        this.f35148a = boostCursorModel;
    }

    @NotNull
    public C3960g<String> getBoostCursor() {
        C3960g<String> c = C3960g.c(new C8621a(this));
        C2668g.a(c, "Single.fromCallable { bo…CursorModel.boostCursor }");
        return c;
    }

    @NotNull
    public C3956a setBoostCursor(@NotNull String str) {
        C2668g.b(str, "boostCursor");
        str = C3956a.a(new C10750b(this, str));
        C2668g.a(str, "Completable.fromAction {…ostCursor = boostCursor }");
        return str;
    }
}
