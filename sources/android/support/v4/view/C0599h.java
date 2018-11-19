package android.support.v4.view;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.h */
public class C0599h {
    /* renamed from: a */
    private final ViewGroup f1801a;
    /* renamed from: b */
    private int f1802b;

    public C0599h(@NonNull ViewGroup viewGroup) {
        this.f1801a = viewGroup;
    }

    /* renamed from: a */
    public void m2348a(@NonNull View view, @NonNull View view2, int i) {
        m2349a(view, view2, i, 0);
    }

    /* renamed from: a */
    public void m2349a(@NonNull View view, @NonNull View view2, int i, int i2) {
        this.f1802b = i;
    }

    /* renamed from: a */
    public int m2345a() {
        return this.f1802b;
    }

    /* renamed from: a */
    public void m2346a(@NonNull View view) {
        m2347a(view, 0);
    }

    /* renamed from: a */
    public void m2347a(@NonNull View view, int i) {
        this.f1802b = null;
    }
}
