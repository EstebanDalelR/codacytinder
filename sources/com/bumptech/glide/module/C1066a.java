package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.module.a */
public final class C1066a {
    /* renamed from: a */
    private final Context f2913a;

    public C1066a(Context context) {
        this.f2913a = context;
    }

    /* renamed from: a */
    public List<GlideModule> m3672a() {
        List<GlideModule> arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f2913a.getPackageManager().getApplicationInfo(this.f2913a.getPackageName(), ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            if (applicationInfo.metaData != null) {
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(C1066a.m3671a(str));
                    }
                }
            }
            return arrayList;
        } catch (Throwable e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    /* renamed from: a */
    private static GlideModule m3671a(String str) {
        StringBuilder stringBuilder;
        try {
            str = Class.forName(str);
            try {
                Object newInstance = str.newInstance();
                if ((newInstance instanceof GlideModule) != null) {
                    return (GlideModule) newInstance;
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Expected instanceof GlideModule, but found: ");
                stringBuilder2.append(newInstance);
                throw new RuntimeException(stringBuilder2.toString());
            } catch (Throwable e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to instantiate GlideModule implementation for ");
                stringBuilder.append(str);
                throw new RuntimeException(stringBuilder.toString(), e);
            } catch (Throwable e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to instantiate GlideModule implementation for ");
                stringBuilder.append(str);
                throw new RuntimeException(stringBuilder.toString(), e2);
            }
        } catch (String str2) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", str2);
        }
    }
}
