package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.Photo;
import java.util.Collections;
import java.util.List;
import java8.util.Objects;
import javax.inject.Inject;

/* renamed from: com.tinder.data.adapter.z */
public class C10746z extends C2646o<Photo, com.tinder.api.model.common.Photo> {
    @NonNull
    /* renamed from: a */
    private final ab f35139a;
    @NonNull
    /* renamed from: b */
    private final ad f35140b;

    @Inject
    public C10746z(@NonNull ab abVar, @NonNull ad adVar) {
        this.f35139a = abVar;
        this.f35140b = adVar;
    }

    @Nullable
    /* renamed from: a */
    public Photo m43151a(@NonNull com.tinder.api.model.common.Photo photo) {
        String str = (String) Objects.b(photo.id(), "");
        String str2 = (String) Objects.b(photo.url(), "");
        if (str2.isEmpty()) {
            return null;
        }
        List a = this.f35139a.a((List) Objects.b(photo.processedFiles(), Collections.emptyList()));
        return Photo.builder().id(str).url(str2).renders(a).videos(this.f35140b.a((List) Objects.b(photo.processedVideos(), Collections.emptyList()))).build();
    }
}
