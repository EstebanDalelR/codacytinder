package com.mapbox.mapboxsdk.offline;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.mapbox.mapboxsdk.LibraryLoader;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.storage.FileSource;

public class OfflineRegion {
    public static final int STATE_ACTIVE = 1;
    public static final int STATE_INACTIVE = 0;
    private OfflineRegionDefinition definition;
    private boolean deliverInactiveMessages = false;
    private FileSource fileSource;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private long id;
    private boolean isDeleted;
    private byte[] metadata;
    private long nativePtr;
    private int state = 0;

    public interface OfflineRegionDeleteCallback {
        void onDelete();

        void onError(String str);
    }

    public interface OfflineRegionObserver {
        void mapboxTileCountLimitExceeded(long j);

        void onError(OfflineRegionError offlineRegionError);

        void onStatusChanged(OfflineRegionStatus offlineRegionStatus);
    }

    public interface OfflineRegionStatusCallback {
        void onError(String str);

        void onStatus(OfflineRegionStatus offlineRegionStatus);
    }

    public interface OfflineRegionUpdateMetadataCallback {
        void onError(String str);

        void onUpdate(byte[] bArr);
    }

    private native void deleteOfflineRegion(OfflineRegionDeleteCallback offlineRegionDeleteCallback);

    private native void getOfflineRegionStatus(OfflineRegionStatusCallback offlineRegionStatusCallback);

    private native void initialize(long j, FileSource fileSource);

    private native void setOfflineRegionDownloadState(int i);

    private native void setOfflineRegionObserver(OfflineRegionObserver offlineRegionObserver);

    private native void updateOfflineRegionMetadata(byte[] bArr, OfflineRegionUpdateMetadataCallback offlineRegionUpdateMetadataCallback);

    protected native void finalize();

    static {
        LibraryLoader.load();
    }

    public boolean isDeliveringInactiveMessages() {
        return this.deliverInactiveMessages;
    }

    public void setDeliverInactiveMessages(boolean z) {
        this.deliverInactiveMessages = z;
    }

    private boolean deliverMessages() {
        if (this.state == 1) {
            return true;
        }
        return isDeliveringInactiveMessages();
    }

    private OfflineRegion(long j, FileSource fileSource, long j2, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr) {
        this.fileSource = fileSource;
        this.id = j2;
        this.definition = offlineRegionDefinition;
        this.metadata = bArr;
        initialize(j, fileSource);
    }

    public long getID() {
        return this.id;
    }

    public OfflineRegionDefinition getDefinition() {
        return this.definition;
    }

    public byte[] getMetadata() {
        return this.metadata;
    }

    public void setObserver(@Nullable final OfflineRegionObserver offlineRegionObserver) {
        setOfflineRegionObserver(new OfflineRegionObserver() {
            public void onStatusChanged(final OfflineRegionStatus offlineRegionStatus) {
                if (OfflineRegion.this.deliverMessages()) {
                    OfflineRegion.this.handler.post(new Runnable() {
                        public void run() {
                            if (offlineRegionObserver != null) {
                                offlineRegionObserver.onStatusChanged(offlineRegionStatus);
                            }
                        }
                    });
                }
            }

            public void onError(final OfflineRegionError offlineRegionError) {
                if (OfflineRegion.this.deliverMessages()) {
                    OfflineRegion.this.handler.post(new Runnable() {
                        public void run() {
                            if (offlineRegionObserver != null) {
                                offlineRegionObserver.onError(offlineRegionError);
                            }
                        }
                    });
                }
            }

            public void mapboxTileCountLimitExceeded(final long j) {
                if (OfflineRegion.this.deliverMessages()) {
                    OfflineRegion.this.handler.post(new Runnable() {
                        public void run() {
                            if (offlineRegionObserver != null) {
                                offlineRegionObserver.mapboxTileCountLimitExceeded(j);
                            }
                        }
                    });
                }
            }
        });
    }

    public void setDownloadState(int i) {
        if (i == 1) {
            this.fileSource.activate();
        } else {
            this.fileSource.deactivate();
        }
        this.state = i;
        setOfflineRegionDownloadState(i);
    }

    public void getStatus(@NonNull final OfflineRegionStatusCallback offlineRegionStatusCallback) {
        FileSource.getInstance(Mapbox.getApplicationContext()).activate();
        getOfflineRegionStatus(new OfflineRegionStatusCallback() {
            public void onStatus(final OfflineRegionStatus offlineRegionStatus) {
                OfflineRegion.this.handler.post(new Runnable() {
                    public void run() {
                        offlineRegionStatusCallback.onStatus(offlineRegionStatus);
                        FileSource.getInstance(Mapbox.getApplicationContext()).deactivate();
                    }
                });
            }

            public void onError(final String str) {
                OfflineRegion.this.handler.post(new Runnable() {
                    public void run() {
                        offlineRegionStatusCallback.onError(str);
                        FileSource.getInstance(Mapbox.getApplicationContext()).deactivate();
                    }
                });
            }
        });
    }

    public void delete(@NonNull final OfflineRegionDeleteCallback offlineRegionDeleteCallback) {
        if (!this.isDeleted) {
            this.isDeleted = true;
            FileSource.getInstance(Mapbox.getApplicationContext()).activate();
            deleteOfflineRegion(new OfflineRegionDeleteCallback() {

                /* renamed from: com.mapbox.mapboxsdk.offline.OfflineRegion$3$1 */
                class C58591 implements Runnable {
                    C58591() {
                    }

                    public void run() {
                        offlineRegionDeleteCallback.onDelete();
                        FileSource.getInstance(Mapbox.getApplicationContext()).deactivate();
                        OfflineRegion.this.finalize();
                    }
                }

                public void onDelete() {
                    OfflineRegion.this.handler.post(new C58591());
                }

                public void onError(final String str) {
                    OfflineRegion.this.handler.post(new Runnable() {
                        public void run() {
                            OfflineRegion.this.isDeleted = false;
                            FileSource.getInstance(Mapbox.getApplicationContext()).deactivate();
                            offlineRegionDeleteCallback.onError(str);
                        }
                    });
                }
            });
        }
    }

    public void updateMetadata(@NonNull byte[] bArr, @NonNull final OfflineRegionUpdateMetadataCallback offlineRegionUpdateMetadataCallback) {
        updateOfflineRegionMetadata(bArr, new OfflineRegionUpdateMetadataCallback() {
            public void onUpdate(final byte[] bArr) {
                OfflineRegion.this.handler.post(new Runnable() {
                    public void run() {
                        OfflineRegion.this.metadata = bArr;
                        offlineRegionUpdateMetadataCallback.onUpdate(bArr);
                    }
                });
            }

            public void onError(final String str) {
                OfflineRegion.this.handler.post(new Runnable() {
                    public void run() {
                        offlineRegionUpdateMetadataCallback.onError(str);
                    }
                });
            }
        });
    }
}
