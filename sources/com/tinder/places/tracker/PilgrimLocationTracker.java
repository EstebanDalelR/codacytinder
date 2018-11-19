package com.tinder.places.tracker;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import com.foursquare.pilgrim.CurrentPlace;
import com.foursquare.pilgrim.PilgrimNotificationHandler;
import com.foursquare.pilgrim.PilgrimSdk;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;
import com.foursquare.pilgrim.PilgrimSdkBackfillNotification;
import com.foursquare.pilgrim.PilgrimSdkPlaceNotification;
import com.foursquare.pilgrim.PilgrimUserInfo;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.ManagerWebServices;
import com.tinder.auth.repository.C8297k;
import com.tinder.domain.common.model.User;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u000eJ\u0006\u0010\u0017\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/places/tracker/PilgrimLocationTracker;", "Lcom/foursquare/pilgrim/PilgrimNotificationHandler;", "context", "Landroid/app/Application;", "environmentProvider", "Lcom/tinder/api/EnvironmentProvider;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "deviceIdFactory", "Lcom/tinder/auth/repository/DeviceIdFactory;", "(Landroid/app/Application;Lcom/tinder/api/EnvironmentProvider;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lcom/tinder/auth/repository/DeviceIdFactory;)V", "visitListener", "Lcom/tinder/places/tracker/PilgrimLocationTracker$VisitListener;", "disable", "", "handleBackfillNotification", "Landroid/content/Context;", "notification", "Lcom/foursquare/pilgrim/PilgrimSdkBackfillNotification;", "handlePlaceNotification", "Lcom/foursquare/pilgrim/PilgrimSdkPlaceNotification;", "initialize", "startTracking", "stopTracking", "PlaceSource", "VisitListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PilgrimLocationTracker extends PilgrimNotificationHandler {
    /* renamed from: a */
    private VisitListener f49818a;
    /* renamed from: b */
    private final Application f49819b;
    /* renamed from: c */
    private final EnvironmentProvider f49820c;
    /* renamed from: d */
    private final LoadProfileOptionData f49821d;
    /* renamed from: e */
    private final C8297k f49822e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/tracker/PilgrimLocationTracker$PlaceSource;", "", "(Ljava/lang/String;I)V", "BACKFILL", "ONLINE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum PlaceSource {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/places/tracker/PilgrimLocationTracker$VisitListener;", "", "handleVisit", "", "place", "Lcom/foursquare/pilgrim/CurrentPlace;", "source", "Lcom/tinder/places/tracker/PilgrimLocationTracker$PlaceSource;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface VisitListener {
        void handleVisit(@NotNull CurrentPlace currentPlace, @NotNull PlaceSource placeSource);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/common/model/User;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.tracker.PilgrimLocationTracker$a */
    static final class C16041a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16041a f49815a = new C16041a();

        C16041a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m60809a((User) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m60809a(@NotNull User user) {
            C2668g.b(user, "it");
            return user.id();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "userId", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.tracker.PilgrimLocationTracker$b */
    static final class C16042b<T> implements Consumer<String> {
        /* renamed from: a */
        final /* synthetic */ PilgrimLocationTracker f49816a;

        C16042b(PilgrimLocationTracker pilgrimLocationTracker) {
            this.f49816a = pilgrimLocationTracker;
        }

        public /* synthetic */ void accept(Object obj) {
            m60810a((String) obj);
        }

        /* renamed from: a */
        public final void m60810a(String str) {
            PilgrimUserInfo pilgrimUserInfo = new PilgrimUserInfo();
            Map map = pilgrimUserInfo;
            map.put("environment", this.f49816a.f49820c.getUrlBase());
            map.put("install-id", this.f49816a.f49822e.a());
            map.put("platform", "android");
            map.put("app-version", String.valueOf(2776));
            map.put("os-version", String.valueOf(VERSION.SDK_INT));
            map.put("User-Agent", ManagerWebServices.USER_AGENT_STRING);
            pilgrimUserInfo.setUserId(str);
            PilgrimSdk.get().setUserInfo(pilgrimUserInfo).setNotificationHandler(this.f49816a).setLogLevel(LogLevel.ERROR);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.tracker.PilgrimLocationTracker$c */
    static final class C16043c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16043c f49817a = new C16043c();

        C16043c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m60811a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m60811a(Throwable th) {
            C0001a.c(th, "Error getting userID. PILGRIM SDK NOT STARTED!!", new Object[0]);
        }
    }

    @Inject
    public PilgrimLocationTracker(@NotNull Application application, @NotNull EnvironmentProvider environmentProvider, @NotNull LoadProfileOptionData loadProfileOptionData, @NotNull C8297k c8297k) {
        C2668g.b(application, "context");
        C2668g.b(environmentProvider, "environmentProvider");
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        C2668g.b(c8297k, "deviceIdFactory");
        this.f49819b = application;
        this.f49820c = environmentProvider;
        this.f49821d = loadProfileOptionData;
        this.f49822e = c8297k;
    }

    /* renamed from: a */
    public final void m60815a(@NotNull VisitListener visitListener) {
        C2668g.b(visitListener, "visitListener");
        this.f49818a = visitListener;
        this.f49821d.execute(ProfileOption.User.INSTANCE).map(C16041a.f49815a).firstOrError().b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C16042b(this), C16043c.f49817a);
    }

    /* renamed from: a */
    public final void m60814a() {
        PilgrimSdk.start(this.f49819b);
    }

    /* renamed from: b */
    public final void m60816b() {
        PilgrimSdk.stop(this.f49819b);
    }

    /* renamed from: c */
    public final void m60817c() {
        PilgrimSdk.clear(this.f49819b);
        PilgrimSdk.stop(this.f49819b);
    }

    public void handleBackfillNotification(@NotNull Context context, @NotNull PilgrimSdkBackfillNotification pilgrimSdkBackfillNotification) {
        C2668g.b(context, "context");
        C2668g.b(pilgrimSdkBackfillNotification, "notification");
        context = this.f49818a;
        if (context == null) {
            C2668g.b("visitListener");
        }
        pilgrimSdkBackfillNotification = pilgrimSdkBackfillNotification.getCurrentPlace();
        C2668g.a(pilgrimSdkBackfillNotification, "notification.currentPlace");
        context.handleVisit(pilgrimSdkBackfillNotification, PlaceSource.BACKFILL);
    }

    public void handlePlaceNotification(@NotNull Context context, @NotNull PilgrimSdkPlaceNotification pilgrimSdkPlaceNotification) {
        C2668g.b(context, "context");
        C2668g.b(pilgrimSdkPlaceNotification, "notification");
        context = this.f49818a;
        if (context == null) {
            C2668g.b("visitListener");
        }
        pilgrimSdkPlaceNotification = pilgrimSdkPlaceNotification.getCurrentPlace();
        C2668g.a(pilgrimSdkPlaceNotification, "notification.currentPlace");
        context.handleVisit(pilgrimSdkPlaceNotification, PlaceSource.ONLINE);
    }
}
