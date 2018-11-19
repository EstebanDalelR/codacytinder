package com.tinder.toppicks.notifications;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.model.settings.PushSettingsKt;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.sl;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/toppicks/notifications/SendTopPicksPushCancelEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/toppicks/notifications/SendTopPicksPushCancelEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "request", "Request", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.notifications.d */
public final class C17041d implements VoidUseCase<C15280a> {
    /* renamed from: a */
    private final C2630h f52499a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/toppicks/notifications/SendTopPicksPushCancelEvent$Request;", "", "targetTime", "", "cancelReason", "Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification$Reason;", "(JLcom/tinder/toppicks/notifications/ScheduleTopPicksNotification$Reason;)V", "getCancelReason", "()Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification$Reason;", "getTargetTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.d$a */
    public static final class C15280a {
        /* renamed from: a */
        private final long f47415a;
        @NotNull
        /* renamed from: b */
        private final ScheduleTopPicksNotification$Reason f47416b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15280a) {
                C15280a c15280a = (C15280a) obj;
                return ((this.f47415a > c15280a.f47415a ? 1 : (this.f47415a == c15280a.f47415a ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f47416b, c15280a.f47416b);
            }
        }

        public int hashCode() {
            long j = this.f47415a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            ScheduleTopPicksNotification$Reason scheduleTopPicksNotification$Reason = this.f47416b;
            return i + (scheduleTopPicksNotification$Reason != null ? scheduleTopPicksNotification$Reason.hashCode() : 0);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(targetTime=");
            stringBuilder.append(this.f47415a);
            stringBuilder.append(", cancelReason=");
            stringBuilder.append(this.f47416b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15280a(long j, @NotNull ScheduleTopPicksNotification$Reason scheduleTopPicksNotification$Reason) {
            C2668g.b(scheduleTopPicksNotification$Reason, "cancelReason");
            this.f47415a = j;
            this.f47416b = scheduleTopPicksNotification$Reason;
        }

        /* renamed from: a */
        public final long m57391a() {
            return this.f47415a;
        }

        @NotNull
        /* renamed from: b */
        public final ScheduleTopPicksNotification$Reason m57392b() {
            return this.f47416b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.d$b */
    static final class C17038b implements Action {
        /* renamed from: a */
        final /* synthetic */ C17041d f52495a;
        /* renamed from: b */
        final /* synthetic */ C15280a f52496b;

        C17038b(C17041d c17041d, C15280a c15280a) {
            this.f52495a = c17041d;
            this.f52496b = c15280a;
        }

        public final void run() {
            this.f52495a.f52499a.a(sl.a().a(Long.valueOf(this.f52496b.m57391a())).a(PushSettingsKt.KEY_TOP_PICKS_DAILY).b(Integer.valueOf(this.f52496b.m57392b().getAnalyticsValue())).a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.d$c */
    static final class C17039c implements Action {
        /* renamed from: a */
        public static final C17039c f52497a = new C17039c();

        C17039c() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.d$d */
    static final class C17040d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17040d f52498a = new C17040d();

        C17040d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62840a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62840a(Throwable th) {
            C0001a.c(th, "Error sending to picks push cancel event", new Object[0]);
        }
    }

    @Inject
    public C17041d(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f52499a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m62842a((C15280a) obj);
    }

    /* renamed from: a */
    public void m62842a(@NotNull C15280a c15280a) {
        C2668g.b(c15280a, "request");
        C3956a.a(new C17038b(this, c15280a)).b(C15756a.m59010b()).a(C17039c.f52497a, C17040d.f52498a);
    }
}
