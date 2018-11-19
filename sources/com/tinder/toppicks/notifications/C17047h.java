package com.tinder.toppicks.notifications;

import android.content.res.Resources;
import com.tinder.R;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.toppicks.TopPicksDiscoveryNotificationDispatcher;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.p380a.C14548a;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.C19315a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/toppicks/notifications/TinderTopPicksDiscoveryNotificationDispatcher;", "Lcom/tinder/domain/toppicks/TopPicksDiscoveryNotificationDispatcher;", "resources", "Landroid/content/res/Resources;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "notificationFactory", "Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;", "notificationDispatcher", "Lcom/tinder/pushnotifications/NotificationDispatcher;", "(Landroid/content/res/Resources;Lkotlin/jvm/functions/Function0;Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;Lcom/tinder/pushnotifications/NotificationDispatcher;)V", "dispatch", "Lio/reactivex/Completable;", "refreshTime", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.notifications.h */
public final class C17047h implements TopPicksDiscoveryNotificationDispatcher {
    /* renamed from: a */
    private final Resources f52507a;
    /* renamed from: b */
    private final Function0<DateTime> f52508b;
    /* renamed from: c */
    private final C14548a f52509c;
    /* renamed from: d */
    private final C14550a f52510d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.h$a */
    static final class C17046a implements Action {
        /* renamed from: a */
        final /* synthetic */ C17047h f52505a;
        /* renamed from: b */
        final /* synthetic */ DateTime f52506b;

        C17046a(C17047h c17047h, DateTime dateTime) {
            this.f52505a = c17047h;
            this.f52506b = dateTime;
        }

        public final void run() {
            String a = C19315a.a("HH:mm:ss").a(new DateTime(this.f52506b.getMillis() - ((DateTime) this.f52505a.f52508b.invoke()).getMillis()).a(DateTimeZone.f8461a));
            a = this.f52505a.f52507a.getString(R.string.top_picks_alc_paywall_out_of_tps_byline, new Object[]{a});
            C14548a c = this.f52505a.f52509c;
            C2668g.a(a, "message");
            this.f52505a.f52510d.m55573a(c.m55568b(a));
        }
    }

    @Inject
    public C17047h(@NotNull Resources resources, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0, @NotNull C14548a c14548a, @NotNull C14550a c14550a) {
        C2668g.b(resources, "resources");
        C2668g.b(function0, "dateTimeProvider");
        C2668g.b(c14548a, "notificationFactory");
        C2668g.b(c14550a, "notificationDispatcher");
        this.f52507a = resources;
        this.f52508b = function0;
        this.f52509c = c14548a;
        this.f52510d = c14550a;
    }

    @NotNull
    public C3956a dispatch(@NotNull DateTime dateTime) {
        C2668g.b(dateTime, "refreshTime");
        dateTime = C3956a.a(new C17046a(this, dateTime));
        C2668g.a(dateTime, "Completable.fromAction {…n(notification)\n        }");
        return dateTime;
    }
}
