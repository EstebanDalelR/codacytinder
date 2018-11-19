package com.tinder.profile.target;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.ProfileFeature;
import com.tinder.profile.model.ProfileShareAction;
import com.tinder.profile.model.ProfileShareSource;
import com.tinder.screenshotty.p401a.C14826a;
import java.util.List;

public interface ProfileTarget {
    void createChooserToShareScreenshottedProfile(Profile profile, String str, @Nullable Uri uri, String str2, ProfileShareSource profileShareSource, ProfileShareAction profileShareAction);

    void exit();

    void sendScreenshotInAppNotification(@NonNull Profile profile, C14826a c14826a);

    void showProfile(@NonNull Profile profile, @NonNull List<ProfileFeature> list);
}
