package com.tinder.domain.message.usecase;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.message.MessageLike;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.meta.gateway.MetaGateway;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import kotlin.sequences.C19285g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H\u0002J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00192\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H\u0002J&\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\u0006\u0010\u001b\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/domain/message/usecase/InsertMessageLikes;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/domain/message/usecase/InsertMessageLikes$Request;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "userGateway", "Lcom/tinder/domain/meta/gateway/MetaGateway;", "(Lcom/tinder/domain/message/MessageRepository;Lcom/tinder/domain/match/repository/MatchRepository;Lcom/tinder/domain/meta/gateway/MetaGateway;)V", "currentUserId", "Lio/reactivex/Single;", "", "execute", "Lio/reactivex/Completable;", "request", "isFromUser", "", "userId", "messageLike", "Lcom/tinder/domain/message/MessageLike;", "lastLikedMessagesPerMatch", "", "messageLikes", "lastLikedMessagesPerMatchObservable", "Lio/reactivex/Observable;", "updateMatchTouchState", "forceMatchTouched", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class InsertMessageLikes implements CompletableUseCase<Request> {
    private final MatchRepository matchRepository;
    private final MessageRepository messageRepository;
    private final MetaGateway userGateway;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/message/usecase/InsertMessageLikes$Request;", "", "messageLikes", "", "Lcom/tinder/domain/message/MessageLike;", "forceMatchTouched", "", "(Ljava/util/List;Z)V", "getForceMatchTouched", "()Z", "getMessageLikes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        private final boolean forceMatchTouched;
        @NotNull
        private final List<MessageLike> messageLikes;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = request.messageLikes;
            }
            if ((i & 2) != 0) {
                z = request.forceMatchTouched;
            }
            return request.copy(list, z);
        }

        @NotNull
        public final List<MessageLike> component1() {
            return this.messageLikes;
        }

        public final boolean component2() {
            return this.forceMatchTouched;
        }

        @NotNull
        public final Request copy(@NotNull List<MessageLike> list, boolean z) {
            C2668g.b(list, "messageLikes");
            return new Request(list, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Request) {
                Request request = (Request) obj;
                if (C2668g.a(this.messageLikes, request.messageLikes)) {
                    if ((this.forceMatchTouched == request.forceMatchTouched ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            List list = this.messageLikes;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            int i = this.forceMatchTouched;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(messageLikes=");
            stringBuilder.append(this.messageLikes);
            stringBuilder.append(", forceMatchTouched=");
            stringBuilder.append(this.forceMatchTouched);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull List<MessageLike> list, boolean z) {
            C2668g.b(list, "messageLikes");
            this.messageLikes = list;
            this.forceMatchTouched = z;
        }

        public final boolean getForceMatchTouched() {
            return this.forceMatchTouched;
        }

        @NotNull
        public final List<MessageLike> getMessageLikes() {
            return this.messageLikes;
        }
    }

    @Inject
    public InsertMessageLikes(@NotNull MessageRepository messageRepository, @NotNull MatchRepository matchRepository, @NotNull MetaGateway metaGateway) {
        C2668g.b(messageRepository, "messageRepository");
        C2668g.b(matchRepository, "matchRepository");
        C2668g.b(metaGateway, "userGateway");
        this.messageRepository = messageRepository;
        this.matchRepository = matchRepository;
        this.userGateway = metaGateway;
    }

    @NotNull
    public C3956a execute(@NotNull Request request) {
        C2668g.b(request, "request");
        request = currentUserId().d(new InsertMessageLikes$execute$1(this, request));
        C2668g.a(request, "currentUserId()\n        …          )\n            }");
        return request;
    }

    private final C3956a updateMatchTouchState(String str, List<MessageLike> list, boolean z) {
        str = lastLikedMessagesPerMatchObservable(list).concatMapCompletable(new InsertMessageLikes$updateMatchTouchState$1(this, z, str));
        C2668g.a(str, "lastLikedMessagesPerMatc…mpletable()\n            }");
        return str;
    }

    private final C3959e<MessageLike> lastLikedMessagesPerMatchObservable(List<MessageLike> list) {
        list = C3959e.defer(new InsertMessageLikes$lastLikedMessagesPerMatchObservable$1(this, list));
        C2668g.a(list, "Observable.defer {\n     …(messageLikes))\n        }");
        return list;
    }

    private final List<MessageLike> lastLikedMessagesPerMatch(List<MessageLike> list) {
        Map linkedHashMap = new LinkedHashMap();
        for (Object next : C19285g.a(C19301m.r(list), InsertMessageLikes$lastLikedMessagesPerMatch$1.INSTANCE)) {
            String matchId = ((MessageLike) next).getMatchId();
            ArrayList arrayList = linkedHashMap.get(matchId);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(matchId, arrayList);
            }
            arrayList.add(next);
        }
        Collection arrayList2 = new ArrayList(linkedHashMap.size());
        for (Entry value : linkedHashMap.entrySet()) {
            arrayList2.add((MessageLike) C19301m.h((List) value.getValue()));
        }
        return (List) arrayList2;
    }

    private final C3960g<String> currentUserId() {
        C3960g<String> a = C3960g.a(this.userGateway.getUserId().c(""));
        C2668g.a(a, "Single.just(userGateway.userId.orElse(\"\"))");
        return a;
    }

    private final boolean isFromUser(String str, MessageLike messageLike) {
        return C2668g.a(messageLike.getLikerUserId(), str);
    }
}
