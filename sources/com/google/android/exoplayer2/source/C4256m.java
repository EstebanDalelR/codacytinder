package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C2122i;
import com.google.android.exoplayer2.C2162p;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2177a;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import com.google.android.exoplayer2.util.C2297h;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.source.m */
final class C4256m implements MediaPeriod, Callback<C3698b> {
    /* renamed from: a */
    final Loader f13771a = new Loader("Loader:SingleSampleMediaPeriod");
    /* renamed from: b */
    final Format f13772b;
    /* renamed from: c */
    final boolean f13773c;
    /* renamed from: d */
    boolean f13774d;
    /* renamed from: e */
    boolean f13775e;
    /* renamed from: f */
    boolean f13776f;
    /* renamed from: g */
    byte[] f13777g;
    /* renamed from: h */
    int f13778h;
    /* renamed from: i */
    private final DataSpec f13779i;
    /* renamed from: j */
    private final Factory f13780j;
    /* renamed from: k */
    private final int f13781k;
    /* renamed from: l */
    private final C2177a f13782l;
    /* renamed from: m */
    private final TrackGroupArray f13783m;
    /* renamed from: n */
    private final ArrayList<C3697a> f13784n = new ArrayList();
    /* renamed from: o */
    private final long f13785o;
    /* renamed from: p */
    private int f13786p;

    /* renamed from: com.google.android.exoplayer2.source.m$a */
    private final class C3697a implements SampleStream {
        /* renamed from: a */
        final /* synthetic */ C4256m f11544a;
        /* renamed from: b */
        private int f11545b;
        /* renamed from: c */
        private boolean f11546c;

        private C3697a(C4256m c4256m) {
            this.f11544a = c4256m;
        }

        /* renamed from: a */
        public void m14033a() {
            if (this.f11545b == 2) {
                this.f11545b = 1;
            }
        }

        public boolean isReady() {
            return this.f11544a.f13775e;
        }

        public void maybeThrowError() throws IOException {
            if (!this.f11544a.f13773c) {
                this.f11544a.f13771a.maybeThrowError();
            }
        }

        public int readData(C2122i c2122i, DecoderInputBuffer decoderInputBuffer, boolean z) {
            if (this.f11545b == 2) {
                decoderInputBuffer.m7341b(4);
                return -4;
            }
            if (!z) {
                if (this.f11545b) {
                    if (this.f11544a.f13775e == null) {
                        return -3;
                    }
                    if (this.f11544a.f13776f != null) {
                        decoderInputBuffer.f10831c = 0;
                        decoderInputBuffer.m7341b(1);
                        decoderInputBuffer.m13518e(this.f11544a.f13778h);
                        decoderInputBuffer.f10830b.put(this.f11544a.f13777g, false, this.f11544a.f13778h);
                        m14032b();
                    } else {
                        decoderInputBuffer.m7341b(4);
                    }
                    this.f11545b = 2;
                    return -4;
                }
            }
            c2122i.f6062a = this.f11544a.f13772b;
            this.f11545b = 1;
            return -5;
        }

        public int skipData(long j) {
            if (j <= 0 || this.f11545b == 2) {
                return 0;
            }
            this.f11545b = 2;
            m14032b();
            return 1;
        }

