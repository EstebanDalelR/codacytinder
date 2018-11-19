package com.tinder.profile.view;

import com.tinder.profile.view.ControllaButtonView.Type;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.profile.view.d */
public final /* synthetic */ class C14450d {
    /* renamed from: a */
    public static final /* synthetic */ int[] f45794a = new int[Type.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f45795b = new int[Type.values().length];
    /* renamed from: c */
    public static final /* synthetic */ int[] f45796c = new int[Type.values().length];

    static {
        f45794a[Type.GOLD.ordinal()] = 1;
        f45795b[Type.GOLD.ordinal()] = 1;
        f45795b[Type.SUPER_LIKE.ordinal()] = 2;
        f45795b[Type.BOOST.ordinal()] = 3;
        f45796c[Type.GOLD.ordinal()] = 1;
        f45796c[Type.BOOST.ordinal()] = 2;
        f45796c[Type.SUPER_LIKE.ordinal()] = 3;
    }
}
