package com.mapbox.mapboxsdk.maps.renderer.glsurfaceview;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import com.mapbox.mapboxsdk.maps.renderer.egl.EGLConfigChooser;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class GLSurfaceViewMapRenderer extends MapRenderer implements Renderer {
    private final GLSurfaceView glSurfaceView;

    public GLSurfaceViewMapRenderer(Context context, GLSurfaceView gLSurfaceView, String str) {
        super(context, str);
        this.glSurfaceView = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setEGLConfigChooser(new EGLConfigChooser());
        gLSurfaceView.setRenderer(this);
        gLSurfaceView.setRenderMode(null);
    }

    public void onStop() {
        this.glSurfaceView.onPause();
    }

    public void onStart() {
        this.glSurfaceView.onResume();
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        super.onSurfaceCreated(gl10, eGLConfig);
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        super.onSurfaceChanged(gl10, i, i2);
    }

    public void onDrawFrame(GL10 gl10) {
        super.onDrawFrame(gl10);
    }

    public void requestRender() {
        this.glSurfaceView.requestRender();
    }

    public void queueEvent(Runnable runnable) {
        this.glSurfaceView.queueEvent(runnable);
    }
}
