package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.google.android.exoplayer2.util.C2289a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public interface DefaultDrmSessionEventListener {

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener$a */
    public static final class C2046a {
        /* renamed from: a */
        private final CopyOnWriteArrayList<C2045a> f5633a;

        /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener$a$a */
        private static final class C2045a {
            /* renamed from: a */
            public final Handler f5631a;
            /* renamed from: b */
            public final DefaultDrmSessionEventListener f5632b;

            public C2045a(Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
                this.f5631a = handler;
                this.f5632b = defaultDrmSessionEventListener;
            }
        }

        /* renamed from: a */
        public void m7358a(Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
            boolean z = (handler == null || defaultDrmSessionEventListener == null) ? false : true;
            C2289a.m8311a(z);
            this.f5633a.add(new C2045a(handler, defaultDrmSessionEventListener));
        }

        /* renamed from: a */
        public void m7357a() {
            Iterator it = this.f5633a.iterator();
            while (it.hasNext()) {
                C2045a c2045a = (C2045a) it.next();
                final DefaultDrmSessionEventListener defaultDrmSessionEventListener = c2045a.f5632b;
                c2045a.f5631a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2046a f5623b;

                    public void run() {
                        defaultDrmSessionEventListener.onDrmKeysLoaded();
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7359a(final Exception exception) {
            Iterator it = this.f5633a.iterator();
            while (it.hasNext()) {
                C2045a c2045a = (C2045a) it.next();
                final DefaultDrmSessionEventListener defaultDrmSessionEventListener = c2045a.f5632b;
                c2045a.f5631a.post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ C2046a f5626c;

                    public void run() {
                        defaultDrmSessionEventListener.onDrmSessionManagerError(exception);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m7360b() {
            Iterator it = this.f5633a.iterator();
            while (it.hasNext()) {
                C2045a c2045a = (C2045a) it.next();
                final DefaultDrmSessionEventListener defaultDrmSessionEventListener = c2045a.f5632b;
                c2045a.f5631a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2046a f5628b;

                    public void run() {
                        defaultDrmSessionEventListener.onDrmKeysRestored();
                    }
                });
            }
        }

        /* renamed from: c */
        public void m7361c() {
            Iterator it = this.f5633a.iterator();
            while (it.hasNext()) {
                C2045a c2045a = (C2045a) it.next();
                final DefaultDrmSessionEventListener defaultDrmSessionEventListener = c2045a.f5632b;
                c2045a.f5631a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2046a f5630b;

                    public void run() {
                        defaultDrmSessionEventListener.onDrmKeysRemoved();
                    }
                });
            }
        }
    }

    void onDrmKeysLoaded();

    void onDrmKeysRemoved();

    void onDrmKeysRestored();

    void onDrmSessionManagerError(Exception exception);
}
