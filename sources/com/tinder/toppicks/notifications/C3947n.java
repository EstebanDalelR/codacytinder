package com.tinder.toppicks.notifications;

import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.toppicks.notifications.C17041d.C15280a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/toppicks/notifications/UnscheduleTopPicksNotification;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/toppicks/notifications/UnscheduleTopPicksNotification$Request;", "topPicksNotificationScheduler", "Lcom/tinder/toppicks/notifications/TopPicksNotificationScheduler;", "topPicksApplicationRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "sendTopPicksPushCancelEvent", "Lcom/tinder/toppicks/notifications/SendTopPicksPushCancelEvent;", "(Lcom/tinder/toppicks/notifications/TopPicksNotificationScheduler;Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;Lcom/tinder/toppicks/notifications/SendTopPicksPushCancelEvent;)V", "execute", "", "request", "Request", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.notifications.n */
public final class C3947n implements VoidUseCase<C2659a> {
    /* renamed from: a */
    private final TopPicksNotificationScheduler f12520a;
    /* renamed from: b */
    private final TopPicksApplicationRepository f12521b;
    /* renamed from: c */
    private final C17041d f12522c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/toppicks/notifications/UnscheduleTopPicksNotification$Request;", "", "reason", "Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification$Reason;", "(Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification$Reason;)V", "getReason", "()Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification$Reason;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.n$a */
    public static final class C2659a {
        @NotNull
        /* renamed from: a */
        private final ScheduleTopPicksNotification$Reason f8376a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2659a) {
                    if (C2668g.m10308a(this.f8376a, ((C2659a) obj).f8376a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            ScheduleTopPicksNotification$Reason scheduleTopPicksNotification$Reason = this.f8376a;
            return scheduleTopPicksNotification$Reason != null ? scheduleTopPicksNotification$Reason.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(reason=");
            stringBuilder.append(this.f8376a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C2659a(@NotNull ScheduleTopPicksNotification$Reason scheduleTopPicksNotification$Reason) {
            C2668g.m10309b(scheduleTopPicksNotification$Reason, "reason");
            this.f8376a = scheduleTopPicksNotification$Reason;
        }

        @NotNull
        /* renamed from: a */
        public final ScheduleTopPicksNotification$Reason m10172a() {
            return this.f8376a;
        }
    }

    @Inject
    public C3947n(@NotNull TopPicksNotificationScheduler topPicksNotificationScheduler, @NotNull TopPicksApplicationRepository topPicksApplicationRepository, @NotNull C17041d c17041d) {
        C2668g.m10309b(topPicksNotificationScheduler, "topPicksNotificationScheduler");
        C2668g.m10309b(topPicksApplicationRepository, "topPicksApplicationRepository");
        C2668g.m10309b(c17041d, "sendTopPicksPushCancelEvent");
        this.f12520a = topPicksNotificationScheduler;
        this.f12521b = topPicksApplicationRepository;
        this.f12522c = c17041d;
    }

    public /* synthetic */ void execute(Object obj) {
        m15128a((C2659a) obj);
    }

    /* renamed from: a */
    public void m15128a(@NotNull C2659a c2659a) {
        C2668g.m10309b(c2659a, "request");
        String notificationJobId = this.f12521b.getNotificationJobId();
        if (notificationJobId != null) {
            long notificationScheduleTime = this.f12521b.getNotificationScheduleTime();
            if (notificationScheduleTime != 0) {
                this.f12522c.a(new C15280a(notificationScheduleTime, c2659a.m10172a()));
            }
            this.f12520a.unschedule(notificationJobId);
            this.f12521b.clearNotificationJobId();
        }
    }
}
