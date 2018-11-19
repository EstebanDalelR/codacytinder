package com.tinder.match.target;

import android.support.annotation.NonNull;
import com.tinder.match.viewmodel.NewMatchListItem;
import java.util.List;

public interface NewMatchesTarget {
    void displayFastMatchPreview(NewMatchListItem newMatchListItem);

    void displayNewMatches(@NonNull List<NewMatchListItem> list);

    void displayUntouchedMatchCount(@NonNull String str);

    void hideUntouchedMatchCount();
}
