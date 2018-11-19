package com.appsflyer;

import android.content.Context;
import android.os.AsyncTask;
import com.tinder.api.ManagerWebServices;
import io.fabric.sdk.android.services.common.C15616a;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.v */
final class C0955v extends AsyncTask<String, Void, String> {
    /* renamed from: a */
    Map<String, String> f2534a;
    /* renamed from: b */
    String f2535b;
    /* renamed from: c */
    private boolean f2536c = false;
    /* renamed from: d */
    private String f2537d = "";
    /* renamed from: e */
    private boolean f2538e = false;
    /* renamed from: f */
    private WeakReference<Context> f2539f;
    /* renamed from: g */
    private URL f2540g;
    /* renamed from: h */
    private boolean f2541h;
    /* renamed from: i */
    private HttpURLConnection f2542i;
    /* renamed from: j */
    private boolean f2543j;

    protected final void onCancelled() {
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m3257a((String[]) objArr);
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        m3258a((String) obj);
    }

    C0955v(Context context, boolean z) {
        this.f2539f = new WeakReference(context);
        this.f2541h = true;
        this.f2543j = true;
        this.f2536c = z;
    }

    protected final void onPreExecute() {
        if (this.f2535b == null) {
            this.f2535b = new JSONObject(this.f2534a).toString();
        }
    }

    /* renamed from: a */
    protected final String m3257a(String... strArr) {
        if (this.f2536c) {
            return null;
        }
        StringBuilder stringBuilder;
        try {
            this.f2540g = new URL(strArr[0]);
            if (this.f2541h != null) {
                aa.m3121a().m3134a(this.f2540g.toString(), this.f2535b);
                strArr = this.f2535b.getBytes("UTF-8").length;
                stringBuilder = new StringBuilder("call = ");
                stringBuilder.append(this.f2540g);
                stringBuilder.append("; size = ");
                stringBuilder.append(strArr);
                stringBuilder.append(" byte");
                stringBuilder.append(strArr > 1 ? "s" : "");
                stringBuilder.append("; body = ");
                stringBuilder.append(this.f2535b);
                C0932h.m3183b(stringBuilder.toString());
            }
            this.f2542i = (HttpURLConnection) this.f2540g.openConnection();
            this.f2542i.setReadTimeout(30000);
            this.f2542i.setConnectTimeout(30000);
            this.f2542i.setRequestMethod("POST");
            this.f2542i.setDoInput(true);
            this.f2542i.setDoOutput(true);
            this.f2542i.setRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE, C15616a.ACCEPT_JSON_VALUE);
            strArr = this.f2542i.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(strArr, "UTF-8"));
            bufferedWriter.write(this.f2535b);
            bufferedWriter.flush();
            bufferedWriter.close();
            strArr.close();
            this.f2542i.connect();
            int responseCode = this.f2542i.getResponseCode();
            if (this.f2543j) {
                this.f2537d = C3010d.m11689c().m11726a(this.f2542i);
            }
            if (this.f2541h) {
                aa.m3121a().m3132a(this.f2540g.toString(), responseCode, this.f2537d);
            }
            if (responseCode == 200) {
                AFLogger.m3083d("Status 200 ok");
                Context context = (Context) this.f2539f.get();
                if (this.f2540g.toString().startsWith(C0929g.m3169b(C3010d.f9355e)) && context != null) {
                    strArr = context.getSharedPreferences("appsflyer-data", 0).edit();
                    strArr.putBoolean("sentRegisterRequestToAF", true);
                    strArr.apply();
                    AFLogger.m3080c("Successfully registered for Uninstall Tracking");
                }
            } else {
                this.f2538e = true;
            }
        } catch (Throwable th) {
            stringBuilder = new StringBuilder("Error while calling ");
            stringBuilder.append(this.f2540g.toString());
            AFLogger.m3073a(stringBuilder.toString(), th);
            this.f2538e = true;
        }
        return this.f2537d;
    }

    /* renamed from: a */
    protected final void m3258a(String str) {
        if (this.f2538e) {
            StringBuilder stringBuilder = new StringBuilder("Connection error: ");
            stringBuilder.append(str);
            AFLogger.m3083d(stringBuilder.toString());
            return;
        }
        stringBuilder = new StringBuilder("Connection call succeeded: ");
        stringBuilder.append(str);
        AFLogger.m3083d(stringBuilder.toString());
    }

    /* renamed from: a */
    final void m3259a(boolean z) {
        this.f2541h = z;
    }
}
