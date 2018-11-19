package com.tinder.reactions.gestures.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.reactions.gestures.common.GestureEvent.State;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000b¨\u0006\u000f"}, d2 = {"Lcom/tinder/reactions/gestures/view/PullAndReleaseGrandGestureView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getGrandGestureStateObservable", "Lrx/Observable;", "Lcom/tinder/reactions/gestures/common/GestureEvent$State;", "setAnimation", "", "animationFile", "", "showTutorial", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PullAndReleaseGrandGestureView extends FrameLayout {
    /* renamed from: a */
    private HashMap f46248a;

    /* renamed from: a */
    public View m55909a(int i) {
        if (this.f46248a == null) {
            this.f46248a = new HashMap();
        }
        View view = (View) this.f46248a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f46248a.put(Integer.valueOf(i), view);
        return view;
    }

    public PullAndReleaseGrandGestureView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.view_pull_and_release_grand_gesture, this);
    }

    @NotNull
    public final Observable<State> getGrandGestureStateObservable() {
        return ((PullAndReleaseAnimationView) m55909a(C6248a.pullAndReleaseAnimation)).getGrandGestureStateObservable();
    }

    public final void setAnimation(@NotNull String str) {
        C2668g.b(str, "animationFile");
        ((PullAndReleaseAnimationView) m55909a(C6248a.pullAndReleaseAnimation)).setAnimation(str);
    }

    /* renamed from: a */
    public final void m55910a() {
        ((GrandGestureInstructionTextView) m55909a(C6248a.pullDownInstruction)).m55908a();
    }
}
