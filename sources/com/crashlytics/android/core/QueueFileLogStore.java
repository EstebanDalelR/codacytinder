package com.crashlytics.android.core;

import com.tinder.api.ManagerWebServices;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import io.fabric.sdk.android.services.common.QueueFile.ElementReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

class QueueFileLogStore implements FileLogStore {
    private QueueFile logFile;
    private final int maxLogSize;
    private final File workingFile;

    public class LogBytes {
        public final byte[] bytes;
        public final int offset;

        public LogBytes(byte[] bArr, int i) {
            this.bytes = bArr;
            this.offset = i;
        }
    }

    public QueueFileLogStore(File file, int i) {
        this.workingFile = file;
        this.maxLogSize = i;
    }

    public void writeToLog(long j, String str) {
        openLogFile();
        doWriteToLog(j, str);
    }

    public ByteString getLogAsByteString() {
        LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        return ByteString.copyFrom(logBytes.bytes, 0, logBytes.offset);
    }

    public byte[] getLogAsBytes() {
        LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        return logBytes.bytes;
    }

    private LogBytes getLogBytes() {
        if (!this.workingFile.exists()) {
            return null;
        }
        openLogFile();
        if (this.logFile == null) {
            return null;
        }
        final int[] iArr = new int[]{0};
        final byte[] bArr = new byte[this.logFile.a()];
        try {
            this.logFile.a(new ElementReader() {
                public void read(InputStream inputStream, int i) throws IOException {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr = iArr;
                        iArr[0] = iArr[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (Throwable e) {
            C15608c.h().e(CrashlyticsCore.TAG, "A problem occurred while reading the Crashlytics log file.", e);
        }
        return new LogBytes(bArr, iArr[0]);
    }

    public void closeLogFile() {
        CommonUtils.a(this.logFile, "There was a problem closing the Crashlytics log file.");
        this.logFile = null;
    }

    public void deleteLogFile() {
        closeLogFile();
        this.workingFile.delete();
    }

    private void openLogFile() {
        if (this.logFile == null) {
            try {
                this.logFile = new QueueFile(this.workingFile);
            } catch (Throwable e) {
                Logger h = C15608c.h();
                String str = CrashlyticsCore.TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not open log file: ");
                stringBuilder.append(this.workingFile);
                h.e(str, stringBuilder.toString(), e);
            }
        }
    }

    private void doWriteToLog(long j, String str) {
        if (this.logFile != null) {
            if (str == null) {
                str = ManagerWebServices.NULL_STRING_VALUE;
            }
            try {
                int i = this.maxLogSize / 4;
                if (str.length() > i) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("...");
                    stringBuilder.append(str.substring(str.length() - i));
                    str = stringBuilder.toString();
                }
                str = str.replaceAll("\r", " ").replaceAll("\n", " ");
                this.logFile.a(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str}).getBytes("UTF-8"));
                while (this.logFile.b() == null && this.logFile.a() > this.maxLogSize) {
                    this.logFile.c();
                }
            } catch (long j2) {
                C15608c.h().e(CrashlyticsCore.TAG, "There was a problem writing to the Crashlytics log.", j2);
            }
        }
    }
}
