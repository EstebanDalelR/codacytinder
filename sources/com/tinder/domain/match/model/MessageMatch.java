package com.tinder.domain.match.model;

import com.tinder.domain.message.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/match/model/MessageMatch;", "", "match", "Lcom/tinder/domain/match/model/Match;", "message", "Lcom/tinder/domain/message/Message;", "(Lcom/tinder/domain/match/model/Match;Lcom/tinder/domain/message/Message;)V", "getMatch", "()Lcom/tinder/domain/match/model/Match;", "getMessage", "()Lcom/tinder/domain/message/Message;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class MessageMatch {
    @NotNull
    private final Match match;
    @NotNull
    private final Message message;

    @NotNull
    public static /* synthetic */ MessageMatch copy$default(MessageMatch messageMatch, Match match, Message message, int i, Object obj) {
        if ((i & 1) != 0) {
            match = messageMatch.match;
        }
        if ((i & 2) != 0) {
            message = messageMatch.message;
        }
        return messageMatch.copy(match, message);
    }

    @NotNull
    public final Match component1() {
        return this.match;
    }

    @NotNull
    public final Message component2() {
        return this.message;
    }

    @NotNull
    public final MessageMatch copy(@NotNull Match match, @NotNull Message message) {
        C2668g.b(match, "match");
        C2668g.b(message, "message");
        return new MessageMatch(match, message);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessageMatch) {
                MessageMatch messageMatch = (MessageMatch) obj;
                if (C2668g.a(this.match, messageMatch.match) && C2668g.a(this.message, messageMatch.message)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Match match = this.match;
        int i = 0;
        int hashCode = (match != null ? match.hashCode() : 0) * 31;
        Message message = this.message;
        if (message != null) {
            i = message.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MessageMatch(match=");
        stringBuilder.append(this.match);
        stringBuilder.append(", message=");
        stringBuilder.append(this.message);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public MessageMatch(@NotNull Match match, @NotNull Message message) {
        C2668g.b(match, "match");
        C2668g.b(message, "message");
        this.match = match;
        this.message = message;
    }

    @NotNull
    public final Match getMatch() {
        return this.match;
    }

    @NotNull
    public final Message getMessage() {
        return this.message;
    }
}
