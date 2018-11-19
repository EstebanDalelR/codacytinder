package com.tinder.domain.reactions.repository;

import java8.util.Optional;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/tinder/domain/reactions/repository/StrikeReactionRepository;", "", "getStrikeId", "Lrx/Single;", "Ljava8/util/Optional;", "", "matchId", "upsertStrikeId", "Lrx/Completable;", "strikeId", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface StrikeReactionRepository {
    @NotNull
    Single<Optional<String>> getStrikeId(@NotNull String str);

    @NotNull
    Completable upsertStrikeId(@NotNull String str, @NotNull String str2);
}
