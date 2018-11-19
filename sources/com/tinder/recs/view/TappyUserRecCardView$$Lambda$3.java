package com.tinder.recs.view;

import com.tinder.base.view.listener.OnPhotoPageChangeListener;
import com.tinder.recs.card.UserRecCard;

final /* synthetic */ class TappyUserRecCardView$$Lambda$3 implements OnPhotoPageChangeListener {
    private final TappyUserRecCardView arg$1;
    private final UserRecCard arg$2;

    TappyUserRecCardView$$Lambda$3(TappyUserRecCardView tappyUserRecCardView, UserRecCard userRecCard) {
        this.arg$1 = tappyUserRecCardView;
        this.arg$2 = userRecCard;
    }

    public void onPhotoPageChange(String str, int i, int i2) {
        this.arg$1.lambda$bind$1$TappyUserRecCardView(this.arg$2, str, i, i2);
    }
}
