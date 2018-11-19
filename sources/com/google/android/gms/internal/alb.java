package com.google.android.gms.internal;

import android.os.Environment;
import java.util.concurrent.Callable;

final class alb implements Callable<Boolean> {
    alb() {
    }

    public final /* synthetic */ Object call() throws Exception {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
