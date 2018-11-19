package com.tinder.domain.message.usecase;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.message.ActivityMessage;
import com.tinder.domain.message.GifMessage;
import com.tinder.domain.message.ImageMessage;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.message.ReactionMessage;
import com.tinder.domain.message.SystemMessage;
import com.tinder.domain.message.TextMessage;
import com.tinder.domain.meta.gateway.MetaGateway;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/domain/message/usecase/InsertMessages;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/domain/message/usecase/InsertMessages$Request;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "metaGateway", "Lcom/tinder/domain/meta/gateway/MetaGateway;", "(Lcom/tinder/domain/message/MessageRepository;Lcom/tinder/domain/match/repository/MatchRepository;Lcom/tinder/domain/meta/gateway/MetaGateway;)V", "allMessagesMarkedAsSeen", "", "Lcom/tinder/domain/message/Message;", "messages", "currentUserId", "Lio/reactivex/Single;", "", "execute", "Lio/reactivex/Completable;", "request", "isFromUser", "", "userId", "message", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class InsertMessages implements CompletableUseCase<Request> {
    private final MatchRepository matchRepository;
    private final MessageRepository messageRepository;
    private final MetaGateway metaGateway;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/tinder/domain/message/usecase/InsertMessages$Request;", "", "matchId", "", "lastActivityDate", "Lorg/joda/time/DateTime;", "forceMatchTouched", "", "forceMessagesForMatchSeen", "messages", "", "Lcom/tinder/domain/message/Message;", "(Ljava/lang/String;Lorg/joda/time/DateTime;ZZLjava/util/List;)V", "getForceMatchTouched", "()Z", "getForceMessagesForMatchSeen", "getLastActivityDate", "()Lorg/joda/time/DateTime;", "getMatchId", "()Ljava/lang/String;", "getMessages", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        private final boolean forceMatchTouched;
        private final boolean forceMessagesForMatchSeen;
        @NotNull
        private final DateTime lastActivityDate;
        @NotNull
        private final String matchId;
        @NotNull
        private final List<Message> messages;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, String str, DateTime dateTime, boolean z, boolean z2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.matchId;
            }
            if ((i & 2) != 0) {
                dateTime = request.lastActivityDate;
            }
            DateTime dateTime2 = dateTime;
            if ((i & 4) != 0) {
                z = request.forceMatchTouched;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = request.forceMessagesForMatchSeen;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                list = request.messages;
            }
            return request.copy(str, dateTime2, z3, z4, list);
        }

        @NotNull
        public final String component1() {
            return this.matchId;
        }

        @NotNull
        public final DateTime component2() {
            return this.lastActivityDate;
        }

        public final boolean component3() {
            return this.forceMatchTouched;
        }

        public final boolean component4() {
            return this.forceMessagesForMatchSeen;
        }

        @NotNull
        public final List<Message> component5() {
            return this.messages;
        }

        @NotNull
        public final Request copy(@NotNull String str, @NotNull DateTime dateTime, boolean z, boolean z2, @NotNull List<? extends Message> list) {
            C2668g.b(str, "matchId");
            C2668g.b(dateTime, "lastActivityDate");
            C2668g.b(list, ManagerWebServices.PARAM_MESSAGES);
            return new Request(str, dateTime, z, z2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Request) {
                Request request = (Request) obj;
                if (C2668g.a(this.matchId, request.matchId) && C2668g.a(this.lastActivityDate, request.lastActivityDate)) {
                    if ((this.forceMatchTouched == request.forceMatchTouched ? 1 : null) != null) {
                        return (this.forceMessagesForMatchSeen == request.forceMessagesForMatchSeen ? 1 : null) != null && C2668g.a(this.messages, request.messages);
                    }
                }
            }
        }

        public int hashCode() {
            String str = this.matchId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            DateTime dateTime = this.lastActivityDate;
            hashCode = (hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
            int i2 = this.forceMatchTouched;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.forceMessagesForMatchSeen;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            List list = this.messages;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.matchId);
            stringBuilder.append(", lastActivityDate=");
            stringBuilder.append(this.lastActivityDate);
            stringBuilder.append(", forceMatchTouched=");
            stringBuilder.append(this.forceMatchTouched);
            stringBuilder.append(", forceMessagesForMatchSeen=");
            stringBuilder.append(this.forceMessagesForMatchSeen);
            stringBuilder.append(", messages=");
            stringBuilder.append(this.messages);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull String str, @NotNull DateTime dateTime, boolean z, boolean z2, @NotNull List<? extends Message> list) {
            C2668g.b(str, "matchId");
            C2668g.b(dateTime, "lastActivityDate");
            C2668g.b(list, ManagerWebServices.PARAM_MESSAGES);
            this.matchId = str;
            this.lastActivityDate = dateTime;
            this.forceMatchTouched = z;
            this.forceMessagesForMatchSeen = z2;
            this.messages = list;
            if ((((Collection) this.messages).isEmpty() ^ 1) == null) {
                throw ((Throwable) new IllegalArgumentException("messages must not be empty".toString()));
            }
        }

        @NotNull
        public final String getMatchId() {
            return this.matchId;
        }

        @NotNull
        public final DateTime getLastActivityDate() {
            return this.lastActivityDate;
        }

        public final boolean getForceMatchTouched() {
            return this.forceMatchTouched;
        }

        public final boolean getForceMessagesForMatchSeen() {
            return this.forceMessagesForMatchSeen;
        }

        @NotNull
        public final List<Message> getMessages() {
            return this.messages;
        }
    }

    @Inject
    public InsertMessages(@NotNull MessageRepository messageRepository, @NotNull MatchRepository matchRepository, @NotNull MetaGateway metaGateway) {
        C2668g.b(messageRepository, "messageRepository");
        C2668g.b(matchRepository, "matchRepository");
        C2668g.b(metaGateway, "metaGateway");
        this.messageRepository = messageRepository;
        this.matchRepository = matchRepository;
        this.metaGateway = metaGateway;
    }

    @NotNull
    public C3956a execute(@NotNull Request request) {
        C2668g.b(request, "request");
        request = currentUserId().d(new InsertMessages$execute$1(this, request));
        C2668g.a(request, "currentUserId()\n        …mpletable()\n            }");
        return request;
    }

    private final C3960g<String> currentUserId() {
        C3960g<String> a = C3960g.a(this.metaGateway.getUserId().c(""));
        C2668g.a(a, "Single.just(metaGateway.userId.orElse(\"\"))");
        return a;
    }

    private final boolean isFromUser(String str, Message message) {
        return C2668g.a(message.getFromId(), str);
    }

    private final List<Message> allMessagesMarkedAsSeen(List<? extends Message> list) {
        Iterable<Message> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (Message message : iterable) {
            Object copy$default;
            if (message instanceof TextMessage) {
                copy$default = TextMessage.copy$default((TextMessage) message, null, null, null, null, null, null, null, false, true, null, 767, null);
            } else if (message instanceof GifMessage) {
                copy$default = GifMessage.copy$default((GifMessage) message, null, null, null, null, null, null, null, false, true, null, null, null, 3839, null);
            } else if (message instanceof ReactionMessage) {
                copy$default = ReactionMessage.copy$default((ReactionMessage) message, null, null, null, null, null, null, null, false, true, null, null, 1791, null);
            } else if (message instanceof ActivityMessage) {
                copy$default = ActivityMessage.copy$default((ActivityMessage) message, null, null, null, null, null, null, null, false, true, null, null, 1791, null);
            } else if (message instanceof ImageMessage) {
                copy$default = ImageMessage.copy$default((ImageMessage) message, null, null, null, null, null, null, null, false, true, null, null, 1791, null);
            } else if (message instanceof SystemMessage) {
                copy$default = SystemMessage.copy$default((SystemMessage) message, null, null, null, null, null, null, null, false, true, null, 767, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(copy$default);
        }
        return (List) arrayList;
    }
}
