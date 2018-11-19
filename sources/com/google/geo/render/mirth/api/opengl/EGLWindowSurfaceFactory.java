package com.google.geo.render.mirth.api.opengl;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public interface EGLWindowSurfaceFactory {
    /* renamed from: a */
    EGLSurface m24452a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

    /* renamed from: a */
    void m24453a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
}
