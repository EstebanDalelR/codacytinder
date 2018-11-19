package com.tinder.domain.places;

import com.tinder.domain.places.model.PlacesConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/places/PlacesConfigProvider;", "", "clear", "Lrx/Completable;", "get", "Lcom/tinder/domain/places/model/PlacesConfig;", "observe", "Lrx/Observable;", "update", "", "config", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesConfigProvider {
    @NotNull
    Completable clear();

    @NotNull
    PlacesConfig get();

    @NotNull
    Observable<PlacesConfig> observe();

    void update(@NotNull PlacesConfig placesConfig);
}
