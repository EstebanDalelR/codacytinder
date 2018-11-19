package com.google.android.exoplayer2.trackselection;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C2154o;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C3714d.C2254a;
import com.google.android.exoplayer2.trackselection.TrackSelection.Factory;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;

public class DefaultTrackSelector extends C3714d {
    /* renamed from: a */
    private static final int[] f13797a = new int[0];
    /* renamed from: b */
    private final Factory f13798b;
    /* renamed from: c */
    private final AtomicReference<Parameters> f13799c;

    public static final class Parameters implements Parcelable {
        public static final Creator<Parameters> CREATOR = new C22471();
        public static final Parameters DEFAULT = new Parameters();
        public final boolean allowMixedMimeAdaptiveness;
        public final boolean allowNonSeamlessAdaptiveness;
        public final int disabledTextTrackSelectionFlags;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        public final boolean forceLowestBitrate;
        public final int maxVideoBitrate;
        public final int maxVideoHeight;
        public final int maxVideoWidth;
        public final String preferredAudioLanguage;
        public final String preferredTextLanguage;
        private final SparseBooleanArray rendererDisabledFlags;
        public final boolean selectUndeterminedTextLanguage;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final int tunnelingAudioSessionId;
        public final int viewportHeight;
        public final boolean viewportOrientationMayChange;
        public final int viewportWidth;

        /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$1 */
        static class C22471 implements Creator<Parameters> {
            C22471() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m8102a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m8103a(i);
            }

            /* renamed from: a */
            public Parameters m8102a(Parcel parcel) {
                return new Parameters(parcel);
            }

            /* renamed from: a */
            public Parameters[] m8103a(int i) {
                return new Parameters[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        private Parameters() {
            this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, true, true, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, true, 0);
        }

        Parameters(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, boolean z5, boolean z6, int i5, int i6, boolean z7, int i7) {
            this.selectionOverrides = sparseArray;
            this.rendererDisabledFlags = sparseBooleanArray;
            this.preferredAudioLanguage = C2314v.m8487b(str);
            this.preferredTextLanguage = C2314v.m8487b(str2);
            this.selectUndeterminedTextLanguage = z;
            this.disabledTextTrackSelectionFlags = i;
            this.forceLowestBitrate = z2;
            this.allowMixedMimeAdaptiveness = z3;
            this.allowNonSeamlessAdaptiveness = z4;
            this.maxVideoWidth = i2;
            this.maxVideoHeight = i3;
            this.maxVideoBitrate = i4;
            this.exceedVideoConstraintsIfNecessary = z5;
            this.exceedRendererCapabilitiesIfNecessary = z6;
            this.viewportWidth = i5;
            this.viewportHeight = i6;
            this.viewportOrientationMayChange = z7;
            this.tunnelingAudioSessionId = i7;
        }

        Parameters(Parcel parcel) {
            this.selectionOverrides = readSelectionOverrides(parcel);
            this.rendererDisabledFlags = parcel.readSparseBooleanArray();
            this.preferredAudioLanguage = parcel.readString();
            this.preferredTextLanguage = parcel.readString();
            this.selectUndeterminedTextLanguage = C2314v.m8479a(parcel);
            this.disabledTextTrackSelectionFlags = parcel.readInt();
            this.forceLowestBitrate = C2314v.m8479a(parcel);
            this.allowMixedMimeAdaptiveness = C2314v.m8479a(parcel);
            this.allowNonSeamlessAdaptiveness = C2314v.m8479a(parcel);
            this.maxVideoWidth = parcel.readInt();
            this.maxVideoHeight = parcel.readInt();
            this.maxVideoBitrate = parcel.readInt();
            this.exceedVideoConstraintsIfNecessary = C2314v.m8479a(parcel);
            this.exceedRendererCapabilitiesIfNecessary = C2314v.m8479a(parcel);
            this.viewportWidth = parcel.readInt();
            this.viewportHeight = parcel.readInt();
            this.viewportOrientationMayChange = C2314v.m8479a(parcel);
            this.tunnelingAudioSessionId = parcel.readInt();
        }

        public final boolean getRendererDisabled(int i) {
            return this.rendererDisabledFlags.get(i);
        }

        public final boolean hasSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            Map map = (Map) this.selectionOverrides.get(i);
            return (map == null || map.containsKey(trackGroupArray) == 0) ? false : true;
        }

        public final SelectionOverride getSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            Map map = (Map) this.selectionOverrides.get(i);
            return map != null ? (SelectionOverride) map.get(trackGroupArray) : 0;
        }

        public C2251c buildUpon() {
            return new C2251c();
        }

