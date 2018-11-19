package com.tinder.recs;

import com.tinder.domain.common.model.Photo.Render;
import java8.util.function.Predicate;

final /* synthetic */ class RecsPhotoUrlFactory$$Lambda$0 implements Predicate {
    private final int arg$1;
    private final int arg$2;

    RecsPhotoUrlFactory$$Lambda$0(int i, int i2) {
        this.arg$1 = i;
        this.arg$2 = i2;
    }

    public boolean test(Object obj) {
        return RecsPhotoUrlFactory.lambda$findBestRenderMatch$0$RecsPhotoUrlFactory(this.arg$1, this.arg$2, (Render) obj);
    }
}
