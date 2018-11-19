package com.tinder.recs.analytics;

import com.tinder.domain.recs.model.UserRec;
import rx.functions.Action0;

final /* synthetic */ class AddRecsViewEvent$$Lambda$0 implements Action0 {
    private final AddRecsViewEvent arg$1;
    private final UserRec arg$2;

    AddRecsViewEvent$$Lambda$0(AddRecsViewEvent addRecsViewEvent, UserRec userRec) {
        this.arg$1 = addRecsViewEvent;
        this.arg$2 = userRec;
    }

    public void call() {
        this.arg$1.lambda$execute$0$AddRecsViewEvent(this.arg$2);
    }
}
