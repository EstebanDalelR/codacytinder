package com.tinder.toppicks.view;

import android.graphics.Bitmap;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4330g;
import com.tinder.toppicks.intromodal.C15274b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/tinder/toppicks/view/TopPicksView$showIntroModal$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Landroid/graphics/Bitmap;", "(Lcom/tinder/toppicks/view/TopPicksView;)V", "onResourceReady", "", "resource", "glideAnimation", "Lcom/bumptech/glide/request/animation/GlideAnimation;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksView$b extends C4330g<Bitmap> {
    /* renamed from: a */
    final /* synthetic */ TopPicksView f59424a;

    TopPicksView$b(TopPicksView topPicksView) {
        this.f59424a = topPicksView;
    }

    public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
        m68162a((Bitmap) obj, glideAnimation);
    }

    /* renamed from: a */
    public void m68162a(@NotNull Bitmap bitmap, @Nullable GlideAnimation<? super Bitmap> glideAnimation) {
        C2668g.b(bitmap, "resource");
        TopPicksView.a(this.f59424a, new C15274b(bitmap));
    }
}
