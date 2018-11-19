package com.tinder.managers;

import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.p152a.C7309c;
import com.tinder.model.SparksEvent;
import javax.inject.Singleton;

@Singleton
@Deprecated
public class ManagerAnalytics {
    @NonNull
    /* renamed from: a */
    private final C2630h f32559a;
    @NonNull
    /* renamed from: b */
    private final C7309c f32560b;

    public ManagerAnalytics(@NonNull C2630h c2630h, @NonNull C7309c c7309c) {
        this.f32559a = c2630h;
        this.f32560b = c7309c;
    }

    @UiThread
    /* renamed from: a */
    public void m40477a(@NonNull SparksEvent sparksEvent) {
        this.f32559a.a(this.f32560b.a(sparksEvent));
    }
}