        /* renamed from: b */
        private void m14032b() {
            if (!this.f11546c) {
                this.f11544a.f13782l.m7827a(C2297h.m8348g(this.f11544a.f13772b.sampleMimeType), this.f11544a.f13772b, 0, null, 0);
                this.f11546c = true;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.m$b */
    static final class C3698b implements Loadable {
        /* renamed from: a */
        public final DataSpec f11547a;
        /* renamed from: b */
        private final DataSource f11548b;
        /* renamed from: c */
        private int f11549c;
        /* renamed from: d */
        private byte[] f11550d;

        public void cancelLoad() {
        }

        public boolean isLoadCanceled() {
            return false;
        }

        public C3698b(DataSpec dataSpec, DataSource dataSource) {
            this.f11547a = dataSpec;
            this.f11548b = dataSource;
        }

        public void load() throws IOException, InterruptedException {
            int i = 0;
            this.f11549c = 0;
            try {
                this.f11548b.open(this.f11547a);
                while (i != -1) {
                    this.f11549c += i;
                    if (this.f11550d == null) {
                        this.f11550d = new byte[1024];
                    } else if (this.f11549c == this.f11550d.length) {
                        this.f11550d = Arrays.copyOf(this.f11550d, this.f11550d.length * 2);
                    }
                    i = this.f11548b.read(this.f11550d, this.f11549c, this.f11550d.length - this.f11549c);
                }
            } finally {
                C2314v.m8472a(this.f11548b);
            }
        }
    }

    public void discardBuffer(long j, boolean z) {
    }

    public long getAdjustedSeekPositionUs(long j, C2162p c2162p) {
        return j;
    }

    public void maybeThrowPrepareError() throws IOException {
    }

    public void reevaluateBuffer(long j) {
    }

    public /* synthetic */ void onLoadCanceled(Loadable loadable, long j, long j2, boolean z) {
        m17018a((C3698b) loadable, j, j2, z);
    }

    public /* synthetic */ void onLoadCompleted(Loadable loadable, long j, long j2) {
        m17017a((C3698b) loadable, j, j2);
    }

    public /* synthetic */ int onLoadError(Loadable loadable, long j, long j2, IOException iOException) {
        return m17015a((C3698b) loadable, j, j2, iOException);
    }

    public C4256m(DataSpec dataSpec, Factory factory, Format format, long j, int i, C2177a c2177a, boolean z) {
        this.f13779i = dataSpec;
        this.f13780j = factory;
        this.f13772b = format;
        this.f13785o = j;
        this.f13781k = i;
        this.f13782l = c2177a;
        this.f13773c = z;
        TrackGroup[] trackGroupArr = new TrackGroup[1];
        trackGroupArr[0] = new TrackGroup(format);
        this.f13783m = new TrackGroupArray(trackGroupArr);
        c2177a.m7825a();
    }

    /* renamed from: a */
    public void m17016a() {
        this.f13771a.m14089c();
        this.f13782l.m7838b();
    }

    public void prepare(MediaPeriod.Callback callback, long j) {
        callback.onPrepared(this);
    }

    public TrackGroupArray getTrackGroups() {
        return this.f13783m;
    }

    public long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        int i = 0;
        while (i < trackSelectionArr.length) {
            if (sampleStreamArr[i] != null && (trackSelectionArr[i] == null || !zArr[i])) {
                this.f13784n.remove(sampleStreamArr[i]);
                sampleStreamArr[i] = null;
            }
            if (sampleStreamArr[i] == null && trackSelectionArr[i] != null) {
                C3697a c3697a = new C3697a();
                this.f13784n.add(c3697a);
                sampleStreamArr[i] = c3697a;
                zArr2[i] = true;
            }
            i++;
        }
        return j;
    }

    public boolean continueLoading(long j) {
        if (!this.f13775e) {
            if (!r0.f13771a.m14087a()) {
                r0.f13782l.m7833a(r0.f13779i, 1, -1, r0.f13772b, 0, null, 0, r0.f13785o, r0.f13771a.m14085a(new C3698b(r0.f13779i, r0.f13780j.createDataSource()), r0, r0.f13781k));
                return true;
            }
        }
        return false;
    }

    public long readDiscontinuity() {
        if (!this.f13774d) {
            this.f13782l.m7843c();
            this.f13774d = true;
        }
        return -9223372036854775807L;
    }

    public long getNextLoadPositionUs() {
        if (!this.f13775e) {
            if (!this.f13771a.m14087a()) {
                return 0;
            }
        }
        return Long.MIN_VALUE;
    }

    public long getBufferedPositionUs() {
        return this.f13775e ? Long.MIN_VALUE : 0;
    }

    public long seekToUs(long j) {
        for (int i = 0; i < this.f13784n.size(); i++) {
            ((C3697a) this.f13784n.get(i)).m14033a();
        }
        return j;
    }

    /* renamed from: a */
    public void m17017a(C3698b c3698b, long j, long j2) {
        this.f13782l.m7834a(c3698b.f11547a, 1, -1, this.f13772b, 0, null, 0, this.f13785o, j, j2, (long) c3698b.f11549c);
        this.f13778h = c3698b.f11549c;
        this.f13777g = c3698b.f11550d;
        this.f13775e = true;
        this.f13776f = true;
    }

    /* renamed from: a */
    public void m17018a(C3698b c3698b, long j, long j2, boolean z) {
        this.f13782l.m7841b(c3698b.f11547a, 1, -1, null, 0, null, 0, this.f13785o, j, j2, (long) c3698b.f11549c);
    }

    /* renamed from: a */
    public int m17015a(C3698b c3698b, long j, long j2, IOException iOException) {
        this.f13786p++;
        boolean z = this.f13773c && r0.f13786p >= r0.f13781k;
        r0.f13782l.m7835a(c3698b.f11547a, 1, -1, r0.f13772b, 0, null, 0, r0.f13785o, j, j2, (long) c3698b.f11549c, iOException, z);
        if (!z) {
            return 0;
        }
        r0.f13775e = true;
        return 2;
    }
}
