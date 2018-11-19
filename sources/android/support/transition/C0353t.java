package android.support.transition;

import android.support.transition.C0351r.C0350a;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.t */
public class C0353t {
    /* renamed from: a */
    private ViewGroup f1189a;
    /* renamed from: b */
    private Runnable f1190b;

    /* renamed from: a */
    public void m1295a() {
        if (C0353t.m1293a(this.f1189a) == this && this.f1190b != null) {
            this.f1190b.run();
        }
    }

    /* renamed from: a */
    static void m1294a(View view, C0353t c0353t) {
        view.setTag(C0350a.transition_current_scene, c0353t);
    }

    /* renamed from: a */
    static C0353t m1293a(View view) {
        return (C0353t) view.getTag(C0350a.transition_current_scene);
    }
}
