package com.appsflyer;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.C15616a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

/* renamed from: com.appsflyer.f */
public abstract class C0928f implements Runnable {
    /* renamed from: a */
    String f2471a;
    /* renamed from: b */
    private C0927a f2472b;
    /* renamed from: c */
    private C3010d f2473c;

    /* renamed from: com.appsflyer.f$a */
    public static class C0927a {
        /* renamed from: a */
        HttpsURLConnection m3161a(String str) throws IOException {
            return (HttpsURLConnection) new URL(str).openConnection();
        }
    }

    /* renamed from: a */
    abstract String mo1215a();

    /* renamed from: a */
    abstract void mo1216a(String str);

    /* renamed from: a */
    abstract void mo1217a(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    /* renamed from: b */
    abstract void mo1218b();

    C0928f(C3010d c3010d) {
        this.f2473c = c3010d;
    }

    /* renamed from: a */
    public void m3164a(C0927a c0927a) {
        this.f2472b = c0927a;
    }

    public void run() {
        mo1230c();
    }

    /* renamed from: c */
    private void mo1230c() {
        String a;
        Throwable th;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String str = "";
        Object obj = "";
        String a2 = mo1215a();
        StringBuilder stringBuilder3 = new StringBuilder("oneLinkUrl: ");
        stringBuilder3.append(a2);
        AFLogger.m3072a(stringBuilder3.toString());
        try {
            HttpURLConnection a3 = this.f2472b.m3161a(a2);
            a3.addRequestProperty("content-type", C15616a.ACCEPT_JSON_VALUE);
            a3.addRequestProperty("authorization", C0960y.m3272a(currentTimeMillis));
            a3.addRequestProperty("af-timestamp", String.valueOf(currentTimeMillis));
            a3.setReadTimeout(3000);
            a3.setConnectTimeout(3000);
            mo1217a((HttpsURLConnection) a3);
            int responseCode = a3.getResponseCode();
            a = this.f2473c.m11726a(a3);
            if (responseCode == Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                try {
                    AFLogger.m3083d("Status 200 ok");
                } catch (Throwable th2) {
                    th = th2;
                    stringBuilder = new StringBuilder("Error while calling ");
                    stringBuilder.append(a2);
                    AFLogger.m3073a(stringBuilder.toString(), th);
                    stringBuilder = new StringBuilder("Error while calling ");
                    stringBuilder.append(a2);
                    stringBuilder.append(" stacktrace: ");
                    stringBuilder.append(th.toString());
                    obj = stringBuilder.toString();
                    if (TextUtils.isEmpty(obj)) {
                        stringBuilder2 = new StringBuilder("Connection error: ");
                        stringBuilder2.append(obj);
                        AFLogger.m3084e(stringBuilder2.toString());
                        mo1218b();
                    }
                    stringBuilder2 = new StringBuilder("Connection call succeeded: ");
                    stringBuilder2.append(a);
                    AFLogger.m3083d(stringBuilder2.toString());
                    mo1216a(a);
                    return;
                }
            }
            stringBuilder = new StringBuilder("Response code = ");
            stringBuilder.append(responseCode);
            stringBuilder.append(" content = ");
            stringBuilder.append(a);
            obj = stringBuilder.toString();
        } catch (Throwable th3) {
            th = th3;
            a = str;
            stringBuilder = new StringBuilder("Error while calling ");
            stringBuilder.append(a2);
            AFLogger.m3073a(stringBuilder.toString(), th);
            stringBuilder = new StringBuilder("Error while calling ");
            stringBuilder.append(a2);
            stringBuilder.append(" stacktrace: ");
            stringBuilder.append(th.toString());
            obj = stringBuilder.toString();
            if (TextUtils.isEmpty(obj)) {
                stringBuilder2 = new StringBuilder("Connection call succeeded: ");
                stringBuilder2.append(a);
                AFLogger.m3083d(stringBuilder2.toString());
                mo1216a(a);
                return;
            }
            stringBuilder2 = new StringBuilder("Connection error: ");
            stringBuilder2.append(obj);
            AFLogger.m3084e(stringBuilder2.toString());
            mo1218b();
        }
        if (TextUtils.isEmpty(obj)) {
            stringBuilder2 = new StringBuilder("Connection call succeeded: ");
            stringBuilder2.append(a);
            AFLogger.m3083d(stringBuilder2.toString());
            mo1216a(a);
            return;
        }
        stringBuilder2 = new StringBuilder("Connection error: ");
        stringBuilder2.append(obj);
        AFLogger.m3084e(stringBuilder2.toString());
        mo1218b();
    }
}
