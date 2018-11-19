package com.tinder.reactions.gestures.common;

import android.support.v4.view.C0592b;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH$J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH$J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH$J0\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/reactions/gestures/common/GrandGestureTouchDelegate;", "Landroid/view/View$OnTouchListener;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "gestureDetector", "Landroid/support/v4/view/GestureDetectorCompat;", "handleActionDown", "", "event", "Landroid/view/MotionEvent;", "handleActionMove", "handleActionUp", "handleOnFling", "", "downEvent", "moveEvent", "velocityX", "", "velocityY", "onTouch", "ViewGestureListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.common.c */
public abstract class C14666c implements OnTouchListener {
    /* renamed from: a */
    private C0592b f46241a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/reactions/gestures/common/GrandGestureTouchDelegate$ViewGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "view", "Landroid/view/View;", "(Lcom/tinder/reactions/gestures/common/GrandGestureTouchDelegate;Landroid/view/View;)V", "onFling", "", "e1", "Landroid/view/MotionEvent;", "e2", "velocityX", "", "velocityY", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.common.c$a */
    public final class C14665a extends SimpleOnGestureListener {
        /* renamed from: a */
        final /* synthetic */ C14666c f46239a;
        /* renamed from: b */
        private final View f46240b;

        public C14665a(C14666c c14666c, @NotNull View view) {
            C2668g.b(view, "view");
            this.f46239a = c14666c;
            this.f46240b = view;
        }

        public boolean onFling(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2, float f, float f2) {
            C2668g.b(motionEvent, "e1");
            C2668g.b(motionEvent2, "e2");
            return this.f46239a.mo11971a(this.f46240b, motionEvent, motionEvent2, f, f2);
        }
    }

    /* renamed from: a */
    protected abstract void mo11970a(@NotNull View view, @NotNull MotionEvent motionEvent);

    /* renamed from: a */
    protected boolean mo11971a(@NotNull View view, @NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2, float f, float f2) {
        C2668g.b(view, "view");
        C2668g.b(motionEvent, "downEvent");
        C2668g.b(motionEvent2, "moveEvent");
        return false;
    }

    /* renamed from: b */
    protected abstract void mo11972b(@NotNull View view, @NotNull MotionEvent motionEvent);

    /* renamed from: c */
    protected abstract void mo11973c(@NotNull View view, @NotNull MotionEvent motionEvent);

    public C14666c(@NotNull View view) {
        C2668g.b(view, "view");
        this.f46241a = new C0592b(view.getContext(), new C14665a(this, view));
    }

    public boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        C2668g.b(view, "view");
        C2668g.b(motionEvent, "event");
        if (this.f46241a.a(motionEvent)) {
            return true;
        }
        switch (motionEvent.getAction()) {
            case 0:
                mo11973c(view, motionEvent);
                break;
            case 1:
                mo11970a(view, motionEvent);
                break;
            case 2:
                mo11972b(view, motionEvent);
                break;
            default:
                return null;
        }
        return true;
    }
}
