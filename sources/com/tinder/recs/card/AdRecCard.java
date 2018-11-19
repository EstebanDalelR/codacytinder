package com.tinder.recs.card;

import com.tinder.cardstack.model.C8395a;
import com.tinder.recs.model.AdRec;

@Deprecated
public class AdRecCard extends C8395a<AdRec> {
    public AdRecCard(AdRec adRec) {
        super(adRec.getId(), adRec);
    }
}
