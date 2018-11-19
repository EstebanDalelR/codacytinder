package com.tinder.loops.engine.extraction.p282d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.view.Surface;
import com.tinder.api.ManagerWebServices;
import com.tinder.exception.LoopsEngineExtractionException;
import com.tinder.loops.engine.common.opengl.C9772b;
import com.tinder.loops.engine.extraction.p281c.C9797e;
import com.tinder.p260i.C9706a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u0016J\u0016\u0010#\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010$\u001a\u00020\u001cR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/loops/engine/extraction/opengl/CodecOutputSurface;", "", "outputTextureRenderer", "Lcom/tinder/loops/engine/extraction/opengl/OutputTextureRenderer;", "outputEGLContext", "Lcom/tinder/loops/engine/extraction/opengl/OutputEGLContext;", "(Lcom/tinder/loops/engine/extraction/opengl/OutputTextureRenderer;Lcom/tinder/loops/engine/extraction/opengl/OutputEGLContext;)V", "frameAvailable", "", "frameResolution", "Lcom/tinder/loops/engine/extraction/model/Resolution;", "frameSyncObject", "Ljava/lang/Object;", "initializedThreadId", "", "isInitialized", "()Z", "onFrameAvailableListener", "Lcom/tinder/loops/engine/extraction/opengl/CodecOutputSurface$CodecOnFrameAvailableListener;", "pixelBuf", "Ljava/nio/ByteBuffer;", "surface", "Landroid/view/Surface;", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "unappliedRotation", "", "awaitNewImage", "", "checkInitialized", "copyDecodedFrameIntoBitmap", "Landroid/graphics/Bitmap;", "drawImage", "extractCurrentFrame", "getSurface", "initialize", "release", "CodecOnFrameAvailableListener", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.d.a */
public final class C9800a {
    /* renamed from: a */
    private final C9799a f32477a = new C9799a(this);
    /* renamed from: b */
    private SurfaceTexture f32478b;
    /* renamed from: c */
    private Surface f32479c;
    /* renamed from: d */
    private final Object f32480d = new Object();
    /* renamed from: e */
    private boolean f32481e;
    /* renamed from: f */
    private C9797e f32482f;
    /* renamed from: g */
    private int f32483g;
    /* renamed from: h */
    private ByteBuffer f32484h;
    /* renamed from: i */
    private long f32485i = -1;
    /* renamed from: j */
    private final C9802e f32486j;
    /* renamed from: k */
    private final C11940c f32487k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/loops/engine/extraction/opengl/CodecOutputSurface$CodecOnFrameAvailableListener;", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "(Lcom/tinder/loops/engine/extraction/opengl/CodecOutputSurface;)V", "onFrameAvailable", "", "st", "Landroid/graphics/SurfaceTexture;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.engine.extraction.d.a$a */
    private final class C9799a implements OnFrameAvailableListener {
        /* renamed from: a */
        final /* synthetic */ C9800a f32476a;

        public C9799a(C9800a c9800a) {
            this.f32476a = c9800a;
        }

        public void onFrameAvailable(@NotNull SurfaceTexture surfaceTexture) {
            C2668g.b(surfaceTexture, "st");
            synchronized (this.f32476a.f32480d) {
                C9706a.m40168a(this.f32476a.f32481e ^ true, (Exception) new LoopsEngineExtractionException("frameAvailable already set, frame could be dropped"));
                this.f32476a.f32481e = true;
                this.f32476a.f32480d.notifyAll();
                C15813i c15813i = C15813i.f49016a;
            }
        }
    }

    @Inject
    public C9800a(@NotNull C9802e c9802e, @NotNull C11940c c11940c) {
        C2668g.b(c9802e, "outputTextureRenderer");
        C2668g.b(c11940c, "outputEGLContext");
        this.f32486j = c9802e;
        this.f32487k = c11940c;
    }

    /* renamed from: d */
    private final boolean m40398d() {
        return Long.valueOf(this.f32485i).equals(Long.valueOf(-1)) ^ 1;
    }

