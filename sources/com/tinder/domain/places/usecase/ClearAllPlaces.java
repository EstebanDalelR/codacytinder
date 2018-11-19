package com.tinder.domain.places.usecase;

import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.domain.places.PlacesLoadedStateProvider;
import com.tinder.domain.places.PlacesRepository;
import com.tinder.domain.places.model.PlacesLoadedState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/places/usecase/ClearAllPlaces;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "stateProvider", "Lcom/tinder/domain/places/PlacesLoadedStateProvider;", "placesRepository", "Lcom/tinder/domain/places/PlacesRepository;", "(Lcom/tinder/domain/places/PlacesLoadedStateProvider;Lcom/tinder/domain/places/PlacesRepository;)V", "execute", "Lrx/Completable;", "setPlacesConfigCold", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ClearAllPlaces implements SimpleCompletableUseCase {
    private final PlacesRepository placesRepository;
    private final PlacesLoadedStateProvider stateProvider;

    @Inject
    public ClearAllPlaces(@NotNull PlacesLoadedStateProvider placesLoadedStateProvider, @NotNull PlacesRepository placesRepository) {
        C2668g.b(placesLoadedStateProvider, "stateProvider");
        C2668g.b(placesRepository, "placesRepository");
        this.stateProvider = placesLoadedStateProvider;
        this.placesRepository = placesRepository;
    }

    @NotNull
    public Completable execute() {
        Completable b = this.placesRepository.clearPlacesCache().b(new ClearAllPlaces$execute$1(this));
        C2668g.a(b, "placesRepository.clearPl…{ setPlacesConfigCold() }");
        return b;
    }

    private final void setPlacesConfigCold() {
        this.stateProvider.update(PlacesLoadedState.COLD);
    }
}
