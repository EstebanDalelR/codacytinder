package com.tinder.domain.recs;

import com.tinder.domain.recs.model.Swipe;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&¨\u0006\r"}, d2 = {"Lcom/tinder/domain/recs/SwipeDataStore;", "", "addSwipe", "", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "observeSwipes", "Lrx/Observable;", "", "removeAllSwipes", "removeSwipe", "removeSwipes", "swipes", "engine_release"}, k = 1, mv = {1, 1, 9})
public interface SwipeDataStore {
    void addSwipe(@NotNull Swipe swipe);

    @NotNull
    Observable<Set<Swipe>> observeSwipes();

    void removeAllSwipes();

    void removeSwipe(@NotNull Swipe swipe);

    void removeSwipes(@NotNull Set<Swipe> set);
}
