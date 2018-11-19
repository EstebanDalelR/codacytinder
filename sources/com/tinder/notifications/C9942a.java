package com.tinder.notifications;

import com.tinder.domain.pushnotifications.model.PushNotificationSetting;
import com.tinder.domain.settings.notifications.NotificationSettingsRepository;
import io.reactivex.C3960g;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/notifications/NotificationSettingsPresenter;", "", "notificationSettingsRepository", "Lcom/tinder/domain/settings/notifications/NotificationSettingsRepository;", "notificationSettingsShadowRepository", "Lcom/tinder/notifications/NotificationSettingsShadowRepository;", "(Lcom/tinder/domain/settings/notifications/NotificationSettingsRepository;Lcom/tinder/notifications/NotificationSettingsShadowRepository;)V", "notificationSettingsShadowProviderDisposable", "Lio/reactivex/disposables/Disposable;", "target", "Lcom/tinder/notifications/NotificationSettingsTarget;", "dropTarget", "", "onDroppingTarget", "onSettingChanged", "pushNotificationSetting", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "onTakingTarget", "takeTarget", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.notifications.a */
public final class C9942a {
    /* renamed from: a */
    private NotificationSettingsTarget f32773a;
    /* renamed from: b */
    private Disposable f32774b;
    /* renamed from: c */
    private final NotificationSettingsRepository f32775c;
    /* renamed from: d */
    private final C9943c f32776d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.notifications.a$a */
    static final class C12140a implements Action {
        /* renamed from: a */
        public static final C12140a f39383a = new C12140a();

        C12140a() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.notifications.a$b */
    static final class C12141b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12141b f39384a = new C12141b();

        C12141b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48288a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48288a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.notifications.a$c */
    static final class C12142c<T> implements Consumer<Set<? extends PushNotificationSetting>> {
        /* renamed from: a */
        final /* synthetic */ C9942a f39385a;

        C12142c(C9942a c9942a) {
            this.f39385a = c9942a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48289a((Set) obj);
        }

        /* renamed from: a */
        public final void m48289a(Set<? extends PushNotificationSetting> set) {
            C9943c a = this.f39385a.f32776d;
            C2668g.a(set, "it");
            a.m40914a(set);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.notifications.a$d */
    static final class C12143d<T> implements Consumer<Set<? extends PushNotificationSetting>> {
        /* renamed from: a */
        final /* synthetic */ C9942a f39386a;

        C12143d(C9942a c9942a) {
            this.f39386a = c9942a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48290a((Set) obj);
        }

        /* renamed from: a */
        public final void m48290a(Set<? extends PushNotificationSetting> set) {
            NotificationSettingsTarget b = this.f39386a.f32773a;
            if (b != null) {
                C2668g.a(set, "it");
                b.showPushNotificationSettings(set);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.notifications.a$e */
    static final class C12144e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12144e f39387a = new C12144e();

        C12144e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48291a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48291a(Throwable th) {
            C0001a.c(th, "Failed when observing notifications updates", new Object[0]);
        }
    }

    @Inject
    public C9942a(@NotNull NotificationSettingsRepository notificationSettingsRepository, @NotNull C9943c c9943c) {
        C2668g.b(notificationSettingsRepository, "notificationSettingsRepository");
        C2668g.b(c9943c, "notificationSettingsShadowRepository");
        this.f32775c = notificationSettingsRepository;
        this.f32776d = c9943c;
    }

    /* renamed from: a */
    public final void m40908a(@NotNull NotificationSettingsTarget notificationSettingsTarget) {
        C2668g.b(notificationSettingsTarget, "target");
        this.f32773a = notificationSettingsTarget;
    }

    /* renamed from: a */
    public final void m40906a() {
        C3960g a = this.f32775c.observeNotificationSettings().b(C15756a.b()).a(C15674a.a());
        Consumer c12142c = new C12142c(this);
        Function1 function1 = NotificationSettingsPresenter$onTakingTarget$2.f45325a;
        if (function1 != null) {
            function1 = new C12145b(function1);
        }
        a.a(c12142c, (Consumer) function1);
        this.f32774b = this.f32776d.m40913a().subscribeOn(C15756a.b()).observeOn(C15674a.a()).subscribe(new C12143d(this), C12144e.f39387a);
    }

    /* renamed from: a */
    public final void m40907a(@NotNull PushNotificationSetting pushNotificationSetting) {
        C2668g.b(pushNotificationSetting, "pushNotificationSetting");
        Iterable<Object> b = this.f32776d.m40915b();
        Collection arrayList = new ArrayList(C19301m.a(b, 10));
        for (Object obj : b) {
            Object obj2;
            if (obj2.getType() == pushNotificationSetting.getType()) {
                obj2 = pushNotificationSetting;
            }
            arrayList.add(obj2);
        }
        this.f32776d.m40914a(C19301m.n((List) arrayList));
    }

    /* renamed from: b */
    public final void m40909b() {
        this.f32775c.saveNotificationSettings(this.f32776d.m40915b()).b(C15756a.b()).a(C12140a.f39383a, C12141b.f39384a);
        Disposable disposable = this.f32774b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: c */
    public final void m40910c() {
        this.f32773a = (NotificationSettingsTarget) null;
    }
}
