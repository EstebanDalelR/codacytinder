package com.tinder.utils;

import android.os.AsyncTask;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Deprecated
public class Async {
    @NonNull
    /* renamed from: a */
    private static ExecutorService f47598a = Executors.newSingleThreadExecutor();
    /* renamed from: b */
    private AsyncBg f47599b;
    /* renamed from: c */
    private AsyncBgOnly f47600c;
    /* renamed from: d */
    private AsyncUi f47601d;

    /* renamed from: com.tinder.utils.Async$1 */
    class C153511 extends AsyncTask<Void, Void, Object> {
        /* renamed from: a */
        final /* synthetic */ Async f47597a;

        C153511(Async async) {
            this.f47597a = async;
        }

        @Nullable
        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m57573a((Void[]) objArr);
        }

        @Nullable
        /* renamed from: a */
        protected Object m57573a(Void... voidArr) {
            return this.f47597a.f47599b.doInBg();
        }

        protected void onPostExecute(Object obj) {
            this.f47597a.f47601d.doInUi(obj);
        }
    }

    public interface AsyncBg {
        @Nullable
        Object doInBg();
    }

    public interface AsyncBgOnly {
        void doInBg();
    }

    public interface AsyncUi {
        void doInUi(Object obj);
    }

    private Async(AsyncBg asyncBg) {
        this.f47599b = asyncBg;
    }

    @NonNull
    /* renamed from: a */
    public static Async m57575a(AsyncBg asyncBg) {
        return new Async(asyncBg);
    }

    @NonNull
    /* renamed from: a */
    public Async m57577a(AsyncUi asyncUi) {
        this.f47601d = asyncUi;
        return this;
    }

    /* renamed from: a */
    public void m57579a(boolean z) {
        if (this.f47600c == null && (this.f47599b == null || this.f47601d == null)) {
            throw new IllegalStateException("You must specify either AsyncBgOnly OR both AsyncBg AND AsyncUi.");
        } else if (this.f47600c == null) {
            AsyncTask c153511 = new C153511(this);
            if (z) {
                c153511.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[]) null);
            } else {
                c153511.execute((Object[]) null);
            }
        } else {
            f47598a.submit(new C15359k(this));
        }
    }

    /* renamed from: b */
    final /* synthetic */ void m57580b() {
        Process.setThreadPriority(10);
        this.f47600c.doInBg();
    }

    /* renamed from: a */
    public void m57578a() {
        m57579a(false);
    }
}
