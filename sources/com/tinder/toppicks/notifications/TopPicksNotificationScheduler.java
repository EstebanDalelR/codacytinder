package com.tinder.toppicks.notifications;

import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lcom/tinder/toppicks/notifications/TopPicksNotificationScheduler;", "", "schedule", "Lio/reactivex/Completable;", "request", "Lcom/tinder/toppicks/notifications/TopPicksNotificationScheduler$Request;", "unschedule", "", "jobId", "", "Companion", "Request", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public interface TopPicksNotificationScheduler {
    /* renamed from: a */
    public static final C15278a f47414a = C15278a.f47409a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/toppicks/notifications/TopPicksNotificationScheduler$Companion;", "", "()V", "DISPATCH_TIME", "", "NOTIFICATION_TIME_THRESHOLD_HOURS", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.TopPicksNotificationScheduler$a */
    public static final class C15278a {
        /* renamed from: a */
        static final /* synthetic */ C15278a f47409a = new C15278a();

        private C15278a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tinder/toppicks/notifications/TopPicksNotificationScheduler$Request;", "", "jobId", "", "hourOfDay", "", "windowStart", "windowEnd", "(Ljava/lang/String;III)V", "getHourOfDay", "()I", "getJobId", "()Ljava/lang/String;", "getWindowEnd", "getWindowStart", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.TopPicksNotificationScheduler$b */
    public static final class C15279b {
        @NotNull
        /* renamed from: a */
        private final String f47410a;
        /* renamed from: b */
        private final int f47411b;
        /* renamed from: c */
        private final int f47412c;
        /* renamed from: d */
        private final int f47413d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15279b) {
                C15279b c15279b = (C15279b) obj;
                if (C2668g.a(this.f47410a, c15279b.f47410a)) {
                    if ((this.f47411b == c15279b.f47411b ? 1 : null) != null) {
                        if ((this.f47412c == c15279b.f47412c ? 1 : null) != null) {
                            if ((this.f47413d == c15279b.f47413d ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f47410a;
            return ((((((str != null ? str.hashCode() : 0) * 31) + this.f47411b) * 31) + this.f47412c) * 31) + this.f47413d;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(jobId=");
            stringBuilder.append(this.f47410a);
            stringBuilder.append(", hourOfDay=");
            stringBuilder.append(this.f47411b);
            stringBuilder.append(", windowStart=");
            stringBuilder.append(this.f47412c);
            stringBuilder.append(", windowEnd=");
            stringBuilder.append(this.f47413d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15279b(@NotNull String str, int i, int i2, int i3) {
            C2668g.b(str, "jobId");
            this.f47410a = str;
            this.f47411b = i;
            this.f47412c = i2;
            this.f47413d = i3;
        }

        @NotNull
        /* renamed from: a */
        public final String m57387a() {
            return this.f47410a;
        }

        /* renamed from: b */
        public final int m57388b() {
            return this.f47411b;
        }

        /* renamed from: c */
        public final int m57389c() {
            return this.f47412c;
        }

        /* renamed from: d */
        public final int m57390d() {
            return this.f47413d;
        }
    }

    @NotNull
    C3956a schedule(@NotNull C15279b c15279b);

    void unschedule(@NotNull String str);
}
