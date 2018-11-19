package com.tinder.spotify.model;

public enum SpotifyMauType {
    START {
        public String toString() {
            return "start";
        }
    },
    SET_ANTHEM {
        public String toString() {
            return "set-anthem";
        }
    }
}
