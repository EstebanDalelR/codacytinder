package com.crashlytics.android.core;

import android.content.Context;
import android.util.Log;
import com.crashlytics.android.answers.AppMeasurementEventLogger;
import com.crashlytics.android.answers.EventLogger;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.C15622f;
import io.fabric.sdk.android.services.common.C15626i;
import io.fabric.sdk.android.services.common.C15627j;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.C18333b;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.Task;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import io.fabric.sdk.android.services.network.C17345b;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.network.PinningInfoProvider;
import io.fabric.sdk.android.services.persistence.C17346a;
import io.fabric.sdk.android.services.persistence.C17347b;
import io.fabric.sdk.android.services.persistence.FileStore;
import io.fabric.sdk.android.services.settings.C15665p;
import io.fabric.sdk.android.services.settings.Settings;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

@DependsOn({CrashlyticsNdkDataProvider.class})
public class CrashlyticsCore extends C15611g<Void> {
    static final float CLS_DEFAULT_PROCESS_DELAY = 1.0f;
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_ATTRIBUTES = 64;
    static final int MAX_ATTRIBUTE_SIZE = 1024;
    private static final String MISSING_BUILD_ID_MSG = "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
    private static final String PREFERENCE_STORE_NAME = "com.crashlytics.android.core.CrashlyticsCore";
    public static final String TAG = "CrashlyticsCore";
    private final ConcurrentHashMap<String, String> attributes;
    private CrashlyticsBackgroundWorker backgroundWorker;
    private CrashlyticsController controller;
    private CrashlyticsFileMarker crashMarker;
    private CrashlyticsNdkDataProvider crashlyticsNdkDataProvider;
    private float delay;
    private boolean disabled;
    private HttpRequestFactory httpRequestFactory;
    private CrashlyticsFileMarker initializationMarker;
    private CrashlyticsListener listener;
    private final PinningInfoProvider pinningInfo;
    private final long startTime;
    private String userEmail;
    private String userId;
    private String userName;

    /* renamed from: com.crashlytics.android.core.CrashlyticsCore$2 */
    class C11092 implements Callable<Void> {
        C11092() {
        }

