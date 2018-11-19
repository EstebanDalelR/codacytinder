package com.tinder.toppicks.notifications;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.meta.model.TopPicksSettings;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.domain.toppicks.repo.TopPicksSettingRepository;
import com.tinder.domain.toppicks.usecase.TopPicksNotificationsAreEnabled;
import com.tinder.toppicks.notifications.C17045f.C15281a;
import com.tinder.toppicks.notifications.C3947n.C2659a;
import com.tinder.toppicks.notifications.TopPicksNotificationScheduler.C15279b;
import io.reactivex.C3956a;
import io.reactivex.C3958c;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019BO\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification$Request;", "topPicksNotificationScheduler", "Lcom/tinder/toppicks/notifications/TopPicksNotificationScheduler;", "topPicksApplicationRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "topPicksSettingRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksSettingRepository;", "topPicksNotificationsAreEnabled", "Lcom/tinder/domain/toppicks/usecase/TopPicksNotificationsAreEnabled;", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "sendTopPicksPushSendEvent", "Lcom/tinder/toppicks/notifications/SendTopPicksPushSendEvent;", "unscheduleTopPicksNotification", "Lcom/tinder/toppicks/notifications/UnscheduleTopPicksNotification;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/toppicks/notifications/TopPicksNotificationScheduler;Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;Lcom/tinder/domain/toppicks/repo/TopPicksSettingRepository;Lcom/tinder/domain/toppicks/usecase/TopPicksNotificationsAreEnabled;Lcom/tinder/domain/config/TopPicksConfig;Lcom/tinder/toppicks/notifications/SendTopPicksPushSendEvent;Lcom/tinder/toppicks/notifications/UnscheduleTopPicksNotification;Lkotlin/jvm/functions/Function0;)V", "execute", "Lio/reactivex/Completable;", "request", "Reason", "Request", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class ScheduleTopPicksNotification implements CompletableUseCase<C15276a> {
    /* renamed from: a */
    private final TopPicksNotificationScheduler f52479a;
    /* renamed from: b */
    private final TopPicksApplicationRepository f52480b;
    /* renamed from: c */
    private final TopPicksSettingRepository f52481c;
    /* renamed from: d */
    private final TopPicksNotificationsAreEnabled f52482d;
    /* renamed from: e */
    private final TopPicksConfig f52483e;
    /* renamed from: f */
    private final C17045f f52484f;
    /* renamed from: g */
    private final C3947n f52485g;
    /* renamed from: h */
    private final Function0<DateTime> f52486h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification$Request;", "", "reason", "Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification$Reason;", "(Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification$Reason;)V", "getReason", "()Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification$Reason;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.ScheduleTopPicksNotification$a */
    public static final class C15276a {
        @NotNull
        /* renamed from: a */
        private final ScheduleTopPicksNotification$Reason f47406a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15276a) {
                    if (C2668g.a(this.f47406a, ((C15276a) obj).f47406a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            ScheduleTopPicksNotification$Reason scheduleTopPicksNotification$Reason = this.f47406a;
            return scheduleTopPicksNotification$Reason != null ? scheduleTopPicksNotification$Reason.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(reason=");
            stringBuilder.append(this.f47406a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15276a(@NotNull ScheduleTopPicksNotification$Reason scheduleTopPicksNotification$Reason) {
            C2668g.b(scheduleTopPicksNotification$Reason, "reason");
            this.f47406a = scheduleTopPicksNotification$Reason;
        }

        @NotNull
        /* renamed from: a */
        public final ScheduleTopPicksNotification$Reason m57385a() {
            return this.f47406a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/toppicks/notifications/TopPicksNotificationScheduler$Request;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.ScheduleTopPicksNotification$b */
    static final class C15277b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ ScheduleTopPicksNotification f47407a;
        /* renamed from: b */
        final /* synthetic */ C15276a f47408b;

        C15277b(ScheduleTopPicksNotification scheduleTopPicksNotification, C15276a c15276a) {
            this.f47407a = scheduleTopPicksNotification;
            this.f47408b = c15276a;
        }

        public /* synthetic */ Object call() {
            return m57386a();
        }

        @Nullable
        /* renamed from: a */
        public final C15279b m57386a() {
            int intValue;
            DateTime b;
            int toSeconds;
            int i;
            this.f47407a.f52485g.a(new C2659a(this.f47408b.m57385a()));
            TopPicksSettings topPicksSettings = this.f47407a.f52481c.get();
            Map dailyNotificationOffsets = topPicksSettings != null ? topPicksSettings.getDailyNotificationOffsets() : null;
            if (dailyNotificationOffsets != null) {
                Integer num = (Integer) dailyNotificationOffsets.get(this.f47407a.f52483e.getNotificationOffset());
                if (num != null) {
                    intValue = num.intValue();
                    b = this.f47407a.f52480b.getTopPicksRefreshTime().getTime().b(intValue);
                    C2668g.a(b, "notificationDispatchTime");
                    toSeconds = (int) TimeUnit.MILLISECONDS.toSeconds(b.getMillis() - ((DateTime) this.f47407a.f52486h.invoke()).getMillis());
                    i = toSeconds + 600;
                    this.f47407a.f52480b.saveNotificationScheduleTime(b.getMillis());
                    if (intValue != -1) {
                        if (!this.f47407a.f52482d.execute().booleanValue()) {
                            this.f47407a.f52484f.m62845a(new C15281a(b.getMillis()));
                            this.f47407a.f52480b.saveNotificationJobId("top-picks-notification-dispatcher-job");
                            return new C15279b("top-picks-notification-dispatcher-job", b.getHourOfDay(), toSeconds, i);
                        }
                    }
                    return null;
                }
            }
            intValue = -1;
            b = this.f47407a.f52480b.getTopPicksRefreshTime().getTime().b(intValue);
            C2668g.a(b, "notificationDispatchTime");
            toSeconds = (int) TimeUnit.MILLISECONDS.toSeconds(b.getMillis() - ((DateTime) this.f47407a.f52486h.invoke()).getMillis());
            i = toSeconds + 600;
            this.f47407a.f52480b.saveNotificationScheduleTime(b.getMillis());
            if (intValue != -1) {
                if (!this.f47407a.f52482d.execute().booleanValue()) {
                    this.f47407a.f52484f.m62845a(new C15281a(b.getMillis()));
                    this.f47407a.f52480b.saveNotificationJobId("top-picks-notification-dispatcher-job");
                    return new C15279b("top-picks-notification-dispatcher-job", b.getHourOfDay(), toSeconds, i);
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/tinder/toppicks/notifications/TopPicksNotificationScheduler$Request;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.ScheduleTopPicksNotification$c */
    static final class C17033c<T, R> implements Function<C15279b, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ ScheduleTopPicksNotification f52478a;

        C17033c(ScheduleTopPicksNotification scheduleTopPicksNotification) {
            this.f52478a = scheduleTopPicksNotification;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62825a((C15279b) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m62825a(@NotNull C15279b c15279b) {
            C2668g.b(c15279b, "it");
            return this.f52478a.f52479a.schedule(c15279b);
        }
    }

    @Inject
    public ScheduleTopPicksNotification(@NotNull TopPicksNotificationScheduler topPicksNotificationScheduler, @NotNull TopPicksApplicationRepository topPicksApplicationRepository, @NotNull TopPicksSettingRepository topPicksSettingRepository, @NotNull TopPicksNotificationsAreEnabled topPicksNotificationsAreEnabled, @NotNull TopPicksConfig topPicksConfig, @NotNull C17045f c17045f, @NotNull C3947n c3947n, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(topPicksNotificationScheduler, "topPicksNotificationScheduler");
        C2668g.b(topPicksApplicationRepository, "topPicksApplicationRepository");
        C2668g.b(topPicksSettingRepository, "topPicksSettingRepository");
        C2668g.b(topPicksNotificationsAreEnabled, "topPicksNotificationsAreEnabled");
        C2668g.b(topPicksConfig, "topPicksConfig");
        C2668g.b(c17045f, "sendTopPicksPushSendEvent");
        C2668g.b(c3947n, "unscheduleTopPicksNotification");
        C2668g.b(function0, "dateTimeProvider");
        this.f52479a = topPicksNotificationScheduler;
        this.f52480b = topPicksApplicationRepository;
        this.f52481c = topPicksSettingRepository;
        this.f52482d = topPicksNotificationsAreEnabled;
        this.f52483e = topPicksConfig;
        this.f52484f = c17045f;
        this.f52485g = c3947n;
        this.f52486h = function0;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m62834a((C15276a) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m62834a(@NotNull C15276a c15276a) {
        C2668g.b(c15276a, "request");
        c15276a = C3958c.a(new C15277b(this, c15276a)).e(new C17033c(this));
        C2668g.a(c15276a, "Maybe.fromCallable {\n   …nScheduler.schedule(it) }");
        return c15276a;
    }
}
