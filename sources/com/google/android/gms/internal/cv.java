package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

final class cv implements Runnable {
    /* renamed from: a */
    private /* synthetic */ Bitmap f15936a;
    /* renamed from: b */
    private /* synthetic */ cu f15937b;

    cv(cu cuVar, Bitmap bitmap) {
        this.f15937b = cuVar;
        this.f15936a = bitmap;
    }

    public final void run() {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f15936a.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.f15937b.f23249g) {
            this.f15937b.f23244b.f26558g = new aep();
            this.f15937b.f23244b.f26558g.f26591c = byteArrayOutputStream.toByteArray();
            this.f15937b.f23244b.f26558g.f26590b = "image/png";
            this.f15937b.f23244b.f26558g.f26589a = Integer.valueOf(1);
        }
    }
}
