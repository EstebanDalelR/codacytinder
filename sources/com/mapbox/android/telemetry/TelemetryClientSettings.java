package com.mapbox.android.telemetry;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C15896g;
import okhttp3.C17692o;
import okhttp3.C17692o.C15961a;
import okhttp3.HttpUrl;

class TelemetryClientSettings {
    private static final String CHINA_EVENTS_HOST = "events.mapbox.cn";
    private static final String COM_EVENTS_HOST = "events.mapbox.com";
    private static final Map<Environment, String> HOSTS = new C58071();
    private static final String HTTPS_SCHEME = "https";
    private static final String STAGING_EVENTS_HOST = "api-events-staging.tilestream.net";
    private final HttpUrl baseUrl;
    private final C17692o client;
    private boolean debugLoggingEnabled;
    private Environment environment;
    private final HostnameVerifier hostnameVerifier;
    private final SSLSocketFactory sslSocketFactory;
    private final X509TrustManager x509TrustManager;

    /* renamed from: com.mapbox.android.telemetry.TelemetryClientSettings$1 */
    static class C58071 extends HashMap<Environment, String> {
        C58071() {
            put(Environment.STAGING, TelemetryClientSettings.STAGING_EVENTS_HOST);
            put(Environment.COM, TelemetryClientSettings.COM_EVENTS_HOST);
            put(Environment.CHINA, TelemetryClientSettings.CHINA_EVENTS_HOST);
        }
    }

    static final class Builder {
        HttpUrl baseUrl = null;
        C17692o client = new C17692o();
        boolean debugLoggingEnabled = false;
        Environment environment = Environment.COM;
        HostnameVerifier hostnameVerifier = null;
        SSLSocketFactory sslSocketFactory = null;
        X509TrustManager x509TrustManager = null;

        Builder() {
        }

        Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        Builder client(C17692o c17692o) {
            if (c17692o != null) {
                this.client = c17692o;
            }
            return this;
        }

        Builder baseUrl(HttpUrl httpUrl) {
            if (httpUrl != null) {
                this.baseUrl = httpUrl;
            }
            return this;
        }

        Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactory = sSLSocketFactory;
            return this;
        }

        Builder x509TrustManager(X509TrustManager x509TrustManager) {
            this.x509TrustManager = x509TrustManager;
            return this;
        }

        Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        Builder debugLoggingEnabled(boolean z) {
            this.debugLoggingEnabled = z;
            return this;
        }

        TelemetryClientSettings build() {
            if (this.baseUrl == null) {
                this.baseUrl = TelemetryClientSettings.configureUrlHostname((String) TelemetryClientSettings.HOSTS.get(this.environment));
            }
            return new TelemetryClientSettings(this);
        }
    }

    private boolean isSocketFactoryUnset(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        return (sSLSocketFactory == null || x509TrustManager == null) ? false : true;
    }

    TelemetryClientSettings(Builder builder) {
        this.environment = builder.environment;
        this.client = builder.client;
        this.baseUrl = builder.baseUrl;
        this.sslSocketFactory = builder.sslSocketFactory;
        this.x509TrustManager = builder.x509TrustManager;
        this.hostnameVerifier = builder.hostnameVerifier;
        this.debugLoggingEnabled = builder.debugLoggingEnabled;
    }

    Environment getEnvironment() {
        return this.environment;
    }

    C17692o getClient() {
        return configureHttpClient();
    }

    HttpUrl getBaseUrl() {
        return this.baseUrl;
    }

    boolean isDebugLoggingEnabled() {
        return this.debugLoggingEnabled;
    }

    Builder toBuilder() {
        return new Builder().environment(this.environment).client(this.client).baseUrl(this.baseUrl).sslSocketFactory(this.sslSocketFactory).x509TrustManager(this.x509TrustManager).hostnameVerifier(this.hostnameVerifier).debugLoggingEnabled(this.debugLoggingEnabled);
    }

    static HttpUrl configureUrlHostname(String str) {
        okhttp3.HttpUrl.Builder a = new okhttp3.HttpUrl.Builder().a(HTTPS_SCHEME);
        a.d(str);
        return a.c();
    }

    private C17692o configureHttpClient() {
        C15961a b = this.client.z().a(new GzipRequestInterceptor()).a(true).a(new CertificatePinnerFactory().provideCertificatePinnerFor(this.environment)).b(Arrays.asList(new C15896g[]{C15896g.f49202a, C15896g.f49203b}));
        if (isSocketFactoryUnset(this.sslSocketFactory, this.x509TrustManager)) {
            b.a(this.sslSocketFactory, this.x509TrustManager);
            b.a(this.hostnameVerifier);
        }
        return b.b();
    }
}
