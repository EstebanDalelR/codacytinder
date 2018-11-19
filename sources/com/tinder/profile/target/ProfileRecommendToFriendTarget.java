package com.tinder.profile.target;

import android.support.annotation.ColorRes;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.ProfileShareAction;
import com.tinder.profile.model.ProfileShareSource;

public interface ProfileRecommendToFriendTarget {
    void setColorFilter(@ColorRes int i);

    void setShareComplete();

    void setShareInProgress();

    void setSubTitle(String str);

    void setSubTitleVisibility(boolean z);

    void setTitle(String str);

    void showGenericError();

    void showUserHasSharingDisabledError();

    void startShareRecIntent(String str, Profile profile, ProfileShareSource profileShareSource, ProfileShareAction profileShareAction);
}
