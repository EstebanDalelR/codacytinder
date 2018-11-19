package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.C0564o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: android.support.v4.content.a */
public abstract class C2839a<D> extends Loader<D> {
    /* renamed from: a */
    volatile C2838a f9025a;
    /* renamed from: b */
    volatile C2838a f9026b;
    /* renamed from: c */
    long f9027c;
    /* renamed from: d */
    long f9028d;
    /* renamed from: e */
    Handler f9029e;
    /* renamed from: o */
    private final Executor f9030o;

    /* renamed from: android.support.v4.content.a$a */
    final class C2838a extends ModernAsyncTask<Void, Void, D> implements Runnable {
        /* renamed from: a */
        boolean f9022a;
        /* renamed from: b */
        final /* synthetic */ C2839a f9023b;
        /* renamed from: d */
        private final CountDownLatch f9024d = new CountDownLatch(1);

        C2838a(C2839a c2839a) {
            this.f9023b = c2839a;
        }

        /* renamed from: a */
        protected D m11229a(Void... voidArr) {
            try {
                return this.f9023b.m11240e();
            } catch (Void[] voidArr2) {
                if (m1634c()) {
                    return null;
                }
                throw voidArr2;
            }
        }

        /* renamed from: a */
        protected void mo454a(D d) {
            try {
                this.f9023b.m11236b(this, d);
            } finally {
                this.f9024d.countDown();
            }
        }

        /* renamed from: b */
        protected void mo455b(D d) {
            try {
                this.f9023b.m11233a(this, d);
            } finally {
                this.f9024d.countDown();
            }
        }

        public void run() {
            this.f9022a = false;
            this.f9023b.m11238c();
        }
    }

    /* renamed from: a */
    public void m11234a(@Nullable D d) {
    }

    @Nullable
    /* renamed from: d */
    public abstract D mo3563d();

    /* renamed from: f */
    public void m11241f() {
    }

    public C2839a(@NonNull Context context) {
        this(context, ModernAsyncTask.f1452c);
    }

    private C2839a(@NonNull Context context, @NonNull Executor executor) {
        super(context);
        this.f9028d = -10000;
        this.f9030o = executor;
    }

    /* renamed from: a */
    protected void mo456a() {
        super.mo456a();
        m1611m();
        this.f9025a = new C2838a(this);
        m11238c();
    }

    /* renamed from: b */
    protected boolean mo458b() {
        if (this.f9025a == null) {
            return false;
        }
        if (!this.j) {
            this.m = true;
        }
        if (this.f9026b != null) {
            if (this.f9025a.f9022a) {
                this.f9025a.f9022a = false;
                this.f9029e.removeCallbacks(this.f9025a);
            }
            this.f9025a = null;
            return false;
        } else if (this.f9025a.f9022a) {
            this.f9025a.f9022a = false;
            this.f9029e.removeCallbacks(this.f9025a);
            this.f9025a = null;
            return false;
        } else {
            boolean a = this.f9025a.m1629a(false);
            if (a) {
                this.f9026b = this.f9025a;
                m11241f();
            }
            this.f9025a = null;
            return a;
        }
    }

    /* renamed from: c */
    void m11238c() {
        if (this.f9026b == null && this.f9025a != null) {
            if (this.f9025a.f9022a) {
                this.f9025a.f9022a = false;
                this.f9029e.removeCallbacks(this.f9025a);
            }
            if (this.f9027c <= 0 || SystemClock.uptimeMillis() >= this.f9028d + this.f9027c) {
                this.f9025a.m1625a(this.f9030o, (Void[]) null);
            } else {
                this.f9025a.f9022a = true;
                this.f9029e.postAtTime(this.f9025a, this.f9028d + this.f9027c);
            }
        }
    }

    /* renamed from: a */
    void m11233a(C2838a c2838a, D d) {
        m11234a(d);
        if (this.f9026b == c2838a) {
            m1620v();
            this.f9028d = SystemClock.uptimeMillis();
            this.f9026b = null;
            m1605g();
            m11238c();
        }
    }

    /* renamed from: b */
    void m11236b(C2838a c2838a, D d) {
        if (this.f9025a != c2838a) {
            m11233a(c2838a, d);
        } else if (m1608j() != null) {
            m11234a(d);
        } else {
            m1619u();
            this.f9028d = SystemClock.uptimeMillis();
            this.f9025a = null;
            m1602b(d);
        }
    }

    @Nullable
    /* renamed from: e */
    protected D m11240e() {
        return mo3563d();
    }

    /* renamed from: a */
    public void mo457a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo457a(str, fileDescriptor, printWriter, strArr);
        if (this.f9025a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f9025a);
            printWriter.print(" waiting=");
            printWriter.println(this.f9025a.f9022a);
        }
        if (this.f9026b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f9026b);
            printWriter.print(" waiting=");
            printWriter.println(this.f9026b.f9022a);
        }
        if (this.f9027c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0564o.m2095a(this.f9027c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0564o.m2094a(this.f9028d, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
