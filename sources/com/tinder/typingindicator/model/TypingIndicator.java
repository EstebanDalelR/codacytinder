package com.tinder.typingindicator.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/tinder/typingindicator/model/TypingIndicator;", "", "matchId", "", "toUserId", "sentTime", "Lorg/joda/time/DateTime;", "state", "Lcom/tinder/typingindicator/model/TypingIndicator$State;", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lcom/tinder/typingindicator/model/TypingIndicator$State;)V", "getMatchId", "()Ljava/lang/String;", "getSentTime", "()Lorg/joda/time/DateTime;", "getState", "()Lcom/tinder/typingindicator/model/TypingIndicator$State;", "getToUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "State", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class TypingIndicator {
    @NotNull
    /* renamed from: a */
    private final String f47532a;
    @NotNull
    /* renamed from: b */
    private final String f47533b;
    @NotNull
    /* renamed from: c */
    private final DateTime f47534c;
    @NotNull
    /* renamed from: d */
    private final State f47535d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/typingindicator/model/TypingIndicator$State;", "", "(Ljava/lang/String;I)V", "ACTIVE", "EXPIRED", "INTERRUPTED", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum State {
    }

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ TypingIndicator m57501a(TypingIndicator typingIndicator, String str, String str2, DateTime dateTime, State state, int i, Object obj) {
        if ((i & 1) != 0) {
            str = typingIndicator.f47532a;
        }
        if ((i & 2) != 0) {
            str2 = typingIndicator.f47533b;
        }
        if ((i & 4) != 0) {
            dateTime = typingIndicator.f47534c;
        }
        if ((i & 8) != 0) {
            state = typingIndicator.f47535d;
        }
        return typingIndicator.m57502a(str, str2, dateTime, state);
    }

    @NotNull
    /* renamed from: a */
    public final TypingIndicator m57502a(@NotNull String str, @NotNull String str2, @NotNull DateTime dateTime, @NotNull State state) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "toUserId");
        C2668g.b(dateTime, "sentTime");
        C2668g.b(state, "state");
        return new TypingIndicator(str, str2, dateTime, state);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TypingIndicator) {
                TypingIndicator typingIndicator = (TypingIndicator) obj;
                if (C2668g.a(this.f47532a, typingIndicator.f47532a) && C2668g.a(this.f47533b, typingIndicator.f47533b) && C2668g.a(this.f47534c, typingIndicator.f47534c) && C2668g.a(this.f47535d, typingIndicator.f47535d)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f47532a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f47533b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        DateTime dateTime = this.f47534c;
        hashCode = (hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        State state = this.f47535d;
        if (state != null) {
            i = state.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TypingIndicator(matchId=");
        stringBuilder.append(this.f47532a);
        stringBuilder.append(", toUserId=");
        stringBuilder.append(this.f47533b);
        stringBuilder.append(", sentTime=");
        stringBuilder.append(this.f47534c);
        stringBuilder.append(", state=");
        stringBuilder.append(this.f47535d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TypingIndicator(@NotNull String str, @NotNull String str2, @NotNull DateTime dateTime, @NotNull State state) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "toUserId");
        C2668g.b(dateTime, "sentTime");
        C2668g.b(state, "state");
        this.f47532a = str;
        this.f47533b = str2;
        this.f47534c = dateTime;
        this.f47535d = state;
    }

    @NotNull
    /* renamed from: a */
    public final String m57503a() {
        return this.f47532a;
    }

    @NotNull
    /* renamed from: b */
    public final String m57504b() {
        return this.f47533b;
    }

    @NotNull
    /* renamed from: c */
    public final DateTime m57505c() {
        return this.f47534c;
    }

    @NotNull
    /* renamed from: d */
    public final State m57506d() {
        return this.f47535d;
    }
}
