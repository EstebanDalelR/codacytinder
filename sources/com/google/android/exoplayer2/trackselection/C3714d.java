package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import com.google.android.exoplayer2.C2154o;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.trackselection.d */
public abstract class C3714d extends TrackSelector {
    /* renamed from: a */
    private C2254a f11594a;

    /* renamed from: com.google.android.exoplayer2.trackselection.d$a */
    public static final class C2254a {
        @Deprecated
        /* renamed from: a */
        public final int f6678a = this.f6679b;
        /* renamed from: b */
        private final int f6679b;
        /* renamed from: c */
        private final int[] f6680c;
        /* renamed from: d */
        private final TrackGroupArray[] f6681d;
        /* renamed from: e */
        private final int[] f6682e;
        /* renamed from: f */
        private final int[][][] f6683f;
        /* renamed from: g */
        private final TrackGroupArray f6684g;

        C2254a(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f6680c = iArr;
            this.f6681d = trackGroupArrayArr;
            this.f6683f = iArr3;
            this.f6682e = iArr2;
            this.f6684g = trackGroupArray;
            this.f6679b = iArr.length;
        }

        /* renamed from: a */
        public int m8117a() {
            return this.f6679b;
        }

        /* renamed from: a */
        public int m8118a(int i) {
            return this.f6680c[i];
        }

        /* renamed from: b */
        public TrackGroupArray m8122b(int i) {
            return this.f6681d[i];
        }

        /* renamed from: a */
        public int m8119a(int i, int i2, int i3) {
            return this.f6683f[i][i2][i3] & 7;
        }

        /* renamed from: a */
        public int m8120a(int i, int i2, boolean z) {
            int i3 = this.f6681d[i].get(i2).length;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int a = m8119a(i, i2, i5);
                if (a == 4 || (z && a == 3)) {
                    a = i4 + 1;
                    iArr[i4] = i5;
                    i4 = a;
                }
            }
            return m8121a(i, i2, Arrays.copyOf(iArr, i4));
        }

        /* renamed from: a */
        public int m8121a(int i, int i2, int[] iArr) {
            int i3 = 0;
            Object obj = null;
            int i4 = 0;
            int i5 = 0;
            int i6 = 16;
            while (i3 < iArr.length) {
                Object obj2 = this.f6681d[i].get(i2).getFormat(iArr[i3]).sampleMimeType;
                int i7 = i4 + 1;
                if (i4 == 0) {
                    obj = obj2;
                } else {
                    i5 = (C2314v.m8480a(obj, obj2) ^ 1) | i5;
                }
                i6 = Math.min(i6, this.f6683f[i][i2][i3] & 24);
                i3++;
                i4 = i7;
            }
            return i5 != 0 ? Math.min(i6, this.f6682e[i]) : i6;
        }
    }

    /* renamed from: a */
    protected abstract Pair<C2154o[], TrackSelection[]> mo3517a(C2254a c2254a, int[][][] iArr, int[] iArr2) throws ExoPlaybackException;

    /* renamed from: c */
    public final C2254a m14047c() {
        return this.f11594a;
    }

    /* renamed from: a */
    public final void mo2391a(Object obj) {
        this.f11594a = (C2254a) obj;
    }

    /* renamed from: a */
    public final C2256f mo2390a(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray) throws ExoPlaybackException {
        int i;
        int[] iArr = new int[(rendererCapabilitiesArr.length + 1)];
        TrackGroup[][] trackGroupArr = new TrackGroup[(rendererCapabilitiesArr.length + 1)][];
        int[][][] iArr2 = new int[(rendererCapabilitiesArr.length + 1)][][];
        for (i = 0; i < trackGroupArr.length; i++) {
            trackGroupArr[i] = new TrackGroup[trackGroupArray.length];
            iArr2[i] = new int[trackGroupArray.length][];
        }
        int[] a = C3714d.m14043a(rendererCapabilitiesArr);
        for (i = 0; i < trackGroupArray.length; i++) {
            int[] iArr3;
            TrackGroup trackGroup = trackGroupArray.get(i);
            int a2 = C3714d.m14041a(rendererCapabilitiesArr, trackGroup);
            if (a2 == rendererCapabilitiesArr.length) {
                iArr3 = new int[trackGroup.length];
            } else {
                iArr3 = C3714d.m14042a(rendererCapabilitiesArr[a2], trackGroup);
            }
            int i2 = iArr[a2];
            trackGroupArr[a2][i2] = trackGroup;
            iArr2[a2][i2] = iArr3;
            iArr[a2] = iArr[a2] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        int[] iArr4 = new int[rendererCapabilitiesArr.length];
        for (int i3 = 0; i3 < rendererCapabilitiesArr.length; i3++) {
            trackGroupArray = iArr[i3];
            trackGroupArrayArr[i3] = new TrackGroupArray((TrackGroup[]) Arrays.copyOf(trackGroupArr[i3], trackGroupArray));
            iArr2[i3] = (int[][]) Arrays.copyOf(iArr2[i3], trackGroupArray);
            iArr4[i3] = rendererCapabilitiesArr[i3].getTrackType();
        }
        int[] iArr5 = a;
        int[][][] iArr6 = iArr2;
        C2254a c2254a = new C2254a(iArr4, trackGroupArrayArr, iArr5, iArr6, new TrackGroupArray((TrackGroup[]) Arrays.copyOf(trackGroupArr[rendererCapabilitiesArr.length], iArr[rendererCapabilitiesArr.length])));
        trackGroupArray = mo3517a(c2254a, iArr2, a);
        return new C2256f((C2154o[]) trackGroupArray.first, (TrackSelection[]) trackGroupArray.second, c2254a);
    }

    /* renamed from: a */
    private static int m14041a(RendererCapabilities[] rendererCapabilitiesArr, TrackGroup trackGroup) throws ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int i = 0;
        int i2 = 0;
        while (i < rendererCapabilitiesArr.length) {
            RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i];
            int i3 = length;
            for (length = 0; length < trackGroup.length; length++) {
                int supportsFormat = rendererCapabilities.supportsFormat(trackGroup.getFormat(length)) & 7;
                if (supportsFormat > i2) {
                    if (supportsFormat == 4) {
                        return i;
                    }
                    i3 = i;
                    i2 = supportsFormat;
                }
            }
            i++;
            length = i3;
        }
        return length;
    }

    /* renamed from: a */
    private static int[] m14042a(RendererCapabilities rendererCapabilities, TrackGroup trackGroup) throws ExoPlaybackException {
        int[] iArr = new int[trackGroup.length];
        for (int i = 0; i < trackGroup.length; i++) {
            iArr[i] = rendererCapabilities.supportsFormat(trackGroup.getFormat(i));
        }
        return iArr;
    }

    /* renamed from: a */
    private static int[] m14043a(RendererCapabilities[] rendererCapabilitiesArr) throws ExoPlaybackException {
        int[] iArr = new int[rendererCapabilitiesArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = rendererCapabilitiesArr[i].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }
}
