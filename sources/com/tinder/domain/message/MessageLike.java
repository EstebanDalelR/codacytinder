package com.tinder.domain.message;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/tinder/domain/message/MessageLike;", "", "messageId", "", "matchId", "isLiked", "", "updateDate", "likerUserId", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getLikerUserId", "()Ljava/lang/String;", "getMatchId", "getMessageId", "getUpdateDate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class MessageLike {
    private final boolean isLiked;
    @NotNull
    private final String likerUserId;
    @NotNull
    private final String matchId;
    @NotNull
    private final String messageId;
    @NotNull
    private final String updateDate;

    @NotNull
    public static /* synthetic */ MessageLike copy$default(MessageLike messageLike, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageLike.messageId;
        }
        if ((i & 2) != 0) {
            str2 = messageLike.matchId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            z = messageLike.isLiked;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = messageLike.updateDate;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = messageLike.likerUserId;
        }
        return messageLike.copy(str, str5, z2, str6, str4);
    }

    @NotNull
    public final String component1() {
        return this.messageId;
    }

    @NotNull
    public final String component2() {
        return this.matchId;
    }

    public final boolean component3() {
        return this.isLiked;
    }

    @NotNull
    public final String component4() {
        return this.updateDate;
    }

    @NotNull
    public final String component5() {
        return this.likerUserId;
    }

    @NotNull
    public final MessageLike copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4) {
        C2668g.b(str, "messageId");
        C2668g.b(str2, "matchId");
        C2668g.b(str3, "updateDate");
        C2668g.b(str4, "likerUserId");
        return new MessageLike(str, str2, z, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageLike) {
            MessageLike messageLike = (MessageLike) obj;
            if (C2668g.a(this.messageId, messageLike.messageId) && C2668g.a(this.matchId, messageLike.matchId)) {
                return (this.isLiked == messageLike.isLiked ? 1 : null) != null && C2668g.a(this.updateDate, messageLike.updateDate) && C2668g.a(this.likerUserId, messageLike.likerUserId);
            }
        }
    }

    public int hashCode() {
        String str = this.messageId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.matchId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.isLiked;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str2 = this.updateDate;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.likerUserId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MessageLike(messageId=");
        stringBuilder.append(this.messageId);
        stringBuilder.append(", matchId=");
        stringBuilder.append(this.matchId);
        stringBuilder.append(", isLiked=");
        stringBuilder.append(this.isLiked);
        stringBuilder.append(", updateDate=");
        stringBuilder.append(this.updateDate);
        stringBuilder.append(", likerUserId=");
        stringBuilder.append(this.likerUserId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public MessageLike(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4) {
        C2668g.b(str, "messageId");
        C2668g.b(str2, "matchId");
        C2668g.b(str3, "updateDate");
        C2668g.b(str4, "likerUserId");
        this.messageId = str;
        this.matchId = str2;
        this.isLiked = z;
        this.updateDate = str3;
        this.likerUserId = str4;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final String getMatchId() {
        return this.matchId;
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    @NotNull
    public final String getUpdateDate() {
        return this.updateDate;
    }

    @NotNull
    public final String getLikerUserId() {
        return this.likerUserId;
    }
}
