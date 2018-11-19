package com.tinder.data.message;

import com.tinder.data.model.ReactionModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\t\u0010\n\u001a\u00020\u0005HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÂ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/data/message/Reaction;", "Lcom/tinder/data/model/ReactionModel;", "id", "", "reactionId", "", "messageId", "(JLjava/lang/String;Ljava/lang/String;)V", "_id", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "message_id", "reaction_id", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
public final class az implements ReactionModel {
    /* renamed from: a */
    private final long f35436a;
    /* renamed from: b */
    private final String f35437b;
    /* renamed from: c */
    private final String f35438c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof az) {
            az azVar = (az) obj;
            return ((this.f35436a > azVar.f35436a ? 1 : (this.f35436a == azVar.f35436a ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35437b, azVar.f35437b) && C2668g.a(this.f35438c, azVar.f35438c);
        }
    }

    public int hashCode() {
        long j = this.f35436a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f35437b;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f35438c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Reaction(id=");
        stringBuilder.append(this.f35436a);
        stringBuilder.append(", reactionId=");
        stringBuilder.append(this.f35437b);
        stringBuilder.append(", messageId=");
        stringBuilder.append(this.f35438c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public az(long j, @NotNull String str, @NotNull String str2) {
        C2668g.b(str, "reactionId");
        C2668g.b(str2, "messageId");
        this.f35436a = j;
        this.f35437b = str;
        this.f35438c = str2;
    }

    public long _id() {
        return this.f35436a;
    }

    @NotNull
    public String reaction_id() {
        return this.f35437b;
    }

    @NotNull
    public String message_id() {
        return this.f35438c;
    }
}
