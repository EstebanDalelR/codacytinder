package com.crashlytics.android.core;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.EventLogger;
import com.crashlytics.android.core.LogFileManager.DirectoryProvider;
import com.tinder.api.ManagerWebServices;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.C15624h.C17330a;
import io.fabric.sdk.android.services.common.C15624h.C17331b;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStore;
import io.fabric.sdk.android.services.settings.C15661l;
import io.fabric.sdk.android.services.settings.C15663n;
import io.fabric.sdk.android.services.settings.C15664o;
import io.fabric.sdk.android.services.settings.C15665p;
import io.fabric.sdk.android.services.settings.Settings;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

class CrashlyticsController {
    private static final int ANALYZER_VERSION = 1;
    private static final String COLLECT_CUSTOM_KEYS = "com.crashlytics.CollectCustomKeys";
    private static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    private static final String EVENT_TYPE_CRASH = "crash";
    private static final String EVENT_TYPE_LOGGED = "error";
    static final String FATAL_SESSION_DIR = "fatal-sessions";
    static final String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";
    static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    static final String FIREBASE_CRASH_TYPE = "fatal";
    static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    static final String FIREBASE_REALTIME = "_r";
    static final String FIREBASE_TIMESTAMP = "timestamp";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    private static final String[] INITIAL_SESSION_PART_TAGS = new String[]{SESSION_USER_TAG, SESSION_APP_TAG, SESSION_OS_TAG, SESSION_DEVICE_TAG};
    static final String INVALID_CLS_CACHE_DIR = "invalidClsFiles";
    static final Comparator<File> LARGEST_FILE_NAME_FIRST = new C11034();
    static final int MAX_INVALID_SESSIONS = 4;
    private static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 64;
    static final int MAX_OPEN_SESSIONS = 8;
    static final int MAX_STACK_SIZE = 1024;
    static final String NONFATAL_SESSION_DIR = "nonfatal-sessions";
    static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    private static final Map<String, String> SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    static final String SESSION_APP_TAG = "SessionApp";
    static final FilenameFilter SESSION_BEGIN_FILE_FILTER = new FileNameContainsFilter(SESSION_BEGIN_TAG) {
        public boolean accept(File file, String str) {
            return (super.accept(file, str) == null || str.endsWith(ClsFileOutputStream.SESSION_FILE_EXTENSION) == null) ? null : true;
        }
    };
    static final String SESSION_BEGIN_TAG = "BeginSession";
    static final String SESSION_DEVICE_TAG = "SessionDevice";
    static final FileFilter SESSION_DIRECTORY_FILTER = new C11023();
    static final String SESSION_EVENT_MISSING_BINARY_IMGS_TAG = "SessionMissingBinaryImages";
    static final String SESSION_FATAL_TAG = "SessionCrash";
    static final FilenameFilter SESSION_FILE_FILTER = new C11012();
    private static final Pattern SESSION_FILE_PATTERN = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final int SESSION_ID_LENGTH = 35;
    static final String SESSION_JSON_SUFFIX = ".json";
    static final String SESSION_NON_FATAL_TAG = "SessionEvent";
    static final String SESSION_OS_TAG = "SessionOS";
    static final String SESSION_USER_TAG = "SessionUser";
    private static final boolean SHOULD_PROMPT_BEFORE_SENDING_REPORTS_DEFAULT = false;
    static final Comparator<File> SMALLEST_FILE_NAME_FIRST = new C11045();
    private final AppData appData;
    private final AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar;
    private final CrashlyticsBackgroundWorker backgroundWorker;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    private final CrashlyticsCore crashlyticsCore;
    private final DevicePowerStateListener devicePowerStateListener;
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final FileStore fileStore;
    private final EventLogger firebaseAnalyticsLogger;
    private final HandlingExceptionCheck handlingExceptionCheck;
    private final HttpRequestFactory httpRequestFactory;
    private final IdManager idManager;
    private final LogFileDirectoryProvider logFileDirectoryProvider;
    private final LogFileManager logFileManager;
    private final PreferenceManager preferenceManager;
    private final ReportFilesProvider reportFilesProvider;
    private final StackTraceTrimmingStrategy stackTraceTrimmingStrategy;
    private final String unityVersion;

    /* renamed from: com.crashlytics.android.core.CrashlyticsController$2 */
    static class C11012 implements FilenameFilter {
        C11012() {
        }

        public boolean accept(File file, String str) {
            return (str.length() != ClsFileOutputStream.SESSION_FILE_EXTENSION.length() + 35 || str.endsWith(ClsFileOutputStream.SESSION_FILE_EXTENSION) == null) ? null : true;
        }
    }

    /* renamed from: com.crashlytics.android.core.CrashlyticsController$3 */
    static class C11023 implements FileFilter {
        C11023() {
        }

        public boolean accept(File file) {
            return (file.isDirectory() && file.getName().length() == 35) ? true : null;
        }
    }

    /* renamed from: com.crashlytics.android.core.CrashlyticsController$4 */
    static class C11034 implements Comparator<File> {
        C11034() {
        }

        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    }

    /* renamed from: com.crashlytics.android.core.CrashlyticsController$5 */
    static class C11045 implements Comparator<File> {
        C11045() {
        }

        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    private static class AnySessionPartFileFilter implements FilenameFilter {
        private AnySessionPartFileFilter() {
        }

        public boolean accept(File file, String str) {
            return (CrashlyticsController.SESSION_FILE_FILTER.accept(file, str) != null || CrashlyticsController.SESSION_FILE_PATTERN.matcher(str).matches() == null) ? null : true;
        }
    }

    private interface CodedOutputStreamWriteAction {
        void writeTo(CodedOutputStream codedOutputStream) throws Exception;
    }

    static class FileNameContainsFilter implements FilenameFilter {
        private final String string;

        public FileNameContainsFilter(String str) {
            this.string = str;
        }

        public boolean accept(File file, String str) {
            return (str.contains(this.string) == null || str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION) != null) ? null : true;
        }
    }

    private interface FileOutputStreamWriteAction {
        void writeTo(FileOutputStream fileOutputStream) throws Exception;
    }

    static class InvalidPartFileFilter implements FilenameFilter {
        InvalidPartFileFilter() {
        }

        public boolean accept(File file, String str) {
            if (ClsFileOutputStream.TEMP_FILENAME_FILTER.accept(file, str) == null) {
                if (str.contains(CrashlyticsController.SESSION_EVENT_MISSING_BINARY_IMGS_TAG) == null) {
                    return null;
                }
            }
            return true;
        }
    }

    private static final class SendReportRunnable implements Runnable {
        private final Context context;
        private final Report report;
        private final ReportUploader reportUploader;

        public SendReportRunnable(Context context, Report report, ReportUploader reportUploader) {
            this.context = context;
            this.report = report;
            this.reportUploader = reportUploader;
        }

        public void run() {
            if (CommonUtils.n(this.context)) {
                C15608c.h().d(CrashlyticsCore.TAG, "Attempting to send crash report at time of crash...");
                this.reportUploader.forceUpload(this.report);
            }
        }
    }

    static class SessionPartFileFilter implements FilenameFilter {
        private final String sessionId;

        public SessionPartFileFilter(String str) {
            this.sessionId = str;
        }

        public boolean accept(File file, String str) {
            file = new StringBuilder();
            file.append(this.sessionId);
            file.append(ClsFileOutputStream.SESSION_FILE_EXTENSION);
            boolean z = false;
            if (str.equals(file.toString()) != null) {
                return false;
            }
            if (str.contains(this.sessionId) != null && str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION) == null) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: com.crashlytics.android.core.CrashlyticsController$6 */
    class C31286 implements CrashListener {
        C31286() {
        }

