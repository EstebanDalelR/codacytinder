package com.tinder.domain.message;

import java.util.List;
import java.util.Map;
import java8.util.Optional;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;
import rx.Observable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0016\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005H&J\u001a\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00170\bH&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0010H&J\b\u0010\u001b\u001a\u00020\u0003H&J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b2\u0006\u0010\u001a\u001a\u00020\u0010H&J$\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u000bH&J$\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0 0\b2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006$"}, d2 = {"Lcom/tinder/domain/message/MessageRepository;", "", "addMessages", "Lrx/Completable;", "messages", "", "Lcom/tinder/domain/message/Message;", "countDistinctMatchesFromMessagesSinceDate", "Lrx/Observable;", "", "dateTime", "Lorg/joda/time/DateTime;", "createMessage", "message", "deleteFailedMessage", "messageId", "", "getMessage", "Lrx/Single;", "insertLikes", "messageLikes", "Lcom/tinder/domain/message/MessageLike;", "latestMessageByMatch", "", "likeMessage", "markAllMessagesAsSeenForMatchId", "matchId", "markAllPendingAsFailed", "messagesForMatch", "messagesForMatchSinceSentDate", "sinceSentDate", "minSentDateForPageSize", "Ljava8/util/Optional;", "pageSize", "", "unlikeMessage", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface MessageRepository {
    @NotNull
    Completable addMessages(@NotNull List<? extends Message> list);

    @NotNull
    Observable<Long> countDistinctMatchesFromMessagesSinceDate(@NotNull DateTime dateTime);

    @NotNull
    Completable createMessage(@NotNull Message message);

    @NotNull
    Completable deleteFailedMessage(@NotNull String str);

    @NotNull
    Single<Message> getMessage(@NotNull String str);

    @NotNull
    Completable insertLikes(@NotNull List<MessageLike> list);

    @NotNull
    Observable<Map<String, Message>> latestMessageByMatch();

    @NotNull
    Completable likeMessage(@NotNull String str);

    @NotNull
    Completable markAllMessagesAsSeenForMatchId(@NotNull String str);

    @NotNull
    Completable markAllPendingAsFailed();

    @NotNull
    Observable<List<Message>> messagesForMatch(@NotNull String str);

    @NotNull
    Observable<List<Message>> messagesForMatchSinceSentDate(@NotNull String str, @NotNull DateTime dateTime);

    @NotNull
    Observable<Optional<DateTime>> minSentDateForPageSize(@NotNull String str, int i);

    @NotNull
    Completable unlikeMessage(@NotNull String str);
}
