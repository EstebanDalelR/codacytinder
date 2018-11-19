package com.tinder.recs.presenter;

import com.tinder.cardstack.model.C8395a;
import com.tinder.domain.recs.model.Rec;

public abstract class RecCardPresenter<T extends C8395a<? extends Rec>> {
    public abstract void handleCardMovedToTop(T t);

    public void handleCardRemovedFromTop(T t) {
    }
}
