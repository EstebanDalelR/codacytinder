package com.google.android.m4b.maps.bv;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL10Ext;
import javax.microedition.khronos.opengles.GL11;
import javax.microedition.khronos.opengles.GL11Ext;

/* renamed from: com.google.android.m4b.maps.bv.c */
final class C4923c implements GL, GL10, GL10Ext, GL11, GL11Ext {
    /* renamed from: a */
    private final GL10 f18133a;
    /* renamed from: b */
    private final GL10Ext f18134b;
    /* renamed from: c */
    private final GL11 f18135c;
    /* renamed from: d */
    private final GL11Ext f18136d;
    /* renamed from: e */
    private int f18137e;
    /* renamed from: f */
    private C4940o f18138f;
    /* renamed from: g */
    private final C4940o f18139g;
    /* renamed from: h */
    private final C4940o f18140h;
    /* renamed from: i */
    private final C4940o f18141i;

    public C4923c(GL gl) {
        this.f18133a = (GL10) gl;
        GL11Ext gL11Ext = null;
        this.f18134b = gl instanceof GL10Ext ? (GL10Ext) gl : null;
        this.f18135c = gl instanceof GL11 ? (GL11) gl : null;
        if (gl instanceof GL11Ext) {
            gL11Ext = (GL11Ext) gl;
        }
        this.f18136d = gL11Ext;
        this.f18139g = new C4940o();
        this.f18141i = new C4940o();
        this.f18140h = new C4940o();
        this.f18138f = this.f18139g;
        this.f18137e = 5888;
    }

    public final void glActiveTexture(int i) {
        this.f18133a.glActiveTexture(i);
    }

    public final void glAlphaFunc(int i, float f) {
        this.f18133a.glAlphaFunc(i, f);
    }

    public final void glAlphaFuncx(int i, int i2) {
        this.f18133a.glAlphaFuncx(i, i2);
    }

    public final void glBindTexture(int i, int i2) {
        this.f18133a.glBindTexture(i, i2);
    }

    public final void glBlendFunc(int i, int i2) {
        this.f18133a.glBlendFunc(i, i2);
    }

    public final void glClear(int i) {
        this.f18133a.glClear(i);
    }

    public final void glClearColor(float f, float f2, float f3, float f4) {
        this.f18133a.glClearColor(f, f2, f3, f4);
    }

    public final void glClearColorx(int i, int i2, int i3, int i4) {
        this.f18133a.glClearColorx(i, i2, i3, i4);
    }

    public final void glClearDepthf(float f) {
        this.f18133a.glClearDepthf(f);
    }

    public final void glClearDepthx(int i) {
        this.f18133a.glClearDepthx(i);
    }

    public final void glClearStencil(int i) {
        this.f18133a.glClearStencil(i);
    }

    public final void glClientActiveTexture(int i) {
        this.f18133a.glClientActiveTexture(i);
    }

    public final void glColor4f(float f, float f2, float f3, float f4) {
        this.f18133a.glColor4f(f, f2, f3, f4);
    }

    public final void glColor4x(int i, int i2, int i3, int i4) {
        this.f18133a.glColor4x(i, i2, i3, i4);
    }

    public final void glColorMask(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f18133a.glColorMask(z, z2, z3, z4);
    }

    public final void glColorPointer(int i, int i2, int i3, Buffer buffer) {
        this.f18133a.glColorPointer(i, i2, i3, buffer);
    }

