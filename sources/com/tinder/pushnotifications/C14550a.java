package com.tinder.pushnotifications;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.model.PlacesConfig;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.etl.event.sw;
import com.tinder.managers.ManagerApp;
import com.tinder.pushnotifications.model.C16257h;
import com.tinder.pushnotifications.model.C16260k;
import com.tinder.pushnotifications.model.C16261l;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.strategy.C16266a;
import com.tinder.pushnotifications.strategy.C16270c;
import com.tinder.pushnotifications.usecase.C14574a;
import io.reactivex.BackpressureStrategy;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/pushnotifications/NotificationDispatcher;", "", "appVisibilityTracker", "Lcom/tinder/app/AppVisibilityTracker;", "backgroundNotificationStrategy", "Lcom/tinder/pushnotifications/strategy/BackgroundNotificationStrategy;", "foregroundNotificationStrategy", "Lcom/tinder/pushnotifications/strategy/ForegroundNotificationStrategy;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "cancelNotification", "Lcom/tinder/pushnotifications/usecase/CancelNotification;", "placesConfigProvider", "Lcom/tinder/domain/places/PlacesConfigProvider;", "(Lcom/tinder/app/AppVisibilityTracker;Lcom/tinder/pushnotifications/strategy/BackgroundNotificationStrategy;Lcom/tinder/pushnotifications/strategy/ForegroundNotificationStrategy;Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/pushnotifications/usecase/CancelNotification;Lcom/tinder/domain/places/PlacesConfigProvider;)V", "dispatchNotification", "", "notification", "Lcom/tinder/pushnotifications/model/TinderNotification;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.a */
public final class C14550a {
    /* renamed from: a */
    private final AppVisibilityTracker f45973a;
    /* renamed from: b */
    private final C16266a f45974b;
    /* renamed from: c */
    private final C16270c f45975c;
    /* renamed from: d */
    private final C2630h f45976d;
    /* renamed from: e */
    private final C14574a f45977e;
    /* renamed from: f */
    private final PlacesConfigProvider f45978f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.a$a */
    static final class C17874a<T, R> implements Func1<AppVisibilityTracker$Visibility, Boolean> {
        /* renamed from: a */
        final /* synthetic */ TinderNotification f55753a;

        C17874a(TinderNotification tinderNotification) {
            this.f55753a = tinderNotification;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65150a((AppVisibilityTracker$Visibility) obj));
        }

        /* renamed from: a */
        public final boolean m65150a(AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
            TinderNotification tinderNotification = this.f55753a;
            C2668g.a(appVisibilityTracker$Visibility, "it");
            return tinderNotification.mo11938a(appVisibilityTracker$Visibility);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.a$b */
    static final class C18648b<T> implements Action1<AppVisibilityTracker$Visibility> {
        /* renamed from: a */
        final /* synthetic */ C14550a f58115a;
        /* renamed from: b */
        final /* synthetic */ TinderNotification f58116b;

        C18648b(C14550a c14550a, TinderNotification tinderNotification) {
            this.f58115a = c14550a;
            this.f58116b = tinderNotification;
        }

        public /* synthetic */ void call(Object obj) {
            m67087a((AppVisibilityTracker$Visibility) obj);
        }

        /* renamed from: a */
        public final void m67087a(AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
            this.f58115a.f45976d.a(sw.a().a(this.f58116b.m55596k()).a(Boolean.valueOf(appVisibilityTracker$Visibility == AppVisibilityTracker$Visibility.FOREGROUND)).a());
            if (appVisibilityTracker$Visibility == AppVisibilityTracker$Visibility.BACKGROUND) {
                appVisibilityTracker$Visibility = this.f58115a.f45974b;
            } else {
                appVisibilityTracker$Visibility = this.f58115a.f45975c;
            }
            appVisibilityTracker$Visibility.sendNotification(this.f58116b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.a$c */
    static final class C18649c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18649c f58117a = new C18649c();

        C18649c() {
        }

        public /* synthetic */ void call(Object obj) {
            m67088a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67088a(Throwable th) {
            C0001a.e("Error showing push notification", new Object[0]);
            C0001a.c(th);
        }
    }

    @Inject
    public C14550a(@NotNull AppVisibilityTracker appVisibilityTracker, @NotNull C16266a c16266a, @NotNull C16270c c16270c, @NotNull C2630h c2630h, @NotNull C14574a c14574a, @NotNull PlacesConfigProvider placesConfigProvider) {
        C2668g.b(appVisibilityTracker, "appVisibilityTracker");
        C2668g.b(c16266a, "backgroundNotificationStrategy");
        C2668g.b(c16270c, "foregroundNotificationStrategy");
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c14574a, "cancelNotification");
        C2668g.b(placesConfigProvider, "placesConfigProvider");
        this.f45973a = appVisibilityTracker;
        this.f45974b = c16266a;
        this.f45975c = c16270c;
        this.f45976d = c2630h;
        this.f45977e = c14574a;
        this.f45978f = placesConfigProvider;
    }

    /* renamed from: a */
    public final void m55573a(@NotNull TinderNotification tinderNotification) {
        C2668g.b(tinderNotification, "notification");
        tinderNotification.mo11931a(this.f45976d);
        if (tinderNotification instanceof C16261l) {
            this.f45977e.m55609a((C16261l) tinderNotification);
            return;
        }
        if (tinderNotification instanceof C16257h) {
            if (ManagerApp.b(((C16257h) tinderNotification).m61432i())) {
                return;
            }
        } else if (tinderNotification instanceof C16260k) {
            this.f45978f.update(PlacesConfig.copy$default(this.f45978f.get(), 0, null, false, false, 14, null));
        }
        RxJavaInteropExtKt.toV1Observable(this.f45973a.trackVisibility(), BackpressureStrategy.LATEST).h().f(new C17874a(tinderNotification)).a(new C18648b(this, tinderNotification), (Action1) C18649c.f58117a);
    }
}
