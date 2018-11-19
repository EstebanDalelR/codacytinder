package com.mapbox.mapboxsdk.maps;

import android.os.Handler;
import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraIdleListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveCanceledListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveStartedListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class CameraChangeDispatcher implements OnCameraIdleListener, OnCameraMoveCanceledListener, OnCameraMoveListener, OnCameraMoveStartedListener {
    private final Handler handler = new Handler();
    private boolean idle = true;
    private int moveStartedReason;
    private final CopyOnWriteArrayList<OnCameraIdleListener> onCameraIdle = new CopyOnWriteArrayList();
    private OnCameraIdleListener onCameraIdleListener;
    private final Runnable onCameraIdleRunnable = new C58344();
    private final CopyOnWriteArrayList<OnCameraMoveListener> onCameraMove = new CopyOnWriteArrayList();
    private final Runnable onCameraMoveCancelRunnable = new C58333();
    private final CopyOnWriteArrayList<OnCameraMoveCanceledListener> onCameraMoveCanceled = new CopyOnWriteArrayList();
    private OnCameraMoveCanceledListener onCameraMoveCanceledListener;
    private OnCameraMoveListener onCameraMoveListener;
    private final Runnable onCameraMoveRunnable = new C58322();
    private final CopyOnWriteArrayList<OnCameraMoveStartedListener> onCameraMoveStarted = new CopyOnWriteArrayList();
    private OnCameraMoveStartedListener onCameraMoveStartedListener;
    private final Runnable onCameraMoveStartedRunnable = new C58311();

    /* renamed from: com.mapbox.mapboxsdk.maps.CameraChangeDispatcher$1 */
    class C58311 implements Runnable {
        C58311() {
        }

        public void run() {
            if (CameraChangeDispatcher.this.idle) {
                CameraChangeDispatcher.this.idle = false;
                if (CameraChangeDispatcher.this.onCameraMoveStartedListener != null) {
                    CameraChangeDispatcher.this.onCameraMoveStartedListener.onCameraMoveStarted(CameraChangeDispatcher.this.moveStartedReason);
                }
                if (!CameraChangeDispatcher.this.onCameraMoveStarted.isEmpty()) {
                    Iterator it = CameraChangeDispatcher.this.onCameraMoveStarted.iterator();
                    while (it.hasNext()) {
                        ((OnCameraMoveStartedListener) it.next()).onCameraMoveStarted(CameraChangeDispatcher.this.moveStartedReason);
                    }
                }
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.CameraChangeDispatcher$2 */
    class C58322 implements Runnable {
        C58322() {
        }

        public void run() {
            if (!(CameraChangeDispatcher.this.onCameraMoveListener == null || CameraChangeDispatcher.this.idle)) {
                CameraChangeDispatcher.this.onCameraMoveListener.onCameraMove();
            }
            if (!CameraChangeDispatcher.this.onCameraMove.isEmpty() && !CameraChangeDispatcher.this.idle) {
                Iterator it = CameraChangeDispatcher.this.onCameraMove.iterator();
                while (it.hasNext()) {
                    ((OnCameraMoveListener) it.next()).onCameraMove();
                }
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.CameraChangeDispatcher$3 */
    class C58333 implements Runnable {
        C58333() {
        }

        public void run() {
            if (!(CameraChangeDispatcher.this.onCameraMoveCanceledListener == null || CameraChangeDispatcher.this.idle)) {
                CameraChangeDispatcher.this.onCameraMoveCanceledListener.onCameraMoveCanceled();
            }
            if (!CameraChangeDispatcher.this.onCameraMoveCanceled.isEmpty() && !CameraChangeDispatcher.this.idle) {
                Iterator it = CameraChangeDispatcher.this.onCameraMoveCanceled.iterator();
                while (it.hasNext()) {
                    ((OnCameraMoveCanceledListener) it.next()).onCameraMoveCanceled();
                }
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.CameraChangeDispatcher$4 */
    class C58344 implements Runnable {
        C58344() {
        }

        public void run() {
            if (!CameraChangeDispatcher.this.idle) {
                CameraChangeDispatcher.this.idle = true;
                if (CameraChangeDispatcher.this.onCameraIdleListener != null) {
                    CameraChangeDispatcher.this.onCameraIdleListener.onCameraIdle();
                }
                if (!CameraChangeDispatcher.this.onCameraIdle.isEmpty()) {
                    Iterator it = CameraChangeDispatcher.this.onCameraIdle.iterator();
                    while (it.hasNext()) {
                        ((OnCameraIdleListener) it.next()).onCameraIdle();
                    }
                }
            }
        }
    }

    CameraChangeDispatcher() {
    }

    @Deprecated
    void setOnCameraMoveStartedListener(OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.onCameraMoveStartedListener = onCameraMoveStartedListener;
    }

    @Deprecated
    void setOnCameraMoveCanceledListener(OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.onCameraMoveCanceledListener = onCameraMoveCanceledListener;
    }

    @Deprecated
    void setOnCameraMoveListener(OnCameraMoveListener onCameraMoveListener) {
        this.onCameraMoveListener = onCameraMoveListener;
    }

    @Deprecated
    void setOnCameraIdleListener(OnCameraIdleListener onCameraIdleListener) {
        this.onCameraIdleListener = onCameraIdleListener;
    }

    public void onCameraMoveStarted(int i) {
        this.moveStartedReason = i;
        this.handler.post(this.onCameraMoveStartedRunnable);
    }

    public void onCameraMove() {
        this.handler.post(this.onCameraMoveRunnable);
    }

    public void onCameraMoveCanceled() {
        this.handler.post(this.onCameraMoveCancelRunnable);
    }

    public void onCameraIdle() {
        this.handler.post(this.onCameraIdleRunnable);
    }

    void addOnCameraIdleListener(@NonNull OnCameraIdleListener onCameraIdleListener) {
        this.onCameraIdle.add(onCameraIdleListener);
    }

    void removeOnCameraIdleListener(@NonNull OnCameraIdleListener onCameraIdleListener) {
        if (this.onCameraIdle.contains(onCameraIdleListener)) {
            this.onCameraIdle.remove(onCameraIdleListener);
        }
    }

    void addOnCameraMoveCancelListener(OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.onCameraMoveCanceled.add(onCameraMoveCanceledListener);
    }

    void removeOnCameraMoveCancelListener(OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        if (this.onCameraMoveCanceled.contains(onCameraMoveCanceledListener)) {
            this.onCameraMoveCanceled.remove(onCameraMoveCanceledListener);
        }
    }

    void addOnCameraMoveStartedListener(OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.onCameraMoveStarted.add(onCameraMoveStartedListener);
    }

    void removeOnCameraMoveStartedListener(OnCameraMoveStartedListener onCameraMoveStartedListener) {
        if (this.onCameraMoveStarted.contains(onCameraMoveStartedListener)) {
            this.onCameraMoveStarted.remove(onCameraMoveStartedListener);
        }
    }

    void addOnCameraMoveListener(OnCameraMoveListener onCameraMoveListener) {
        this.onCameraMove.add(onCameraMoveListener);
    }

    void removeOnCameraMoveListener(OnCameraMoveListener onCameraMoveListener) {
        if (this.onCameraMove.contains(onCameraMoveListener)) {
            this.onCameraMove.remove(onCameraMoveListener);
        }
    }
}
