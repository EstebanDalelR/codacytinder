package com.mapbox.mapboxsdk.storage;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.tinder.domain.config.model.ProfileEditingConfig;
import p000a.p001a.C0001a;

public class FileSource {
    private static FileSource INSTANCE;
    private long nativePtr;

    public interface ResourceTransformCallback {
        String onURL(int i, String str);
    }

    private native void initialize(String str, String str2, AssetManager assetManager);

    public native void activate();

    public native void deactivate();

    protected native void finalize() throws Throwable;

    public native String getAccessToken();

    public native void setAccessToken(@NonNull String str);

    public native void setApiBaseUrl(String str);

    public native void setResourceTransform(ResourceTransformCallback resourceTransformCallback);

    public static synchronized FileSource getInstance(Context context) {
        synchronized (FileSource.class) {
            if (INSTANCE == null) {
                INSTANCE = new FileSource(getCachePath(context), context.getResources().getAssets());
            }
            context = INSTANCE;
        }
        return context;
    }

    public static String getCachePath(Context context) {
        boolean z;
        String absolutePath;
        try {
            z = context.getPackageManager().getApplicationInfo(context.getPackageName(), ProfileEditingConfig.DEFAULT_MAX_LENGTH).metaData.getBoolean(MapboxConstants.KEY_META_DATA_SET_STORAGE_EXTERNAL, false);
        } catch (Throwable e) {
            C0001a.c(e, "Failed to read the package metadata: ", new Object[0]);
            z = false;
            try {
                absolutePath = context.getExternalFilesDir(null).getAbsolutePath();
            } catch (Throwable e2) {
                C0001a.c(e2, "Failed to obtain the external storage path: ", new Object[0]);
            }
            return absolutePath != null ? context.getFilesDir().getAbsolutePath() : absolutePath;
        } catch (Throwable e22) {
            C0001a.c(e22, "Failed to read the storage key: ", new Object[0]);
            z = false;
            absolutePath = context.getExternalFilesDir(null).getAbsolutePath();
            if (absolutePath != null) {
            }
        }
        if (z && isExternalStorageReadable()) {
            absolutePath = context.getExternalFilesDir(null).getAbsolutePath();
            if (absolutePath != null) {
            }
        }
        absolutePath = null;
        if (absolutePath != null) {
        }
    }

    public static boolean isExternalStorageReadable() {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState)) {
            if (!"mounted_ro".equals(externalStorageState)) {
                C0001a.d("External storage was requested but it isn't readable. For API level < 18 make sure you've requested READ_EXTERNAL_STORAGE or WRITE_EXTERNAL_STORAGE permissions in your app Manifest (defaulting to internal storage).", new Object[0]);
                return false;
            }
        }
        return true;
    }

    private FileSource(String str, AssetManager assetManager) {
        initialize(Mapbox.getAccessToken(), str, assetManager);
    }
}
