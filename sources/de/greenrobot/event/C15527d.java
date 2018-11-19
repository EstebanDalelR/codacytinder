package de.greenrobot.event;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: de.greenrobot.event.d */
public class C15527d {
    /* renamed from: i */
    private static final ExecutorService f47967i = Executors.newCachedThreadPool();
    /* renamed from: a */
    boolean f47968a = true;
    /* renamed from: b */
    boolean f47969b = true;
    /* renamed from: c */
    boolean f47970c = true;
    /* renamed from: d */
    boolean f47971d = true;
    /* renamed from: e */
    boolean f47972e;
    /* renamed from: f */
    boolean f47973f = true;
    /* renamed from: g */
    ExecutorService f47974g = f47967i;
    /* renamed from: h */
    List<Class<?>> f47975h;

    C15527d() {
    }

    /* renamed from: a */
    public C15527d m58014a(boolean z) {
        this.f47968a = z;
        return this;
    }

    /* renamed from: b */
    public C15527d m58015b(boolean z) {
        this.f47969b = z;
        return this;
    }

    /* renamed from: c */
    public C15527d m58016c(boolean z) {
        this.f47972e = z;
        return this;
    }

    /* renamed from: a */
    public C2664c m58013a() {
        return new C2664c(this);
    }
}
