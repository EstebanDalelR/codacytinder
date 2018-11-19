package com.tinder.feed.view.media;

import android.support.v4.view.C0592b;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"bindFeedItemDoubleTapListener", "", "feedItemDoubleTapListener", "Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;", "feedMediaView", "Landroid/view/View;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.media.e */
public final class C9513e {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "motionEvent", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.media.e$a */
    static final class C9511a implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C0592b f31865a;

        C9511a(C0592b c0592b) {
            this.f31865a = c0592b;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f31865a.a(motionEvent);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/feed/view/media/FeedMediaViewExtensionsKt$bindFeedItemDoubleTapListener$gestureDetector$1", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;)V", "onDoubleTapEvent", "", "e", "Landroid/view/MotionEvent;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.media.e$b */
    public static final class C9512b extends SimpleOnGestureListener {
        /* renamed from: a */
        final /* synthetic */ OnFeedItemDoubleTapListener f31866a;

        C9512b(OnFeedItemDoubleTapListener onFeedItemDoubleTapListener) {
            this.f31866a = onFeedItemDoubleTapListener;
        }

        public boolean onDoubleTapEvent(@Nullable MotionEvent motionEvent) {
            if (motionEvent != null && motionEvent.getAction() == 1) {
                this.f31866a.onDoubleTap();
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final void m39771a(@NotNull OnFeedItemDoubleTapListener onFeedItemDoubleTapListener, @NotNull View view) {
        C2668g.b(onFeedItemDoubleTapListener, "feedItemDoubleTapListener");
        C2668g.b(view, "feedMediaView");
        view.setOnTouchListener((OnTouchListener) new C9511a(new C0592b(view.getContext(), new C9512b(onFeedItemDoubleTapListener))));
    }
}
