package com.tinder.api.retrofit;

import com.tinder.api.TinderHeaders;
import com.tinder.common.p076a.C2640a;
import java.io.IOException;
import java8.util.Objects;
import okhttp3.C15957l.C15956a;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

public class TinderHeaderInterceptor implements Interceptor {
    private static final String PLATFORM = "android";
    private static final String WEBP = "webp";
    private final String acceptLanguage;
    private final String appVersion;
    private final String osVersion;
    private final String userAgent;

    public static class Builder {
        private String acceptLanguage;
        private String appVersion;
        private String osVersion;
        private String userAgent;

        public Builder userAgent(String str) {
            this.userAgent = str;
            return this;
        }

        public Builder osVersion(String str) {
            this.osVersion = str;
            return this;
        }

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public Builder acceptLanguage(String str) {
            this.acceptLanguage = str;
            return this;
        }

        public TinderHeaderInterceptor build() {
            C2640a.a(this.userAgent);
            C2640a.a(this.osVersion);
            C2640a.a(this.appVersion);
            C2640a.a(this.acceptLanguage);
            return new TinderHeaderInterceptor(this.userAgent, this.osVersion, this.appVersion, this.acceptLanguage);
        }
    }

    private TinderHeaderInterceptor(String str, String str2, String str3, String str4) {
        this.userAgent = str;
        this.osVersion = str2;
        this.appVersion = str3;
        this.acceptLanguage = str4;
    }

    public C15966s intercept(Chain chain) throws IOException {
        C15963q request = chain.request();
        C15956a b = request.c().b();
        updateHeaderIfChanged(request, b, "User-Agent", this.userAgent);
        updateHeaderIfChanged(request, b, "os-version", this.osVersion);
        updateHeaderIfChanged(request, b, "app-version", this.appVersion);
        updateHeaderIfChanged(request, b, "platform", "android");
        updateHeaderIfChanged(request, b, TinderHeaders.SUPPORTED_IMAGE_FORMATS, WEBP);
        updateHeaderIfChanged(request, b, "Accept-Language", this.acceptLanguage);
        return chain.proceed(request.e().a(b.a()).d());
    }

    private void updateHeaderIfChanged(C15963q c15963q, C15956a c15956a, String str, String str2) {
        if (Objects.a(c15963q.a(str), str2) == null) {
            c15956a.a(str, str2);
        }
    }
}
