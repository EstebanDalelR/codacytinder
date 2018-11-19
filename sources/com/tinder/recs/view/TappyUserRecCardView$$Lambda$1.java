package com.tinder.recs.view;

import android.graphics.drawable.Drawable;
import com.tinder.recs.view.tappy.TappyCarouselView.OnImageLoadedListener;

final /* synthetic */ class TappyUserRecCardView$$Lambda$1 implements OnImageLoadedListener {
    private final TappyUserRecCardView arg$1;

    TappyUserRecCardView$$Lambda$1(TappyUserRecCardView tappyUserRecCardView) {
        this.arg$1 = tappyUserRecCardView;
    }

    public void onImageLoaded(Drawable drawable, int i) {
        this.arg$1.lambda$new$3$TappyUserRecCardView(drawable, i);
    }
}
