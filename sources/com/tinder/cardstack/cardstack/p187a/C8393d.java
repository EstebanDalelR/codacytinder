package com.tinder.cardstack.cardstack.p187a;

import android.support.annotation.NonNull;

/* renamed from: com.tinder.cardstack.cardstack.a.d */
public class C8393d {
    @NonNull
    /* renamed from: a */
    private static final C8392c f29784a = new C8392c(1.0f, 1.03f, 12.0f, 12.05f);
    @NonNull
    /* renamed from: b */
    private static final C8392c f29785b = new C8392c(0.95f, 1.0f, 11.75f, 12.0f);
    @NonNull
    /* renamed from: c */
    private static final C8392c f29786c = new C8392c(0.92f, 0.95f, 11.75f, 12.0f);

    /* renamed from: a */
    C8392c m35777a(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Requesting card transform for index:");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        switch (i) {
            case 0:
                return f29784a;
            case 1:
                return f29785b;
            default:
                return f29786c;
        }
    }
}
