package com.tinder.places.p311f;

import com.tinder.domain.common.usecase.UseCase;
import com.tinder.domain.places.PlacesRepository;
import com.tinder.domain.recs.RecsEngine;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/places/usecase/GetRecsEngineForPlace;", "Lcom/tinder/domain/common/usecase/UseCase;", "", "Ljava8/util/Optional;", "Lcom/tinder/domain/recs/RecsEngine;", "placesRepository", "Lcom/tinder/domain/places/PlacesRepository;", "(Lcom/tinder/domain/places/PlacesRepository;)V", "execute", "Lrx/Observable;", "placeId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.f.e */
public final class C12340e implements UseCase<String, Optional<RecsEngine>> {
    /* renamed from: a */
    private final PlacesRepository f39941a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Lcom/tinder/domain/recs/RecsEngine;", "kotlin.jvm.PlatformType", "it", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.f.e$a */
    static final class C13574a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13574a f43310a = new C13574a();

        C13574a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m52994a((RecsEngine) obj);
        }

        /* renamed from: a */
        public final Optional<RecsEngine> m52994a(RecsEngine recsEngine) {
            return Optional.a(recsEngine);
        }
    }

    @Inject
    public C12340e(@NotNull PlacesRepository placesRepository) {
        C2668g.b(placesRepository, "placesRepository");
        this.f39941a = placesRepository;
    }

    public /* synthetic */ Observable execute(Object obj) {
        return m48723a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public Observable<Optional<RecsEngine>> m48723a(@NotNull String str) {
        C2668g.b(str, "placeId");
        str = this.f39941a.addEngineIfAbsent(str).a().k(C13574a.f43310a);
        C2668g.a(str, "placesRepository.addEngi…).map { Optional.of(it) }");
        return str;
    }
}
