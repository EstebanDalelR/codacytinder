package com.tinder.domain.match.model.visitor;

import android.support.annotation.NonNull;
import com.tinder.domain.common.model.Photo.Quality;
import com.tinder.domain.common.model.User;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match.Visitor;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.PlacesMatch;
import java.util.Collections;
import java.util.List;

public class MatchAvatarUrlsVisitor implements Visitor<List<String>> {
    private final Quality quality;

    public MatchAvatarUrlsVisitor(Quality quality) {
        this.quality = quality;
    }

    public List<String> visit(@NonNull CoreMatch coreMatch) {
        return Collections.singletonList(userAvatarUrl(coreMatch.getPerson()));
    }

    @NonNull
    private String userAvatarUrl(@NonNull User user) {
        return UserPhotoExtKt.avatarUrl(user, this.quality);
    }

    public List<String> visit(@NonNull MessageAdMatch messageAdMatch) {
        return Collections.singletonList(messageAdMatch.getLogoUrl());
    }

    public List<String> visit(@NonNull PlacesMatch placesMatch) {
        return Collections.singletonList(userAvatarUrl(placesMatch.getPerson()));
    }
}
