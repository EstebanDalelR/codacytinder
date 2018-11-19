package com.tinder.recs.view;

import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import com.tinder.recs.view.tappablecards.TappableCarouselView.OnOverTapListener;

final /* synthetic */ class TappyUserRecCardView$$Lambda$2 implements OnOverTapListener {
    private final TappyUserRecCardView arg$1;

    TappyUserRecCardView$$Lambda$2(TappyUserRecCardView tappyUserRecCardView) {
        this.arg$1 = tappyUserRecCardView;
    }

    public void onOverTap(TapRegion tapRegion) {
        this.arg$1.lambda$onFinishInflate$0$TappyUserRecCardView(tapRegion);
    }
}
