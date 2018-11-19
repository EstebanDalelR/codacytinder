package com.tinder.superlike.p418a;

import android.support.annotation.Nullable;
import com.tinder.api.model.meta.SuperLikes;
import com.tinder.data.adapter.aq;
import com.tinder.domain.superlike.SuperlikeStatus;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.tinder.superlike.a.a */
public class C15066a {
    /* renamed from: a */
    private final aq f46903a;

    @Inject
    public C15066a(aq aqVar) {
        this.f46903a = aqVar;
    }

    @Nullable
    /* renamed from: a */
    public SuperlikeStatus m56778a(@Nullable SuperLikes superLikes) {
        return superLikes == null ? null : this.f46903a.a(superLikes);
    }
}
