package com.tinder.tinderplus.provider;

import android.support.annotation.NonNull;
import com.tinder.domain.tinderplus.LikeStatus;
import rx.Observable;

public interface LikeStatusProvider {
    @NonNull
    LikeStatus currentStatus();

    boolean isOutOfLikes();

    boolean justBecameOutOfLikes();

    @NonNull
    Observable<LikeStatus> observeLikeStatusUpdates();

    @NonNull
    LikeStatus previousStatus();

    void resetLikeStatus();

    void saveLikeStatus(LikeStatus likeStatus);
}
