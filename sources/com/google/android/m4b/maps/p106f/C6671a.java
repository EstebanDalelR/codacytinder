package com.google.android.m4b.maps.p106f;

import android.util.Log;
import com.google.android.m4b.maps.cu.C5306g;
import com.google.android.m4b.maps.p105e.C5362a;
import com.google.android.m4b.maps.p105e.C5363b;
import com.google.android.m4b.maps.p105e.C6669c;
import com.google.android.m4b.maps.p106f.C5367c.C6673a;
import com.google.android.m4b.maps.p108h.C5406b.C5401a;
import com.google.android.m4b.maps.p108h.C5407c.C7690a;
import com.google.android.m4b.maps.p108h.C5414d;
import com.google.android.m4b.maps.p108h.C5425k;
import com.google.android.m4b.maps.p108h.C5425k.C5424a;
import com.google.android.m4b.maps.p108h.C5427m;
import com.google.android.m4b.maps.p108h.C6691q;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.m4b.maps.f.a */
public final class C6671a implements C5363b {
    /* renamed from: a */
    private static final Object f24960a = new Object();
    /* renamed from: b */
    private static final C5366c f24961b = new C5366c();
    /* renamed from: c */
    private static ExecutorService f24962c;

    /* renamed from: com.google.android.m4b.maps.f.a$c */
    static final class C5366c {
        /* renamed from: a */
        private int f20248a;

        private C5366c() {
            this.f20248a = 0;
        }

        /* renamed from: a */
        public final synchronized void m23563a() {
            this.f20248a++;
        }

        /* renamed from: b */
        public final synchronized void m23564b() {
            if (this.f20248a == 0) {
                throw new RuntimeException("too many decrements");
            }
            this.f20248a--;
            if (this.f20248a == 0) {
                notifyAll();
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.f.a$2 */
    class C66702 implements C5424a {
        /* renamed from: a */
        private /* synthetic */ C6671a f24959a;

        C66702(C6671a c6671a) {
            this.f24959a = c6671a;
        }

        /* renamed from: a */
        public final void mo5397a() {
            C6671a.f24961b.m23564b();
        }
    }

    /* renamed from: com.google.android.m4b.maps.f.a$a */
    static abstract class C8086a<R extends C5427m> extends C7690a<R, C7538b> {
        public C8086a(C5414d c5414d) {
            super(C5362a.f20231a, c5414d);
        }
    }

    /* renamed from: com.google.android.m4b.maps.f.a$b */
    final class C8210b extends C8086a<C6691q> {
        /* renamed from: a */
        private final C6669c f29353a;
        /* renamed from: b */
        private /* synthetic */ C6671a f29354b;

        /* renamed from: com.google.android.m4b.maps.f.a$b$1 */
        class C75371 extends C6673a {
            /* renamed from: a */
            private /* synthetic */ C8210b f28146a;

            C75371(C8210b c8210b) {
                this.f28146a = c8210b;
            }

            /* renamed from: a */
            public final void mo5399a(C6691q c6691q) {
                this.f28146a.m29758a((C5427m) c6691q);
            }
        }

        /* renamed from: a */
        protected final /* synthetic */ C5427m mo7643a(C6691q c6691q) {
            return c6691q;
        }

        /* renamed from: a */
        protected final /* synthetic */ void mo7644a(C5401a c5401a) {
            C7538b c7538b = (C7538b) c5401a;
            C5367c c75371 = new C75371(this);
            try {
                C6671a.m29739a(this.f29353a);
                ((C5368d) c7538b.m29906n()).mo5400a(c75371, this.f29353a);
            } catch (C5401a c5401a2) {
                String valueOf = String.valueOf(this.f29353a.f24958e.toString());
                c5401a2 = String.valueOf(c5401a2.toString());
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 28) + String.valueOf(c5401a2).length());
                stringBuilder.append("MessageNanoProducer ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" threw: ");
                stringBuilder.append(c5401a2);
                Log.e("ClearcutLoggerApiImpl", stringBuilder.toString());
            }
        }

        C8210b(C6671a c6671a, C6669c c6669c, C5414d c5414d) {
            this.f29354b = c6671a;
            super(c5414d);
            this.f29353a = c6669c;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C8210b)) {
                return null;
            }
            return this.f29353a.equals(((C8210b) obj).f29353a);
        }

        public final String toString() {
            String valueOf = String.valueOf(this.f29353a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
            stringBuilder.append("MethodImpl(");
            stringBuilder.append(valueOf);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    private final C5425k<C6691q> m29738a(final C5414d c5414d, final C8086a<C6691q> c8086a) {
        synchronized (f24960a) {
            if (f24962c == null) {
                f24962c = Executors.newSingleThreadExecutor();
            }
        }
        f24962c.execute(new Runnable(this) {
            /* renamed from: c */
            private /* synthetic */ C6671a f20247c;

            public final void run() {
                c5414d.mo5415a(c8086a);
            }
        });
        return c8086a;
    }

    /* renamed from: a */
    public final C5425k<C6691q> mo5398a(C5414d c5414d, C6669c c6669c) {
        f24961b.m23563a();
        C8086a c8210b = new C8210b(this, c6669c, c5414d);
        c8210b.m29757a((C5424a) new C66702(this));
        return m29738a(c5414d, c8210b);
    }

    /* renamed from: a */
    static /* synthetic */ void m29739a(C6669c c6669c) {
        if (c6669c.f24958e != null && c6669c.f24957d.f28128b.length == 0) {
            c6669c.f24957d.f28128b = c6669c.f24958e.m23547a();
        }
        c6669c.f24956c = C5306g.m23531a(c6669c.f24957d);
    }
}
