package com.tinder.toppicks.notifications;

import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.notifications.m */
public final class C17052m implements MembersInjector<TopPicksNotificationDispatcherService> {
    /* renamed from: a */
    private final Provider<TopPicksNotificationDispatcher> f52520a;
    /* renamed from: b */
    private final Provider<TopPicksApplicationRepository> f52521b;

    public /* synthetic */ void injectMembers(Object obj) {
        m62861a((TopPicksNotificationDispatcherService) obj);
    }

    /* renamed from: a */
    public void m62861a(TopPicksNotificationDispatcherService topPicksNotificationDispatcherService) {
        C17052m.m62860a(topPicksNotificationDispatcherService, (TopPicksNotificationDispatcher) this.f52520a.get());
        C17052m.m62859a(topPicksNotificationDispatcherService, (TopPicksApplicationRepository) this.f52521b.get());
    }

    /* renamed from: a */
    public static void m62860a(TopPicksNotificationDispatcherService topPicksNotificationDispatcherService, TopPicksNotificationDispatcher topPicksNotificationDispatcher) {
        topPicksNotificationDispatcherService.f52490a = topPicksNotificationDispatcher;
    }

    /* renamed from: a */
    public static void m62859a(TopPicksNotificationDispatcherService topPicksNotificationDispatcherService, TopPicksApplicationRepository topPicksApplicationRepository) {
        topPicksNotificationDispatcherService.f52491b = topPicksApplicationRepository;
    }
}
