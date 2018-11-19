package com.tinder.domain.message.usecase;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.usecase.UseCase;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.MessageLike;
import com.tinder.domain.message.MessageRepository;
import java.util.List;
import java.util.Map;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;
import rx.Observable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u00020\u0005:\u0001+B\u000f\b\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001J\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004H\u0001J\u0011\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0001J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0001J\u0017\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003H\u0001J\u001b\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u001d0\fH\u0001J\u0011\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0001J\u0011\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0014H\u0001J\t\u0010!\u001a\u00020\tH\u0001J\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010 \u001a\u00020\u0014H\u0001J*\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010 \u001a\u00020\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0$H\u0002J%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u000fH\u0001J%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0$0\f2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010(\u001a\u00020)H\u0001J\u0011\u0010*\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¨\u0006,"}, d2 = {"Lcom/tinder/domain/message/usecase/ObserveMessages;", "Lcom/tinder/domain/common/usecase/UseCase;", "Lcom/tinder/domain/message/usecase/ObserveMessages$Request;", "", "Lcom/tinder/domain/message/Message;", "Lcom/tinder/domain/message/MessageRepository;", "messageRepository", "(Lcom/tinder/domain/message/MessageRepository;)V", "addMessages", "Lrx/Completable;", "messages", "countDistinctMatchesFromMessagesSinceDate", "Lrx/Observable;", "", "dateTime", "Lorg/joda/time/DateTime;", "createMessage", "message", "deleteFailedMessage", "messageId", "", "execute", "request", "getMessage", "Lrx/Single;", "insertLikes", "messageLikes", "Lcom/tinder/domain/message/MessageLike;", "latestMessageByMatch", "", "likeMessage", "markAllMessagesAsSeenForMatchId", "matchId", "markAllPendingAsFailed", "messagesForMatch", "sentDateOptional", "Ljava8/util/Optional;", "messagesForMatchSinceSentDate", "sinceSentDate", "minSentDateForPageSize", "pageSize", "", "unlikeMessage", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ObserveMessages implements UseCase<Request, List<? extends Message>>, MessageRepository {
    private final /* synthetic */ MessageRepository $$delegate_0;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/message/usecase/ObserveMessages$Request;", "", "matchId", "", "pageSize", "", "(Ljava/lang/String;I)V", "getMatchId", "()Ljava/lang/String;", "getPageSize", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        @NotNull
        private final String matchId;
        private final int pageSize;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = request.matchId;
            }
            if ((i2 & 2) != 0) {
                i = request.pageSize;
            }
            return request.copy(str, i);
        }

        @NotNull
        public final String component1() {
            return this.matchId;
        }

        public final int component2() {
            return this.pageSize;
        }

        @NotNull
        public final Request copy(@NotNull String str, int i) {
            C2668g.b(str, "matchId");
            return new Request(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Request) {
                Request request = (Request) obj;
                if (C2668g.a(this.matchId, request.matchId)) {
                    if ((this.pageSize == request.pageSize ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.matchId;
            return ((str != null ? str.hashCode() : 0) * 31) + this.pageSize;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.matchId);
            stringBuilder.append(", pageSize=");
            stringBuilder.append(this.pageSize);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull String str, int i) {
            C2668g.b(str, "matchId");
            this.matchId = str;
            this.pageSize = i;
        }

        @NotNull
        public final String getMatchId() {
            return this.matchId;
        }

        public final int getPageSize() {
            return this.pageSize;
        }
    }

    @NotNull
    public Completable addMessages(@NotNull List<? extends Message> list) {
        C2668g.b(list, ManagerWebServices.PARAM_MESSAGES);
        return this.$$delegate_0.addMessages(list);
    }

    @NotNull
    public Observable<Long> countDistinctMatchesFromMessagesSinceDate(@NotNull DateTime dateTime) {
        C2668g.b(dateTime, "dateTime");
        return this.$$delegate_0.countDistinctMatchesFromMessagesSinceDate(dateTime);
    }

    @NotNull
    public Completable createMessage(@NotNull Message message) {
        C2668g.b(message, "message");
        return this.$$delegate_0.createMessage(message);
    }

    @NotNull
    public Completable deleteFailedMessage(@NotNull String str) {
        C2668g.b(str, "messageId");
        return this.$$delegate_0.deleteFailedMessage(str);
    }

    @NotNull
    public Single<Message> getMessage(@NotNull String str) {
        C2668g.b(str, "messageId");
        return this.$$delegate_0.getMessage(str);
    }

    @NotNull
    public Completable insertLikes(@NotNull List<MessageLike> list) {
        C2668g.b(list, "messageLikes");
        return this.$$delegate_0.insertLikes(list);
    }

    @NotNull
    public Observable<Map<String, Message>> latestMessageByMatch() {
        return this.$$delegate_0.latestMessageByMatch();
    }

    @NotNull
    public Completable likeMessage(@NotNull String str) {
        C2668g.b(str, "messageId");
        return this.$$delegate_0.likeMessage(str);
    }

    @NotNull
    public Completable markAllMessagesAsSeenForMatchId(@NotNull String str) {
        C2668g.b(str, "matchId");
        return this.$$delegate_0.markAllMessagesAsSeenForMatchId(str);
    }

    @NotNull
    public Completable markAllPendingAsFailed() {
        return this.$$delegate_0.markAllPendingAsFailed();
    }

    @NotNull
    public Observable<List<Message>> messagesForMatch(@NotNull String str) {
        C2668g.b(str, "matchId");
        return this.$$delegate_0.messagesForMatch(str);
    }

    @NotNull
    public Observable<List<Message>> messagesForMatchSinceSentDate(@NotNull String str, @NotNull DateTime dateTime) {
        C2668g.b(str, "matchId");
        C2668g.b(dateTime, "sinceSentDate");
        return this.$$delegate_0.messagesForMatchSinceSentDate(str, dateTime);
    }

    @NotNull
    public Observable<Optional<DateTime>> minSentDateForPageSize(@NotNull String str, int i) {
        C2668g.b(str, "matchId");
        return this.$$delegate_0.minSentDateForPageSize(str, i);
    }

    @NotNull
    public Completable unlikeMessage(@NotNull String str) {
        C2668g.b(str, "messageId");
        return this.$$delegate_0.unlikeMessage(str);
    }

    @Inject
    public ObserveMessages(@NotNull MessageRepository messageRepository) {
        C2668g.b(messageRepository, "messageRepository");
        this.$$delegate_0 = messageRepository;
    }

    @NotNull
    public Observable<List<Message>> execute(@NotNull Request request) {
        C2668g.b(request, "request");
        String component1 = request.component1();
        request = request.component2();
        if (request <= null) {
            request = Observable.a((Throwable) new IllegalArgumentException("Page size must be a positive value greater than 0"));
            C2668g.a(request, "Observable.error(\n      …e value greater than 0\"))");
            return request;
        }
        request = minSentDateForPageSize(component1, request).h().c(new ObserveMessages$execute$1(this, component1));
        C2668g.a(request, "minSentDateForPageSize(m…tional)\n                }");
        return request;
    }

    private final Observable<List<Message>> messagesForMatch(String str, Optional<DateTime> optional) {
        if (!optional.c()) {
            return messagesForMatch(str);
        }
        optional = optional.b();
        C2668g.a(optional, "sentDateOptional.get()");
        return messagesForMatchSinceSentDate(str, (DateTime) optional);
    }
}
