package com.tinder.recs;

import com.tinder.domain.common.model.Photo.Render;
import java.util.Comparator;

final /* synthetic */ class RecsPhotoUrlFactory$$Lambda$1 implements Comparator {
    static final Comparator $instance = new RecsPhotoUrlFactory$$Lambda$1();

    private RecsPhotoUrlFactory$$Lambda$1() {
    }

    public int compare(Object obj, Object obj2) {
        return RecsPhotoUrlFactory.lambda$getSortedRenders$1$RecsPhotoUrlFactory((Render) obj, (Render) obj2);
    }
}
