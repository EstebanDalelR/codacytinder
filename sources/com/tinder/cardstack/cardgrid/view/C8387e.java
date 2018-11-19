package com.tinder.cardstack.cardgrid.view;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/ScrollVelocityTracker;", "", "()V", "previousScrollOffsetUpdate", "Lcom/tinder/cardstack/cardgrid/view/ScrollVelocityTracker$ScrollOffsetUpdate;", "scrollOffsetUpdate", "velocity", "", "computeVelocity", "getLastUpdateTimestamp", "", "getVelocity", "track", "", "scrollOffset", "ScrollOffsetUpdate", "cardstack_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.cardstack.cardgrid.view.e */
public final class C8387e {
    /* renamed from: a */
    private float f29762a;
    /* renamed from: b */
    private final C8386a f29763b = new C8386a(0.0f, 0, 3, null);
    /* renamed from: c */
    private final C8386a f29764c = new C8386a(0.0f, 0, 3, null);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/ScrollVelocityTracker$ScrollOffsetUpdate;", "", "scrollOffset", "", "timestamp", "", "(FJ)V", "getScrollOffset", "()F", "setScrollOffset", "(F)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.e$a */
    private static final class C8386a {
        /* renamed from: a */
        private float f29760a;
        /* renamed from: b */
        private long f29761b;

        public C8386a() {
            this(0.0f, 0, 3, null);
        }

        public C8386a(float f, long j) {
            this.f29760a = f;
            this.f29761b = j;
        }

        public /* synthetic */ C8386a(float f, long j, int i, C15823e c15823e) {
            if ((i & 1) != null) {
                f = 0.0f;
            }
            if ((i & 2) != 0) {
                j = 0;
            }
            this(f, j);
        }

        /* renamed from: a */
        public final float m35748a() {
            return this.f29760a;
        }

        /* renamed from: a */
        public final void m35749a(float f) {
            this.f29760a = f;
        }

        /* renamed from: a */
        public final void m35750a(long j) {
            this.f29761b = j;
        }

        /* renamed from: b */
        public final long m35751b() {
            return this.f29761b;
        }
    }

    /* renamed from: a */
    public final float m35753a() {
        return this.f29762a;
    }

    /* renamed from: b */
    public final long m35755b() {
        return this.f29763b.m35751b();
    }

    /* renamed from: a */
    public final void m35754a(float f) {
        this.f29764c.m35749a(this.f29763b.m35748a());
        this.f29764c.m35750a(this.f29763b.m35751b());
        this.f29763b.m35749a(f);
        this.f29763b.m35750a(System.currentTimeMillis());
        this.f29762a = m35752c();
    }

    /* renamed from: c */
    private final float m35752c() {
        float b = ((float) (this.f29763b.m35751b() - this.f29764c.m35751b())) / 1000.0f;
        return b == 0.0f ? 0.0f : (this.f29763b.m35748a() - this.f29764c.m35748a()) / b;
    }
}
