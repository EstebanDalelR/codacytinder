package com.tinder.superlike.p420c;

import android.support.annotation.NonNull;
import com.tinder.model.GlobalConfig.SuperlikeALCMode;
import com.tinder.model.UserMeta;
import java8.util.Optional;

/* renamed from: com.tinder.superlike.c.b */
public abstract class C15073b {

    /* renamed from: com.tinder.superlike.c.b$1 */
    static /* synthetic */ class C150721 {
        /* renamed from: a */
        static final /* synthetic */ int[] f46916a = new int[SuperlikeALCMode.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.model.GlobalConfig.SuperlikeALCMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            f46916a = r0;
            r0 = f46916a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.model.GlobalConfig.SuperlikeALCMode.PLUS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f46916a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.model.GlobalConfig.SuperlikeALCMode.ALL;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.superlike.c.b.1.<clinit>():void");
        }
    }

    /* renamed from: a */
    public abstract boolean mo12481a();

    /* renamed from: a */
    public static C15073b m56823a(@NonNull UserMeta userMeta, boolean z) {
        return C15073b.m56824a(((Boolean) Optional.m59121b((Object) userMeta).m59122a(C16886c.f52038a).m59122a(C16887d.f52039a).m59122a(new C16888e(z)).m59130c(Boolean.valueOf(false))).booleanValue());
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m56825a(boolean z, SuperlikeALCMode superlikeALCMode) {
        switch (C150721.f46916a[superlikeALCMode.ordinal()]) {
            case 1:
                return Boolean.valueOf(z);
            case 2:
                return Boolean.valueOf(true);
            default:
                return Boolean.valueOf(false);
        }
    }

    /* renamed from: b */
    public static C15073b m56826b() {
        return C15073b.m56824a(false);
    }

    /* renamed from: a */
    public static C15073b m56824a(boolean z) {
        return new C16885a(z);
    }
}
