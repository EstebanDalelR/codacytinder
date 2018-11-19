package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import java.util.List;

@RequiresApi(21)
/* renamed from: android.support.v4.media.b */
class C0503b {

    /* renamed from: android.support.v4.media.b$a */
    interface C0498a {
        /* renamed from: a */
        void mo472a();

        /* renamed from: b */
        void mo473b();

        /* renamed from: c */
        void mo474c();
    }

    /* renamed from: android.support.v4.media.b$b */
    static class C0499b<T extends C0498a> extends ConnectionCallback {
        /* renamed from: a */
        protected final T f1610a;

        public C0499b(T t) {
            this.f1610a = t;
        }

        public void onConnected() {
            this.f1610a.mo472a();
        }

        public void onConnectionSuspended() {
            this.f1610a.mo473b();
        }

        public void onConnectionFailed() {
            this.f1610a.mo474c();
        }
    }

    /* renamed from: android.support.v4.media.b$c */
    static class C0500c {
        /* renamed from: a */
        public static int m1858a(Object obj) {
            return ((MediaItem) obj).getFlags();
        }

        /* renamed from: b */
        public static Object m1859b(Object obj) {
            return ((MediaItem) obj).getDescription();
        }
    }

    /* renamed from: android.support.v4.media.b$d */
    interface C0501d {
        /* renamed from: a */
        void mo484a(@NonNull String str);

        /* renamed from: a */
        void mo485a(@NonNull String str, List<?> list);
    }

    /* renamed from: android.support.v4.media.b$e */
    static class C0502e<T extends C0501d> extends SubscriptionCallback {
        /* renamed from: a */
        protected final T f1611a;

        public C0502e(T t) {
            this.f1611a = t;
        }

        public void onChildrenLoaded(@NonNull String str, List<MediaItem> list) {
            this.f1611a.mo485a(str, list);
        }

        public void onError(@NonNull String str) {
            this.f1611a.mo484a(str);
        }
    }

    /* renamed from: a */
    public static Object m1863a(C0498a c0498a) {
        return new C0499b(c0498a);
    }

    /* renamed from: a */
    public static Object m1862a(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (ConnectionCallback) obj, bundle);
    }

    /* renamed from: a */
    public static void m1865a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* renamed from: b */
    public static void m1866b(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* renamed from: c */
    public static Bundle m1867c(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* renamed from: d */
    public static Object m1868d(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    /* renamed from: a */
    public static Object m1864a(C0501d c0501d) {
        return new C0502e(c0501d);
    }
}
