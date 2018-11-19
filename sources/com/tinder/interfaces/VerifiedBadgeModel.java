package com.tinder.interfaces;

import android.support.annotation.Nullable;
import com.tinder.model.Badge;
import java.util.List;

public interface VerifiedBadgeModel {
    List<Badge> getBadges();

    @Nullable
    Badge getFirstBadge();

    boolean hasBadge();

    boolean isVerified();
}
