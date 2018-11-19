package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.common.User;
import com.tinder.domain.common.model.CommonConnection;
import com.tinder.domain.common.model.Interest;
import com.tinder.domain.common.model.PerspectableUser;
import java.util.Collections;
import java.util.List;
import java8.util.Objects;
import javax.inject.Inject;

/* renamed from: com.tinder.data.adapter.y */
public class C10745y extends C2646o<PerspectableUser, User> {
    @NonNull
    /* renamed from: a */
    private final ag f35136a;
    @NonNull
    /* renamed from: b */
    private final C10737j f35137b;
    @NonNull
    /* renamed from: c */
    private final C10743s f35138c;

    @Inject
    public C10745y(@NonNull ag agVar, @NonNull C10743s c10743s, @NonNull C10737j c10737j) {
        this.f35136a = agVar;
        this.f35137b = c10737j;
        this.f35138c = c10743s;
    }

    @Nullable
    /* renamed from: a */
    public PerspectableUser m43149a(@NonNull User user) {
        return PerspectableUser.builder().profileUser(this.f35136a.m43092a(user)).commonConnections(m43147b(user.commonConnections())).commmonInterests(m43148c(user.commonInterests())).distanceMiles(((Integer) Objects.b(user.distanceMi(), Integer.valueOf(0))).intValue()).build();
    }

    @NonNull
    /* renamed from: b */
    private List<CommonConnection> m43147b(@Nullable List<com.tinder.api.model.common.CommonConnection> list) {
        return this.f35137b.a((List) Objects.b(list, Collections.emptyList()));
    }

    @NonNull
    /* renamed from: c */
    private List<Interest> m43148c(@Nullable List<com.tinder.api.model.common.Interest> list) {
        return this.f35138c.a((List) Objects.b(list, Collections.emptyList()));
    }
}