        public Void call() throws Exception {
            CrashlyticsCore.this.initializationMarker.create();
            C15608c.h().d(CrashlyticsCore.TAG, "Initialization marker file created.");
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.core.CrashlyticsCore$3 */
    class C11103 implements Callable<Boolean> {
        C11103() {
        }

        public Boolean call() throws Exception {
            try {
                boolean remove = CrashlyticsCore.this.initializationMarker.remove();
                Logger h = C15608c.h();
                String str = CrashlyticsCore.TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Initialization marker file removed: ");
                stringBuilder.append(remove);
                h.d(str, stringBuilder.toString());
                return Boolean.valueOf(remove);
            } catch (Throwable e) {
                C15608c.h().e(CrashlyticsCore.TAG, "Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.valueOf(false);
            }
        }
    }

    public static class Builder {
        private float delay = -1.0f;
        private boolean disabled = false;
        private CrashlyticsListener listener;
        private PinningInfoProvider pinningInfoProvider;

        public Builder delay(float f) {
            if (f <= 0.0f) {
                throw new IllegalArgumentException("delay must be greater than 0");
            } else if (this.delay > 0.0f) {
                throw new IllegalStateException("delay already set.");
            } else {
                this.delay = f;
                return this;
            }
        }

        public Builder listener(CrashlyticsListener crashlyticsListener) {
            if (crashlyticsListener == null) {
                throw new IllegalArgumentException("listener must not be null.");
            } else if (this.listener != null) {
                throw new IllegalStateException("listener already set.");
            } else {
                this.listener = crashlyticsListener;
                return this;
            }
        }

        @Deprecated
        public Builder pinningInfo(PinningInfoProvider pinningInfoProvider) {
            if (pinningInfoProvider == null) {
                throw new IllegalArgumentException("pinningInfoProvider must not be null.");
            } else if (this.pinningInfoProvider != null) {
                throw new IllegalStateException("pinningInfoProvider already set.");
            } else {
                this.pinningInfoProvider = pinningInfoProvider;
                return this;
            }
        }

        public Builder disabled(boolean z) {
            this.disabled = z;
            return this;
        }

        public CrashlyticsCore build() {
            if (this.delay < 0.0f) {
                this.delay = CrashlyticsCore.CLS_DEFAULT_PROCESS_DELAY;
            }
            return new CrashlyticsCore(this.delay, this.listener, this.pinningInfoProvider, this.disabled);
        }
    }

    private static final class CrashMarkerCheck implements Callable<Boolean> {
        private final CrashlyticsFileMarker crashMarker;

        public CrashMarkerCheck(CrashlyticsFileMarker crashlyticsFileMarker) {
            this.crashMarker = crashlyticsFileMarker;
        }

        public Boolean call() throws Exception {
            if (!this.crashMarker.isPresent()) {
                return Boolean.FALSE;
            }
            C15608c.h().d(CrashlyticsCore.TAG, "Found previous crash marker.");
            this.crashMarker.remove();
            return Boolean.TRUE;
        }
    }

    private static final class NoOpListener implements CrashlyticsListener {
        public void crashlyticsDidDetectCrashDuringPreviousExecution() {
        }

        private NoOpListener() {
        }
    }

    /* renamed from: com.crashlytics.android.core.CrashlyticsCore$1 */
    class C43321 extends C18333b<Void> {
        C43321() {
        }

        public Void call() throws Exception {
            return CrashlyticsCore.this.doInBackground();
        }

        public Priority getPriority() {
            return Priority.IMMEDIATE;
        }
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public String getVersion() {
        return "2.6.3.25";
    }

    public CrashlyticsCore() {
        this(CLS_DEFAULT_PROCESS_DELAY, null, null, false);
    }

    CrashlyticsCore(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z) {
        this(f, crashlyticsListener, pinningInfoProvider, z, C15626i.a("Crashlytics Exception Handler"));
    }

    CrashlyticsCore(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z, ExecutorService executorService) {
        this.userId = null;
        this.userEmail = null;
        this.userName = null;
        this.delay = f;
        if (crashlyticsListener == null) {
            crashlyticsListener = new NoOpListener();
        }
        this.listener = crashlyticsListener;
        this.pinningInfo = pinningInfoProvider;
        this.disabled = z;
        this.backgroundWorker = new CrashlyticsBackgroundWorker(executorService);
        this.attributes = new ConcurrentHashMap();
        this.startTime = System.currentTimeMillis();
    }

    protected boolean onPreExecute() {
        return onPreExecute(super.getContext());
    }

    boolean onPreExecute(Context context) {
        Context context2 = context;
        if (this.disabled) {
            return false;
        }
        String a = new C15622f().a(context2);
        if (a == null) {
            return false;
        }
        String m = CommonUtils.m(context);
        if (isBuildIdValid(m, CommonUtils.a(context2, CRASHLYTICS_REQUIRE_BUILD_ID, CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT))) {
            try {
                Logger h = C15608c.h();
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Initializing Crashlytics ");
                stringBuilder.append(getVersion());
                h.i(str, stringBuilder.toString());
                FileStore c17346a = new C17346a(r12);
                r12.crashMarker = new CrashlyticsFileMarker(CRASH_MARKER_FILE_NAME, c17346a);
                r12.initializationMarker = new CrashlyticsFileMarker(INITIALIZATION_MARKER_FILE_NAME, c17346a);
                PreferenceManager create = PreferenceManager.create(new C17347b(getContext(), PREFERENCE_STORE_NAME), r12);
                PinningInfoProvider crashlyticsPinningInfoProvider = r12.pinningInfo != null ? new CrashlyticsPinningInfoProvider(r12.pinningInfo) : null;
                r12.httpRequestFactory = new C17345b(C15608c.h());
                r12.httpRequestFactory.setPinningInfoProvider(crashlyticsPinningInfoProvider);
                IdManager idManager = getIdManager();
                AppData create2 = AppData.create(context2, idManager, a, m);
                UnityVersionProvider manifestUnityVersionProvider = new ManifestUnityVersionProvider(context2, create2.packageName);
                AppMeasurementEventListenerRegistrar instanceFrom = DefaultAppMeasurementEventListenerRegistrar.instanceFrom(this);
                EventLogger eventLogger = AppMeasurementEventLogger.getEventLogger(context);
                Logger h2 = C15608c.h();
                m = TAG;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Installer package name is: ");
                stringBuilder2.append(create2.installerPackageName);
                h2.d(m, stringBuilder2.toString());
                CrashlyticsController crashlyticsController = r1;
                CrashlyticsController crashlyticsController2 = new CrashlyticsController(r12, r12.backgroundWorker, r12.httpRequestFactory, idManager, create, c17346a, create2, manifestUnityVersionProvider, instanceFrom, eventLogger);
                r12.controller = crashlyticsController;
                boolean didPreviousInitializationFail = didPreviousInitializationFail();
                checkForPreviousCrash();
                r12.controller.enableExceptionHandling(Thread.getDefaultUncaughtExceptionHandler(), new C15627j().b(context2));
                if (didPreviousInitializationFail && CommonUtils.n(context)) {
                    C15608c.h().d(TAG, "Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    finishInitSynchronously();
                    return false;
                }
                C15608c.h().d(TAG, "Exception handling initialization successful");
                return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
            } catch (Throwable e) {
                C15608c.h().e(TAG, "Crashlytics was not started due to an exception during initialization", e);
                r12.controller = null;
                return false;
            }
        }
        throw new UnmetDependencyException(MISSING_BUILD_ID_MSG);
    }

    protected Void doInBackground() {
        markInitializationStarted();
        this.controller.cleanInvalidTempFiles();
        try {
            this.controller.registerDevicePowerStateListener();
            C15665p b = Settings.a().b();
            if (b == null) {
                C15608c.h().w(TAG, "Received null settings, skipping report submission!");
                markInitializationComplete();
                return null;
            }
            this.controller.registerAnalyticsEventListener(b);
            if (b.f48509d.f48485c) {
                CrashlyticsNdkData nativeCrashData = getNativeCrashData();
                if (!(nativeCrashData == null || this.controller.finalizeNativeReport(nativeCrashData))) {
                    C15608c.h().d(TAG, "Could not finalize previous NDK sessions.");
                }
                if (!this.controller.finalizeSessions(b.f48507b)) {
                    C15608c.h().d(TAG, "Could not finalize previous sessions.");
                }
                this.controller.submitAllReports(this.delay, b);
                markInitializationComplete();
                return null;
            }
            C15608c.h().d(TAG, "Collection of crash reports disabled in Crashlytics settings.");
            markInitializationComplete();
            return null;
        } catch (Throwable e) {
            C15608c.h().e(TAG, "Crashlytics encountered a problem during asynchronous initialization.", e);
        } catch (Throwable th) {
            markInitializationComplete();
        }
    }

    public static CrashlyticsCore getInstance() {
        return (CrashlyticsCore) C15608c.a(CrashlyticsCore.class);
    }

    public PinningInfoProvider getPinningInfoProvider() {
        return !this.disabled ? this.pinningInfo : null;
    }

    public void logException(Throwable th) {
        if (this.disabled || !ensureFabricWithCalled("prior to logging exceptions.")) {
            return;
        }
        if (th == null) {
            C15608c.h().log(5, TAG, "Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.controller.writeNonFatalException(Thread.currentThread(), th);
        }
    }

    public void log(String str) {
        doLog(3, TAG, str);
    }

    private void doLog(int i, String str, String str2) {
        if (!this.disabled && ensureFabricWithCalled("prior to logging messages.")) {
            this.controller.writeToLog(System.currentTimeMillis() - this.startTime, formatLogMessage(i, str, str2));
        }
    }

    public void log(int i, String str, String str2) {
        doLog(i, str, str2);
        Logger h = C15608c.h();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(str);
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(str2);
        h.log(i, str, stringBuilder.toString(), CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT);
    }

    public void setUserIdentifier(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userId = sanitizeAttribute(str);
            this.controller.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public void setUserName(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userName = sanitizeAttribute(str);
            this.controller.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public void setUserEmail(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userEmail = sanitizeAttribute(str);
            this.controller.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public void setString(String str, String str2) {
        if (this.disabled || !ensureFabricWithCalled("prior to setting keys.")) {
            return;
        }
        if (str == null) {
            str = getContext();
            if (str == null || CommonUtils.i(str) == null) {
                C15608c.h().e(TAG, "Attempting to set custom attribute with null key, ignoring.", null);
                return;
            }
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        str = sanitizeAttribute(str);
        if (this.attributes.size() < 64 || this.attributes.containsKey(str)) {
            if (str2 == null) {
                str2 = "";
            } else {
                str2 = sanitizeAttribute(str2);
            }
            this.attributes.put(str, str2);
            this.controller.cacheKeyData(this.attributes);
            return;
        }
        C15608c.h().d(TAG, "Exceeded maximum number of custom attributes (64)");
    }

    public void setBool(String str, boolean z) {
        setString(str, Boolean.toString(z));
    }

    public void setDouble(String str, double d) {
        setString(str, Double.toString(d));
    }

    public void setFloat(String str, float f) {
        setString(str, Float.toString(f));
    }

    public void setInt(String str, int i) {
        setString(str, Integer.toString(i));
    }

    public void setLong(String str, long j) {
        setString(str, Long.toString(j));
    }

    public void crash() {
        new CrashTest().indexOutOfBounds();
    }

    public boolean verifyPinning(URL url) {
        try {
            return internalVerifyPinning(url);
        } catch (URL url2) {
            C15608c.h().e(TAG, "Could not verify SSL pinning", url2);
            return null;
        }
    }

    @Deprecated
    public synchronized void setListener(CrashlyticsListener crashlyticsListener) {
        C15608c.h().w(TAG, "Use of setListener is deprecated.");
        if (crashlyticsListener == null) {
            throw new IllegalArgumentException("listener must not be null.");
        }
        this.listener = crashlyticsListener;
    }

    Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(this.attributes);
    }

    CrashlyticsController getController() {
        return this.controller;
    }

    String getUserIdentifier() {
        return getIdManager().a() ? this.userId : null;
    }

    String getUserEmail() {
        return getIdManager().a() ? this.userEmail : null;
    }

    String getUserName() {
        return getIdManager().a() ? this.userName : null;
    }

    private void finishInitSynchronously() {
        Callable c43321 = new C43321();
        for (Task addDependency : getDependencies()) {
            c43321.addDependency(addDependency);
        }
        Future submit = getFabric().f().submit(c43321);
        C15608c.h().d(TAG, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (Throwable e) {
            C15608c.h().e(TAG, "Crashlytics was interrupted during initialization.", e);
        } catch (Throwable e2) {
            C15608c.h().e(TAG, "Problem encountered during Crashlytics initialization.", e2);
        } catch (Throwable e22) {
            C15608c.h().e(TAG, "Crashlytics timed out during initialization.", e22);
        }
    }

    void markInitializationStarted() {
        this.backgroundWorker.submitAndWait(new C11092());
    }

    void markInitializationComplete() {
        this.backgroundWorker.submit(new C11103());
    }

    boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    void setCrashlyticsNdkDataProvider(CrashlyticsNdkDataProvider crashlyticsNdkDataProvider) {
        this.crashlyticsNdkDataProvider = crashlyticsNdkDataProvider;
    }

    CrashlyticsNdkData getNativeCrashData() {
        return this.crashlyticsNdkDataProvider != null ? this.crashlyticsNdkDataProvider.getCrashlyticsNdkData() : null;
    }

    boolean internalVerifyPinning(URL url) {
        if (getPinningInfoProvider() == null) {
            return false;
        }
        url = this.httpRequestFactory.buildHttpRequest(HttpMethod.GET, url.toString());
        ((HttpsURLConnection) url.a()).setInstanceFollowRedirects(false);
        url.b();
        return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
    }

    private void checkForPreviousCrash() {
        if (Boolean.TRUE.equals((Boolean) this.backgroundWorker.submitAndWait(new CrashMarkerCheck(this.crashMarker)))) {
            try {
                this.listener.crashlyticsDidDetectCrashDuringPreviousExecution();
            } catch (Throwable e) {
                C15608c.h().e(TAG, "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
            }
        }
    }

    void createCrashMarker() {
        this.crashMarker.create();
    }

    private static String formatLogMessage(int i, String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CommonUtils.b(i));
        stringBuilder.append("/");
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    private static boolean ensureFabricWithCalled(String str) {
        CrashlyticsCore instance = getInstance();
        if (instance != null) {
            if (instance.controller != null) {
                return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
            }
        }
        Logger h = C15608c.h();
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Crashlytics must be initialized by calling Fabric.with(Context) ");
        stringBuilder.append(str);
        h.e(str2, stringBuilder.toString(), null);
        return null;
    }

    private static String sanitizeAttribute(String str) {
        if (str == null) {
            return str;
        }
        str = str.trim();
        return str.length() > MAX_ATTRIBUTE_SIZE ? str.substring(0, MAX_ATTRIBUTE_SIZE) : str;
    }

    static boolean isBuildIdValid(String str, boolean z) {
        if (!z) {
            C15608c.h().d(TAG, "Configured not to require a build ID.");
            return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
        } else if (CommonUtils.d(str) == null) {
            return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
        } else {
            Log.e(TAG, ".");
            Log.e(TAG, ".     |  | ");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".   \\ |  | /");
            Log.e(TAG, ".    \\    /");
            Log.e(TAG, ".     \\  /");
            Log.e(TAG, ".      \\/");
            Log.e(TAG, ".");
            Log.e(TAG, MISSING_BUILD_ID_MSG);
            Log.e(TAG, ".");
            Log.e(TAG, ".      /\\");
            Log.e(TAG, ".     /  \\");
            Log.e(TAG, ".    /    \\");
            Log.e(TAG, ".   / |  | \\");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".");
            return null;
        }
    }
}
