package com.crashlytics.android.core;

import com.tinder.api.ManagerWebServices;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.C15616a;
import io.fabric.sdk.android.services.common.C15629l;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.File;

class NativeCreateReportSpiCall extends C15616a implements CreateReportSpiCall {
    private static final String APP_META_FILE_MULTIPART_PARAM = "app_meta_file";
    private static final String BINARY_IMAGES_FILE_MULTIPART_PARAM = "binary_images_file";
    private static final String DEVICE_META_FILE_MULTIPART_PARAM = "device_meta_file";
    private static final String GZIP_FILE_CONTENT_TYPE = "application/octet-stream";
    private static final String KEYS_FILE_MULTIPART_PARAM = "keys_file";
    private static final String LOGS_FILE_MULTIPART_PARAM = "logs_file";
    private static final String METADATA_FILE_MULTIPART_PARAM = "crash_meta_file";
    private static final String MINIDUMP_FILE_MULTIPART_PARAM = "minidump_file";
    private static final String OS_META_FILE_MULTIPART_PARAM = "os_meta_file";
    private static final String REPORT_IDENTIFIER_PARAM = "report_id";
    private static final String SESSION_META_FILE_MULTIPART_PARAM = "session_meta_file";
    private static final String USER_META_FILE_MULTIPART_PARAM = "user_meta_file";

    public NativeCreateReportSpiCall(C15611g c15611g, String str, String str2, HttpRequestFactory httpRequestFactory) {
        super(c15611g, str, str2, httpRequestFactory, HttpMethod.POST);
    }

    public boolean invoke(CreateReportRequest createReportRequest) {
        createReportRequest = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest.apiKey), createReportRequest.report);
        Logger h = C15608c.h();
        String str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending report to: ");
        stringBuilder.append(getUrl());
        h.d(str, stringBuilder.toString());
        createReportRequest = createReportRequest.b();
        h = C15608c.h();
        str = CrashlyticsCore.TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Result was: ");
        stringBuilder.append(createReportRequest);
        h.d(str, stringBuilder.toString());
        return C15629l.a(createReportRequest) == null ? true : null;
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C15616a.CRASHLYTICS_USER_AGENT);
        stringBuilder.append(this.kit.getVersion());
        httpRequest.a("User-Agent", stringBuilder.toString()).a(C15616a.HEADER_CLIENT_TYPE, "android").a(C15616a.HEADER_CLIENT_VERSION, this.kit.getVersion()).a(C15616a.HEADER_API_KEY, str);
        return httpRequest;
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, Report report) {
        httpRequest.e(REPORT_IDENTIFIER_PARAM, report.getIdentifier());
        for (File file : report.getFiles()) {
            if (file.getName().equals("minidump")) {
                httpRequest.a(MINIDUMP_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("metadata")) {
                httpRequest.a(METADATA_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("binaryImages")) {
                httpRequest.a(BINARY_IMAGES_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("session")) {
                httpRequest.a(SESSION_META_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("app")) {
                httpRequest.a(APP_META_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("device")) {
                httpRequest.a(DEVICE_META_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("os")) {
                httpRequest.a(OS_META_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals(ManagerWebServices.PARAM_USER)) {
                httpRequest.a(USER_META_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("logs")) {
                httpRequest.a(LOGS_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("keys")) {
                httpRequest.a(KEYS_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            }
        }
        return httpRequest;
    }
}
