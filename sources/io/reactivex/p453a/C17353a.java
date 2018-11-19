package io.reactivex.p453a;

import android.os.Looper;
import io.reactivex.disposables.Disposable;
import io.reactivex.p453a.p455b.C15674a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.reactivex.a.a */
public abstract class C17353a implements Disposable {
    /* renamed from: a */
    private final AtomicBoolean f53086a = new AtomicBoolean();

    /* renamed from: io.reactivex.a.a$1 */
    class C156701 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C17353a f48526a;

        C156701(C17353a c17353a) {
            this.f48526a = c17353a;
        }

        public void run() {
            this.f48526a.m63442a();
        }
    }

    /* renamed from: a */
    protected abstract void m63442a();

    /* renamed from: b */
    public static void m63441b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected to be called on the main thread but was ");
            stringBuilder.append(Thread.currentThread().getName());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final boolean isDisposed() {
        return this.f53086a.get();
    }

    public final void dispose() {
        if (!this.f53086a.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m63442a();
        } else {
            C15674a.m58830a().mo12918a(new C156701(this));
        }
    }
}
