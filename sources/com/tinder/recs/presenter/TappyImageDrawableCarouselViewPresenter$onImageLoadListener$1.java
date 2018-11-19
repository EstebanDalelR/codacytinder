package com.tinder.recs.presenter;

import android.graphics.drawable.Drawable;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u000026\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001j\u0002`\tB\u0005¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"com/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter$onImageLoadListener$1", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "index", "Landroid/graphics/drawable/Drawable;", "drawable", "", "Lcom/tinder/recs/data/OnRecsImageLoadedListener;", "(Lcom/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter;)V", "invoke", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TappyImageDrawableCarouselViewPresenter$onImageLoadListener$1 implements Function2<Integer, Drawable, C15813i> {
    final /* synthetic */ TappyImageDrawableCarouselViewPresenter this$0;

    TappyImageDrawableCarouselViewPresenter$onImageLoadListener$1(TappyImageDrawableCarouselViewPresenter tappyImageDrawableCarouselViewPresenter) {
        this.this$0 = tappyImageDrawableCarouselViewPresenter;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), (Drawable) obj2);
        return C15813i.f49016a;
    }

    public void invoke(int i, @NotNull Drawable drawable) {
        C2668g.b(drawable, "drawable");
        this.this$0.onImageLoaded(i, drawable);
    }
}
