package com.leanplum;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.leanplum.annotations.Parser;
import com.leanplum.p069a.C2590h;

@SuppressLint({"Registered"})
public class LeanplumApplication extends Application {
    /* renamed from: a */
    private static LeanplumApplication f7839a;

    public static LeanplumApplication getInstance() {
        return f7839a;
    }

    public static Context getContext() {
        return f7839a;
    }

    public void onCreate() {
        super.onCreate();
        f7839a = this;
        LeanplumActivityHelper.enableLifecycleCallbacks(this);
        Parser.parseVariables(this);
    }

    public Resources getResources() {
        if (!C2590h.m9712a()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                return new LeanplumResources(super.getResources());
            }
        }
        return super.getResources();
    }
}
