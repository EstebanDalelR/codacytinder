package com.tinder.data.recs;

import android.support.annotation.WorkerThread;
import com.tinder.data.recs.C8786k.C10995c;
import com.tinder.domain.di.EngineScope;
import com.tinder.domain.recs.GlobalRecsConsumptionListenerRegistry.Listener;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.recs.model.RecsUpdate.ClearAll;
import com.tinder.domain.recs.model.RecsUpdate.Consume;
import com.tinder.domain.recs.model.RecsUpdate.Insert;
import com.tinder.domain.recs.model.RecsUpdate.Remove;
import com.tinder.domain.recs.model.RecsUpdate.Rewind;
import com.tinder.domain.recs.model.RecsUpdate.Rewind.Reason;
import com.tinder.domain.recs.model.RecsUpdate.RewindCancel;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.SwipeActionContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19282g;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.functions.Func1;
import rx.subjects.ReplaySubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 D2\u00020\u0001:\u0002DEB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\u0018\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u0017H\u0002J\u001e\u0010$\u001a\u00020\u00172\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u000eH\u0002J\u0018\u0010(\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J \u0010*\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0002J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000eJ\u0010\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u000bH\u0017J \u00102\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u001704H\u0002J\u0010\u00105\u001a\u0002062\u0006\u00101\u001a\u00020\u000bH\u0002J\u0016\u00107\u001a\u00020\u00172\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0007J\u0010\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u000bH\u0007J\u0010\u0010;\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,H\u0007J\u0018\u0010<\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,H\u0007J\u0018\u0010=\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,H\u0007J8\u0010>\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u001e\u0010?\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0@2\u0006\u0010+\u001a\u00020,H\u0007J8\u0010A\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u001e\u0010?\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0@2\u0006\u0010+\u001a\u00020,H\u0002J\u0014\u0010B\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0014\u0010C\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/tinder/data/recs/RecsDataStore;", "Lcom/tinder/domain/recs/GlobalRecsConsumptionListenerRegistry$Listener;", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "rewindStack", "Lcom/tinder/data/recs/RewindStack;", "(Lcom/tinder/domain/recs/model/Rec$Source;Lcom/tinder/data/recs/RewindStack;)V", "getRecSource", "()Lcom/tinder/domain/recs/model/Rec$Source;", "recsQueue", "", "Lcom/tinder/domain/recs/model/Rec;", "recsUpdatesSubject", "Lrx/subjects/ReplaySubject;", "Lcom/tinder/domain/recs/model/RecsUpdate;", "appendRecs", "", "newRecs", "", "cancelRewind", "Lcom/tinder/domain/recs/model/Swipe;", "swipe", "clear", "", "consumeSwipe", "insertSingleRec", "newRec", "position", "", "loadRecs", "Lcom/tinder/data/recs/RecsFetchResults;", "mimicTimeConsumingIoOperation", "newOrderIndex", "notifyRecRemoved", "removedRec", "notifyRecsCleared", "notifyRecsInserted", "insertedRecs", "notifyRecsUpdate", "recsUpdate", "notifySwipeConsumed", "notifySwipeRewindCanceled", "notifySwipeRewound", "reason", "Lcom/tinder/domain/recs/model/RecsUpdate$Rewind$Reason;", "observeRecsUpdates", "Lrx/Observable;", "sinceRecsUpdate", "onRecConsumed", "rec", "removeFromRewindStack", "onComplete", "Lkotlin/Function0;", "removeRec", "Lcom/tinder/data/recs/RecsDataStore$RecRemovalInfo;", "removeRecs", "recsToBeRemoved", "removeSingleRec", "recToBeRemoved", "restoreFromRewindStack", "restoreSwipeAtPositionZero", "restoreSwipeAtSwipedPosition", "restoreSwipeToSelectedPosition", "positionSelector", "Lkotlin/Function2;", "restoreSwipeToSelectedPositionAndNotify", "lastKnownRecsUpdate", "withSwipedPosition", "Companion", "RecRemovalInfo", "engine_release"}, k = 1, mv = {1, 1, 9})
@EngineScope
/* renamed from: com.tinder.data.recs.i */
public final class C10992i implements Listener {
    /* renamed from: a */
    public static final C8784a f35722a = new C8784a();
    /* renamed from: b */
    private final List<Rec> f35723b = ((List) new ArrayList());
    /* renamed from: c */
    private final ReplaySubject<RecsUpdate> f35724c;
    @NotNull
    /* renamed from: d */
    private final Rec$Source f35725d;
    /* renamed from: e */
    private final C8788l f35726e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/data/recs/RecsDataStore$Companion;", "", "()V", "DEBUG", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.i$a */
    public static final class C8784a {
        private C8784a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/data/recs/RecsDataStore$RecRemovalInfo;", "", "rec", "Lcom/tinder/domain/recs/model/Rec;", "position", "", "(Lcom/tinder/domain/recs/model/Rec;I)V", "getPosition", "()I", "getRec", "()Lcom/tinder/domain/recs/model/Rec;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.i$b */
    private static final class C8785b {
        @NotNull
        /* renamed from: a */
        private final Rec f30848a;
        /* renamed from: b */
        private final int f30849b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8785b) {
                C8785b c8785b = (C8785b) obj;
                if (C2668g.a(this.f30848a, c8785b.f30848a)) {
                    if ((this.f30849b == c8785b.f30849b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Rec rec = this.f30848a;
            return ((rec != null ? rec.hashCode() : 0) * 31) + this.f30849b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RecRemovalInfo(rec=");
            stringBuilder.append(this.f30848a);
            stringBuilder.append(", position=");
            stringBuilder.append(this.f30849b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8785b(@NotNull Rec rec, int i) {
            C2668g.b(rec, "rec");
            this.f30848a = rec;
            this.f30849b = i;
        }

        @NotNull
        /* renamed from: a */
        public final Rec m37391a() {
            return this.f30848a;
        }

        /* renamed from: b */
        public final int m37392b() {
            return this.f30849b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/RecsUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.i$c */
    static final class C13103c<T, R> implements Func1<RecsUpdate, Boolean> {
        /* renamed from: a */
        final /* synthetic */ C10992i f41725a;
        /* renamed from: b */
        final /* synthetic */ RecsUpdate f41726b;

        C13103c(C10992i c10992i, RecsUpdate recsUpdate) {
            this.f41725a = c10992i;
            this.f41726b = recsUpdate;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50960a((RecsUpdate) obj));
        }

        /* renamed from: a */
        public final boolean m50960a(RecsUpdate recsUpdate) {
            synchronized (this.f41725a) {
                RecsUpdate a = this.f41725a.m43609a(this.f41725a.f35724c);
            }
            boolean z = true;
            if (a == null) {
                return true;
            }
            RecsUpdate recsUpdate2 = this.f41726b;
            if (recsUpdate2 != null) {
                a = recsUpdate2;
            }
            if (recsUpdate.getOrderIndex() < a.getOrderIndex()) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: e */
    private final void m43625e() {
    }

    @Inject
    public C10992i(@NotNull Rec$Source rec$Source, @NotNull C8788l c8788l) {
        C2668g.b(rec$Source, "recSource");
        C2668g.b(c8788l, "rewindStack");
        this.f35725d = rec$Source;
        this.f35726e = c8788l;
        rec$Source = ReplaySubject.w();
        C2668g.a(rec$Source, "ReplaySubject.create()");
        this.f35724c = rec$Source;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<RecsUpdate> m43631a(@Nullable RecsUpdate recsUpdate) {
        recsUpdate = this.f35724c.e().f(new C13103c(this, recsUpdate)).k();
        C2668g.a(recsUpdate, "recsUpdatesSubject.asObs…  .onBackpressureBuffer()");
        return recsUpdate;
    }

    @WorkerThread
    public synchronized void onRecConsumed(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        if (this.f35723b.contains(rec)) {
            m43632a(rec);
        }
    }

    @WorkerThread
    @NotNull
    /* renamed from: a */
    public final C8786k m43626a() {
        m43625e();
        return new C10995c(this.f35723b);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    public final synchronized boolean m43634a(@org.jetbrains.annotations.NotNull java.util.List<? extends com.tinder.domain.recs.model.Rec> r11) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = "newRecs";
        kotlin.jvm.internal.C2668g.b(r11, r0);	 Catch:{ all -> 0x0093 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0093 }
        r0.<init>();	 Catch:{ all -> 0x0093 }
        r1 = "";
        r0.append(r1);	 Catch:{ all -> 0x0093 }
        r1 = r10.f35725d;	 Catch:{ all -> 0x0093 }
        r0.append(r1);	 Catch:{ all -> 0x0093 }
        r1 = " - appendRecs(): ";
        r0.append(r1);	 Catch:{ all -> 0x0093 }
        r0.append(r11);	 Catch:{ all -> 0x0093 }
        r0 = r0.toString();	 Catch:{ all -> 0x0093 }
        r1 = 0;
        r2 = new java.lang.Object[r1];	 Catch:{ all -> 0x0093 }
        p000a.p001a.C0001a.a(r0, r2);	 Catch:{ all -> 0x0093 }
        r0 = com.tinder.util.C15349a.f47591a;	 Catch:{ all -> 0x0093 }
        r2 = r11;
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0093 }
        r0 = r0.a(r2);	 Catch:{ all -> 0x0093 }
        if (r0 == 0) goto L_0x0034;
    L_0x0032:
        monitor-exit(r10);
        return r1;
    L_0x0034:
        r10.m43625e();	 Catch:{ all -> 0x0093 }
        r0 = r10.f35723b;	 Catch:{ all -> 0x0093 }
        r0 = r0.size();	 Catch:{ all -> 0x0093 }
        r2 = new java.util.HashSet;	 Catch:{ all -> 0x0093 }
        r3 = r10.f35723b;	 Catch:{ all -> 0x0093 }
        r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x0093 }
        r2.<init>(r3);	 Catch:{ all -> 0x0093 }
        r11 = (java.lang.Iterable) r11;	 Catch:{ all -> 0x0093 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0093 }
        r3.<init>();	 Catch:{ all -> 0x0093 }
        r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x0093 }
        r11 = r11.iterator();	 Catch:{ all -> 0x0093 }
    L_0x0053:
        r4 = r11.hasNext();	 Catch:{ all -> 0x0093 }
        if (r4 == 0) goto L_0x0081;
    L_0x0059:
        r4 = r11.next();	 Catch:{ all -> 0x0093 }
        r5 = r4;
        r5 = (com.tinder.domain.recs.model.Rec) r5;	 Catch:{ all -> 0x0093 }
        r6 = r2.contains(r5);	 Catch:{ all -> 0x0093 }
        if (r6 == 0) goto L_0x0079;
    L_0x0066:
        r7 = "%s - Trying to append a duplicate Rec into the recs queue. Skipping it... %s";
        r8 = 2;
        r8 = new java.lang.Object[r8];	 Catch:{ all -> 0x0093 }
        r9 = r10.f35725d;	 Catch:{ all -> 0x0093 }
        r8[r1] = r9;	 Catch:{ all -> 0x0093 }
        r5 = r5.getId();	 Catch:{ all -> 0x0093 }
        r9 = 1;
        r8[r9] = r5;	 Catch:{ all -> 0x0093 }
        p000a.p001a.C0001a.b(r7, r8);	 Catch:{ all -> 0x0093 }
    L_0x0079:
        r5 = r6 ^ 1;
        if (r5 == 0) goto L_0x0053;
    L_0x007d:
        r3.add(r4);	 Catch:{ all -> 0x0093 }
        goto L_0x0053;
    L_0x0081:
        r3 = (java.util.List) r3;	 Catch:{ all -> 0x0093 }
        r11 = r10.f35723b;	 Catch:{ all -> 0x0093 }
        r1 = r3;
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0093 }
        r11 = r11.addAll(r1);	 Catch:{ all -> 0x0093 }
        if (r11 == 0) goto L_0x0091;
    L_0x008e:
        r10.m43616a(r3, r0);	 Catch:{ all -> 0x0093 }
    L_0x0091:
        monitor-exit(r10);
        return r11;
    L_0x0093:
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.recs.i.a(java.util.List):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    public final synchronized boolean m43633a(@org.jetbrains.annotations.NotNull com.tinder.domain.recs.model.Rec r4, int r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = "newRec";
        kotlin.jvm.internal.C2668g.b(r4, r0);	 Catch:{ all -> 0x00b2 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b2 }
        r0.<init>();	 Catch:{ all -> 0x00b2 }
        r1 = "";
        r0.append(r1);	 Catch:{ all -> 0x00b2 }
        r1 = r3.f35725d;	 Catch:{ all -> 0x00b2 }
        r0.append(r1);	 Catch:{ all -> 0x00b2 }
        r1 = " - insertSingleRec(";
        r0.append(r1);	 Catch:{ all -> 0x00b2 }
        r0.append(r5);	 Catch:{ all -> 0x00b2 }
        r1 = "): ";
        r0.append(r1);	 Catch:{ all -> 0x00b2 }
        r0.append(r4);	 Catch:{ all -> 0x00b2 }
        r0 = r0.toString();	 Catch:{ all -> 0x00b2 }
        r1 = 0;
        r2 = new java.lang.Object[r1];	 Catch:{ all -> 0x00b2 }
        p000a.p001a.C0001a.a(r0, r2);	 Catch:{ all -> 0x00b2 }
        if (r5 < 0) goto L_0x0033;
    L_0x0031:
        r0 = 1;
        goto L_0x0034;
    L_0x0033:
        r0 = 0;
    L_0x0034:
        if (r0 != 0) goto L_0x005b;
    L_0x0036:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b2 }
        r0.<init>();	 Catch:{ all -> 0x00b2 }
        r1 = "Rec insert position should never be negative, but position was ";
        r0.append(r1);	 Catch:{ all -> 0x00b2 }
        r0.append(r5);	 Catch:{ all -> 0x00b2 }
        r5 = " for ";
        r0.append(r5);	 Catch:{ all -> 0x00b2 }
        r0.append(r4);	 Catch:{ all -> 0x00b2 }
        r4 = r0.toString();	 Catch:{ all -> 0x00b2 }
        r5 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x00b2 }
        r4 = r4.toString();	 Catch:{ all -> 0x00b2 }
        r5.<init>(r4);	 Catch:{ all -> 0x00b2 }
        r5 = (java.lang.Throwable) r5;	 Catch:{ all -> 0x00b2 }
        throw r5;	 Catch:{ all -> 0x00b2 }
    L_0x005b:
        r0 = r3.f35723b;	 Catch:{ all -> 0x00b2 }
        r0 = r0.contains(r4);	 Catch:{ all -> 0x00b2 }
        if (r0 == 0) goto L_0x008a;
    L_0x0063:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b2 }
        r5.<init>();	 Catch:{ all -> 0x00b2 }
        r0 = "";
        r5.append(r0);	 Catch:{ all -> 0x00b2 }
        r0 = r3.f35725d;	 Catch:{ all -> 0x00b2 }
        r5.append(r0);	 Catch:{ all -> 0x00b2 }
        r0 = " - Rec already exists in recsQueue, so it's a no-op: ";
        r5.append(r0);	 Catch:{ all -> 0x00b2 }
        r5.append(r4);	 Catch:{ all -> 0x00b2 }
        r4 = 46;
        r5.append(r4);	 Catch:{ all -> 0x00b2 }
        r4 = r5.toString();	 Catch:{ all -> 0x00b2 }
        r5 = new java.lang.Object[r1];	 Catch:{ all -> 0x00b2 }
        p000a.p001a.C0001a.b(r4, r5);	 Catch:{ all -> 0x00b2 }
        monitor-exit(r3);
        return r1;
    L_0x008a:
        r0 = r3.f35723b;	 Catch:{ all -> 0x00b2 }
        r0 = r0.size();	 Catch:{ all -> 0x00b2 }
        if (r0 >= r5) goto L_0x0098;
    L_0x0092:
        r5 = r3.f35723b;	 Catch:{ all -> 0x00b2 }
        r5 = r5.size();	 Catch:{ all -> 0x00b2 }
    L_0x0098:
        r3.m43625e();	 Catch:{ all -> 0x00b2 }
        r0 = r3.f35723b;	 Catch:{ all -> 0x00b2 }
        r1 = kotlin.collections.C19301m.a(r4);	 Catch:{ all -> 0x00b2 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x00b2 }
        r0 = r0.addAll(r5, r1);	 Catch:{ all -> 0x00b2 }
        if (r0 == 0) goto L_0x00b0;
    L_0x00a9:
        r4 = kotlin.collections.C19301m.a(r4);	 Catch:{ all -> 0x00b2 }
        r3.m43616a(r4, r5);	 Catch:{ all -> 0x00b2 }
    L_0x00b0:
        monitor-exit(r3);
        return r0;
    L_0x00b2:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.recs.i.a(com.tinder.domain.recs.model.Rec, int):boolean");
    }

    @WorkerThread
    /* renamed from: a */
    public final synchronized void m43632a(@NotNull Rec rec) {
        C2668g.b(rec, "recToBeRemoved");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f35725d);
        stringBuilder.append(" - removeSingleRec(): ");
        stringBuilder.append(rec);
        C0001a.a(stringBuilder.toString(), new Object[0]);
        rec = m43617b(rec);
        m43620b(rec.m37391a(), rec.m37392b());
    }

    @WorkerThread
    /* renamed from: b */
    public final synchronized void m43638b(@NotNull List<? extends Rec> list) {
        C2668g.b(list, "recsToBeRemoved");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f35725d);
        stringBuilder.append(" - removeSingleRec(): ");
        stringBuilder.append(list);
        C0001a.a(stringBuilder.toString(), new Object[0]);
        if (this.f35723b.containsAll(list)) {
            for (Rec a : list) {
                m43632a(a);
            }
        } else {
            list = new StringBuilder();
            list.append("One or more recs are not present in ");
            list.append(this.f35725d);
            list.append("'s recsQueue. Remove operation was cancelled.");
            throw new IllegalStateException(list.toString().toString());
        }
    }

    @WorkerThread
    @NotNull
    /* renamed from: a */
    public final synchronized Swipe m43628a(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f35725d);
        stringBuilder.append(" - consumeSwipe(): ");
        stringBuilder.append(swipe);
        C0001a.a(stringBuilder.toString(), new Object[0]);
        C8785b b = m43617b(swipe.getRec());
        swipe = m43618b(swipe, b.m37392b());
        if (b.m37391a().isRewindable()) {
            this.f35726e.m37399a(swipe);
        }
        m43614a(swipe, b.m37392b());
        return swipe;
    }

    @WorkerThread
    @NotNull
    /* renamed from: b */
    public final synchronized Swipe m43635b(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        return m43611a(swipe, (Function0) new RecsDataStore$cancelRewind$1(this, swipe));
    }

    @WorkerThread
    @NotNull
    /* renamed from: a */
    public final synchronized Swipe m43627a(@NotNull Reason reason) {
        Swipe a;
        C2668g.b(reason, "reason");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f35725d);
        stringBuilder.append(" - restoreFromRewindStack()");
        int i = 0;
        C0001a.a(stringBuilder.toString(), new Object[0]);
        a = this.f35726e.m37398a();
        if (a != null) {
            i = 1;
        }
        if (i == 0) {
            throw new IllegalStateException("Rewind Stack is empty".toString());
        }
        if (a == null) {
            C2668g.a();
        }
        m43629a(a, reason);
        return a;
    }

    @WorkerThread
    @NotNull
    /* renamed from: a */
    public final synchronized Swipe m43629a(@NotNull Swipe swipe, @NotNull Reason reason) {
        C2668g.b(swipe, "swipe");
        C2668g.b(reason, "reason");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f35725d);
        stringBuilder.append(" - restoreSwipeAtPositionZero(): ");
        stringBuilder.append(swipe);
        C0001a.a(stringBuilder.toString(), new Object[0]);
        return m43619b(swipe, RecsDataStore$restoreSwipeAtPositionZero$1.f43991a, reason);
    }

    @WorkerThread
    @NotNull
    /* renamed from: b */
    public final synchronized Swipe m43636b(@NotNull Swipe swipe, @NotNull Reason reason) {
        C2668g.b(swipe, "swipe");
        C2668g.b(reason, "reason");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f35725d);
        stringBuilder.append(" - restoreSwipeAtSwipedPosition(): ");
        stringBuilder.append(swipe);
        C0001a.a(stringBuilder.toString(), new Object[0]);
        return m43619b(swipe, new RecsDataStore$restoreSwipeAtSwipedPosition$1(swipe), reason);
    }

    @WorkerThread
    @NotNull
    /* renamed from: a */
    public final synchronized Swipe m43630a(@NotNull Swipe swipe, @NotNull Function2<? super List<? extends Rec>, ? super Integer, Integer> function2, @NotNull Reason reason) {
        C2668g.b(swipe, "swipe");
        C2668g.b(function2, "positionSelector");
        C2668g.b(reason, "reason");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f35725d);
        stringBuilder.append(" - rewindSwipeToSelectedPosition(): ");
        stringBuilder.append(swipe);
        C0001a.a(stringBuilder.toString(), new Object[0]);
        return m43619b(swipe, function2, reason);
    }

    /* renamed from: b */
    public final synchronized void m43637b() {
        m43625e();
        this.f35723b.clear();
        this.f35726e.m37401b();
        m43624d();
    }

    /* renamed from: b */
    private final Swipe m43619b(Swipe swipe, Function2<? super List<? extends Rec>, ? super Integer, Integer> function2, Reason reason) {
        C10992i.m43610a(this, swipe, null, 2, null);
        if (this.f35723b.contains(swipe.getRec())) {
            return swipe;
        }
        m43625e();
        int max = Math.max(0, Math.min(this.f35723b.size(), ((Number) function2.invoke(C19301m.l(this.f35723b), Integer.valueOf(swipe.getActionContext().getSwipedPosition$engine_release()))).intValue()));
        this.f35723b.add(max, swipe.getRec());
        m43615a(swipe, max, reason);
        return swipe;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ Swipe m43610a(C10992i c10992i, Swipe swipe, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = RecsDataStore$removeFromRewindStack$1.f43990a;
        }
        return c10992i.m43611a(swipe, function0);
    }

    /* renamed from: a */
    private final Swipe m43611a(Swipe swipe, Function0<C15813i> function0) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f35725d);
        stringBuilder.append(" - cancelRewind(): ");
        stringBuilder.append(swipe);
        C0001a.a(stringBuilder.toString(), new Object[0]);
        if (this.f35726e.m37402b(swipe)) {
            this.f35726e.m37404c(swipe);
            function0.invoke();
        }
        return swipe;
    }

    /* renamed from: b */
    private final C8785b m43617b(Rec rec) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f35725d);
        stringBuilder.append(" - removeRec(): ");
        stringBuilder.append(rec);
        int i = 0;
        C0001a.a(stringBuilder.toString(), new Object[0]);
        if ((this.f35723b.isEmpty() ^ 1) == 0) {
            throw new IllegalStateException("No Recs available.".toString());
        }
        rec = this.f35723b.indexOf(rec);
        if (rec >= null) {
            i = 1;
        }
        if (i == 0) {
            throw new IllegalStateException("Attempted to remove rec which does not exist.".toString());
        }
        m43625e();
        Rec rec2 = (Rec) this.f35723b.get(rec);
        this.f35723b.remove(rec2);
        return new C8785b(rec2, rec);
    }

    /* renamed from: a */
    private final void m43614a(Swipe swipe, int i) {
        int c = this.f35726e.m37403c();
        List unmodifiableList = Collections.unmodifiableList(C19301m.l(this.f35723b));
        C2668g.a(unmodifiableList, "Collections.unmodifiableList(recsQueue.toList())");
        m43621b((RecsUpdate) new Consume(swipe, i, c, unmodifiableList, m43622c()));
    }

    /* renamed from: a */
    private final void m43615a(Swipe swipe, int i, Reason reason) {
        Swipe b = m43618b(swipe, i);
        int c = this.f35726e.m37403c();
        List unmodifiableList = Collections.unmodifiableList(C19301m.l((Iterable) this.f35723b));
        C2668g.a(unmodifiableList, "Collections.unmodifiableList(recsQueue.toList())");
        m43621b((RecsUpdate) new Rewind(b, i, c, unmodifiableList, m43622c(), reason));
    }

    /* renamed from: c */
    private final void m43623c(Swipe swipe) {
        int c = this.f35726e.m37403c();
        List unmodifiableList = Collections.unmodifiableList(C19301m.l(this.f35723b));
        C2668g.a(unmodifiableList, "Collections.unmodifiableList(recsQueue.toList())");
        m43621b((RecsUpdate) new RewindCancel(swipe, c, unmodifiableList, m43622c()));
    }

    /* renamed from: c */
    private final int m43622c() {
        if (!this.f35724c.y()) {
            return 1;
        }
        Object z = this.f35724c.z();
        C2668g.a(z, "recsUpdatesSubject.values");
        z = C19282g.e(z);
        if (z != null) {
            return 1 + ((RecsUpdate) z).getOrderIndex();
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.RecsUpdate");
    }

    /* renamed from: a */
    private final void m43616a(List<? extends Rec> list, int i) {
        int c = this.f35726e.m37403c();
        List unmodifiableList = Collections.unmodifiableList(C19301m.l(this.f35723b));
        C2668g.a(unmodifiableList, "Collections.unmodifiableList(recsQueue.toList())");
        m43621b((RecsUpdate) new Insert(list, i, c, unmodifiableList, m43622c()));
    }

    /* renamed from: b */
    private final void m43620b(Rec rec, int i) {
        int c = this.f35726e.m37403c();
        List unmodifiableList = Collections.unmodifiableList(C19301m.l(this.f35723b));
        C2668g.a(unmodifiableList, "Collections.unmodifiableList(recsQueue.toList())");
        m43621b((RecsUpdate) new Remove(rec, i, c, unmodifiableList, m43622c()));
    }

    /* renamed from: d */
    private final void m43624d() {
        int c = this.f35726e.m37403c();
        List unmodifiableList = Collections.unmodifiableList(C19301m.l(this.f35723b));
        C2668g.a(unmodifiableList, "Collections.unmodifiableList(recsQueue.toList())");
        m43621b((RecsUpdate) new ClearAll(c, unmodifiableList, m43622c()));
    }

    /* renamed from: b */
    private final void m43621b(RecsUpdate recsUpdate) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f35725d);
        stringBuilder.append(" - Notifying RecsUpdate: ");
        stringBuilder.append(recsUpdate);
        C0001a.a(stringBuilder.toString(), new Object[0]);
        this.f35724c.onNext(recsUpdate);
    }

    /* renamed from: b */
    private final Swipe m43618b(@NotNull Swipe swipe, int i) {
        return Swipe.copy$default(swipe, null, null, SwipeActionContext.copy$default(swipe.getActionContext(), null, null, i, 3, null), 3, null);
    }

    /* renamed from: a */
    private final RecsUpdate m43609a(@NotNull ReplaySubject<RecsUpdate> replaySubject) {
        if (!replaySubject.y()) {
            return null;
        }
        replaySubject = replaySubject.z();
        C2668g.a(replaySubject, "this.values");
        replaySubject = C19282g.e(replaySubject);
        if (replaySubject != null) {
            return (RecsUpdate) replaySubject;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.RecsUpdate");
    }
}
