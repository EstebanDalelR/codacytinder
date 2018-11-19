package com.snapchat.kit.sdk.core.metrics;

import android.os.Handler;
import android.support.annotation.AnyThread;
import android.support.annotation.VisibleForTesting;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import retrofit.RetrofitError;

/* renamed from: com.snapchat.kit.sdk.core.metrics.a */
public class C7140a<T> implements MetricQueue<T> {
    @VisibleForTesting
    /* renamed from: a */
    final Runnable f25879a = new C59351(this);
    /* renamed from: b */
    private final MetricPublisher<T> f25880b;
    /* renamed from: c */
    private final Handler f25881c;
    /* renamed from: d */
    private final LinkedHashSet<C5939b<T>> f25882d = new LinkedHashSet();
    /* renamed from: e */
    private final LinkedHashSet<C5939b<T>> f25883e = new LinkedHashSet();
    /* renamed from: f */
    private final int f25884f;
    /* renamed from: g */
    private boolean f25885g = false;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.a$1 */
    class C59351 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C7140a f21706a;

        C59351(C7140a c7140a) {
            this.f21706a = c7140a;
        }

        public void run() {
            this.f21706a.m30801b();
        }
    }

    C7140a(MetricPublisher<T> metricPublisher, Handler handler, int i) {
        this.f25880b = metricPublisher;
        this.f25881c = handler;
        this.f25884f = i;
    }

    /* renamed from: a */
    public void m30800a() {
        Collection persistedEvents = this.f25880b.getPersistedEvents();
        if (persistedEvents != null) {
            if (!persistedEvents.isEmpty()) {
                this.f25882d.addAll(persistedEvents);
                this.f25881c.postDelayed(this.f25879a, 30000);
                this.f25885g = true;
            }
        }
    }

    @AnyThread
    public void push(final T t) {
        this.f25881c.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C7140a f21708b;

            public void run() {
                this.f21708b.f25882d.add(new C5939b(t));
                this.f21708b.m30796c();
                if (this.f21708b.f25882d.size() >= this.f21708b.f25884f) {
                    this.f21708b.m30801b();
                } else if (!this.f21708b.f25885g) {
                    this.f21708b.f25881c.postDelayed(this.f21708b.f25879a, 30000);
                    this.f21708b.f25885g = true;
                }
            }
        });
    }

    @VisibleForTesting
    /* renamed from: b */
    void m30801b() {
        if (this.f25885g) {
            this.f25881c.removeCallbacks(this.f25879a);
            this.f25885g = false;
        }
        if (!this.f25882d.isEmpty()) {
            final Collection arrayList = new ArrayList(this.f25882d);
            this.f25882d.clear();
            this.f25883e.addAll(arrayList);
            this.f25880b.publishMetrics(C7140a.m30792a(arrayList), new PublishCallback(this) {
                /* renamed from: b */
                final /* synthetic */ C7140a f25873b;

                public void onSuccess() {
                    this.f25873b.f25883e.removeAll(arrayList);
                    this.f25873b.m30796c();
                }

                public void onNetworkError() {
                    this.f25873b.f25883e.removeAll(arrayList);
                    this.f25873b.f25882d.addAll(arrayList);
                }

                public void onServerError(RetrofitError retrofitError) {
                    this.f25873b.f25883e.removeAll(arrayList);
                    for (C5939b c5939b : arrayList) {
                        if (c5939b.m25532b() < 1) {
                            c5939b.m25531a();
                            this.f25873b.f25882d.add(c5939b);
                        }
                    }
                    this.f25873b.m30796c();
                }
            });
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    static <T> List<T> m30792a(Collection<C5939b<T>> collection) {
        List arrayList = new ArrayList(collection.size());
        for (C5939b c : collection) {
            arrayList.add(c.m25533c());
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m30796c() {
        List arrayList = new ArrayList(this.f25882d);
        arrayList.addAll(this.f25883e);
        this.f25880b.persistMetrics(arrayList);
    }
}
