package com.tinder.video.p444a;

import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"applyCenterCropMatrixTransformation", "", "Landroid/view/TextureView;", "videoWidth", "", "videoHeight", "applyCenterCropVideoTransformation", "video_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.video.a.c */
public final class C15404c {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JR\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0010"}, d2 = {"com/tinder/video/extension/TextureViewExtensionsKt$applyCenterCropVideoTransformation$1", "Landroid/view/View$OnLayoutChangeListener;", "(Landroid/view/TextureView;FF)V", "onLayoutChange", "", "v", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "video_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.a.c$a */
    public static final class C15403a implements OnLayoutChangeListener {
        /* renamed from: a */
        final /* synthetic */ TextureView f47672a;
        /* renamed from: b */
        final /* synthetic */ float f47673b;
        /* renamed from: c */
        final /* synthetic */ float f47674c;

        C15403a(TextureView textureView, float f, float f2) {
            this.f47672a = textureView;
            this.f47673b = f;
            this.f47674c = f2;
        }

        public void onLayoutChange(@Nullable View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f47672a.removeOnLayoutChangeListener(this);
            if (this.f47672a.getWidth() > null && this.f47672a.getHeight() > null) {
                C15404c.m57735c(this.f47672a, this.f47673b, this.f47674c);
            }
        }
    }

    /* renamed from: a */
    public static final void m57733a(@NotNull TextureView textureView, float f, float f2) {
        C2668g.b(textureView, "$receiver");
        if (textureView.getWidth() <= 0 || textureView.getHeight() <= 0) {
            textureView.addOnLayoutChangeListener(new C15403a(textureView, f, f2));
        } else {
            C15404c.m57735c(textureView, f, f2);
        }
    }

    /* renamed from: c */
    private static final void m57735c(@NotNull TextureView textureView, float f, float f2) {
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        f = width / f;
        f2 = height / f2;
        float max = Math.max(f, f2);
        f = max / f;
        max /= f2;
        f2 = (float) 2.8E-45f;
        width /= f2;
        height /= f2;
        f2 = new Matrix();
        textureView.getTransform(f2);
        f2.setScale(f, max, width, height);
        textureView.setTransform(f2);
    }
}
