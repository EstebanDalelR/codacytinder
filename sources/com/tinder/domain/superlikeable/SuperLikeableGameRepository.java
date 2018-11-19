package com.tinder.domain.superlikeable;

import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import java8.util.Optional;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/tinder/domain/superlikeable/SuperLikeableGameRepository;", "", "load", "Lrx/Single;", "Ljava8/util/Optional;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "skipGame", "Lrx/Completable;", "superLikeOnRec", "userRec", "Lcom/tinder/domain/recs/model/UserRec;", "SkipRequestPendingException", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface SuperLikeableGameRepository {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/domain/superlikeable/SuperLikeableGameRepository$SkipRequestPendingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class SkipRequestPendingException extends RuntimeException {
    }

    @NotNull
    Single<Optional<SuperLikeableGame>> load();

    @NotNull
    Completable skipGame();

    @NotNull
    Completable superLikeOnRec(@NotNull UserRec userRec);
}
