package com.tinder.toppicks.notifications;

import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.toppicks.usecase.TopPicksNotificationsAreEnabled;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.p380a.C14548a;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/toppicks/notifications/TinderTopPicksNotificationDispatcher;", "Lcom/tinder/toppicks/notifications/TopPicksNotificationDispatcher;", "notificationFactory", "Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;", "notificationDispatcher", "Lcom/tinder/pushnotifications/NotificationDispatcher;", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "topPicksNotificationsAreEnabled", "Lcom/tinder/domain/toppicks/usecase/TopPicksNotificationsAreEnabled;", "(Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;Lcom/tinder/pushnotifications/NotificationDispatcher;Lcom/tinder/domain/config/TopPicksConfig;Lcom/tinder/domain/toppicks/usecase/TopPicksNotificationsAreEnabled;)V", "dispatch", "Lio/reactivex/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.notifications.j */
public final class C17049j implements TopPicksNotificationDispatcher {
    /* renamed from: a */
    private final C14548a f52512a;
    /* renamed from: b */
    private final C14550a f52513b;
    /* renamed from: c */
    private final TopPicksConfig f52514c;
    /* renamed from: d */
    private final TopPicksNotificationsAreEnabled f52515d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.j$a */
    static final class C17048a implements Action {
        /* renamed from: a */
        final /* synthetic */ C17049j f52511a;

        C17048a(C17049j c17049j) {
            this.f52511a = c17049j;
        }

        public final void run() {
            if (this.f52511a.f52515d.execute().booleanValue()) {
                this.f52511a.f52513b.m55573a(this.f52511a.f52512a.m55563a(this.f52511a.f52514c.getNotificationMessage()));
            }
        }
    }

    @Inject
    public C17049j(@NotNull C14548a c14548a, @NotNull C14550a c14550a, @NotNull TopPicksConfig topPicksConfig, @NotNull TopPicksNotificationsAreEnabled topPicksNotificationsAreEnabled) {
        C2668g.b(c14548a, "notificationFactory");
        C2668g.b(c14550a, "notificationDispatcher");
        C2668g.b(topPicksConfig, "topPicksConfig");
        C2668g.b(topPicksNotificationsAreEnabled, "topPicksNotificationsAreEnabled");
        this.f52512a = c14548a;
        this.f52513b = c14550a;
        this.f52514c = topPicksConfig;
        this.f52515d = topPicksNotificationsAreEnabled;
    }

    @NotNull
    public C3956a dispatch() {
        C3956a a = C3956a.a(new C17048a(this));
        C2668g.a(a, "Completable.fromAction {…)\n            }\n        }");
        return a;
    }
}
