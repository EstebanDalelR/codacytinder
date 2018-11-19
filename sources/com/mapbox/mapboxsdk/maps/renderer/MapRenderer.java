package com.mapbox.mapboxsdk.maps.renderer;

import android.content.Context;
import android.support.annotation.CallSuper;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnFpsChangedListener;
import com.mapbox.mapboxsdk.storage.FileSource;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public abstract class MapRenderer implements MapRendererScheduler {
    private long frames;
    private long nativePtr = 0;
    private OnFpsChangedListener onFpsChangedListener;
    private long timeElapsed;

    private native void nativeInitialize(MapRenderer mapRenderer, FileSource fileSource, float f, String str, String str2);

    private native void nativeOnSurfaceChanged(int i, int i2);

    private native void nativeOnSurfaceCreated();

    private native void nativeRender();

    @CallSuper
    protected native void finalize() throws Throwable;

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public MapRenderer(Context context, String str) {
        nativeInitialize(this, FileSource.getInstance(context), context.getResources().getDisplayMetrics().density, context.getCacheDir().getAbsolutePath(), str);
    }

    public void setOnFpsChangedListener(OnFpsChangedListener onFpsChangedListener) {
        this.onFpsChangedListener = onFpsChangedListener;
    }

    @CallSuper
    protected void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        nativeOnSurfaceCreated();
    }

    @CallSuper
    protected void onSurfaceChanged(GL10 gl10, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("fbWidth cannot be negative.");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("fbHeight cannot be negative.");
        } else if (i > 65535) {
            throw new IllegalArgumentException("fbWidth cannot be greater than 65535.");
        } else if (i2 > 65535) {
            throw new IllegalArgumentException("fbHeight cannot be greater than 65535.");
        } else {
            gl10.glViewport(0, 0, i, i2);
            nativeOnSurfaceChanged(i, i2);
        }
    }

    @CallSuper
    protected void onDrawFrame(GL10 gl10) {
        nativeRender();
        if (this.onFpsChangedListener != null) {
            updateFps();
        }
    }

    @CallSuper
    void queueEvent(MapRendererRunnable mapRendererRunnable) {
        queueEvent(mapRendererRunnable);
    }

    private void updateFps() {
        this.frames++;
        long nanoTime = System.nanoTime();
        if (nanoTime - this.timeElapsed >= 1) {
            this.onFpsChangedListener.onFpsChanged(((double) this.frames) / (((double) (nanoTime - this.timeElapsed)) / 1.0E9d));
            this.timeElapsed = nanoTime;
            this.frames = 0;
        }
    }
}
