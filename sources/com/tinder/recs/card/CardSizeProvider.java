package com.tinder.recs.card;

import android.content.res.Resources;
import android.support.annotation.Nullable;
import javax.inject.Singleton;
import rx.Observable;
import rx.subjects.C19785a;

@Singleton
public class CardSizeProvider {
    private final C19785a<CardSize> cardSizeSubject = C19785a.w();
    private final float density = Resources.getSystem().getDisplayMetrics().density;

    public void updateSize(int i, int i2) {
        this.cardSizeSubject.onNext(new CardSize(i, i2, this.density));
    }

    public Observable<CardSize> observe() {
        return this.cardSizeSubject.e().g();
    }

    public float density() {
        return this.density;
    }

    @Nullable
    public CardSize cardSize() {
        return (CardSize) this.cardSizeSubject.A();
    }
}
