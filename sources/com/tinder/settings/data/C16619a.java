package com.tinder.settings.data;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.pushnotifications.model.PushNotificationSetting;
import com.tinder.domain.pushnotifications.model.PushNotificationType;
import com.tinder.domain.pushnotifications.model.SimplePushNotificationSetting;
import com.tinder.toppicks.notifications.C3947n;
import com.tinder.toppicks.notifications.C3947n.C2659a;
import com.tinder.toppicks.notifications.ScheduleTopPicksNotification;
import com.tinder.toppicks.notifications.ScheduleTopPicksNotification$Reason;
import com.tinder.toppicks.notifications.ScheduleTopPicksNotification.C15276a;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/settings/data/HandleTopPicksNotificationSettingChange;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "scheduleTopPicksNotification", "Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification;", "unscheduleTopPicksNotification", "Lcom/tinder/toppicks/notifications/UnscheduleTopPicksNotification;", "(Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification;Lcom/tinder/toppicks/notifications/UnscheduleTopPicksNotification;)V", "execute", "Lio/reactivex/Completable;", "request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.data.a */
public final class C16619a implements CompletableUseCase<Set<? extends PushNotificationSetting>> {
    /* renamed from: a */
    private final ScheduleTopPicksNotification f51479a;
    /* renamed from: b */
    private final C3947n f51480b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.data.a$a */
    static final class C16618a implements Action {
        /* renamed from: a */
        final /* synthetic */ C16619a f51477a;
        /* renamed from: b */
        final /* synthetic */ Set f51478b;

        C16618a(C16619a c16619a, Set set) {
            this.f51477a = c16619a;
            this.f51478b = set;
        }

        public final void run() {
            ScheduleTopPicksNotification$Reason scheduleTopPicksNotification$Reason = ScheduleTopPicksNotification$Reason.SETTINGS;
            for (Object next : this.f51478b) {
                Object obj;
                PushNotificationSetting pushNotificationSetting = (PushNotificationSetting) next;
                if (pushNotificationSetting.getType() == PushNotificationType.TOP_PICKS && (pushNotificationSetting instanceof SimplePushNotificationSetting)) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    break;
                }
            }
            Object next2 = null;
            SimplePushNotificationSetting simplePushNotificationSetting = (SimplePushNotificationSetting) next2;
            if (simplePushNotificationSetting != null) {
                if (simplePushNotificationSetting.getEnabled()) {
                    this.f51477a.f51479a.m62834a(new C15276a(scheduleTopPicksNotification$Reason));
                } else {
                    this.f51477a.f51480b.a(new C2659a(scheduleTopPicksNotification$Reason));
                }
            }
        }
    }

    @Inject
    public C16619a(@NotNull ScheduleTopPicksNotification scheduleTopPicksNotification, @NotNull C3947n c3947n) {
        C2668g.b(scheduleTopPicksNotification, "scheduleTopPicksNotification");
        C2668g.b(c3947n, "unscheduleTopPicksNotification");
        this.f51479a = scheduleTopPicksNotification;
        this.f51480b = c3947n;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m62063a((Set) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m62063a(@NotNull Set<? extends PushNotificationSetting> set) {
        C2668g.b(set, "request");
        set = C3956a.a(new C16618a(this, set));
        C2668g.a(set, "Completable.fromAction {…)\n            }\n        }");
        return set;
    }
}
