package com.tinder.analytics.fireworks;

public abstract class BatchScheduleStrategy {
    /* renamed from: a */
    private Listener f22786a;

    public interface Listener {
        void onShouldBatch();
    }

    /* renamed from: a */
    abstract void mo6796a();

    /* renamed from: b */
    abstract void mo6797b();

    /* renamed from: a */
    void m26853a(Listener listener) {
        this.f22786a = listener;
    }

    /* renamed from: c */
    void m26855c() {
        if (this.f22786a != null) {
            this.f22786a.onShouldBatch();
        }
    }
}
