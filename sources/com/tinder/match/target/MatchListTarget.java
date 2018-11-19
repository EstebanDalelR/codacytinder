package com.tinder.match.target;

import android.support.annotation.NonNull;
import com.tinder.match.viewmodel.MatchListItem;
import java.util.List;

public interface MatchListTarget {
    void displayEmptyScreen();

    void displayLoadingScreen();

    void displayMatches(@NonNull List<MatchListItem> list);

    void displayNoSearchResults();

    void fadeInSearchOverlay();

    void fadeOutSearchOverlay();

    void hideKeyboard();

    void hideSearchOverlay();
}