    public final void glCompressedTexImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, Buffer buffer) {
        this.f18133a.glCompressedTexImage2D(i, i2, i3, i4, i5, i6, i7, buffer);
    }

    public final void glCompressedTexSubImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Buffer buffer) {
        this.f18133a.glCompressedTexSubImage2D(i, i2, i3, i4, i5, i6, i7, i8, buffer);
    }

    public final void glCopyTexImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f18133a.glCopyTexImage2D(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public final void glCopyTexSubImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f18133a.glCopyTexSubImage2D(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public final void glCullFace(int i) {
        this.f18133a.glCullFace(i);
    }

    public final void glDeleteTextures(int i, int[] iArr, int i2) {
        this.f18133a.glDeleteTextures(i, iArr, i2);
    }

    public final void glDeleteTextures(int i, IntBuffer intBuffer) {
        this.f18133a.glDeleteTextures(i, intBuffer);
    }

    public final void glDepthFunc(int i) {
        this.f18133a.glDepthFunc(i);
    }

    public final void glDepthMask(boolean z) {
        this.f18133a.glDepthMask(z);
    }

    public final void glDepthRangef(float f, float f2) {
        this.f18133a.glDepthRangef(f, f2);
    }

    public final void glDepthRangex(int i, int i2) {
        this.f18133a.glDepthRangex(i, i2);
    }

    public final void glDisable(int i) {
        this.f18133a.glDisable(i);
    }

    public final void glDisableClientState(int i) {
        this.f18133a.glDisableClientState(i);
    }

    public final void glDrawArrays(int i, int i2, int i3) {
        this.f18133a.glDrawArrays(i, i2, i3);
    }

    public final void glDrawElements(int i, int i2, int i3, Buffer buffer) {
        this.f18133a.glDrawElements(i, i2, i3, buffer);
    }

    public final void glEnable(int i) {
        this.f18133a.glEnable(i);
    }

    public final void glEnableClientState(int i) {
        this.f18133a.glEnableClientState(i);
    }

    public final void glFinish() {
        this.f18133a.glFinish();
    }

    public final void glFlush() {
        this.f18133a.glFlush();
    }

    public final void glFogf(int i, float f) {
        this.f18133a.glFogf(i, f);
    }

    public final void glFogfv(int i, float[] fArr, int i2) {
        this.f18133a.glFogfv(i, fArr, i2);
    }

    public final void glFogfv(int i, FloatBuffer floatBuffer) {
        this.f18133a.glFogfv(i, floatBuffer);
    }

    public final void glFogx(int i, int i2) {
        this.f18133a.glFogx(i, i2);
    }

    public final void glFogxv(int i, int[] iArr, int i2) {
        this.f18133a.glFogxv(i, iArr, i2);
    }

    public final void glFogxv(int i, IntBuffer intBuffer) {
        this.f18133a.glFogxv(i, intBuffer);
    }

    public final void glFrontFace(int i) {
        this.f18133a.glFrontFace(i);
    }

    public final void glFrustumf(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f18138f.m22137a(f, f2, f3, f4, f5, f6);
        this.f18133a.glFrustumf(f, f2, f3, f4, f5, f6);
    }

    public final void glFrustumx(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f18138f.m22140a(i, i2, i3, i4, i5, i6);
        this.f18133a.glFrustumx(i, i2, i3, i4, i5, i6);
    }

    public final void glGenTextures(int i, int[] iArr, int i2) {
        this.f18133a.glGenTextures(i, iArr, i2);
    }

    public final void glGenTextures(int i, IntBuffer intBuffer) {
        this.f18133a.glGenTextures(i, intBuffer);
    }

    public final int glGetError() {
        return this.f18133a.glGetError();
    }

    public final void glGetIntegerv(int i, int[] iArr, int i2) {
        this.f18133a.glGetIntegerv(i, iArr, i2);
    }

    public final void glGetIntegerv(int i, IntBuffer intBuffer) {
        this.f18133a.glGetIntegerv(i, intBuffer);
    }

    public final String glGetString(int i) {
        return this.f18133a.glGetString(i);
    }

    public final void glHint(int i, int i2) {
        this.f18133a.glHint(i, i2);
    }

    public final void glLightModelf(int i, float f) {
        this.f18133a.glLightModelf(i, f);
    }

    public final void glLightModelfv(int i, float[] fArr, int i2) {
        this.f18133a.glLightModelfv(i, fArr, i2);
    }

    public final void glLightModelfv(int i, FloatBuffer floatBuffer) {
        this.f18133a.glLightModelfv(i, floatBuffer);
    }

    public final void glLightModelx(int i, int i2) {
        this.f18133a.glLightModelx(i, i2);
    }

    public final void glLightModelxv(int i, int[] iArr, int i2) {
        this.f18133a.glLightModelxv(i, iArr, i2);
    }

    public final void glLightModelxv(int i, IntBuffer intBuffer) {
        this.f18133a.glLightModelxv(i, intBuffer);
    }

    public final void glLightf(int i, int i2, float f) {
        this.f18133a.glLightf(i, i2, f);
    }

    public final void glLightfv(int i, int i2, float[] fArr, int i3) {
        this.f18133a.glLightfv(i, i2, fArr, i3);
    }

    public final void glLightfv(int i, int i2, FloatBuffer floatBuffer) {
        this.f18133a.glLightfv(i, i2, floatBuffer);
    }

    public final void glLightx(int i, int i2, int i3) {
        this.f18133a.glLightx(i, i2, i3);
    }

    public final void glLightxv(int i, int i2, int[] iArr, int i3) {
        this.f18133a.glLightxv(i, i2, iArr, i3);
    }

    public final void glLightxv(int i, int i2, IntBuffer intBuffer) {
        this.f18133a.glLightxv(i, i2, intBuffer);
    }

    public final void glLineWidth(float f) {
        this.f18133a.glLineWidth(f);
    }

    public final void glLineWidthx(int i) {
        this.f18133a.glLineWidthx(i);
    }

    public final void glLoadIdentity() {
        this.f18138f.m22134a();
        this.f18133a.glLoadIdentity();
    }

    public final void glLoadMatrixf(float[] fArr, int i) {
        this.f18138f.m22143a(fArr, i);
        this.f18133a.glLoadMatrixf(fArr, i);
    }

    public final void glLoadMatrixf(FloatBuffer floatBuffer) {
        int position = floatBuffer.position();
        this.f18138f.m22141a(floatBuffer);
        floatBuffer.position(position);
        this.f18133a.glLoadMatrixf(floatBuffer);
    }

    public final void glLoadMatrixx(int[] iArr, int i) {
        this.f18138f.m22144a(iArr, i);
        this.f18133a.glLoadMatrixx(iArr, i);
    }

    public final void glLoadMatrixx(IntBuffer intBuffer) {
        int position = intBuffer.position();
        this.f18138f.m22142a(intBuffer);
        intBuffer.position(position);
        this.f18133a.glLoadMatrixx(intBuffer);
    }

    public final void glLogicOp(int i) {
        this.f18133a.glLogicOp(i);
    }

    public final void glMaterialf(int i, int i2, float f) {
        this.f18133a.glMaterialf(i, i2, f);
    }

    public final void glMaterialfv(int i, int i2, float[] fArr, int i3) {
        this.f18133a.glMaterialfv(i, i2, fArr, i3);
    }

    public final void glMaterialfv(int i, int i2, FloatBuffer floatBuffer) {
        this.f18133a.glMaterialfv(i, i2, floatBuffer);
    }

    public final void glMaterialx(int i, int i2, int i3) {
        this.f18133a.glMaterialx(i, i2, i3);
    }

    public final void glMaterialxv(int i, int i2, int[] iArr, int i3) {
        this.f18133a.glMaterialxv(i, i2, iArr, i3);
    }

    public final void glMaterialxv(int i, int i2, IntBuffer intBuffer) {
        this.f18133a.glMaterialxv(i, i2, intBuffer);
    }

    public final void glMatrixMode(int i) {
        switch (i) {
            case 5888:
                this.f18138f = this.f18139g;
                break;
            case 5889:
                this.f18138f = this.f18141i;
                break;
            case 5890:
                this.f18138f = this.f18140h;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("Unknown matrix mode: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f18133a.glMatrixMode(i);
        this.f18137e = i;
    }

    public final void glMultMatrixf(float[] fArr, int i) {
        this.f18138f.m22152b(fArr, i);
        this.f18133a.glMultMatrixf(fArr, i);
    }

    public final void glMultMatrixf(FloatBuffer floatBuffer) {
        int position = floatBuffer.position();
        this.f18138f.m22150b(floatBuffer);
        floatBuffer.position(position);
        this.f18133a.glMultMatrixf(floatBuffer);
    }

    public final void glMultMatrixx(int[] iArr, int i) {
        this.f18138f.m22153b(iArr, i);
        this.f18133a.glMultMatrixx(iArr, i);
    }

    public final void glMultMatrixx(IntBuffer intBuffer) {
        int position = intBuffer.position();
        this.f18138f.m22151b(intBuffer);
        intBuffer.position(position);
        this.f18133a.glMultMatrixx(intBuffer);
    }

    public final void glMultiTexCoord4f(int i, float f, float f2, float f3, float f4) {
        this.f18133a.glMultiTexCoord4f(i, f, f2, f3, f4);
    }

    public final void glMultiTexCoord4x(int i, int i2, int i3, int i4, int i5) {
        this.f18133a.glMultiTexCoord4x(i, i2, i3, i4, i5);
    }

    public final void glNormal3f(float f, float f2, float f3) {
        this.f18133a.glNormal3f(f, f2, f3);
    }

    public final void glNormal3x(int i, int i2, int i3) {
        this.f18133a.glNormal3x(i, i2, i3);
    }

    public final void glNormalPointer(int i, int i2, Buffer buffer) {
        this.f18133a.glNormalPointer(i, i2, buffer);
    }

    public final void glOrthof(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f18138f.m22147b(f, f2, f3, f4, f5, f6);
        this.f18133a.glOrthof(f, f2, f3, f4, f5, f6);
    }

    public final void glOrthox(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f18138f.m22149b(i, i2, i3, i4, i5, i6);
        this.f18133a.glOrthox(i, i2, i3, i4, i5, i6);
    }

    public final void glPixelStorei(int i, int i2) {
        this.f18133a.glPixelStorei(i, i2);
    }

    public final void glPointSize(float f) {
        this.f18133a.glPointSize(f);
    }

    public final void glPointSizex(int i) {
        this.f18133a.glPointSizex(i);
    }

    public final void glPolygonOffset(float f, float f2) {
        this.f18133a.glPolygonOffset(f, f2);
    }

    public final void glPolygonOffsetx(int i, int i2) {
        this.f18133a.glPolygonOffsetx(i, i2);
    }

    public final void glPopMatrix() {
        this.f18138f.m22145b();
        this.f18133a.glPopMatrix();
    }

    public final void glPushMatrix() {
        this.f18138f.m22154c();
        this.f18133a.glPushMatrix();
    }

    public final void glReadPixels(int i, int i2, int i3, int i4, int i5, int i6, Buffer buffer) {
        this.f18133a.glReadPixels(i, i2, i3, i4, i5, i6, buffer);
    }

    public final void glRotatef(float f, float f2, float f3, float f4) {
        this.f18138f.m22136a(f, f2, f3, f4);
        this.f18133a.glRotatef(f, f2, f3, f4);
    }

    public final void glRotatex(int i, int i2, int i3, int i4) {
        this.f18138f.m22139a(i, i2, i3, i4);
        this.f18133a.glRotatex(i, i2, i3, i4);
    }

    public final void glSampleCoverage(float f, boolean z) {
        this.f18133a.glSampleCoverage(f, z);
    }

    public final void glSampleCoveragex(int i, boolean z) {
        this.f18133a.glSampleCoveragex(i, z);
    }

    public final void glScalef(float f, float f2, float f3) {
        this.f18138f.m22135a(f, f2, f3);
        this.f18133a.glScalef(f, f2, f3);
    }

    public final void glScalex(int i, int i2, int i3) {
        this.f18138f.m22138a(i, i2, i3);
        this.f18133a.glScalex(i, i2, i3);
    }

    public final void glScissor(int i, int i2, int i3, int i4) {
        this.f18133a.glScissor(i, i2, i3, i4);
    }

    public final void glShadeModel(int i) {
        this.f18133a.glShadeModel(i);
    }

    public final void glStencilFunc(int i, int i2, int i3) {
        this.f18133a.glStencilFunc(i, i2, i3);
    }

    public final void glStencilMask(int i) {
        this.f18133a.glStencilMask(i);
    }

    public final void glStencilOp(int i, int i2, int i3) {
        this.f18133a.glStencilOp(i, i2, i3);
    }

    public final void glTexCoordPointer(int i, int i2, int i3, Buffer buffer) {
        this.f18133a.glTexCoordPointer(i, i2, i3, buffer);
    }

    public final void glTexEnvf(int i, int i2, float f) {
        this.f18133a.glTexEnvf(i, i2, f);
    }

    public final void glTexEnvfv(int i, int i2, float[] fArr, int i3) {
        this.f18133a.glTexEnvfv(i, i2, fArr, i3);
    }

    public final void glTexEnvfv(int i, int i2, FloatBuffer floatBuffer) {
        this.f18133a.glTexEnvfv(i, i2, floatBuffer);
    }

    public final void glTexEnvx(int i, int i2, int i3) {
        this.f18133a.glTexEnvx(i, i2, i3);
    }

    public final void glTexEnvxv(int i, int i2, int[] iArr, int i3) {
        this.f18133a.glTexEnvxv(i, i2, iArr, i3);
    }

    public final void glTexEnvxv(int i, int i2, IntBuffer intBuffer) {
        this.f18133a.glTexEnvxv(i, i2, intBuffer);
    }

    public final void glTexImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Buffer buffer) {
        this.f18133a.glTexImage2D(i, i2, i3, i4, i5, i6, i7, i8, buffer);
    }

    public final void glTexParameterf(int i, int i2, float f) {
        this.f18133a.glTexParameterf(i, i2, f);
    }

    public final void glTexParameterx(int i, int i2, int i3) {
        this.f18133a.glTexParameterx(i, i2, i3);
    }

    public final void glTexParameteriv(int i, int i2, int[] iArr, int i3) {
        this.f18135c.glTexParameteriv(i, i2, iArr, i3);
    }

    public final void glTexParameteriv(int i, int i2, IntBuffer intBuffer) {
        this.f18135c.glTexParameteriv(i, i2, intBuffer);
    }

    public final void glTexSubImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Buffer buffer) {
        this.f18133a.glTexSubImage2D(i, i2, i3, i4, i5, i6, i7, i8, buffer);
    }

    public final void glTranslatef(float f, float f2, float f3) {
        this.f18138f.m22146b(f, f2, f3);
        this.f18133a.glTranslatef(f, f2, f3);
    }

    public final void glTranslatex(int i, int i2, int i3) {
        this.f18138f.m22148b(i, i2, i3);
        this.f18133a.glTranslatex(i, i2, i3);
    }

    public final void glVertexPointer(int i, int i2, int i3, Buffer buffer) {
        this.f18133a.glVertexPointer(i, i2, i3, buffer);
    }

    public final void glViewport(int i, int i2, int i3, int i4) {
        this.f18133a.glViewport(i, i2, i3, i4);
    }

    public final void glClipPlanef(int i, float[] fArr, int i2) {
        this.f18135c.glClipPlanef(i, fArr, i2);
    }

    public final void glClipPlanef(int i, FloatBuffer floatBuffer) {
        this.f18135c.glClipPlanef(i, floatBuffer);
    }

    public final void glClipPlanex(int i, int[] iArr, int i2) {
        this.f18135c.glClipPlanex(i, iArr, i2);
    }

    public final void glClipPlanex(int i, IntBuffer intBuffer) {
        this.f18135c.glClipPlanex(i, intBuffer);
    }

    public final void glDrawTexfOES(float f, float f2, float f3, float f4, float f5) {
        this.f18136d.glDrawTexfOES(f, f2, f3, f4, f5);
    }

    public final void glDrawTexfvOES(float[] fArr, int i) {
        this.f18136d.glDrawTexfvOES(fArr, i);
    }

    public final void glDrawTexfvOES(FloatBuffer floatBuffer) {
        this.f18136d.glDrawTexfvOES(floatBuffer);
    }

    public final void glDrawTexiOES(int i, int i2, int i3, int i4, int i5) {
        this.f18136d.glDrawTexiOES(i, i2, i3, i4, i5);
    }

    public final void glDrawTexivOES(int[] iArr, int i) {
        this.f18136d.glDrawTexivOES(iArr, i);
    }

    public final void glDrawTexivOES(IntBuffer intBuffer) {
        this.f18136d.glDrawTexivOES(intBuffer);
    }

    public final void glDrawTexsOES(short s, short s2, short s3, short s4, short s5) {
        this.f18136d.glDrawTexsOES(s, s2, s3, s4, s5);
    }

    public final void glDrawTexsvOES(short[] sArr, int i) {
        this.f18136d.glDrawTexsvOES(sArr, i);
    }

    public final void glDrawTexsvOES(ShortBuffer shortBuffer) {
        this.f18136d.glDrawTexsvOES(shortBuffer);
    }

    public final void glDrawTexxOES(int i, int i2, int i3, int i4, int i5) {
        this.f18136d.glDrawTexxOES(i, i2, i3, i4, i5);
    }

    public final void glDrawTexxvOES(int[] iArr, int i) {
        this.f18136d.glDrawTexxvOES(iArr, i);
    }

    public final void glDrawTexxvOES(IntBuffer intBuffer) {
        this.f18136d.glDrawTexxvOES(intBuffer);
    }

    public final int glQueryMatrixxOES(int[] iArr, int i, int[] iArr2, int i2) {
        return this.f18134b.glQueryMatrixxOES(iArr, i, iArr2, i2);
    }

    public final int glQueryMatrixxOES(IntBuffer intBuffer, IntBuffer intBuffer2) {
        return this.f18134b.glQueryMatrixxOES(intBuffer, intBuffer2);
    }

    public final void glBindBuffer(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public final void glBufferData(int i, int i2, Buffer buffer, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glBufferSubData(int i, int i2, int i3, Buffer buffer) {
        throw new UnsupportedOperationException();
    }

    public final void glColor4ub(byte b, byte b2, byte b3, byte b4) {
        throw new UnsupportedOperationException();
    }

    public final void glDeleteBuffers(int i, int[] iArr, int i2) {
        throw new UnsupportedOperationException();
    }

    public final void glDeleteBuffers(int i, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGenBuffers(int i, int[] iArr, int i2) {
        throw new UnsupportedOperationException();
    }

    public final void glGenBuffers(int i, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetBooleanv(int i, boolean[] zArr, int i2) {
        throw new UnsupportedOperationException();
    }

    public final void glGetBooleanv(int i, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetBufferParameteriv(int i, int i2, int[] iArr, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glGetBufferParameteriv(int i, int i2, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetClipPlanef(int i, float[] fArr, int i2) {
        throw new UnsupportedOperationException();
    }

    public final void glGetClipPlanef(int i, FloatBuffer floatBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetClipPlanex(int i, int[] iArr, int i2) {
        throw new UnsupportedOperationException();
    }

    public final void glGetClipPlanex(int i, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetFixedv(int i, int[] iArr, int i2) {
        throw new UnsupportedOperationException();
    }

    public final void glGetFixedv(int i, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetFloatv(int i, float[] fArr, int i2) {
        throw new UnsupportedOperationException();
    }

    public final void glGetFloatv(int i, FloatBuffer floatBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetLightfv(int i, int i2, float[] fArr, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glGetLightfv(int i, int i2, FloatBuffer floatBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetLightxv(int i, int i2, int[] iArr, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glGetLightxv(int i, int i2, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetMaterialfv(int i, int i2, float[] fArr, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glGetMaterialfv(int i, int i2, FloatBuffer floatBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetMaterialxv(int i, int i2, int[] iArr, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glGetMaterialxv(int i, int i2, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexEnviv(int i, int i2, int[] iArr, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexEnviv(int i, int i2, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexEnvxv(int i, int i2, int[] iArr, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexEnvxv(int i, int i2, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexParameterfv(int i, int i2, float[] fArr, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexParameterfv(int i, int i2, FloatBuffer floatBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexParameteriv(int i, int i2, int[] iArr, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexParameteriv(int i, int i2, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexParameterxv(int i, int i2, int[] iArr, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexParameterxv(int i, int i2, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final boolean glIsBuffer(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean glIsEnabled(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean glIsTexture(int i) {
        throw new UnsupportedOperationException();
    }

    public final void glPointParameterf(int i, float f) {
        throw new UnsupportedOperationException();
    }

    public final void glPointParameterfv(int i, float[] fArr, int i2) {
        throw new UnsupportedOperationException();
    }

    public final void glPointParameterfv(int i, FloatBuffer floatBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glPointParameterx(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public final void glPointParameterxv(int i, int[] iArr, int i2) {
        throw new UnsupportedOperationException();
    }

    public final void glPointParameterxv(int i, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glPointSizePointerOES(int i, int i2, Buffer buffer) {
        throw new UnsupportedOperationException();
    }

    public final void glTexEnvi(int i, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glTexEnviv(int i, int i2, int[] iArr, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glTexEnviv(int i, int i2, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glTexParameterfv(int i, int i2, float[] fArr, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glTexParameterfv(int i, int i2, FloatBuffer floatBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glTexParameteri(int i, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glTexParameterxv(int i, int i2, int[] iArr, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glTexParameterxv(int i, int i2, IntBuffer intBuffer) {
        throw new UnsupportedOperationException();
    }

    public final void glColorPointer(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException();
    }

    public final void glDrawElements(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException();
    }

    public final void glGetPointerv(int i, Buffer[] bufferArr) {
        throw new UnsupportedOperationException();
    }

    public final void glNormalPointer(int i, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    public final void glTexCoordPointer(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException();
    }

    public final void glVertexPointer(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException();
    }

    public final void glCurrentPaletteMatrixOES(int i) {
        throw new UnsupportedOperationException();
    }

    public final void glLoadPaletteFromModelViewMatrixOES() {
        throw new UnsupportedOperationException();
    }

    public final void glMatrixIndexPointerOES(int i, int i2, int i3, Buffer buffer) {
        throw new UnsupportedOperationException();
    }

    public final void glMatrixIndexPointerOES(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException();
    }

    public final void glWeightPointerOES(int i, int i2, int i3, Buffer buffer) {
        throw new UnsupportedOperationException();
    }

    public final void glWeightPointerOES(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void m22070a(float[] fArr, int i) {
        this.f18138f.m22155c(fArr, 0);
    }
}
