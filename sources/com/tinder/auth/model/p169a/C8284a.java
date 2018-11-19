package com.tinder.auth.model.p169a;

import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.tinder.auth.model.a.a */
public final class C8284a {
    @SerializedName("email")
    /* renamed from: a */
    private String f29547a;

    /* renamed from: a */
    public static C8284a m35359a(@NonNull String str) {
        return new C8284a(str);
    }

    C8284a() {
    }

    C8284a(@NonNull String str) {
        this.f29547a = str;
    }
}
