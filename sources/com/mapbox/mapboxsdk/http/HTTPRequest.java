package com.mapbox.mapboxsdk.http;

import android.os.Build;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.mapbox.android.telemetry.TelemetryUtils;
import com.mapbox.mapboxsdk.BuildConfig;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLException;
import okhttp3.C15898i;
import okhttp3.C15963q.C15962a;
import okhttp3.C15966s;
import okhttp3.C15968t;
import okhttp3.C17692o;
import okhttp3.C17692o.C15961a;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import p000a.p001a.C0001a;

class HTTPRequest implements Callback {
    private static final int CONNECTION_ERROR = 0;
    private static final int PERMANENT_ERROR = 2;
    private static final int TEMPORARY_ERROR = 1;
    private static C17692o client = new C15961a().a(getDispatcher()).b();
    private static boolean logEnabled = true;
    private static boolean logRequestUrl = false;
    private Call call;
    private ReentrantLock lock = new ReentrantLock();
    private long nativePtr = 0;
    private String userAgentString;

    private native void nativeOnFailure(int i, String str);

    private native void nativeOnResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr);

    private HTTPRequest(long j, String str, String str2, String str3) {
        this.nativePtr = j;
        try {
            j = HttpUrl.f(str);
            if (j == null) {
                log(6, String.format("[HTTP] Unable to parse resourceUrl %s", new Object[]{str}));
            }
            String toLowerCase = j.g().toLowerCase(MapboxConstants.MAPBOX_LOCALE);
            if (Mapbox.isConnected().booleanValue() || toLowerCase.equals("127.0.0.1") || toLowerCase.equals("localhost")) {
                if (toLowerCase.equals("mapbox.com") || toLowerCase.endsWith(".mapbox.com") || toLowerCase.equals("mapbox.cn") || toLowerCase.endsWith(".mapbox.cn")) {
                    if (j.n() == null) {
                        j = new StringBuilder();
                        j.append(str);
                        j.append("?");
                        j = j.toString();
                    } else {
                        j = new StringBuilder();
                        j.append(str);
                        j.append("&");
                        j = j.toString();
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(j);
                    stringBuilder.append("events=true");
                    str = stringBuilder.toString();
                }
                j = new C15962a().a(str).a(str.toLowerCase(MapboxConstants.MAPBOX_LOCALE)).b("User-Agent", getUserAgent());
                if (str2.length() > 0) {
                    j = j.b("If-None-Match", str2);
                } else if (str3.length() > 0) {
                    j = j.b("If-Modified-Since", str3);
                }
                this.call = client.newCall(j.d());
                this.call.enqueue(this);
                return;
            }
            throw new NoRouteToHostException("No Internet connection available.");
        } catch (long j2) {
            handleFailure(this.call, j2);
        }
    }

    public void cancel() {
        if (this.call != null) {
            this.call.cancel();
        }
        this.lock.lock();
        this.nativePtr = 0;
        this.lock.unlock();
    }

    public void onResponse(@NonNull Call call, @NonNull C15966s c15966s) throws IOException {
        if (c15966s.d()) {
            log(2, String.format("[HTTP] Request was successful (code = %s).", new Object[]{Integer.valueOf(c15966s.c())}));
        } else {
            String e = !TextUtils.isEmpty(c15966s.e()) ? c15966s.e() : "No additional information";
            log(3, String.format("[HTTP] Request with response code = %s: %s", new Object[]{Integer.valueOf(c15966s.c()), e}));
        }
        C15968t h = c15966s.h();
        if (h == null) {
            log(6, "[HTTP] Received empty response body");
            return;
        }
        try {
            byte[] bytes = h.bytes();
            this.lock.lock();
            if (this.nativePtr != 0) {
                nativeOnResponse(c15966s.c(), c15966s.a("ETag"), c15966s.a("Last-Modified"), c15966s.a("Cache-Control"), c15966s.a("Expires"), c15966s.a("Retry-After"), c15966s.a("x-rate-limit-reset"), bytes);
            }
            this.lock.unlock();
        } catch (IOException e2) {
            onFailure(call, e2);
        } finally {
            c15966s.close();
        }
    }

    public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
        handleFailure(call, iOException);
    }

    static void enableLog(boolean z) {
        logEnabled = z;
    }

    static void enablePrintRequestUrlOnFailure(boolean z) {
        logRequestUrl = z;
    }

    static void setOKHttpClient(C17692o c17692o) {
        client = c17692o;
    }

    private static C15898i getDispatcher() {
        C15898i c15898i = new C15898i();
        c15898i.a(20);
        return c15898i;
    }

    private void handleFailure(Call call, Exception exception) {
        String message = exception.getMessage() != null ? exception.getMessage() : "Error processing the request";
        exception = getFailureType(exception);
        if (!(!logEnabled || call == null || call.request() == null)) {
            logFailure(exception, message, call.request().a().toString());
        }
        this.lock.lock();
        if (this.nativePtr != 0) {
            nativeOnFailure(exception, message);
        }
        this.lock.unlock();
    }

    private int getFailureType(Exception exception) {
        if (!((exception instanceof NoRouteToHostException) || (exception instanceof UnknownHostException) || (exception instanceof SocketException) || (exception instanceof ProtocolException))) {
            if (!(exception instanceof SSLException)) {
                return (exception instanceof InterruptedIOException) != null ? 1 : 2;
            }
        }
        return null;
    }

    private void log(int i, String str) {
        if (logEnabled) {
            C0001a.a(i, str, new Object[0]);
        }
    }

    private void logFailure(int i, String str, String str2) {
        int i2 = i == 1 ? 3 : i == 0 ? 4 : 5;
        String str3 = "Request failed due to a %s error: %s %s";
        Object[] objArr = new Object[3];
        i = i == 1 ? "temporary" : i == 0 ? "connection" : "permanent";
        objArr[0] = i;
        objArr[1] = str;
        if (logRequestUrl == null) {
            str2 = "";
        }
        objArr[2] = str2;
        log(i2, String.format(str3, objArr));
    }

    private String getUserAgent() {
        if (this.userAgentString == null) {
            this.userAgentString = TelemetryUtils.toHumanReadableAscii(String.format("%s %s (%s) Android/%s (%s)", new Object[]{getApplicationIdentifier(), BuildConfig.MAPBOX_VERSION_STRING, BuildConfig.GIT_REVISION_SHORT, Integer.valueOf(VERSION.SDK_INT), Build.CPU_ABI}));
        }
        return this.userAgentString;
    }

    private java.lang.String getApplicationIdentifier() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = com.mapbox.mapboxsdk.Mapbox.getApplicationContext();	 Catch:{ Exception -> 0x002f }
        r1 = r0.getPackageManager();	 Catch:{ Exception -> 0x002f }
        r2 = r0.getPackageName();	 Catch:{ Exception -> 0x002f }
        r3 = 0;	 Catch:{ Exception -> 0x002f }
        r1 = r1.getPackageInfo(r2, r3);	 Catch:{ Exception -> 0x002f }
        r2 = "%s/%s (%s)";	 Catch:{ Exception -> 0x002f }
        r4 = 3;	 Catch:{ Exception -> 0x002f }
        r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x002f }
        r0 = r0.getPackageName();	 Catch:{ Exception -> 0x002f }
        r4[r3] = r0;	 Catch:{ Exception -> 0x002f }
        r0 = 1;	 Catch:{ Exception -> 0x002f }
        r3 = r1.versionName;	 Catch:{ Exception -> 0x002f }
        r4[r0] = r3;	 Catch:{ Exception -> 0x002f }
        r0 = 2;	 Catch:{ Exception -> 0x002f }
        r1 = r1.versionCode;	 Catch:{ Exception -> 0x002f }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x002f }
        r4[r0] = r1;	 Catch:{ Exception -> 0x002f }
        r0 = java.lang.String.format(r2, r4);	 Catch:{ Exception -> 0x002f }
        return r0;
    L_0x002f:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.http.HTTPRequest.getApplicationIdentifier():java.lang.String");
    }
}
