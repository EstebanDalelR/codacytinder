package com.tinder.domain.message;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0012\u0010\u0015\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000eR\u0012\u0010\u001d\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000e\u0001\u0006\u001f !\"#$¨\u0006%"}, d2 = {"Lcom/tinder/domain/message/Message;", "", "()V", "clientSequentialId", "", "getClientSequentialId", "()Ljava/lang/Long;", "deliveryStatus", "Lcom/tinder/domain/message/DeliveryStatus;", "getDeliveryStatus", "()Lcom/tinder/domain/message/DeliveryStatus;", "fromId", "", "getFromId", "()Ljava/lang/String;", "id", "getId", "isLiked", "", "()Z", "isSeen", "matchId", "getMatchId", "sentDate", "Lorg/joda/time/DateTime;", "getSentDate", "()Lorg/joda/time/DateTime;", "text", "getText", "toId", "getToId", "Lcom/tinder/domain/message/TextMessage;", "Lcom/tinder/domain/message/GifMessage;", "Lcom/tinder/domain/message/ReactionMessage;", "Lcom/tinder/domain/message/ActivityMessage;", "Lcom/tinder/domain/message/ImageMessage;", "Lcom/tinder/domain/message/SystemMessage;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class Message {
    @Nullable
    public abstract Long getClientSequentialId();

    @NotNull
    public abstract DeliveryStatus getDeliveryStatus();

    @NotNull
    public abstract String getFromId();

    @NotNull
    public abstract String getId();

    @NotNull
    public abstract String getMatchId();

    @NotNull
    public abstract DateTime getSentDate();

    @NotNull
    public abstract String getText();

    @NotNull
    public abstract String getToId();

    public abstract boolean isLiked();

    public abstract boolean isSeen();

    private Message() {
    }
}
