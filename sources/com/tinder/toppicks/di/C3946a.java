package com.tinder.toppicks.di;

import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.toppicks.di.TopPicksApplicationComponent.Parent;
import com.tinder.toppicks.notifications.C17052m;
import com.tinder.toppicks.notifications.TopPicksNotificationDispatcher;
import com.tinder.toppicks.notifications.TopPicksNotificationDispatcherService;
import dagger.internal.C15521i;

/* renamed from: com.tinder.toppicks.di.a */
public final class C3946a implements TopPicksApplicationComponent {
    /* renamed from: a */
    private Parent f12519a;

    /* renamed from: com.tinder.toppicks.di.a$a */
    public static final class C2658a {
        /* renamed from: a */
        private Parent f8375a;

        private C2658a() {
        }

        /* renamed from: a */
        public TopPicksApplicationComponent m10170a() {
            if (this.f8375a != null) {
                return new C3946a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Parent.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C2658a m10171a(Parent parent) {
            this.f8375a = (Parent) C15521i.a(parent);
            return this;
        }
    }

    private C3946a(C2658a c2658a) {
        m15127a(c2658a);
    }

    /* renamed from: a */
    public static C2658a m15125a() {
        return new C2658a();
    }

    /* renamed from: a */
    private void m15127a(C2658a c2658a) {
        this.f12519a = c2658a.f8375a;
    }

    public void inject(TopPicksNotificationDispatcherService topPicksNotificationDispatcherService) {
        m15126a(topPicksNotificationDispatcherService);
    }

    /* renamed from: a */
    private TopPicksNotificationDispatcherService m15126a(TopPicksNotificationDispatcherService topPicksNotificationDispatcherService) {
        C17052m.a(topPicksNotificationDispatcherService, (TopPicksNotificationDispatcher) C15521i.a(this.f12519a.topPicksNotificationDispatcher(), "Cannot return null from a non-@Nullable component method"));
        C17052m.a(topPicksNotificationDispatcherService, (TopPicksApplicationRepository) C15521i.a(this.f12519a.topPicksApplicationRepository(), "Cannot return null from a non-@Nullable component method"));
        return topPicksNotificationDispatcherService;
    }
}
