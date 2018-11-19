package com.tinder.analytics.fireworks.api;

import android.support.annotation.Nullable;

class FireworksApiError extends RuntimeException {
    /* renamed from: a */
    private final int f22787a;
    @Nullable
    /* renamed from: b */
    private final String f22788b;

    FireworksApiError(int i, @Nullable String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("status code: ");
        stringBuilder.append(i);
        stringBuilder.append(", message: ");
        stringBuilder.append(str);
        super(stringBuilder.toString());
        this.f22787a = i;
        this.f22788b = str;
    }

    /* renamed from: a */
    int m26856a() {
        return this.f22787a;
    }
}
