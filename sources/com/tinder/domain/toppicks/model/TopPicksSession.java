package com.tinder.domain.toppicks.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/tinder/domain/toppicks/model/TopPicksSession;", "", "refreshTime", "Lorg/joda/time/DateTime;", "hasTopPicks", "", "hasTeasers", "hasTpsAvailableForPurchase", "isTopPicksEnd", "(Lorg/joda/time/DateTime;ZZZZ)V", "getHasTeasers", "()Z", "getHasTopPicks", "getHasTpsAvailableForPurchase", "getRefreshTime", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksSession {
    private final boolean hasTeasers;
    private final boolean hasTopPicks;
    private final boolean hasTpsAvailableForPurchase;
    private final boolean isTopPicksEnd;
    @NotNull
    private final DateTime refreshTime;

    @NotNull
    public static /* synthetic */ TopPicksSession copy$default(TopPicksSession topPicksSession, DateTime dateTime, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTime = topPicksSession.refreshTime;
        }
        if ((i & 2) != 0) {
            z = topPicksSession.hasTopPicks;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = topPicksSession.hasTeasers;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = topPicksSession.hasTpsAvailableForPurchase;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = topPicksSession.isTopPicksEnd;
        }
        return topPicksSession.copy(dateTime, z5, z6, z7, z4);
    }

    @NotNull
    public final DateTime component1() {
        return this.refreshTime;
    }

    public final boolean component2() {
        return this.hasTopPicks;
    }

    public final boolean component3() {
        return this.hasTeasers;
    }

    public final boolean component4() {
        return this.hasTpsAvailableForPurchase;
    }

    public final boolean component5() {
        return this.isTopPicksEnd;
    }

    @NotNull
    public final TopPicksSession copy(@NotNull DateTime dateTime, boolean z, boolean z2, boolean z3, boolean z4) {
        C2668g.b(dateTime, "refreshTime");
        return new TopPicksSession(dateTime, z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopPicksSession) {
            TopPicksSession topPicksSession = (TopPicksSession) obj;
            if (C2668g.a(this.refreshTime, topPicksSession.refreshTime)) {
                if ((this.hasTopPicks == topPicksSession.hasTopPicks ? 1 : null) != null) {
                    if ((this.hasTeasers == topPicksSession.hasTeasers ? 1 : null) != null) {
                        if ((this.hasTpsAvailableForPurchase == topPicksSession.hasTpsAvailableForPurchase ? 1 : null) != null) {
                            if ((this.isTopPicksEnd == topPicksSession.isTopPicksEnd ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        DateTime dateTime = this.refreshTime;
        int hashCode = (dateTime != null ? dateTime.hashCode() : 0) * 31;
        int i = this.hasTopPicks;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.hasTeasers;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.hasTpsAvailableForPurchase;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.isTopPicksEnd;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TopPicksSession(refreshTime=");
        stringBuilder.append(this.refreshTime);
        stringBuilder.append(", hasTopPicks=");
        stringBuilder.append(this.hasTopPicks);
        stringBuilder.append(", hasTeasers=");
        stringBuilder.append(this.hasTeasers);
        stringBuilder.append(", hasTpsAvailableForPurchase=");
        stringBuilder.append(this.hasTpsAvailableForPurchase);
        stringBuilder.append(", isTopPicksEnd=");
        stringBuilder.append(this.isTopPicksEnd);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TopPicksSession(@NotNull DateTime dateTime, boolean z, boolean z2, boolean z3, boolean z4) {
        C2668g.b(dateTime, "refreshTime");
        this.refreshTime = dateTime;
        this.hasTopPicks = z;
        this.hasTeasers = z2;
        this.hasTpsAvailableForPurchase = z3;
        this.isTopPicksEnd = z4;
    }

    @NotNull
    public final DateTime getRefreshTime() {
        return this.refreshTime;
    }

    public final boolean getHasTopPicks() {
        return this.hasTopPicks;
    }

    public final boolean getHasTeasers() {
        return this.hasTeasers;
    }

    public final boolean getHasTpsAvailableForPurchase() {
        return this.hasTpsAvailableForPurchase;
    }

    public /* synthetic */ TopPicksSession(DateTime dateTime, boolean z, boolean z2, boolean z3, boolean z4, int i, C15823e c15823e) {
        this(dateTime, (i & 2) != null ? false : z, i & 4 ? false : z2, i & 8 ? false : z3, i & 16 ? false : z4);
    }

    public final boolean isTopPicksEnd() {
        return this.isTopPicksEnd;
    }
}
