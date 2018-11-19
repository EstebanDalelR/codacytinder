package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.model.Instagram.Photo;
import java.util.Collections;
import java.util.List;
import java8.util.Objects;
import java8.util.Optional;
import javax.inject.Inject;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.adapter.q */
public class C10742q extends C2646o<Instagram, com.tinder.api.model.common.Instagram> {
    @NonNull
    /* renamed from: a */
    private final C10738l f35133a;
    @NonNull
    /* renamed from: b */
    private final C10741a f35134b = new C10741a();

    /* renamed from: com.tinder.data.adapter.q$a */
    private class C10741a extends C2646o<Photo, com.tinder.api.model.common.Instagram.Photo> {
        /* renamed from: a */
        final /* synthetic */ C10742q f35132a;

        private C10741a(C10742q c10742q) {
            this.f35132a = c10742q;
        }

        @Nullable
        /* renamed from: a */
        public Photo m43135a(@NonNull com.tinder.api.model.common.Instagram.Photo photo) {
            return Photo.builder().link((String) Objects.b(photo.link(), "")).thumbnail((String) Objects.b(photo.thumbnail(), "")).image((String) Objects.b(photo.image(), "")).timestampMillis(photo.ts() * 1000).build();
        }
    }

    @Inject
    public C10742q(@NonNull C10738l c10738l) {
        this.f35133a = c10738l;
    }

    @Nullable
    /* renamed from: a */
    public Instagram m43139a(@NonNull com.tinder.api.model.common.Instagram instagram) {
        String str = (String) Objects.b(instagram.username(), "");
        String str2 = (String) Objects.b(instagram.profilePicture(), "");
        int intValue = ((Integer) Objects.b(instagram.mediaCount(), Integer.valueOf(0))).intValue();
        List b = m43138b(instagram.photos());
        boolean booleanValue = ((Boolean) Objects.b(instagram.completedInitialFetch(), Boolean.valueOf(false))).booleanValue();
        return Instagram.builder().username(str).profilePicture(str2).mediaCount(intValue).photos(b).completedInitialFetch(booleanValue).lastFetchedTime(Optional.b(m43137a(instagram.lastFetchTime()))).build();
    }

    @NonNull
    /* renamed from: b */
    private List<Photo> m43138b(@Nullable List<com.tinder.api.model.common.Instagram.Photo> list) {
        return this.f35134b.a((List) Objects.b(list, Collections.emptyList()));
    }

    @Nullable
    /* renamed from: a */
    private DateTime m43137a(@Nullable String str) {
        return str == null ? null : this.f35133a.m43129a(str);
    }
}
