package com.google.android.exoplayer2.source.hls.playlist;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.C2005C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2177a;
import com.google.android.exoplayer2.source.chunk.C2192e;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.playlist.C4252a.C2211a;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.C2209a;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.util.C2312u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

public final class HlsPlaylistTracker implements Callback<ParsingLoadable<C3695b>> {
    /* renamed from: a */
    private final HlsDataSourceFactory f11519a;
    /* renamed from: b */
    private final Parser<C3695b> f11520b;
    /* renamed from: c */
    private final int f11521c;
    /* renamed from: d */
    private final IdentityHashMap<C2211a, C3694a> f11522d;
    /* renamed from: e */
    private final Handler f11523e;
    /* renamed from: f */
    private final PrimaryPlaylistListener f11524f;
    /* renamed from: g */
    private final List<PlaylistEventListener> f11525g;
    /* renamed from: h */
    private final C2177a f11526h;
    /* renamed from: i */
    private C4252a f11527i;
    /* renamed from: j */
    private C2211a f11528j;
    /* renamed from: k */
    private HlsMediaPlaylist f11529k;
    /* renamed from: l */
    private boolean f11530l;
    /* renamed from: m */
    private long f11531m;

    public interface PlaylistEventListener {
        void onPlaylistChanged();

        boolean onPlaylistError(C2211a c2211a, boolean z);
    }

    public static final class PlaylistResetException extends IOException {
        /* renamed from: a */
        public final String f6385a;

        private PlaylistResetException(String str) {
            this.f6385a = str;
        }
    }

    public static final class PlaylistStuckException extends IOException {
        /* renamed from: a */
        public final String f6386a;

        private PlaylistStuckException(String str) {
            this.f6386a = str;
        }
    }

    public interface PrimaryPlaylistListener {
        void onPrimaryPlaylistRefreshed(HlsMediaPlaylist hlsMediaPlaylist);
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$a */
    private final class C3694a implements Callback<ParsingLoadable<C3695b>>, Runnable {
        /* renamed from: a */
        final /* synthetic */ HlsPlaylistTracker f11508a;
        /* renamed from: b */
        private final C2211a f11509b;
        /* renamed from: c */
        private final Loader f11510c = new Loader("HlsPlaylistTracker:MediaPlaylist");
        /* renamed from: d */
        private final ParsingLoadable<C3695b> f11511d;
        /* renamed from: e */
        private HlsMediaPlaylist f11512e;
        /* renamed from: f */
        private long f11513f;
        /* renamed from: g */
        private long f11514g;
        /* renamed from: h */
        private long f11515h;
        /* renamed from: i */
        private long f11516i;
        /* renamed from: j */
        private boolean f11517j;
        /* renamed from: k */
        private IOException f11518k;

        public /* synthetic */ void onLoadCanceled(Loadable loadable, long j, long j2, boolean z) {
            m13997a((ParsingLoadable) loadable, j, j2, z);
        }

        public /* synthetic */ void onLoadCompleted(Loadable loadable, long j, long j2) {
            m13996a((ParsingLoadable) loadable, j, j2);
        }

        public /* synthetic */ int onLoadError(Loadable loadable, long j, long j2, IOException iOException) {
            return m13994a((ParsingLoadable) loadable, j, j2, iOException);
        }

        public C3694a(HlsPlaylistTracker hlsPlaylistTracker, C2211a c2211a) {
            this.f11508a = hlsPlaylistTracker;
            this.f11509b = c2211a;
            this.f11511d = new ParsingLoadable(hlsPlaylistTracker.f11519a.createDataSource(4), C2312u.m8450a(hlsPlaylistTracker.f11527i.o, c2211a.f6389a), 4, hlsPlaylistTracker.f11520b);
        }

        /* renamed from: a */
        public HlsMediaPlaylist m13995a() {
            return this.f11512e;
        }

        /* renamed from: b */
        public boolean m13998b() {
            boolean z = false;
            if (this.f11512e == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000, C2005C.m7215a(this.f11512e.f13753n));
            if (this.f11512e.f13749j || this.f11512e.f13740a == 2 || this.f11512e.f13740a == 1 || this.f11513f + max > elapsedRealtime) {
                z = true;
            }
            return z;
        }

