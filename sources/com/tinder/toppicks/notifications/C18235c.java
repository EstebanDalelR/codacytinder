package com.tinder.toppicks.notifications;

import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.domain.toppicks.repo.TopPicksSettingRepository;
import com.tinder.domain.toppicks.usecase.TopPicksNotificationsAreEnabled;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.toppicks.notifications.c */
public final class C18235c implements Factory<ScheduleTopPicksNotification> {
    /* renamed from: a */
    private final Provider<TopPicksNotificationScheduler> f56519a;
    /* renamed from: b */
    private final Provider<TopPicksApplicationRepository> f56520b;
    /* renamed from: c */
    private final Provider<TopPicksSettingRepository> f56521c;
    /* renamed from: d */
    private final Provider<TopPicksNotificationsAreEnabled> f56522d;
    /* renamed from: e */
    private final Provider<TopPicksConfig> f56523e;
    /* renamed from: f */
    private final Provider<C17045f> f56524f;
    /* renamed from: g */
    private final Provider<C3947n> f56525g;
    /* renamed from: h */
    private final Provider<Function0<DateTime>> f56526h;

    public /* synthetic */ Object get() {
        return m66091a();
    }

    public C18235c(Provider<TopPicksNotificationScheduler> provider, Provider<TopPicksApplicationRepository> provider2, Provider<TopPicksSettingRepository> provider3, Provider<TopPicksNotificationsAreEnabled> provider4, Provider<TopPicksConfig> provider5, Provider<C17045f> provider6, Provider<C3947n> provider7, Provider<Function0<DateTime>> provider8) {
        this.f56519a = provider;
        this.f56520b = provider2;
        this.f56521c = provider3;
        this.f56522d = provider4;
        this.f56523e = provider5;
        this.f56524f = provider6;
        this.f56525g = provider7;
        this.f56526h = provider8;
    }

    /* renamed from: a */
    public ScheduleTopPicksNotification m66091a() {
        return C18235c.m66089a(this.f56519a, this.f56520b, this.f56521c, this.f56522d, this.f56523e, this.f56524f, this.f56525g, this.f56526h);
    }

    /* renamed from: a */
    public static ScheduleTopPicksNotification m66089a(Provider<TopPicksNotificationScheduler> provider, Provider<TopPicksApplicationRepository> provider2, Provider<TopPicksSettingRepository> provider3, Provider<TopPicksNotificationsAreEnabled> provider4, Provider<TopPicksConfig> provider5, Provider<C17045f> provider6, Provider<C3947n> provider7, Provider<Function0<DateTime>> provider8) {
        return new ScheduleTopPicksNotification((TopPicksNotificationScheduler) provider.get(), (TopPicksApplicationRepository) provider2.get(), (TopPicksSettingRepository) provider3.get(), (TopPicksNotificationsAreEnabled) provider4.get(), (TopPicksConfig) provider5.get(), (C17045f) provider6.get(), (C3947n) provider7.get(), (Function0) provider8.get());
    }

    /* renamed from: b */
    public static C18235c m66090b(Provider<TopPicksNotificationScheduler> provider, Provider<TopPicksApplicationRepository> provider2, Provider<TopPicksSettingRepository> provider3, Provider<TopPicksNotificationsAreEnabled> provider4, Provider<TopPicksConfig> provider5, Provider<C17045f> provider6, Provider<C3947n> provider7, Provider<Function0<DateTime>> provider8) {
        return new C18235c(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }
}
