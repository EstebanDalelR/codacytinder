package com.tinder.spotify.audio;

import android.support.annotation.Nullable;

public interface SpotifyAudioStreamer {

    public interface EventDelegate {
        void notifyCompleted();

        void notifyError(Exception exception);

        void notifyProgressChange(float f);

        void notifyStateChanged(State state);
    }

    public enum State {
        PREPARING,
        BUFFERING,
        PLAYING,
        STOPPED,
        ERROR
    }

    void play(@Nullable String str);

    void setEventDelegate(EventDelegate eventDelegate);

    void stop();
}
