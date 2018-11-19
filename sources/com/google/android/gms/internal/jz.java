package com.google.android.gms.internal;

import android.os.Looper;

final class jz implements Runnable {
    jz(jy jyVar) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
