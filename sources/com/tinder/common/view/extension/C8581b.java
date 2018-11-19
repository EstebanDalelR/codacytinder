package com.tinder.common.view.extension;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a$\u0010\n\u001a\u00020\b*\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"calculateAdjustedDimensions", "Lkotlin/Pair;", "", "options", "Lcom/tinder/common/view/extension/GifLoadingOptions;", "originalWidth", "originalHeight", "adjustSizeIfNeeded", "", "Landroid/widget/ImageView;", "loadGif", "gifUrl", "", "loadingIndicator", "Landroid/view/View;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.common.view.extension.b */
public final class C8581b {
    /* renamed from: a */
    public static final void m36602a(@NotNull ImageView imageView, @NotNull String str, @NotNull View view, @NotNull C8583c c8583c) {
        C2668g.b(imageView, "$receiver");
        C2668g.b(str, "gifUrl");
        C2668g.b(view, "loadingIndicator");
        C2668g.b(c8583c, "options");
        C8581b.m36601a(imageView, c8583c);
        C0994i.b(imageView.getContext()).a(str).m().e().a(DiskCacheStrategy.SOURCE).b(new C14240d(imageView, view, c8583c));
    }

    @NotNull
    /* renamed from: a */
    public static final Pair<Integer, Integer> m36600a(@NotNull C8583c c8583c, int i, int i2) {
        C2668g.b(c8583c, "options");
        if (!c8583c.m36603a() && !c8583c.m36604b()) {
            return C15811g.a(Integer.valueOf(i), Integer.valueOf(i2));
        }
        if (c8583c.m36603a() != 0 && c8583c.m36604b() != 0) {
            return C15811g.a(Integer.valueOf(c8583c.m36606d()), Integer.valueOf(c8583c.m36607e()));
        }
        if (c8583c.m36603a() != 0) {
            i = c8583c.m36606d();
        } else {
            i = (int) (((float) c8583c.m36607e()) * c8583c.m36608f());
        }
        if (c8583c.m36604b() != 0) {
            c8583c = c8583c.m36607e();
        } else {
            c8583c = (int) (((float) c8583c.m36606d()) / c8583c.m36608f());
        }
        return C15811g.a(Integer.valueOf(i), Integer.valueOf(c8583c));
    }

    /* renamed from: a */
    public static final void m36601a(@NotNull ImageView imageView, @NotNull C8583c c8583c) {
        C2668g.b(imageView, "$receiver");
        C2668g.b(c8583c, "options");
        c8583c = C8581b.m36600a(c8583c, imageView.getLayoutParams().width, imageView.getLayoutParams().height);
        int intValue = ((Number) c8583c.c()).intValue();
        c8583c = ((Number) c8583c.d()).intValue();
        LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = intValue;
        layoutParams.height = c8583c;
        imageView.setLayoutParams(layoutParams);
    }
}
