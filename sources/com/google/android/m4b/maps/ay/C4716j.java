package com.google.android.m4b.maps.ay;

import android.os.Build.VERSION;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.de.C5334h;

/* renamed from: com.google.android.m4b.maps.ay.j */
public final class C4716j {
    /* renamed from: a */
    private C4662a f17333a = new C4662a(C5334h.f19972a);

    public C4716j() {
        this.f17333a.m20828b(27, VERSION.SDK);
        this.f17333a.m20828b(18, "SYSTEM");
    }

    /* renamed from: a */
    final C4662a m20963a() {
        return this.f17333a;
    }

    /* renamed from: a */
    public final void m20966a(boolean z) {
        this.f17333a.m20816a(4, true);
    }

    /* renamed from: a */
    public final void m20965a(String str) {
        this.f17333a.m20828b(40, str);
    }

    /* renamed from: b */
    public final String m20967b() {
        return this.f17333a.m20843h(40);
    }

    /* renamed from: b */
    public final void m20969b(String str) {
        this.f17333a.m20828b(39, str);
    }

    /* renamed from: c */
    public final String m20971c() {
        return this.f17333a.m20843h(39);
    }

    /* renamed from: a */
    public final void m20964a(int i) {
        this.f17333a.m20841f(47, i);
    }

    /* renamed from: b */
    public final void m20968b(int i) {
        this.f17333a.m20841f(48, i);
    }

    /* renamed from: c */
    public final void m20973c(String str) {
        this.f17333a.m20828b(19, str);
    }

    /* renamed from: d */
    public final void m20976d(String str) {
        this.f17333a.m20828b(38, str);
    }

    /* renamed from: b */
    public final void m20970b(boolean z) {
        this.f17333a.m20816a(45, true);
    }

    /* renamed from: c */
    public final void m20974c(boolean z) {
        this.f17333a.m20816a(29, false);
    }

    /* renamed from: e */
    public final void m20977e(String str) {
        this.f17333a.m20828b(5, str);
    }

    /* renamed from: d */
    public final String m20975d() {
        return this.f17333a.m20843h(5);
    }

    /* renamed from: f */
    public final void m20979f(String str) {
        this.f17333a.m20828b(1, str);
    }

    /* renamed from: e */
    public final boolean m20978e() {
        return this.f17333a.m20845j(1);
    }

    /* renamed from: g */
    public final void m20981g(String str) {
        this.f17333a.m20828b(6, str);
    }

    /* renamed from: f */
    public final boolean m20980f() {
        return this.f17333a.m20845j(6);
    }

    /* renamed from: c */
    public final void m20972c(int i) {
        this.f17333a.m20841f(22, i > Callback.DEFAULT_DRAG_ANIMATION_DURATION ? 3 : 1);
    }
}
