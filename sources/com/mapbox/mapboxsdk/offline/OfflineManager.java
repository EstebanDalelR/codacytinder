package com.mapbox.mapboxsdk.offline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.C5812R;
import com.mapbox.mapboxsdk.LibraryLoader;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.net.ConnectivityReceiver;
import com.mapbox.mapboxsdk.storage.FileSource;
import java.io.File;
import p000a.p001a.C0001a;

public class OfflineManager {
    @SuppressLint({"StaticFieldLeak"})
    private static OfflineManager instance;
    private Context context;
    private final FileSource fileSource = FileSource.getInstance(this.context);
    private Handler handler;
    private long nativePtr;

    public interface CreateOfflineRegionCallback {
        void onCreate(OfflineRegion offlineRegion);

        void onError(String str);
    }

    public interface ListOfflineRegionsCallback {
        void onError(String str);

        void onList(OfflineRegion[] offlineRegionArr);
    }

    private native void createOfflineRegion(FileSource fileSource, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr, CreateOfflineRegionCallback createOfflineRegionCallback);

    private native void initialize(FileSource fileSource);

    private native void listOfflineRegions(FileSource fileSource, ListOfflineRegionsCallback listOfflineRegionsCallback);

    protected native void finalize() throws Throwable;

    public native void setOfflineMapboxTileCountLimit(long j);

    static {
        LibraryLoader.load();
    }

    private OfflineManager(Context context) {
        this.context = context.getApplicationContext();
        initialize(this.fileSource);
        deleteAmbientDatabase(this.context);
    }

    private void deleteAmbientDatabase(final Context context) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(context.getCacheDir().getAbsolutePath());
                    stringBuilder.append(File.separator);
                    stringBuilder.append("mbgl-cache.db");
                    File file = new File(stringBuilder.toString());
                    if (file.exists()) {
                        file.delete();
                        C0001a.b("Old ambient cache database deleted to save space: %s", new Object[]{r1});
                    }
                } catch (Throwable e) {
                    C0001a.c(e, "Failed to delete old ambient cache database: ", new Object[0]);
                }
            }
        }).start();
    }

    public static synchronized OfflineManager getInstance(Context context) {
        synchronized (OfflineManager.class) {
            if (instance == null) {
                instance = new OfflineManager(context);
            }
            context = instance;
        }
        return context;
    }

    private Handler getHandler() {
        if (this.handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        }
        return this.handler;
    }

    public void listOfflineRegions(@NonNull final ListOfflineRegionsCallback listOfflineRegionsCallback) {
        this.fileSource.activate();
        listOfflineRegions(this.fileSource, new ListOfflineRegionsCallback() {
            public void onList(final OfflineRegion[] offlineRegionArr) {
                OfflineManager.this.getHandler().post(new Runnable() {
                    public void run() {
                        OfflineManager.this.fileSource.deactivate();
                        listOfflineRegionsCallback.onList(offlineRegionArr);
                    }
                });
            }

            public void onError(final String str) {
                OfflineManager.this.getHandler().post(new Runnable() {
                    public void run() {
                        OfflineManager.this.fileSource.deactivate();
                        listOfflineRegionsCallback.onError(str);
                    }
                });
            }
        });
    }

    public void createOfflineRegion(@NonNull OfflineRegionDefinition offlineRegionDefinition, @NonNull byte[] bArr, final CreateOfflineRegionCallback createOfflineRegionCallback) {
        if (isValidOfflineRegionDefinition(offlineRegionDefinition)) {
            ConnectivityReceiver.instance(this.context).activate();
            FileSource.getInstance(this.context).activate();
            createOfflineRegion(this.fileSource, offlineRegionDefinition, bArr, new CreateOfflineRegionCallback() {
                public void onCreate(final OfflineRegion offlineRegion) {
                    OfflineManager.this.getHandler().post(new Runnable() {
                        public void run() {
                            ConnectivityReceiver.instance(OfflineManager.this.context).deactivate();
                            FileSource.getInstance(OfflineManager.this.context).deactivate();
                            createOfflineRegionCallback.onCreate(offlineRegion);
                        }
                    });
                }

                public void onError(final String str) {
                    OfflineManager.this.getHandler().post(new Runnable() {
                        public void run() {
                            ConnectivityReceiver.instance(OfflineManager.this.context).deactivate();
                            FileSource.getInstance(OfflineManager.this.context).deactivate();
                            createOfflineRegionCallback.onError(str);
                        }
                    });
                }
            });
            return;
        }
        createOfflineRegionCallback.onError(String.format(this.context.getString(C5812R.string.mapbox_offline_error_region_definition_invalid), new Object[]{offlineRegionDefinition.getBounds()}));
    }

    private boolean isValidOfflineRegionDefinition(OfflineRegionDefinition offlineRegionDefinition) {
        return LatLngBounds.world().contains(offlineRegionDefinition.getBounds());
    }
}
