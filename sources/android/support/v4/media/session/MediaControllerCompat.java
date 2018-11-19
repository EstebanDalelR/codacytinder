package android.support.v4.media.session;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.C0390f;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback.C2865a;
import android.support.v4.media.session.IMediaSession.C2867a;
import android.support.v4.media.session.MediaControllerCompatApi21.Callback;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class MediaControllerCompat {
    /* renamed from: a */
    private final C0511b f1622a;
    /* renamed from: b */
    private final Token f1623b;
    /* renamed from: c */
    private final HashSet<C0510a> f1624c = new HashSet();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0510a implements DeathRecipient {
        /* renamed from: a */
        C0509a f1614a;
        /* renamed from: b */
        boolean f1615b;
        /* renamed from: c */
        private final Object f1616c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private class C0509a extends Handler {
            /* renamed from: a */
            boolean f1612a;
            /* renamed from: b */
            final /* synthetic */ C0510a f1613b;

            public void handleMessage(Message message) {
                if (this.f1612a) {
                    switch (message.what) {
                        case 1:
                            this.f1613b.m1901a((String) message.obj, message.getData());
                            break;
                        case 2:
                            this.f1613b.m1899a((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            this.f1613b.m1897a((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            this.f1613b.m1898a((C0512f) message.obj);
                            break;
                        case 5:
                            this.f1613b.m1902a((List) message.obj);
                            break;
                        case 6:
                            this.f1613b.m1900a((CharSequence) message.obj);
                            break;
                        case 7:
                            this.f1613b.m1896a((Bundle) message.obj);
                            break;
                        case 8:
                            this.f1613b.m1904b();
                            break;
                        case 9:
                            this.f1613b.m1894a(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            this.f1613b.m1903a(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            this.f1613b.m1905b(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            this.f1613b.m1893a();
                            break;
                        default:
                            break;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private static class C2869b implements Callback {
            /* renamed from: a */
            private final WeakReference<C0510a> f9089a;

            C2869b(C0510a c0510a) {
                this.f9089a = new WeakReference(c0510a);
            }

            public void onSessionDestroyed() {
                C0510a c0510a = (C0510a) this.f9089a.get();
                if (c0510a != null) {
                    c0510a.m1904b();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                C0510a c0510a = (C0510a) this.f9089a.get();
                if (c0510a == null) {
                    return;
                }
                if (!c0510a.f1615b || VERSION.SDK_INT >= 23) {
                    c0510a.m1901a(str, bundle);
                }
            }

            public void onPlaybackStateChanged(Object obj) {
                C0510a c0510a = (C0510a) this.f9089a.get();
                if (c0510a == null) {
                    return;
                }
                if (!c0510a.f1615b) {
                    c0510a.m1899a(PlaybackStateCompat.fromPlaybackState(obj));
                }
            }

            public void onMetadataChanged(Object obj) {
                C0510a c0510a = (C0510a) this.f9089a.get();
                if (c0510a != null) {
                    c0510a.m1897a(MediaMetadataCompat.fromMediaMetadata(obj));
                }
            }

            public void onQueueChanged(List<?> list) {
                C0510a c0510a = (C0510a) this.f9089a.get();
                if (c0510a != null) {
                    c0510a.m1902a(QueueItem.fromQueueItemList(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                C0510a c0510a = (C0510a) this.f9089a.get();
                if (c0510a != null) {
                    c0510a.m1900a(charSequence);
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                C0510a c0510a = (C0510a) this.f9089a.get();
                if (c0510a != null) {
                    c0510a.m1896a(bundle);
                }
            }

            public void onAudioInfoChanged(int i, int i2, int i3, int i4, int i5) {
                C0510a c0510a = (C0510a) this.f9089a.get();
                if (c0510a != null) {
                    c0510a.m1898a(new C0512f(i, i2, i3, i4, i5));
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C4023c extends C2865a {
            /* renamed from: a */
            private final WeakReference<C0510a> f12777a;

            public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {
            }

            C4023c(C0510a c0510a) {
                this.f12777a = new WeakReference(c0510a);
            }

            public void onEvent(String str, Bundle bundle) throws RemoteException {
                C0510a c0510a = (C0510a) this.f12777a.get();
                if (c0510a != null) {
                    c0510a.m1895a(1, str, bundle);
                }
            }

            public void onSessionDestroyed() throws RemoteException {
                C0510a c0510a = (C0510a) this.f12777a.get();
                if (c0510a != null) {
                    c0510a.m1895a(8, null, null);
                }
            }

            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0510a c0510a = (C0510a) this.f12777a.get();
                if (c0510a != null) {
                    c0510a.m1895a(2, playbackStateCompat, null);
                }
            }

            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                C0510a c0510a = (C0510a) this.f12777a.get();
                if (c0510a != null) {
                    c0510a.m1895a(3, mediaMetadataCompat, null);
                }
            }

            public void onQueueChanged(List<QueueItem> list) throws RemoteException {
                C0510a c0510a = (C0510a) this.f12777a.get();
                if (c0510a != null) {
                    c0510a.m1895a(5, list, null);
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
                C0510a c0510a = (C0510a) this.f12777a.get();
                if (c0510a != null) {
                    c0510a.m1895a(6, charSequence, null);
                }
            }

            public void onCaptioningEnabledChanged(boolean z) throws RemoteException {
                C0510a c0510a = (C0510a) this.f12777a.get();
                if (c0510a != null) {
                    c0510a.m1895a(11, Boolean.valueOf(z), null);
                }
            }

            public void onRepeatModeChanged(int i) throws RemoteException {
                C0510a c0510a = (C0510a) this.f12777a.get();
                if (c0510a != null) {
                    c0510a.m1895a(9, Integer.valueOf(i), null);
                }
            }

            public void onShuffleModeChanged(int i) throws RemoteException {
                C0510a c0510a = (C0510a) this.f12777a.get();
                if (c0510a != null) {
                    c0510a.m1895a(12, Integer.valueOf(i), null);
                }
            }

            public void onExtrasChanged(Bundle bundle) throws RemoteException {
                C0510a c0510a = (C0510a) this.f12777a.get();
                if (c0510a != null) {
                    c0510a.m1895a(7, bundle, null);
                }
            }

            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C0510a c0510a = (C0510a) this.f12777a.get();
                if (c0510a != null) {
                    Object obj;
                    if (parcelableVolumeInfo != null) {
                        C0512f c0512f = new C0512f(parcelableVolumeInfo.volumeType, parcelableVolumeInfo.audioStream, parcelableVolumeInfo.controlType, parcelableVolumeInfo.maxVolume, parcelableVolumeInfo.currentVolume);
                    } else {
                        obj = null;
                    }
                    c0510a.m1895a(4, obj, null);
                }
            }

            public void onSessionReady() throws RemoteException {
                C0510a c0510a = (C0510a) this.f12777a.get();
                if (c0510a != null) {
                    c0510a.m1895a(13, null, null);
                }
            }
        }

        /* renamed from: a */
        public void m1893a() {
        }

        /* renamed from: a */
        public void m1894a(int i) {
        }

        /* renamed from: a */
        public void m1896a(Bundle bundle) {
        }

        /* renamed from: a */
        public void m1897a(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: a */
        public void m1898a(C0512f c0512f) {
        }

        /* renamed from: a */
        public void m1899a(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: a */
        public void m1900a(CharSequence charSequence) {
        }

        /* renamed from: a */
        public void m1901a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void m1902a(List<QueueItem> list) {
        }

        /* renamed from: a */
        public void m1903a(boolean z) {
        }

        /* renamed from: b */
        public void m1904b() {
        }

        /* renamed from: b */
        public void m1905b(int i) {
        }

        public C0510a() {
            if (VERSION.SDK_INT >= 21) {
                this.f1616c = MediaControllerCompatApi21.m1912a(new C2869b(this));
            } else {
                this.f1616c = new C4023c(this);
            }
        }

        /* renamed from: a */
        void m1895a(int i, Object obj, Bundle bundle) {
            if (this.f1614a != null) {
                i = this.f1614a.obtainMessage(i, obj);
                i.setData(bundle);
                i.sendToTarget();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    interface C0511b {
        /* renamed from: a */
        boolean mo557a(KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    public static final class C0512f {
        /* renamed from: a */
        private final int f1617a;
        /* renamed from: b */
        private final int f1618b;
        /* renamed from: c */
        private final int f1619c;
        /* renamed from: d */
        private final int f1620d;
        /* renamed from: e */
        private final int f1621e;

        C0512f(int i, int i2, int i3, int i4, int i5) {
            this.f1617a = i;
            this.f1618b = i2;
            this.f1619c = i3;
            this.f1620d = i4;
            this.f1621e = i5;
        }
    }

    @RequiresApi(21)
    static class MediaControllerImplApi21 implements C0511b {
        /* renamed from: a */
        protected final Object f9085a;
        /* renamed from: b */
        private final List<C0510a> f9086b = new ArrayList();
        /* renamed from: c */
        private IMediaSession f9087c;
        /* renamed from: d */
        private HashMap<C0510a, C4315a> f9088d = new HashMap();

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> mMediaControllerImpl;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21, Handler handler) {
                super(handler);
                this.mMediaControllerImpl = new WeakReference(mediaControllerImplApi21);
            }

            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.mMediaControllerImpl.get();
                if (mediaControllerImplApi21 != null) {
                    if (bundle != null) {
                        mediaControllerImplApi21.f9087c = C2867a.m11312a(C0390f.m1453a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                        mediaControllerImplApi21.m11321b();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C4315a extends C4023c {
            C4315a(C0510a c0510a) {
                super(c0510a);
            }

            public void onSessionDestroyed() throws RemoteException {
                throw new AssertionError();
            }

            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            public void onQueueChanged(List<QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            public void onExtrasChanged(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, Token token) throws RemoteException {
            this.f9085a = MediaControllerCompatApi21.m1911a(context, token.getToken());
            if (this.f9085a == null) {
                throw new RemoteException();
            }
            this.f9087c = token.getExtraBinder();
            if (this.f9087c == null) {
                m11319a();
            }
        }

        /* renamed from: a */
        public boolean mo557a(KeyEvent keyEvent) {
            return MediaControllerCompatApi21.m1914a(this.f9085a, keyEvent);
        }

        /* renamed from: a */
        public void m11322a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaControllerCompatApi21.m1913a(this.f9085a, str, bundle, resultReceiver);
        }

        /* renamed from: a */
        private void m11319a() {
            m11322a("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this, new Handler()));
        }

        /* renamed from: b */
        private void m11321b() {
            if (this.f9087c != null) {
                synchronized (this.f9086b) {
                    for (C0510a c0510a : this.f9086b) {
                        IMediaControllerCallback c4315a = new C4315a(c0510a);
                        this.f9088d.put(c0510a, c4315a);
                        c0510a.f1615b = true;
                        try {
                            this.f9087c.registerCallbackListener(c4315a);
                            c0510a.m1893a();
                        } catch (Throwable e) {
                            Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                        }
                    }
                    this.f9086b.clear();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    static class C2870e implements C0511b {
        /* renamed from: a */
        private IMediaSession f9090a;

        public C2870e(Token token) {
            this.f9090a = C2867a.m11312a((IBinder) token.getToken());
        }

        /* renamed from: a */
        public boolean mo557a(KeyEvent keyEvent) {
            if (keyEvent == null) {
                throw new IllegalArgumentException("event may not be null.");
            }
            try {
                this.f9090a.sendMediaButton(keyEvent);
            } catch (KeyEvent keyEvent2) {
                Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", keyEvent2);
            }
            return null;
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    static class C4024c extends MediaControllerImplApi21 {
        public C4024c(Context context, Token token) throws RemoteException {
            super(context, token);
        }
    }

    @RequiresApi(24)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    static class C4316d extends C4024c {
        public C4316d(Context context, Token token) throws RemoteException {
            super(context, token);
        }
    }

    public MediaControllerCompat(Context context, @NonNull Token token) throws RemoteException {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f1623b = token;
        if (VERSION.SDK_INT >= 24) {
            this.f1622a = new C4316d(context, token);
        } else if (VERSION.SDK_INT >= 23) {
            this.f1622a = new C4024c(context, token);
        } else if (VERSION.SDK_INT >= 21) {
            this.f1622a = new MediaControllerImplApi21(context, token);
        } else {
            this.f1622a = new C2870e(this.f1623b);
        }
    }

    /* renamed from: a */
    public boolean m1907a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f1622a.mo557a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
}
