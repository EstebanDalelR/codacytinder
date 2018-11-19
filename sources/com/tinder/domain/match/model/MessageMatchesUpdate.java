package com.tinder.domain.match.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/match/model/MessageMatchesUpdate;", "", "messageMatches", "", "Lcom/tinder/domain/match/model/MessageMatch;", "showNewMatches", "", "(Ljava/util/List;Z)V", "getMessageMatches", "()Ljava/util/List;", "getShowNewMatches", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class MessageMatchesUpdate {
    @NotNull
    private final List<MessageMatch> messageMatches;
    private final boolean showNewMatches;

    @NotNull
    public static /* synthetic */ MessageMatchesUpdate copy$default(MessageMatchesUpdate messageMatchesUpdate, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = messageMatchesUpdate.messageMatches;
        }
        if ((i & 2) != 0) {
            z = messageMatchesUpdate.showNewMatches;
        }
        return messageMatchesUpdate.copy(list, z);
    }

    @NotNull
    public final List<MessageMatch> component1() {
        return this.messageMatches;
    }

    public final boolean component2() {
        return this.showNewMatches;
    }

    @NotNull
    public final MessageMatchesUpdate copy(@NotNull List<MessageMatch> list, boolean z) {
        C2668g.b(list, "messageMatches");
        return new MessageMatchesUpdate(list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageMatchesUpdate) {
            MessageMatchesUpdate messageMatchesUpdate = (MessageMatchesUpdate) obj;
            if (C2668g.a(this.messageMatches, messageMatchesUpdate.messageMatches)) {
                if ((this.showNewMatches == messageMatchesUpdate.showNewMatches ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List list = this.messageMatches;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        int i = this.showNewMatches;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MessageMatchesUpdate(messageMatches=");
        stringBuilder.append(this.messageMatches);
        stringBuilder.append(", showNewMatches=");
        stringBuilder.append(this.showNewMatches);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public MessageMatchesUpdate(@NotNull List<MessageMatch> list, boolean z) {
        C2668g.b(list, "messageMatches");
        this.messageMatches = list;
        this.showNewMatches = z;
    }

    @NotNull
    public final List<MessageMatch> getMessageMatches() {
        return this.messageMatches;
    }

    public final boolean getShowNewMatches() {
        return this.showNewMatches;
    }
}
