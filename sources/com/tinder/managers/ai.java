package com.tinder.managers;

import com.tinder.interactors.C9719k;
import io.reactivex.functions.Action;

final /* synthetic */ class ai implements Action {
    /* renamed from: a */
    private final C9719k f39021a;

    private ai(C9719k c9719k) {
        this.f39021a = c9719k;
    }

    /* renamed from: a */
    static Action m48071a(C9719k c9719k) {
        return new ai(c9719k);
    }

    public void run() {
        this.f39021a.m40219a();
    }
}
