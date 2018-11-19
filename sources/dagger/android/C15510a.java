package dagger.android;

import android.app.Activity;
import android.app.Application;
import dagger.internal.C15521i;

/* renamed from: dagger.android.a */
public final class C15510a {
    /* renamed from: a */
    public static void m57985a(Activity activity) {
        C15521i.m58001a(activity, "activity");
        Application application = activity.getApplication();
        if (application instanceof HasActivityInjector) {
            AndroidInjector activityInjector = ((HasActivityInjector) application).activityInjector();
            C15521i.m58002a(activityInjector, "%s.activityInjector() returned null", application.getClass());
            activityInjector.inject(activity);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), HasActivityInjector.class.getCanonicalName()}));
    }
}
