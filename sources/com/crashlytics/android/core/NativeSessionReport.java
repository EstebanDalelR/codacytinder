package com.crashlytics.android.core;

import com.crashlytics.android.core.Report.Type;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.Logger;
import java.io.File;
import java.util.Map;

class NativeSessionReport implements Report {
    private final File reportDirectory;

    public Map<String, String> getCustomHeaders() {
        return null;
    }

    public File getFile() {
        return null;
    }

    public String getFileName() {
        return null;
    }

    public NativeSessionReport(File file) {
        this.reportDirectory = file;
    }

    public void remove() {
        for (File file : getFiles()) {
            Logger h = C15608c.h();
            String str = CrashlyticsCore.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Removing native report file at ");
            stringBuilder.append(file.getPath());
            h.d(str, stringBuilder.toString());
            file.delete();
        }
        Logger h2 = C15608c.h();
        String str2 = CrashlyticsCore.TAG;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Removing native report directory at ");
        stringBuilder2.append(this.reportDirectory);
        h2.d(str2, stringBuilder2.toString());
        this.reportDirectory.delete();
    }

    public String getIdentifier() {
        return this.reportDirectory.getName();
    }

    public File[] getFiles() {
        return this.reportDirectory.listFiles();
    }

    public Type getType() {
        return Type.NATIVE;
    }
}
