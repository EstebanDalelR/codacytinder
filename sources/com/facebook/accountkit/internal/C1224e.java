package com.facebook.accountkit.internal;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.internal.AccountKitGraphRequest.Callback;
import java.net.HttpURLConnection;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.accountkit.internal.e */
final class C1224e extends AsyncTask<Void, Void, C1227f> {
    /* renamed from: a */
    private static final String f3269a = C1224e.class.getCanonicalName();
    /* renamed from: b */
    private static volatile C1224e f3270b;
    /* renamed from: c */
    private final Callback f3271c;
    /* renamed from: d */
    private final HttpURLConnection f3272d;
    /* renamed from: e */
    private Exception f3273e;
    /* renamed from: f */
    private final int f3274f;
    /* renamed from: g */
    private final AccountKitGraphRequest f3275g;

    /* renamed from: com.facebook.accountkit.internal.e$1 */
    class C12231 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1224e f3268a;

        C12231(C1224e c1224e) {
            this.f3268a = c1224e;
        }

        public void run() {
            int b = this.f3268a.f3274f + 1;
            final C1224e c1224e = new C1224e(null, this.f3268a.f3275g, this.f3268a.f3271c, b);
            C1251w.m4489a().schedule(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C12231 f3267b;

                public void run() {
                    if (!this.f3267b.f3268a.isCancelled() && !c1224e.isCancelled()) {
                        c1224e.executeOnExecutor(C1251w.m4502b(), new Void[0]);
                    }
                }
            }, (long) (b * 5), TimeUnit.SECONDS);
            if (this.f3268a.f3275g.m4172a()) {
                C1224e.m4321a(c1224e);
            }
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4326a((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4327a((C1227f) obj);
    }

    /* renamed from: a */
    static C1224e m4320a() {
        return f3270b;
    }

    /* renamed from: a */
    static void m4321a(C1224e c1224e) {
        f3270b = c1224e;
    }

    /* renamed from: b */
    static C1224e m4323b() {
        C1224e c1224e = f3270b;
        if (c1224e != null) {
            c1224e.cancel(true);
        }
        return c1224e;
    }

    C1224e(AccountKitGraphRequest accountKitGraphRequest, Callback callback) {
        this(null, accountKitGraphRequest, callback, 0);
    }

    private C1224e(HttpURLConnection httpURLConnection, AccountKitGraphRequest accountKitGraphRequest, Callback callback, int i) {
        this.f3272d = httpURLConnection;
        this.f3275g = accountKitGraphRequest;
        this.f3271c = callback;
        this.f3274f = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{AccountKitGraphRequestAsyncTask:  connection: ");
        stringBuilder.append(this.f3272d);
        stringBuilder.append(", request: ");
        stringBuilder.append(this.f3275g);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    protected void onPreExecute() {
        super.onPreExecute();
        if (this.f3275g.m4178g() == null) {
            Handler handler;
            if (Thread.currentThread() instanceof HandlerThread) {
                handler = new Handler();
            } else {
                handler = new Handler(Looper.getMainLooper());
            }
            this.f3275g.m4168a(handler);
        }
    }

    /* renamed from: a */
    protected void m4327a(C1227f c1227f) {
        super.onPostExecute(c1227f);
        if (c1227f == null || c1227f.m4333a() == null || c1227f.m4333a().m4338d().m4126a().getErrorType() != Type.NETWORK_CONNECTION_ERROR || c1227f.m4333a().m4338d().m4126a().getDetailErrorCode() == 101 || this.f3274f >= 4) {
            if (this.f3271c != null) {
                this.f3271c.onCompleted(c1227f);
            }
            if (this.f3273e != null) {
                Log.d(f3269a, String.format("onPostExecute: exception encountered during request: %s", new Object[]{this.f3273e.getMessage()}));
            }
            return;
        }
        new Handler(C1220c.m4288a().getMainLooper()).post(new C12231(this));
    }

    /* renamed from: a */
    protected C1227f m4326a(Void... voidArr) {
        try {
            if (this.f3272d == null) {
                return this.f3275g.m4177f();
            }
            return AccountKitGraphRequest.m4148a(this.f3272d, this.f3275g);
        } catch (Void[] voidArr2) {
            this.f3273e = voidArr2;
            return null;
        }
    }
}
