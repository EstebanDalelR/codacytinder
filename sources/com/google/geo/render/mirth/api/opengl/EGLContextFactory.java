package com.google.geo.render.mirth.api.opengl;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

public interface EGLContextFactory {
    /* renamed from: a */
    EGLContext m24450a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

    /* renamed from: a */
    void m24451a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
}
