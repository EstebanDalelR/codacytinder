package io.reactivex.p453a.p455b;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.C15679f;
import io.reactivex.p453a.p454a.C15671a;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.a.b.a */
public final class C15674a {
    /* renamed from: a */
    private static final C15679f f48530a = C15671a.m58826a(new C156721());

    /* renamed from: io.reactivex.a.b.a$1 */
    static class C156721 implements Callable<C15679f> {
        C156721() {
        }

        public /* synthetic */ Object call() throws Exception {
            return m58829a();
        }

        /* renamed from: a */
        public C15679f m58829a() throws Exception {
            return C15673a.f48529a;
        }
    }

    /* renamed from: io.reactivex.a.b.a$a */
    private static final class C15673a {
        /* renamed from: a */
        static final C15679f f48529a = new C17355b(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static C15679f m58830a() {
        return C15671a.m58824a(f48530a);
    }
}
