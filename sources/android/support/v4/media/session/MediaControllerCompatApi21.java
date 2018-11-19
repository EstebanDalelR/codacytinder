package android.support.v4.media.session;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.annotation.RequiresApi;
import android.view.KeyEvent;
import java.util.List;

@RequiresApi(21)
class MediaControllerCompatApi21 {

    public interface Callback {
        void onAudioInfoChanged(int i, int i2, int i3, int i4, int i5);

        void onExtrasChanged(Bundle bundle);

        void onMetadataChanged(Object obj);

        void onPlaybackStateChanged(Object obj);

        void onQueueChanged(List<?> list);

        void onQueueTitleChanged(CharSequence charSequence);

        void onSessionDestroyed();

        void onSessionEvent(String str, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompatApi21$a */
    static class C0513a<T extends Callback> extends android.media.session.MediaController.Callback {
        /* renamed from: a */
        protected final T f1625a;

        public C0513a(T t) {
            this.f1625a = t;
        }

        public void onSessionDestroyed() {
            this.f1625a.onSessionDestroyed();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            this.f1625a.onSessionEvent(str, bundle);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f1625a.onPlaybackStateChanged(playbackState);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f1625a.onMetadataChanged(mediaMetadata);
        }

        public void onQueueChanged(List<QueueItem> list) {
            this.f1625a.onQueueChanged(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f1625a.onQueueTitleChanged(charSequence);
        }

        public void onExtrasChanged(Bundle bundle) {
            this.f1625a.onExtrasChanged(bundle);
        }

        public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            this.f1625a.onAudioInfoChanged(playbackInfo.getPlaybackType(), C0514b.m1910b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompatApi21$b */
    public static class C0514b {
        /* renamed from: a */
        public static AudioAttributes m1909a(Object obj) {
            return ((PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m1910b(Object obj) {
            return C0514b.m1908a(C0514b.m1909a(obj));
        }

        /* renamed from: a */
        private static int m1908a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return null;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m1911a(Context context, Object obj) {
        return new MediaController(context, (Token) obj);
    }

    /* renamed from: a */
    public static Object m1912a(Callback callback) {
        return new C0513a(callback);
    }

    /* renamed from: a */
    public static boolean m1914a(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    /* renamed from: a */
    public static void m1913a(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }
}
