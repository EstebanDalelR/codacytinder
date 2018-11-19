package com.mapbox.mapboxsdk.maps.renderer.textureview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.TextureView;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class TextureViewMapRenderer extends MapRenderer {
    private TextureViewRenderThread renderThread;
    private boolean translucentSurface;

    public TextureViewMapRenderer(@NonNull Context context, @NonNull TextureView textureView, String str, boolean z) {
        super(context, str);
        this.translucentSurface = z;
        this.renderThread = new TextureViewRenderThread(textureView, this);
        this.renderThread.start();
    }

    protected void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        super.onSurfaceCreated(gl10, eGLConfig);
    }

    protected void onSurfaceChanged(GL10 gl10, int i, int i2) {
        super.onSurfaceChanged(gl10, i, i2);
    }

    protected void onDrawFrame(GL10 gl10) {
        super.onDrawFrame(gl10);
    }

    public void requestRender() {
        this.renderThread.requestRender();
    }

    public void queueEvent(Runnable runnable) {
        this.renderThread.queueEvent(runnable);
    }

    public void onStop() {
        this.renderThread.onPause();
    }

    public void onStart() {
        this.renderThread.onResume();
    }

    public void onDestroy() {
        this.renderThread.onDestroy();
    }

    public boolean isTranslucentSurface() {
        return this.translucentSurface;
    }
}