        /* renamed from: c */
        public void m13999c() {
            this.f11516i = 0;
            if (!this.f11517j) {
                if (!this.f11510c.m14087a()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime < this.f11515h) {
                        this.f11517j = true;
                        this.f11508a.f11523e.postDelayed(this, this.f11515h - elapsedRealtime);
                    } else {
                        m13992d();
                    }
                }
            }
        }

        /* renamed from: a */
        public void m13996a(ParsingLoadable<C3695b> parsingLoadable, long j, long j2) {
            C3695b c3695b = (C3695b) parsingLoadable.m14090a();
            if (c3695b instanceof HlsMediaPlaylist) {
                m13989a((HlsMediaPlaylist) c3695b);
                this.f11508a.f11526h.m7836a(parsingLoadable.f11666a, 4, j, j2, parsingLoadable.m14091b());
                return;
            }
            this.f11518k = new ParserException("Loaded playlist has unexpected type.");
        }

        /* renamed from: a */
        public void m13997a(ParsingLoadable<C3695b> parsingLoadable, long j, long j2, boolean z) {
            this.f11508a.f11526h.m7842b(parsingLoadable.f11666a, 4, j, j2, parsingLoadable.m14091b());
        }

        /* renamed from: a */
        public int m13994a(ParsingLoadable<C3695b> parsingLoadable, long j, long j2, IOException iOException) {
            int i;
            IOException iOException2 = iOException;
            boolean z = iOException2 instanceof ParserException;
            ParsingLoadable<C3695b> parsingLoadable2 = parsingLoadable;
            this.f11508a.f11526h.m7837a(parsingLoadable2.f11666a, 4, j, j2, parsingLoadable2.m14091b(), iOException2, z);
            boolean a = C2192e.m7865a(iOException);
            int i2 = 0;
            if (!this.f11508a.m14007a(this.f11509b, a)) {
                if (a) {
                    i = 0;
                    if (z) {
                        return 3;
                    }
                    if (a) {
                        i |= m13993e();
                    }
                    if (i != 0) {
                        i2 = 2;
                    }
                    return i2;
                }
            }
            i = 1;
            if (z) {
                return 3;
            }
            if (a) {
                i |= m13993e();
            }
            if (i != 0) {
                i2 = 2;
            }
            return i2;
        }

        public void run() {
            this.f11517j = false;
            m13992d();
        }

        /* renamed from: d */
        private void m13992d() {
            this.f11510c.m14085a(this.f11511d, this, this.f11508a.f11521c);
        }

        /* renamed from: a */
        private void m13989a(HlsMediaPlaylist hlsMediaPlaylist) {
            HlsMediaPlaylist hlsMediaPlaylist2 = this.f11512e;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f11513f = elapsedRealtime;
            this.f11512e = this.f11508a.m14001a(hlsMediaPlaylist2, hlsMediaPlaylist);
            if (this.f11512e != hlsMediaPlaylist2) {
                this.f11518k = null;
                this.f11514g = elapsedRealtime;
                this.f11508a.m14004a(this.f11509b, this.f11512e);
            } else if (!this.f11512e.f13749j) {
                if (hlsMediaPlaylist.f13745f + ((long) hlsMediaPlaylist.f13752m.size()) < this.f11512e.f13745f) {
                    this.f11518k = new PlaylistResetException(this.f11509b.f6389a);
                    this.f11508a.m14007a(this.f11509b, false);
                } else if (((double) (elapsedRealtime - this.f11514g)) > ((double) C2005C.m7215a(this.f11512e.f13747h)) * 3.5d) {
                    this.f11518k = new PlaylistStuckException(this.f11509b.f6389a);
                    this.f11508a.m14007a(this.f11509b, true);
                    m13993e();
                }
            }
            this.f11515h = elapsedRealtime + C2005C.m7215a(this.f11512e != hlsMediaPlaylist2 ? this.f11512e.f13747h : this.f11512e.f13747h / 2);
            if (this.f11509b == this.f11508a.f11528j && this.f11512e.f13749j == null) {
                m13999c();
            }
        }

