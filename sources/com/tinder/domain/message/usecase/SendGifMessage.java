package com.tinder.domain.message.usecase;

import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.message.Gif;
import com.tinder.domain.message.GifMessage;
import com.tinder.domain.message.MessageRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/message/usecase/SendGifMessage;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/domain/message/usecase/SendGifMessage$Request;", "commonMessagePropertiesAggregator", "Lcom/tinder/domain/message/usecase/CommonMessagePropertiesAggregator;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "(Lcom/tinder/domain/message/usecase/CommonMessagePropertiesAggregator;Lcom/tinder/domain/message/MessageRepository;)V", "createGifMessage", "Lcom/tinder/domain/message/GifMessage;", "commonMessageProperties", "Lcom/tinder/domain/message/usecase/CommonMessageProperties;", "gif", "Lcom/tinder/domain/message/Gif;", "execute", "Lrx/Completable;", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SendGifMessage implements CompletableUseCase<Request> {
    private final CommonMessagePropertiesAggregator commonMessagePropertiesAggregator;
    private final MessageRepository messageRepository;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/domain/message/usecase/SendGifMessage$Request;", "", "matchId", "", "gif", "Lcom/tinder/domain/message/Gif;", "(Ljava/lang/String;Lcom/tinder/domain/message/Gif;)V", "getGif", "()Lcom/tinder/domain/message/Gif;", "getMatchId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        @NotNull
        private final Gif gif;
        @NotNull
        private final String matchId;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, String str, Gif gif, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.matchId;
            }
            if ((i & 2) != 0) {
                gif = request.gif;
            }
            return request.copy(str, gif);
        }

        @NotNull
        public final String component1() {
            return this.matchId;
        }

        @NotNull
        public final Gif component2() {
            return this.gif;
        }

        @NotNull
        public final Request copy(@NotNull String str, @NotNull Gif gif) {
            C2668g.b(str, "matchId");
            C2668g.b(gif, "gif");
            return new Request(str, gif);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Request) {
                    Request request = (Request) obj;
                    if (C2668g.a(this.matchId, request.matchId) && C2668g.a(this.gif, request.gif)) {
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
            Gif gif = this.gif;
            if (gif != null) {
                i = gif.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.matchId);
            stringBuilder.append(", gif=");
            stringBuilder.append(this.gif);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull String str, @NotNull Gif gif) {
            C2668g.b(str, "matchId");
            C2668g.b(gif, "gif");
            this.matchId = str;
            this.gif = gif;
        }

        @NotNull
        public final Gif getGif() {
            return this.gif;
        }

        @NotNull
        public final String getMatchId() {
            return this.matchId;
        }
    }

    @Inject
    public SendGifMessage(@NotNull CommonMessagePropertiesAggregator commonMessagePropertiesAggregator, @NotNull MessageRepository messageRepository) {
        C2668g.b(commonMessagePropertiesAggregator, "commonMessagePropertiesAggregator");
        C2668g.b(messageRepository, "messageRepository");
        this.commonMessagePropertiesAggregator = commonMessagePropertiesAggregator;
        this.messageRepository = messageRepository;
    }

    @NotNull
    public Completable execute(@NotNull Request request) {
        C2668g.b(request, "request");
        String component1 = request.component1();
        request = request.component2();
        request = this.commonMessagePropertiesAggregator.aggregate$domain_release(component1, request.getUrl()).d(new SendGifMessage$execute$1(this, request)).c(new SendGifMessage$sam$rx_functions_Func1$0(new SendGifMessage$execute$2(this.messageRepository)));
        C2668g.a(request, "commonMessagePropertiesA…epository::createMessage)");
        return request;
    }

    private final GifMessage createGifMessage(CommonMessageProperties commonMessageProperties, Gif gif) {
        return new GifMessage(null, commonMessageProperties.getId(), commonMessageProperties.getMatchId(), commonMessageProperties.getToId(), commonMessageProperties.getFromId(), commonMessageProperties.getText(), commonMessageProperties.getSentDate(), commonMessageProperties.isLiked(), commonMessageProperties.isSeen(), commonMessageProperties.getDeliveryStatus(), gif, gif, 1, null);
    }
}
