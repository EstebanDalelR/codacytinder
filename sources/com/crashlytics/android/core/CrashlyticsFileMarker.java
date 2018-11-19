package com.crashlytics.android.core;

import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.persistence.FileStore;
import java.io.File;

class CrashlyticsFileMarker {
    private final FileStore fileStore;
    private final String markerName;

    public CrashlyticsFileMarker(String str, FileStore fileStore) {
        this.markerName = str;
        this.fileStore = fileStore;
    }

    public boolean create() {
        try {
            return getMarkerFile().createNewFile();
        } catch (Throwable e) {
            Logger h = C15608c.h();
            String str = CrashlyticsCore.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error creating marker: ");
            stringBuilder.append(this.markerName);
            h.e(str, stringBuilder.toString(), e);
            return false;
        }
    }

    public boolean isPresent() {
        return getMarkerFile().exists();
    }

    public boolean remove() {
        return getMarkerFile().delete();
    }

    private File getMarkerFile() {
        return new File(this.fileStore.getFilesDir(), this.markerName);
    }
}