        /* renamed from: e */
        private boolean m13993e() {
            this.f11516i = SystemClock.elapsedRealtime() + 60000;
            return this.f11508a.f11528j == this.f11509b && !this.f11508a.m14013c();
        }
    }

    public /* synthetic */ void onLoadCanceled(Loadable loadable, long j, long j2, boolean z) {
        m14024a((ParsingLoadable) loadable, j, j2, z);
    }

    public /* synthetic */ void onLoadCompleted(Loadable loadable, long j, long j2) {
        m14023a((ParsingLoadable) loadable, j, j2);
    }

    public /* synthetic */ int onLoadError(Loadable loadable, long j, long j2, IOException iOException) {
        return m14020a((ParsingLoadable) loadable, j, j2, iOException);
    }

    /* renamed from: a */
    public HlsMediaPlaylist m14022a(C2211a c2211a) {
        HlsMediaPlaylist a = ((C3694a) this.f11522d.get(c2211a)).m13995a();
        if (a != null) {
            m14012c(c2211a);
        }
        return a;
    }

    /* renamed from: a */
    public long m14021a() {
        return this.f11531m;
    }

    /* renamed from: b */
    public boolean m14026b(C2211a c2211a) {
        return ((C3694a) this.f11522d.get(c2211a)).m13998b();
    }

    /* renamed from: b */
    public boolean m14025b() {
        return this.f11530l;
    }

    /* renamed from: a */
    public void m14023a(ParsingLoadable<C3695b> parsingLoadable, long j, long j2) {
        C4252a a;
        HlsPlaylistTracker hlsPlaylistTracker = this;
        C3695b c3695b = (C3695b) parsingLoadable.m14090a();
        boolean z = c3695b instanceof HlsMediaPlaylist;
        if (z) {
            a = C4252a.m16999a(c3695b.f11532o);
        } else {
            a = (C4252a) c3695b;
        }
        hlsPlaylistTracker.f11527i = a;
        hlsPlaylistTracker.f11528j = (C2211a) a.f13754a.get(0);
        List arrayList = new ArrayList();
        arrayList.addAll(a.f13754a);
        arrayList.addAll(a.f13755b);
        arrayList.addAll(a.f13756c);
        m14005a(arrayList);
        C3694a c3694a = (C3694a) hlsPlaylistTracker.f11522d.get(hlsPlaylistTracker.f11528j);
        if (z) {
            c3694a.m13989a((HlsMediaPlaylist) c3695b);
        } else {
            c3694a.m13999c();
        }
        ParsingLoadable<C3695b> parsingLoadable2 = parsingLoadable;
        hlsPlaylistTracker.f11526h.m7836a(parsingLoadable2.f11666a, 4, j, j2, parsingLoadable2.m14091b());
    }

    /* renamed from: a */
    public void m14024a(ParsingLoadable<C3695b> parsingLoadable, long j, long j2, boolean z) {
        this.f11526h.m7842b(parsingLoadable.f11666a, 4, j, j2, parsingLoadable.m14091b());
    }

    /* renamed from: a */
    public int m14020a(ParsingLoadable<C3695b> parsingLoadable, long j, long j2, IOException iOException) {
        IOException iOException2 = iOException;
        boolean z = iOException2 instanceof ParserException;
        ParsingLoadable<C3695b> parsingLoadable2 = parsingLoadable;
        this.f11526h.m7837a(parsingLoadable2.f11666a, 4, j, j2, parsingLoadable2.m14091b(), iOException2, z);
        return z ? 3 : 0;
    }

