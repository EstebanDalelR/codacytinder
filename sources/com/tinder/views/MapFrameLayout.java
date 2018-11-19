package com.tinder.views;

import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.v4.view.C0592b;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.model.SparksEvent;
import javax.inject.Inject;

public class MapFrameLayout extends FrameLayout {
    @Inject
    /* renamed from: a */
    ManagerAnalytics f47786a;
    /* renamed from: b */
    private C0592b f47787b;
    /* renamed from: c */
    private SimpleOnGestureListener f47788c;

    /* renamed from: com.tinder.views.MapFrameLayout$1 */
    class C154361 extends SimpleOnGestureListener {
        /* renamed from: a */
        final /* synthetic */ MapFrameLayout f47785a;

        C154361(MapFrameLayout mapFrameLayout) {
            this.f47785a = mapFrameLayout;
        }

        public boolean onFling(MotionEvent motionEvent, @NonNull MotionEvent motionEvent2, float f, float f2) {
            motionEvent = motionEvent2.getActionMasked();
            if (motionEvent == 1 || motionEvent == 4.2E-45f) {
                AsyncTask.execute(new C15469x(this));
            }
            return true;
        }

        /* renamed from: a */
        final /* synthetic */ void m57904a() {
            this.f47785a.f47786a.a(new SparksEvent("Passport.MapMove"));
        }
    }

    public MapFrameLayout(Context context) {
        super(context);
        m57905a();
    }

    public MapFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m57905a();
    }

    public MapFrameLayout(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m57905a();
    }

    /* renamed from: a */
    private void m57905a() {
        ManagerApp.e().inject(this);
        this.f47788c = new C154361(this);
        this.f47787b = new C0592b(getContext(), this.f47788c);
    }

    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        this.f47787b.a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }
}
