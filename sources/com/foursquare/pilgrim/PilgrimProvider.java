package com.foursquare.pilgrim;

import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.foursquare.internal.util.FsLog;

@RestrictTo({Scope.LIBRARY})
public final class PilgrimProvider extends LibraryInitializingContentProvider {
    /* renamed from: a */
    private static final String f10589a = "PilgrimProvider";

    @MainThread
    protected void init(@NonNull Context context) {
        FsLog.m6800a(f10589a, "PilgrimProvider.init() start");
        new au().m6977a(context);
        FsLog.m6800a(f10589a, "PilgrimProvider.init() end");
    }
}
