package com.tinder.deeplink;

import com.tinder.model.User;
import com.tinder.recs.model.DeepLinkReferralInfo;

public interface DeepLinkedSharedRecInterceptor {
    boolean interceptOnProfileLoadFailed();

    boolean interceptOnProfileLoaded(User user, DeepLinkReferralInfo deepLinkReferralInfo);
}
