package com.tinder.domain.message.usecase;

import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.message.Reaction;
import com.tinder.domain.message.ReactionMessage;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/message/usecase/SendReactionMessage;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/domain/message/usecase/SendReactionMessage$Request;", "commonMessagePropertiesAggregator", "Lcom/tinder/domain/message/usecase/CommonMessagePropertiesAggregator;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "(Lcom/tinder/domain/message/usecase/CommonMessagePropertiesAggregator;Lcom/tinder/domain/message/MessageRepository;)V", "createReactionMessage", "Lcom/tinder/domain/message/ReactionMessage;", "commonMessageProperties", "Lcom/tinder/domain/message/usecase/CommonMessageProperties;", "reaction", "Lcom/tinder/domain/message/Reaction;", "execute", "Lrx/Completable;", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SendReactionMessage implements CompletableUseCase<Request> {
    private final CommonMessagePropertiesAggregator commonMessagePropertiesAggregator;
    private final MessageRepository messageRepository;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tinder/domain/message/usecase/SendReactionMessage$Request;", "", "matchId", "", "messageText", "reaction", "Lcom/tinder/domain/message/Reaction;", "(Ljava/lang/String;Ljava/lang/String;Lcom/tinder/domain/message/Reaction;)V", "getMatchId", "()Ljava/lang/String;", "getMessageText", "getReaction", "()Lcom/tinder/domain/message/Reaction;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        @NotNull
        private final String matchId;
        @NotNull
        private final String messageText;
        @NotNull
        private final Reaction reaction;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, String str, String str2, Reaction reaction, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.matchId;
            }
            if ((i & 2) != 0) {
                str2 = request.messageText;
            }
            if ((i & 4) != 0) {
                reaction = request.reaction;
            }
            return request.copy(str, str2, reaction);
        }

        @NotNull
        public final String component1() {
            return this.matchId;
        }

        @NotNull
        public final String component2() {
            return this.messageText;
        }

        @NotNull
        public final Reaction component3() {
            return this.reaction;
        }

        @NotNull
        public final Request copy(@NotNull String str, @NotNull String str2, @NotNull Reaction reaction) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "messageText");
            C2668g.b(reaction, "reaction");
            return new Request(str, str2, reaction);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Request) {
                    Request request = (Request) obj;
                    if (C2668g.a(this.matchId, request.matchId) && C2668g.a(this.messageText, request.messageText) && C2668g.a(this.reaction, request.reaction)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.matchId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.messageText;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Reaction reaction = this.reaction;
            if (reaction != null) {
                i = reaction.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.matchId);
            stringBuilder.append(", messageText=");
            stringBuilder.append(this.messageText);
            stringBuilder.append(", reaction=");
            stringBuilder.append(this.reaction);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull String str, @NotNull String str2, @NotNull Reaction reaction) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "messageText");
            C2668g.b(reaction, "reaction");
            this.matchId = str;
            this.messageText = str2;
            this.reaction = reaction;
        }

        @NotNull
        public final String getMatchId() {
            return this.matchId;
        }

        @NotNull
        public final String getMessageText() {
            return this.messageText;
        }

        @NotNull
        public final Reaction getReaction() {
            return this.reaction;
        }
    }

    @Inject
    public SendReactionMessage(@NotNull CommonMessagePropertiesAggregator commonMessagePropertiesAggregator, @NotNull MessageRepository messageRepository) {
        C2668g.b(commonMessagePropertiesAggregator, "commonMessagePropertiesAggregator");
        C2668g.b(messageRepository, "messageRepository");
        this.commonMessagePropertiesAggregator = commonMessagePropertiesAggregator;
        this.messageRepository = messageRepository;
    }

    @NotNull
    public Completable execute(@NotNull Request request) {
        C2668g.b(request, "request");
        request = this.commonMessagePropertiesAggregator.aggregate$domain_release(request.component1(), request.component2()).d(new SendReactionMessage$execute$1(this, request.component3())).c(new SendReactionMessage$sam$rx_functions_Func1$0(new SendReactionMessage$execute$2(this.messageRepository)));
        C2668g.a(request, "commonMessagePropertiesA…epository::createMessage)");
        return request;
    }

    private final ReactionMessage createReactionMessage(CommonMessageProperties commonMessageProperties, Reaction reaction) {
        return new ReactionMessage(null, commonMessageProperties.getId(), commonMessageProperties.getMatchId(), commonMessageProperties.getToId(), commonMessageProperties.getFromId(), commonMessageProperties.getText(), commonMessageProperties.getSentDate(), commonMessageProperties.isLiked(), commonMessageProperties.isSeen(), commonMessageProperties.getDeliveryStatus(), reaction, 1, null);
    }
}
