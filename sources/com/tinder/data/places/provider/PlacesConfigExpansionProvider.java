package com.tinder.data.places.provider;

import com.tinder.domain.places.model.PlacesConfigExpansion;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/tinder/data/places/provider/PlacesConfigExpansionProvider;", "", "get", "Lcom/tinder/domain/places/model/PlacesConfigExpansion;", "observe", "Lrx/Observable;", "update", "", "config", "data_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesConfigExpansionProvider {
    @NotNull
    PlacesConfigExpansion get();

    @NotNull
    Observable<PlacesConfigExpansion> observe();

    void update(@NotNull PlacesConfigExpansion placesConfigExpansion);
}
