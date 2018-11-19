package com.tinder.profile.target;

import android.support.annotation.NonNull;
import com.tinder.profile.model.Profile;

public interface UserRecProfileTarget {
    void showProfile(@NonNull Profile profile);

    void showReportDialog();

    void showReportFailure();

    void showReportSuccessful();
}
