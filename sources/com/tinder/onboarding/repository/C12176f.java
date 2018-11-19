package com.tinder.onboarding.repository;

import com.tinder.domain.common.model.Photo.Render;
import com.tinder.onboarding.model.network.Photos.ProcessedPhotos;
import java8.util.function.Function;

/* renamed from: com.tinder.onboarding.repository.f */
final /* synthetic */ class C12176f implements Function {
    /* renamed from: a */
    static final Function f39466a = new C12176f();

    private C12176f() {
    }

    public Object apply(Object obj) {
        return Render.builder().url(((ProcessedPhotos) obj).getUrl()).width(((ProcessedPhotos) obj).getWidth()).height(((ProcessedPhotos) obj).getHeight()).build();
    }
}
