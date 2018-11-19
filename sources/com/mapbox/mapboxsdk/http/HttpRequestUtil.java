package com.mapbox.mapboxsdk.http;

import okhttp3.C17692o;

public class HttpRequestUtil {
    public static void setLogEnabled(boolean z) {
        HTTPRequest.enableLog(z);
    }

    public static void setPrintRequestUrlOnFailure(boolean z) {
        HTTPRequest.enablePrintRequestUrlOnFailure(z);
    }

    public static void setOkHttpClient(C17692o c17692o) {
        HTTPRequest.setOKHttpClient(c17692o);
    }
}
