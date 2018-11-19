package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.app.C0390f;
import android.support.v4.media.C0503b.C0498a;
import android.support.v4.media.C0503b.C0500c;
import android.support.v4.media.C0503b.C0501d;
import android.support.v4.media.C0504c.C2860a;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.C2880a;
import android.text.TextUtils;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MediaBrowserCompat {
    /* renamed from: a */
    static final boolean f1540a = Log.isLoggable("MediaBrowserCompat", 3);
    /* renamed from: b */
    private final C0462e f1541b;

    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new C04561();
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$1 */
        static class C04561 implements Creator<MediaItem> {
            C04561() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1759a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1760a(i);
            }

            /* renamed from: a */
            public MediaItem m1759a(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: a */
            public MediaItem[] m1760a(int i) {
                return new MediaItem[i];
            }
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface Flags {
        }

        public int describeContents() {
            return 0;
        }

        public static MediaItem fromMediaItem(Object obj) {
            if (obj != null) {
                if (VERSION.SDK_INT >= 21) {
                    return new MediaItem(MediaDescriptionCompat.fromMediaDescription(C0500c.m1859b(obj)), C0500c.m1858a(obj));
                }
            }
            return null;
        }

        public static List<MediaItem> fromMediaItemList(List<?> list) {
            if (list != null) {
                if (VERSION.SDK_INT >= 21) {
                    List<MediaItem> arrayList = new ArrayList(list.size());
                    for (Object fromMediaItem : list) {
                        arrayList.add(fromMediaItem(fromMediaItem));
                    }
                    return arrayList;
                }
            }
            return null;
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            } else {
                this.mFlags = i;
                this.mDescription = mediaDescriptionCompat;
            }
        }

        MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("MediaItem{");
            stringBuilder.append("mFlags=");
            stringBuilder.append(this.mFlags);
            stringBuilder.append(", mDescription=");
            stringBuilder.append(this.mDescription);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        public int getFlags() {
            return this.mFlags;
        }

        public boolean isBrowsable() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isPlayable() {
            return (this.mFlags & 2) != 0;
        }

        @NonNull
        public MediaDescriptionCompat getDescription() {
            return this.mDescription;
        }

        @Nullable
        public String getMediaId() {
            return this.mDescription.getMediaId();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    private static class C0457a extends Handler {
        /* renamed from: a */
        private final WeakReference<C0468j> f1521a;
        /* renamed from: b */
        private WeakReference<Messenger> f1522b;

        C0457a(C0468j c0468j) {
            this.f1521a = new WeakReference(c0468j);
        }

        public void handleMessage(android.os.Message r8) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r7 = this;
            r0 = r7.f1522b;
            if (r0 == 0) goto L_0x00a4;
        L_0x0004:
            r0 = r7.f1522b;
            r0 = r0.get();
            if (r0 == 0) goto L_0x00a4;
        L_0x000c:
            r0 = r7.f1521a;
            r0 = r0.get();
            if (r0 != 0) goto L_0x0016;
        L_0x0014:
            goto L_0x00a4;
        L_0x0016:
            r0 = r8.getData();
            r1 = android.support.v4.media.session.MediaSessionCompat.class;
            r1 = r1.getClassLoader();
            r0.setClassLoader(r1);
            r1 = r7.f1521a;
            r1 = r1.get();
            r1 = (android.support.v4.media.MediaBrowserCompat.C0468j) r1;
            r2 = r7.f1522b;
            r2 = r2.get();
            r2 = (android.os.Messenger) r2;
            r3 = 1;
            r4 = r8.what;	 Catch:{ BadParcelableException -> 0x0095 }
            switch(r4) {
                case 1: goto L_0x0056;
                case 2: goto L_0x0052;
                case 3: goto L_0x003c;
                default: goto L_0x0039;
            };	 Catch:{ BadParcelableException -> 0x0095 }
        L_0x0039:
            r0 = "MediaBrowserCompat";	 Catch:{ BadParcelableException -> 0x0095 }
            goto L_0x006e;	 Catch:{ BadParcelableException -> 0x0095 }
        L_0x003c:
            r4 = "data_media_item_id";	 Catch:{ BadParcelableException -> 0x0095 }
            r4 = r0.getString(r4);	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = "data_media_item_list";	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = r0.getParcelableArrayList(r5);	 Catch:{ BadParcelableException -> 0x0095 }
            r6 = "data_options";	 Catch:{ BadParcelableException -> 0x0095 }
            r0 = r0.getBundle(r6);	 Catch:{ BadParcelableException -> 0x0095 }
            r1.mo478a(r2, r4, r5, r0);	 Catch:{ BadParcelableException -> 0x0095 }
            goto L_0x00a3;	 Catch:{ BadParcelableException -> 0x0095 }
        L_0x0052:
            r1.mo476a(r2);	 Catch:{ BadParcelableException -> 0x0095 }
            goto L_0x00a3;	 Catch:{ BadParcelableException -> 0x0095 }
        L_0x0056:
            r4 = "data_media_item_id";	 Catch:{ BadParcelableException -> 0x0095 }
            r4 = r0.getString(r4);	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = "data_media_session_token";	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = r0.getParcelable(r5);	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = (android.support.v4.media.session.MediaSessionCompat.Token) r5;	 Catch:{ BadParcelableException -> 0x0095 }
            r6 = "data_root_hints";	 Catch:{ BadParcelableException -> 0x0095 }
            r0 = r0.getBundle(r6);	 Catch:{ BadParcelableException -> 0x0095 }
            r1.mo477a(r2, r4, r5, r0);	 Catch:{ BadParcelableException -> 0x0095 }
            goto L_0x00a3;	 Catch:{ BadParcelableException -> 0x0095 }
        L_0x006e:
            r4 = new java.lang.StringBuilder;	 Catch:{ BadParcelableException -> 0x0095 }
            r4.<init>();	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = "Unhandled message: ";	 Catch:{ BadParcelableException -> 0x0095 }
            r4.append(r5);	 Catch:{ BadParcelableException -> 0x0095 }
            r4.append(r8);	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = "\n  Client version: ";	 Catch:{ BadParcelableException -> 0x0095 }
            r4.append(r5);	 Catch:{ BadParcelableException -> 0x0095 }
            r4.append(r3);	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = "\n  Service version: ";	 Catch:{ BadParcelableException -> 0x0095 }
            r4.append(r5);	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = r8.arg1;	 Catch:{ BadParcelableException -> 0x0095 }
            r4.append(r5);	 Catch:{ BadParcelableException -> 0x0095 }
            r4 = r4.toString();	 Catch:{ BadParcelableException -> 0x0095 }
            android.util.Log.w(r0, r4);	 Catch:{ BadParcelableException -> 0x0095 }
            goto L_0x00a3;
        L_0x0095:
            r0 = "MediaBrowserCompat";
            r4 = "Could not unparcel the data.";
            android.util.Log.e(r0, r4);
            r8 = r8.what;
            if (r8 != r3) goto L_0x00a3;
        L_0x00a0:
            r1.mo476a(r2);
        L_0x00a3:
            return;
        L_0x00a4:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.a.handleMessage(android.os.Message):void");
        }

        /* renamed from: a */
        void m1761a(Messenger messenger) {
            this.f1522b = new WeakReference(messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0459b {
        /* renamed from: a */
        final Object f1523a;
        /* renamed from: b */
        C0458a f1524b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        interface C0458a {
            /* renamed from: a */
            void mo475a();

            /* renamed from: b */
            void mo479b();

            /* renamed from: c */
            void mo480c();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        private class C2851b implements C0498a {
            /* renamed from: a */
            final /* synthetic */ C0459b f9044a;

            C2851b(C0459b c0459b) {
                this.f9044a = c0459b;
            }

            /* renamed from: a */
            public void mo472a() {
                if (this.f9044a.f1524b != null) {
                    this.f9044a.f1524b.mo475a();
                }
                this.f9044a.mo554a();
            }

            /* renamed from: b */
            public void mo473b() {
                if (this.f9044a.f1524b != null) {
                    this.f9044a.f1524b.mo479b();
                }
                this.f9044a.mo555b();
            }

            /* renamed from: c */
            public void mo474c() {
                if (this.f9044a.f1524b != null) {
                    this.f9044a.f1524b.mo480c();
                }
                this.f9044a.mo556c();
            }
        }

        /* renamed from: a */
        public void mo554a() {
        }

        /* renamed from: b */
        public void mo555b() {
        }

        /* renamed from: c */
        public void mo556c() {
        }

        public C0459b() {
            if (VERSION.SDK_INT >= 21) {
                this.f1523a = C0503b.m1863a(new C2851b(this));
            } else {
                this.f1523a = null;
            }
        }

        /* renamed from: a */
        void m1766a(C0458a c0458a) {
            this.f1524b = c0458a;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0460c {
        /* renamed from: a */
        public void m1769a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: b */
        public void m1770b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: c */
        public void m1771c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static abstract class C0461d {
        /* renamed from: a */
        public void m1772a(MediaItem mediaItem) {
        }

        /* renamed from: a */
        public void m1773a(@NonNull String str) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    interface C0462e {
        /* renamed from: d */
        void mo481d();

        /* renamed from: e */
        void mo482e();

        @NonNull
        /* renamed from: f */
        Token mo483f();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    interface C0468j {
        /* renamed from: a */
        void mo476a(Messenger messenger);

        /* renamed from: a */
        void mo477a(Messenger messenger, String str, Token token, Bundle bundle);

        /* renamed from: a */
        void mo478a(Messenger messenger, String str, List list, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class C0469k {
        /* renamed from: a */
        public void m1782a(@NonNull String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void m1783a(@NonNull String str, Bundle bundle, @NonNull List<MediaItem> list) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    private static class C0470l {
        /* renamed from: a */
        private Messenger f1533a;
        /* renamed from: b */
        private Bundle f1534b;

        public C0470l(IBinder iBinder, Bundle bundle) {
            this.f1533a = new Messenger(iBinder);
            this.f1534b = bundle;
        }

        /* renamed from: a */
        void m1785a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f1534b);
            m1784a(1, bundle, messenger);
        }

        /* renamed from: a */
        void m1786a(Messenger messenger) throws RemoteException {
            m1784a(2, null, messenger);
        }

        /* renamed from: a */
        void m1787a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            C0390f.m1454a(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            m1784a(3, bundle2, messenger);
        }

        /* renamed from: b */
        void m1788b(Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putBundle("data_root_hints", this.f1534b);
            m1784a(6, bundle, messenger);
        }

        /* renamed from: c */
        void m1789c(Messenger messenger) throws RemoteException {
            m1784a(7, null, messenger);
        }

        /* renamed from: a */
        private void m1784a(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f1533a.send(obtain);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$m */
    private static class C0471m {
        /* renamed from: a */
        private final List<C0472n> f1535a = new ArrayList();
        /* renamed from: b */
        private final List<Bundle> f1536b = new ArrayList();

        /* renamed from: a */
        public List<Bundle> m1791a() {
            return this.f1536b;
        }

        /* renamed from: b */
        public List<C0472n> m1792b() {
            return this.f1535a;
        }

        /* renamed from: a */
        public C0472n m1790a(Context context, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            for (context = null; context < this.f1536b.size(); context++) {
                if (C0505d.m1870a((Bundle) this.f1536b.get(context), bundle)) {
                    return (C0472n) this.f1535a.get(context);
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$n */
    public static abstract class C0472n {
        /* renamed from: a */
        WeakReference<C0471m> f1537a;
        /* renamed from: b */
        private final Object f1538b;
        /* renamed from: c */
        private final IBinder f1539c = new Binder();

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$a */
        private class C2854a implements C0501d {
            /* renamed from: a */
            final /* synthetic */ C0472n f9067a;

            C2854a(C0472n c0472n) {
                this.f9067a = c0472n;
            }

            /* renamed from: a */
            public void mo485a(@NonNull String str, List<?> list) {
                C0471m c0471m = this.f9067a.f1537a == null ? null : (C0471m) this.f9067a.f1537a.get();
                if (c0471m == null) {
                    this.f9067a.m1796a(str, MediaItem.fromMediaItemList(list));
                    return;
                }
                List fromMediaItemList = MediaItem.fromMediaItemList(list);
                List b = c0471m.m1792b();
                List a = c0471m.m1791a();
                for (int i = 0; i < b.size(); i++) {
                    Bundle bundle = (Bundle) a.get(i);
                    if (bundle == null) {
                        this.f9067a.m1796a(str, fromMediaItemList);
                    } else {
                        this.f9067a.m1797a(str, m11290a(fromMediaItemList, bundle), bundle);
                    }
                }
            }

            /* renamed from: a */
            public void mo484a(@NonNull String str) {
                this.f9067a.m1794a(str);
            }

            /* renamed from: a */
            List<MediaItem> m11290a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                bundle = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && bundle == -1) {
                    return list;
                }
                int i2 = bundle * i;
                int i3 = i2 + bundle;
                if (i >= 0 && bundle >= 1) {
                    if (i2 < list.size()) {
                        if (i3 > list.size()) {
                            i3 = list.size();
                        }
                        return list.subList(i2, i3);
                    }
                }
                return Collections.EMPTY_LIST;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$b */
        private class C4022b extends C2854a implements C2860a {
            /* renamed from: b */
            final /* synthetic */ C0472n f12776b;

            C4022b(C0472n c0472n) {
                this.f12776b = c0472n;
                super(c0472n);
            }

            /* renamed from: a */
            public void mo3041a(@NonNull String str, List<?> list, @NonNull Bundle bundle) {
                this.f12776b.m1797a(str, MediaItem.fromMediaItemList(list), bundle);
            }

            /* renamed from: a */
            public void mo3040a(@NonNull String str, @NonNull Bundle bundle) {
                this.f12776b.m1795a(str, bundle);
            }
        }

        /* renamed from: a */
        public void m1794a(@NonNull String str) {
        }

        /* renamed from: a */
        public void m1795a(@NonNull String str, @NonNull Bundle bundle) {
        }

        /* renamed from: a */
        public void m1796a(@NonNull String str, @NonNull List<MediaItem> list) {
        }

        /* renamed from: a */
        public void m1797a(@NonNull String str, @NonNull List<MediaItem> list, @NonNull Bundle bundle) {
        }

        public C0472n() {
            if (VERSION.SDK_INT >= 26) {
                this.f1538b = C0504c.m1869a(new C4022b(this));
            } else if (VERSION.SDK_INT >= 21) {
                this.f1538b = C0503b.m1864a(new C2854a(this));
            } else {
                this.f1538b = null;
            }
        }
    }

    private static class CustomActionResultReceiver extends ResultReceiver {
        private final String mAction;
        private final C0460c mCallback;
        private final Bundle mExtras;

        CustomActionResultReceiver(String str, Bundle bundle, C0460c c0460c, Handler handler) {
            super(handler);
            this.mAction = str;
            this.mExtras = bundle;
            this.mCallback = c0460c;
        }

        protected void onReceiveResult(int i, Bundle bundle) {
            if (this.mCallback != null) {
                switch (i) {
                    case -1:
                        this.mCallback.m1771c(this.mAction, this.mExtras, bundle);
                        break;
                    case 0:
                        this.mCallback.m1770b(this.mAction, this.mExtras, bundle);
                        break;
                    case 1:
                        this.mCallback.m1769a(this.mAction, this.mExtras, bundle);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown result code: ");
                        stringBuilder.append(i);
                        stringBuilder.append(" (extras=");
                        stringBuilder.append(this.mExtras);
                        stringBuilder.append(", resultData=");
                        stringBuilder.append(bundle);
                        stringBuilder.append(")");
                        Log.w("MediaBrowserCompat", stringBuilder.toString());
                        break;
                }
            }
        }
    }

    private static class ItemReceiver extends ResultReceiver {
        private final C0461d mCallback;
        private final String mMediaId;

        ItemReceiver(String str, C0461d c0461d, Handler handler) {
            super(handler);
            this.mMediaId = str;
            this.mCallback = c0461d;
        }

        protected void onReceiveResult(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i == 0 && bundle != null) {
                if (bundle.containsKey("media_item") != 0) {
                    i = bundle.getParcelable("media_item");
                    if (i != 0) {
                        if ((i instanceof MediaItem) == null) {
                            this.mCallback.m1773a(this.mMediaId);
                            return;
                        }
                    }
                    this.mCallback.m1772a((MediaItem) i);
                    return;
                }
            }
            this.mCallback.m1773a(this.mMediaId);
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {
        private final C0469k mCallback;
        private final Bundle mExtras;
        private final String mQuery;

        SearchResultReceiver(String str, Bundle bundle, C0469k c0469k, Handler handler) {
            super(handler);
            this.mQuery = str;
            this.mExtras = bundle;
            this.mCallback = c0469k;
        }

        protected void onReceiveResult(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i == 0 && bundle != null) {
                if (bundle.containsKey("search_results") != 0) {
                    i = bundle.getParcelableArray("search_results");
                    bundle = null;
                    if (i != 0) {
                        bundle = new ArrayList();
                        for (Object obj : i) {
                            bundle.add((MediaItem) obj);
                        }
                    }
                    this.mCallback.m1783a(this.mQuery, this.mExtras, bundle);
                    return;
                }
            }
            this.mCallback.m1782a(this.mQuery, this.mExtras);
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C2852f implements C0458a, C0462e, C0468j {
        /* renamed from: a */
        final Context f9045a;
        /* renamed from: b */
        protected final Object f9046b;
        /* renamed from: c */
        protected final Bundle f9047c;
        /* renamed from: d */
        protected final C0457a f9048d = new C0457a(this);
        /* renamed from: e */
        protected int f9049e;
        /* renamed from: f */
        protected C0470l f9050f;
        /* renamed from: g */
        protected Messenger f9051g;
        /* renamed from: h */
        private final C2880a<String, C0471m> f9052h = new C2880a();
        /* renamed from: i */
        private Token f9053i;

        /* renamed from: a */
        public void mo476a(Messenger messenger) {
        }

        /* renamed from: a */
        public void mo477a(Messenger messenger, String str, Token token, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo480c() {
        }

        C2852f(Context context, ComponentName componentName, C0459b c0459b, Bundle bundle) {
            this.f9045a = context;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_client_version", 1);
            this.f9047c = new Bundle(bundle);
            c0459b.m1766a(this);
            this.f9046b = C0503b.m1862a(context, componentName, c0459b.f1523a, this.f9047c);
        }

        /* renamed from: d */
        public void mo481d() {
            C0503b.m1865a(this.f9046b);
        }

        /* renamed from: e */
        public void mo482e() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = r2.f9050f;
            if (r0 == 0) goto L_0x0017;
        L_0x0004:
            r0 = r2.f9051g;
            if (r0 == 0) goto L_0x0017;
        L_0x0008:
            r0 = r2.f9050f;	 Catch:{ RemoteException -> 0x0010 }
            r1 = r2.f9051g;	 Catch:{ RemoteException -> 0x0010 }
            r0.m1789c(r1);	 Catch:{ RemoteException -> 0x0010 }
            goto L_0x0017;
        L_0x0010:
            r0 = "MediaBrowserCompat";
            r1 = "Remote error unregistering client messenger.";
            android.util.Log.i(r0, r1);
        L_0x0017:
            r0 = r2.f9046b;
            android.support.v4.media.C0503b.m1866b(r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.f.e():void");
        }

        @NonNull
        /* renamed from: f */
        public Token mo483f() {
            if (this.f9053i == null) {
                this.f9053i = Token.fromToken(C0503b.m1868d(this.f9046b));
            }
            return this.f9053i;
        }

        /* renamed from: a */
        public void mo475a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = r4.f9046b;
            r0 = android.support.v4.media.C0503b.m1867c(r0);
            if (r0 != 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r1 = "extra_service_version";
            r2 = 0;
            r1 = r0.getInt(r1, r2);
            r4.f9049e = r1;
            r1 = "extra_messenger";
            r1 = android.support.v4.app.C0390f.m1453a(r0, r1);
            if (r1 == 0) goto L_0x0042;
        L_0x001a:
            r2 = new android.support.v4.media.MediaBrowserCompat$l;
            r3 = r4.f9047c;
            r2.<init>(r1, r3);
            r4.f9050f = r2;
            r1 = new android.os.Messenger;
            r2 = r4.f9048d;
            r1.<init>(r2);
            r4.f9051g = r1;
            r1 = r4.f9048d;
            r2 = r4.f9051g;
            r1.m1761a(r2);
            r1 = r4.f9050f;	 Catch:{ RemoteException -> 0x003b }
            r2 = r4.f9051g;	 Catch:{ RemoteException -> 0x003b }
            r1.m1788b(r2);	 Catch:{ RemoteException -> 0x003b }
            goto L_0x0042;
        L_0x003b:
            r1 = "MediaBrowserCompat";
            r2 = "Remote error registering client messenger.";
            android.util.Log.i(r1, r2);
        L_0x0042:
            r1 = "extra_session_binder";
            r0 = android.support.v4.app.C0390f.m1453a(r0, r1);
            r0 = android.support.v4.media.session.IMediaSession.C2867a.m11312a(r0);
            if (r0 == 0) goto L_0x005a;
        L_0x004e:
            r1 = r4.f9046b;
            r1 = android.support.v4.media.C0503b.m1868d(r1);
            r0 = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(r1, r0);
            r4.f9053i = r0;
        L_0x005a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.f.a():void");
        }

        /* renamed from: b */
        public void mo479b() {
            this.f9050f = null;
            this.f9051g = null;
            this.f9053i = null;
            this.f9048d.m1761a(null);
        }

        /* renamed from: a */
        public void mo478a(Messenger messenger, String str, List list, Bundle bundle) {
            if (this.f9051g == messenger) {
                C0471m c0471m = (C0471m) this.f9052h.get(str);
                if (c0471m == null) {
                    if (MediaBrowserCompat.f1540a != null) {
                        list = new StringBuilder();
                        list.append("onLoadChildren for id that isn't subscribed id=");
                        list.append(str);
                        Log.d("MediaBrowserCompat", list.toString());
                    }
                    return;
                }
                messenger = c0471m.m1790a(this.f9045a, bundle);
                if (messenger != null) {
                    if (bundle == null) {
                        if (list == null) {
                            messenger.m1794a(str);
                        } else {
                            messenger.m1796a(str, list);
                        }
                    } else if (list == null) {
                        messenger.m1795a(str, bundle);
                    } else {
                        messenger.m1797a(str, list, bundle);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    static class C2853i implements C0462e, C0468j {
        /* renamed from: a */
        final Context f9054a;
        /* renamed from: b */
        final ComponentName f9055b;
        /* renamed from: c */
        final C0459b f9056c;
        /* renamed from: d */
        final Bundle f9057d;
        /* renamed from: e */
        final C0457a f9058e = new C0457a(this);
        /* renamed from: f */
        int f9059f = 1;
        /* renamed from: g */
        C0467a f9060g;
        /* renamed from: h */
        C0470l f9061h;
        /* renamed from: i */
        Messenger f9062i;
        /* renamed from: j */
        private final C2880a<String, C0471m> f9063j = new C2880a();
        /* renamed from: k */
        private String f9064k;
        /* renamed from: l */
        private Token f9065l;
        /* renamed from: m */
        private Bundle f9066m;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$1 */
        class C04631 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C2853i f1525a;

            C04631(C2853i c2853i) {
                this.f1525a = c2853i;
            }

            public void run() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r5 = this;
                r0 = r5.f1525a;
                r0 = r0.f9059f;
                if (r0 != 0) goto L_0x0007;
            L_0x0006:
                return;
            L_0x0007:
                r0 = r5.f1525a;
                r1 = 2;
                r0.f9059f = r1;
                r0 = android.support.v4.media.MediaBrowserCompat.f1540a;
                if (r0 == 0) goto L_0x0031;
            L_0x0010:
                r0 = r5.f1525a;
                r0 = r0.f9060g;
                if (r0 == 0) goto L_0x0031;
            L_0x0016:
                r0 = new java.lang.RuntimeException;
                r1 = new java.lang.StringBuilder;
                r1.<init>();
                r2 = "mServiceConnection should be null. Instead it is ";
                r1.append(r2);
                r2 = r5.f1525a;
                r2 = r2.f9060g;
                r1.append(r2);
                r1 = r1.toString();
                r0.<init>(r1);
                throw r0;
            L_0x0031:
                r0 = r5.f1525a;
                r0 = r0.f9061h;
                if (r0 == 0) goto L_0x0052;
            L_0x0037:
                r0 = new java.lang.RuntimeException;
                r1 = new java.lang.StringBuilder;
                r1.<init>();
                r2 = "mServiceBinderWrapper should be null. Instead it is ";
                r1.append(r2);
                r2 = r5.f1525a;
                r2 = r2.f9061h;
                r1.append(r2);
                r1 = r1.toString();
                r0.<init>(r1);
                throw r0;
            L_0x0052:
                r0 = r5.f1525a;
                r0 = r0.f9062i;
                if (r0 == 0) goto L_0x0073;
            L_0x0058:
                r0 = new java.lang.RuntimeException;
                r1 = new java.lang.StringBuilder;
                r1.<init>();
                r2 = "mCallbacksMessenger should be null. Instead it is ";
                r1.append(r2);
                r2 = r5.f1525a;
                r2 = r2.f9062i;
                r1.append(r2);
                r1 = r1.toString();
                r0.<init>(r1);
                throw r0;
            L_0x0073:
                r0 = new android.content.Intent;
                r1 = "android.media.browse.MediaBrowserService";
                r0.<init>(r1);
                r1 = r5.f1525a;
                r1 = r1.f9055b;
                r0.setComponent(r1);
                r1 = r5.f1525a;
                r2 = new android.support.v4.media.MediaBrowserCompat$i$a;
                r3 = r5.f1525a;
                r2.<init>(r3);
                r1.f9060g = r2;
                r1 = 0;
                r2 = r5.f1525a;	 Catch:{ Exception -> 0x009b }
                r2 = r2.f9054a;	 Catch:{ Exception -> 0x009b }
                r3 = r5.f1525a;	 Catch:{ Exception -> 0x009b }
                r3 = r3.f9060g;	 Catch:{ Exception -> 0x009b }
                r4 = 1;	 Catch:{ Exception -> 0x009b }
                r0 = r2.bindService(r0, r3, r4);	 Catch:{ Exception -> 0x009b }
                goto L_0x00b6;
            L_0x009b:
                r0 = "MediaBrowserCompat";
                r2 = new java.lang.StringBuilder;
                r2.<init>();
                r3 = "Failed binding to service ";
                r2.append(r3);
                r3 = r5.f1525a;
                r3 = r3.f9055b;
                r2.append(r3);
                r2 = r2.toString();
                android.util.Log.e(r0, r2);
                r0 = 0;
            L_0x00b6:
                if (r0 != 0) goto L_0x00c4;
            L_0x00b8:
                r0 = r5.f1525a;
                r0.m11281a();
                r0 = r5.f1525a;
                r0 = r0.f9056c;
                r0.mo556c();
            L_0x00c4:
                r0 = android.support.v4.media.MediaBrowserCompat.f1540a;
                if (r0 == 0) goto L_0x00d4;
            L_0x00c8:
                r0 = "MediaBrowserCompat";
                r1 = "connect...";
                android.util.Log.d(r0, r1);
                r0 = r5.f1525a;
                r0.m11286c();
            L_0x00d4:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.i.1.run():void");
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$2 */
        class C04642 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C2853i f1526a;

            C04642(C2853i c2853i) {
                this.f1526a = c2853i;
            }

            public void run() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r3 = this;
                r0 = r3.f1526a;
                r0 = r0.f9062i;
                if (r0 == 0) goto L_0x002c;
            L_0x0006:
                r0 = r3.f1526a;	 Catch:{ RemoteException -> 0x0012 }
                r0 = r0.f9061h;	 Catch:{ RemoteException -> 0x0012 }
                r1 = r3.f1526a;	 Catch:{ RemoteException -> 0x0012 }
                r1 = r1.f9062i;	 Catch:{ RemoteException -> 0x0012 }
                r0.m1786a(r1);	 Catch:{ RemoteException -> 0x0012 }
                goto L_0x002c;
            L_0x0012:
                r0 = "MediaBrowserCompat";
                r1 = new java.lang.StringBuilder;
                r1.<init>();
                r2 = "RemoteException during connect for ";
                r1.append(r2);
                r2 = r3.f1526a;
                r2 = r2.f9055b;
                r1.append(r2);
                r1 = r1.toString();
                android.util.Log.w(r0, r1);
            L_0x002c:
                r0 = r3.f1526a;
                r0 = r0.f9059f;
                r1 = r3.f1526a;
                r1.m11281a();
                if (r0 == 0) goto L_0x003b;
            L_0x0037:
                r1 = r3.f1526a;
                r1.f9059f = r0;
            L_0x003b:
                r0 = android.support.v4.media.MediaBrowserCompat.f1540a;
                if (r0 == 0) goto L_0x004b;
            L_0x003f:
                r0 = "MediaBrowserCompat";
                r1 = "disconnect...";
                android.util.Log.d(r0, r1);
                r0 = r3.f1526a;
                r0.m11286c();
            L_0x004b:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.i.2.run():void");
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$a */
        private class C0467a implements ServiceConnection {
            /* renamed from: a */
            final /* synthetic */ C2853i f1532a;

            C0467a(C2853i c2853i) {
                this.f1532a = c2853i;
            }

            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                m1777a(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0467a f1529c;

                    public void run() {
                        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r4 = this;
                        r0 = android.support.v4.media.MediaBrowserCompat.f1540a;
                        if (r0 == 0) goto L_0x002d;
                    L_0x0004:
                        r0 = "MediaBrowserCompat";
                        r1 = new java.lang.StringBuilder;
                        r1.<init>();
                        r2 = "MediaServiceConnection.onServiceConnected name=";
                        r1.append(r2);
                        r2 = r2;
                        r1.append(r2);
                        r2 = " binder=";
                        r1.append(r2);
                        r2 = r3;
                        r1.append(r2);
                        r1 = r1.toString();
                        android.util.Log.d(r0, r1);
                        r0 = r4.f1529c;
                        r0 = r0.f1532a;
                        r0.m11286c();
                    L_0x002d:
                        r0 = r4.f1529c;
                        r1 = "onServiceConnected";
                        r0 = r0.m1778a(r1);
                        if (r0 != 0) goto L_0x0038;
                    L_0x0037:
                        return;
                    L_0x0038:
                        r0 = r4.f1529c;
                        r0 = r0.f1532a;
                        r1 = new android.support.v4.media.MediaBrowserCompat$l;
                        r2 = r3;
                        r3 = r4.f1529c;
                        r3 = r3.f1532a;
                        r3 = r3.f9057d;
                        r1.<init>(r2, r3);
                        r0.f9061h = r1;
                        r0 = r4.f1529c;
                        r0 = r0.f1532a;
                        r1 = new android.os.Messenger;
                        r2 = r4.f1529c;
                        r2 = r2.f1532a;
                        r2 = r2.f9058e;
                        r1.<init>(r2);
                        r0.f9062i = r1;
                        r0 = r4.f1529c;
                        r0 = r0.f1532a;
                        r0 = r0.f9058e;
                        r1 = r4.f1529c;
                        r1 = r1.f1532a;
                        r1 = r1.f9062i;
                        r0.m1761a(r1);
                        r0 = r4.f1529c;
                        r0 = r0.f1532a;
                        r1 = 2;
                        r0.f9059f = r1;
                        r0 = android.support.v4.media.MediaBrowserCompat.f1540a;	 Catch:{ RemoteException -> 0x009a }
                        if (r0 == 0) goto L_0x0084;	 Catch:{ RemoteException -> 0x009a }
                    L_0x0076:
                        r0 = "MediaBrowserCompat";	 Catch:{ RemoteException -> 0x009a }
                        r1 = "ServiceCallbacks.onConnect...";	 Catch:{ RemoteException -> 0x009a }
                        android.util.Log.d(r0, r1);	 Catch:{ RemoteException -> 0x009a }
                        r0 = r4.f1529c;	 Catch:{ RemoteException -> 0x009a }
                        r0 = r0.f1532a;	 Catch:{ RemoteException -> 0x009a }
                        r0.m11286c();	 Catch:{ RemoteException -> 0x009a }
                    L_0x0084:
                        r0 = r4.f1529c;	 Catch:{ RemoteException -> 0x009a }
                        r0 = r0.f1532a;	 Catch:{ RemoteException -> 0x009a }
                        r0 = r0.f9061h;	 Catch:{ RemoteException -> 0x009a }
                        r1 = r4.f1529c;	 Catch:{ RemoteException -> 0x009a }
                        r1 = r1.f1532a;	 Catch:{ RemoteException -> 0x009a }
                        r1 = r1.f9054a;	 Catch:{ RemoteException -> 0x009a }
                        r2 = r4.f1529c;	 Catch:{ RemoteException -> 0x009a }
                        r2 = r2.f1532a;	 Catch:{ RemoteException -> 0x009a }
                        r2 = r2.f9062i;	 Catch:{ RemoteException -> 0x009a }
                        r0.m1785a(r1, r2);	 Catch:{ RemoteException -> 0x009a }
                        goto L_0x00c8;
                    L_0x009a:
                        r0 = "MediaBrowserCompat";
                        r1 = new java.lang.StringBuilder;
                        r1.<init>();
                        r2 = "RemoteException during connect for ";
                        r1.append(r2);
                        r2 = r4.f1529c;
                        r2 = r2.f1532a;
                        r2 = r2.f9055b;
                        r1.append(r2);
                        r1 = r1.toString();
                        android.util.Log.w(r0, r1);
                        r0 = android.support.v4.media.MediaBrowserCompat.f1540a;
                        if (r0 == 0) goto L_0x00c8;
                    L_0x00ba:
                        r0 = "MediaBrowserCompat";
                        r1 = "ServiceCallbacks.onConnect...";
                        android.util.Log.d(r0, r1);
                        r0 = r4.f1529c;
                        r0 = r0.f1532a;
                        r0.m11286c();
                    L_0x00c8:
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.i.a.1.run():void");
                    }
                });
            }

            public void onServiceDisconnected(final ComponentName componentName) {
                m1777a(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C0467a f1531b;

                    public void run() {
                        if (MediaBrowserCompat.f1540a) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("MediaServiceConnection.onServiceDisconnected name=");
                            stringBuilder.append(componentName);
                            stringBuilder.append(" this=");
                            stringBuilder.append(this);
                            stringBuilder.append(" mServiceConnection=");
                            stringBuilder.append(this.f1531b.f1532a.f9060g);
                            Log.d("MediaBrowserCompat", stringBuilder.toString());
                            this.f1531b.f1532a.m11286c();
                        }
                        if (this.f1531b.m1778a("onServiceDisconnected")) {
                            this.f1531b.f1532a.f9061h = null;
                            this.f1531b.f1532a.f9062i = null;
                            this.f1531b.f1532a.f9058e.m1761a(null);
                            this.f1531b.f1532a.f9059f = 4;
                            this.f1531b.f1532a.f9056c.mo555b();
                        }
                    }
                });
            }

            /* renamed from: a */
            private void m1777a(Runnable runnable) {
                if (Thread.currentThread() == this.f1532a.f9058e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    this.f1532a.f9058e.post(runnable);
                }
            }

            /* renamed from: a */
            boolean m1778a(String str) {
                if (this.f1532a.f9060g == this && this.f1532a.f9059f != 0) {
                    if (this.f1532a.f9059f != 1) {
                        return true;
                    }
                }
                if (!(this.f1532a.f9059f == 0 || this.f1532a.f9059f == 1)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(" for ");
                    stringBuilder.append(this.f1532a.f9055b);
                    stringBuilder.append(" with mServiceConnection=");
                    stringBuilder.append(this.f1532a.f9060g);
                    stringBuilder.append(" this=");
                    stringBuilder.append(this);
                    Log.i("MediaBrowserCompat", stringBuilder.toString());
                }
                return null;
            }
        }

        public C2853i(Context context, ComponentName componentName, C0459b c0459b, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (c0459b == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            } else {
                this.f9054a = context;
                this.f9055b = componentName;
                this.f9056c = c0459b;
                if (bundle == null) {
                    context = null;
                } else {
                    context = new Bundle(bundle);
                }
                this.f9057d = context;
            }
        }

        /* renamed from: d */
        public void mo481d() {
            if (this.f9059f == 0 || this.f9059f == 1) {
                this.f9059f = 2;
                this.f9058e.post(new C04631(this));
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("connect() called while neigther disconnecting nor disconnected (state=");
            stringBuilder.append(C2853i.m11279a(this.f9059f));
            stringBuilder.append(")");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: e */
        public void mo482e() {
            this.f9059f = 0;
            this.f9058e.post(new C04642(this));
        }

        /* renamed from: a */
        void m11281a() {
            if (this.f9060g != null) {
                this.f9054a.unbindService(this.f9060g);
            }
            this.f9059f = 1;
            this.f9060g = null;
            this.f9061h = null;
            this.f9062i = null;
            this.f9058e.m1761a(null);
            this.f9064k = null;
            this.f9065l = null;
        }

        /* renamed from: b */
        public boolean m11285b() {
            return this.f9059f == 3;
        }

        @NonNull
        /* renamed from: f */
        public Token mo483f() {
            if (m11285b()) {
                return this.f9065l;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getSessionToken() called while not connected(state=");
            stringBuilder.append(this.f9059f);
            stringBuilder.append(")");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public void mo477a(android.os.Messenger r6, java.lang.String r7, android.support.v4.media.session.MediaSessionCompat.Token r8, android.os.Bundle r9) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r5 = this;
            r0 = "onConnect";
            r6 = r5.m11280a(r6, r0);
            if (r6 != 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r6 = r5.f9059f;
            r0 = 2;
            if (r6 == r0) goto L_0x0030;
        L_0x000e:
            r6 = "MediaBrowserCompat";
            r7 = new java.lang.StringBuilder;
            r7.<init>();
            r8 = "onConnect from service while mState=";
            r7.append(r8);
            r8 = r5.f9059f;
            r8 = android.support.v4.media.MediaBrowserCompat.C2853i.m11279a(r8);
            r7.append(r8);
            r8 = "... ignoring";
            r7.append(r8);
            r7 = r7.toString();
            android.util.Log.w(r6, r7);
            return;
        L_0x0030:
            r5.f9064k = r7;
            r5.f9065l = r8;
            r5.f9066m = r9;
            r6 = 3;
            r5.f9059f = r6;
            r6 = android.support.v4.media.MediaBrowserCompat.f1540a;
            if (r6 == 0) goto L_0x0047;
        L_0x003d:
            r6 = "MediaBrowserCompat";
            r7 = "ServiceCallbacks.onConnect...";
            android.util.Log.d(r6, r7);
            r5.m11286c();
        L_0x0047:
            r6 = r5.f9056c;
            r6.mo554a();
            r6 = r5.f9063j;	 Catch:{ RemoteException -> 0x0097 }
            r6 = r6.entrySet();	 Catch:{ RemoteException -> 0x0097 }
            r6 = r6.iterator();	 Catch:{ RemoteException -> 0x0097 }
        L_0x0056:
            r7 = r6.hasNext();	 Catch:{ RemoteException -> 0x0097 }
            if (r7 == 0) goto L_0x009e;	 Catch:{ RemoteException -> 0x0097 }
        L_0x005c:
            r7 = r6.next();	 Catch:{ RemoteException -> 0x0097 }
            r7 = (java.util.Map.Entry) r7;	 Catch:{ RemoteException -> 0x0097 }
            r8 = r7.getKey();	 Catch:{ RemoteException -> 0x0097 }
            r8 = (java.lang.String) r8;	 Catch:{ RemoteException -> 0x0097 }
            r7 = r7.getValue();	 Catch:{ RemoteException -> 0x0097 }
            r7 = (android.support.v4.media.MediaBrowserCompat.C0471m) r7;	 Catch:{ RemoteException -> 0x0097 }
            r9 = r7.m1792b();	 Catch:{ RemoteException -> 0x0097 }
            r7 = r7.m1791a();	 Catch:{ RemoteException -> 0x0097 }
            r0 = 0;	 Catch:{ RemoteException -> 0x0097 }
        L_0x0077:
            r1 = r9.size();	 Catch:{ RemoteException -> 0x0097 }
            if (r0 >= r1) goto L_0x0056;	 Catch:{ RemoteException -> 0x0097 }
        L_0x007d:
            r1 = r5.f9061h;	 Catch:{ RemoteException -> 0x0097 }
            r2 = r9.get(r0);	 Catch:{ RemoteException -> 0x0097 }
            r2 = (android.support.v4.media.MediaBrowserCompat.C0472n) r2;	 Catch:{ RemoteException -> 0x0097 }
            r2 = r2.f1539c;	 Catch:{ RemoteException -> 0x0097 }
            r3 = r7.get(r0);	 Catch:{ RemoteException -> 0x0097 }
            r3 = (android.os.Bundle) r3;	 Catch:{ RemoteException -> 0x0097 }
            r4 = r5.f9062i;	 Catch:{ RemoteException -> 0x0097 }
            r1.m1787a(r8, r2, r3, r4);	 Catch:{ RemoteException -> 0x0097 }
            r0 = r0 + 1;
            goto L_0x0077;
        L_0x0097:
            r6 = "MediaBrowserCompat";
            r7 = "addSubscription failed with RemoteException.";
            android.util.Log.d(r6, r7);
        L_0x009e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.i.a(android.os.Messenger, java.lang.String, android.support.v4.media.session.MediaSessionCompat$Token, android.os.Bundle):void");
        }

        /* renamed from: a */
        public void mo476a(Messenger messenger) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onConnectFailed for ");
            stringBuilder.append(this.f9055b);
            Log.e("MediaBrowserCompat", stringBuilder.toString());
            if (m11280a(messenger, "onConnectFailed") != null) {
                if (this.f9059f != 2) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("onConnect from service while mState=");
                    stringBuilder2.append(C2853i.m11279a(this.f9059f));
                    stringBuilder2.append("... ignoring");
                    Log.w("MediaBrowserCompat", stringBuilder2.toString());
                    return;
                }
                m11281a();
                this.f9056c.mo556c();
            }
        }

        /* renamed from: a */
        public void mo478a(Messenger messenger, String str, List list, Bundle bundle) {
            if (m11280a(messenger, "onLoadChildren") != null) {
                if (MediaBrowserCompat.f1540a != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onLoadChildren for ");
                    stringBuilder.append(this.f9055b);
                    stringBuilder.append(" id=");
                    stringBuilder.append(str);
                    Log.d("MediaBrowserCompat", stringBuilder.toString());
                }
                C0471m c0471m = (C0471m) this.f9063j.get(str);
                if (c0471m == null) {
                    if (MediaBrowserCompat.f1540a != null) {
                        list = new StringBuilder();
                        list.append("onLoadChildren for id that isn't subscribed id=");
                        list.append(str);
                        Log.d("MediaBrowserCompat", list.toString());
                    }
                    return;
                }
                messenger = c0471m.m1790a(this.f9054a, bundle);
                if (messenger != null) {
                    if (bundle == null) {
                        if (list == null) {
                            messenger.m1794a(str);
                        } else {
                            messenger.m1796a(str, list);
                        }
                    } else if (list == null) {
                        messenger.m1795a(str, bundle);
                    } else {
                        messenger.m1797a(str, list, bundle);
                    }
                }
            }
        }

        /* renamed from: a */
        private static String m11279a(int i) {
            switch (i) {
                case 0:
                    return "CONNECT_STATE_DISCONNECTING";
                case 1:
                    return "CONNECT_STATE_DISCONNECTED";
                case 2:
                    return "CONNECT_STATE_CONNECTING";
                case 3:
                    return "CONNECT_STATE_CONNECTED";
                case 4:
                    return "CONNECT_STATE_SUSPENDED";
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("UNKNOWN/");
                    stringBuilder.append(i);
                    return stringBuilder.toString();
            }
        }

        /* renamed from: a */
        private boolean m11280a(Messenger messenger, String str) {
            if (this.f9062i == messenger && this.f9059f != null) {
                if (this.f9059f != 1) {
                    return true;
                }
            }
            if (!(this.f9059f == null || this.f9059f == 1)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" for ");
                stringBuilder.append(this.f9055b);
                stringBuilder.append(" with mCallbacksMessenger=");
                stringBuilder.append(this.f9062i);
                stringBuilder.append(" this=");
                stringBuilder.append(this);
                Log.i("MediaBrowserCompat", stringBuilder.toString());
            }
            return null;
        }

        /* renamed from: c */
        void m11286c() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("  mServiceComponent=");
            stringBuilder.append(this.f9055b);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mCallback=");
            stringBuilder.append(this.f9056c);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mRootHints=");
            stringBuilder.append(this.f9057d);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mState=");
            stringBuilder.append(C2853i.m11279a(this.f9059f));
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mServiceConnection=");
            stringBuilder.append(this.f9060g);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mServiceBinderWrapper=");
            stringBuilder.append(this.f9061h);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mCallbacksMessenger=");
            stringBuilder.append(this.f9062i);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mRootId=");
            stringBuilder.append(this.f9064k);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mMediaSessionToken=");
            stringBuilder.append(this.f9065l);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C4021g extends C2852f {
        C4021g(Context context, ComponentName componentName, C0459b c0459b, Bundle bundle) {
            super(context, componentName, c0459b, bundle);
        }
    }

    @RequiresApi(26)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    static class C4314h extends C4021g {
        C4314h(Context context, ComponentName componentName, C0459b c0459b, Bundle bundle) {
            super(context, componentName, c0459b, bundle);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0459b c0459b, Bundle bundle) {
        if (VERSION.SDK_INT >= 26) {
            this.f1541b = new C4314h(context, componentName, c0459b, bundle);
        } else if (VERSION.SDK_INT >= 23) {
            this.f1541b = new C4021g(context, componentName, c0459b, bundle);
        } else if (VERSION.SDK_INT >= 21) {
            this.f1541b = new C2852f(context, componentName, c0459b, bundle);
        } else {
            this.f1541b = new C2853i(context, componentName, c0459b, bundle);
        }
    }

    /* renamed from: a */
    public void m1798a() {
        this.f1541b.mo481d();
    }

    /* renamed from: b */
    public void m1799b() {
        this.f1541b.mo482e();
    }

    @NonNull
    /* renamed from: c */
    public Token m1800c() {
        return this.f1541b.mo483f();
    }
}
