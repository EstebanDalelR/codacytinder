package com.google.android.m4b.maps.p108h;

import android.os.RemoteException;
import com.google.android.m4b.maps.p108h.C5406b.C5401a;
import com.google.android.m4b.maps.p108h.C5406b.C5403c;
import com.google.android.m4b.maps.p108h.C6689h.C5420c;
import com.google.android.m4b.maps.p108h.C6689h.C5421e;
import com.google.android.m4b.maps.p110j.C5462v;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.m4b.maps.h.c */
public final class C5407c {

    /* renamed from: com.google.android.m4b.maps.h.c$a */
    public static abstract class C7690a<R extends C5427m, A extends C5401a> extends C6679a<R> implements C5421e<A> {
        /* renamed from: a */
        private final C5403c<A> f28148a;
        /* renamed from: b */
        private AtomicReference<C5420c> f28149b = new AtomicReference();

        /* renamed from: a */
        protected abstract void mo7644a(A a);

        protected C7690a(C5403c<A> c5403c, C5414d c5414d) {
            super(((C5414d) C5462v.m23768a((Object) c5414d, (Object) "GoogleApiClient must not be null")).mo5414a());
            this.f28148a = (C5403c) C5462v.m23767a((Object) c5403c);
        }

        /* renamed from: b */
        public final C5403c<A> mo7233b() {
            return this.f28148a;
        }

        /* renamed from: b */
        public final void mo7234b(A a) {
            try {
                mo7644a((C5401a) a);
            } catch (RemoteException e) {
                m33370a(e);
                throw e;
            } catch (RemoteException e2) {
                m33370a(e2);
            }
        }

        /* renamed from: c */
        public final void mo7235c(C6691q c6691q) {
            C5462v.m23773b(c6691q.m29852d() ^ 1, "Failed result must not be success");
            m29758a((C5427m) mo7643a(c6691q));
        }

        /* renamed from: a */
        public final void mo7232a(C5420c c5420c) {
            this.f28149b.set(c5420c);
        }

        /* renamed from: a */
        private void m33370a(RemoteException remoteException) {
            mo7235c(new C6691q(8, remoteException.getLocalizedMessage(), null));
        }
    }
}
