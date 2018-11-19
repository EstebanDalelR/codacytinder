package com.tinder.fireboarding.domain;

import io.reactivex.C3956a;
import io.reactivex.C3959e;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\tH&¨\u0006\n"}, d2 = {"Lcom/tinder/fireboarding/domain/CompletedLevelRepository;", "", "completeLevel", "Lio/reactivex/Completable;", "level", "Lcom/tinder/fireboarding/domain/Level;", "getCompletedLevels", "", "observeCompletedLevels", "Lio/reactivex/Observable;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
public interface CompletedLevelRepository {
    @NotNull
    C3956a completeLevel(@NotNull Level level);

    @NotNull
    Set<Level> getCompletedLevels();

    @NotNull
    C3959e<Set<Level>> observeCompletedLevels();
}
