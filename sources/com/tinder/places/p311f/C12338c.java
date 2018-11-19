package com.tinder.places.p311f;

import com.tinder.domain.common.usecase.SingleUseCase;
import com.tinder.domain.places.PlacesRepository;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Found;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/places/usecase/GetPlace;", "Lcom/tinder/domain/common/usecase/SingleUseCase;", "", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Found;", "placesRepository", "Lcom/tinder/domain/places/PlacesRepository;", "(Lcom/tinder/domain/places/PlacesRepository;)V", "execute", "Lrx/Single;", "placeId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.f.c */
public final class C12338c implements SingleUseCase<String, Found> {
    /* renamed from: a */
    private final PlacesRepository f39939a;

    @Inject
    public C12338c(@NotNull PlacesRepository placesRepository) {
        C2668g.b(placesRepository, "placesRepository");
        this.f39939a = placesRepository;
    }

    public /* synthetic */ Single execute(Object obj) {
        return m48721a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public Single<Found> m48721a(@NotNull String str) {
        C2668g.b(str, "placeId");
        return this.f39939a.find(str);
    }
}
