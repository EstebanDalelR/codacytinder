package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.C6120v.C6119e;
import com.squareup.picasso.Picasso.Priority;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.n */
class C6101n extends ThreadPoolExecutor {

    /* renamed from: com.squareup.picasso.n$a */
    private static final class C6100a extends FutureTask<C6090c> implements Comparable<C6100a> {
        /* renamed from: a */
        private final C6090c f22410a;

        public /* synthetic */ int compareTo(Object obj) {
            return m26510a((C6100a) obj);
        }

        public C6100a(C6090c c6090c) {
            super(c6090c, null);
            this.f22410a = c6090c;
        }

        /* renamed from: a */
        public int m26510a(C6100a c6100a) {
            Priority n = this.f22410a.m26475n();
            Priority n2 = c6100a.f22410a.m26475n();
            return n == n2 ? this.f22410a.f22355a - c6100a.f22410a.f22355a : n2.ordinal() - n.ordinal();
        }
    }

    C6101n() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C6119e());
    }

    /* renamed from: a */
    void m26512a(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            if (networkInfo.isConnectedOrConnecting()) {
                int type = networkInfo.getType();
                if (!(type == 6 || type == 9)) {
                    switch (type) {
                        case 0:
                            networkInfo = networkInfo.getSubtype();
                            switch (networkInfo) {
                                case 1:
                                case 2:
                                    m26511a(1);
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    m26511a(2);
                                    break;
                                default:
                                    switch (networkInfo) {
                                        case 12:
                                            break;
                                        case 13:
                                        case 14:
                                        case 15:
                                            m26511a(3);
                                            break;
                                        default:
                                            m26511a(3);
                                            break;
                                    }
                                    m26511a(2);
                                    break;
                            }
                        case 1:
                            break;
                        default:
                            m26511a(3);
                            break;
                    }
                }
                m26511a(4);
                return;
            }
        }
        m26511a(3);
    }

    /* renamed from: a */
    private void m26511a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    public Future<?> submit(Runnable runnable) {
        Object c6100a = new C6100a((C6090c) runnable);
        execute(c6100a);
        return c6100a;
    }
}
