package com.tinder.typingindicator.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/typingindicator/model/TypingType;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Hide", "Receive", "Send", "Show", "Lcom/tinder/typingindicator/model/TypingType$Send;", "Lcom/tinder/typingindicator/model/TypingType$Show;", "Lcom/tinder/typingindicator/model/TypingType$Receive;", "Lcom/tinder/typingindicator/model/TypingType$Hide;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class TypingType {
    @NotNull
    /* renamed from: a */
    private final String f47536a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tinder/typingindicator/model/TypingType$Hide;", "Lcom/tinder/typingindicator/model/TypingType;", "reason", "Lcom/tinder/typingindicator/model/TypingType$Hide$Reason;", "durationMillis", "", "(Lcom/tinder/typingindicator/model/TypingType$Hide$Reason;J)V", "getDurationMillis", "()J", "getReason", "()Lcom/tinder/typingindicator/model/TypingType$Hide$Reason;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Reason", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Hide extends TypingType {
        @NotNull
        /* renamed from: a */
        private final Reason f52690a;
        /* renamed from: b */
        private final long f52691b;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/typingindicator/model/TypingType$Hide$Reason;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EXPIRED", "MESSAGE", "LEFT_CHAT", "domain_release"}, k = 1, mv = {1, 1, 10})
        public enum Reason {
            ;
            
            @NotNull
            private final String value;

            protected Reason(String str) {
                C2668g.b(str, "value");
                this.value = str;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Hide) {
                Hide hide = (Hide) obj;
                if (C2668g.a(this.f52690a, hide.f52690a)) {
                    if ((this.f52691b == hide.f52691b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Reason reason = this.f52690a;
            int hashCode = (reason != null ? reason.hashCode() : 0) * 31;
            long j = this.f52691b;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Hide(reason=");
            stringBuilder.append(this.f52690a);
            stringBuilder.append(", durationMillis=");
            stringBuilder.append(this.f52691b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Hide(@NotNull Reason reason, long j) {
            C2668g.b(reason, "reason");
            super("hide");
            this.f52690a = reason;
            this.f52691b = j;
        }

        @NotNull
        /* renamed from: b */
        public final Reason m63034b() {
            return this.f52690a;
        }

        /* renamed from: c */
        public final long m63035c() {
            return this.f52691b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/typingindicator/model/TypingType$Receive;", "Lcom/tinder/typingindicator/model/TypingType;", "durationMillis", "", "(J)V", "getDurationMillis", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.model.TypingType$a */
    public static final class C17161a extends TypingType {
        /* renamed from: a */
        private final long f52692a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C17161a) {
                if ((this.f52692a == ((C17161a) obj).f52692a ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j = this.f52692a;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Receive(durationMillis=");
            stringBuilder.append(this.f52692a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C17161a(long j) {
            super("receive");
            this.f52692a = j;
        }

        /* renamed from: b */
        public final long m63036b() {
            return this.f52692a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/typingindicator/model/TypingType$Send;", "Lcom/tinder/typingindicator/model/TypingType;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.model.TypingType$b */
    public static final class C17162b extends TypingType {
        /* renamed from: a */
        public static final C17162b f52693a = new C17162b();

        private C17162b() {
            super("send");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/typingindicator/model/TypingType$Show;", "Lcom/tinder/typingindicator/model/TypingType;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.model.TypingType$c */
    public static final class C17163c extends TypingType {
        /* renamed from: a */
        public static final C17163c f52694a = new C17163c();

        private C17163c() {
            super("show");
        }
    }

    private TypingType(String str) {
        this.f47536a = str;
    }

    @NotNull
    /* renamed from: a */
    public final String m57507a() {
        return this.f47536a;
    }
}
