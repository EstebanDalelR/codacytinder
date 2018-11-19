package com.google.android.m4b.maps.cf;

import android.opengl.GLSurfaceView.Renderer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.cf.v */
public class C6596v extends C5118o implements Renderer {
    /* renamed from: a */
    protected final C5111g f24746a;

    public void onDrawFrame(GL10 gl10) {
        this.f24746a.m22797a();
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        m22808a(i, i2);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f24746a.m22798b();
    }
}
