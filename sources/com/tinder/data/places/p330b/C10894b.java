package com.tinder.data.places.p330b;

import com.tinder.domain.common.usecase.SingleResultUseCase;
import com.tinder.domain.places.PlacesRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/data/places/usecase/CountPlacesInCache;", "Lcom/tinder/domain/common/usecase/SingleResultUseCase;", "", "placesRepository", "Lcom/tinder/domain/places/PlacesRepository;", "(Lcom/tinder/domain/places/PlacesRepository;)V", "execute", "Lrx/Single;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.places.b.b */
public final class C10894b implements SingleResultUseCase<Integer> {
    /* renamed from: a */
    private final PlacesRepository f35588a;

    @Inject
    public C10894b(@NotNull PlacesRepository placesRepository) {
        C2668g.b(placesRepository, "placesRepository");
        this.f35588a = placesRepository;
    }

    @NotNull
    public Single<Integer> execute() {
        return this.f35588a.getCount();
    }
}
