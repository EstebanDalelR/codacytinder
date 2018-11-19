package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class GraphRequestBatch extends AbstractList<GraphRequest> {
    /* renamed from: a */
    private static AtomicInteger f3130a = new AtomicInteger();
    /* renamed from: b */
    private Handler f3131b;
    /* renamed from: c */
    private List<GraphRequest> f3132c;
    /* renamed from: d */
    private int f3133d;
    /* renamed from: e */
    private final String f3134e;
    /* renamed from: f */
    private List<Callback> f3135f;
    /* renamed from: g */
    private String f3136g;

    public interface Callback {
        void onBatchCompleted(GraphRequestBatch graphRequestBatch);
    }

    public interface OnProgressCallback extends Callback {
        void onBatchProgress(GraphRequestBatch graphRequestBatch, long j, long j2);
    }

    public /* synthetic */ void add(int i, Object obj) {
        m4071a(i, (GraphRequest) obj);
    }

    public /* synthetic */ boolean add(Object obj) {
        return m4074a((GraphRequest) obj);
    }

    public /* synthetic */ Object get(int i) {
        return m4070a(i);
    }

    public /* synthetic */ Object remove(int i) {
        return m4075b(i);
    }

    public /* synthetic */ Object set(int i, Object obj) {
        return m4076b(i, (GraphRequest) obj);
    }

    public GraphRequestBatch() {
        this.f3132c = new ArrayList();
        this.f3133d = 0;
        this.f3134e = Integer.valueOf(f3130a.incrementAndGet()).toString();
        this.f3135f = new ArrayList();
        this.f3132c = new ArrayList();
    }

    public GraphRequestBatch(Collection<GraphRequest> collection) {
        this.f3132c = new ArrayList();
        this.f3133d = 0;
        this.f3134e = Integer.valueOf(f3130a.incrementAndGet()).toString();
        this.f3135f = new ArrayList();
        this.f3132c = new ArrayList(collection);
    }

    public GraphRequestBatch(GraphRequest... graphRequestArr) {
        this.f3132c = new ArrayList();
        this.f3133d = 0;
        this.f3134e = Integer.valueOf(f3130a.incrementAndGet()).toString();
        this.f3135f = new ArrayList();
        this.f3132c = Arrays.asList(graphRequestArr);
    }

    /* renamed from: a */
    public int m4069a() {
        return this.f3133d;
    }

    /* renamed from: a */
    public void m4073a(Callback callback) {
        if (!this.f3135f.contains(callback)) {
            this.f3135f.add(callback);
        }
    }

    /* renamed from: a */
    public final boolean m4074a(GraphRequest graphRequest) {
        return this.f3132c.add(graphRequest);
    }

    /* renamed from: a */
    public final void m4071a(int i, GraphRequest graphRequest) {
        this.f3132c.add(i, graphRequest);
    }

    public final void clear() {
        this.f3132c.clear();
    }

    /* renamed from: a */
    public final GraphRequest m4070a(int i) {
        return (GraphRequest) this.f3132c.get(i);
    }

    /* renamed from: b */
    public final GraphRequest m4075b(int i) {
        return (GraphRequest) this.f3132c.remove(i);
    }

    /* renamed from: b */
    public final GraphRequest m4076b(int i, GraphRequest graphRequest) {
        return (GraphRequest) this.f3132c.set(i, graphRequest);
    }

    public final int size() {
        return this.f3132c.size();
    }

    /* renamed from: b */
    final String m4077b() {
        return this.f3134e;
    }

    /* renamed from: c */
    final Handler m4078c() {
        return this.f3131b;
    }

    /* renamed from: a */
    final void m4072a(Handler handler) {
        this.f3131b = handler;
    }

    /* renamed from: d */
    final List<GraphRequest> m4079d() {
        return this.f3132c;
    }

    /* renamed from: e */
    final List<Callback> m4080e() {
        return this.f3135f;
    }

    /* renamed from: f */
    public final String m4081f() {
        return this.f3136g;
    }

    /* renamed from: g */
    public final List<GraphResponse> m4082g() {
        return m4084i();
    }

    /* renamed from: h */
    public final C1680e m4083h() {
        return m4085j();
    }

    /* renamed from: i */
    List<GraphResponse> m4084i() {
        return GraphRequest.m4033b(this);
    }

    /* renamed from: j */
    C1680e m4085j() {
        return GraphRequest.m4037c(this);
    }
}
