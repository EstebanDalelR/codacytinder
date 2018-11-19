package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.School;
import java8.util.Objects;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import kotlin.jvm.functions.Function0;

public class aj extends C2646o<School, com.tinder.api.model.common.School> {
    /* renamed from: a */
    private final Function0<Boolean> f12275a;

    @Inject
    public aj(Function0<Boolean> function0) {
        this.f12275a = function0;
    }

    @Nullable
    /* renamed from: a */
    public School m14808a(@NonNull com.tinder.api.model.common.School school) {
        String str = (String) Objects.b(school.name(), "");
        String str2 = (String) Objects.b(school.id(), "");
        return School.builder().name(str).id(str2).displayed(((Boolean) Objects.b(school.displayed(), this.f12275a.invoke())).booleanValue()).build();
    }

    /* renamed from: a */
    public com.tinder.api.model.common.School m14807a(@Nonnull School school) {
        return com.tinder.api.model.common.School.builder().setName(school.name()).setId(school.id()).setDisplayed(Boolean.valueOf(school.displayed())).build();
    }
}
