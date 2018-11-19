package com.google.android.gms.security;

import android.content.Intent;
import com.google.android.gms.common.C2490g;
import java.lang.reflect.Method;

public class ProviderInstaller {
    /* renamed from: a */
    private static final C2490g f16736a = C2490g.b();
    /* renamed from: b */
    private static final Object f16737b = new Object();
    /* renamed from: c */
    private static Method f16738c;

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, Intent intent);

        void onProviderInstalled();
    }
}
