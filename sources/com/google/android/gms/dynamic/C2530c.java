package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.common.internal.ad;

/* renamed from: com.google.android.gms.dynamic.c */
public abstract class C2530c<T> {
    /* renamed from: a */
    private final String f7683a;
    /* renamed from: b */
    private T f7684b;

    protected C2530c(String str) {
        this.f7683a = str;
    }

    /* renamed from: a */
    protected final T m9224a(Context context) throws zzq {
        if (this.f7684b == null) {
            ad.m9045a((Object) context);
            context = C2513p.getRemoteContext(context);
            if (context == null) {
                throw new zzq("Could not get remote context.");
            }
            try {
                this.f7684b = mo2576a((IBinder) context.getClassLoader().loadClass(this.f7683a).newInstance());
            } catch (Throwable e) {
                throw new zzq("Could not load creator class.", e);
            } catch (Throwable e2) {
                throw new zzq("Could not instantiate creator.", e2);
            } catch (Throwable e22) {
                throw new zzq("Could not access creator.", e22);
            }
        }
        return this.f7684b;
    }

    /* renamed from: a */
    protected abstract T mo2576a(IBinder iBinder);
}
