package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.C0522a.C0521a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class MediaSessionCompat {

    public interface OnActiveChangeListener {
        void onActiveChanged();
    }

    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new C05151();
        public static final int UNKNOWN_ID = -1;
        private final MediaDescriptionCompat mDescription;
        private final long mId;
        private Object mItem;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$1 */
        static class C05151 implements Creator<QueueItem> {
            C05151() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1915a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1916a(i);
            }

            /* renamed from: a */
            public QueueItem m1915a(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: a */
            public QueueItem[] m1916a(int i) {
                return new QueueItem[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            } else {
                this.mDescription = mediaDescriptionCompat;
                this.mId = j;
                this.mItem = obj;
            }
        }

        QueueItem(Parcel parcel) {
            this.mDescription = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.mId = parcel.readLong();
        }

        public MediaDescriptionCompat getDescription() {
            return this.mDescription;
        }

        public long getQueueId() {
            return this.mId;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.mDescription.writeToParcel(parcel, i);
            parcel.writeLong(this.mId);
        }

        public Object getQueueItem() {
            if (this.mItem == null) {
                if (VERSION.SDK_INT >= 21) {
                    this.mItem = C0521a.m1928a(this.mDescription.getMediaDescription(), this.mId);
                    return this.mItem;
                }
            }
            return this.mItem;
        }

        public static QueueItem fromQueueItem(Object obj) {
            if (obj != null) {
                if (VERSION.SDK_INT >= 21) {
                    return new QueueItem(obj, MediaDescriptionCompat.fromMediaDescription(C0521a.m1927a(obj)), C0521a.m1929b(obj));
                }
            }
            return null;
        }

        public static List<QueueItem> fromQueueItemList(List<?> list) {
            if (list != null) {
                if (VERSION.SDK_INT >= 21) {
                    List<QueueItem> arrayList = new ArrayList();
                    for (Object fromQueueItem : list) {
                        arrayList.add(fromQueueItem(fromQueueItem));
                    }
                    return arrayList;
                }
            }
            return null;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MediaSession.QueueItem {Description=");
            stringBuilder.append(this.mDescription);
            stringBuilder.append(", Id=");
            stringBuilder.append(this.mId);
            stringBuilder.append(" }");
            return stringBuilder.toString();
        }
    }

    static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new C05161();
        private ResultReceiver mResultReceiver;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$1 */
        static class C05161 implements Creator<ResultReceiverWrapper> {
            C05161() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1917a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1918a(i);
            }

            /* renamed from: a */
            public ResultReceiverWrapper m1917a(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: a */
            public ResultReceiverWrapper[] m1918a(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.mResultReceiver = resultReceiver;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.mResultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.mResultReceiver.writeToParcel(parcel, i);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SessionFlags {
    }

    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new C05171();
        private final IMediaSession mExtraBinder;
        private final Object mInner;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$1 */
        static class C05171 implements Creator<Token> {
            C05171() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1919a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1920a(i);
            }

            /* renamed from: a */
            public Token m1919a(Parcel parcel) {
                if (VERSION.SDK_INT >= 21) {
                    parcel = parcel.readParcelable(null);
                } else {
                    parcel = parcel.readStrongBinder();
                }
                return new Token(parcel);
            }

            /* renamed from: a */
            public Token[] m1920a(int i) {
                return new Token[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        Token(Object obj) {
            this(obj, null);
        }

        Token(Object obj, IMediaSession iMediaSession) {
            this.mInner = obj;
            this.mExtraBinder = iMediaSession;
        }

        public static Token fromToken(Object obj) {
            return fromToken(obj, null);
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public static Token fromToken(Object obj, IMediaSession iMediaSession) {
            return (obj == null || VERSION.SDK_INT < 21) ? null : new Token(C0522a.m1930a(obj), iMediaSession);
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.mInner, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.mInner);
            }
        }

        public int hashCode() {
            if (this.mInner == null) {
                return 0;
            }
            return this.mInner.hashCode();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            if (this.mInner == null) {
                if (token.mInner != null) {
                    z = false;
                }
                return z;
            } else if (token.mInner == null) {
                return false;
            } else {
                return this.mInner.equals(token.mInner);
            }
        }

        public Object getToken() {
            return this.mInner;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public IMediaSession getExtraBinder() {
            return this.mExtraBinder;
        }
    }
}
