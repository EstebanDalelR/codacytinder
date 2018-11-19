package com.bumptech.glide;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.manager.C1059c;
import com.bumptech.glide.manager.C1064i;
import com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.p025c.C0978a;
import com.bumptech.glide.p025c.C3017c;
import com.bumptech.glide.p026d.C0987h;
import java.io.File;
import java.util.UUID;

public class RequestManager implements LifecycleListener {
    /* renamed from: a */
    private final Context f9392a;
    /* renamed from: b */
    private final Lifecycle f9393b;
    /* renamed from: c */
    private final RequestManagerTreeNode f9394c;
    /* renamed from: d */
    private final C1064i f9395d;
    /* renamed from: e */
    private final C0994i f9396e;
    /* renamed from: f */
    private final C0966b f9397f;
    /* renamed from: g */
    private DefaultOptions f9398g;

    public interface DefaultOptions {
        <T> void apply(C0990e<T, ?, ?, ?> c0990e);
    }

    /* renamed from: com.bumptech.glide.RequestManager$a */
    public final class C0965a<A, T> {
        /* renamed from: a */
        final /* synthetic */ RequestManager f2567a;
        /* renamed from: b */
        private final ModelLoader<A, T> f2568b;
        /* renamed from: c */
        private final Class<T> f2569c;

        /* renamed from: com.bumptech.glide.RequestManager$a$a */
        public final class C0964a {
            /* renamed from: a */
            final /* synthetic */ C0965a f2563a;
            /* renamed from: b */
            private final A f2564b;
            /* renamed from: c */
            private final Class<A> f2565c;
            /* renamed from: d */
            private final boolean f2566d = true;

            C0964a(C0965a c0965a, A a) {
                this.f2563a = c0965a;
                this.f2564b = a;
                this.f2565c = RequestManager.m11766c((Object) a);
            }

            /* renamed from: a */
            public <Z> C3019f<A, T, Z> m3290a(Class<Z> cls) {
                C3019f c3019f = (C3019f) this.f2563a.f2567a.f9397f.m3294a(new C3019f(this.f2563a.f2567a.f9392a, this.f2563a.f2567a.f9396e, this.f2565c, this.f2563a.f2568b, this.f2563a.f2569c, cls, this.f2563a.f2567a.f9395d, this.f2563a.f2567a.f9393b, this.f2563a.f2567a.f9397f));
                if (this.f2566d) {
                    c3019f.mo1247b(this.f2564b);
                }
                return c3019f;
            }
        }

        C0965a(RequestManager requestManager, ModelLoader<A, T> modelLoader, Class<T> cls) {
            this.f2567a = requestManager;
            this.f2568b = modelLoader;
            this.f2569c = cls;
        }

        /* renamed from: a */
        public C0964a m3293a(A a) {
            return new C0964a(this, a);
        }
    }

    /* renamed from: com.bumptech.glide.RequestManager$b */
    class C0966b {
        /* renamed from: a */
        final /* synthetic */ RequestManager f2570a;

        C0966b(RequestManager requestManager) {
            this.f2570a = requestManager;
        }

        /* renamed from: a */
        public <A, X extends C0990e<A, ?, ?, ?>> X m3294a(X x) {
            if (this.f2570a.f9398g != null) {
                this.f2570a.f9398g.apply(x);
            }
            return x;
        }
    }

    /* renamed from: com.bumptech.glide.RequestManager$c */
    private static class C3014c implements ConnectivityListener {
        /* renamed from: a */
        private final C1064i f9391a;

        public C3014c(C1064i c1064i) {
            this.f9391a = c1064i;
        }

        public void onConnectivityChanged(boolean z) {
            if (z) {
                this.f9391a.m3670d();
            }
        }
    }

    public RequestManager(Context context, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode) {
        this(context, lifecycle, requestManagerTreeNode, new C1064i(), new C1059c());
    }

    RequestManager(Context context, final Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, C1064i c1064i, C1059c c1059c) {
        this.f9392a = context.getApplicationContext();
        this.f9393b = lifecycle;
        this.f9394c = requestManagerTreeNode;
        this.f9395d = c1064i;
        this.f9396e = C0994i.m3480a(context);
        this.f9397f = new C0966b(this);
        context = c1059c.m3646a(context, new C3014c(c1064i));
        if (C0987h.m3416d() != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ RequestManager f2562b;

                public void run() {
                    lifecycle.addListener(this.f2562b);
                }
            });
        } else {
            lifecycle.addListener(this);
        }
        lifecycle.addListener(context);
    }

    /* renamed from: a */
    public void m11777a(int i) {
        this.f9396e.m3493a(i);
    }

    /* renamed from: a */
    public void m11776a() {
        this.f9396e.m3503i();
    }

    /* renamed from: b */
    public void m11778b() {
        C0987h.m3411a();
        this.f9395d.m3665a();
    }

    /* renamed from: c */
    public void m11779c() {
        C0987h.m3411a();
        this.f9395d.m3667b();
    }

    public void onStart() {
        m11779c();
    }

    public void onStop() {
        m11778b();
    }

    public void onDestroy() {
        this.f9395d.m3669c();
    }

    /* renamed from: a */
    public <A, T> C0965a<A, T> m11770a(ModelLoader<A, T> modelLoader, Class<T> cls) {
        return new C0965a(this, modelLoader, cls);
    }

    /* renamed from: a */
    public C4081d<String> m11774a(String str) {
        return (C4081d) m11780d().m11841a((Object) str);
    }

    /* renamed from: d */
    public C4081d<String> m11780d() {
        return m11762a(String.class);
    }

    /* renamed from: a */
    public C4081d<File> m11771a(File file) {
        return (C4081d) m11781e().m11841a((Object) file);
    }

    /* renamed from: e */
    public C4081d<File> m11781e() {
        return m11762a(File.class);
    }

    /* renamed from: a */
    public C4081d<Integer> m11772a(Integer num) {
        return (C4081d) m11782f().m11841a((Object) num);
    }

    /* renamed from: f */
    public C4081d<Integer> m11782f() {
        return (C4081d) m11762a(Integer.class).m11836a(C0978a.m3381a(this.f9392a));
    }

    /* renamed from: a */
    public C4081d<byte[]> m11775a(byte[] bArr) {
        return (C4081d) m11783g().m11841a((Object) bArr);
    }

    /* renamed from: g */
    public C4081d<byte[]> m11783g() {
        return (C4081d) m11762a(byte[].class).m11836a(new C3017c(UUID.randomUUID().toString())).m11838a(DiskCacheStrategy.NONE).m11842a(true);
    }

    /* renamed from: a */
    public <T> C4081d<T> m11773a(T t) {
        return (C4081d) m11762a(m11766c((Object) t)).m11841a((Object) t);
    }

    /* renamed from: a */
    private <T> C4081d<T> m11762a(Class<T> cls) {
        ModelLoader a = C0994i.m3481a((Class) cls, this.f9392a);
        ModelLoader b = C0994i.m3487b((Class) cls, this.f9392a);
        if (cls != null && a == null && b == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown type ");
            stringBuilder.append(cls);
            stringBuilder.append(". You must provide a Model of a type for");
            stringBuilder.append(" which there is a registered ModelLoader, if you are using a custom model, you must first call");
            stringBuilder.append(" Glide#register with a ModelLoaderFactory for your custom model class");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return (C4081d) this.f9397f.m3294a(new C4081d(cls, a, b, this.f9392a, this.f9396e, this.f9395d, this.f9393b, this.f9397f));
    }

    /* renamed from: c */
    private static <T> Class<T> m11766c(T t) {
        return t != null ? t.getClass() : null;
    }
}
