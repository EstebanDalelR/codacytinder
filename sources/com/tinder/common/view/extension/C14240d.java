package com.tinder.common.view.extension;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.gif.C3101b;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4331i;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/common/view/extension/GifLoadingTarget;", "Lcom/bumptech/glide/request/target/ViewTarget;", "Landroid/widget/ImageView;", "Lcom/bumptech/glide/load/resource/gif/GifDrawable;", "imageView", "loadingIndicator", "Landroid/view/View;", "options", "Lcom/tinder/common/view/extension/GifLoadingOptions;", "(Landroid/widget/ImageView;Landroid/view/View;Lcom/tinder/common/view/extension/GifLoadingOptions;)V", "onLoadStarted", "", "placeholder", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "resource", "glideAnimation", "Lcom/bumptech/glide/request/animation/GlideAnimation;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.view.extension.d */
final class C14240d extends C4331i<ImageView, C3101b> {
    /* renamed from: b */
    private final ImageView f45128b;
    /* renamed from: c */
    private final View f45129c;
    /* renamed from: d */
    private final C8583c f45130d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/common/view/extension/GifLoadingTarget$onResourceReady$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/common/view/extension/GifLoadingTarget;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.view.extension.d$a */
    public static final class C8584a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C14240d f30350a;

        C8584a(C14240d c14240d) {
            this.f30350a = c14240d;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f30350a.f45129c.setVisibility(8);
            animator = this.f30350a.f45130d.m36609g();
            if (animator != null) {
                C15813i c15813i = (C15813i) animator.invoke();
            }
        }
    }

    public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
        m54058a((C3101b) obj, glideAnimation);
    }

    public C14240d(@NotNull ImageView imageView, @NotNull View view, @NotNull C8583c c8583c) {
        C2668g.b(imageView, "imageView");
        C2668g.b(view, "loadingIndicator");
        C2668g.b(c8583c, "options");
        super(imageView);
        this.f45128b = imageView;
        this.f45129c = view;
        this.f45130d = c8583c;
    }

    public void onLoadStarted(@Nullable Drawable drawable) {
        super.onLoadStarted(drawable);
        this.f45128b.setImageDrawable(null);
        this.f45129c.setAlpha(1.0f);
        this.f45129c.setVisibility(0);
    }

    /* renamed from: a */
    public void m54058a(@NotNull C3101b c3101b, @NotNull GlideAnimation<? super C3101b> glideAnimation) {
        C2668g.b(c3101b, "resource");
        C2668g.b(glideAnimation, "glideAnimation");
        this.f45129c.animate().cancel();
        this.f45129c.setVisibility(0);
        this.f45129c.animate().setDuration((long) this.f45130d.m36605c()).alpha(0.0f).setListener(new C8584a(this));
        this.f45128b.setImageDrawable(c3101b);
        c3101b.start();
    }
}
