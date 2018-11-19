package com.tinder.profile.target;

import android.support.annotation.NonNull;
import com.tinder.spotify.p417c.C15047a;
import java.util.List;

public interface ProfileTopArtistsTarget {
    void hide();

    void setTopTracks(@NonNull List<C15047a> list);

    void showTopTracks();
}
