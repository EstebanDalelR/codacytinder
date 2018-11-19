package com.tinder.toppicks;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/toppicks/FadeAnimation;", "", "startAlpha", "", "endAlpha", "(Ljava/lang/String;IFF)V", "getEndAlpha", "()F", "getStartAlpha", "IN", "OUT", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public enum FadeAnimation {
    ;
    
    private final float endAlpha;
    private final float startAlpha;

    protected FadeAnimation(float f, float f2) {
        this.startAlpha = f;
        this.endAlpha = f2;
    }

    public final float getEndAlpha() {
        return this.endAlpha;
    }

    public final float getStartAlpha() {
        return this.startAlpha;
    }
}