        public void onUncaughtException(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z) {
            CrashlyticsController.this.handleUncaughtException(settingsDataProvider, thread, th, z);
        }
    }

    private static final class DefaultSettingsDataProvider implements SettingsDataProvider {
        private DefaultSettingsDataProvider() {
        }

        public C15665p getSettingsData() {
            return Settings.a().b();
        }
    }

    private static final class LogFileDirectoryProvider implements DirectoryProvider {
        private static final String LOG_FILES_DIR = "log-files";
        private final FileStore rootFileStore;

        public LogFileDirectoryProvider(FileStore fileStore) {
            this.rootFileStore = fileStore;
        }

        public File getLogFileDir() {
            File file = new File(this.rootFileStore.getFilesDir(), LOG_FILES_DIR);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    private static final class PrivacyDialogCheck implements SendCheck {
        private final C15611g kit;
        private final PreferenceManager preferenceManager;
        private final C15663n promptData;

        /* renamed from: com.crashlytics.android.core.CrashlyticsController$PrivacyDialogCheck$1 */
        class C31291 implements AlwaysSendCallback {
            C31291() {
            }

            public void sendUserReportsWithoutPrompting(boolean z) {
                PrivacyDialogCheck.this.preferenceManager.setShouldAlwaysSendReports(z);
            }
        }

        public PrivacyDialogCheck(C15611g c15611g, PreferenceManager preferenceManager, C15663n c15663n) {
            this.kit = c15611g;
            this.preferenceManager = preferenceManager;
            this.promptData = c15663n;
        }

        public boolean canSendReports() {
            Activity b = this.kit.getFabric().b();
            if (b != null) {
                if (!b.isFinishing()) {
                    final CrashPromptDialog create = CrashPromptDialog.create(b, this.promptData, new C31291());
                    b.runOnUiThread(new Runnable() {
                        public void run() {
                            create.show();
                        }
                    });
                    C15608c.h().d(CrashlyticsCore.TAG, "Waiting for user opt-in.");
                    create.await();
                    return create.getOptIn();
                }
            }
            return true;
        }
    }

    private final class ReportUploaderFilesProvider implements ReportFilesProvider {
        private ReportUploaderFilesProvider() {
        }

        public File[] getCompleteSessionFiles() {
            return CrashlyticsController.this.listCompleteSessionFiles();
        }

        public File[] getInvalidSessionFiles() {
            return CrashlyticsController.this.getInvalidFilesDir().listFiles();
        }

        public File[] getNativeReportFiles() {
            return CrashlyticsController.this.listNativeSessionFileDirectories();
        }
    }

    private final class ReportUploaderHandlingExceptionCheck implements HandlingExceptionCheck {
        private ReportUploaderHandlingExceptionCheck() {
        }

        public boolean isHandlingException() {
            return CrashlyticsController.this.isHandlingException();
        }
    }

    CrashlyticsController(CrashlyticsCore crashlyticsCore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, HttpRequestFactory httpRequestFactory, IdManager idManager, PreferenceManager preferenceManager, FileStore fileStore, AppData appData, UnityVersionProvider unityVersionProvider, AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar, EventLogger eventLogger) {
        this.crashlyticsCore = crashlyticsCore;
        this.backgroundWorker = crashlyticsBackgroundWorker;
        this.httpRequestFactory = httpRequestFactory;
        this.idManager = idManager;
        this.preferenceManager = preferenceManager;
        this.fileStore = fileStore;
        this.appData = appData;
        this.unityVersion = unityVersionProvider.getUnityVersion();
        this.appMeasurementEventListenerRegistrar = appMeasurementEventListenerRegistrar;
        this.firebaseAnalyticsLogger = eventLogger;
        crashlyticsCore = crashlyticsCore.getContext();
        this.logFileDirectoryProvider = new LogFileDirectoryProvider(fileStore);
        this.logFileManager = new LogFileManager(crashlyticsCore, this.logFileDirectoryProvider);
        this.reportFilesProvider = new ReportUploaderFilesProvider();
        this.handlingExceptionCheck = new ReportUploaderHandlingExceptionCheck();
        this.devicePowerStateListener = new DevicePowerStateListener(crashlyticsCore);
        this.stackTraceTrimmingStrategy = new MiddleOutFallbackStrategy(MAX_STACK_SIZE, new StackTraceTrimmingStrategy[]{new RemoveRepeatsStrategy(10)});
    }

    void enableExceptionHandling(UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        openSession();
        this.crashHandler = new CrashlyticsUncaughtExceptionHandler(new C31286(), new DefaultSettingsDataProvider(), z, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.crashHandler);
    }

    synchronized void handleUncaughtException(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z) {
        Logger h = C15608c.h();
        String str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Crashlytics is handling uncaught exception \"");
        stringBuilder.append(th);
        stringBuilder.append("\" from thread ");
        stringBuilder.append(thread.getName());
        h.d(str, stringBuilder.toString());
        this.devicePowerStateListener.dispose();
        final Date date = new Date();
        final Thread thread2 = thread;
        final Throwable th2 = th;
        final SettingsDataProvider settingsDataProvider2 = settingsDataProvider;
        final boolean z2 = z;
        this.backgroundWorker.submitAndWait(new Callable<Void>() {
            public Void call() throws Exception {
                C15664o c15664o;
                C15661l c15661l;
                Object obj;
                CrashlyticsController.this.crashlyticsCore.createCrashMarker();
                CrashlyticsController.this.writeFatal(date, thread2, th2);
                C15665p settingsData = settingsDataProvider2.getSettingsData();
                if (settingsData != null) {
                    c15664o = settingsData.f48507b;
                    c15661l = settingsData.f48509d;
                } else {
                    c15664o = null;
                    c15661l = c15664o;
                }
                if (c15661l != null) {
                    if (!c15661l.f48487e) {
                        obj = null;
                        if (obj != null || z2) {
                            CrashlyticsController.this.recordFatalFirebaseEvent(date.getTime());
                        }
                        CrashlyticsController.this.doCloseSessions(c15664o);
                        CrashlyticsController.this.doOpenSession();
                        if (c15664o != null) {
                            CrashlyticsController.this.trimSessionFiles(c15664o.f48505g);
                        }
                        if (!CrashlyticsController.this.shouldPromptUserBeforeSendingCrashReports(settingsData)) {
                            CrashlyticsController.this.sendSessionReports(settingsData);
                        }
                        return null;
                    }
                }
                obj = 1;
                CrashlyticsController.this.recordFatalFirebaseEvent(date.getTime());
                CrashlyticsController.this.doCloseSessions(c15664o);
                CrashlyticsController.this.doOpenSession();
                if (c15664o != null) {
                    CrashlyticsController.this.trimSessionFiles(c15664o.f48505g);
                }
                if (CrashlyticsController.this.shouldPromptUserBeforeSendingCrashReports(settingsData)) {
                    CrashlyticsController.this.sendSessionReports(settingsData);
                }
                return null;
            }
        });
    }

    void submitAllReports(float f, C15665p c15665p) {
        if (c15665p == null) {
            C15608c.h().w(CrashlyticsCore.TAG, "Could not send reports. Settings are not available.");
            return;
        }
        new ReportUploader(this.appData.apiKey, getCreateReportSpiCall(c15665p.f48506a.f48477d, c15665p.f48506a.f48478e), this.reportFilesProvider, this.handlingExceptionCheck).uploadReports(f, shouldPromptUserBeforeSendingCrashReports(c15665p) ? new PrivacyDialogCheck(this.crashlyticsCore, this.preferenceManager, c15665p.f48508c) : new AlwaysSendCheck());
    }

