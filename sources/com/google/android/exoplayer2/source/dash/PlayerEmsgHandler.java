package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2122i;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput.C2055a;
import com.google.android.exoplayer2.metadata.C4243a;
import com.google.android.exoplayer2.metadata.emsg.C3667a;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.C2302k;
import java.io.IOException;
import java.util.TreeMap;

public final class PlayerEmsgHandler implements Callback {
    /* renamed from: a */
    private final Allocator f6317a;
    /* renamed from: b */
    private final PlayerEmsgCallback f6318b;
    /* renamed from: c */
    private final C3667a f6319c;
    /* renamed from: d */
    private final Handler f6320d;
    /* renamed from: e */
    private final TreeMap<Long, Long> f6321e;
    /* renamed from: f */
    private boolean f6322f;
    /* renamed from: g */
    private boolean f6323g;

    public interface PlayerEmsgCallback {
        void onDashLiveMediaPresentationEndSignalEncountered();

        void onDashManifestPublishTimeExpired(long j);

        void onDashManifestRefreshRequested();
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$a */
    private static final class C2194a {
        /* renamed from: a */
        public final long f6315a;
        /* renamed from: b */
        public final long f6316b;

        public C2194a(long j, long j2) {
            this.f6315a = j;
            this.f6316b = j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$b */
    public final class C3683b implements TrackOutput {
        /* renamed from: a */
        final /* synthetic */ PlayerEmsgHandler f11428a;
        /* renamed from: b */
        private final SampleQueue f11429b;
        /* renamed from: c */
        private final C2122i f11430c = new C2122i();
        /* renamed from: d */
        private final C4243a f11431d = new C4243a();

        C3683b(PlayerEmsgHandler playerEmsgHandler, SampleQueue sampleQueue) {
            this.f11428a = playerEmsgHandler;
            this.f11429b = sampleQueue;
        }

        public void format(Format format) {
            this.f11429b.format(format);
        }

        public int sampleData(ExtractorInput extractorInput, int i, boolean z) throws IOException, InterruptedException {
            return this.f11429b.sampleData(extractorInput, i, z);
        }

        public void sampleData(C2302k c2302k, int i) {
            this.f11429b.sampleData(c2302k, i);
        }

        public void sampleMetadata(long j, int i, int i2, int i3, C2055a c2055a) {
            this.f11429b.sampleMetadata(j, i, i2, i3, c2055a);
            m13950b();
        }

        /* renamed from: a */
        public void m13953a() {
            this.f11429b.m13871a();
        }

        /* renamed from: b */
        private void m13950b() {
            while (this.f11429b.m13882d()) {
                C4243a c = m13951c();
                if (c != null) {
                    long j = c.c;
                    EventMessage eventMessage = (EventMessage) this.f11428a.f6319c.decode(c).get(0);
                    if (PlayerEmsgHandler.m7869a(eventMessage.schemeIdUri, eventMessage.value)) {
                        m13949a(j, eventMessage);
                    }
                }
            }
            this.f11429b.m13889k();
        }

        @Nullable
        /* renamed from: c */
        private C4243a m13951c() {
            this.f11431d.mo2221a();
            if (this.f11429b.m13870a(this.f11430c, this.f11431d, false, false, 0) != -4) {
                return null;
            }
            this.f11431d.m13521h();
            return this.f11431d;
        }

        /* renamed from: a */
        private void m13949a(long j, EventMessage eventMessage) {
            long a = PlayerEmsgHandler.m7873c(eventMessage);
            if (a != -9223372036854775807L) {
                if (PlayerEmsgHandler.m7875d(eventMessage) != null) {
                    m13952d();
                } else {
                    m13948a(j, a);
                }
            }
        }

        /* renamed from: d */
        private void m13952d() {
            this.f11428a.f6320d.sendMessage(this.f11428a.f6320d.obtainMessage(1));
        }

        /* renamed from: a */
        private void m13948a(long j, long j2) {
            this.f11428a.f6320d.sendMessage(this.f11428a.f6320d.obtainMessage(2, new C2194a(j, j2)));
        }
    }

    /* renamed from: a */
    public static boolean m7869a(String str, String str2) {
        return ("urn:mpeg:dash:event:2012".equals(str) == null || ("1".equals(str2) == null && "2".equals(str2) == null && "3".equals(str2) == null)) ? null : true;
    }

    /* renamed from: a */
    public C3683b m7876a() {
        return new C3683b(this, new SampleQueue(this.f6317a));
    }

    public boolean handleMessage(Message message) {
        if (this.f6323g) {
            return true;
        }
        switch (message.what) {
            case 1:
                m7871b();
                return true;
            case 2:
                C2194a c2194a = (C2194a) message.obj;
                m7868a(c2194a.f6315a, c2194a.f6316b);
                return true;
            default:
                return null;
        }
    }

    /* renamed from: a */
    private void m7868a(long j, long j2) {
        Long l = (Long) this.f6321e.get(Long.valueOf(j2));
        if (l == null) {
            this.f6321e.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f6321e.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    /* renamed from: b */
    private void m7871b() {
        this.f6322f = true;
        m7874c();
    }

    /* renamed from: c */
    private void m7874c() {
        this.f6318b.onDashLiveMediaPresentationEndSignalEncountered();
    }

    /* renamed from: c */
    private static long m7873c(com.google.android.exoplayer2.metadata.emsg.EventMessage r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = new java.lang.String;	 Catch:{ ParserException -> 0x000c }
        r2 = r2.messageData;	 Catch:{ ParserException -> 0x000c }
        r0.<init>(r2);	 Catch:{ ParserException -> 0x000c }
        r0 = com.google.android.exoplayer2.util.C2314v.m8498f(r0);	 Catch:{ ParserException -> 0x000c }
        return r0;
    L_0x000c:
        r0 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.c(com.google.android.exoplayer2.metadata.emsg.EventMessage):long");
    }

    /* renamed from: d */
    private static boolean m7875d(EventMessage eventMessage) {
        return (eventMessage.presentationTimeUs == 0 && eventMessage.durationMs == 0) ? true : null;
    }
}
