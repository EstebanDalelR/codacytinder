package com.tinder.video.view;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"com/tinder/video/view/MediaView$parentActivityLifecycleObserver$1", "Landroid/arch/lifecycle/LifecycleObserver;", "(Lcom/tinder/video/view/MediaView;)V", "onParentActivityPaused", "", "onParentActivityResumed", "video_release"}, k = 1, mv = {1, 1, 10})
public final class MediaView$parentActivityLifecycleObserver$1 implements LifecycleObserver {
    /* renamed from: a */
    final /* synthetic */ MediaView f12556a;

    MediaView$parentActivityLifecycleObserver$1(MediaView mediaView) {
        this.f12556a = mediaView;
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onParentActivityResumed() {
        this.f12556a.getVideoPresenter$video_release().c();
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onParentActivityPaused() {
        this.f12556a.getVideoPresenter$video_release().b();
    }
}
