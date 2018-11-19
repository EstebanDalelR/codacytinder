package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.C2192e;
import com.google.android.exoplayer2.source.chunk.C3680c;
import com.google.android.exoplayer2.source.chunk.C4248f;
import com.google.android.exoplayer2.source.hls.playlist.C4252a.C2211a;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.C2209a;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.C2310s;
import com.google.android.exoplayer2.util.C2312u;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.hls.c */
class C2207c {
    /* renamed from: a */
    private final HlsExtractorFactory f6354a;
    /* renamed from: b */
    private final DataSource f6355b;
    /* renamed from: c */
    private final DataSource f6356c;
    /* renamed from: d */
    private final C2208e f6357d;
    /* renamed from: e */
    private final C2211a[] f6358e;
    /* renamed from: f */
    private final HlsPlaylistTracker f6359f;
    /* renamed from: g */
    private final TrackGroup f6360g;
    /* renamed from: h */
    private final List<Format> f6361h;
    /* renamed from: i */
    private boolean f6362i;
    /* renamed from: j */
    private byte[] f6363j;
    /* renamed from: k */
    private IOException f6364k;
    /* renamed from: l */
    private C2211a f6365l;
    /* renamed from: m */
    private boolean f6366m;
    /* renamed from: n */
    private Uri f6367n;
    /* renamed from: o */
    private byte[] f6368o;
    /* renamed from: p */
    private String f6369p;
    /* renamed from: q */
    private byte[] f6370q;
    /* renamed from: r */
    private TrackSelection f6371r;
    /* renamed from: s */
    private long f6372s;
    /* renamed from: t */
    private boolean f6373t;

    /* renamed from: com.google.android.exoplayer2.source.hls.c$b */
    public static final class C2206b {
        /* renamed from: a */
        public C3680c f6351a;
        /* renamed from: b */
        public boolean f6352b;
        /* renamed from: c */
        public C2211a f6353c;

