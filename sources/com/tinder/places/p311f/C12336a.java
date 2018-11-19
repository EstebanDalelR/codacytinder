package com.tinder.places.p311f;

import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.places.PlacesRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/places/usecase/DeletePlaces;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "", "", "placesRepository", "Lcom/tinder/domain/places/PlacesRepository;", "(Lcom/tinder/domain/places/PlacesRepository;)V", "execute", "Lrx/Completable;", "request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.f.a */
public final class C12336a implements CompletableUseCase<List<? extends String>> {
    /* renamed from: a */
    private final PlacesRepository f39937a;

    @Inject
    public C12336a(@NotNull PlacesRepository placesRepository) {
        C2668g.b(placesRepository, "placesRepository");
        this.f39937a = placesRepository;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m48720a((List) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m48720a(@NotNull List<String> list) {
        C2668g.b(list, "request");
        Iterable<String> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (String deletePlace : iterable) {
            arrayList.add(this.f39937a.deletePlace(deletePlace));
        }
        list = Completable.b((List) arrayList);
        C2668g.a(list, "Completable.mergeDelayEr…sitory.deletePlace(it) })");
        return list;
    }
}