    /* renamed from: c */
    private boolean m14013c() {
        List list = this.f11527i.f13754a;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C3694a c3694a = (C3694a) this.f11522d.get(list.get(i));
            if (elapsedRealtime > c3694a.f11516i) {
                this.f11528j = c3694a.f11509b;
                c3694a.m13999c();
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m14012c(C2211a c2211a) {
        if (c2211a != this.f11528j && this.f11527i.f13754a.contains(c2211a)) {
            if (this.f11529k == null || !this.f11529k.f13749j) {
                this.f11528j = c2211a;
                ((C3694a) this.f11522d.get(this.f11528j)).m13999c();
            }
        }
    }

    /* renamed from: a */
    private void m14005a(List<C2211a> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2211a c2211a = (C2211a) list.get(i);
            this.f11522d.put(c2211a, new C3694a(this, c2211a));
        }
    }

    /* renamed from: a */
    private void m14004a(C2211a c2211a, HlsMediaPlaylist hlsMediaPlaylist) {
        if (c2211a == this.f11528j) {
            if (this.f11529k == null) {
                this.f11530l = hlsMediaPlaylist.f13749j ^ 1;
                this.f11531m = hlsMediaPlaylist.f13742c;
            }
            this.f11529k = hlsMediaPlaylist;
            this.f11524f.onPrimaryPlaylistRefreshed(hlsMediaPlaylist);
        }
        HlsMediaPlaylist size = this.f11525g.size();
        for (hlsMediaPlaylist = null; hlsMediaPlaylist < size; hlsMediaPlaylist++) {
            ((PlaylistEventListener) this.f11525g.get(hlsMediaPlaylist)).onPlaylistChanged();
        }
    }

    /* renamed from: a */
    private boolean m14007a(C2211a c2211a, boolean z) {
        boolean z2 = false;
        for (int i = 0; i < this.f11525g.size(); i++) {
            z2 |= ((PlaylistEventListener) this.f11525g.get(i)).onPlaylistError(c2211a, z) ^ 1;
        }
        return z2;
    }

    /* renamed from: a */
    private HlsMediaPlaylist m14001a(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        if (hlsMediaPlaylist2.m16997a(hlsMediaPlaylist)) {
            return hlsMediaPlaylist2.m16995a(m14008b(hlsMediaPlaylist, hlsMediaPlaylist2), m14010c(hlsMediaPlaylist, hlsMediaPlaylist2));
        }
        return hlsMediaPlaylist2.f13749j != null ? hlsMediaPlaylist.m16998b() : hlsMediaPlaylist;
    }

    /* renamed from: b */
    private long m14008b(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        if (hlsMediaPlaylist2.f13750k) {
            return hlsMediaPlaylist2.f13742c;
        }
        long j = this.f11529k != null ? this.f11529k.f13742c : 0;
        if (hlsMediaPlaylist == null) {
            return j;
        }
        int size = hlsMediaPlaylist.f13752m.size();
        C2209a d = m14015d(hlsMediaPlaylist, hlsMediaPlaylist2);
        if (d != null) {
            return hlsMediaPlaylist.f13742c + d.f6379e;
        }
        return ((long) size) == hlsMediaPlaylist2.f13745f - hlsMediaPlaylist.f13745f ? hlsMediaPlaylist.m16994a() : j;
    }

    /* renamed from: c */
    private int m14010c(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        if (hlsMediaPlaylist2.f13743d) {
            return hlsMediaPlaylist2.f13744e;
        }
        int i = this.f11529k != null ? this.f11529k.f13744e : 0;
        if (hlsMediaPlaylist == null) {
            return i;
        }
        C2209a d = m14015d(hlsMediaPlaylist, hlsMediaPlaylist2);
        return d != null ? (hlsMediaPlaylist.f13744e + d.f6378d) - ((C2209a) hlsMediaPlaylist2.f13752m.get(0)).f6378d : i;
    }

    /* renamed from: d */
    private static C2209a m14015d(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        hlsMediaPlaylist2 = (int) (hlsMediaPlaylist2.f13745f - hlsMediaPlaylist.f13745f);
        hlsMediaPlaylist = hlsMediaPlaylist.f13752m;
        return hlsMediaPlaylist2 < hlsMediaPlaylist.size() ? (C2209a) hlsMediaPlaylist.get(hlsMediaPlaylist2) : null;
    }
}
