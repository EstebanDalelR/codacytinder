package com.tinder.toppicks.header;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/toppicks/header/TopPicksHeaderState;", "", "title", "", "byline", "(Ljava/lang/String;III)V", "getByline", "()I", "getTitle", "GOLD", "NON_GOLD", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public enum TopPicksHeaderState {
    ;
    
    private final int byline;
    private final int title;

    protected TopPicksHeaderState(int i, int i2) {
        this.title = i;
        this.byline = i2;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getByline() {
        return this.byline;
    }
}
