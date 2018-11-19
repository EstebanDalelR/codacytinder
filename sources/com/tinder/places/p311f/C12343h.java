package com.tinder.places.p311f;

import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.model.PlacesConfig;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/places/usecase/MarkPlacesRecsTutorialAsSeen;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "placesConfigProvider", "Lcom/tinder/domain/places/PlacesConfigProvider;", "(Lcom/tinder/domain/places/PlacesConfigProvider;)V", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.f.h */
public final class C12343h implements SimpleVoidUseCase {
    /* renamed from: a */
    private final PlacesConfigProvider f39944a;

    @Inject
    public C12343h(@NotNull PlacesConfigProvider placesConfigProvider) {
        C2668g.b(placesConfigProvider, "placesConfigProvider");
        this.f39944a = placesConfigProvider;
    }

    public void execute() {
        this.f39944a.update(PlacesConfig.copy$default(this.f39944a.get(), 0, null, false, true, 7, null));
    }
}
