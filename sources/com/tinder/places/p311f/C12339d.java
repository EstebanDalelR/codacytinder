package com.tinder.places.p311f;

import com.tinder.domain.common.usecase.UseCase;
import com.tinder.domain.places.PlacesRepository;
import com.tinder.domain.places.PlacesRepository.PlaceVisitorInfo;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/places/usecase/GetPlaceVisitorInfo;", "Lcom/tinder/domain/common/usecase/UseCase;", "", "Lcom/tinder/domain/places/PlacesRepository$PlaceVisitorInfo;", "placesRepository", "Lcom/tinder/domain/places/PlacesRepository;", "(Lcom/tinder/domain/places/PlacesRepository;)V", "execute", "Lrx/Observable;", "request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.f.d */
public final class C12339d implements UseCase<String, PlaceVisitorInfo> {
    /* renamed from: a */
    private final PlacesRepository f39940a;

    @Inject
    public C12339d(@NotNull PlacesRepository placesRepository) {
        C2668g.b(placesRepository, "placesRepository");
        this.f39940a = placesRepository;
    }

    public /* synthetic */ Observable execute(Object obj) {
        return m48722a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public Observable<PlaceVisitorInfo> m48722a(@NotNull String str) {
        C2668g.b(str, "request");
        return this.f39940a.getVisitorInfo(str);
    }
}
