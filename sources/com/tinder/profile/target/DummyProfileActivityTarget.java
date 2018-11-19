package com.tinder.profile.target;

import android.support.annotation.NonNull;
import com.tinder.profile.model.Profile;
import java.util.List;

public interface DummyProfileActivityTarget {
    void showGroupRecProfile(@NonNull List<Profile> list);

    void showRecProfile(@NonNull Profile profile, int i);
}