    void writeToLog(final long j, final String str) {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() throws Exception {
                if (!CrashlyticsController.this.isHandlingException()) {
                    CrashlyticsController.this.logFileManager.writeToLog(j, str);
                }
                return null;
            }
        });
    }

    void writeNonFatalException(final Thread thread, final Throwable th) {
        final Date date = new Date();
        this.backgroundWorker.submit(new Runnable() {
            public void run() {
                if (!CrashlyticsController.this.isHandlingException()) {
                    CrashlyticsController.this.doWriteNonFatal(date, thread, th);
                }
            }
        });
    }

    void cacheUserData(final String str, final String str2, final String str3) {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() throws Exception {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeUserData(CrashlyticsController.this.getCurrentSessionId(), new UserMetaData(str, str2, str3));
                return null;
            }
        });
    }

    void cacheKeyData(final Map<String, String> map) {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() throws Exception {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeKeyData(CrashlyticsController.this.getCurrentSessionId(), map);
                return null;
            }
        });
    }

    void openSession() {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() throws Exception {
                CrashlyticsController.this.doOpenSession();
                return null;
            }
        });
    }

    private String getCurrentSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        return listSortedSessionBeginFiles.length > 0 ? getSessionIdFromSessionFile(listSortedSessionBeginFiles[0]) : null;
    }

    private String getPreviousSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        return listSortedSessionBeginFiles.length > 1 ? getSessionIdFromSessionFile(listSortedSessionBeginFiles[1]) : null;
    }

    static String getSessionIdFromSessionFile(File file) {
        return file.getName().substring(0, 35);
    }

    boolean hasOpenSession() {
        return listSessionBeginFiles().length > 0;
    }

    boolean finalizeSessions(final C15664o c15664o) {
        return ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                if (CrashlyticsController.this.isHandlingException()) {
                    C15608c.h().d(CrashlyticsCore.TAG, "Skipping session finalization because a crash has already occurred.");
                    return Boolean.FALSE;
                }
                C15608c.h().d(CrashlyticsCore.TAG, "Finalizing previously open sessions.");
                CrashlyticsController.this.doCloseSessions(c15664o, true);
                C15608c.h().d(CrashlyticsCore.TAG, "Closed all previously open sessions");
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    private void doOpenSession() throws Exception {
        Date date = new Date();
        String clsuuid = new CLSUUID(this.idManager).toString();
        Logger h = C15608c.h();
        String str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Opening a new session with ID ");
        stringBuilder.append(clsuuid);
        h.d(str, stringBuilder.toString());
        writeBeginSession(clsuuid, date);
        writeSessionApp(clsuuid);
        writeSessionOS(clsuuid);
        writeSessionDevice(clsuuid);
        this.logFileManager.setCurrentSession(clsuuid);
    }

    void doCloseSessions(C15664o c15664o) throws Exception {
        doCloseSessions(c15664o, false);
    }

    private void doCloseSessions(C15664o c15664o, boolean z) throws Exception {
        trimOpenSessions(z + 8);
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length <= z) {
            C15608c.h().d(CrashlyticsCore.TAG, "No open sessions to be closed.");
            return;
        }
        writeSessionUser(getSessionIdFromSessionFile(listSortedSessionBeginFiles[z]));
        if (c15664o == null) {
            C15608c.h().d(CrashlyticsCore.TAG, "Unable to close session. Settings are not loaded.");
        } else {
            closeOpenSessions(listSortedSessionBeginFiles, z, c15664o.f48501c);
        }
    }

    private void closeOpenSessions(File[] fileArr, int i, int i2) {
        C15608c.h().d(CrashlyticsCore.TAG, "Closing open sessions.");
        while (i < fileArr.length) {
            File file = fileArr[i];
            String sessionIdFromSessionFile = getSessionIdFromSessionFile(file);
            Logger h = C15608c.h();
            String str = CrashlyticsCore.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Closing session: ");
            stringBuilder.append(sessionIdFromSessionFile);
            h.d(str, stringBuilder.toString());
            writeSessionPartsToSessionFile(file, sessionIdFromSessionFile, i2);
            i++;
        }
    }

    private void closeWithoutRenamingOrLog(ClsFileOutputStream clsFileOutputStream) {
        if (clsFileOutputStream != null) {
            try {
                clsFileOutputStream.closeInProgressStream();
            } catch (ClsFileOutputStream clsFileOutputStream2) {
                C15608c.h().e(CrashlyticsCore.TAG, "Error closing session file stream in the presence of an exception", clsFileOutputStream2);
            }
        }
    }

    private void recursiveDelete(Set<File> set) {
        for (File recursiveDelete : set) {
            recursiveDelete(recursiveDelete);
        }
    }

    private void recursiveDelete(File file) {
        if (file.isDirectory()) {
            for (File recursiveDelete : file.listFiles()) {
                recursiveDelete(recursiveDelete);
            }
        }
        file.delete();
    }

    private void deleteSessionPartFilesFor(String str) {
        for (File delete : listSessionPartFilesFor(str)) {
            delete.delete();
        }
    }

    private File[] listSessionPartFilesFor(String str) {
        return listFilesMatching(new SessionPartFileFilter(str));
    }

    File[] listCompleteSessionFiles() {
        List linkedList = new LinkedList();
        Collections.addAll(linkedList, listFilesMatching(getFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getNonFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getFilesDir(), SESSION_FILE_FILTER));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    File[] listNativeSessionFileDirectories() {
        return listFilesMatching(SESSION_DIRECTORY_FILTER);
    }

    File[] listSessionBeginFiles() {
        return listFilesMatching(SESSION_BEGIN_FILE_FILTER);
    }

    private File[] listSortedSessionBeginFiles() {
        File[] listSessionBeginFiles = listSessionBeginFiles();
        Arrays.sort(listSessionBeginFiles, LARGEST_FILE_NAME_FIRST);
        return listSessionBeginFiles;
    }

    private File[] listFilesMatching(FileFilter fileFilter) {
        return ensureFileArrayNotNull(getFilesDir().listFiles(fileFilter));
    }

    private File[] listFilesMatching(FilenameFilter filenameFilter) {
        return listFilesMatching(getFilesDir(), filenameFilter);
    }

    private File[] listFilesMatching(File file, FilenameFilter filenameFilter) {
        return ensureFileArrayNotNull(file.listFiles(filenameFilter));
    }

    private File[] listFiles(File file) {
        return ensureFileArrayNotNull(file.listFiles());
    }

    private File[] ensureFileArrayNotNull(File[] fileArr) {
        return fileArr == null ? new File[null] : fileArr;
    }

    private void trimSessionEventFiles(String str, int i) {
        File filesDir = getFilesDir();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(SESSION_NON_FATAL_TAG);
        Utils.capFileCount(filesDir, new FileNameContainsFilter(stringBuilder.toString()), i, SMALLEST_FILE_NAME_FIRST);
    }

    void trimSessionFiles(int i) {
        i -= Utils.capFileCount(getFatalSessionFilesDir(), i, SMALLEST_FILE_NAME_FIRST);
        Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, i - Utils.capFileCount(getNonFatalSessionFilesDir(), i, SMALLEST_FILE_NAME_FIRST), SMALLEST_FILE_NAME_FIRST);
    }

    private void trimOpenSessions(int i) {
        Set hashSet = new HashSet();
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        i = Math.min(i, listSortedSessionBeginFiles.length);
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.add(getSessionIdFromSessionFile(listSortedSessionBeginFiles[i2]));
        }
        this.logFileManager.discardOldLogFiles(hashSet);
        retainSessions(listFilesMatching(new AnySessionPartFileFilter()), hashSet);
    }

    private void retainSessions(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = SESSION_FILE_PATTERN.matcher(name);
            Logger h;
            String str;
            StringBuilder stringBuilder;
            if (!matcher.matches()) {
                h = C15608c.h();
                str = CrashlyticsCore.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Deleting unknown file: ");
                stringBuilder.append(name);
                h.d(str, stringBuilder.toString());
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                h = C15608c.h();
                str = CrashlyticsCore.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Trimming session file: ");
                stringBuilder.append(name);
                h.d(str, stringBuilder.toString());
                file.delete();
            }
        }
    }

    private File[] getTrimmedNonFatalFiles(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        C15608c.h().d(CrashlyticsCore.TAG, String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)}));
        trimSessionEventFiles(str, i);
        i = new StringBuilder();
        i.append(str);
        i.append(SESSION_NON_FATAL_TAG);
        return listFilesMatching(new FileNameContainsFilter(i.toString()));
    }

    void cleanInvalidTempFiles() {
        this.backgroundWorker.submit(new Runnable() {
            public void run() {
                CrashlyticsController.this.doCleanInvalidTempFiles(CrashlyticsController.this.listFilesMatching(new InvalidPartFileFilter()));
            }
        });
    }

    void doCleanInvalidTempFiles(File[] fileArr) {
        final Set hashSet = new HashSet();
        for (File file : fileArr) {
            Logger h = C15608c.h();
            String str = CrashlyticsCore.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Found invalid session part file: ");
            stringBuilder.append(file);
            h.d(str, stringBuilder.toString());
            hashSet.add(getSessionIdFromSessionFile(file));
        }
        if (hashSet.isEmpty() == null) {
            fileArr = getInvalidFilesDir();
            if (!fileArr.exists()) {
                fileArr.mkdir();
            }
            for (File file2 : listFilesMatching(new FilenameFilter() {
                public boolean accept(File file, String str) {
                    if (str.length() < 35) {
                        return false;
                    }
                    return hashSet.contains(str.substring(0, 35));
                }
            })) {
                Logger h2 = C15608c.h();
                String str2 = CrashlyticsCore.TAG;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Moving session file: ");
                stringBuilder2.append(file2);
                h2.d(str2, stringBuilder2.toString());
                if (!file2.renameTo(new File(fileArr, file2.getName()))) {
                    h2 = C15608c.h();
                    str2 = CrashlyticsCore.TAG;
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Could not move session file. Deleting ");
                    stringBuilder2.append(file2);
                    h2.d(str2, stringBuilder2.toString());
                    file2.delete();
                }
            }
            trimInvalidSessionFiles();
        }
    }

    private void trimInvalidSessionFiles() {
        File invalidFilesDir = getInvalidFilesDir();
        if (invalidFilesDir.exists()) {
            File[] listFilesMatching = listFilesMatching(invalidFilesDir, new InvalidPartFileFilter());
            Arrays.sort(listFilesMatching, Collections.reverseOrder());
            Set hashSet = new HashSet();
            for (int i = 0; i < listFilesMatching.length && hashSet.size() < 4; i++) {
                hashSet.add(getSessionIdFromSessionFile(listFilesMatching[i]));
            }
            retainSessions(listFiles(invalidFilesDir), hashSet);
        }
    }

    private void finalizeMostRecentNativeCrash(Context context, File file, String str) throws IOException {
        byte[] minidumpFromDirectory = NativeFileUtils.minidumpFromDirectory(file);
        byte[] metadataJsonFromDirectory = NativeFileUtils.metadataJsonFromDirectory(file);
        context = NativeFileUtils.binaryImagesJsonFromDirectory(file, context);
        if (minidumpFromDirectory != null) {
            if (minidumpFromDirectory.length != 0) {
                recordFatalExceptionAnswersEvent(str, "<native-crash: minidump>");
                file = readFile(str, "BeginSession.json");
                byte[] readFile = readFile(str, "SessionApp.json");
                byte[] readFile2 = readFile(str, "SessionDevice.json");
                byte[] readFile3 = readFile(str, "SessionOS.json");
                byte[] readFile4 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getUserDataFileForSession(str));
                LogFileManager logFileManager = new LogFileManager(this.crashlyticsCore.getContext(), this.logFileDirectoryProvider, str);
                byte[] bytesForLog = logFileManager.getBytesForLog();
                logFileManager.clearLog();
                byte[] readFile5 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getKeysFileForSession(str));
                File file2 = new File(this.fileStore.getFilesDir(), str);
                if (file2.mkdir() == null) {
                    C15608c.h().d(CrashlyticsCore.TAG, "Couldn't create native sessions directory");
                    return;
                }
                gzipIfNotEmpty(minidumpFromDirectory, new File(file2, "minidump"));
                gzipIfNotEmpty(metadataJsonFromDirectory, new File(file2, "metadata"));
                gzipIfNotEmpty(context, new File(file2, "binaryImages"));
                gzipIfNotEmpty(file, new File(file2, "session"));
                gzipIfNotEmpty(readFile, new File(file2, "app"));
                gzipIfNotEmpty(readFile2, new File(file2, "device"));
                gzipIfNotEmpty(readFile3, new File(file2, "os"));
                gzipIfNotEmpty(readFile4, new File(file2, ManagerWebServices.PARAM_USER));
                gzipIfNotEmpty(bytesForLog, new File(file2, "logs"));
                gzipIfNotEmpty(readFile5, new File(file2, "keys"));
                return;
            }
        }
        context = C15608c.h();
        str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No minidump data found in directory ");
        stringBuilder.append(file);
        context.w(str, stringBuilder.toString());
    }

    boolean finalizeNativeReport(final CrashlyticsNdkData crashlyticsNdkData) {
        return crashlyticsNdkData == null ? true : ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                Set set = crashlyticsNdkData.timestampedDirectories;
                String access$1600 = CrashlyticsController.this.getPreviousSessionId();
                if (!(access$1600 == null || set.isEmpty())) {
                    File file = (File) set.first();
                    if (file != null) {
                        CrashlyticsController.this.finalizeMostRecentNativeCrash(CrashlyticsController.this.crashlyticsCore.getContext(), file, access$1600);
                    }
                }
                CrashlyticsController.this.recursiveDelete(set);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    private void gzipIfNotEmpty(byte[] bArr, File file) throws IOException {
        if (bArr != null && bArr.length > 0) {
            gzip(bArr, file);
        }
    }

    private void gzip(byte[] bArr, File file) throws IOException {
        Closeable closeable = null;
        try {
            Closeable gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                CommonUtils.a(gZIPOutputStream);
            } catch (Throwable th) {
                bArr = th;
                closeable = gZIPOutputStream;
                CommonUtils.a(closeable);
                throw bArr;
            }
        } catch (Throwable th2) {
            bArr = th2;
            CommonUtils.a(closeable);
            throw bArr;
        }
    }

    private void writeFatal(Date date, Thread thread, Throwable th) {
        Closeable clsFileOutputStream;
        Flushable flushable = null;
        try {
            String currentSessionId = getCurrentSessionId();
            if (currentSessionId == null) {
                C15608c.h().e(CrashlyticsCore.TAG, "Tried to write a fatal exception while no session was open.", null);
                CommonUtils.a(null, "Failed to flush to session begin file.");
                CommonUtils.a(null, "Failed to close fatal exception file output stream.");
                return;
            }
            recordFatalExceptionAnswersEvent(currentSessionId, th.getClass().getName());
            File filesDir = getFilesDir();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(currentSessionId);
            stringBuilder.append(SESSION_FATAL_TAG);
            clsFileOutputStream = new ClsFileOutputStream(filesDir, stringBuilder.toString());
            try {
                Flushable newInstance = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                try {
                    writeSessionEvent(newInstance, date, thread, th, EVENT_TYPE_CRASH, true);
                    CommonUtils.a(newInstance, "Failed to flush to session begin file.");
                } catch (Exception e) {
                    date = e;
                    flushable = newInstance;
                    try {
                        C15608c.h().e(CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", date);
                        CommonUtils.a(flushable, "Failed to flush to session begin file.");
                        CommonUtils.a(clsFileOutputStream, "Failed to close fatal exception file output stream.");
                    } catch (Throwable th2) {
                        date = th2;
                        CommonUtils.a(flushable, "Failed to flush to session begin file.");
                        CommonUtils.a(clsFileOutputStream, "Failed to close fatal exception file output stream.");
                        throw date;
                    }
                } catch (Throwable th3) {
                    date = th3;
                    flushable = newInstance;
                    CommonUtils.a(flushable, "Failed to flush to session begin file.");
                    CommonUtils.a(clsFileOutputStream, "Failed to close fatal exception file output stream.");
                    throw date;
                }
            } catch (Exception e2) {
                date = e2;
                C15608c.h().e(CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", date);
                CommonUtils.a(flushable, "Failed to flush to session begin file.");
                CommonUtils.a(clsFileOutputStream, "Failed to close fatal exception file output stream.");
            }
            CommonUtils.a(clsFileOutputStream, "Failed to close fatal exception file output stream.");
        } catch (Exception e3) {
            date = e3;
            clsFileOutputStream = null;
            C15608c.h().e(CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", date);
            CommonUtils.a(flushable, "Failed to flush to session begin file.");
            CommonUtils.a(clsFileOutputStream, "Failed to close fatal exception file output stream.");
        } catch (Throwable th4) {
            date = th4;
            clsFileOutputStream = null;
            CommonUtils.a(flushable, "Failed to flush to session begin file.");
            CommonUtils.a(clsFileOutputStream, "Failed to close fatal exception file output stream.");
            throw date;
        }
    }

    private void doWriteNonFatal(Date date, Thread thread, Throwable th) {
        String currentSessionId = getCurrentSessionId();
        Flushable flushable = null;
        if (currentSessionId == null) {
            C15608c.h().e(CrashlyticsCore.TAG, "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        Closeable clsFileOutputStream;
        recordLoggedExceptionAnswersEvent(currentSessionId, th.getClass().getName());
        try {
            Logger h = C15608c.h();
            String str = CrashlyticsCore.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Crashlytics is logging non-fatal exception \"");
            stringBuilder.append(th);
            stringBuilder.append("\" from thread ");
            stringBuilder.append(thread.getName());
            h.d(str, stringBuilder.toString());
            String a = CommonUtils.a(this.eventCounter.getAndIncrement());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(currentSessionId);
            stringBuilder2.append(SESSION_NON_FATAL_TAG);
            stringBuilder2.append(a);
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), stringBuilder2.toString());
            try {
                Flushable newInstance = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                try {
                    writeSessionEvent(newInstance, date, thread, th, "error", false);
                    CommonUtils.a(newInstance, "Failed to flush to non-fatal file.");
                } catch (Exception e) {
                    date = e;
                    flushable = newInstance;
                    try {
                        C15608c.h().e(CrashlyticsCore.TAG, "An error occurred in the non-fatal exception logger", date);
                        CommonUtils.a(flushable, "Failed to flush to non-fatal file.");
                        CommonUtils.a(clsFileOutputStream, "Failed to close non-fatal file output stream.");
                        trimSessionEventFiles(currentSessionId, 64);
                    } catch (Throwable th2) {
                        date = th2;
                        CommonUtils.a(flushable, "Failed to flush to non-fatal file.");
                        CommonUtils.a(clsFileOutputStream, "Failed to close non-fatal file output stream.");
                        throw date;
                    }
                } catch (Throwable th3) {
                    date = th3;
                    flushable = newInstance;
                    CommonUtils.a(flushable, "Failed to flush to non-fatal file.");
                    CommonUtils.a(clsFileOutputStream, "Failed to close non-fatal file output stream.");
                    throw date;
                }
            } catch (Exception e2) {
                date = e2;
                C15608c.h().e(CrashlyticsCore.TAG, "An error occurred in the non-fatal exception logger", date);
                CommonUtils.a(flushable, "Failed to flush to non-fatal file.");
                CommonUtils.a(clsFileOutputStream, "Failed to close non-fatal file output stream.");
                trimSessionEventFiles(currentSessionId, 64);
            }
        } catch (Exception e3) {
            date = e3;
            clsFileOutputStream = null;
            C15608c.h().e(CrashlyticsCore.TAG, "An error occurred in the non-fatal exception logger", date);
            CommonUtils.a(flushable, "Failed to flush to non-fatal file.");
            CommonUtils.a(clsFileOutputStream, "Failed to close non-fatal file output stream.");
            trimSessionEventFiles(currentSessionId, 64);
        } catch (Throwable th4) {
            date = th4;
            clsFileOutputStream = null;
            CommonUtils.a(flushable, "Failed to flush to non-fatal file.");
            CommonUtils.a(clsFileOutputStream, "Failed to close non-fatal file output stream.");
            throw date;
        }
        CommonUtils.a(clsFileOutputStream, "Failed to close non-fatal file output stream.");
        try {
            trimSessionEventFiles(currentSessionId, 64);
        } catch (Date date2) {
            C15608c.h().e(CrashlyticsCore.TAG, "An error occurred when trimming non-fatal files.", date2);
        }
    }

    private void writeSessionPartFile(String str, String str2, CodedOutputStreamWriteAction codedOutputStreamWriteAction) throws Exception {
        Closeable clsFileOutputStream;
        Flushable flushable = null;
        try {
            File filesDir = getFilesDir();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            clsFileOutputStream = new ClsFileOutputStream(filesDir, stringBuilder.toString());
            try {
                str = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
            } catch (Throwable th) {
                codedOutputStreamWriteAction = th;
                str = new StringBuilder();
                str.append("Failed to flush to session ");
                str.append(str2);
                str.append(" file.");
                CommonUtils.a(flushable, str.toString());
                str = new StringBuilder();
                str.append("Failed to close session ");
                str.append(str2);
                str.append(" file.");
                CommonUtils.a(clsFileOutputStream, str.toString());
                throw codedOutputStreamWriteAction;
            }
            try {
                codedOutputStreamWriteAction.writeTo(str);
                codedOutputStreamWriteAction = new StringBuilder();
                codedOutputStreamWriteAction.append("Failed to flush to session ");
                codedOutputStreamWriteAction.append(str2);
                codedOutputStreamWriteAction.append(" file.");
                CommonUtils.a(str, codedOutputStreamWriteAction.toString());
                str = new StringBuilder();
                str.append("Failed to close session ");
                str.append(str2);
                str.append(" file.");
                CommonUtils.a(clsFileOutputStream, str.toString());
            } catch (Throwable th2) {
                codedOutputStreamWriteAction = th2;
                flushable = str;
                str = new StringBuilder();
                str.append("Failed to flush to session ");
                str.append(str2);
                str.append(" file.");
                CommonUtils.a(flushable, str.toString());
                str = new StringBuilder();
                str.append("Failed to close session ");
                str.append(str2);
                str.append(" file.");
                CommonUtils.a(clsFileOutputStream, str.toString());
                throw codedOutputStreamWriteAction;
            }
        } catch (Throwable th3) {
            codedOutputStreamWriteAction = th3;
            clsFileOutputStream = null;
            str = new StringBuilder();
            str.append("Failed to flush to session ");
            str.append(str2);
            str.append(" file.");
            CommonUtils.a(flushable, str.toString());
            str = new StringBuilder();
            str.append("Failed to close session ");
            str.append(str2);
            str.append(" file.");
            CommonUtils.a(clsFileOutputStream, str.toString());
            throw codedOutputStreamWriteAction;
        }
    }

    private void writeFile(String str, String str2, FileOutputStreamWriteAction fileOutputStreamWriteAction) throws Exception {
        Closeable closeable = null;
        try {
            File filesDir = getFilesDir();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            Closeable fileOutputStream = new FileOutputStream(new File(filesDir, stringBuilder.toString()));
            try {
                fileOutputStreamWriteAction.writeTo(fileOutputStream);
                str = new StringBuilder();
                str.append("Failed to close ");
                str.append(str2);
                str.append(" file.");
                CommonUtils.a(fileOutputStream, str.toString());
            } catch (Throwable th) {
                str = th;
                closeable = fileOutputStream;
                fileOutputStreamWriteAction = new StringBuilder();
                fileOutputStreamWriteAction.append("Failed to close ");
                fileOutputStreamWriteAction.append(str2);
                fileOutputStreamWriteAction.append(" file.");
                CommonUtils.a(closeable, fileOutputStreamWriteAction.toString());
                throw str;
            }
        } catch (Throwable th2) {
            str = th2;
            fileOutputStreamWriteAction = new StringBuilder();
            fileOutputStreamWriteAction.append("Failed to close ");
            fileOutputStreamWriteAction.append(str2);
            fileOutputStreamWriteAction.append(" file.");
            CommonUtils.a(closeable, fileOutputStreamWriteAction.toString());
            throw str;
        }
    }

    private byte[] readFile(String str, String str2) {
        File filesDir = getFilesDir();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return NativeFileUtils.readFile(new File(filesDir, stringBuilder.toString()));
    }

    private void writeBeginSession(String str, Date date) throws Exception {
        String format = String.format(Locale.US, GENERATOR_FORMAT, new Object[]{this.crashlyticsCore.getVersion()});
        final String str2 = str;
        final String str3 = format;
        final long time = date.getTime() / 1000;
        writeSessionPartFile(str, SESSION_BEGIN_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeBeginSession(codedOutputStream, str2, str3, time);
            }
        });
        writeFile(str, "BeginSession.json", new FileOutputStreamWriteAction() {

            /* renamed from: com.crashlytics.android.core.CrashlyticsController$18$1 */
            class C10971 extends HashMap<String, Object> {
                C10971() {
                    put("session_id", str2);
                    put("generator", str3);
                    put("started_at_seconds", Long.valueOf(time));
                }
            }

            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new C10971()).toString().getBytes());
            }
        });
    }

    private void writeSessionApp(String str) throws Exception {
        String c = this.idManager.c();
        String str2 = this.appData.versionCode;
        String str3 = this.appData.versionName;
        String b = this.idManager.b();
        final String str4 = c;
        final String str5 = str2;
        final String str6 = str3;
        final String str7 = b;
        final int id = DeliveryMechanism.determineFrom(this.appData.installerPackageName).getId();
        writeSessionPartFile(str, SESSION_APP_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionApp(codedOutputStream, str4, CrashlyticsController.this.appData.apiKey, str5, str6, str7, id, CrashlyticsController.this.unityVersion);
            }
        });
        writeFile(str, "SessionApp.json", new FileOutputStreamWriteAction() {

            /* renamed from: com.crashlytics.android.core.CrashlyticsController$20$1 */
            class C10981 extends HashMap<String, Object> {
                C10981() {
                    put("app_identifier", str4);
                    put("api_key", CrashlyticsController.this.appData.apiKey);
                    put("version_code", str5);
                    put("version_name", str6);
                    put("install_uuid", str7);
                    put("delivery_mechanism", Integer.valueOf(id));
                    put("unity_version", TextUtils.isEmpty(CrashlyticsController.this.unityVersion) ? "" : CrashlyticsController.this.unityVersion);
                }
            }

            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new C10981()).toString().getBytes());
            }
        });
    }

    private void writeSessionOS(String str) throws Exception {
        final boolean g = CommonUtils.g(this.crashlyticsCore.getContext());
        writeSessionPartFile(str, SESSION_OS_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionOS(codedOutputStream, VERSION.RELEASE, VERSION.CODENAME, g);
            }
        });
        writeFile(str, "SessionOS.json", new FileOutputStreamWriteAction() {

            /* renamed from: com.crashlytics.android.core.CrashlyticsController$22$1 */
            class C10991 extends HashMap<String, Object> {
                C10991() {
                    put("version", VERSION.RELEASE);
                    put("build_version", VERSION.CODENAME);
                    put("is_rooted", Boolean.valueOf(g));
                }
            }

            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new C10991()).toString().getBytes());
            }
        });
    }

    private void writeSessionDevice(String str) throws Exception {
        String str2 = str;
        Context context = this.crashlyticsCore.getContext();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int a = CommonUtils.a();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b = CommonUtils.b();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean f = CommonUtils.f(context);
        Map h = this.idManager.h();
        int h2 = CommonUtils.h(context);
        final int i = a;
        final int i2 = availableProcessors;
        final long j = b;
        final long j2 = blockCount;
        final boolean z = f;
        long j3 = b;
        AnonymousClass23 anonymousClass23 = r0;
        final Map map = h;
        int i3 = availableProcessors;
        String str3 = SESSION_DEVICE_TAG;
        final int i4 = h2;
        AnonymousClass23 anonymousClass232 = new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionDevice(codedOutputStream, i, Build.MODEL, i2, j, j2, z, map, i4, Build.MANUFACTURER, Build.PRODUCT);
            }
        };
        writeSessionPartFile(str2, str3, anonymousClass23);
        i2 = i3;
        j = j3;
        writeFile(str2, "SessionDevice.json", new FileOutputStreamWriteAction() {

            /* renamed from: com.crashlytics.android.core.CrashlyticsController$24$1 */
            class C11001 extends HashMap<String, Object> {
                C11001() {
                    put("arch", Integer.valueOf(i));
                    put("build_model", Build.MODEL);
                    put("available_processors", Integer.valueOf(i2));
                    put("total_ram", Long.valueOf(j));
                    put("disk_space", Long.valueOf(j2));
                    put("is_emulator", Boolean.valueOf(z));
                    put("ids", map);
                    put("state", Integer.valueOf(i4));
                    put("build_manufacturer", Build.MANUFACTURER);
                    put("build_product", Build.PRODUCT);
                }
            }

            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new C11001()).toString().getBytes());
            }
        });
    }

    private void writeSessionUser(String str) throws Exception {
        final UserMetaData userMetaData = getUserMetaData(str);
        writeSessionPartFile(str, SESSION_USER_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionUser(codedOutputStream, userMetaData.id, userMetaData.name, userMetaData.email);
            }
        });
    }

    private void writeSessionEvent(CodedOutputStream codedOutputStream, Date date, Thread thread, Throwable th, String str, boolean z) throws Exception {
        boolean z2;
        Thread[] threadArr;
        TreeMap attributes;
        Map treeMap;
        TrimmedThrowableData trimmedThrowableData = new TrimmedThrowableData(th, this.stackTraceTrimmingStrategy);
        Context context = this.crashlyticsCore.getContext();
        long time = date.getTime() / 1000;
        Float c = CommonUtils.c(context);
        int a = CommonUtils.a(context, this.devicePowerStateListener.isPowerConnected());
        boolean d = CommonUtils.d(context);
        int i = context.getResources().getConfiguration().orientation;
        long b = CommonUtils.b() - CommonUtils.b(context);
        long c2 = CommonUtils.c(Environment.getDataDirectory().getPath());
        RunningAppProcessInfo a2 = CommonUtils.a(context.getPackageName(), context);
        List linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.stacktrace;
        String str2 = this.appData.buildId;
        String c3 = this.idManager.c();
        int i2 = 0;
        if (z) {
            Map allStackTraces = Thread.getAllStackTraces();
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            for (Entry entry : allStackTraces.entrySet()) {
                threadArr2[i2] = (Thread) entry.getKey();
                linkedList.add(r0.stackTraceTrimmingStrategy.getTrimmedStackTrace((StackTraceElement[]) entry.getValue()));
                i2++;
            }
            z2 = true;
            threadArr = threadArr2;
        } else {
            z2 = true;
            threadArr = new Thread[0];
        }
        if (CommonUtils.a(context, COLLECT_CUSTOM_KEYS, z2)) {
            attributes = r0.crashlyticsCore.getAttributes();
            if (attributes != null && attributes.size() > z2) {
                treeMap = new TreeMap(attributes);
                SessionProtobufHelper.writeSessionEvent(codedOutputStream, time, str, trimmedThrowableData, thread, stackTraceElementArr, threadArr, linkedList, treeMap, r0.logFileManager, a2, i, c3, str2, c, a, d, b, c2);
            }
        }
        attributes = new TreeMap();
        treeMap = attributes;
        SessionProtobufHelper.writeSessionEvent(codedOutputStream, time, str, trimmedThrowableData, thread, stackTraceElementArr, threadArr, linkedList, treeMap, r0.logFileManager, a2, i, c3, str2, c, a, d, b, c2);
    }

    private void writeSessionPartsToSessionFile(File file, String str, int i) {
        StringBuilder stringBuilder;
        Logger h = C15608c.h();
        String str2 = CrashlyticsCore.TAG;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Collecting session parts for ID ");
        stringBuilder2.append(str);
        h.d(str2, stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str);
        stringBuilder3.append(SESSION_FATAL_TAG);
        File[] listFilesMatching = listFilesMatching(new FileNameContainsFilter(stringBuilder3.toString()));
        boolean z = listFilesMatching != null && listFilesMatching.length > 0;
        C15608c.h().d(CrashlyticsCore.TAG, String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z)}));
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(str);
        stringBuilder4.append(SESSION_NON_FATAL_TAG);
        File[] listFilesMatching2 = listFilesMatching(new FileNameContainsFilter(stringBuilder4.toString()));
        boolean z2 = listFilesMatching2 != null && listFilesMatching2.length > 0;
        C15608c.h().d(CrashlyticsCore.TAG, String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z2)}));
        if (!z) {
            if (!z2) {
                file = C15608c.h();
                i = CrashlyticsCore.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("No events present for session ID ");
                stringBuilder.append(str);
                file.d(i, stringBuilder.toString());
                file = C15608c.h();
                i = CrashlyticsCore.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Removing session part files for ID ");
                stringBuilder.append(str);
                file.d(i, stringBuilder.toString());
                deleteSessionPartFilesFor(str);
            }
        }
        synthesizeSessionFile(file, str, getTrimmedNonFatalFiles(str, listFilesMatching2, i), z ? listFilesMatching[0] : null);
        file = C15608c.h();
        i = CrashlyticsCore.TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Removing session part files for ID ");
        stringBuilder.append(str);
        file.d(i, stringBuilder.toString());
        deleteSessionPartFilesFor(str);
    }

    private void synthesizeSessionFile(File file, String str, File[] fileArr, File file2) {
        Closeable clsFileOutputStream;
        StringBuilder stringBuilder;
        boolean z = file2 != null;
        File fatalSessionFilesDir = z ? getFatalSessionFilesDir() : getNonFatalSessionFilesDir();
        if (!fatalSessionFilesDir.exists()) {
            fatalSessionFilesDir.mkdirs();
        }
        Flushable flushable = null;
        Flushable newInstance;
        try {
            clsFileOutputStream = new ClsFileOutputStream(fatalSessionFilesDir, str);
            try {
                newInstance = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                try {
                    Logger h = C15608c.h();
                    String str2 = CrashlyticsCore.TAG;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Collecting SessionStart data for session ID ");
                    stringBuilder2.append(str);
                    h.d(str2, stringBuilder2.toString());
                    writeToCosFromFile(newInstance, file);
                    newInstance.writeUInt64(4, new Date().getTime() / 1000);
                    newInstance.writeBool(5, z);
                    newInstance.writeUInt32(11, 1);
                    newInstance.writeEnum(12, 3);
                    writeInitialPartsTo(newInstance, str);
                    writeNonFatalEventsTo(newInstance, fileArr, str);
                    if (z) {
                        writeToCosFromFile(newInstance, file2);
                    }
                    CommonUtils.a(newInstance, "Error flushing session file stream");
                    CommonUtils.a(clsFileOutputStream, "Failed to close CLS file");
                } catch (Exception e) {
                    file = e;
                    flushable = newInstance;
                    try {
                        fileArr = C15608c.h();
                        file2 = CrashlyticsCore.TAG;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to write session file for session ID: ");
                        stringBuilder.append(str);
                        fileArr.e(file2, stringBuilder.toString(), file);
                        CommonUtils.a(flushable, "Error flushing session file stream");
                        closeWithoutRenamingOrLog(clsFileOutputStream);
                    } catch (Throwable th) {
                        file = th;
                        newInstance = flushable;
                        CommonUtils.a(newInstance, "Error flushing session file stream");
                        CommonUtils.a(clsFileOutputStream, "Failed to close CLS file");
                        throw file;
                    }
                } catch (Throwable th2) {
                    file = th2;
                    CommonUtils.a(newInstance, "Error flushing session file stream");
                    CommonUtils.a(clsFileOutputStream, "Failed to close CLS file");
                    throw file;
                }
            } catch (Exception e2) {
                file = e2;
                fileArr = C15608c.h();
                file2 = CrashlyticsCore.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to write session file for session ID: ");
                stringBuilder.append(str);
                fileArr.e(file2, stringBuilder.toString(), file);
                CommonUtils.a(flushable, "Error flushing session file stream");
                closeWithoutRenamingOrLog(clsFileOutputStream);
            }
        } catch (Exception e3) {
            file = e3;
            clsFileOutputStream = null;
            fileArr = C15608c.h();
            file2 = CrashlyticsCore.TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to write session file for session ID: ");
            stringBuilder.append(str);
            fileArr.e(file2, stringBuilder.toString(), file);
            CommonUtils.a(flushable, "Error flushing session file stream");
            closeWithoutRenamingOrLog(clsFileOutputStream);
        } catch (Throwable th3) {
            file = th3;
            newInstance = null;
            clsFileOutputStream = newInstance;
            CommonUtils.a(newInstance, "Error flushing session file stream");
            CommonUtils.a(clsFileOutputStream, "Failed to close CLS file");
            throw file;
        }
    }

    private static void writeNonFatalEventsTo(CodedOutputStream codedOutputStream, File[] fileArr, String str) {
        Arrays.sort(fileArr, CommonUtils.f48332a);
        for (File name : fileArr) {
            try {
                C15608c.h().d(CrashlyticsCore.TAG, String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, name.getName()}));
                writeToCosFromFile(codedOutputStream, name);
            } catch (Throwable e) {
                C15608c.h().e(CrashlyticsCore.TAG, "Error writting non-fatal to session.", e);
            }
        }
    }

    private void writeInitialPartsTo(CodedOutputStream codedOutputStream, String str) throws IOException {
        for (String str2 : INITIAL_SESSION_PART_TAGS) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append(ClsFileOutputStream.SESSION_FILE_EXTENSION);
            File[] listFilesMatching = listFilesMatching(new FileNameContainsFilter(stringBuilder.toString()));
            if (listFilesMatching.length == 0) {
                Logger h = C15608c.h();
                String str3 = CrashlyticsCore.TAG;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Can't find ");
                stringBuilder2.append(str2);
                stringBuilder2.append(" data for session ID ");
                stringBuilder2.append(str);
                h.e(str3, stringBuilder2.toString(), null);
            } else {
                Logger h2 = C15608c.h();
                String str4 = CrashlyticsCore.TAG;
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Collecting ");
                stringBuilder3.append(str2);
                stringBuilder3.append(" data for session ID ");
                stringBuilder3.append(str);
                h2.d(str4, stringBuilder3.toString());
                writeToCosFromFile(codedOutputStream, listFilesMatching[0]);
            }
        }
    }

    private static void writeToCosFromFile(CodedOutputStream codedOutputStream, File file) throws IOException {
        if (file.exists()) {
            Closeable fileInputStream;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    copyToCodedOutputStream(fileInputStream, codedOutputStream, (int) file.length());
                    CommonUtils.a(fileInputStream, "Failed to close file input stream.");
                    return;
                } catch (Throwable th) {
                    codedOutputStream = th;
                    CommonUtils.a(fileInputStream, "Failed to close file input stream.");
                    throw codedOutputStream;
                }
            } catch (Throwable th2) {
                codedOutputStream = th2;
                fileInputStream = null;
                CommonUtils.a(fileInputStream, "Failed to close file input stream.");
                throw codedOutputStream;
            }
        }
        codedOutputStream = C15608c.h();
        String str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tried to include a file that doesn't exist: ");
        stringBuilder.append(file.getName());
        codedOutputStream.e(str, stringBuilder.toString(), null);
    }

    private static void copyToCodedOutputStream(InputStream inputStream, CodedOutputStream codedOutputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = inputStream.read(bArr, i2, bArr.length - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        codedOutputStream.writeRawBytes(bArr);
    }

    private UserMetaData getUserMetaData(String str) {
        if (isHandlingException()) {
            return new UserMetaData(this.crashlyticsCore.getUserIdentifier(), this.crashlyticsCore.getUserName(), this.crashlyticsCore.getUserEmail());
        }
        return new MetaDataStore(getFilesDir()).readUserData(str);
    }

    boolean isHandlingException() {
        return this.crashHandler != null && this.crashHandler.isHandlingException();
    }

    File getFilesDir() {
        return this.fileStore.getFilesDir();
    }

    File getFatalSessionFilesDir() {
        return new File(getFilesDir(), FATAL_SESSION_DIR);
    }

    File getNonFatalSessionFilesDir() {
        return new File(getFilesDir(), NONFATAL_SESSION_DIR);
    }

    File getInvalidFilesDir() {
        return new File(getFilesDir(), INVALID_CLS_CACHE_DIR);
    }

    void registerAnalyticsEventListener(C15665p c15665p) {
        if (c15665p.f48509d.f48487e != null && this.appMeasurementEventListenerRegistrar.register() != null) {
            C15608c.h().d(CrashlyticsCore.TAG, "Registered Firebase Analytics event listener");
        }
    }

    void registerDevicePowerStateListener() {
        this.devicePowerStateListener.initialize();
    }

    private boolean shouldPromptUserBeforeSendingCrashReports(C15665p c15665p) {
        boolean z = false;
        if (c15665p == null) {
            return false;
        }
        if (c15665p.f48509d.f48483a != null && this.preferenceManager.shouldAlwaysSendReports() == null) {
            z = true;
        }
        return z;
    }

    private CreateReportSpiCall getCreateReportSpiCall(String str, String str2) {
        String b = CommonUtils.b(this.crashlyticsCore.getContext(), CRASHLYTICS_API_ENDPOINT);
        return new CompositeCreateReportSpiCall(new DefaultCreateReportSpiCall(this.crashlyticsCore, b, str, this.httpRequestFactory), new NativeCreateReportSpiCall(this.crashlyticsCore, b, str2, this.httpRequestFactory));
    }

    private void sendSessionReports(C15665p c15665p) {
        if (c15665p == null) {
            C15608c.h().w(CrashlyticsCore.TAG, "Cannot send reports. Settings are unavailable.");
            return;
        }
        Context context = this.crashlyticsCore.getContext();
        ReportUploader reportUploader = new ReportUploader(this.appData.apiKey, getCreateReportSpiCall(c15665p.f48506a.f48477d, c15665p.f48506a.f48478e), this.reportFilesProvider, this.handlingExceptionCheck);
        for (File sessionReport : listCompleteSessionFiles()) {
            this.backgroundWorker.submit(new SendReportRunnable(context, new SessionReport(sessionReport, SEND_AT_CRASHTIME_HEADER), reportUploader));
        }
    }

    private static void recordLoggedExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) C15608c.a(Answers.class);
        if (answers == null) {
            C15608c.h().d(CrashlyticsCore.TAG, "Answers is not available");
        } else {
            answers.onException(new C17331b(str, str2));
        }
    }

    private static void recordFatalExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) C15608c.a(Answers.class);
        if (answers == null) {
            C15608c.h().d(CrashlyticsCore.TAG, "Answers is not available");
        } else {
            answers.onException(new C17330a(str, str2));
        }
    }

    private void recordFatalFirebaseEvent(long j) {
        if (firebaseCrashExists()) {
            C15608c.h().d(CrashlyticsCore.TAG, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return;
        }
        if (this.firebaseAnalyticsLogger != null) {
            C15608c.h().d(CrashlyticsCore.TAG, "Logging Crashlytics event to Firebase");
            Bundle bundle = new Bundle();
            bundle.putInt(FIREBASE_REALTIME, 1);
            bundle.putInt(FIREBASE_CRASH_TYPE, 1);
            bundle.putLong(FIREBASE_TIMESTAMP, j);
            this.firebaseAnalyticsLogger.logEvent(FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS, FIREBASE_APPLICATION_EXCEPTION, bundle);
        } else {
            C15608c.h().d(CrashlyticsCore.TAG, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
        }
    }

    private boolean firebaseCrashExists() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = "com.google.firebase.crash.FirebaseCrash";	 Catch:{ ClassNotFoundException -> 0x0007 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0007 }
        r0 = 1;
        return r0;
    L_0x0007:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsController.firebaseCrashExists():boolean");
    }
}
