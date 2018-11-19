package com.tinder.addy;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/addy/LoaderPriority;", "", "priority", "", "(Ljava/lang/String;II)V", "getPriority$addy_release", "()I", "setPriority$addy_release", "(I)V", "HIGH", "MEDIUM", "LOW", "addy_release"}, k = 1, mv = {1, 1, 10})
public enum LoaderPriority {
    ;
    
    private int priority;

    protected LoaderPriority(int i) {
        this.priority = i;
    }

    public final int getPriority$addy_release() {
        return this.priority;
    }

    public final void setPriority$addy_release(int i) {
        this.priority = i;
    }
}
