package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;

@zzzv
public final class amm extends ano {
    /* renamed from: a */
    private final Drawable f26682a;
    /* renamed from: b */
    private final Uri f26683b;
    /* renamed from: c */
    private final double f26684c;

    public amm(Drawable drawable, Uri uri, double d) {
        this.f26682a = drawable;
        this.f26683b = uri;
        this.f26684c = d;
    }

    public final double getScale() {
        return this.f26684c;
    }

    public final Uri getUri() throws RemoteException {
        return this.f26683b;
    }

    public final IObjectWrapper zzjr() throws RemoteException {
        return C4296b.a(this.f26682a);
    }
}
