package com.crashlytics.android.answers;

import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.C15616a;
import io.fabric.sdk.android.services.common.C15629l;
import io.fabric.sdk.android.services.events.FilesSender;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.File;
import java.util.List;

class SessionAnalyticsFilesSender extends C15616a implements FilesSender {
    static final String FILE_CONTENT_TYPE = "application/vnd.crashlytics.android.events";
    static final String FILE_PARAM_NAME = "session_analytics_file_";
    private final String apiKey;

    public SessionAnalyticsFilesSender(C15611g c15611g, String str, String str2, HttpRequestFactory httpRequestFactory, String str3) {
        super(c15611g, str, str2, httpRequestFactory, HttpMethod.POST);
        this.apiKey = str3;
    }

    public boolean send(List<File> list) {
        HttpRequest a = getHttpRequest().a(C15616a.HEADER_CLIENT_TYPE, "android").a(C15616a.HEADER_CLIENT_VERSION, this.kit.getVersion()).a(C15616a.HEADER_API_KEY, this.apiKey);
        int i = 0;
        for (File file : list) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(FILE_PARAM_NAME);
            stringBuilder.append(i);
            a.a(stringBuilder.toString(), file.getName(), FILE_CONTENT_TYPE, file);
            i++;
        }
        Logger h = C15608c.h();
        String str = Answers.TAG;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Sending ");
        stringBuilder2.append(list.size());
        stringBuilder2.append(" analytics files to ");
        stringBuilder2.append(getUrl());
        h.d(str, stringBuilder2.toString());
        list = a.b();
        Logger h2 = C15608c.h();
        String str2 = Answers.TAG;
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Response code for analytics file send is ");
        stringBuilder3.append(list);
        h2.d(str2, stringBuilder3.toString());
        if (C15629l.a(list) == null) {
            return true;
        }
        return false;
    }
}
