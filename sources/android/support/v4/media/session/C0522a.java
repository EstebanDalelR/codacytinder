package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.support.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: android.support.v4.media.session.a */
class C0522a {

    /* renamed from: android.support.v4.media.session.a$a */
    static class C0521a {
        /* renamed from: a */
        public static Object m1928a(Object obj, long j) {
            return new QueueItem((MediaDescription) obj, j);
        }

        /* renamed from: a */
        public static Object m1927a(Object obj) {
            return ((QueueItem) obj).getDescription();
        }

        /* renamed from: b */
        public static long m1929b(Object obj) {
            return ((QueueItem) obj).getQueueId();
        }
    }

    /* renamed from: a */
    public static Object m1930a(Object obj) {
        if (obj instanceof Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
