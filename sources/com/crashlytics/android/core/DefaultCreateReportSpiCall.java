package com.crashlytics.android.core;

import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.C15616a;
import io.fabric.sdk.android.services.common.C15629l;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.File;
import java.util.Map.Entry;

class DefaultCreateReportSpiCall extends C15616a implements CreateReportSpiCall {
    static final String FILE_CONTENT_TYPE = "application/octet-stream";
    static final String FILE_PARAM = "report[file]";
    static final String IDENTIFIER_PARAM = "report[identifier]";
    static final String MULTI_FILE_PARAM = "report[file";

    public DefaultCreateReportSpiCall(C15611g c15611g, String str, String str2, HttpRequestFactory httpRequestFactory) {
        super(c15611g, str, str2, httpRequestFactory, HttpMethod.POST);
    }

    DefaultCreateReportSpiCall(C15611g c15611g, String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod) {
        super(c15611g, str, str2, httpRequestFactory, httpMethod);
    }

    public boolean invoke(CreateReportRequest createReportRequest) {
        createReportRequest = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest), createReportRequest.report);
        Logger h = C15608c.h();
        String str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending report to: ");
        stringBuilder.append(getUrl());
        h.d(str, stringBuilder.toString());
        int b = createReportRequest.b();
        Logger h2 = C15608c.h();
        String str2 = CrashlyticsCore.TAG;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Create report request ID: ");
        stringBuilder2.append(createReportRequest.b(C15616a.HEADER_REQUEST_ID));
        h2.d(str2, stringBuilder2.toString());
        createReportRequest = C15608c.h();
        str = CrashlyticsCore.TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Result was: ");
        stringBuilder.append(b);
        createReportRequest.d(str, stringBuilder.toString());
        return C15629l.a(b) == null ? true : null;
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, CreateReportRequest createReportRequest) {
        httpRequest = httpRequest.a(C15616a.HEADER_API_KEY, createReportRequest.apiKey).a(C15616a.HEADER_CLIENT_TYPE, "android").a(C15616a.HEADER_CLIENT_VERSION, this.kit.getVersion());
        for (Entry a : createReportRequest.report.getCustomHeaders().entrySet()) {
            httpRequest = httpRequest.a(a);
        }
        return httpRequest;
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, Report report) {
        httpRequest.e(IDENTIFIER_PARAM, report.getIdentifier());
        if (report.getFiles().length == 1) {
            Logger h = C15608c.h();
            String str = CrashlyticsCore.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Adding single file ");
            stringBuilder.append(report.getFileName());
            stringBuilder.append(" to report ");
            stringBuilder.append(report.getIdentifier());
            h.d(str, stringBuilder.toString());
            return httpRequest.a(FILE_PARAM, report.getFileName(), FILE_CONTENT_TYPE, report.getFile());
        }
        int i = 0;
        for (File file : report.getFiles()) {
            Logger h2 = C15608c.h();
            String str2 = CrashlyticsCore.TAG;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Adding file ");
            stringBuilder2.append(file.getName());
            stringBuilder2.append(" to report ");
            stringBuilder2.append(report.getIdentifier());
            h2.d(str2, stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(MULTI_FILE_PARAM);
            stringBuilder3.append(i);
            stringBuilder3.append("]");
            httpRequest.a(stringBuilder3.toString(), file.getName(), FILE_CONTENT_TYPE, file);
            i++;
        }
        return httpRequest;
    }
}
