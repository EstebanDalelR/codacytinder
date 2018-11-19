package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.CommonConnection;
import java8.util.Objects;

/* renamed from: com.tinder.data.adapter.j */
public class C10737j extends C2646o<CommonConnection, com.tinder.api.model.common.CommonConnection> {
    @Nullable
    /* renamed from: a */
    public CommonConnection m43126a(@NonNull com.tinder.api.model.common.CommonConnection commonConnection) {
        String str = (String) Objects.b(commonConnection.name(), "");
        String str2 = (String) Objects.b(commonConnection.id(), "");
        int intValue = ((Integer) Objects.b(commonConnection.degree(), Integer.valueOf(-1))).intValue();
        commonConnection = commonConnection.photo();
        return CommonConnection.builder().name(str).id(str2).degree(intValue).image((String) Objects.b(commonConnection != null ? commonConnection.medium() : "", "")).build();
    }
}
