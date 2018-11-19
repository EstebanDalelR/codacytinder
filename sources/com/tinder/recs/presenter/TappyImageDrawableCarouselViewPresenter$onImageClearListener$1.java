package com.tinder.recs.presenter;

import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002!\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u0005¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¨\u0006\n"}, d2 = {"com/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter$onImageClearListener$1", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "", "Lcom/tinder/recs/data/OnImageLoadClearListener;", "(Lcom/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter;)V", "invoke", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TappyImageDrawableCarouselViewPresenter$onImageClearListener$1 implements Function1<Integer, C15813i> {
    final /* synthetic */ TappyImageDrawableCarouselViewPresenter this$0;

    TappyImageDrawableCarouselViewPresenter$onImageClearListener$1(TappyImageDrawableCarouselViewPresenter tappyImageDrawableCarouselViewPresenter) {
        this.this$0 = tappyImageDrawableCarouselViewPresenter;
    }

    public /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C15813i.f49016a;
    }

    public void invoke(int i) {
        this.this$0.onImageLoadCleared(i);
    }
}
