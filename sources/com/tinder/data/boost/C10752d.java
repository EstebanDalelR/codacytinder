package com.tinder.data.boost;

import com.tinder.domain.boost.repository.BoostStatusRepository;
import io.reactivex.C3960g;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Lcom/tinder/data/boost/BoostStatusProviderBackedRepository;", "Lcom/tinder/domain/boost/repository/BoostStatusRepository;", "boostStatusProvider", "Lcom/tinder/data/boost/BoostStatusProvider;", "(Lcom/tinder/data/boost/BoostStatusProvider;)V", "isBoosting", "Lio/reactivex/Single;", "", "()Lio/reactivex/Single;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.boost.d */
public final class C10752d implements BoostStatusRepository {
    /* renamed from: a */
    private final BoostStatusProvider f35149a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.boost.d$a */
    static final class C8623a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10752d f30475a;

        C8623a(C10752d c10752d) {
            this.f30475a = c10752d;
        }

        public /* synthetic */ Object call() {
            return Boolean.valueOf(m36768a());
        }

        /* renamed from: a */
        public final boolean m36768a() {
            return this.f30475a.f35149a.isUserBoosting();
        }
    }

    @Inject
    public C10752d(@NotNull BoostStatusProvider boostStatusProvider) {
        C2668g.b(boostStatusProvider, "boostStatusProvider");
        this.f35149a = boostStatusProvider;
    }

    @NotNull
    public C3960g<Boolean> isBoosting() {
        C3960g<Boolean> c = C3960g.c(new C8623a(this));
        C2668g.a(c, "Single.fromCallable { bo…Provider.isUserBoosting }");
        return c;
    }
}
