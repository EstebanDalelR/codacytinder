package com.tinder.domain.message;

import com.tinder.domain.reactions.model.GrandGestureType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/message/Reaction;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Reaction {
    @NotNull
    private final String id;

    @NotNull
    public static /* synthetic */ Reaction copy$default(Reaction reaction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reaction.id;
        }
        return reaction.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final Reaction copy(@NotNull String str) {
        C2668g.b(str, "id");
        return new Reaction(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Reaction) {
                if (C2668g.a(this.id, ((Reaction) obj).id)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        return str != null ? str.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Reaction(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Reaction(@NotNull String str) {
        C2668g.b(str, "id");
        this.id = str;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final GrandGestureType grandGestureType() {
        return GrandGestureType.Companion.fromValue(this.id);
    }
}