        /* renamed from: a */
        public void m7881a() {
            this.f6351a = null;
            this.f6352b = false;
            this.f6353c = null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.c$a */
    private static final class C4372a extends C4248f {
        /* renamed from: a */
        public final String f14440a;
        /* renamed from: j */
        private byte[] f14441j;

        public C4372a(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, byte[] bArr, String str) {
            super(dataSource, dataSpec, 3, format, i, obj, bArr);
            this.f14440a = str;
        }

        /* renamed from: a */
        protected void mo3730a(byte[] bArr, int i) throws IOException {
            this.f14441j = Arrays.copyOf(bArr, i);
        }

        /* renamed from: d */
        public byte[] mo3731d() {
            return this.f14441j;
        }
    }

    /* renamed from: a */
    public void m7888a(C4373d c4373d, long j, long j2, C2206b c2206b) {
        int i;
        long j3;
        long j4;
        long a;
        long max;
        C2207c c2207c = this;
        C4373d c4373d2 = c4373d;
        long j5 = j;
        C2206b c2206b2 = c2206b;
        if (c4373d2 == null) {
            i = -1;
        } else {
            i = c2207c.f6360g.indexOf(c4373d2.d);
        }
        long j6 = j2 - j5;
        long a2 = m7882a(j5);
        if (c4373d2 == null || c2207c.f6366m) {
            j3 = a2;
            j4 = j6;
        } else {
            a = c4373d.m13944a();
            max = Math.max(0, j6 - a);
            if (a2 != -9223372036854775807L) {
                j4 = max;
                j3 = Math.max(0, a2 - a);
            } else {
                j4 = max;
                j3 = a2;
            }
        }
        c2207c.f6371r.updateSelectedTrack(j5, j4, j3);
        int selectedIndexInTrackGroup = c2207c.f6371r.getSelectedIndexInTrackGroup();
        int i2 = 0;
        Object obj = i != selectedIndexInTrackGroup ? 1 : null;
        C2211a c2211a = c2207c.f6358e[selectedIndexInTrackGroup];
        boolean z;
        if (c2207c.f6359f.m14026b(c2211a)) {
            C2211a c2211a2;
            long c;
            C2211a c2211a3;
            C2209a c2209a;
            Uri a3;
            C2209a c2209a2;
            C2211a dataSpec;
            C2211a c2211a4;
            long a4;
            C2310s a5;
            DataSpec dataSpec2;
            HlsExtractorFactory hlsExtractorFactory;
            DataSource dataSource;
            List list;
            int selectionReason;
            Object selectionData;
            int i3;
            long j7;
            boolean z2;
            boolean z3;
            DrmInitData drmInitData;
            byte[] bArr;
            byte[] bArr2;
            boolean z4;
            C2206b c2206b3;
            List list2;
            Object valueOf;
            boolean z5;
            HlsMediaPlaylist a6;
            HlsMediaPlaylist a7 = c2207c.f6359f.m14022a(c2211a);
            c2207c.f6366m = a7.f13748i;
            m7886a(a7);
            if (c4373d2 != null) {
                if (obj == null) {
                    i = selectedIndexInTrackGroup;
                    c2211a2 = c2211a;
                    c = c4373d.m16951c();
                    if (c >= a7.f13745f) {
                        c2207c.f6364k = new BehindLiveWindowException();
                        return;
                    }
                    selectedIndexInTrackGroup = (int) (c - a7.f13745f);
                    if (selectedIndexInTrackGroup < a7.f13752m.size()) {
                        if (a7.f13749j) {
                            c2206b2.f6353c = c2211a2;
                            z = c2207c.f6373t;
                            if (c2207c.f6365l == c2211a2) {
                                i2 = 1;
                            }
                            c2207c.f6373t = z & i2;
                            c2207c.f6365l = c2211a2;
                        } else {
                            c2206b2.f6352b = true;
                        }
                        return;
                    }
                    c2207c.f6373t = false;
                    c2211a3 = null;
                    c2207c.f6365l = null;
                    c2209a = (C2209a) a7.f13752m.get(selectedIndexInTrackGroup);
                    if (c2209a.f6380f == null) {
                        a3 = C2312u.m8450a(a7.o, c2209a.f6380f);
                        if (a3.equals(c2207c.f6367n)) {
                            c2206b2.f6351a = m7883a(a3, c2209a.f6381g, i, c2207c.f6371r.getSelectionReason(), c2207c.f6371r.getSelectionData());
                            return;
                        } else if (!C2314v.m8480a(c2209a.f6381g, c2207c.f6369p)) {
                            m7885a(a3, c2209a.f6381g, c2207c.f6368o);
                        }
                    } else {
                        m7884a();
                    }
                    c2209a2 = c2209a.f6376b;
                    if (c2209a2 != null) {
                        dataSpec = new DataSpec(C2312u.m8450a(a7.o, c2209a2.f6375a), c2209a2.f6382h, c2209a2.f6383i, null);
                    }
                    c2211a4 = c2211a3;
                    a4 = (a7.f13742c - c2207c.f6359f.m14021a()) + c2209a.f6379e;
                    i2 = a7.f13744e + c2209a.f6378d;
                    a5 = c2207c.f6357d.m7890a(i2);
                    dataSpec2 = new DataSpec(C2312u.m8450a(a7.o, c2209a.f6375a), c2209a.f6382h, c2209a.f6383i, null);
                    hlsExtractorFactory = c2207c.f6354a;
                    dataSource = c2207c.f6355b;
                    list = c2207c.f6361h;
                    selectionReason = c2207c.f6371r.getSelectionReason();
                    selectionData = c2207c.f6371r.getSelectionData();
                    i3 = selectionReason;
                    j7 = a4 + c2209a.f6377c;
                    z2 = c2209a.f6384j;
                    z3 = c2207c.f6362i;
                    drmInitData = a7.f13751l;
                    bArr = c2207c.f6368o;
                    bArr2 = c2207c.f6370q;
                    z4 = z3;
                    c2206b3 = c2206b;
                    c2206b3.f6351a = new C4373d(hlsExtractorFactory, dataSource, dataSpec2, c2211a4, c2211a2, list, i3, selectionData, a4, j7, c, i2, z2, z4, a5, c4373d2, drmInitData, bArr, bArr2);
                    return;
                }
            }
            if (c4373d2 != null) {
                if (!c2207c.f6366m) {
                    a2 = c4373d2.g;
                    if (!a7.f13749j || a2 < a7.m16994a()) {
                        a = a2 - (a7.f13742c - c2207c.f6359f.m14021a());
                        list2 = a7.f13752m;
                        valueOf = Long.valueOf(a);
                        if (c2207c.f6359f.m14025b()) {
                            if (c4373d2 == null) {
                                z5 = false;
                                max = ((long) C2314v.m8458a(list2, valueOf, true, z5)) + a7.f13745f;
                                if (max < a7.f13745f && c4373d2 != null) {
                                    c2211a = c2207c.f6358e[i];
                                    a6 = c2207c.f6359f.m14022a(c2211a);
                                    max = c4373d.m16951c();
                                    a7 = a6;
                                    selectedIndexInTrackGroup = i;
                                }
                            }
                        }
                        z5 = true;
                        max = ((long) C2314v.m8458a(list2, valueOf, true, z5)) + a7.f13745f;
                        c2211a = c2207c.f6358e[i];
                        a6 = c2207c.f6359f.m14022a(c2211a);
                        max = c4373d.m16951c();
                        a7 = a6;
                        selectedIndexInTrackGroup = i;
                    } else {
                        max = a7.f13745f + ((long) a7.f13752m.size());
                    }
                    i = selectedIndexInTrackGroup;
                    c2211a2 = c2211a;
                    c = max;
                    if (c >= a7.f13745f) {
                        selectedIndexInTrackGroup = (int) (c - a7.f13745f);
                        if (selectedIndexInTrackGroup < a7.f13752m.size()) {
                            c2207c.f6373t = false;
                            c2211a3 = null;
                            c2207c.f6365l = null;
                            c2209a = (C2209a) a7.f13752m.get(selectedIndexInTrackGroup);
                            if (c2209a.f6380f == null) {
                                m7884a();
                            } else {
                                a3 = C2312u.m8450a(a7.o, c2209a.f6380f);
                                if (a3.equals(c2207c.f6367n)) {
                                    c2206b2.f6351a = m7883a(a3, c2209a.f6381g, i, c2207c.f6371r.getSelectionReason(), c2207c.f6371r.getSelectionData());
                                    return;
                                } else if (C2314v.m8480a(c2209a.f6381g, c2207c.f6369p)) {
                                    m7885a(a3, c2209a.f6381g, c2207c.f6368o);
                                }
                            }
                            c2209a2 = c2209a.f6376b;
                            if (c2209a2 != null) {
                                dataSpec = new DataSpec(C2312u.m8450a(a7.o, c2209a2.f6375a), c2209a2.f6382h, c2209a2.f6383i, null);
                            }
                            c2211a4 = c2211a3;
                            a4 = (a7.f13742c - c2207c.f6359f.m14021a()) + c2209a.f6379e;
                            i2 = a7.f13744e + c2209a.f6378d;
                            a5 = c2207c.f6357d.m7890a(i2);
                            dataSpec2 = new DataSpec(C2312u.m8450a(a7.o, c2209a.f6375a), c2209a.f6382h, c2209a.f6383i, null);
                            hlsExtractorFactory = c2207c.f6354a;
                            dataSource = c2207c.f6355b;
                            list = c2207c.f6361h;
                            selectionReason = c2207c.f6371r.getSelectionReason();
                            selectionData = c2207c.f6371r.getSelectionData();
                            i3 = selectionReason;
                            j7 = a4 + c2209a.f6377c;
                            z2 = c2209a.f6384j;
                            z3 = c2207c.f6362i;
                            drmInitData = a7.f13751l;
                            bArr = c2207c.f6368o;
                            bArr2 = c2207c.f6370q;
                            z4 = z3;
                            c2206b3 = c2206b;
                            c2206b3.f6351a = new C4373d(hlsExtractorFactory, dataSource, dataSpec2, c2211a4, c2211a2, list, i3, selectionData, a4, j7, c, i2, z2, z4, a5, c4373d2, drmInitData, bArr, bArr2);
                            return;
                        }
                        if (a7.f13749j) {
                            c2206b2.f6353c = c2211a2;
                            z = c2207c.f6373t;
                            if (c2207c.f6365l == c2211a2) {
                                i2 = 1;
                            }
                            c2207c.f6373t = z & i2;
                            c2207c.f6365l = c2211a2;
                        } else {
                            c2206b2.f6352b = true;
                        }
                        return;
                    }
                    c2207c.f6364k = new BehindLiveWindowException();
                    return;
                }
            }
            a2 = j2;
            if (a7.f13749j) {
            }
            a = a2 - (a7.f13742c - c2207c.f6359f.m14021a());
            list2 = a7.f13752m;
            valueOf = Long.valueOf(a);
            if (c2207c.f6359f.m14025b()) {
                if (c4373d2 == null) {
                    z5 = false;
                    max = ((long) C2314v.m8458a(list2, valueOf, true, z5)) + a7.f13745f;
                    c2211a = c2207c.f6358e[i];
                    a6 = c2207c.f6359f.m14022a(c2211a);
                    max = c4373d.m16951c();
                    a7 = a6;
                    selectedIndexInTrackGroup = i;
                    i = selectedIndexInTrackGroup;
                    c2211a2 = c2211a;
                    c = max;
                    if (c >= a7.f13745f) {
                        c2207c.f6364k = new BehindLiveWindowException();
                        return;
                    }
                    selectedIndexInTrackGroup = (int) (c - a7.f13745f);
                    if (selectedIndexInTrackGroup < a7.f13752m.size()) {
                        if (a7.f13749j) {
                            c2206b2.f6352b = true;
                        } else {
                            c2206b2.f6353c = c2211a2;
                            z = c2207c.f6373t;
                            if (c2207c.f6365l == c2211a2) {
                                i2 = 1;
                            }
                            c2207c.f6373t = z & i2;
                            c2207c.f6365l = c2211a2;
                        }
                        return;
                    }
                    c2207c.f6373t = false;
                    c2211a3 = null;
                    c2207c.f6365l = null;
                    c2209a = (C2209a) a7.f13752m.get(selectedIndexInTrackGroup);
                    if (c2209a.f6380f == null) {
                        a3 = C2312u.m8450a(a7.o, c2209a.f6380f);
                        if (a3.equals(c2207c.f6367n)) {
                            c2206b2.f6351a = m7883a(a3, c2209a.f6381g, i, c2207c.f6371r.getSelectionReason(), c2207c.f6371r.getSelectionData());
                            return;
                        } else if (C2314v.m8480a(c2209a.f6381g, c2207c.f6369p)) {
                            m7885a(a3, c2209a.f6381g, c2207c.f6368o);
                        }
                    } else {
                        m7884a();
                    }
                    c2209a2 = c2209a.f6376b;
                    if (c2209a2 != null) {
                        dataSpec = new DataSpec(C2312u.m8450a(a7.o, c2209a2.f6375a), c2209a2.f6382h, c2209a2.f6383i, null);
                    }
                    c2211a4 = c2211a3;
                    a4 = (a7.f13742c - c2207c.f6359f.m14021a()) + c2209a.f6379e;
                    i2 = a7.f13744e + c2209a.f6378d;
                    a5 = c2207c.f6357d.m7890a(i2);
                    dataSpec2 = new DataSpec(C2312u.m8450a(a7.o, c2209a.f6375a), c2209a.f6382h, c2209a.f6383i, null);
                    hlsExtractorFactory = c2207c.f6354a;
                    dataSource = c2207c.f6355b;
                    list = c2207c.f6361h;
                    selectionReason = c2207c.f6371r.getSelectionReason();
                    selectionData = c2207c.f6371r.getSelectionData();
                    i3 = selectionReason;
                    j7 = a4 + c2209a.f6377c;
                    z2 = c2209a.f6384j;
                    z3 = c2207c.f6362i;
                    drmInitData = a7.f13751l;
                    bArr = c2207c.f6368o;
                    bArr2 = c2207c.f6370q;
                    z4 = z3;
                    c2206b3 = c2206b;
                    c2206b3.f6351a = new C4373d(hlsExtractorFactory, dataSource, dataSpec2, c2211a4, c2211a2, list, i3, selectionData, a4, j7, c, i2, z2, z4, a5, c4373d2, drmInitData, bArr, bArr2);
                    return;
                }
            }
            z5 = true;
            max = ((long) C2314v.m8458a(list2, valueOf, true, z5)) + a7.f13745f;
            c2211a = c2207c.f6358e[i];
            a6 = c2207c.f6359f.m14022a(c2211a);
            max = c4373d.m16951c();
            a7 = a6;
            selectedIndexInTrackGroup = i;
            i = selectedIndexInTrackGroup;
            c2211a2 = c2211a;
            c = max;
            if (c >= a7.f13745f) {
                selectedIndexInTrackGroup = (int) (c - a7.f13745f);
                if (selectedIndexInTrackGroup < a7.f13752m.size()) {
                    c2207c.f6373t = false;
                    c2211a3 = null;
                    c2207c.f6365l = null;
                    c2209a = (C2209a) a7.f13752m.get(selectedIndexInTrackGroup);
                    if (c2209a.f6380f == null) {
                        m7884a();
                    } else {
                        a3 = C2312u.m8450a(a7.o, c2209a.f6380f);
                        if (a3.equals(c2207c.f6367n)) {
                            c2206b2.f6351a = m7883a(a3, c2209a.f6381g, i, c2207c.f6371r.getSelectionReason(), c2207c.f6371r.getSelectionData());
                            return;
                        } else if (C2314v.m8480a(c2209a.f6381g, c2207c.f6369p)) {
                            m7885a(a3, c2209a.f6381g, c2207c.f6368o);
                        }
                    }
                    c2209a2 = c2209a.f6376b;
                    if (c2209a2 != null) {
                        dataSpec = new DataSpec(C2312u.m8450a(a7.o, c2209a2.f6375a), c2209a2.f6382h, c2209a2.f6383i, null);
                    }
                    c2211a4 = c2211a3;
                    a4 = (a7.f13742c - c2207c.f6359f.m14021a()) + c2209a.f6379e;
                    i2 = a7.f13744e + c2209a.f6378d;
                    a5 = c2207c.f6357d.m7890a(i2);
                    dataSpec2 = new DataSpec(C2312u.m8450a(a7.o, c2209a.f6375a), c2209a.f6382h, c2209a.f6383i, null);
                    hlsExtractorFactory = c2207c.f6354a;
                    dataSource = c2207c.f6355b;
                    list = c2207c.f6361h;
                    selectionReason = c2207c.f6371r.getSelectionReason();
                    selectionData = c2207c.f6371r.getSelectionData();
                    i3 = selectionReason;
                    j7 = a4 + c2209a.f6377c;
                    z2 = c2209a.f6384j;
                    z3 = c2207c.f6362i;
                    drmInitData = a7.f13751l;
                    bArr = c2207c.f6368o;
                    bArr2 = c2207c.f6370q;
                    z4 = z3;
                    c2206b3 = c2206b;
                    c2206b3.f6351a = new C4373d(hlsExtractorFactory, dataSource, dataSpec2, c2211a4, c2211a2, list, i3, selectionData, a4, j7, c, i2, z2, z4, a5, c4373d2, drmInitData, bArr, bArr2);
                    return;
                }
                if (a7.f13749j) {
                    c2206b2.f6353c = c2211a2;
                    z = c2207c.f6373t;
                    if (c2207c.f6365l == c2211a2) {
                        i2 = 1;
                    }
                    c2207c.f6373t = z & i2;
                    c2207c.f6365l = c2211a2;
                } else {
                    c2206b2.f6352b = true;
                }
                return;
            }
            c2207c.f6364k = new BehindLiveWindowException();
            return;
        }
        c2206b2.f6353c = c2211a;
        z = c2207c.f6373t;
        if (c2207c.f6365l == c2211a) {
            i2 = 1;
        }
        c2207c.f6373t = z & i2;
        c2207c.f6365l = c2211a;
    }

    /* renamed from: a */
    public void m7887a(C3680c c3680c) {
        if (c3680c instanceof C4372a) {
            C4372a c4372a = (C4372a) c3680c;
            this.f6363j = c4372a.m16950c();
            m7885a(c4372a.b.f6822a, c4372a.f14440a, c4372a.mo3731d());
        }
    }

    /* renamed from: a */
    public boolean m7889a(C3680c c3680c, boolean z, IOException iOException) {
        return (!z || C2192e.m7863a(this.f6371r, this.f6371r.indexOf(this.f6360g.indexOf(c3680c.f11417d)), iOException) == null) ? null : true;
    }

    /* renamed from: a */
    private long m7882a(long j) {
        if ((this.f6372s != -9223372036854775807L ? 1 : null) != null) {
            return this.f6372s - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private void m7886a(HlsMediaPlaylist hlsMediaPlaylist) {
        this.f6372s = hlsMediaPlaylist.f13749j ? -9223372036854775807L : hlsMediaPlaylist.m16994a();
    }

    /* renamed from: a */
    private C4372a m7883a(Uri uri, String str, int i, int i2, Object obj) {
        return new C4372a(this.f6356c, new DataSpec(uri, 0, -1, null, 1), this.f6358e[i].f6390b, i2, obj, this.f6363j, str);
    }

    /* renamed from: a */
    private void m7885a(Uri uri, String str, byte[] bArr) {
        Object toByteArray = new BigInteger(C2314v.m8493d(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        Object obj = new byte[16];
        int length = toByteArray.length > 16 ? toByteArray.length - 16 : 0;
        System.arraycopy(toByteArray, length, obj, (obj.length - toByteArray.length) + length, toByteArray.length - length);
        this.f6367n = uri;
        this.f6368o = bArr;
        this.f6369p = str;
        this.f6370q = obj;
    }

    /* renamed from: a */
    private void m7884a() {
        this.f6367n = null;
        this.f6368o = null;
        this.f6369p = null;
        this.f6370q = null;
    }
}
