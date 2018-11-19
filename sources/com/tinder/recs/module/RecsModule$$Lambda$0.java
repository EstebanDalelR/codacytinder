package com.tinder.recs.module;

import com.tinder.recs.analytics.RecsPhotosViewedCache.PhotosViewed;
import com.tinder.recs.analytics.RecsPhotosViewedCache.RecyclableItemFactory;
import java.util.HashSet;

final /* synthetic */ class RecsModule$$Lambda$0 implements RecyclableItemFactory {
    static final RecyclableItemFactory $instance = new RecsModule$$Lambda$0();

    private RecsModule$$Lambda$0() {
    }

    public Object create(int i) {
        return new PhotosViewed(new HashSet(), new HashSet());
    }
}
