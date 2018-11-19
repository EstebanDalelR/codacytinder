package com.tinder.domain.match.repository;

import com.tinder.domain.common.model.Photo.Quality;
import com.tinder.domain.match.model.Match;
import java.util.List;
import java8.util.Optional;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;
import rx.Observable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\b2\u0006\u0010\u000e\u001a\u00020\u0006H&J$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00132\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0017\u001a\u00020\u0006H&J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005H&J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\bH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\bH&J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\b2\u0006\u0010\u001e\u001a\u00020\u0006H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J \u0010!\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H&J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%H&¨\u0006'"}, d2 = {"Lcom/tinder/domain/match/repository/MatchRepository;", "", "blockMatches", "Lrx/Completable;", "matchIds", "", "", "countMatches", "Lrx/Observable;", "", "countUnTouchedMatches", "deleteAll", "deleteExpiredSponsoredMatches", "deleteMatch", "matchId", "getMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "getMatchAvatarUrls", "Lrx/Single;", "photoQuality", "Lcom/tinder/domain/common/model/Photo$Quality;", "getMatchByUserId", "userId", "insertMatches", "matches", "loadMatches", "muteMatch", "observeLastMessageAdMatch", "search", "query", "unMatch", "unMuteMatch", "updateTouchAndLastActivityDate", "lastActivityDate", "Lorg/joda/time/DateTime;", "isTouched", "", "updateTouchState", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface MatchRepository {
    @NotNull
    Completable blockMatches(@NotNull List<String> list);

    @NotNull
    Observable<Long> countMatches();

    @NotNull
    Observable<Long> countUnTouchedMatches();

    @NotNull
    Completable deleteAll();

    @NotNull
    Completable deleteExpiredSponsoredMatches();

    @NotNull
    Completable deleteMatch(@NotNull String str);

    @NotNull
    Observable<Optional<Match>> getMatch(@NotNull String str);

    @NotNull
    Single<List<String>> getMatchAvatarUrls(@NotNull String str, @NotNull Quality quality);

    @NotNull
    Single<Match> getMatchByUserId(@NotNull String str);

    @NotNull
    Completable insertMatches(@NotNull List<? extends Match> list);

    @NotNull
    Observable<List<Match>> loadMatches();

    @NotNull
    Completable muteMatch(@NotNull String str);

    @NotNull
    Observable<Optional<Match>> observeLastMessageAdMatch();

    @NotNull
    Observable<List<Match>> search(@NotNull String str);

    @NotNull
    Completable unMatch(@NotNull String str);

    @NotNull
    Completable unMuteMatch(@NotNull String str);

    @NotNull
    Completable updateTouchAndLastActivityDate(@NotNull String str, @NotNull DateTime dateTime, boolean z);

    @NotNull
    Completable updateTouchState(@NotNull String str, boolean z);
}
