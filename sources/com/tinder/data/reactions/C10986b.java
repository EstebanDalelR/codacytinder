package com.tinder.data.reactions;

import com.tinder.domain.reactions.repository.StrikeReactionRepository;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/data/reactions/StrikeReactionDataRepository;", "Lcom/tinder/domain/reactions/repository/StrikeReactionRepository;", "strikeReactionStore", "Lcom/tinder/data/reactions/StrikeReactionStore;", "(Lcom/tinder/data/reactions/StrikeReactionStore;)V", "getStrikeId", "Lrx/Single;", "Ljava8/util/Optional;", "", "matchId", "upsertStrikeId", "Lrx/Completable;", "strikeId", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.reactions.b */
public final class C10986b implements StrikeReactionRepository {
    /* renamed from: a */
    private final StrikeReactionStore f35710a;

    public C10986b(@NotNull StrikeReactionStore strikeReactionStore) {
        C2668g.b(strikeReactionStore, "strikeReactionStore");
        this.f35710a = strikeReactionStore;
    }

    @NotNull
    public Single<Optional<String>> getStrikeId(@NotNull String str) {
        C2668g.b(str, "matchId");
        return this.f35710a.getStrikeId(str);
    }

    @NotNull
    public Completable upsertStrikeId(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "strikeId");
        return this.f35710a.upsertStrikeId(str, str2);
    }
}
