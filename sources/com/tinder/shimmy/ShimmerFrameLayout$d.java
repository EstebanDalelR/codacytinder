package com.tinder.shimmy;

import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.SurfaceTexture;
import android.support.annotation.UiThread;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.ViewGroup.LayoutParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0017J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tH\u0017J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0017J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0017J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/shimmy/ShimmerFrameLayout$TextureViewManager;", "Landroid/view/TextureView$SurfaceTextureListener;", "(Lcom/tinder/shimmy/ShimmerFrameLayout;)V", "isHidden", "", "hideTextureViewUntilFirstUpdate", "", "onSurfaceTextureAvailable", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "width", "", "height", "onSurfaceTextureDestroyed", "surface", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "showTextureView", "showTextureViewIfNeeded", "updateTextureViewSize", "shimmy_release"}, k = 1, mv = {1, 1, 9})
final class ShimmerFrameLayout$d implements SurfaceTextureListener {
    /* renamed from: a */
    final /* synthetic */ ShimmerFrameLayout f46661a;
    /* renamed from: b */
    private boolean f46662b;

    @UiThread
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surfaceTexture, int i, int i2) {
        C2668g.b(surfaceTexture, "surface");
    }

    public ShimmerFrameLayout$d(ShimmerFrameLayout shimmerFrameLayout) {
        this.f46661a = shimmerFrameLayout;
    }

    @UiThread
    /* renamed from: a */
    public final void m56438a() {
        if (!(ShimmerFrameLayout.b(this.f46661a).getWidth() == this.f46661a.getWidth() && ShimmerFrameLayout.b(this.f46661a).getHeight() == this.f46661a.getHeight())) {
            LayoutParams layoutParams = ShimmerFrameLayout.b(this.f46661a).getLayoutParams();
            layoutParams.width = this.f46661a.getWidth();
            layoutParams.height = this.f46661a.getHeight();
            ShimmerFrameLayout.b(this.f46661a).setLayoutParams(layoutParams);
        }
        if (this.f46661a.indexOfChild(ShimmerFrameLayout.b(this.f46661a)) != this.f46661a.getChildCount() - 1) {
            this.f46661a.bringChildToFront(ShimmerFrameLayout.b(this.f46661a));
        }
    }

    @UiThread
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, int i, int i2) {
        C2668g.b(surfaceTexture, "surfaceTexture");
        i = new Surface(surfaceTexture);
        Canvas lockCanvas;
        try {
            if (i.isValid()) {
                lockCanvas = i.lockCanvas(null);
                if (lockCanvas != null) {
                    lockCanvas.drawColor(0, Mode.CLEAR);
                    try {
                        i.unlockCanvasAndPost(lockCanvas);
                    } catch (IllegalArgumentException e) {
                        C0001a.c(e, "unlockCanvasAndPost failed", new Object[0]);
                    }
                } else {
                    i.release();
                    return;
                }
            }
        } catch (IllegalArgumentException e2) {
            try {
                C0001a.c(e2, "lockCanvas failed", new Object[0]);
            } catch (Throwable th) {
                i.release();
            }
        } catch (Throwable th2) {
            try {
                i.unlockCanvasAndPost(lockCanvas);
            } catch (IllegalArgumentException e22) {
                C0001a.c(e22, "unlockCanvasAndPost failed", new Object[0]);
            }
        }
        i.release();
        m56439b();
        ShimmerFrameLayout.d(this.f46661a).m56526a(surfaceTexture);
    }

    @UiThread
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surfaceTexture) {
        C2668g.b(surfaceTexture, "surface");
        m56436c();
    }

    @UiThread
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surfaceTexture) {
        C2668g.b(surfaceTexture, "surface");
        ShimmerFrameLayout.d(this.f46661a).m56525a();
        return null;
    }

    /* renamed from: b */
    public final void m56439b() {
        ShimmerFrameLayout.b(this.f46661a).setAlpha(0.0f);
        this.f46662b = true;
    }

    /* renamed from: c */
    private final void m56436c() {
        if (this.f46662b) {
            m56437d();
            this.f46662b = false;
        }
    }

    /* renamed from: d */
    private final void m56437d() {
        ShimmerFrameLayout.b(this.f46661a).setAlpha(1.0f);
    }
}
