package com.crashlytics.android.beta;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.cache.C18331b;
import io.fabric.sdk.android.services.common.C17335m;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeviceIdentifierProvider;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import io.fabric.sdk.android.services.network.C17345b;
import io.fabric.sdk.android.services.persistence.C17347b;
import io.fabric.sdk.android.services.settings.C15660f;
import io.fabric.sdk.android.services.settings.C15665p;
import io.fabric.sdk.android.services.settings.Settings;
import java.util.HashMap;
import java.util.Map;

public class Beta extends C15611g<Boolean> implements DeviceIdentifierProvider {
    private static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    private static final String CRASHLYTICS_BUILD_PROPERTIES = "crashlytics-build.properties";
    static final String NO_DEVICE_TOKEN = "";
    public static final String TAG = "Beta";
    private final C18331b<String> deviceTokenCache = new C18331b();
    private final DeviceTokenLoader deviceTokenLoader = new DeviceTokenLoader();
    private UpdatesController updatesController;

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:beta";
    }

    public String getVersion() {
        return "1.2.8.25";
    }

    public static Beta getInstance() {
        return (Beta) C15608c.a(Beta.class);
    }

    @TargetApi(14)
    protected boolean onPreExecute() {
        this.updatesController = createUpdatesController(VERSION.SDK_INT, (Application) getContext().getApplicationContext());
        return true;
    }

    protected Boolean doInBackground() {
        C15608c.h().d(TAG, "Beta kit initializing...");
        Context context = getContext();
        IdManager idManager = getIdManager();
        if (TextUtils.isEmpty(getBetaDeviceToken(context, idManager.i()))) {
            C15608c.h().d(TAG, "A Beta device token was not found for this app");
            return Boolean.valueOf(false);
        }
        C15608c.h().d(TAG, "Beta device token is present, checking for app updates.");
        C15660f betaSettingsData = getBetaSettingsData();
        BuildProperties loadBuildProperties = loadBuildProperties(context);
        if (canCheckForUpdates(betaSettingsData, loadBuildProperties)) {
            this.updatesController.initialize(context, this, idManager, betaSettingsData, loadBuildProperties, new C17347b(this), new C17335m(), new C17345b(C15608c.h()));
        }
        return Boolean.valueOf(true);
    }

    @TargetApi(14)
    UpdatesController createUpdatesController(int i, Application application) {
        if (i >= 14) {
            return new ActivityLifecycleCheckForUpdatesController(getFabric().e(), getFabric().f());
        }
        return new ImmediateCheckForUpdatesController();
    }

    public Map<DeviceIdentifierType, String> getDeviceIdentifiers() {
        CharSequence betaDeviceToken = getBetaDeviceToken(getContext(), getIdManager().i());
        Map<DeviceIdentifierType, String> hashMap = new HashMap();
        if (!TextUtils.isEmpty(betaDeviceToken)) {
            hashMap.put(DeviceIdentifierType.FONT_TOKEN, betaDeviceToken);
        }
        return hashMap;
    }

    boolean canCheckForUpdates(C15660f c15660f, BuildProperties buildProperties) {
        return (c15660f == null || TextUtils.isEmpty(c15660f.f48481a) != null || buildProperties == null) ? null : true;
    }

    private String getBetaDeviceToken(Context context, String str) {
        str = null;
        try {
            String str2 = (String) this.deviceTokenCache.get(context, this.deviceTokenLoader);
            if (!"".equals(str2)) {
                str = str2;
            }
        } catch (Context context2) {
            C15608c.h().e(TAG, "Failed to load the Beta device token", context2);
        }
        context2 = C15608c.h();
        String str3 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Beta device token present: ");
        stringBuilder.append(TextUtils.isEmpty(str) ^ 1);
        context2.d(str3, stringBuilder.toString());
        return str;
    }

    private C15660f getBetaSettingsData() {
        C15665p b = Settings.a().b();
        return b != null ? b.f48511f : null;
    }

    private BuildProperties loadBuildProperties(Context context) {
        Throwable th;
        BuildProperties buildProperties = null;
        BuildProperties fromPropertiesStream;
        try {
            context = context.getAssets().open(CRASHLYTICS_BUILD_PROPERTIES);
            if (context != null) {
                try {
                    fromPropertiesStream = BuildProperties.fromPropertiesStream(context);
                } catch (Throwable e) {
                    Throwable th2 = e;
                    fromPropertiesStream = null;
                    th = th2;
                    try {
                        C15608c.h().e(TAG, "Error reading Beta build properties", th);
                        if (context != null) {
                            try {
                                context.close();
                            } catch (Context context2) {
                                C15608c.h().e(TAG, "Error closing Beta build properties asset", context2);
                            }
                        }
                        return fromPropertiesStream;
                    } catch (Throwable th3) {
                        th = th3;
                        if (context2 != null) {
                            try {
                                context2.close();
                            } catch (Context context22) {
                                C15608c.h().e(TAG, "Error closing Beta build properties asset", context22);
                            }
                        }
                        throw th;
                    }
                }
                try {
                    Logger h = C15608c.h();
                    String str = TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(fromPropertiesStream.packageName);
                    stringBuilder.append(" build properties: ");
                    stringBuilder.append(fromPropertiesStream.versionName);
                    stringBuilder.append(" (");
                    stringBuilder.append(fromPropertiesStream.versionCode);
                    stringBuilder.append(") - ");
                    stringBuilder.append(fromPropertiesStream.buildId);
                    h.d(str, stringBuilder.toString());
                    buildProperties = fromPropertiesStream;
                } catch (Exception e2) {
                    th = e2;
                    C15608c.h().e(TAG, "Error reading Beta build properties", th);
                    if (context22 != null) {
                        context22.close();
                    }
                    return fromPropertiesStream;
                }
            }
            if (context22 == null) {
                return buildProperties;
            }
            try {
                context22.close();
                return buildProperties;
            } catch (Context context222) {
                C15608c.h().e(TAG, "Error closing Beta build properties asset", context222);
                return buildProperties;
            }
        } catch (Context context2222) {
            fromPropertiesStream = null;
            th = context2222;
            context2222 = fromPropertiesStream;
            C15608c.h().e(TAG, "Error reading Beta build properties", th);
            if (context2222 != null) {
                context2222.close();
            }
            return fromPropertiesStream;
        } catch (Context context22222) {
            th = context22222;
            context22222 = null;
            if (context22222 != null) {
                context22222.close();
            }
            throw th;
        }
    }

    String getOverridenSpiEndpoint() {
        return CommonUtils.b(getContext(), CRASHLYTICS_API_ENDPOINT);
    }
}
