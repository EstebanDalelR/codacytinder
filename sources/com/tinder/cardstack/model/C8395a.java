package com.tinder.cardstack.model;

import android.support.annotation.Nullable;
import com.tinder.cardstack.p180a.C8361a;

/* renamed from: com.tinder.cardstack.model.a */
public class C8395a<T> {
    @Nullable
    private C8361a appearingAnimation;
    @Nullable
    private C8361a disappearingAnimation;
    private String id;
    private T item;
    private boolean showRevertIndicator;

    public C8395a(String str, T t) {
        this.id = str;
        this.item = t;
    }

    public T getItem() {
        return this.item;
    }

    public String getId() {
        return this.id;
    }

    public boolean getShowRevertIndicator() {
        return this.showRevertIndicator;
    }

    public void setShowRevertIndicator(boolean z) {
        this.showRevertIndicator = z;
    }

    @Nullable
    public C8361a getAppearingAnimation() {
        return this.appearingAnimation;
    }

    public void setAppearingAnimation(@Nullable C8361a c8361a) {
        this.appearingAnimation = c8361a;
    }

    @Nullable
    public C8361a getDisappearingAnimation() {
        return this.disappearingAnimation;
    }

    public void setDisappearingAnimation(@Nullable C8361a c8361a) {
        this.disappearingAnimation = c8361a;
    }
}
