package com.tinder.reactions.drawer.view;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/reactions/drawer/view/DrawerContainer;", "Landroid/support/v7/widget/CardView;", "Lcom/tinder/reactions/drawer/view/AnimatorTouchInterface;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "interceptor", "Lcom/tinder/reactions/drawer/view/OnTouchInterceptor;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "setTouchInterceptor", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class DrawerContainer extends CardView implements AnimatorTouchInterface {
    /* renamed from: a */
    private OnTouchInterceptor f50818a = ((OnTouchInterceptor) new C16328a());

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/reactions/drawer/view/DrawerContainer$interceptor$1", "Lcom/tinder/reactions/drawer/view/OnTouchInterceptor;", "()V", "OnTouch", "Landroid/view/MotionEvent;", "event", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.view.DrawerContainer$a */
    public static final class C16328a implements OnTouchInterceptor {
        @NotNull
        public MotionEvent OnTouch(@NotNull MotionEvent motionEvent) {
            C2668g.b(motionEvent, "event");
            return motionEvent;
        }

        C16328a() {
        }
    }

    public DrawerContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
    }

    public void setTouchInterceptor(@NotNull OnTouchInterceptor onTouchInterceptor) {
        C2668g.b(onTouchInterceptor, "interceptor");
        this.f50818a = onTouchInterceptor;
    }

    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "ev");
        super.dispatchTouchEvent(this.f50818a.OnTouch(motionEvent));
        return true;
    }
}
