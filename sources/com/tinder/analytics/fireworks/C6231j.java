package com.tinder.analytics.fireworks;

import android.support.annotation.NonNull;
import com.tinder.api.model.meta.BlendType;

/* renamed from: com.tinder.analytics.fireworks.j */
public class C6231j {

    /* renamed from: com.tinder.analytics.fireworks.j$1 */
    static /* synthetic */ class C62301 {
        /* renamed from: a */
        static final /* synthetic */ int[] f22800a = new int[BlendType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.api.model.meta.BlendType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f22800a = r0;
            r0 = f22800a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.api.model.meta.BlendType.OPTIMAL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f22800a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.api.model.meta.BlendType.POPULARITY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f22800a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.tinder.api.model.meta.BlendType.DISTANCE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f22800a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.tinder.api.model.meta.BlendType.RECENT_ACTIVITY;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.analytics.fireworks.j.1.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m26888a(@NonNull BlendType blendType) {
        switch (C62301.f22800a[blendType.ordinal()]) {
            case 1:
                return null;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown Blend type: ");
                stringBuilder.append(blendType);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
