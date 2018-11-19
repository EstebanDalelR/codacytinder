package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Badge.Type;
import java8.util.Objects;

/* renamed from: com.tinder.data.adapter.f */
public class C10735f extends C2646o<Badge, com.tinder.api.model.common.Badge> {
    @Nullable
    /* renamed from: a */
    public Badge m43122a(@NonNull com.tinder.api.model.common.Badge badge) {
        Type fromKey = Type.fromKey(badge.type());
        String str = (String) Objects.b(badge.description(), "");
        return Badge.builder().type(fromKey).description(str).color((String) Objects.b(badge.color(), "")).build();
    }
}
