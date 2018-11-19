package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class RequestQueue {
    /* renamed from: a */
    private AtomicInteger f2343a;
    /* renamed from: b */
    private final Map<String, Queue<Request<?>>> f2344b;
    /* renamed from: c */
    private final Set<Request<?>> f2345c;
    /* renamed from: d */
    private final PriorityBlockingQueue<Request<?>> f2346d;
    /* renamed from: e */
    private final PriorityBlockingQueue<Request<?>> f2347e;
    /* renamed from: f */
    private final Cache f2348f;
    /* renamed from: g */
    private final Network f2349g;
    /* renamed from: h */
    private final ResponseDelivery f2350h;
    /* renamed from: i */
    private C0908e[] f2351i;
    /* renamed from: j */
    private C0904a f2352j;
    /* renamed from: k */
    private List<RequestFinishedListener> f2353k;

    public interface RequestFilter {
        boolean apply(Request<?> request);
    }

    public interface RequestFinishedListener<T> {
        void onRequestFinished(Request<T> request);
    }

    public RequestQueue(Cache cache, Network network, int i, ResponseDelivery responseDelivery) {
        this.f2343a = new AtomicInteger();
        this.f2344b = new HashMap();
        this.f2345c = new HashSet();
        this.f2346d = new PriorityBlockingQueue();
        this.f2347e = new PriorityBlockingQueue();
        this.f2353k = new ArrayList();
        this.f2348f = cache;
        this.f2349g = network;
        this.f2351i = new C0908e[i];
        this.f2350h = responseDelivery;
    }

    public RequestQueue(Cache cache, Network network, int i) {
        this(cache, network, i, new C3002c(new Handler(Looper.getMainLooper())));
    }

    public RequestQueue(Cache cache, Network network) {
        this(cache, network, 4);
    }

    /* renamed from: a */
    public void m3034a() {
        m3037b();
        this.f2352j = new C0904a(this.f2346d, this.f2347e, this.f2348f, this.f2350h);
        this.f2352j.start();
        for (int i = 0; i < this.f2351i.length; i++) {
            C0908e c0908e = new C0908e(this.f2347e, this.f2349g, this.f2348f, this.f2350h);
            this.f2351i[i] = c0908e;
            c0908e.start();
        }
    }

    /* renamed from: b */
    public void m3037b() {
        if (this.f2352j != null) {
            this.f2352j.m3046a();
        }
        for (int i = 0; i < this.f2351i.length; i++) {
            if (this.f2351i[i] != null) {
                this.f2351i[i].m3051a();
            }
        }
    }

    /* renamed from: c */
    public int m3039c() {
        return this.f2343a.incrementAndGet();
    }

    /* renamed from: d */
    public Cache m3040d() {
        return this.f2348f;
    }

    /* renamed from: a */
    public void m3035a(RequestFilter requestFilter) {
        synchronized (this.f2345c) {
            for (Request request : this.f2345c) {
                if (requestFilter.apply(request)) {
                    request.cancel();
                }
            }
        }
    }

    /* renamed from: a */
    public void m3036a(final Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        m3035a(new RequestFilter(this) {
            /* renamed from: b */
            final /* synthetic */ RequestQueue f9328b;

            public boolean apply(Request<?> request) {
                return request.getTag() == obj ? true : null;
            }
        });
    }

    /* renamed from: a */
    public <T> Request<T> m3033a(Request<T> request) {
        request.setRequestQueue(this);
        synchronized (this.f2345c) {
            this.f2345c.add(request);
        }
        request.setSequence(m3039c());
        request.addMarker("add-to-queue");
        if (request.shouldCache()) {
            synchronized (this.f2344b) {
                String cacheKey = request.getCacheKey();
                if (this.f2344b.containsKey(cacheKey)) {
                    Queue queue = (Queue) this.f2344b.get(cacheKey);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(request);
                    this.f2344b.put(cacheKey, queue);
                    if (C0911f.f2387b) {
                        C0911f.m3055a("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
                    }
                } else {
                    this.f2344b.put(cacheKey, null);
                    this.f2346d.add(request);
                }
            }
            return request;
        }
        this.f2347e.add(request);
        return request;
    }

    /* renamed from: b */
    <T> void m3038b(Request<T> request) {
        synchronized (this.f2345c) {
            this.f2345c.remove(request);
        }
        synchronized (this.f2353k) {
            for (RequestFinishedListener onRequestFinished : this.f2353k) {
                onRequestFinished.onRequestFinished(request);
            }
        }
        if (request.shouldCache()) {
            synchronized (this.f2344b) {
                Queue queue = (Queue) this.f2344b.remove(request.getCacheKey());
                if (queue != null) {
                    if (C0911f.f2387b) {
                        C0911f.m3055a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), request);
                    }
                    this.f2346d.addAll(queue);
                }
            }
        }
    }
}
