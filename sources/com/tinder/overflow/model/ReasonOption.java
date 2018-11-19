package com.tinder.overflow.model;

import com.tinder.enums.ReportCause;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/tinder/overflow/model/ReasonOption;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INAPPROPRIATE_PHOTOS", "MEDIA", "FEELS_LIKE_SPAM", "INAPPROPRIATE_MESSAGES", "BAD_OFFLINE_BEHAVIOR", "OTHER", "NO_REASON", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public enum ReasonOption {
    ;
    
    public static final C10027a Companion = null;
    @NotNull
    private final String value;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/overflow/model/ReasonOption$Companion;", "", "()V", "legacyFactory", "Lcom/tinder/overflow/model/ReasonOption;", "reportCause", "Lcom/tinder/enums/ReportCause;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.model.ReasonOption$a */
    public static final class C10027a {
        private C10027a() {
        }

        @NotNull
        /* renamed from: a */
        public final ReasonOption m41078a(@Nullable ReportCause reportCause) {
            if (reportCause == null) {
                return ReasonOption.NO_REASON;
            }
            switch (C10030c.f32914a[reportCause.ordinal()]) {
                case 1:
                    return ReasonOption.OTHER;
                case 2:
                    return ReasonOption.FEELS_LIKE_SPAM;
                case 3:
                    return ReasonOption.INAPPROPRIATE_PHOTOS;
                case 4:
                    return ReasonOption.BAD_OFFLINE_BEHAVIOR;
                case 5:
                    return ReasonOption.INAPPROPRIATE_MESSAGES;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    protected ReasonOption(String str) {
        C2668g.b(str, "value");
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    static {
        Companion = new C10027a();
    }
}
