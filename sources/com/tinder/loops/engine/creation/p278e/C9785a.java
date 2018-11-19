package com.tinder.loops.engine.creation.p278e;

import android.graphics.Bitmap;
import android.view.Surface;
import com.tinder.exception.LoopsEngineCreationException;
import com.tinder.loops.engine.creation.p277d.C9781a;
import com.tinder.p260i.C9706a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/loops/engine/creation/opengl/CodecInputSurface;", "", "inputTextureRenderer", "Lcom/tinder/loops/engine/creation/opengl/InputTextureRenderer;", "inputEGLContext", "Lcom/tinder/loops/engine/creation/opengl/InputEGLContext;", "(Lcom/tinder/loops/engine/creation/opengl/InputTextureRenderer;Lcom/tinder/loops/engine/creation/opengl/InputEGLContext;)V", "initializedThreadId", "", "isInitialized", "", "()Z", "surface", "Landroid/view/Surface;", "checkInitialized", "", "initialize", "cropRectangle", "Lcom/tinder/loops/engine/creation/model/CroppingRectangle;", "release", "renderBitmap", "bitmap", "Landroid/graphics/Bitmap;", "presentationTimeMicroSeconds", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.creation.e.a */
public final class C9785a {
    /* renamed from: a */
    private Surface f32435a;
    /* renamed from: b */
    private long f32436b = -1;
    /* renamed from: c */
    private final C9787e f32437c;
    /* renamed from: d */
    private final C11934c f32438d;

    @Inject
    public C9785a(@NotNull C9787e c9787e, @NotNull C11934c c11934c) {
        C2668g.b(c9787e, "inputTextureRenderer");
        C2668g.b(c11934c, "inputEGLContext");
        this.f32437c = c9787e;
        this.f32438d = c11934c;
    }

    /* renamed from: b */
    private final boolean m40353b() {
        return Long.valueOf(this.f32436b).equals(Long.valueOf(-1)) ^ 1;
    }

    /* renamed from: a */
    public final void m40357a(@NotNull Surface surface, @NotNull C9781a c9781a) {
        C2668g.b(surface, "surface");
        C2668g.b(c9781a, "cropRectangle");
        this.f32435a = surface;
        C11934c c11934c = this.f32438d;
        c11934c.m47941a(surface);
        c11934c.m40321d();
        c11934c.m40322e();
        this.f32437c.m40371a(c9781a);
        surface = Thread.currentThread();
        C2668g.a(surface, "Thread.currentThread()");
        this.f32436b = surface.getId();
    }

    /* renamed from: a */
    public final void m40355a() {
        m40354c();
        this.f32437c.m40369a();
        Surface surface = this.f32435a;
        if (surface == null) {
            C2668g.b("surface");
        }
        surface.release();
        this.f32438d.m40320c();
        this.f32436b = -1;
    }

    /* renamed from: a */
    public final void m40356a(@NotNull Bitmap bitmap, long j) {
        C2668g.b(bitmap, "bitmap");
        m40354c();
        this.f32437c.m40370a(bitmap);
        bitmap = this.f32438d;
        bitmap.m40318a(j);
        bitmap.m40323f();
    }

    /* renamed from: c */
    private final void m40354c() {
        C9706a.m40168a(m40353b(), (Exception) new LoopsEngineCreationException("Error codec input surface was not initialized!"));
        Thread currentThread = Thread.currentThread();
        C2668g.a(currentThread, "Thread.currentThread()");
        C9706a.m40168a(currentThread.getId() == this.f32436b, (Exception) new LoopsEngineCreationException("Error codec input surface was initialized on a different thread!"));
    }
}
