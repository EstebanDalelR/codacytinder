package com.tinder.recsads.view;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tinder.recsads.view.listeners.DispatchTouchDownListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/recsads/view/DispatchTouchDownListenerTextView;", "Landroid/support/v7/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dispatchTouchDownListener", "Lcom/tinder/recsads/view/listeners/DispatchTouchDownListener;", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setOnDispatchTouchEventListener", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class DispatchTouchDownListenerTextView extends AppCompatTextView {
    /* renamed from: a */
    private DispatchTouchDownListener f56000a;

    public DispatchTouchDownListenerTextView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public final void setOnDispatchTouchEventListener(@NotNull DispatchTouchDownListener dispatchTouchDownListener) {
        C2668g.b(dispatchTouchDownListener, "dispatchTouchDownListener");
        this.f56000a = dispatchTouchDownListener;
    }

    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            DispatchTouchDownListener dispatchTouchDownListener = this.f56000a;
            if (dispatchTouchDownListener != null) {
                dispatchTouchDownListener.onDispatchTouchEvent();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