    /* renamed from: a */
    public final void m40404a(@NotNull C9797e c9797e, int i) {
        StringBuilder stringBuilder;
        SurfaceTexture surfaceTexture;
        C2668g.b(c9797e, "frameResolution");
        boolean z = true;
        if (c9797e.m40389a() > 0 && c9797e.m40390b() > 0) {
            if (ak.a(new Integer[]{Integer.valueOf(0), Integer.valueOf(90), Integer.valueOf(180), Integer.valueOf(270)}).contains(Integer.valueOf(i))) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error initializing Codec Output Surface with invalid parameters: ");
                stringBuilder.append(c9797e);
                stringBuilder.append(", unappliedRotation ");
                stringBuilder.append(i);
                C9706a.m40168a(z, (Exception) new LoopsEngineExtractionException(stringBuilder.toString()));
                this.f32482f = c9797e;
                this.f32483g = i;
                i = this.f32487k;
                i.m47960a(c9797e);
                i.m40321d();
                i.m40322e();
                this.f32486j.m40421a();
                c9797e = ByteBuffer.allocateDirect((c9797e.m40389a() * c9797e.m40390b()) * 4);
                c9797e.order(ByteOrder.LITTLE_ENDIAN);
                C2668g.a(c9797e, "ByteBuffer.allocateDirec…ENDIAN)\n                }");
                this.f32484h = c9797e;
                c9797e = this.f32486j.m40423b();
                c9797e.setOnFrameAvailableListener((OnFrameAvailableListener) this.f32477a);
                this.f32478b = c9797e;
                c9797e = this.f32486j;
                surfaceTexture = this.f32478b;
                if (surfaceTexture == 0) {
                    C2668g.b("surfaceTexture");
                }
                this.f32479c = c9797e.m40420a(surfaceTexture);
                this.f32481e = false;
                c9797e = Thread.currentThread();
                C2668g.a(c9797e, "Thread.currentThread()");
                this.f32485i = c9797e.getId();
            }
        }
        z = false;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Error initializing Codec Output Surface with invalid parameters: ");
        stringBuilder.append(c9797e);
        stringBuilder.append(", unappliedRotation ");
        stringBuilder.append(i);
        C9706a.m40168a(z, (Exception) new LoopsEngineExtractionException(stringBuilder.toString()));
        this.f32482f = c9797e;
        this.f32483g = i;
        i = this.f32487k;
        i.m47960a(c9797e);
        i.m40321d();
        i.m40322e();
        this.f32486j.m40421a();
        c9797e = ByteBuffer.allocateDirect((c9797e.m40389a() * c9797e.m40390b()) * 4);
        c9797e.order(ByteOrder.LITTLE_ENDIAN);
        C2668g.a(c9797e, "ByteBuffer.allocateDirec…ENDIAN)\n                }");
        this.f32484h = c9797e;
        c9797e = this.f32486j.m40423b();
        c9797e.setOnFrameAvailableListener((OnFrameAvailableListener) this.f32477a);
        this.f32478b = c9797e;
        c9797e = this.f32486j;
        surfaceTexture = this.f32478b;
        if (surfaceTexture == 0) {
            C2668g.b("surfaceTexture");
        }
        this.f32479c = c9797e.m40420a(surfaceTexture);
        this.f32481e = false;
        c9797e = Thread.currentThread();
        C2668g.a(c9797e, "Thread.currentThread()");
        this.f32485i = c9797e.getId();
    }

    @NotNull
    /* renamed from: a */
    public final Bitmap m40403a() {
        m40399e();
        m40401g();
        m40402h();
        return m40400f();
    }

    /* renamed from: b */
    public final void m40405b() {
        m40399e();
        this.f32486j.m40424c();
        Surface surface = this.f32479c;
        if (surface == null) {
            C2668g.b("surface");
        }
        surface.release();
        SurfaceTexture surfaceTexture = this.f32478b;
        if (surfaceTexture == null) {
            C2668g.b("surfaceTexture");
        }
        surfaceTexture.release();
        this.f32487k.m40320c();
        this.f32485i = -1;
    }

    @NotNull
    /* renamed from: c */
    public final Surface m40406c() {
        Surface surface = this.f32479c;
        if (surface == null) {
            C2668g.b("surface");
        }
        return surface;
    }

    /* renamed from: e */
    private final void m40399e() {
        C9706a.m40168a(m40398d(), (Exception) new LoopsEngineExtractionException("Error codec output surface was not initialized!"));
        Thread currentThread = Thread.currentThread();
        C2668g.a(currentThread, "Thread.currentThread()");
        C9706a.m40168a(currentThread.getId() == this.f32485i, (Exception) new LoopsEngineExtractionException("Error codec output surface was initialized on a different thread!"));
    }

    /* renamed from: f */
    private final Bitmap m40400f() {
        ByteBuffer byteBuffer = this.f32484h;
        if (byteBuffer == null) {
            C2668g.b("pixelBuf");
        }
        byteBuffer.rewind();
        C9797e c9797e = this.f32482f;
        if (c9797e == null) {
            C2668g.b("frameResolution");
        }
        int a = c9797e.m40389a();
        c9797e = this.f32482f;
        if (c9797e == null) {
            C2668g.b("frameResolution");
        }
        int b = c9797e.m40390b();
        byteBuffer = this.f32484h;
        if (byteBuffer == null) {
            C2668g.b("pixelBuf");
        }
        GLES20.glReadPixels(0, 0, a, b, 6408, 5121, byteBuffer);
        c9797e = this.f32482f;
        if (c9797e == null) {
            C2668g.b("frameResolution");
        }
        int a2 = c9797e.m40389a();
        C9797e c9797e2 = this.f32482f;
        if (c9797e2 == null) {
            C2668g.b("frameResolution");
        }
        Bitmap createBitmap = Bitmap.createBitmap(a2, c9797e2.m40390b(), Config.ARGB_8888);
        ByteBuffer byteBuffer2 = this.f32484h;
        if (byteBuffer2 == null) {
            C2668g.b("pixelBuf");
        }
        byteBuffer2.rewind();
        byteBuffer2 = this.f32484h;
        if (byteBuffer2 == null) {
            C2668g.b("pixelBuf");
        }
        createBitmap.copyPixelsFromBuffer(byteBuffer2);
        C2668g.a(createBitmap, "bitmap");
        return createBitmap;
    }

    /* renamed from: g */
    private final void m40401g() {
        synchronized (this.f32480d) {
            while (!this.f32481e) {
                try {
                    this.f32480d.wait((long) ManagerWebServices.FB_WEAR_TIMEOUT);
                    C9706a.m40168a(this.f32481e, (Exception) new LoopsEngineExtractionException("frame wait timed out"));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.f32481e = false;
            C15813i c15813i = C15813i.f49016a;
        }
        C9772b.m40324a("before updateTexImage");
        SurfaceTexture surfaceTexture = this.f32478b;
        if (surfaceTexture == null) {
            C2668g.b("surfaceTexture");
        }
        surfaceTexture.updateTexImage();
    }

    /* renamed from: h */
    private final void m40402h() {
        C9802e c9802e = this.f32486j;
        SurfaceTexture surfaceTexture = this.f32478b;
        if (surfaceTexture == null) {
            C2668g.b("surfaceTexture");
        }
        c9802e.m40422a(surfaceTexture, this.f32483g);
    }
}
