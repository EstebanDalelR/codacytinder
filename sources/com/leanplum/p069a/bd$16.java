package com.leanplum.p069a;

import android.content.res.Configuration;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.leanplum.a.bd$16 */
final class bd$16 extends be {
    /* renamed from: a */
    private static int f25520a = 64;
    /* renamed from: b */
    private static int f25521b = 128;
    /* renamed from: c */
    private static int f25522c = 192;

    bd$16() {
    }

    /* renamed from: a */
    public final Object m30554a(String str) {
        if ("ldrtl".equals(str)) {
            return Integer.valueOf(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        }
        return "ldltr".equals(str) != null ? Integer.valueOf(64) : null;
    }

    /* renamed from: a */
    public final boolean m30555a(Object obj, Configuration configuration) {
        return (configuration.screenLayout & 192) == ((Integer) obj).intValue() ? true : null;
    }
}
