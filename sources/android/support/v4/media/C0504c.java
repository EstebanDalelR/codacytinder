package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.media.C0503b.C0501d;
import android.support.v4.media.C0503b.C0502e;
import java.util.List;

@RequiresApi(26)
/* renamed from: android.support.v4.media.c */
class C0504c {

    /* renamed from: android.support.v4.media.c$a */
    interface C2860a extends C0501d {
        /* renamed from: a */
        void mo3040a(@NonNull String str, @NonNull Bundle bundle);

        /* renamed from: a */
        void mo3041a(@NonNull String str, List<?> list, @NonNull Bundle bundle);
    }

    /* renamed from: android.support.v4.media.c$b */
    static class C2861b<T extends C2860a> extends C0502e<T> {
        C2861b(T t) {
            super(t);
        }

        public void onChildrenLoaded(@NonNull String str, List<MediaItem> list, @NonNull Bundle bundle) {
            ((C2860a) this.a).mo3041a(str, list, bundle);
        }

        public void onError(@NonNull String str, @NonNull Bundle bundle) {
            ((C2860a) this.a).mo3040a(str, bundle);
        }
    }

    /* renamed from: a */
    static Object m1869a(C2860a c2860a) {
        return new C2861b(c2860a);
    }
}
