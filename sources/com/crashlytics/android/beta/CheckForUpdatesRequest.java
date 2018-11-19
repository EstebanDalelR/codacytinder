package com.crashlytics.android.beta;

import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.services.common.C15616a;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class CheckForUpdatesRequest extends C15616a {
    static final String BETA_SOURCE = "3";
    static final String BUILD_VERSION = "build_version";
    static final String DISPLAY_VERSION = "display_version";
    static final String HEADER_BETA_TOKEN = "X-CRASHLYTICS-BETA-TOKEN";
    static final String INSTANCE = "instance";
    static final String SDK_ANDROID_DIR_TOKEN_TYPE = "3";
    static final String SOURCE = "source";
    private final CheckForUpdatesResponseTransform responseTransform;

    static String createBetaTokenHeaderValueFor(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("3:");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public CheckForUpdatesRequest(C15611g c15611g, String str, String str2, HttpRequestFactory httpRequestFactory, CheckForUpdatesResponseTransform checkForUpdatesResponseTransform) {
        super(c15611g, str, str2, httpRequestFactory, HttpMethod.GET);
        this.responseTransform = checkForUpdatesResponseTransform;
    }

    public CheckForUpdatesResponse invoke(String str, String str2, BuildProperties buildProperties) {
        String str3;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        try {
            buildProperties = getQueryParamsFor(buildProperties);
            HttpRequest httpRequest = getHttpRequest(buildProperties);
            try {
                str = applyHeadersTo(httpRequest, str, str2);
                try {
                    str2 = C15608c.h();
                    str3 = Beta.TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Checking for updates from ");
                    stringBuilder.append(getUrl());
                    str2.d(str3, stringBuilder.toString());
                    str2 = C15608c.h();
                    str3 = Beta.TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Checking for updates query params are: ");
                    stringBuilder.append(buildProperties);
                    str2.d(str3, stringBuilder.toString());
                    if (str.c() != null) {
                        C15608c.h().d(Beta.TAG, "Checking for updates was successful");
                        str2 = this.responseTransform.fromJson(new JSONObject(str.e()));
                        if (str != null) {
                            str = str.b(C15616a.HEADER_REQUEST_ID);
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Checking for updates request ID: ");
                            stringBuilder2.append(str);
                            C15608c.h().d("Fabric", stringBuilder2.toString());
                        }
                        return str2;
                    }
                    str2 = C15608c.h();
                    buildProperties = Beta.TAG;
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Checking for updates failed. Response code: ");
                    stringBuilder2.append(str.b());
                    str2.e(buildProperties, stringBuilder2.toString());
                    if (str != null) {
                        str = str.b(C15616a.HEADER_REQUEST_ID);
                        str2 = C15608c.h();
                        buildProperties = "Fabric";
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Checking for updates request ID: ");
                        stringBuilder2.append(str);
                        str2.d(buildProperties, stringBuilder2.toString());
                    }
                    return null;
                } catch (Exception e) {
                    str2 = e;
                    try {
                        buildProperties = C15608c.h();
                        str3 = Beta.TAG;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Error while checking for updates from ");
                        stringBuilder.append(getUrl());
                        buildProperties.e(str3, stringBuilder.toString(), str2);
                        if (str != null) {
                            str = str.b(C15616a.HEADER_REQUEST_ID);
                            str2 = C15608c.h();
                            buildProperties = "Fabric";
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Checking for updates request ID: ");
                            stringBuilder2.append(str);
                            str2.d(buildProperties, stringBuilder2.toString());
                        }
                        return null;
                    } catch (Throwable th) {
                        str2 = th;
                        if (str != null) {
                            str = str.b(C15616a.HEADER_REQUEST_ID);
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Checking for updates request ID: ");
                            stringBuilder2.append(str);
                            C15608c.h().d("Fabric", stringBuilder2.toString());
                        }
                        throw str2;
                    }
                }
            } catch (Exception e2) {
                str2 = e2;
                str = httpRequest;
                buildProperties = C15608c.h();
                str3 = Beta.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error while checking for updates from ");
                stringBuilder.append(getUrl());
                buildProperties.e(str3, stringBuilder.toString(), str2);
                if (str != null) {
                    str = str.b(C15616a.HEADER_REQUEST_ID);
                    str2 = C15608c.h();
                    buildProperties = "Fabric";
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Checking for updates request ID: ");
                    stringBuilder2.append(str);
                    str2.d(buildProperties, stringBuilder2.toString());
                }
                return null;
            } catch (Throwable th2) {
                str2 = th2;
                str = httpRequest;
                if (str != null) {
                    str = str.b(C15616a.HEADER_REQUEST_ID);
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Checking for updates request ID: ");
                    stringBuilder2.append(str);
                    C15608c.h().d("Fabric", stringBuilder2.toString());
                }
                throw str2;
            }
        } catch (Exception e3) {
            str2 = e3;
            str = null;
            buildProperties = C15608c.h();
            str3 = Beta.TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error while checking for updates from ");
            stringBuilder.append(getUrl());
            buildProperties.e(str3, stringBuilder.toString(), str2);
            if (str != null) {
                str = str.b(C15616a.HEADER_REQUEST_ID);
                str2 = C15608c.h();
                buildProperties = "Fabric";
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Checking for updates request ID: ");
                stringBuilder2.append(str);
                str2.d(buildProperties, stringBuilder2.toString());
            }
            return null;
        } catch (Throwable th3) {
            str2 = th3;
            str = null;
            if (str != null) {
                str = str.b(C15616a.HEADER_REQUEST_ID);
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Checking for updates request ID: ");
                stringBuilder2.append(str);
                C15608c.h().d("Fabric", stringBuilder2.toString());
            }
            throw str2;
        }
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C15616a.CRASHLYTICS_USER_AGENT);
        stringBuilder.append(this.kit.getVersion());
        return httpRequest.a(C15616a.HEADER_ACCEPT, C15616a.ACCEPT_JSON_VALUE).a("User-Agent", stringBuilder.toString()).a(C15616a.HEADER_DEVELOPER_TOKEN, C15616a.CLS_ANDROID_SDK_DEVELOPER_TOKEN).a(C15616a.HEADER_CLIENT_TYPE, "android").a(C15616a.HEADER_CLIENT_VERSION, this.kit.getVersion()).a(C15616a.HEADER_API_KEY, str).a(HEADER_BETA_TOKEN, createBetaTokenHeaderValueFor(str2));
    }

    private Map<String, String> getQueryParamsFor(BuildProperties buildProperties) {
        Map<String, String> hashMap = new HashMap();
        hashMap.put(BUILD_VERSION, buildProperties.versionCode);
        hashMap.put(DISPLAY_VERSION, buildProperties.versionName);
        hashMap.put(INSTANCE, buildProperties.buildId);
        hashMap.put("source", "3");
        return hashMap;
    }
}
