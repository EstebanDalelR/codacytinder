package com.tinder.typingindicator.view.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;", "", "()V", "NoTypingIndicator", "TypingIndicator", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator;", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$NoTypingIndicator;", "ui_release"}, k = 1, mv = {1, 1, 10})
public abstract class TypingIndicatorViewModel {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator;", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;", "matchId", "", "toUserId", "state", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator$State;", "(Ljava/lang/String;Ljava/lang/String;Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator$State;)V", "getMatchId", "()Ljava/lang/String;", "getState", "()Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator$State;", "getToUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "State", "ui_release"}, k = 1, mv = {1, 1, 10})
    public static final class TypingIndicator extends TypingIndicatorViewModel {
        @NotNull
        /* renamed from: a */
        private final String f52752a;
        @NotNull
        /* renamed from: b */
        private final String f52753b;
        @NotNull
        /* renamed from: c */
        private final State f52754c;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator$State;", "", "(Ljava/lang/String;I)V", "ACTIVE", "EXPIRED", "INTERRUPTED", "ui_release"}, k = 1, mv = {1, 1, 10})
        public enum State {
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof TypingIndicator) {
                    TypingIndicator typingIndicator = (TypingIndicator) obj;
                    if (C2668g.a(this.f52752a, typingIndicator.f52752a) && C2668g.a(this.f52753b, typingIndicator.f52753b) && C2668g.a(this.f52754c, typingIndicator.f52754c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f52752a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f52753b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            State state = this.f52754c;
            if (state != null) {
                i = state.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TypingIndicator(matchId=");
            stringBuilder.append(this.f52752a);
            stringBuilder.append(", toUserId=");
            stringBuilder.append(this.f52753b);
            stringBuilder.append(", state=");
            stringBuilder.append(this.f52754c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        /* renamed from: a */
        public final String m63067a() {
            return this.f52752a;
        }

        @NotNull
        /* renamed from: b */
        public final State m63068b() {
            return this.f52754c;
        }

        public TypingIndicator(@NotNull String str, @NotNull String str2, @NotNull State state) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "toUserId");
            C2668g.b(state, "state");
            super();
            this.f52752a = str;
            this.f52753b = str2;
            this.f52754c = state;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$NoTypingIndicator;", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;", "()V", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.view.model.TypingIndicatorViewModel$a */
    public static final class C17191a extends TypingIndicatorViewModel {
        /* renamed from: a */
        public static final C17191a f52755a = new C17191a();

        private C17191a() {
            super();
        }
    }

    private TypingIndicatorViewModel() {
    }
}
