package com.tinder.domain.toppicks.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/domain/toppicks/model/TopPicksRefreshTime;", "", "time", "Lorg/joda/time/DateTime;", "(Lorg/joda/time/DateTime;)V", "getTime", "()Lorg/joda/time/DateTime;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksRefreshTime {
    @NotNull
    private final DateTime time;

    @NotNull
    public static /* synthetic */ TopPicksRefreshTime copy$default(TopPicksRefreshTime topPicksRefreshTime, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTime = topPicksRefreshTime.time;
        }
        return topPicksRefreshTime.copy(dateTime);
    }

    @NotNull
    public final DateTime component1() {
        return this.time;
    }

    @NotNull
    public final TopPicksRefreshTime copy(@NotNull DateTime dateTime) {
        C2668g.b(dateTime, "time");
        return new TopPicksRefreshTime(dateTime);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TopPicksRefreshTime) {
                if (C2668g.a(this.time, ((TopPicksRefreshTime) obj).time)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        DateTime dateTime = this.time;
        return dateTime != null ? dateTime.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TopPicksRefreshTime(time=");
        stringBuilder.append(this.time);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TopPicksRefreshTime(@NotNull DateTime dateTime) {
        C2668g.b(dateTime, "time");
        this.time = dateTime;
    }

    @NotNull
    public final DateTime getTime() {
        return this.time;
    }
}
