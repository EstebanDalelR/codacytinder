package com.crashlytics.android.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

class ClsFileOutputStream extends FileOutputStream {
    public static final String IN_PROGRESS_SESSION_FILE_EXTENSION = ".cls_temp";
    public static final String SESSION_FILE_EXTENSION = ".cls";
    public static final FilenameFilter TEMP_FILENAME_FILTER = new C10891();
    private boolean closed;
    private File complete;
    private File inProgress;
    private final String root;

    /* renamed from: com.crashlytics.android.core.ClsFileOutputStream$1 */
    static class C10891 implements FilenameFilter {
        C10891() {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION);
        }
    }

    public ClsFileOutputStream(String str, String str2) throws FileNotFoundException {
        this(new File(str), str2);
    }

    public ClsFileOutputStream(File file, String str) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(IN_PROGRESS_SESSION_FILE_EXTENSION);
        super(new File(file, stringBuilder.toString()));
        this.closed = false;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(file);
        stringBuilder2.append(File.separator);
        stringBuilder2.append(str);
        this.root = stringBuilder2.toString();
        str = new StringBuilder();
        str.append(this.root);
        str.append(IN_PROGRESS_SESSION_FILE_EXTENSION);
        this.inProgress = new File(str.toString());
    }

    public synchronized void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            super.flush();
            super.close();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.root);
            stringBuilder.append(SESSION_FILE_EXTENSION);
            File file = new File(stringBuilder.toString());
            if (this.inProgress.renameTo(file)) {
                this.inProgress = null;
                this.complete = file;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.inProgress.exists()) {
                str = " (source does not exist)";
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Could not rename temp file: ");
            stringBuilder2.append(this.inProgress);
            stringBuilder2.append(" -> ");
            stringBuilder2.append(file);
            stringBuilder2.append(str);
            throw new IOException(stringBuilder2.toString());
        }
    }

    public void closeInProgressStream() throws IOException {
        if (!this.closed) {
            this.closed = true;
            super.flush();
            super.close();
        }
    }

    public File getCompleteFile() {
        return this.complete;
    }

    public File getInProgressFile() {
        return this.inProgress;
    }
}