        public boolean equals(@Nullable Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    Parameters parameters = (Parameters) obj;
                    if (this.selectUndeterminedTextLanguage != parameters.selectUndeterminedTextLanguage || this.disabledTextTrackSelectionFlags != parameters.disabledTextTrackSelectionFlags || this.forceLowestBitrate != parameters.forceLowestBitrate || this.allowMixedMimeAdaptiveness != parameters.allowMixedMimeAdaptiveness || this.allowNonSeamlessAdaptiveness != parameters.allowNonSeamlessAdaptiveness || this.maxVideoWidth != parameters.maxVideoWidth || this.maxVideoHeight != parameters.maxVideoHeight || this.exceedVideoConstraintsIfNecessary != parameters.exceedVideoConstraintsIfNecessary || this.exceedRendererCapabilitiesIfNecessary != parameters.exceedRendererCapabilitiesIfNecessary || this.viewportOrientationMayChange != parameters.viewportOrientationMayChange || this.viewportWidth != parameters.viewportWidth || this.viewportHeight != parameters.viewportHeight || this.maxVideoBitrate != parameters.maxVideoBitrate || this.tunnelingAudioSessionId != parameters.tunnelingAudioSessionId || !TextUtils.equals(this.preferredAudioLanguage, parameters.preferredAudioLanguage) || !TextUtils.equals(this.preferredTextLanguage, parameters.preferredTextLanguage) || !areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) || areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides) == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((this.selectUndeterminedTextLanguage * 31) + this.disabledTextTrackSelectionFlags) * 31) + this.forceLowestBitrate) * 31) + this.allowMixedMimeAdaptiveness) * 31) + this.allowNonSeamlessAdaptiveness) * 31) + this.maxVideoWidth) * 31) + this.maxVideoHeight) * 31) + this.exceedVideoConstraintsIfNecessary) * 31) + this.exceedRendererCapabilitiesIfNecessary) * 31) + this.viewportOrientationMayChange) * 31) + this.viewportWidth) * 31) + this.viewportHeight) * 31) + this.maxVideoBitrate) * 31) + this.tunnelingAudioSessionId) * 31) + this.preferredAudioLanguage.hashCode()) * 31) + this.preferredTextLanguage.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            writeSelectionOverridesToParcel(parcel, this.selectionOverrides);
            parcel.writeSparseBooleanArray(this.rendererDisabledFlags);
            parcel.writeString(this.preferredAudioLanguage);
            parcel.writeString(this.preferredTextLanguage);
            C2314v.m8471a(parcel, this.selectUndeterminedTextLanguage);
            parcel.writeInt(this.disabledTextTrackSelectionFlags);
            C2314v.m8471a(parcel, this.forceLowestBitrate);
            C2314v.m8471a(parcel, this.allowMixedMimeAdaptiveness);
            C2314v.m8471a(parcel, this.allowNonSeamlessAdaptiveness);
            parcel.writeInt(this.maxVideoWidth);
            parcel.writeInt(this.maxVideoHeight);
            parcel.writeInt(this.maxVideoBitrate);
            C2314v.m8471a(parcel, this.exceedVideoConstraintsIfNecessary);
            C2314v.m8471a(parcel, this.exceedRendererCapabilitiesIfNecessary);
            parcel.writeInt(this.viewportWidth);
            parcel.writeInt(this.viewportHeight);
            C2314v.m8471a(parcel, this.viewportOrientationMayChange);
            parcel.writeInt(this.tunnelingAudioSessionId);
        }

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> readSelectionOverrides(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                Map hashMap = new HashMap(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        private static void writeSelectionOverridesToParcel(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Map map = (Map) sparseArray.valueAt(i);
                int size2 = map.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Entry entry : map.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            int i = 0;
            while (i < size) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey >= 0) {
                    if (areSelectionOverridesEqual((Map) sparseArray.valueAt(i), (Map) sparseArray2.valueAt(indexOfKey))) {
                        i++;
                    }
                }
                return false;
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                TrackGroupArray trackGroupArray = (TrackGroupArray) entry.getKey();
                if (map2.containsKey(trackGroupArray)) {
                    if (!C2314v.m8480a(entry.getValue(), map2.get(trackGroupArray))) {
                    }
                }
                return false;
            }
            return true;
        }
    }

    public static final class SelectionOverride implements Parcelable {
        public static final Creator<SelectionOverride> CREATOR = new C22481();
        public final int groupIndex;
        public final int length;
        public final int[] tracks;

        /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride$1 */
        static class C22481 implements Creator<SelectionOverride> {
            C22481() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m8104a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m8105a(i);
            }

            /* renamed from: a */
            public SelectionOverride m8104a(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            /* renamed from: a */
            public SelectionOverride[] m8105a(int i) {
                return new SelectionOverride[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public SelectionOverride(int i, int... iArr) {
            this.groupIndex = i;
            this.tracks = Arrays.copyOf(iArr, iArr.length);
            this.length = iArr.length;
            Arrays.sort(this.tracks);
        }

        SelectionOverride(Parcel parcel) {
            this.groupIndex = parcel.readInt();
            this.length = parcel.readByte();
            this.tracks = new int[this.length];
            parcel.readIntArray(this.tracks);
        }

        public boolean containsTrack(int i) {
            for (int i2 : this.tracks) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.groupIndex * 31) + Arrays.hashCode(this.tracks);
        }

        public boolean equals(@Nullable Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    SelectionOverride selectionOverride = (SelectionOverride) obj;
                    if (this.groupIndex != selectionOverride.groupIndex || Arrays.equals(this.tracks, selectionOverride.tracks) == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.groupIndex);
            parcel.writeInt(this.tracks.length);
            parcel.writeIntArray(this.tracks);
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$a */
    private static final class C2249a {
        /* renamed from: a */
        public final int f6649a;
        /* renamed from: b */
        public final int f6650b;
        /* renamed from: c */
        public final String f6651c;

        public C2249a(int i, int i2, String str) {
            this.f6649a = i;
            this.f6650b = i2;
            this.f6651c = str;
        }

        public boolean equals(@Nullable Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C2249a c2249a = (C2249a) obj;
                    if (this.f6649a != c2249a.f6649a || this.f6650b != c2249a.f6650b || TextUtils.equals(this.f6651c, c2249a.f6651c) == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f6649a * 31) + this.f6650b) * 31) + (this.f6651c != null ? this.f6651c.hashCode() : 0);
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$b */
    private static final class C2250b implements Comparable<C2250b> {
        /* renamed from: a */
        private final Parameters f6652a;
        /* renamed from: b */
        private final int f6653b;
        /* renamed from: c */
        private final int f6654c;
        /* renamed from: d */
        private final int f6655d;
        /* renamed from: e */
        private final int f6656e;
        /* renamed from: f */
        private final int f6657f;
        /* renamed from: g */
        private final int f6658g;

        public /* synthetic */ int compareTo(@NonNull Object obj) {
            return m8106a((C2250b) obj);
        }

        public C2250b(Format format, Parameters parameters, int i) {
            this.f6652a = parameters;
            this.f6653b = DefaultTrackSelector.m17047a(i, false);
            this.f6654c = DefaultTrackSelector.m17050a(format, parameters.preferredAudioLanguage);
            i = 1;
            if ((format.selectionFlags & 1) == null) {
                i = 0;
            }
            this.f6655d = i;
            this.f6656e = format.channelCount;
            this.f6657f = format.sampleRate;
            this.f6658g = format.bitrate;
        }

        /* renamed from: a */
        public int m8106a(@NonNull C2250b c2250b) {
            if (this.f6653b != c2250b.f6653b) {
                return DefaultTrackSelector.m17058c(this.f6653b, c2250b.f6653b);
            }
            if (this.f6654c != c2250b.f6654c) {
                return DefaultTrackSelector.m17058c(this.f6654c, c2250b.f6654c);
            }
            if (this.f6655d != c2250b.f6655d) {
                return DefaultTrackSelector.m17058c(this.f6655d, c2250b.f6655d);
            }
            if (this.f6652a.forceLowestBitrate) {
                return DefaultTrackSelector.m17058c(c2250b.f6658g, this.f6658g);
            }
            int i = 1;
            if (this.f6653b != 1) {
                i = -1;
            }
            if (this.f6656e != c2250b.f6656e) {
                return i * DefaultTrackSelector.m17058c(this.f6656e, c2250b.f6656e);
            }
            if (this.f6657f != c2250b.f6657f) {
                return i * DefaultTrackSelector.m17058c(this.f6657f, c2250b.f6657f);
            }
            return i * DefaultTrackSelector.m17058c(this.f6658g, c2250b.f6658g);
        }

        public boolean equals(@Nullable Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C2250b c2250b = (C2250b) obj;
                    if (this.f6653b != c2250b.f6653b || this.f6654c != c2250b.f6654c || this.f6655d != c2250b.f6655d || this.f6656e != c2250b.f6656e || this.f6657f != c2250b.f6657f || this.f6658g != c2250b.f6658g) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((((((this.f6653b * 31) + this.f6654c) * 31) + this.f6655d) * 31) + this.f6656e) * 31) + this.f6657f) * 31) + this.f6658g;
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$c */
    public static final class C2251c {
        /* renamed from: a */
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> f6659a;
        /* renamed from: b */
        private final SparseBooleanArray f6660b;
        /* renamed from: c */
        private String f6661c;
        /* renamed from: d */
        private String f6662d;
        /* renamed from: e */
        private boolean f6663e;
        /* renamed from: f */
        private int f6664f;
        /* renamed from: g */
        private boolean f6665g;
        /* renamed from: h */
        private boolean f6666h;
        /* renamed from: i */
        private boolean f6667i;
        /* renamed from: j */
        private int f6668j;
        /* renamed from: k */
        private int f6669k;
        /* renamed from: l */
        private int f6670l;
        /* renamed from: m */
        private boolean f6671m;
        /* renamed from: n */
        private boolean f6672n;
        /* renamed from: o */
        private int f6673o;
        /* renamed from: p */
        private int f6674p;
        /* renamed from: q */
        private boolean f6675q;
        /* renamed from: r */
        private int f6676r;

        public C2251c() {
            this(Parameters.DEFAULT);
        }

        private C2251c(Parameters parameters) {
            this.f6659a = C2251c.m8107a(parameters.selectionOverrides);
            this.f6660b = parameters.rendererDisabledFlags.clone();
            this.f6661c = parameters.preferredAudioLanguage;
            this.f6662d = parameters.preferredTextLanguage;
            this.f6663e = parameters.selectUndeterminedTextLanguage;
            this.f6664f = parameters.disabledTextTrackSelectionFlags;
            this.f6665g = parameters.forceLowestBitrate;
            this.f6666h = parameters.allowMixedMimeAdaptiveness;
            this.f6667i = parameters.allowNonSeamlessAdaptiveness;
            this.f6668j = parameters.maxVideoWidth;
            this.f6669k = parameters.maxVideoHeight;
            this.f6670l = parameters.maxVideoBitrate;
            this.f6671m = parameters.exceedVideoConstraintsIfNecessary;
            this.f6672n = parameters.exceedRendererCapabilitiesIfNecessary;
            this.f6673o = parameters.viewportWidth;
            this.f6674p = parameters.viewportHeight;
            this.f6675q = parameters.viewportOrientationMayChange;
            this.f6676r = parameters.tunnelingAudioSessionId;
        }

        /* renamed from: a */
        public final C2251c m8111a(int i, boolean z) {
            if (this.f6660b.get(i) == z) {
                return this;
            }
            if (z) {
                this.f6660b.put(i, true);
            } else {
                this.f6660b.delete(i);
            }
            return this;
        }

        /* renamed from: a */
        public final C2251c m8110a(int i, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
            Map map = (Map) this.f6659a.get(i);
            if (map == null) {
                map = new HashMap();
                this.f6659a.put(i, map);
            }
            if (map.containsKey(trackGroupArray) != 0 && C2314v.m8480a(map.get(trackGroupArray), (Object) selectionOverride) != 0) {
                return this;
            }
            map.put(trackGroupArray, selectionOverride);
            return this;
        }

        /* renamed from: a */
        public final C2251c m8109a(int i) {
            Map map = (Map) this.f6659a.get(i);
            if (map != null) {
                if (!map.isEmpty()) {
                    this.f6659a.remove(i);
                    return this;
                }
            }
            return this;
        }

        /* renamed from: a */
        public Parameters m8108a() {
            SparseArray sparseArray = this.f6659a;
            SparseBooleanArray sparseBooleanArray = this.f6660b;
            String str = this.f6661c;
            String str2 = this.f6662d;
            boolean z = this.f6663e;
            int i = this.f6664f;
            boolean z2 = this.f6665g;
            boolean z3 = this.f6666h;
            boolean z4 = this.f6667i;
            int i2 = this.f6668j;
            int i3 = this.f6669k;
            int i4 = this.f6670l;
            boolean z5 = this.f6671m;
            boolean z6 = this.f6672n;
            boolean z7 = z6;
            return new Parameters(sparseArray, sparseBooleanArray, str, str2, z, i, z2, z3, z4, i2, i3, i4, z5, z7, this.f6673o, this.f6674p, this.f6675q, this.f6676r);
        }

        /* renamed from: a */
        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> m8107a(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
            }
            return sparseArray2;
        }
    }

    /* renamed from: a */
    protected static boolean m17047a(int i, boolean z) {
        i &= 7;
        if (i != 4) {
            if (!z || i != 3) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m17055b(int i, int i2) {
        return i == -1 ? i2 == -1 ? 0 : -1 : i2 == -1 ? 1 : i - i2;
    }

    /* renamed from: c */
    private static int m17058c(int i, int i2) {
        return i > i2 ? 1 : i2 > i ? -1 : 0;
    }

    public DefaultTrackSelector() {
        this((Factory) null);
    }

    public DefaultTrackSelector(Factory factory) {
        this.f13798b = factory;
        this.f13799c = new AtomicReference(Parameters.DEFAULT);
    }

    /* renamed from: a */
    public void m17065a(Parameters parameters) {
        C2289a.m8309a((Object) parameters);
        if (((Parameters) this.f13799c.getAndSet(parameters)).equals(parameters) == null) {
            m8115d();
        }
    }

    /* renamed from: a */
    public void m17066a(C2251c c2251c) {
        m17065a(c2251c.m8108a());
    }

    /* renamed from: a */
    public Parameters m17061a() {
        return (Parameters) this.f13799c.get();
    }

    /* renamed from: b */
    public C2251c m17068b() {
        return m17061a().buildUpon();
    }

    /* renamed from: a */
    protected final Pair<C2154o[], TrackSelection[]> mo3517a(C2254a c2254a, int[][][] iArr, int[] iArr2) throws ExoPlaybackException {
        Parameters parameters = (Parameters) this.f13799c.get();
        int a = c2254a.m8117a();
        TrackSelection[] a2 = m17067a(c2254a, iArr, iArr2, parameters);
        for (int i = 0; i < a; i++) {
            if (parameters.getRendererDisabled(i)) {
                a2[i] = 0;
            } else {
                TrackGroupArray b = c2254a.m8122b(i);
                if (parameters.hasSelectionOverride(i, b)) {
                    SelectionOverride selectionOverride = parameters.getSelectionOverride(i, b);
                    if (selectionOverride == null) {
                        a2[i] = 0;
                    } else if (selectionOverride.length == 1) {
                        a2[i] = new C4262c(b.get(selectionOverride.groupIndex), selectionOverride.tracks[0]);
                    } else {
                        a2[i] = this.f13798b.createTrackSelection(b.get(selectionOverride.groupIndex), selectionOverride.tracks);
                    }
                }
            }
        }
        C2154o[] c2154oArr = new C2154o[a];
        for (int i2 = 0; i2 < a; i2++) {
            Object obj = (parameters.getRendererDisabled(i2) || (c2254a.m8118a(i2) != 5 && a2[i2] == null)) ? null : 1;
            c2154oArr[i2] = obj != null ? C2154o.f6156a : null;
        }
        m17046a(c2254a, iArr, c2154oArr, a2, parameters.tunnelingAudioSessionId);
        return Pair.create(c2154oArr, a2);
    }

    /* renamed from: a */
    protected TrackSelection[] m17067a(C2254a c2254a, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
        DefaultTrackSelector defaultTrackSelector = this;
        C2254a c2254a2 = c2254a;
        Parameters parameters2 = parameters;
        int a = c2254a.m8117a();
        TrackSelection[] trackSelectionArr = new TrackSelection[a];
        Object obj = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= a) {
                break;
            }
            if (2 == c2254a2.m8118a(i)) {
                if (obj == null) {
                    trackSelectionArr[i] = m17063a(c2254a2.m8122b(i), iArr[i], iArr2[i], parameters2, defaultTrackSelector.f13798b);
                    obj = trackSelectionArr[i] != null ? 1 : null;
                }
                if (c2254a2.m8122b(i).length <= 0) {
                    i3 = 0;
                }
                i2 |= i3;
            }
            i++;
        }
        obj = null;
        Object obj2 = null;
        for (i = 0; i < a; i++) {
            int a2 = c2254a2.m8118a(i);
            switch (a2) {
                case 1:
                    if (obj != null) {
                        break;
                    }
                    trackSelectionArr[i] = m17069b(c2254a2.m8122b(i), iArr[i], iArr2[i], parameters2, i2 != 0 ? null : defaultTrackSelector.f13798b);
                    if (trackSelectionArr[i] == null) {
                        obj = null;
                        break;
                    }
                    obj = 1;
                    break;
                case 2:
                    break;
                case 3:
                    if (obj2 != null) {
                        break;
                    }
                    trackSelectionArr[i] = m17064a(c2254a2.m8122b(i), iArr[i], parameters2);
                    obj2 = trackSelectionArr[i] != null ? 1 : null;
                    break;
                default:
                    trackSelectionArr[i] = m17062a(a2, c2254a2.m8122b(i), iArr[i], parameters2);
                    break;
            }
        }
        return trackSelectionArr;
    }

    /* renamed from: a */
    protected TrackSelection m17063a(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, Factory factory) throws ExoPlaybackException {
        i = (parameters.forceLowestBitrate || factory == null) ? 0 : m17059c(trackGroupArray, iArr, i, parameters, factory);
        return i == 0 ? m17056b(trackGroupArray, iArr, parameters) : i;
    }

    /* renamed from: c */
    private static TrackSelection m17059c(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, Factory factory) throws ExoPlaybackException {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        int i2 = parameters2.allowNonSeamlessAdaptiveness ? 24 : 16;
        boolean z = parameters2.allowMixedMimeAdaptiveness && (i & i2) != 0;
        for (int i3 = 0; i3 < trackGroupArray2.length; i3++) {
            TrackGroup trackGroup = trackGroupArray2.get(i3);
            int[] a = m17054a(trackGroup, iArr[i3], z, i2, parameters2.maxVideoWidth, parameters2.maxVideoHeight, parameters2.maxVideoBitrate, parameters2.viewportWidth, parameters2.viewportHeight, parameters2.viewportOrientationMayChange);
            if (a.length > 0) {
                return factory.createTrackSelection(trackGroup, a);
            }
            Factory factory2 = factory;
        }
        return null;
    }

    /* renamed from: a */
    private static int[] m17054a(TrackGroup trackGroup, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        TrackGroup trackGroup2 = trackGroup;
        if (trackGroup2.length < 2) {
            return f13797a;
        }
        List a = m17045a(trackGroup2, i5, i6, z2);
        if (a.size() < 2) {
            return f13797a;
        }
        String str;
        if (z) {
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i7 = 0;
            for (int i8 = 0; i8 < a.size(); i8++) {
                String str3 = trackGroup2.getFormat(((Integer) a.get(i8)).intValue()).sampleMimeType;
                if (hashSet.add(str3)) {
                    int a2 = m17042a(trackGroup2, iArr, i, str3, i2, i3, i4, a);
                    if (a2 > i7) {
                        i7 = a2;
                        str2 = str3;
                    }
                }
            }
            str = str2;
        }
        m17057b(trackGroup2, iArr, i, str, i2, i3, i4, a);
        return a.size() < 2 ? f13797a : C2314v.m8481a(a);
    }

    /* renamed from: a */
    private static int m17042a(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue = ((Integer) list.get(i6)).intValue();
            if (m17051a(trackGroup.getFormat(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    /* renamed from: b */
    private static void m17057b(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) list2.get(size)).intValue();
            if (!m17051a(trackGroup.getFormat(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                list2.remove(size);
            }
        }
    }

    /* renamed from: a */
    private static boolean m17051a(Format format, String str, int i, int i2, int i3, int i4, int i5) {
        if (!m17047a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && C2314v.m8480a(format.sampleMimeType, (Object) str) == null) {
            return false;
        }
        if (format.width != -1 && format.width > i3) {
            return false;
        }
        if (format.height != -1 && format.height > i4) {
            return false;
        }
        if (format.bitrate == -1 || format.bitrate <= i5) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private static com.google.android.exoplayer2.trackselection.TrackSelection m17056b(com.google.android.exoplayer2.source.TrackGroupArray r21, int[][] r22, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r23) {
        /*
        r0 = r21;
        r1 = r23;
        r3 = -1;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = -1;
        r10 = -1;
    L_0x000b:
        r11 = r0.length;
        if (r5 >= r11) goto L_0x00db;
    L_0x000f:
        r11 = r0.get(r5);
        r12 = r1.viewportWidth;
        r13 = r1.viewportHeight;
        r14 = r1.viewportOrientationMayChange;
        r12 = m17045a(r11, r12, r13, r14);
        r14 = r22[r5];
        r15 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = 0;
    L_0x0025:
        r2 = r11.length;
        if (r6 >= r2) goto L_0x00cc;
    L_0x0029:
        r2 = r14[r6];
        r4 = r1.exceedRendererCapabilitiesIfNecessary;
        r2 = m17047a(r2, r4);
        if (r2 == 0) goto L_0x00c1;
    L_0x0033:
        r2 = r11.getFormat(r6);
        r4 = java.lang.Integer.valueOf(r6);
        r4 = r12.contains(r4);
        r18 = 1;
        if (r4 == 0) goto L_0x0065;
    L_0x0043:
        r4 = r2.width;
        if (r4 == r3) goto L_0x004d;
    L_0x0047:
        r4 = r2.width;
        r3 = r1.maxVideoWidth;
        if (r4 > r3) goto L_0x0065;
    L_0x004d:
        r3 = r2.height;
        r4 = -1;
        if (r3 == r4) goto L_0x0058;
    L_0x0052:
        r3 = r2.height;
        r4 = r1.maxVideoHeight;
        if (r3 > r4) goto L_0x0065;
    L_0x0058:
        r3 = r2.bitrate;
        r4 = -1;
        if (r3 == r4) goto L_0x0063;
    L_0x005d:
        r3 = r2.bitrate;
        r4 = r1.maxVideoBitrate;
        if (r3 > r4) goto L_0x0065;
    L_0x0063:
        r3 = 1;
        goto L_0x0066;
    L_0x0065:
        r3 = 0;
    L_0x0066:
        if (r3 != 0) goto L_0x006d;
    L_0x0068:
        r4 = r1.exceedVideoConstraintsIfNecessary;
        if (r4 != 0) goto L_0x006d;
    L_0x006c:
        goto L_0x00c1;
    L_0x006d:
        if (r3 == 0) goto L_0x0071;
    L_0x006f:
        r4 = 2;
        goto L_0x0072;
    L_0x0071:
        r4 = 1;
    L_0x0072:
        r0 = r14[r6];
        r19 = r8;
        r8 = 0;
        r0 = m17047a(r0, r8);
        if (r0 == 0) goto L_0x007f;
    L_0x007d:
        r4 = r4 + 1000;
    L_0x007f:
        if (r4 <= r9) goto L_0x0084;
    L_0x0081:
        r17 = 1;
        goto L_0x0086;
    L_0x0084:
        r17 = 0;
    L_0x0086:
        if (r4 != r9) goto L_0x00b5;
    L_0x0088:
        r8 = r1.forceLowestBitrate;
        if (r8 == 0) goto L_0x009a;
    L_0x008c:
        r0 = r2.bitrate;
        r0 = m17055b(r0, r10);
        if (r0 >= 0) goto L_0x0097;
    L_0x0094:
        r17 = 1;
        goto L_0x00b5;
    L_0x0097:
        r17 = 0;
        goto L_0x00b5;
    L_0x009a:
        r8 = r2.getPixelCount();
        if (r8 == r15) goto L_0x00a5;
    L_0x00a0:
        r8 = m17055b(r8, r15);
        goto L_0x00ab;
    L_0x00a5:
        r8 = r2.bitrate;
        r8 = m17055b(r8, r10);
    L_0x00ab:
        if (r0 == 0) goto L_0x00b2;
    L_0x00ad:
        if (r3 == 0) goto L_0x00b2;
    L_0x00af:
        if (r8 <= 0) goto L_0x0097;
    L_0x00b1:
        goto L_0x0094;
    L_0x00b2:
        if (r8 >= 0) goto L_0x0097;
    L_0x00b4:
        goto L_0x0094;
    L_0x00b5:
        if (r17 == 0) goto L_0x00c3;
    L_0x00b7:
        r10 = r2.bitrate;
        r15 = r2.getPixelCount();
        r9 = r4;
        r8 = r6;
        r7 = r11;
        goto L_0x00c5;
    L_0x00c1:
        r19 = r8;
    L_0x00c3:
        r8 = r19;
    L_0x00c5:
        r6 = r6 + 1;
        r0 = r21;
        r3 = -1;
        goto L_0x0025;
    L_0x00cc:
        r19 = r8;
        r5 = r5 + 1;
        r6 = r7;
        r8 = r9;
        r9 = r10;
        r10 = r15;
        r7 = r19;
        r0 = r21;
        r3 = -1;
        goto L_0x000b;
    L_0x00db:
        if (r6 != 0) goto L_0x00e0;
    L_0x00dd:
        r16 = 0;
        goto L_0x00e7;
    L_0x00e0:
        r2 = new com.google.android.exoplayer2.trackselection.c;
        r2.<init>(r6, r7);
        r16 = r2;
    L_0x00e7:
        return r16;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.b(com.google.android.exoplayer2.source.TrackGroupArray, int[][], com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.google.android.exoplayer2.trackselection.TrackSelection");
    }

    /* renamed from: b */
    protected TrackSelection m17069b(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, Factory factory) throws ExoPlaybackException {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        Factory factory2 = factory;
        TrackSelection trackSelection = null;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i2 < trackGroupArray2.length) {
            TrackGroup trackGroup = trackGroupArray2.get(i2);
            int[] iArr2 = iArr[i2];
            int i5 = i4;
            C2250b c2250b = trackSelection;
            int i6 = i3;
            for (i3 = 0; i3 < trackGroup.length; i3++) {
                if (m17047a(iArr2[i3], parameters2.exceedRendererCapabilitiesIfNecessary)) {
                    C2250b c2250b2 = new C2250b(trackGroup.getFormat(i3), parameters2, iArr2[i3]);
                    if (c2250b == null || c2250b2.m8106a(c2250b) > 0) {
                        i6 = i2;
                        i5 = i3;
                        c2250b = c2250b2;
                    }
                }
            }
            i2++;
            i3 = i6;
            Object obj = c2250b;
            i4 = i5;
        }
        if (i3 == -1) {
            return null;
        }
        TrackGroup trackGroup2 = trackGroupArray2.get(i3);
        if (!(parameters2.forceLowestBitrate || factory2 == null)) {
            int[] a = m17053a(trackGroup2, iArr[i3], parameters2.allowMixedMimeAdaptiveness);
            if (a.length > 0) {
                return factory2.createTrackSelection(trackGroup2, a);
            }
        }
        return new C4262c(trackGroup2, i4);
    }

    /* renamed from: a */
    private static int[] m17053a(TrackGroup trackGroup, int[] iArr, boolean z) {
        HashSet hashSet = new HashSet();
        C2249a c2249a = null;
        boolean z2 = false;
        for (int i = 0; i < trackGroup.length; i++) {
            Format format = trackGroup.getFormat(i);
            C2249a c2249a2 = new C2249a(format.channelCount, format.sampleRate, z ? null : format.sampleMimeType);
            if (hashSet.add(c2249a2)) {
                boolean a = m17043a(trackGroup, iArr, c2249a2);
                if (a > z2) {
                    z2 = a;
                    c2249a = c2249a2;
                }
            }
        }
        if (z2 <= true) {
            return f13797a;
        }
        z = new int[z2];
        int i2 = 0;
        for (int i3 = 0; i3 < trackGroup.length; i3++) {
            if (m17049a(trackGroup.getFormat(i3), iArr[i3], c2249a)) {
                int i4 = i2 + 1;
                z[i2] = i3;
                i2 = i4;
            }
        }
        return z;
    }

    /* renamed from: a */
    private static int m17043a(TrackGroup trackGroup, int[] iArr, C2249a c2249a) {
        int i = 0;
        for (int i2 = 0; i2 < trackGroup.length; i2++) {
            if (m17049a(trackGroup.getFormat(i2), iArr[i2], c2249a)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m17049a(Format format, int i, C2249a c2249a) {
        if (m17047a(i, false) == 0 || format.channelCount != c2249a.f6649a || format.sampleRate != c2249a.f6650b) {
            return false;
        }
        if (c2249a.f6651c == 0 || TextUtils.equals(c2249a.f6651c, format.sampleMimeType) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected TrackSelection m17064a(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        int i = 0;
        TrackGroup trackGroup = null;
        int i2 = 0;
        int i3 = 0;
        while (i < trackGroupArray2.length) {
            TrackGroup trackGroup2 = trackGroupArray2.get(i);
            int[] iArr2 = iArr[i];
            int i4 = i3;
            i3 = i2;
            TrackGroup trackGroup3 = trackGroup;
            for (int i5 = 0; i5 < trackGroup2.length; i5++) {
                if (m17047a(iArr2[i5], parameters2.exceedRendererCapabilitiesIfNecessary)) {
                    int i6;
                    Format format = trackGroup2.getFormat(i5);
                    int i7 = format.selectionFlags & (parameters2.disabledTextTrackSelectionFlags ^ -1);
                    Object obj = (i7 & 1) != 0 ? 1 : null;
                    Object obj2 = (i7 & 2) != 0 ? 1 : null;
                    boolean a = m17050a(format, parameters2.preferredTextLanguage);
                    if (!a) {
                        if (!parameters2.selectUndeterminedTextLanguage || !m17048a(format)) {
                            if (obj != null) {
                                i6 = 3;
                            } else if (obj2 != null) {
                                i6 = m17050a(format, parameters2.preferredAudioLanguage) ? 2 : 1;
                            }
                            if (m17047a(iArr2[i5], false)) {
                                i6 += AdError.NETWORK_ERROR_CODE;
                            }
                            if (i6 > i4) {
                                i3 = i5;
                                trackGroup3 = trackGroup2;
                                i4 = i6;
                            }
                        }
                    }
                    int i8 = obj != null ? 8 : obj2 == null ? 6 : 4;
                    i6 = i8 + a;
                    if (m17047a(iArr2[i5], false)) {
                        i6 += AdError.NETWORK_ERROR_CODE;
                    }
                    if (i6 > i4) {
                        i3 = i5;
                        trackGroup3 = trackGroup2;
                        i4 = i6;
                    }
                }
            }
            i++;
            trackGroup = trackGroup3;
            i2 = i3;
            i3 = i4;
        }
        return trackGroup == null ? null : new C4262c(trackGroup, i2);
    }

    /* renamed from: a */
    protected TrackSelection m17062a(int i, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        TrackGroup trackGroup = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < trackGroupArray.length) {
            TrackGroup trackGroup2 = trackGroupArray.get(i2);
            int[] iArr2 = iArr[i2];
            int i5 = i4;
            i4 = i3;
            TrackGroup trackGroup3 = trackGroup;
            for (int i6 = 0; i6 < trackGroup2.length; i6++) {
                if (m17047a(iArr2[i6], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    int i7 = 1;
                    if (((trackGroup2.getFormat(i6).selectionFlags & 1) != 0 ? 1 : null) != null) {
                        i7 = 2;
                    }
                    if (m17047a(iArr2[i6], false)) {
                        i7 += AdError.NETWORK_ERROR_CODE;
                    }
                    if (i7 > i5) {
                        i4 = i6;
                        trackGroup3 = trackGroup2;
                        i5 = i7;
                    }
                }
            }
            i2++;
            trackGroup = trackGroup3;
            i3 = i4;
            i4 = i5;
        }
        if (trackGroup == null) {
            return null;
        }
        return new C4262c(trackGroup, i3);
    }

    /* renamed from: a */
    private static void m17046a(C2254a c2254a, int[][][] iArr, C2154o[] c2154oArr, TrackSelection[] trackSelectionArr, int i) {
        if (i != 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            while (i3 < c2254a.m8117a()) {
                int a = c2254a.m8118a(i3);
                TrackSelection trackSelection = trackSelectionArr[i3];
                if ((a == 1 || a == 2) && trackSelection != null && m17052a(iArr[i3], c2254a.m8122b(i3), trackSelection)) {
                    if (a == 1) {
                        if (i4 == -1) {
                            i4 = i3;
                        }
                    } else if (i5 == -1) {
                        i5 = i3;
                    }
                    c2254a = null;
                    break;
                }
                i3++;
            }
            c2254a = true;
            if (!(i4 == -1 || i5 == -1)) {
                i2 = 1;
            }
            if ((c2254a & i2) != null) {
                c2254a = new C2154o(i);
                c2154oArr[i4] = c2254a;
                c2154oArr[i5] = c2254a;
            }
        }
    }

    /* renamed from: a */
    private static boolean m17052a(int[][] iArr, TrackGroupArray trackGroupArray, TrackSelection trackSelection) {
        if (trackSelection == null) {
            return false;
        }
        trackGroupArray = trackGroupArray.indexOf(trackSelection.getTrackGroup());
        for (int i = 0; i < trackSelection.length(); i++) {
            if ((iArr[trackGroupArray][trackSelection.getIndexInTrackGroup(i)] & 32) != 32) {
                return false;
            }
        }
        return 1;
    }

    /* renamed from: a */
    protected static boolean m17048a(Format format) {
        if (!TextUtils.isEmpty(format.language)) {
            if (m17050a(format, "und") == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    protected static boolean m17050a(Format format, String str) {
        return (str == null || TextUtils.equals(str, C2314v.m8487b(format.language)) == null) ? null : true;
    }

    /* renamed from: a */
    private static List<Integer> m17045a(TrackGroup trackGroup, int i, int i2, boolean z) {
        List<Integer> arrayList = new ArrayList(trackGroup.length);
        for (int i3 = 0; i3 < trackGroup.length; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (i != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            if (i2 != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                boolean z2 = true;
                for (int i4 = 0; i4 < trackGroup.length; i4++) {
                    Format format = trackGroup.getFormat(i4);
                    if (format.width > 0 && format.height > 0) {
                        Point a = m17044a(z, i, i2, format.width, format.height);
                        boolean z3 = format.width * format.height;
                        if (format.width >= ((int) (((float) a.x) * 0.98f)) && format.height >= ((int) (((float) a.y) * 0.98f)) && z3 < z2) {
                            z2 = z3;
                        }
                    }
                }
                if (!z2) {
                    for (i = arrayList.size() - 1; i >= 0; i--) {
                        boolean pixelCount = trackGroup.getFormat(((Integer) arrayList.get(i)).intValue()).getPixelCount();
                        if (pixelCount || pixelCount > z2) {
                            arrayList.remove(i);
                        }
                    }
                }
                return arrayList;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Point m17044a(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (z) {
            z = false;
            boolean z2 = i3 > i4;
            if (i > i2) {
                z = true;
            }
            if (z2 != z) {
                i5 = i3 * i;
                i6 = i4 * i2;
                if (i5 < i6) {
                    return new Point(i2, C2314v.m8455a(i6, i3));
                }
                return new Point(C2314v.m8455a(i5, i4), i);
            }
        }
        int i7 = i2;
        i2 = i;
        i = i7;
        i5 = i3 * i;
        i6 = i4 * i2;
        if (i5 < i6) {
            return new Point(C2314v.m8455a(i5, i4), i);
        }
        return new Point(i2, C2314v.m8455a(i6, i3));
    }
}
