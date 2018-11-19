package com.mapbox.android.telemetry;

import android.content.Context;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.HashMap;
import java.util.Map;

class TelemetryClientFactory {
    private static final String LOG_TAG = "TelemetryClientFactory";
    private static final String RETRIEVING_APP_META_DATA_ERROR_MESSAGE = "Failed when retrieving app meta-data: %s";
    private final Map<Environment, TelemetryClientBuild> BUILD_TELEMETRY_CLIENT = new C58061();
    private final String accessToken;
    private final Logger logger;
    private final String userAgent;

    /* renamed from: com.mapbox.android.telemetry.TelemetryClientFactory$1 */
    class C58061 extends HashMap<Environment, TelemetryClientBuild> {

        /* renamed from: com.mapbox.android.telemetry.TelemetryClientFactory$1$1 */
        class C70921 implements TelemetryClientBuild {
            C70921() {
            }

            public TelemetryClient build(ServerInformation serverInformation) {
                return TelemetryClientFactory.this.buildTelemetryClient(Environment.CHINA);
            }
        }

        /* renamed from: com.mapbox.android.telemetry.TelemetryClientFactory$1$2 */
        class C70932 implements TelemetryClientBuild {
            C70932() {
            }

            public TelemetryClient build(ServerInformation serverInformation) {
                return TelemetryClientFactory.this.buildTelemetryClientCustom(serverInformation);
            }
        }

        /* renamed from: com.mapbox.android.telemetry.TelemetryClientFactory$1$3 */
        class C70943 implements TelemetryClientBuild {
            C70943() {
            }

            public TelemetryClient build(ServerInformation serverInformation) {
                return TelemetryClientFactory.this.buildTelemetryClient(Environment.COM);
            }
        }

        C58061() {
            put(Environment.CHINA, new C70921());
            put(Environment.STAGING, new C70932());
            put(Environment.COM, new C70943());
        }
    }

    TelemetryClientFactory(String str, String str2, Logger logger) {
        this.accessToken = str;
        this.userAgent = str2;
        this.logger = logger;
    }

    TelemetryClient obtainTelemetryClient(Context context) {
        EnvironmentResolver upVar = new EnvironmentChain().setup();
        try {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            if (!(context == null || context.metaData == null)) {
                context = upVar.obtainServerInformation(context.metaData);
                return ((TelemetryClientBuild) this.BUILD_TELEMETRY_CLIENT.get(context.getEnvironment())).build(context);
            }
        } catch (Context context2) {
            this.logger.error(LOG_TAG, String.format(RETRIEVING_APP_META_DATA_ERROR_MESSAGE, new Object[]{context2.getMessage()}));
        }
        return buildTelemetryClient(Environment.COM);
    }

    private TelemetryClient buildTelemetryClient(Environment environment) {
        return new TelemetryClient(this.accessToken, this.userAgent, new Builder().environment(environment).build(), this.logger);
    }

    private TelemetryClient buildTelemetryClientCustom(ServerInformation serverInformation) {
        Environment environment = serverInformation.getEnvironment();
        String hostname = serverInformation.getHostname();
        return new TelemetryClient(serverInformation.getAccessToken(), this.userAgent, new Builder().environment(environment).baseUrl(TelemetryClientSettings.configureUrlHostname(hostname)).build(), this.logger);
    }
}
