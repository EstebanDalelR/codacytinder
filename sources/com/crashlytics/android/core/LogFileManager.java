package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.Set;

class LogFileManager {
    private static final String COLLECT_CUSTOM_LOGS = "com.crashlytics.CollectCustomLogs";
    private static final String LOGFILE_EXT = ".temp";
    private static final String LOGFILE_PREFIX = "crashlytics-userlog-";
    static final int MAX_LOG_SIZE = 65536;
    private static final NoopLogStore NOOP_LOG_STORE = new NoopLogStore();
    private final Context context;
    private FileLogStore currentLog;
    private final DirectoryProvider directoryProvider;

    public interface DirectoryProvider {
        File getLogFileDir();
    }

    private static final class NoopLogStore implements FileLogStore {
        public void closeLogFile() {
        }

        public void deleteLogFile() {
        }

        public ByteString getLogAsByteString() {
            return null;
        }

        public byte[] getLogAsBytes() {
            return null;
        }

        public void writeToLog(long j, String str) {
        }

        private NoopLogStore() {
        }
    }

    LogFileManager(Context context, DirectoryProvider directoryProvider) {
        this(context, directoryProvider, null);
    }

    LogFileManager(Context context, DirectoryProvider directoryProvider, String str) {
        this.context = context;
        this.directoryProvider = directoryProvider;
        this.currentLog = NOOP_LOG_STORE;
        setCurrentSession(str);
    }

    final void setCurrentSession(String str) {
        this.currentLog.closeLogFile();
        this.currentLog = NOOP_LOG_STORE;
        if (str != null) {
            if (CommonUtils.a(this.context, COLLECT_CUSTOM_LOGS, true)) {
                setLogFile(getWorkingFileForSession(str), MAX_LOG_SIZE);
            } else {
                C15608c.h().d(CrashlyticsCore.TAG, "Preferences requested no custom logs. Aborting log file creation.");
            }
        }
    }

    void writeToLog(long j, String str) {
        this.currentLog.writeToLog(j, str);
    }

    ByteString getByteStringForLog() {
        return this.currentLog.getLogAsByteString();
    }

    byte[] getBytesForLog() {
        return this.currentLog.getLogAsBytes();
    }

    void clearLog() {
        this.currentLog.deleteLogFile();
    }

    void discardOldLogFiles(Set<String> set) {
        File[] listFiles = this.directoryProvider.getLogFileDir().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(getSessionIdForFile(file))) {
                    file.delete();
                }
            }
        }
    }

    void setLogFile(File file, int i) {
        this.currentLog = new QueueFileLogStore(file, i);
    }

    private File getWorkingFileForSession(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(LOGFILE_PREFIX);
        stringBuilder.append(str);
        stringBuilder.append(LOGFILE_EXT);
        return new File(this.directoryProvider.getLogFileDir(), stringBuilder.toString());
    }

    private String getSessionIdForFile(File file) {
        file = file.getName();
        int lastIndexOf = file.lastIndexOf(LOGFILE_EXT);
        if (lastIndexOf == -1) {
            return file;
        }
        return file.substring(LOGFILE_PREFIX.length(), lastIndexOf);
    }
}
