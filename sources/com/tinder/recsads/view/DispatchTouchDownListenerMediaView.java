package com.tinder.recsads.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.ads.MediaView;
import com.tinder.recsads.view.listeners.DispatchTouchDownListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/recsads/view/DispatchTouchDownListenerMediaView;", "Lcom/facebook/ads/MediaView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dispatchTouchDownListener", "Lcom/tinder/recsads/view/listeners/DispatchTouchDownListener;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "setOnDispatchTouchEventListener", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class DispatchTouchDownListenerMediaView extends MediaView {
    /* renamed from: a */
    private DispatchTouchDownListener f51125a;

    public DispatchTouchDownListenerMediaView(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
    }

    public DispatchTouchDownListenerMediaView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attributeSet");
        super(context, attributeSet);
    }

    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "ev");
        if (motionEvent.getAction() == 0) {
            DispatchTouchDownListener dispatchTouchDownListener = this.f51125a;
            if (dispatchTouchDownListener != null) {
                dispatchTouchDownListener.onDispatchTouchEvent();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setOnDispatchTouchEventListener(@NotNull DispatchTouchDownListener dispatchTouchDownListener) {
        C2668g.b(dispatchTouchDownListener, "dispatchTouchDownListener");
        this.f51125a = dispatchTouchDownListener;
    }
}
