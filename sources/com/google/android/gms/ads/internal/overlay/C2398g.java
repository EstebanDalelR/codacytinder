package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.overlay.g */
public final class C2398g {
    /* renamed from: a */
    public final int f7305a;
    /* renamed from: b */
    public final LayoutParams f7306b;
    /* renamed from: c */
    public final ViewGroup f7307c;
    /* renamed from: d */
    public final Context f7308d;

    public C2398g(zzanh zzanh) throws zzg {
        this.f7306b = zzanh.getLayoutParams();
        ViewParent parent = zzanh.getParent();
        this.f7308d = zzanh.zzsu();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        this.f7307c = (ViewGroup) parent;
        ViewGroup viewGroup = this.f7307c;
        if (zzanh == null) {
            throw null;
        }
        View view = (View) zzanh;
        this.f7305a = viewGroup.indexOfChild(view);
        viewGroup = this.f7307c;
        if (zzanh == null) {
            throw null;
        }
        viewGroup.removeView(view);
        zzanh.zzad(true);
    }
}
