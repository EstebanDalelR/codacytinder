package com.tinder.data.places.p330b;

import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.domain.places.PlacesRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/places/usecase/FetchRecentPlacesFromApi;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "placesRepository", "Lcom/tinder/domain/places/PlacesRepository;", "(Lcom/tinder/domain/places/PlacesRepository;)V", "execute", "Lrx/Completable;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.places.b.d */
public final class C10896d implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final PlacesRepository f35590a;

    @Inject
    public C10896d(@NotNull PlacesRepository placesRepository) {
        C2668g.b(placesRepository, "placesRepository");
        this.f35590a = placesRepository;
    }

    @NotNull
    public Completable execute() {
        return this.f35590a.load();
    }
}
