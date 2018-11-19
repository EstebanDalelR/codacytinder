package com.tinder.reactions.common.view;

import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0014"}, d2 = {"Lcom/tinder/reactions/common/view/EmptyOnGestureListener;", "Landroid/view/GestureDetector$OnGestureListener;", "()V", "onDown", "", "e", "Landroid/view/MotionEvent;", "onFling", "e1", "e2", "velocityX", "", "velocityY", "onLongPress", "", "onScroll", "distanceX", "distanceY", "onShowPress", "onSingleTapUp", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.common.view.a */
public class C14617a implements OnGestureListener {
    public boolean onDown(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "e");
        return false;
    }

    public boolean onFling(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2, float f, float f2) {
        C2668g.b(motionEvent, "e1");
        C2668g.b(motionEvent2, "e2");
        return false;
    }

    public void onLongPress(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "e");
    }

    public boolean onScroll(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2, float f, float f2) {
        C2668g.b(motionEvent, "e1");
        C2668g.b(motionEvent2, "e2");
        return false;
    }

    public void onShowPress(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "e");
    }

    public boolean onSingleTapUp(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "e");
        return false;
    }
}
