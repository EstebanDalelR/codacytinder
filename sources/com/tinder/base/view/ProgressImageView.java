package com.tinder.base.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.C3082c;
import com.bumptech.glide.load.resource.p028a.C1041b;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4457d;
import com.bumptech.glide.request.target.Target;
import com.tinder.base.C8314i.C8311a;
import com.tinder.base.C8314i.C8312b;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017J<\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0010J\u0006\u0010\u001e\u001a\u00020\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/tinder/base/view/ProgressImageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageView", "Landroid/widget/ImageView;", "getImageView$base_release", "()Landroid/widget/ImageView;", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar$base_release", "()Landroid/widget/ProgressBar;", "clearImage", "", "setImage", "bitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "url", "", "onReadyListener", "Lkotlin/Function1;", "onLoadFailedDrawable", "bitmapTransformation", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "showImage", "showProgressbar", "base_release"}, k = 1, mv = {1, 1, 10})
public final class ProgressImageView extends FrameLayout {
    @NotNull
    /* renamed from: a */
    private final ImageView f29595a;
    @NotNull
    /* renamed from: b */
    private final ProgressBar f29596b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u000b\u0018\u00010\rH\u0016¨\u0006\u000e"}, d2 = {"com/tinder/base/view/ProgressImageView$setImage$1", "Lcom/bumptech/glide/request/target/GlideDrawableImageViewTarget;", "(Lcom/tinder/base/view/ProgressImageView;Lkotlin/jvm/functions/Function1;Landroid/graphics/drawable/Drawable;Landroid/widget/ImageView;)V", "onLoadFailed", "", "e", "Ljava/lang/Exception;", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "resource", "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;", "glideAnimation", "Lcom/bumptech/glide/request/animation/GlideAnimation;", "base_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.base.view.ProgressImageView$a */
    public static final class C14314a extends C4457d {
        /* renamed from: b */
        final /* synthetic */ ProgressImageView f45346b;
        /* renamed from: c */
        final /* synthetic */ Function1 f45347c;
        /* renamed from: d */
        final /* synthetic */ Drawable f45348d;

        C14314a(ProgressImageView progressImageView, Function1 function1, Drawable drawable, ImageView imageView) {
            this.f45346b = progressImageView;
            this.f45347c = function1;
            this.f45348d = drawable;
            super(imageView);
        }

        public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
            m54459a((C1041b) obj, glideAnimation);
        }

        /* renamed from: a */
        public void m54459a(@NotNull C1041b c1041b, @Nullable GlideAnimation<? super C1041b> glideAnimation) {
            C2668g.b(c1041b, "resource");
            glideAnimation = this.f45347c;
            if (glideAnimation != null) {
                C15813i c15813i = (C15813i) glideAnimation.invoke(c1041b);
            }
            this.f45346b.setImage((Drawable) c1041b);
        }

        public void onLoadFailed(@Nullable Exception exception, @Nullable Drawable drawable) {
            if (this.f45348d != null) {
                this.f45346b.setImage(this.f45348d);
            }
        }
    }

    public ProgressImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        View.inflate(context, C8312b.progress_image_view, this);
        context = findViewById(C8311a.piv_image);
        C2668g.a(context, "findViewById<ImageView>(R.id.piv_image)");
        this.f29595a = (ImageView) context;
        context = findViewById(C8311a.piv_progress);
        C2668g.a(context, "findViewById<ProgressBar>(R.id.piv_progress)");
        this.f29596b = (ProgressBar) context;
    }

    @NotNull
    public final ImageView getImageView$base_release() {
        return this.f29595a;
    }

    @NotNull
    public final ProgressBar getProgressBar$base_release() {
        return this.f29596b;
    }

    public final void setImage(@NotNull String str) {
        C2668g.b(str, "url");
        m35418a(this, str, null, null, null, 8, null);
    }

    /* renamed from: a */
    public final void m35422a(@NotNull String str, @Nullable C3082c c3082c) {
        C2668g.b(str, "url");
        m35419a(str, null, null, c3082c);
    }

    /* renamed from: a */
    public final void m35421a(@NotNull String str, @NotNull Drawable drawable) {
        C2668g.b(str, "url");
        C2668g.b(drawable, "onLoadFailedDrawable");
        m35418a(this, str, null, drawable, null, 8, null);
    }

    public final void setImage(@NotNull Drawable drawable) {
        C2668g.b(drawable, "drawable");
        this.f29595a.setImageDrawable(drawable);
        m35423b();
    }

    public final void setImage(@NotNull Bitmap bitmap) {
        C2668g.b(bitmap, "bitmap");
        this.f29595a.setImageBitmap(bitmap);
        m35423b();
    }

    /* renamed from: a */
    public final void m35420a() {
        this.f29596b.setVisibility(0);
        this.f29595a.setVisibility(4);
    }

    /* renamed from: b */
    public final void m35423b() {
        this.f29596b.setVisibility(8);
        this.f29595a.setVisibility(0);
    }

    /* renamed from: c */
    public final void m35424c() {
        C0994i.a(this.f29595a);
    }

    /* renamed from: a */
    static /* synthetic */ void m35418a(ProgressImageView progressImageView, String str, Function1 function1, Drawable drawable, C3082c c3082c, int i, Object obj) {
        if ((i & 8) != 0) {
            c3082c = null;
        }
        progressImageView.m35419a(str, function1, drawable, c3082c);
    }

    /* renamed from: a */
    private final void m35419a(String str, Function1<? super Drawable, C15813i> function1, Drawable drawable, C3082c c3082c) {
        m35420a();
        str = C0994i.b(this.f29595a.getContext()).a(str).a(DiskCacheStrategy.SOURCE);
        if (c3082c != null) {
            str.a(new Transformation[]{c3082c});
        }
        str.b((Target) new C14314a(this, function1, drawable, this.f29595a));
    }
}
