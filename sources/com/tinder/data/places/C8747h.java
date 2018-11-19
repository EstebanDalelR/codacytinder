package com.tinder.data.places;

import com.tinder.domain.places.PlacesRepository.PlaceUpdate;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Corrected;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Created;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Deleted;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Found;
import com.tinder.domain.places.model.Place;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0007J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0011\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0007J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0016\u0010\u001e\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0007J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0007J \u0010!\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0013H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/tinder/data/places/PlacesDataStore;", "", "()V", "placesCache", "", "Lcom/tinder/domain/places/model/Place;", "subject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "correctPlace", "", "oldId", "", "newPlace", "decrementVisitors", "id", "isNew", "", "minimum", "", "find", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate$Found;", "get", "index", "getFromCache", "", "getObservable", "Lrx/Observable;", "indexOf", "markPlaceViewed", "refresh", "places", "remove", "updateVisitorCounts", "newVisitorCount", "totalVisitorCount", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.places.h */
public final class C8747h {
    /* renamed from: a */
    private final List<Place> f30733a = new ArrayList();
    /* renamed from: b */
    private final PublishSubject<PlaceUpdate> f30734b;

    /* renamed from: a */
    public final synchronized void m37262a(@org.jetbrains.annotations.NotNull java.lang.String r21, int r22, int r23) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 15, insn: 0x001f: IF  (r4_3 ?[int, OBJECT, ARRAY, boolean, byte, short, char]) != (r15 ?[int, OBJECT, ARRAY, boolean, byte, short, char])  -> B:10:0x002a, block:B:6:0x001f, method: com.tinder.data.places.h.a(java.lang.String, int, int):void
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:168)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:132)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r20 = this;
        r1 = r20;
        r2 = r21;
        monitor-enter(r20);
        r3 = "id";	 Catch:{ all -> 0x0075 }
        kotlin.jvm.internal.C2668g.b(r2, r3);	 Catch:{ all -> 0x0075 }
        r3 = m37258d(r21);	 Catch:{ all -> 0x0075 }
        r4 = -1;	 Catch:{ all -> 0x0075 }
        if (r3 == r4) goto L_0x005c;	 Catch:{ all -> 0x0075 }
    L_0x0011:
        r2 = r1.f30733a;	 Catch:{ all -> 0x0075 }
        r2 = r2.get(r3);	 Catch:{ all -> 0x0075 }
        r2 = (com.tinder.domain.places.model.Place) r2;	 Catch:{ all -> 0x0075 }
        r4 = r2.getNewVisitors();	 Catch:{ all -> 0x0075 }
        r15 = r22;	 Catch:{ all -> 0x0075 }
        if (r4 != r15) goto L_0x002a;	 Catch:{ all -> 0x0075 }
    L_0x0021:
        r2 = r2.getTotalVisitors();	 Catch:{ all -> 0x0075 }
        r4 = r23;	 Catch:{ all -> 0x0075 }
        if (r2 == r4) goto L_0x0073;	 Catch:{ all -> 0x0075 }
    L_0x0029:
        goto L_0x002c;	 Catch:{ all -> 0x0075 }
    L_0x002a:
        r4 = r23;	 Catch:{ all -> 0x0075 }
    L_0x002c:
        r2 = r1.f30733a;	 Catch:{ all -> 0x0075 }
        r2 = r2.get(r3);	 Catch:{ all -> 0x0075 }
        r5 = r2;	 Catch:{ all -> 0x0075 }
        r5 = (com.tinder.domain.places.model.Place) r5;	 Catch:{ all -> 0x0075 }
        r6 = 0;	 Catch:{ all -> 0x0075 }
        r8 = 0;	 Catch:{ all -> 0x0075 }
        r9 = 0;	 Catch:{ all -> 0x0075 }
        r10 = 0;	 Catch:{ all -> 0x0075 }
        r11 = 0;	 Catch:{ all -> 0x0075 }
        r12 = 0;	 Catch:{ all -> 0x0075 }
        r13 = 0;	 Catch:{ all -> 0x0075 }
        r14 = 0;	 Catch:{ all -> 0x0075 }
        r2 = 0;	 Catch:{ all -> 0x0075 }
        r18 = 511; // 0x1ff float:7.16E-43 double:2.525E-321;	 Catch:{ all -> 0x0075 }
        r19 = 0;	 Catch:{ all -> 0x0075 }
        r15 = r2;	 Catch:{ all -> 0x0075 }
        r16 = r22;	 Catch:{ all -> 0x0075 }
        r17 = r4;	 Catch:{ all -> 0x0075 }
        r2 = com.tinder.domain.places.model.Place.copy$default(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);	 Catch:{ all -> 0x0075 }
        r4 = r1.f30733a;	 Catch:{ all -> 0x0075 }
        r4.set(r3, r2);	 Catch:{ all -> 0x0075 }
        r3 = r1.f30734b;	 Catch:{ all -> 0x0075 }
        r4 = new com.tinder.domain.places.PlacesRepository$PlaceUpdate$VisitorsUpdated;	 Catch:{ all -> 0x0075 }
        r4.<init>(r2);	 Catch:{ all -> 0x0075 }
        r3.onNext(r4);	 Catch:{ all -> 0x0075 }
        goto L_0x0073;	 Catch:{ all -> 0x0075 }
    L_0x005c:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0075 }
        r3.<init>();	 Catch:{ all -> 0x0075 }
        r4 = "unexpectedly could not update visitor counts ";	 Catch:{ all -> 0x0075 }
        r3.append(r4);	 Catch:{ all -> 0x0075 }
        r3.append(r2);	 Catch:{ all -> 0x0075 }
        r2 = r3.toString();	 Catch:{ all -> 0x0075 }
        r3 = 0;	 Catch:{ all -> 0x0075 }
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x0075 }
        p000a.p001a.C0001a.e(r2, r3);	 Catch:{ all -> 0x0075 }
    L_0x0073:
        monitor-exit(r20);
        return;
    L_0x0075:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r20);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.places.h.a(java.lang.String, int, int):void");
    }

    /* renamed from: a */
    public final synchronized void m37264a(@org.jetbrains.annotations.NotNull java.lang.String r22, boolean r23, int r24) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 6, insn: 0x0021: INVOKE  (r2 int) = (r6 com.tinder.domain.places.model.Place) com.tinder.domain.places.model.Place.getNewVisitors():int type: VIRTUAL, block:B:7:0x0021, method: com.tinder.data.places.h.a(java.lang.String, boolean, int):void
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:168)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:132)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r21 = this;
        r1 = r21;
        r2 = r22;
        monitor-enter(r21);
        r3 = "id";	 Catch:{ all -> 0x007a }
        kotlin.jvm.internal.C2668g.b(r2, r3);	 Catch:{ all -> 0x007a }
        r3 = m37258d(r22);	 Catch:{ all -> 0x007a }
        r4 = 0;	 Catch:{ all -> 0x007a }
        r5 = -1;	 Catch:{ all -> 0x007a }
        if (r3 == r5) goto L_0x0062;	 Catch:{ all -> 0x007a }
    L_0x0012:
        r2 = r1.f30733a;	 Catch:{ all -> 0x007a }
        r2 = r2.get(r3);	 Catch:{ all -> 0x007a }
        r6 = r2;	 Catch:{ all -> 0x007a }
        r6 = (com.tinder.domain.places.model.Place) r6;	 Catch:{ all -> 0x007a }
        r2 = r6.getTotalVisitors();	 Catch:{ all -> 0x007a }
        if (r2 == r5) goto L_0x0078;	 Catch:{ all -> 0x007a }
    L_0x0021:
        r2 = r6.getNewVisitors();	 Catch:{ all -> 0x007a }
        if (r2 == r5) goto L_0x0078;	 Catch:{ all -> 0x007a }
    L_0x0027:
        r2 = r6.getTotalVisitors();	 Catch:{ all -> 0x007a }
        r2 = r2 + -1;	 Catch:{ all -> 0x007a }
        r5 = r24;	 Catch:{ all -> 0x007a }
        r2 = java.lang.Math.max(r5, r2);	 Catch:{ all -> 0x007a }
        r5 = r6.getNewVisitors();	 Catch:{ all -> 0x007a }
        r5 = r5 - r23;	 Catch:{ all -> 0x007a }
        r17 = com.tinder.data.places.C8748i.m37270b(r5, r4, r2);	 Catch:{ all -> 0x007a }
        r7 = 0;	 Catch:{ all -> 0x007a }
        r9 = 0;	 Catch:{ all -> 0x007a }
        r10 = 0;	 Catch:{ all -> 0x007a }
        r11 = 0;	 Catch:{ all -> 0x007a }
        r12 = 0;	 Catch:{ all -> 0x007a }
        r13 = 0;	 Catch:{ all -> 0x007a }
        r14 = 0;	 Catch:{ all -> 0x007a }
        r15 = 0;	 Catch:{ all -> 0x007a }
        r16 = 0;	 Catch:{ all -> 0x007a }
        r19 = 511; // 0x1ff float:7.16E-43 double:2.525E-321;	 Catch:{ all -> 0x007a }
        r20 = 0;	 Catch:{ all -> 0x007a }
        r18 = r2;	 Catch:{ all -> 0x007a }
        r2 = com.tinder.domain.places.model.Place.copy$default(r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ all -> 0x007a }
        r4 = r1.f30733a;	 Catch:{ all -> 0x007a }
        r4.set(r3, r2);	 Catch:{ all -> 0x007a }
        r3 = r1.f30734b;	 Catch:{ all -> 0x007a }
        r4 = new com.tinder.domain.places.PlacesRepository$PlaceUpdate$VisitorsUpdated;	 Catch:{ all -> 0x007a }
        r4.<init>(r2);	 Catch:{ all -> 0x007a }
        r3.onNext(r4);	 Catch:{ all -> 0x007a }
        goto L_0x0078;	 Catch:{ all -> 0x007a }
    L_0x0062:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x007a }
        r3.<init>();	 Catch:{ all -> 0x007a }
        r5 = "unexpectedly could not update visitor counts ";	 Catch:{ all -> 0x007a }
        r3.append(r5);	 Catch:{ all -> 0x007a }
        r3.append(r2);	 Catch:{ all -> 0x007a }
        r2 = r3.toString();	 Catch:{ all -> 0x007a }
        r3 = new java.lang.Object[r4];	 Catch:{ all -> 0x007a }
        p000a.p001a.C0001a.e(r2, r3);	 Catch:{ all -> 0x007a }
    L_0x0078:
        monitor-exit(r21);
        return;
    L_0x007a:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r21);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.places.h.a(java.lang.String, boolean, int):void");
    }

    public C8747h() {
        PublishSubject w = PublishSubject.w();
        C2668g.a(w, "PublishSubject.create()");
        this.f30734b = w;
    }

    @NotNull
    /* renamed from: a */
    public final synchronized List<Place> m37261a() {
        return C19301m.l(this.f30733a);
    }

    @NotNull
    /* renamed from: a */
    public final synchronized Place m37260a(int i) {
        return (Place) this.f30733a.get(i);
    }

    @NotNull
    /* renamed from: a */
    public final synchronized Found m37259a(@NotNull String str) {
        int d;
        C2668g.b(str, "id");
        d = m37258d(str);
        return new Found(d, d != -1 ? m37260a(d) : null);
    }

    /* renamed from: a */
    public final synchronized void m37265a(@NotNull List<Place> list) {
        C2668g.b(list, "places");
        for (Place deleted : this.f30733a) {
            this.f30734b.onNext(new Deleted(deleted));
        }
        this.f30733a.clear();
        this.f30733a.addAll(list);
        int i = 0;
        for (Place deleted2 : this.f30733a) {
            int i2 = i + 1;
            this.f30734b.onNext(new Created(i, deleted2));
            i = i2;
        }
    }

    /* renamed from: b */
    public final synchronized void m37267b(@NotNull String str) {
        C2668g.b(str, "id");
        str = m37258d(str);
        if (str != -1) {
            this.f30734b.onNext(new Deleted((Place) this.f30733a.remove(str)));
        }
    }

    /* renamed from: a */
    public final synchronized void m37263a(@NotNull String str, @NotNull Place place) {
        C2668g.b(str, "oldId");
        C2668g.b(place, "newPlace");
        int d = m37258d(str);
        if (d != -1) {
            this.f30733a.set(d, place);
            this.f30734b.onNext(new Corrected(d, place, str));
        }
    }

    /* renamed from: c */
    public final synchronized void m37268c(@NotNull String str) {
        Object obj;
        C8747h c8747h = this;
        String str2 = str;
        synchronized (this) {
            try {
                C2668g.b(str2, "id");
                int d = m37258d(str);
                int size = c8747h.f30733a.size();
                if (d >= 0) {
                    if (size > d) {
                        obj = c8747h.f30733a.get(d);
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpectedly could not mark place viewed ");
                stringBuilder.append(str2);
                C0001a.e(stringBuilder.toString(), new Object[0]);
            } finally {
                obj = r0;
            }
        }
    }

    @NotNull
    /* renamed from: b */
    public final synchronized Observable<PlaceUpdate> m37266b() {
        Observable<PlaceUpdate> b;
        Observable e = this.f30734b.e();
        Iterable<Place> a = m37261a();
        Collection arrayList = new ArrayList(C19301m.a(a, 10));
        int i = 0;
        for (Place created : a) {
            int i2 = i + 1;
            arrayList.add(new Created(i, created));
            i = i2;
        }
        b = e.b((List) arrayList);
        C2668g.a(b, "subject.asObservable()\n ….Created(index, place) })");
        return b;
    }

    /* renamed from: d */
    private final int m37258d(String str) {
        int i = 0;
        for (Place id : this.f30733a) {
            if (C2668g.a(String.valueOf(id.getId()), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
