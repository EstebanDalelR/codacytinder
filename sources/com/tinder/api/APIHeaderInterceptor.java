package com.tinder.api;

import com.tinder.managers.C2652a;
import com.tinder.utils.ab;
import java.io.IOException;
import okhttp3.C15957l.C15956a;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

@Deprecated
public class APIHeaderInterceptor implements Interceptor {
    private static final String SUPPORTED_IMAGE_FORMATS = "x-supported-image-formats";
    private static final String WEBP = "webp";

    public C15966s intercept(Chain chain) throws IOException {
        C15963q request = chain.request();
        C15956a b = request.c().b();
        if (request.a("User-Agent") == null) {
            b.a("User-Agent", ManagerWebServices.USER_AGENT_STRING);
        }
        if (request.a("os-version") == null) {
            b.a("os-version", ManagerWebServices.PARAM_OS_VERSION_VALUE);
        }
        if (request.a("app-version") == null) {
            b.a("app-version", ManagerWebServices.PARAM_APP_VERSION_VALUE);
        }
        if (request.a("platform") == null) {
            b.a("platform", "android");
        }
        if (request.a("Accept-Language") == null) {
            b.a("Accept-Language", ab.a());
        }
        if (request.a("x-supported-image-formats") == null) {
            b.a("x-supported-image-formats", WEBP);
        }
        String a = C2652a.a();
        if (a != null) {
            b.c("X-Auth-Token", a);
        }
        return chain.proceed(request.e().a(b.a()).d());
    }
}
