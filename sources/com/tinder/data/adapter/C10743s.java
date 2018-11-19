package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.tinder.domain.common.model.Interest;
import java8.util.Objects;
import javax.inject.Inject;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.adapter.s */
public class C10743s extends C2646o<Interest, com.tinder.api.model.common.Interest> {
    @NonNull
    /* renamed from: a */
    private final C10738l f35135a;

    @Inject
    public C10743s(@NonNull C10738l c10738l) {
        this.f35135a = c10738l;
    }

    @Nullable
    /* renamed from: a */
    public Interest m43142a(@NonNull com.tinder.api.model.common.Interest interest) {
        String str = (String) Objects.b(interest.name(), "");
        String str2 = (String) Objects.b(interest.id(), "");
        return Interest.builder().name(str).id(str2).createdTime((DateTime) Objects.b(m43141a(interest.createdTime()), m43144a())).build();
    }

    @VisibleForTesting
    @NonNull
    /* renamed from: a */
    DateTime m43144a() {
        return DateTime.a();
    }

    @Nullable
    /* renamed from: a */
    private DateTime m43141a(@Nullable String str) {
        return str == null ? null : this.f35135a.m43129a(str);
    }
}
