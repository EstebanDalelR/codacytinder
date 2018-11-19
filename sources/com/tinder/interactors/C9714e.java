package com.tinder.interactors;

import com.tinder.managers.bk;
import javax.inject.Inject;

/* renamed from: com.tinder.interactors.e */
public class C9714e {
    /* renamed from: a */
    private final bk f32305a;

    @Inject
    public C9714e(bk bkVar) {
        this.f32305a = bkVar;
    }

    /* renamed from: a */
    public boolean m40206a() {
        return this.f32305a.Y() && this.f32305a.ac();
    }
}
