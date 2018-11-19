package com.tinder.recs.view;

import android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener;
import android.view.View;
import java.util.HashSet;
import java.util.Set;

class AdsViewRemoveListener implements OnChildAttachStateChangeListener {
    private final Set<AdRecCardView> toBeRemovedAdsViewSet = new HashSet();

    public void onChildViewAttachedToWindow(View view) {
    }

    AdsViewRemoveListener() {
    }

    void addAdsViewToBeRemoved(View view) {
        if (view instanceof AdRecCardView) {
            this.toBeRemovedAdsViewSet.add((AdRecCardView) view);
        }
    }

    public void onChildViewDetachedFromWindow(View view) {
        if ((view instanceof AdRecCardView) && this.toBeRemovedAdsViewSet.contains(view)) {
            this.toBeRemovedAdsViewSet.remove(view);
            ((AdRecCardView) view).destroy();
        }
    }
}
