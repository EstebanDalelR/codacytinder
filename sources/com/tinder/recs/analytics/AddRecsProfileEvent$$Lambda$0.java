package com.tinder.recs.analytics;

import com.tinder.domain.recs.model.UserRec;
import rx.functions.Action0;

final /* synthetic */ class AddRecsProfileEvent$$Lambda$0 implements Action0 {
    private final AddRecsProfileEvent arg$1;
    private final UserRec arg$2;

    AddRecsProfileEvent$$Lambda$0(AddRecsProfileEvent addRecsProfileEvent, UserRec userRec) {
        this.arg$1 = addRecsProfileEvent;
        this.arg$2 = userRec;
    }

    public void call() {
        this.arg$1.lambda$execute$0$AddRecsProfileEvent(this.arg$2);
    }
}
