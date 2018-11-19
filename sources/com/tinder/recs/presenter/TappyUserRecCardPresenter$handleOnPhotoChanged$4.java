package com.tinder.recs.presenter;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "call"}, k = 3, mv = {1, 1, 10})
final class TappyUserRecCardPresenter$handleOnPhotoChanged$4<T> implements Action1<Throwable> {
    public static final TappyUserRecCardPresenter$handleOnPhotoChanged$4 INSTANCE = new TappyUserRecCardPresenter$handleOnPhotoChanged$4();

    TappyUserRecCardPresenter$handleOnPhotoChanged$4() {
    }

    public final void call(@NotNull Throwable th) {
        C2668g.b(th, "throwable");
        C0001a.c(th, "addRecsPhotoViewEvent failed in handleOnPhotoChanged", new Object[0]);
    }
}
