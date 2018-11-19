package com.tinder.places.recs.target;

import com.tinder.recs.card.UserRecCard;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/tinder/places/recs/target/PlacesUserRecCardTarget;", "", "bindHeadLineViews", "", "userRecCard", "Lcom/tinder/recs/card/UserRecCard;", "bindTeaser", "index", "", "teaser", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesUserRecCardTarget {
    void bindHeadLineViews(@NotNull UserRecCard userRecCard);

    void bindTeaser(int i, @NotNull String str);
}
