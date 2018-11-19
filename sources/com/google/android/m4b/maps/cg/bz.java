package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.model.Tile;
import com.google.android.m4b.maps.model.TileProvider;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class bz {
    /* renamed from: a */
    static final long f19157a = TimeUnit.MINUTES.toMillis(5);
    /* renamed from: b */
    private final ScheduledExecutorService f19158b;
    /* renamed from: c */
    private final Random f19159c;
    /* renamed from: d */
    private final TileProvider f19160d;

    /* renamed from: com.google.android.m4b.maps.cg.bz$a */
    public interface C5159a {
        /* renamed from: a */
        void mo4999a(C5160b c5160b);

        /* renamed from: a */
        void mo5000a(C5160b c5160b, Tile tile);
    }

    /* renamed from: com.google.android.m4b.maps.cg.bz$b */
    public class C5160b implements Runnable {
        /* renamed from: a */
        public final int f19150a;
        /* renamed from: b */
        public final int f19151b;
        /* renamed from: c */
        public final int f19152c;
        /* renamed from: d */
        private final C5159a f19153d;
        /* renamed from: e */
        private ScheduledFuture f19154e = null;
        /* renamed from: f */
        private int f19155f = null;
        /* renamed from: g */
        private /* synthetic */ bz f19156g;

        public C5160b(bz bzVar, int i, int i2, int i3, C5159a c5159a) {
            this.f19156g = bzVar;
            this.f19150a = i;
            this.f19151b = i2;
            this.f19152c = i3;
            this.f19153d = c5159a;
        }

        /* renamed from: a */
        public final synchronized void m23066a() {
            if (!(this.f19154e == null || this.f19154e.isCancelled() || this.f19154e.isDone())) {
                this.f19154e.cancel(false);
            }
        }

        public final synchronized void run() {
            Tile tile = this.f19156g.f19160d.getTile(this.f19150a, this.f19151b, this.f19152c);
            if (tile == null) {
                int i = this.f19155f;
                this.f19155f = i + 1;
                long pow = (long) ((Math.pow(2.0d, (double) i) * 200.0d) + ((double) this.f19156g.f19159c.nextInt(100)));
                if (pow < bz.f19157a) {
                    this.f19154e = this.f19156g.f19158b.schedule(this, pow, TimeUnit.MILLISECONDS);
                } else {
                    this.f19153d.mo4999a(this);
                }
            } else if (tile.width == TileProvider.f20501a.width && tile.height == TileProvider.f20501a.height && tile.data == TileProvider.f20501a.data) {
                this.f19153d.mo4999a(this);
            } else {
                this.f19153d.mo5000a(this, tile);
            }
        }
    }

    public bz(ScheduledExecutorService scheduledExecutorService, Random random, TileProvider tileProvider) {
        this.f19158b = scheduledExecutorService;
        this.f19159c = random;
        this.f19160d = tileProvider;
    }

    /* renamed from: a */
    public final C5160b m23070a(int i, int i2, int i3, C5159a c5159a) {
        C5160b c5160b = new C5160b(this, i, i2, i3, c5159a);
        this.f19158b.execute(c5160b);
        return c5160b;
    }
}
