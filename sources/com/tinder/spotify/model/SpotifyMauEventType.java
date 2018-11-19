package com.tinder.spotify.model;

public enum SpotifyMauEventType {
    EXTERNAL_PREVIEW_PLAY {
        public String toString() {
            return "external-preview-play";
        }
    },
    EXTERNAL_ENGAGEMENT {
        public String toString() {
            return "external-engagement";
        }
    }
}
