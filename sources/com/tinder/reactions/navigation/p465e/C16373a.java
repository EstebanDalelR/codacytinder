package com.tinder.reactions.navigation.p465e;

import android.support.annotation.FloatRange;
import android.view.View;
import com.tinder.reactions.navigation.view.widget.GalleryLayoutManager;
import com.tinder.reactions.navigation.view.widget.GalleryLayoutManager.ItemTransformer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/reactions/navigation/transformer/ScaleAlphaTransformer;", "Lcom/tinder/reactions/navigation/view/widget/GalleryLayoutManager$ItemTransformer;", "scaleTo", "", "alphaTo", "(FF)V", "getAlphaTo", "()F", "pivotMultipler", "getPivotMultipler", "getScaleTo", "transformItem", "", "layoutManager", "Lcom/tinder/reactions/navigation/view/widget/GalleryLayoutManager;", "item", "Landroid/view/View;", "fraction", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.navigation.e.a */
public final class C16373a implements ItemTransformer {
    /* renamed from: a */
    private final float f50917a = 0.5f;
    /* renamed from: b */
    private final float f50918b;
    /* renamed from: c */
    private final float f50919c;

    public C16373a(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.f50918b = f;
        this.f50919c = f2;
    }

    public void transformItem(@NotNull GalleryLayoutManager galleryLayoutManager, @NotNull View view, float f) {
        C2668g.b(galleryLayoutManager, "layoutManager");
        C2668g.b(view, "item");
        view.setPivotX(((float) view.getWidth()) * this.f50917a);
        view.setPivotY(((float) view.getHeight()) * this.f50917a);
        galleryLayoutManager = (float) 1;
        float abs = galleryLayoutManager - (this.f50918b * Math.abs(f));
        view.setScaleX(abs);
        view.setScaleY(abs);
        view.setAlpha(galleryLayoutManager - (this.f50919c * Math.abs(f)));
    }
}
