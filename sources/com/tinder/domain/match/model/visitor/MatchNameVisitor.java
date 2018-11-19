package com.tinder.domain.match.model.visitor;

import android.support.annotation.NonNull;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match.Visitor;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.PlacesMatch;

public class MatchNameVisitor implements Visitor<String> {
    public String visit(@NonNull CoreMatch coreMatch) {
        return getCoreMatchName(coreMatch);
    }

    @NonNull
    private String getCoreMatchName(@NonNull CoreMatch coreMatch) {
        return coreMatch.getPerson().name();
    }

    public String visit(@NonNull MessageAdMatch messageAdMatch) {
        return messageAdMatch.getTitle();
    }

    public String visit(@NonNull PlacesMatch placesMatch) {
        return placesMatch.getPerson().name();
    }
}
