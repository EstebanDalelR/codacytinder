package com.google.android.m4b.maps.bc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.m4b.maps.bx.C5003c;
import com.google.android.m4b.maps.bx.C5006e;
import com.google.android.m4b.maps.bx.C6561r;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bx.C7481o;
import com.google.android.m4b.maps.bx.C8076q;
import com.google.android.m4b.maps.bx.ac;
import com.google.android.m4b.maps.bx.af;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.cg.ao;

/* renamed from: com.google.android.m4b.maps.bc.v */
public interface C6450v extends ao {

    /* renamed from: com.google.android.m4b.maps.bc.v$a */
    public interface C4770a {
        /* renamed from: f */
        boolean mo7048f();
    }

    /* renamed from: a */
    Bitmap m28289a(Bitmap bitmap);

    /* renamed from: a */
    C8076q m28290a(C5016a c5016a);

    /* renamed from: a */
    void mo7050a(C4770a c4770a);

    /* renamed from: a */
    void m28292a(af afVar);

    /* renamed from: a */
    void m28293a(C5003c c5003c, C5006e c5006e);

    /* renamed from: a */
    void m28294a(C6561r c6561r);

    /* renamed from: a */
    void mo7051a(boolean z, boolean z2);

    /* renamed from: b */
    void mo7052b();

    /* renamed from: b */
    void m28297b(C6561r c6561r);

    /* renamed from: c */
    C7481o mo7053c();

    /* renamed from: d */
    ac m28299d(boolean z);

    Context getContext();

    int getHeight();

    Resources getResources();

    int getWidth();

    /* renamed from: n */
    void m28300n();

    /* renamed from: o */
    C6570b m28301o();
}
