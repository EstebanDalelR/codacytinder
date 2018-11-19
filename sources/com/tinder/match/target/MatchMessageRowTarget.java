package com.tinder.match.target;

import android.support.annotation.NonNull;
import com.tinder.domain.match.model.Match;

public interface MatchMessageRowTarget {
    void navigateToChat(@NonNull Match match);
}
