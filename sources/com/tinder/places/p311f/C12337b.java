package com.tinder.places.p311f;

import com.tinder.domain.common.usecase.ObservableResultUseCase;
import com.tinder.domain.places.PlacesRepository;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/places/usecase/FetchPlaces;", "Lcom/tinder/domain/common/usecase/ObservableResultUseCase;", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "placesRepository", "Lcom/tinder/domain/places/PlacesRepository;", "(Lcom/tinder/domain/places/PlacesRepository;)V", "execute", "Lrx/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.f.b */
public final class C12337b implements ObservableResultUseCase<PlaceUpdate> {
    /* renamed from: a */
    private final PlacesRepository f39938a;

    @Inject
    public C12337b(@NotNull PlacesRepository placesRepository) {
        C2668g.b(placesRepository, "placesRepository");
        this.f39938a = placesRepository;
    }

    @NotNull
    public Observable<PlaceUpdate> execute() {
        return this.f39938a.observe();
    }
}
