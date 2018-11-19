package com.tinder.analytics.fireworks;

import com.tinder.etl.event.EtlEvent;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* renamed from: com.tinder.analytics.fireworks.h */
public class C2630h {
    @Nonnull
    /* renamed from: a */
    private final C3917g f8209a;
    @Nonnull
    /* renamed from: b */
    private final BatchScheduleStrategy f8210b;
    @Nonnull
    /* renamed from: c */
    private final EventQueue f8211c;
    @Nonnull
    /* renamed from: d */
    private final C2628a f8212d;
    @Nonnull
    /* renamed from: e */
    private final Set<EventInterceptor> f8213e;
    @Nullable
    /* renamed from: f */
    private final FireworksSyncListener f8214f;

    /* renamed from: com.tinder.analytics.fireworks.h$a */
    public static class C2629a {
        @Nullable
        /* renamed from: a */
        private EventQueue f8204a;
        @Nullable
        /* renamed from: b */
        private FireworksNetworkClient f8205b;
        @Nullable
        /* renamed from: c */
        private BatchScheduleStrategy f8206c;
        @Nullable
        /* renamed from: d */
        private FireworksSyncListener f8207d;
        @Nonnull
        /* renamed from: e */
        private final Set<EventInterceptor> f8208e = new LinkedHashSet();

        @Nonnull
        /* renamed from: a */
        public C2629a m9853a(@Nonnull EventQueue eventQueue) {
            this.f8204a = eventQueue;
            return this;
        }

        @Nonnull
        /* renamed from: a */
        public C2629a m9854a(@Nonnull FireworksNetworkClient fireworksNetworkClient) {
            this.f8205b = fireworksNetworkClient;
            return this;
        }

        @Nonnull
        /* renamed from: a */
        public C2629a m9851a(@Nonnull BatchScheduleStrategy batchScheduleStrategy) {
            this.f8206c = batchScheduleStrategy;
            return this;
        }

        @Nonnull
        /* renamed from: a */
        public C2629a m9855a(@Nullable FireworksSyncListener fireworksSyncListener) {
            this.f8207d = fireworksSyncListener;
            return this;
        }

        @Nonnull
        /* renamed from: a */
        public C2629a m9852a(@Nonnull EventInterceptor eventInterceptor) {
            this.f8208e.add(eventInterceptor);
            return this;
        }

        @Nonnull
        /* renamed from: a */
        public C2630h m9856a() {
            if (this.f8204a == null) {
                throw new IllegalArgumentException("EventRepository must not be null");
            } else if (this.f8205b == null) {
                throw new IllegalArgumentException("FireworksNetworkClient must not be null");
            } else if (this.f8206c == null) {
                throw new IllegalArgumentException("batchStrategy must not be null");
            } else {
                return new C2630h(new C3917g(), this.f8206c, this.f8204a, new C2628a(this.f8204a, this.f8205b), this.f8208e, this.f8207d);
            }
        }
    }

    private C2630h(@Nonnull C3917g c3917g, @Nonnull BatchScheduleStrategy batchScheduleStrategy, @Nonnull EventQueue eventQueue, @Nonnull C2628a c2628a, @Nonnull Set<EventInterceptor> set, @Nullable FireworksSyncListener fireworksSyncListener) {
        this.f8209a = c3917g;
        this.f8210b = batchScheduleStrategy;
        this.f8211c = eventQueue;
        this.f8212d = c2628a;
        this.f8213e = set;
        this.f8214f = fireworksSyncListener;
    }

    /* renamed from: a */
    public void m9859a(@Nonnull C2632i c2632i) {
        for (EventInterceptor intercept : this.f8213e) {
            c2632i = intercept.intercept(c2632i.m9868a());
        }
        this.f8211c.addEvent(c2632i);
    }

    /* renamed from: a */
    public void m9860a(@Nonnull EtlEvent etlEvent) {
        m9859a(this.f8209a.m14683a(etlEvent));
    }

    /* renamed from: a */
    public void m9858a() {
        this.f8212d.m9850a().m10381a(new h$1(this), new h$2(this));
    }

    /* renamed from: b */
    public void m9861b() {
        this.f8210b.a(new h$3(this));
        this.f8210b.a();
    }

    /* renamed from: c */
    public void m9862c() {
        this.f8210b.b();
    }
}
