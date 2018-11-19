package com.tinder.design.togglenavigationview;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.design.togglenavigationview.ScrollDetector.ChildViewFinder;
import com.tinder.design.togglenavigationview.p230a.C8832b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/design/togglenavigationview/ChildViewFinder;", "Lcom/tinder/design/togglenavigationview/ScrollDetector$ChildViewFinder;", "parentView", "Landroid/view/ViewGroup;", "selectedBackgroundRenderer", "Lcom/tinder/design/togglenavigationview/renderer/SelectedSegmentBackgroundRenderer;", "(Landroid/view/ViewGroup;Lcom/tinder/design/togglenavigationview/renderer/SelectedSegmentBackgroundRenderer;)V", "findViewUnder", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "hitTest", "", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.design.togglenavigationview.a */
public final class C11103a implements ChildViewFinder {
    /* renamed from: a */
    private final ViewGroup f35907a;
    /* renamed from: b */
    private final C8832b f35908b;

    public C11103a(@NotNull ViewGroup viewGroup, @NotNull C8832b c8832b) {
        C2668g.b(viewGroup, "parentView");
        C2668g.b(c8832b, "selectedBackgroundRenderer");
        this.f35907a = viewGroup;
        this.f35908b = c8832b;
    }

    public boolean hitTest(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        float x = motionEvent.getX();
        motionEvent = motionEvent.getY();
        return (x <= ((float) this.f35908b.m37589b()) || x >= ((float) this.f35908b.m37591c()) || motionEvent < ((float) this.f35908b.m37592d()) || motionEvent >= ((float) this.f35908b.m37593e())) ? null : true;
    }

    @Nullable
    public View findViewUnder(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        int childCount = this.f35907a.getChildCount();
        float x = motionEvent.getX();
        motionEvent = motionEvent.getY();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f35907a.getChildAt(i);
            C2668g.a(childAt, "child");
            if (x >= ((float) childAt.getLeft()) && x < ((float) childAt.getRight()) && motionEvent >= ((float) childAt.getTop()) && motionEvent < ((float) childAt.getBottom())) {
                return childAt;
            }
        }
        return null;
    }
}
