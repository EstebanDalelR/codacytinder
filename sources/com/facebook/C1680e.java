package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: com.facebook.e */
public class C1680e extends AsyncTask<Void, Void, List<GraphResponse>> {
    /* renamed from: a */
    private static final String f4606a = C1680e.class.getCanonicalName();
    /* renamed from: b */
    private final HttpURLConnection f4607b;
    /* renamed from: c */
    private final GraphRequestBatch f4608c;
    /* renamed from: d */
    private Exception f4609d;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m5687a((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m5688a((List) obj);
    }

    public C1680e(GraphRequestBatch graphRequestBatch) {
        this(null, graphRequestBatch);
    }

    public C1680e(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        this.f4608c = graphRequestBatch;
        this.f4607b = httpURLConnection;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{RequestAsyncTask: ");
        stringBuilder.append(" connection: ");
        stringBuilder.append(this.f4607b);
        stringBuilder.append(", requests: ");
        stringBuilder.append(this.f4608c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    protected void onPreExecute() {
        super.onPreExecute();
        if (FacebookSdk.m3984a()) {
            Log.d(f4606a, String.format("execute async task: %s", new Object[]{this}));
        }
        if (this.f4608c.m4078c() == null) {
            Handler handler;
            if (Thread.currentThread() instanceof HandlerThread) {
                handler = new Handler();
            } else {
                handler = new Handler(Looper.getMainLooper());
            }
            this.f4608c.m4072a(handler);
        }
    }

    /* renamed from: a */
    protected void m5688a(List<GraphResponse> list) {
        super.onPostExecute(list);
        if (this.f4609d != null) {
            Log.d(f4606a, String.format("onPostExecute: exception encountered during request: %s", new Object[]{this.f4609d.getMessage()}));
        }
    }

    /* renamed from: a */
    protected List<GraphResponse> m5687a(Void... voidArr) {
        try {
            if (this.f4607b == null) {
                return this.f4608c.m4082g();
            }
            return GraphRequest.m4018a(this.f4607b, this.f4608c);
        } catch (Void[] voidArr2) {
            this.f4609d = voidArr2;
            return null;
        }
    }
}
