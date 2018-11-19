package com.tinder.domain.match.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.User;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.model.Match.Visitor;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ!\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0016¢\u0006\u0002\u0010\u001fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003JO\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006."}, d2 = {"Lcom/tinder/domain/match/model/CoreMatch;", "Lcom/tinder/domain/match/model/Match;", "id", "", "creationDate", "Lorg/joda/time/DateTime;", "lastActivityDate", "attribution", "Lcom/tinder/domain/match/model/Match$Attribution;", "muted", "", "touched", "person", "Lcom/tinder/domain/common/model/User;", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/tinder/domain/match/model/Match$Attribution;ZZLcom/tinder/domain/common/model/User;)V", "getAttribution", "()Lcom/tinder/domain/match/model/Match$Attribution;", "getCreationDate", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getLastActivityDate", "getMuted", "()Z", "getPerson", "()Lcom/tinder/domain/common/model/User;", "getTouched", "accept", "T", "visitor", "Lcom/tinder/domain/match/model/Match$Visitor;", "(Lcom/tinder/domain/match/model/Match$Visitor;)Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class CoreMatch extends Match {
    @NotNull
    private final Attribution attribution;
    @NotNull
    private final DateTime creationDate;
    @NotNull
    private final String id;
    @NotNull
    private final DateTime lastActivityDate;
    private final boolean muted;
    @NotNull
    private final User person;
    private final boolean touched;

    @NotNull
    public static /* synthetic */ CoreMatch copy$default(CoreMatch coreMatch, String str, DateTime dateTime, DateTime dateTime2, Attribution attribution, boolean z, boolean z2, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coreMatch.getId();
        }
        if ((i & 2) != 0) {
            dateTime = coreMatch.getCreationDate();
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = coreMatch.getLastActivityDate();
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            attribution = coreMatch.getAttribution();
        }
        Attribution attribution2 = attribution;
        if ((i & 16) != 0) {
            z = coreMatch.getMuted();
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = coreMatch.getTouched();
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            user = coreMatch.person;
        }
        return coreMatch.copy(str, dateTime3, dateTime4, attribution2, z3, z4, user);
    }

    @NotNull
    public final String component1() {
        return getId();
    }

    @NotNull
    public final DateTime component2() {
        return getCreationDate();
    }

    @NotNull
    public final DateTime component3() {
        return getLastActivityDate();
    }

    @NotNull
    public final Attribution component4() {
        return getAttribution();
    }

    public final boolean component5() {
        return getMuted();
    }

    public final boolean component6() {
        return getTouched();
    }

    @NotNull
    public final User component7() {
        return this.person;
    }

    @NotNull
    public final CoreMatch copy(@NotNull String str, @NotNull DateTime dateTime, @NotNull DateTime dateTime2, @NotNull Attribution attribution, boolean z, boolean z2, @NotNull User user) {
        String str2 = str;
        C2668g.b(str2, "id");
        DateTime dateTime3 = dateTime;
        C2668g.b(dateTime3, "creationDate");
        DateTime dateTime4 = dateTime2;
        C2668g.b(dateTime4, "lastActivityDate");
        Attribution attribution2 = attribution;
        C2668g.b(attribution2, "attribution");
        User user2 = user;
        C2668g.b(user2, ManagerWebServices.PARAM_PERSON);
        return new CoreMatch(str2, dateTime3, dateTime4, attribution2, z, z2, user2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CoreMatch) {
            CoreMatch coreMatch = (CoreMatch) obj;
            if (C2668g.a(getId(), coreMatch.getId()) && C2668g.a(getCreationDate(), coreMatch.getCreationDate()) && C2668g.a(getLastActivityDate(), coreMatch.getLastActivityDate()) && C2668g.a(getAttribution(), coreMatch.getAttribution())) {
                if ((getMuted() == coreMatch.getMuted() ? 1 : null) != null) {
                    return (getTouched() == coreMatch.getTouched() ? 1 : null) != null && C2668g.a(this.person, coreMatch.person);
                }
            }
        }
    }

    public int hashCode() {
        String id = getId();
        int i = 0;
        int hashCode = (id != null ? id.hashCode() : 0) * 31;
        DateTime creationDate = getCreationDate();
        hashCode = (hashCode + (creationDate != null ? creationDate.hashCode() : 0)) * 31;
        creationDate = getLastActivityDate();
        hashCode = (hashCode + (creationDate != null ? creationDate.hashCode() : 0)) * 31;
        Attribution attribution = getAttribution();
        hashCode = (hashCode + (attribution != null ? attribution.hashCode() : 0)) * 31;
        int muted = getMuted();
        if (muted != 0) {
            muted = 1;
        }
        hashCode = (hashCode + muted) * 31;
        muted = getTouched();
        if (muted != 0) {
            muted = 1;
        }
        hashCode = (hashCode + muted) * 31;
        User user = this.person;
        if (user != null) {
            i = user.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CoreMatch(id=");
        stringBuilder.append(getId());
        stringBuilder.append(", creationDate=");
        stringBuilder.append(getCreationDate());
        stringBuilder.append(", lastActivityDate=");
        stringBuilder.append(getLastActivityDate());
        stringBuilder.append(", attribution=");
        stringBuilder.append(getAttribution());
        stringBuilder.append(", muted=");
        stringBuilder.append(getMuted());
        stringBuilder.append(", touched=");
        stringBuilder.append(getTouched());
        stringBuilder.append(", person=");
        stringBuilder.append(this.person);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public DateTime getCreationDate() {
        return this.creationDate;
    }

    @NotNull
    public DateTime getLastActivityDate() {
        return this.lastActivityDate;
    }

    @NotNull
    public Attribution getAttribution() {
        return this.attribution;
    }

    public boolean getMuted() {
        return this.muted;
    }

    public boolean getTouched() {
        return this.touched;
    }

    @NotNull
    public final User getPerson() {
        return this.person;
    }

    public CoreMatch(@NotNull String str, @NotNull DateTime dateTime, @NotNull DateTime dateTime2, @NotNull Attribution attribution, boolean z, boolean z2, @NotNull User user) {
        C2668g.b(str, "id");
        C2668g.b(dateTime, "creationDate");
        C2668g.b(dateTime2, "lastActivityDate");
        C2668g.b(attribution, "attribution");
        C2668g.b(user, ManagerWebServices.PARAM_PERSON);
        super();
        this.id = str;
        this.creationDate = dateTime;
        this.lastActivityDate = dateTime2;
        this.attribution = attribution;
        this.muted = z;
        this.touched = z2;
        this.person = user;
    }

    public <T> T accept(@NotNull Visitor<? extends T> visitor) {
        C2668g.b(visitor, "visitor");
        return visitor.visit(this);
    }
}
