package com.spotify.sdk.android.player;

public interface PlayerNotificationCallback {

    public enum ErrorType {
        TRACK_UNAVAILABLE,
        ERROR_PLAYBACK,
        ERROR_UNKNOWN;

        @com.spotify.jni.annotations.UsedByNativeCode
        public static com.spotify.sdk.android.player.PlayerNotificationCallback.ErrorType fromCode(int r1) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = values();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0007 }
            r1 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0007 }
            return r1;
        L_0x0007:
            r1 = ERROR_UNKNOWN;
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.sdk.android.player.PlayerNotificationCallback.ErrorType.fromCode(int):com.spotify.sdk.android.player.PlayerNotificationCallback$ErrorType");
        }
    }

    public enum EventType {
        PLAY,
        PAUSE,
        TRACK_CHANGED,
        SKIP_NEXT,
        SKIP_PREV,
        SHUFFLE_ENABLED,
        SHUFFLE_DISABLED,
        REPEAT_ENABLED,
        REPEAT_DISABLED,
        BECAME_ACTIVE,
        BECAME_INACTIVE,
        LOST_PERMISSION,
        AUDIO_FLUSH,
        END_OF_CONTEXT,
        TRACK_START,
        TRACK_END,
        EVENT_UNKNOWN;

        @com.spotify.jni.annotations.UsedByNativeCode
        public static com.spotify.sdk.android.player.PlayerNotificationCallback.EventType fromCode(int r1) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = values();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0007 }
            r1 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0007 }
            return r1;
        L_0x0007:
            r1 = EVENT_UNKNOWN;
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.sdk.android.player.PlayerNotificationCallback.EventType.fromCode(int):com.spotify.sdk.android.player.PlayerNotificationCallback$EventType");
        }
    }

    void onPlaybackError(ErrorType errorType, String str);

    void onPlaybackEvent(EventType eventType, PlayerState playerState);
}
