package com.google.android.m4b.maps.bx;

import android.content.res.Resources;
import android.util.Log;
import com.google.android.m4b.maps.aa.bo;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bj.C4787f;
import com.google.android.m4b.maps.bj.C4788h;
import com.google.android.m4b.maps.bj.C6463g;
import com.google.android.m4b.maps.bj.C7451d;
import com.google.android.m4b.maps.bj.C7452e;
import com.google.android.m4b.maps.bm.C6487i;
import com.google.android.m4b.maps.bo.C4847g;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bd;
import com.google.android.m4b.maps.bo.bf;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bp;
import com.google.android.m4b.maps.bq.C4870j;
import com.google.android.m4b.maps.bq.C4872l;
import com.google.android.m4b.maps.bq.C6536f;
import com.google.android.m4b.maps.bt.C4906a;
import com.google.android.m4b.maps.bt.C4909c;
import com.google.android.m4b.maps.bt.C4909c.C4908d;
import com.google.android.m4b.maps.bt.C6547d;
import com.google.android.m4b.maps.bw.C4967a;
import com.google.android.m4b.maps.bw.C4976e;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bx.ag.C4984a;
import com.google.android.m4b.maps.by.C5043a.C5042d;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.bz.C6571c;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cc.C6587q;
import com.google.android.m4b.maps.cc.C7504t;
import com.google.android.m4b.maps.ce.C5094b;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.p125y.C5569h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class al extends C6561r {
    /* renamed from: M */
    private static final C4788h f27508M = new C6463g();
    /* renamed from: d */
    private static final C4967a f27509d = C4967a.m22228a(4);
    /* renamed from: e */
    private static final C4967a f27510e = C4967a.m22227a(C7504t.f27786a, f27509d);
    /* renamed from: A */
    private volatile boolean f27511A;
    /* renamed from: B */
    private final Set<C4993a> f27512B = Collections.synchronizedSet(new HashSet());
    /* renamed from: C */
    private final C4976e<ba, ba> f27513C = new C4976e(80);
    /* renamed from: D */
    private final af f27514D = new af();
    /* renamed from: E */
    private C6571c f27515E;
    /* renamed from: F */
    private long f27516F = 0;
    /* renamed from: G */
    private long f27517G = -1;
    /* renamed from: H */
    private long f27518H = -1;
    /* renamed from: I */
    private boolean f27519I;
    /* renamed from: J */
    private final boolean f27520J;
    /* renamed from: K */
    private final boolean f27521K;
    /* renamed from: L */
    private final C4788h f27522L;
    /* renamed from: N */
    private final Set<C6587q> f27523N;
    /* renamed from: O */
    private final bf f27524O;
    /* renamed from: P */
    private WeakReference<C5052d> f27525P;
    /* renamed from: Q */
    private final C4981g f27526Q;
    /* renamed from: a */
    protected volatile aj f27527a;
    /* renamed from: b */
    protected volatile boolean f27528b;
    /* renamed from: c */
    protected final C5094b f27529c;
    /* renamed from: f */
    private final int f27530f;
    /* renamed from: g */
    private final int f27531g;
    /* renamed from: h */
    private final C5016a f27532h;
    /* renamed from: i */
    private boolean f27533i;
    /* renamed from: j */
    private final int f27534j;
    /* renamed from: k */
    private final int f27535k;
    /* renamed from: l */
    private final boolean f27536l;
    /* renamed from: m */
    private final boolean f27537m;
    /* renamed from: n */
    private final boolean f27538n;
    /* renamed from: o */
    private final boolean f27539o;
    /* renamed from: p */
    private final bg f27540p;
    /* renamed from: q */
    private final C4909c f27541q;
    /* renamed from: r */
    private final ArrayList<C6587q> f27542r;
    /* renamed from: s */
    private final ArrayList<C6587q> f27543s;
    /* renamed from: t */
    private final int[] f27544t;
    /* renamed from: u */
    private final ArrayList<HashSet<ba>> f27545u;
    /* renamed from: v */
    private final int[] f27546v;
    /* renamed from: w */
    private final C4994b f27547w = new C4994b();
    /* renamed from: x */
    private C4787f f27548x;
    /* renamed from: y */
    private C7452e f27549y;
    /* renamed from: z */
    private boolean f27550z;

    /* renamed from: com.google.android.m4b.maps.bx.al$a */
    public interface C4993a {
        /* renamed from: a */
        boolean mo5208a();
    }

    /* renamed from: com.google.android.m4b.maps.bx.al$b */
    public static class C4994b implements Comparator<ba> {
        /* renamed from: a */
        private int f18439a;
        /* renamed from: b */
        private int f18440b;

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            ba baVar = (ba) obj;
            ba baVar2 = (ba) obj2;
            int b = baVar.m21619b();
            int b2 = baVar2.m21619b();
            if (b != b2) {
                return b2 - b;
            }
            b = 536870912 >> b;
            return (Math.abs((baVar.m21622e() + b) - this.f18439a) + Math.abs((baVar.m21623f() + b) - this.f18440b)) - (Math.abs((baVar2.m21622e() + b) - this.f18439a) + Math.abs((baVar2.m21623f() + b) - this.f18440b));
        }

        /* renamed from: a */
        public final void m22323a(af afVar) {
            this.f18439a = afVar.m21490f();
            this.f18440b = afVar.m21492g();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.al$1 */
    class C65591 implements C4908d {
        /* renamed from: a */
        private /* synthetic */ al f24469a;

        C65591(al alVar) {
            this.f24469a = alVar;
        }

        /* renamed from: a */
        public final void mo5215a(ba baVar, C6587q c6587q, boolean z) {
            synchronized (this.f24469a.f27541q) {
                if (!(this.f24469a.f27513C.m22254c(baVar) == null || c6587q == null)) {
                    c6587q.mo7140d();
                }
            }
            baVar = this.f24469a.f27527a;
            if (baVar == null) {
                return;
            }
            if (c6587q != null || !z) {
                baVar.mo5221a(true, false);
            }
        }
    }

    /* renamed from: a */
    public static int m32425a(Resources resources, int i) {
        int i2 = resources.getDisplayMetrics().widthPixels * resources.getDisplayMetrics().heightPixels;
        if (i2 < 409920) {
            i2 = 409920;
        }
        i = (float) (i / 256);
        return (int) (((float) ((i2 * 24) / 409920)) / (i * i));
    }

    /* renamed from: b */
    public static int m32433b(Resources resources, int i) {
        return (((int) Math.floor((double) (((float) resources.getDisplayMetrics().widthPixels) / 1124073472))) + 2) * (((int) Math.floor((double) (((float) resources.getDisplayMetrics().heightPixels) / 1124073472))) + 2);
    }

    /* renamed from: a */
    public static al m32430a(bg bgVar, Resources resources, C5203e c5203e, C4981g c4981g) {
        return m32431a(bgVar, null, resources, c5203e, c4981g);
    }

    /* renamed from: a */
    public static al m32431a(bg bgVar, bg bgVar2, Resources resources, C5203e c5203e, C4981g c4981g) {
        Object obj;
        int a;
        int i;
        boolean z;
        boolean z2;
        C4967a c4967a;
        C4906a c4906a;
        C4870j b;
        C6536f c6536f;
        C4909c c4909c;
        String valueOf;
        StringBuilder stringBuilder;
        bg bgVar3 = bgVar;
        if (!(bgVar3 == bg.f17745a || bgVar3 == bg.f17746b)) {
            if (bgVar3 != bg.f17747c) {
                obj = null;
                a = m32425a(resources, 256);
                i = a * 2;
                if (obj == null) {
                    if (bgVar3 == bg.f17754j) {
                        z = false;
                        if (!(z || bgVar3 == bg.f17759o)) {
                            if (bgVar3 == bg.f17760p) {
                                z2 = false;
                                c4967a = obj == null ? f27510e : C4967a.f18341a;
                                c4906a = new C4906a(8, i, z, false);
                                if (bgVar2 != null) {
                                    if (!C4872l.m21829a(bgVar2)) {
                                        b = C4872l.m21830b(bgVar2);
                                        if (!(b instanceof C6536f)) {
                                            c6536f = (C6536f) b;
                                            if (c6536f != null) {
                                                c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                                            } else {
                                                c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                                            }
                                            return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
                                        } else if (C4728u.m21050a("TileOverlay", 6)) {
                                            valueOf = String.valueOf(bgVar2);
                                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
                                            stringBuilder.append("Tile store not a Prefetcher for ");
                                            stringBuilder.append(valueOf);
                                            Log.e("TileOverlay", stringBuilder.toString());
                                        }
                                    } else if (C4728u.m21050a("TileOverlay", 6)) {
                                        valueOf = String.valueOf(bgVar2);
                                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
                                        stringBuilder.append("Cannot pre-fetch unregistered tile type: ");
                                        stringBuilder.append(valueOf);
                                        Log.e("TileOverlay", stringBuilder.toString());
                                    }
                                }
                                c6536f = null;
                                if (c6536f != null) {
                                    c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                                } else {
                                    c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                                }
                                return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
                            }
                        }
                        z2 = true;
                        if (obj == null) {
                        }
                        c4967a = obj == null ? f27510e : C4967a.f18341a;
                        c4906a = new C4906a(8, i, z, false);
                        if (bgVar2 != null) {
                            if (!C4872l.m21829a(bgVar2)) {
                                b = C4872l.m21830b(bgVar2);
                                if (!(b instanceof C6536f)) {
                                    c6536f = (C6536f) b;
                                    if (c6536f != null) {
                                        c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                                    } else {
                                        c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                                    }
                                    return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
                                } else if (C4728u.m21050a("TileOverlay", 6)) {
                                    valueOf = String.valueOf(bgVar2);
                                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
                                    stringBuilder.append("Tile store not a Prefetcher for ");
                                    stringBuilder.append(valueOf);
                                    Log.e("TileOverlay", stringBuilder.toString());
                                }
                            } else if (C4728u.m21050a("TileOverlay", 6)) {
                                valueOf = String.valueOf(bgVar2);
                                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
                                stringBuilder.append("Cannot pre-fetch unregistered tile type: ");
                                stringBuilder.append(valueOf);
                                Log.e("TileOverlay", stringBuilder.toString());
                            }
                        }
                        c6536f = null;
                        if (c6536f != null) {
                            c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                        } else {
                            c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                        }
                        return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
                    }
                }
                z = true;
                if (bgVar3 == bg.f17760p) {
                    z2 = false;
                    if (obj == null) {
                    }
                    c4967a = obj == null ? f27510e : C4967a.f18341a;
                    c4906a = new C4906a(8, i, z, false);
                    if (bgVar2 != null) {
                        if (!C4872l.m21829a(bgVar2)) {
                            b = C4872l.m21830b(bgVar2);
                            if (!(b instanceof C6536f)) {
                                c6536f = (C6536f) b;
                                if (c6536f != null) {
                                    c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                                } else {
                                    c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                                }
                                return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
                            } else if (C4728u.m21050a("TileOverlay", 6)) {
                                valueOf = String.valueOf(bgVar2);
                                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
                                stringBuilder.append("Tile store not a Prefetcher for ");
                                stringBuilder.append(valueOf);
                                Log.e("TileOverlay", stringBuilder.toString());
                            }
                        } else if (C4728u.m21050a("TileOverlay", 6)) {
                            valueOf = String.valueOf(bgVar2);
                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
                            stringBuilder.append("Cannot pre-fetch unregistered tile type: ");
                            stringBuilder.append(valueOf);
                            Log.e("TileOverlay", stringBuilder.toString());
                        }
                    }
                    c6536f = null;
                    if (c6536f != null) {
                        c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                    } else {
                        c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                    }
                    return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
                }
                z2 = true;
                if (obj == null) {
                }
                c4967a = obj == null ? f27510e : C4967a.f18341a;
                c4906a = new C4906a(8, i, z, false);
                if (bgVar2 != null) {
                    if (!C4872l.m21829a(bgVar2)) {
                        b = C4872l.m21830b(bgVar2);
                        if (!(b instanceof C6536f)) {
                            c6536f = (C6536f) b;
                            if (c6536f != null) {
                                c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                            } else {
                                c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                            }
                            return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
                        } else if (C4728u.m21050a("TileOverlay", 6)) {
                            valueOf = String.valueOf(bgVar2);
                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
                            stringBuilder.append("Tile store not a Prefetcher for ");
                            stringBuilder.append(valueOf);
                            Log.e("TileOverlay", stringBuilder.toString());
                        }
                    } else if (C4728u.m21050a("TileOverlay", 6)) {
                        valueOf = String.valueOf(bgVar2);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
                        stringBuilder.append("Cannot pre-fetch unregistered tile type: ");
                        stringBuilder.append(valueOf);
                        Log.e("TileOverlay", stringBuilder.toString());
                    }
                }
                c6536f = null;
                if (c6536f != null) {
                    c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                } else {
                    c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                }
                return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
            }
        }
        obj = 1;
        a = m32425a(resources, 256);
        i = a * 2;
        if (obj == null) {
            if (bgVar3 == bg.f17754j) {
                z = false;
                if (bgVar3 == bg.f17760p) {
                    z2 = true;
                    if (obj == null) {
                    }
                    c4967a = obj == null ? f27510e : C4967a.f18341a;
                    c4906a = new C4906a(8, i, z, false);
                    if (bgVar2 != null) {
                        if (!C4872l.m21829a(bgVar2)) {
                            b = C4872l.m21830b(bgVar2);
                            if (!(b instanceof C6536f)) {
                                c6536f = (C6536f) b;
                                if (c6536f != null) {
                                    c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                                } else {
                                    c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                                }
                                return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
                            } else if (C4728u.m21050a("TileOverlay", 6)) {
                                valueOf = String.valueOf(bgVar2);
                                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
                                stringBuilder.append("Tile store not a Prefetcher for ");
                                stringBuilder.append(valueOf);
                                Log.e("TileOverlay", stringBuilder.toString());
                            }
                        } else if (C4728u.m21050a("TileOverlay", 6)) {
                            valueOf = String.valueOf(bgVar2);
                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
                            stringBuilder.append("Cannot pre-fetch unregistered tile type: ");
                            stringBuilder.append(valueOf);
                            Log.e("TileOverlay", stringBuilder.toString());
                        }
                    }
                    c6536f = null;
                    if (c6536f != null) {
                        c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                    } else {
                        c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                    }
                    return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
                }
                z2 = false;
                if (obj == null) {
                }
                c4967a = obj == null ? f27510e : C4967a.f18341a;
                c4906a = new C4906a(8, i, z, false);
                if (bgVar2 != null) {
                    if (!C4872l.m21829a(bgVar2)) {
                        b = C4872l.m21830b(bgVar2);
                        if (!(b instanceof C6536f)) {
                            c6536f = (C6536f) b;
                            if (c6536f != null) {
                                c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                            } else {
                                c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                            }
                            return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
                        } else if (C4728u.m21050a("TileOverlay", 6)) {
                            valueOf = String.valueOf(bgVar2);
                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
                            stringBuilder.append("Tile store not a Prefetcher for ");
                            stringBuilder.append(valueOf);
                            Log.e("TileOverlay", stringBuilder.toString());
                        }
                    } else if (C4728u.m21050a("TileOverlay", 6)) {
                        valueOf = String.valueOf(bgVar2);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
                        stringBuilder.append("Cannot pre-fetch unregistered tile type: ");
                        stringBuilder.append(valueOf);
                        Log.e("TileOverlay", stringBuilder.toString());
                    }
                }
                c6536f = null;
                if (c6536f != null) {
                    c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                } else {
                    c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                }
                return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
            }
        }
        z = true;
        if (bgVar3 == bg.f17760p) {
            z2 = false;
            if (obj == null) {
            }
            c4967a = obj == null ? f27510e : C4967a.f18341a;
            c4906a = new C4906a(8, i, z, false);
            if (bgVar2 != null) {
                if (!C4872l.m21829a(bgVar2)) {
                    b = C4872l.m21830b(bgVar2);
                    if (!(b instanceof C6536f)) {
                        c6536f = (C6536f) b;
                        if (c6536f != null) {
                            c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                        } else {
                            c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                        }
                        return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
                    } else if (C4728u.m21050a("TileOverlay", 6)) {
                        valueOf = String.valueOf(bgVar2);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
                        stringBuilder.append("Tile store not a Prefetcher for ");
                        stringBuilder.append(valueOf);
                        Log.e("TileOverlay", stringBuilder.toString());
                    }
                } else if (C4728u.m21050a("TileOverlay", 6)) {
                    valueOf = String.valueOf(bgVar2);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
                    stringBuilder.append("Cannot pre-fetch unregistered tile type: ");
                    stringBuilder.append(valueOf);
                    Log.e("TileOverlay", stringBuilder.toString());
                }
            }
            c6536f = null;
            if (c6536f != null) {
                c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
            } else {
                c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
            }
            return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
        }
        z2 = true;
        if (obj == null) {
        }
        c4967a = obj == null ? f27510e : C4967a.f18341a;
        c4906a = new C4906a(8, i, z, false);
        if (bgVar2 != null) {
            if (!C4872l.m21829a(bgVar2)) {
                b = C4872l.m21830b(bgVar2);
                if (!(b instanceof C6536f)) {
                    c6536f = (C6536f) b;
                    if (c6536f != null) {
                        c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                    } else {
                        c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
                    }
                    return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
                } else if (C4728u.m21050a("TileOverlay", 6)) {
                    valueOf = String.valueOf(bgVar2);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    stringBuilder.append("Tile store not a Prefetcher for ");
                    stringBuilder.append(valueOf);
                    Log.e("TileOverlay", stringBuilder.toString());
                }
            } else if (C4728u.m21050a("TileOverlay", 6)) {
                valueOf = String.valueOf(bgVar2);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
                stringBuilder.append("Cannot pre-fetch unregistered tile type: ");
                stringBuilder.append(valueOf);
                Log.e("TileOverlay", stringBuilder.toString());
            }
        }
        c6536f = null;
        if (c6536f != null) {
            c4909c = new C6547d(bgVar3, c6536f, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
        } else {
            c4909c = new C4909c(bgVar3, new C5042d(bgVar3, null, c4967a), c4906a, c4967a, c5203e, c4981g);
        }
        return new al(bgVar3, c4909c, new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, z, z, true, z2, c4981g);
    }

    /* renamed from: b */
    public static al m32435b(bg bgVar, Resources resources, C5203e c5203e, C4981g c4981g) {
        int a = m32425a(resources, 256);
        int i = a * 2;
        C4967a c4967a = C4967a.f18341a;
        bg bgVar2 = bgVar;
        bg bgVar3 = bgVar2;
        return new al(bgVar2, new C4909c(bgVar3, new C5042d(bgVar2, null, c4967a), new C4906a(8, i, false, false), c4967a, c5203e, c4981g), new C7451d(), a, i, 8, C5016a.VECTORS, 256, 256, false, false, false, false, false, false, c4981g);
    }

    /* renamed from: a */
    public static al m32429a(C4788h c4788h, bg bgVar, Resources resources, C5203e c5203e, C4981g c4981g) {
        int a = m32425a(resources, 256);
        int i = a * 2;
        bg bgVar2 = bgVar;
        bg bgVar3 = bgVar2;
        return new C8074f(bgVar2, new C4909c(bgVar3, new C5042d(bgVar2, null, f27509d), new C4906a(0, i, false, false), f27509d, c5203e, c4981g), c4788h, a, i, 0, C5016a.BUILDINGS, 256, 256, false, false, false, false, false, false, c4981g);
    }

    /* renamed from: c */
    public static al m32436c(bg bgVar, Resources resources, C5203e c5203e, C4981g c4981g) {
        int b = m32433b(resources, 256);
        int i = b * 2;
        bg bgVar2 = bgVar;
        return new al(bgVar2, new C4909c(bgVar2, new C4906a(4, i, false, true), c5203e, c4981g), f27508M, b, i, 4, C5016a.BASE_IMAGERY, 256, 384, true, true, false, false, false, false, c4981g);
    }

    /* renamed from: d */
    public static C8075m m32437d(bg bgVar, Resources resources, C5203e c5203e, C4981g c4981g) {
        int b = m32433b(resources, 256);
        int i = b * 2;
        bg bgVar2 = bgVar;
        return new C8075m(bgVar2, new C4909c(bgVar2, new C4906a(4, i, false, true), c5203e, c4981g), f27508M, b, i, 4, C5016a.LAYER_SHAPES, 256, 384, false, true, false, false, false, false, resources, c4981g);
    }

    /* renamed from: a */
    public static am m32432a(Resources resources, bg bgVar, C5203e c5203e, C4981g c4981g) {
        int a = m32425a(resources, 256);
        int i = a * 2;
        C4981g c4981g2 = c4981g;
        return new am(new C4909c(bgVar, new C4906a(0, i, false, true), c5203e, c4981g2), f27508M, a, i, 0, C5016a.TRAFFIC, 256, true, false, false, false, false, c4981g2);
    }

    /* renamed from: a */
    public static al m32428a(Resources resources, C6487i c6487i, C5203e c5203e, C4981g c4981g) {
        int a = m32425a(resources, 256) * 2;
        int i = a * 2;
        Resources aaVar = new aa(new C4909c(bg.f17758n, new C4906a(4, i, false, true), c5203e, c4981g), f27508M, a, i, 4, C5016a.INDOOR, 256, c6487i, c4981g);
        aaVar.m34273b();
        return aaVar;
    }

    /* renamed from: a */
    protected void mo7554a(C4787f c4787f) {
        this.f27548x = c4787f;
        this.f27517G = -1;
    }

    /* renamed from: a */
    public final void mo7039a(long j) {
        this.f27541q.m21999a(j);
    }

    /* renamed from: a */
    public final void mo7041a(C5052d c5052d, aj ajVar) {
        this.f27525P = new WeakReference(c5052d);
        this.f27541q.m22004a(c5052d);
        this.f27527a = ajVar;
        if (this.f27548x == null) {
            mo7554a(this.f27522L.mo5022a(this.f27540p, this.f27535k, this.f27539o, this.f27524O, this.f27526Q));
            this.f27549y = this.f27522L.mo5021a(this.f27540p, this.f27539o, this.f27524O, this.f27526Q);
            if (this.f27549y == null) {
                if ((this.f27548x instanceof C7452e) != null) {
                    this.f27549y = (C7452e) this.f27548x;
                    return;
                }
                throw new IllegalStateException("Bad out-of-bounds coord generator");
            }
        }
    }

    /* renamed from: a */
    public void mo7040a(C5052d c5052d) {
        this.f27525P = null;
        this.f27527a = null;
        this.f27541q.m22015h();
        this.f27511A = true;
    }

    /* renamed from: a */
    public final void mo7042a(boolean z) {
        this.f27541q.m22006a(z);
        this.f27511A = true;
    }

    public final void c_() {
        this.f27541q.m22013f();
        this.f27511A = true;
    }

    /* renamed from: b */
    public final void m32455b(boolean z) {
        this.f27533i = z;
    }

    /* renamed from: a */
    public final void m32443a(bg bgVar) {
        this.f27541q.m22002a(bgVar);
        this.f27511A = true;
    }

    public final boolean d_() {
        return this.f27520J;
    }

    /* renamed from: i */
    public final boolean m32457i() {
        return this.f27521K;
    }

    /* renamed from: a */
    public final void m32446a(C6571c c6571c) {
        this.f27515E = c6571c;
    }

    al(bg bgVar, C4909c c4909c, C4788h c4788h, int i, int i2, int i3, C5016a c5016a, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C4981g c4981g) {
        int i6 = i;
        int i7 = i3;
        int i8 = 0;
        this.f27528b = false;
        this.f27523N = bo.m20654a();
        bg bgVar2 = bgVar;
        this.f27540p = bgVar2;
        this.f27541q = c4909c;
        this.f27522L = c4788h;
        this.f27530f = i6;
        this.f27531g = i2;
        this.f27532h = c5016a;
        this.f27534j = i4;
        this.f27535k = i5;
        this.f27539o = z;
        this.f27536l = z2;
        this.f27537m = z3;
        this.f27538n = z4;
        this.f27520J = z5;
        this.f27521K = z6;
        this.f27524O = new bf();
        this.f27541q.m22001a(this.f27524O);
        if (!this.f27520J || bgVar2.mo7072f()) {
            r0.f27529c = null;
        } else {
            r0.f27529c = new C5094b(toString());
        }
        r0.f27543s = new ArrayList();
        r0.f27542r = new ArrayList();
        r0.f27544t = new int[i6];
        r0.f27545u = new ArrayList(i7);
        while (i8 < i7) {
            r0.f27545u.add(new HashSet());
            i8++;
        }
        r0.f27546v = new int[(i7 + 1)];
        r0.f27541q.m22003a(new C65591(r0));
        r0.f27526Q = c4981g;
    }

    /* renamed from: a */
    public final void m32444a(C4993a c4993a) {
        this.f27512B.add(c4993a);
    }

    /* renamed from: a */
    public final float m32438a(af afVar) {
        if (this.f27548x == null) {
            return 21.0f;
        }
        return this.f27548x.mo5016a(afVar);
    }

    /* renamed from: a */
    public final boolean m32452a(bd bdVar) {
        return this.f27524O.m21649a(bdVar);
    }

    /* renamed from: j */
    public final bg m32458j() {
        return this.f27540p;
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return this.f27532h;
    }

    /* renamed from: k */
    protected C4984a mo7100k() {
        return C4984a.BASE;
    }

    /* renamed from: a */
    public final void mo7038a(int i) {
        this.f27550z = (i & 2) != 0 ? 1 : 0;
    }

    /* renamed from: b */
    protected Set<ba> mo7559b(C6570b c6570b) {
        return com.google.android.m4b.maps.aa.al.m27704f();
    }

    /* renamed from: a */
    public boolean mo7044a(com.google.android.m4b.maps.bz.C6570b r25, com.google.android.m4b.maps.ca.C5052d r26) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
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
        r24 = this;
        r1 = r24;
        r2 = r25;
        r3 = 0;
        r1.f27528b = r3;
        r4 = 1;
        r1.f27519I = r4;
        r5 = r1.f27514D;
        r2.m29237a(r5);
        r5 = r1.f27548x;
        r5 = r5.mo5020a(r2);
        r6 = r5.size();
        if (r6 <= r4) goto L_0x0029;
    L_0x001b:
        r6 = r1.f27547w;
        r7 = r25.m29245c();
        r6.m22323a(r7);
        r6 = r1.f27547w;
        java.util.Collections.sort(r5, r6);
    L_0x0029:
        r6 = r1.f27534j;
        r6 = (float) r6;
        r7 = r25.m29251g();
        r6 = r6 * r7;
        r13 = (int) r6;
        r6 = r1.f27523N;
        r7 = r1.f27543s;
        r6.addAll(r7);
        r6 = r1.f27543s;
        r6.clear();
        r6 = r1.f27542r;
        r6.clear();
        r6 = r1.f27546v;
        java.util.Arrays.fill(r6, r3);
        r6 = r1.f27545u;
        r14 = r6.size();
        r15 = new java.util.HashSet;
        r15.<init>();
        r6 = r1.f27541q;
        r6 = r6.m22014g();
        r7 = r1.f27550z;
        r12 = 0;
        if (r7 == 0) goto L_0x00a3;
    L_0x005f:
        r6 = r1.f27515E;
        r1.f27515E = r12;
        if (r6 == 0) goto L_0x009d;
    L_0x0065:
        r7 = new com.google.android.m4b.maps.bz.b;
        r8 = r25.m29249e();
        r9 = r25.m29249e();
        r10 = r25.m29251g();
        r7.<init>(r6, r8, r9, r10);
        r6 = r1.f27541q;
        r8 = r1.f27548x;
        r9 = new com.google.android.m4b.maps.bo.af;
        r10 = r7.m29242b();
        r9.<init>(r10);
        r10 = r1.f27548x;
        r19 = r10.mo5020a(r7);
        r20 = 0;
        r21 = 0;
        r7 = r1.f27550z;
        r16 = r6;
        r17 = r8;
        r18 = r9;
        r22 = r7;
        r16.m22000a(r17, r18, r19, r20, r21, r22);
    L_0x009a:
        r17 = r12;
        goto L_0x00ff;
    L_0x009d:
        r6 = r1.f27541q;
        r6.m22012e();
        goto L_0x009a;
    L_0x00a3:
        r7 = r1.f27516F;
        r9 = r25.mo5248a();
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r11 != 0) goto L_0x00cb;
    L_0x00ad:
        r7 = r1.f27517G;
        r9 = r1.f27548x;
        r9 = r9.mo5017a();
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r11 != 0) goto L_0x00cb;
    L_0x00b9:
        r7 = r1.f27518H;
        r9 = r1.f27524O;
        r9 = r9.m21652b();
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r11 != 0) goto L_0x00cb;
    L_0x00c5:
        r7 = r1.f27511A;
        if (r7 != 0) goto L_0x00cb;
    L_0x00c9:
        if (r6 == 0) goto L_0x009a;
    L_0x00cb:
        r10 = r24.mo7559b(r25);
        r6 = r1.f27541q;
        r7 = r1.f27548x;
        r8 = new com.google.android.m4b.maps.bo.af;
        r9 = r25.m29242b();
        r8.<init>(r9);
        r11 = 0;
        r9 = r1.f27550z;
        r16 = r9;
        r9 = r5;
        r17 = r12;
        r12 = r16;
        r6.m22000a(r7, r8, r9, r10, r11, r12);
        r6 = r25.mo5248a();
        r1.f27516F = r6;
        r6 = r1.f27548x;
        r6 = r6.mo5017a();
        r1.f27517G = r6;
        r6 = r1.f27524O;
        r6 = r6.m21652b();
        r1.f27518H = r6;
    L_0x00ff:
        r6 = r1.f27541q;
        r6 = r6.m22007b();
        r7 = com.google.android.m4b.maps.by.C5043a.m22547a();
        monitor-enter(r7);
        r8 = r1.f27541q;	 Catch:{ all -> 0x02b7 }
        r8.m22010c();	 Catch:{ all -> 0x02b7 }
        r9 = r5;	 Catch:{ all -> 0x02b7 }
        r8 = 0;	 Catch:{ all -> 0x02b7 }
    L_0x0111:
        if (r8 > r14) goto L_0x019a;	 Catch:{ all -> 0x02b7 }
    L_0x0113:
        if (r8 != r14) goto L_0x0118;	 Catch:{ all -> 0x02b7 }
    L_0x0115:
        r10 = r17;	 Catch:{ all -> 0x02b7 }
        goto L_0x0123;	 Catch:{ all -> 0x02b7 }
    L_0x0118:
        r10 = r1.f27545u;	 Catch:{ all -> 0x02b7 }
        r10 = r10.get(r8);	 Catch:{ all -> 0x02b7 }
        r10 = (java.util.Set) r10;	 Catch:{ all -> 0x02b7 }
        r10.clear();	 Catch:{ all -> 0x02b7 }
    L_0x0123:
        r9 = r9.iterator();	 Catch:{ all -> 0x02b7 }
    L_0x0127:
        r11 = r9.hasNext();	 Catch:{ all -> 0x02b7 }
        if (r11 == 0) goto L_0x0181;	 Catch:{ all -> 0x02b7 }
    L_0x012d:
        r11 = r9.next();	 Catch:{ all -> 0x02b7 }
        r11 = (com.google.android.m4b.maps.bo.ba) r11;	 Catch:{ all -> 0x02b7 }
        r12 = r1.f27541q;	 Catch:{ all -> 0x02b7 }
        r12 = r12.mo5164a(r11);	 Catch:{ all -> 0x02b7 }
        if (r12 == 0) goto L_0x0162;	 Catch:{ all -> 0x02b7 }
    L_0x013b:
        r3 = r1.f27543s;	 Catch:{ all -> 0x02b7 }
        r3.add(r12);	 Catch:{ all -> 0x02b7 }
        r3 = r1.f27525P;	 Catch:{ all -> 0x02b7 }
        r3.get();	 Catch:{ all -> 0x02b7 }
        r3 = r1.f27523N;	 Catch:{ all -> 0x02b7 }
        r3 = r3.remove(r12);	 Catch:{ all -> 0x02b7 }
        if (r3 != 0) goto L_0x0150;	 Catch:{ all -> 0x02b7 }
    L_0x014d:
        r12.mo7132a(r4);	 Catch:{ all -> 0x02b7 }
    L_0x0150:
        r3 = r1.f27546v;	 Catch:{ all -> 0x02b7 }
        r16 = r3[r8];	 Catch:{ all -> 0x02b7 }
        r16 = r16 + 1;	 Catch:{ all -> 0x02b7 }
        r3[r8] = r16;	 Catch:{ all -> 0x02b7 }
        r3 = r1.f27543s;	 Catch:{ all -> 0x02b7 }
        r3 = r3.size();	 Catch:{ all -> 0x02b7 }
        r4 = r1.f27530f;	 Catch:{ all -> 0x02b7 }
        if (r3 == r4) goto L_0x0181;	 Catch:{ all -> 0x02b7 }
    L_0x0162:
        if (r12 == 0) goto L_0x016a;	 Catch:{ all -> 0x02b7 }
    L_0x0164:
        r3 = r12.mo7139c();	 Catch:{ all -> 0x02b7 }
        if (r3 == 0) goto L_0x017e;	 Catch:{ all -> 0x02b7 }
    L_0x016a:
        if (r10 == 0) goto L_0x0179;	 Catch:{ all -> 0x02b7 }
    L_0x016c:
        r3 = r1.f27548x;	 Catch:{ all -> 0x02b7 }
        r4 = r1.f27514D;	 Catch:{ all -> 0x02b7 }
        r3 = r3.mo5018a(r11, r4);	 Catch:{ all -> 0x02b7 }
        if (r3 == 0) goto L_0x0179;	 Catch:{ all -> 0x02b7 }
    L_0x0176:
        r10.add(r3);	 Catch:{ all -> 0x02b7 }
    L_0x0179:
        if (r8 != 0) goto L_0x017e;	 Catch:{ all -> 0x02b7 }
    L_0x017b:
        r15.add(r11);	 Catch:{ all -> 0x02b7 }
    L_0x017e:
        r3 = 0;	 Catch:{ all -> 0x02b7 }
        r4 = 1;	 Catch:{ all -> 0x02b7 }
        goto L_0x0127;	 Catch:{ all -> 0x02b7 }
    L_0x0181:
        r3 = r1.f27543s;	 Catch:{ all -> 0x02b7 }
        r3 = r3.size();	 Catch:{ all -> 0x02b7 }
        r4 = r1.f27530f;	 Catch:{ all -> 0x02b7 }
        if (r3 == r4) goto L_0x019a;	 Catch:{ all -> 0x02b7 }
    L_0x018b:
        if (r10 == 0) goto L_0x019a;	 Catch:{ all -> 0x02b7 }
    L_0x018d:
        r3 = r10.size();	 Catch:{ all -> 0x02b7 }
        if (r3 == 0) goto L_0x019a;	 Catch:{ all -> 0x02b7 }
    L_0x0193:
        r8 = r8 + 1;	 Catch:{ all -> 0x02b7 }
        r9 = r10;	 Catch:{ all -> 0x02b7 }
        r3 = 0;	 Catch:{ all -> 0x02b7 }
        r4 = 1;	 Catch:{ all -> 0x02b7 }
        goto L_0x0111;	 Catch:{ all -> 0x02b7 }
    L_0x019a:
        r3 = r1.f27541q;	 Catch:{ all -> 0x02b7 }
        r3.m22011d();	 Catch:{ all -> 0x02b7 }
        monitor-exit(r7);	 Catch:{ all -> 0x02b7 }
        r3 = "TileOverlay";
        r4 = 3;
        r3 = com.google.android.m4b.maps.ay.C4728u.m21050a(r3, r4);
        if (r3 == 0) goto L_0x01e8;
    L_0x01a9:
        r3 = "TileOverlay";
        r4 = r1.f27540p;
        r4 = java.lang.String.valueOf(r4);
        r7 = r5.size();
        r8 = r1.f27546v;
        r9 = 0;
        r8 = r8[r9];
        r9 = new java.lang.StringBuilder;
        r10 = java.lang.String.valueOf(r4);
        r10 = r10.length();
        r10 = r10 + 66;
        r9.<init>(r10);
        r10 = "TileType: ";
        r9.append(r10);
        r9.append(r4);
        r4 = ", expected: ";
        r9.append(r4);
        r9.append(r7);
        r4 = ", numTilesAtLevel[0]: ";
        r9.append(r4);
        r9.append(r8);
        r4 = r9.toString();
        android.util.Log.d(r3, r4);
    L_0x01e8:
        r3 = r1.f27546v;
        r4 = 0;
        r3 = r3[r4];
        r4 = r5.size();
        if (r3 != r4) goto L_0x01f5;
    L_0x01f3:
        r3 = 1;
        goto L_0x01f6;
    L_0x01f5:
        r3 = 0;
    L_0x01f6:
        r1.f27528b = r3;
        r3 = r1.f27533i;
        if (r3 == 0) goto L_0x0260;
    L_0x01fc:
        r3 = r15.iterator();
    L_0x0200:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x022b;
    L_0x0206:
        r4 = r3.next();
        r4 = (com.google.android.m4b.maps.bo.ba) r4;
        r5 = r25.m29256l();
        r5 = java.lang.Math.round(r5);
        r7 = r4.m21619b();
        r5 = r5 - r7;
        r7 = 0;
        r5 = java.lang.Math.max(r7, r5);
        r7 = r1.f27542r;
        r8 = new com.google.android.m4b.maps.cc.e;
        r5 = r13 << r5;
        r8.<init>(r4, r5);
        r7.add(r8);
        goto L_0x0200;
    L_0x022b:
        r3 = r1.f27549y;
        r3 = r3.m32168b(r2);
        r3 = r3.iterator();
    L_0x0235:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0260;
    L_0x023b:
        r4 = r3.next();
        r4 = (com.google.android.m4b.maps.bo.ba) r4;
        r5 = r25.m29256l();
        r5 = java.lang.Math.round(r5);
        r7 = r4.m21619b();
        r5 = r5 - r7;
        r7 = 0;
        r5 = java.lang.Math.max(r7, r5);
        r7 = r1.f27542r;
        r8 = new com.google.android.m4b.maps.cc.e;
        r5 = r13 << r5;
        r8.<init>(r4, r5);
        r7.add(r8);
        goto L_0x0235;
    L_0x0260:
        r2 = r1.f27550z;
        r1.f27511A = r2;
        r2 = r1.f27541q;
        r2 = r2.m22007b();
        r2 = r2 - r6;
        r3 = r1.f27511A;
        if (r3 != 0) goto L_0x0299;
    L_0x026f:
        if (r2 != 0) goto L_0x0299;
    L_0x0271:
        r2 = r1.f27512B;
        monitor-enter(r2);
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0295 }
        r4 = r1.f27512B;	 Catch:{ all -> 0x0295 }
        r3.<init>(r4);	 Catch:{ all -> 0x0295 }
        monitor-exit(r2);	 Catch:{ all -> 0x0295 }
        r2 = r3.iterator();
    L_0x0280:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0299;
    L_0x0286:
        r3 = r2.next();
        r3 = (com.google.android.m4b.maps.bx.al.C4993a) r3;
        r4 = r1.f27543s;
        r4.isEmpty();
        r3.mo5208a();
        goto L_0x0280;
    L_0x0295:
        r0 = move-exception;
        r3 = r0;
        monitor-exit(r2);	 Catch:{ all -> 0x0295 }
        throw r3;
    L_0x0299:
        r2 = r1.f27523N;
        r2 = r2.iterator();
    L_0x029f:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x02b0;
    L_0x02a5:
        r3 = r2.next();
        r3 = (com.google.android.m4b.maps.cc.C6587q) r3;
        r4 = 0;
        r3.mo7132a(r4);
        goto L_0x029f;
    L_0x02b0:
        r2 = r1.f27523N;
        r2.clear();
        r2 = 1;
        return r2;
    L_0x02b7:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r7);	 Catch:{ all -> 0x02b7 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.al.a(com.google.android.m4b.maps.bz.b, com.google.android.m4b.maps.ca.d):boolean");
    }

    /* renamed from: l */
    public final List<C6587q> m32460l() {
        return this.f27543s;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo5222a(com.google.android.m4b.maps.ca.C5052d r28, com.google.android.m4b.maps.bz.C6570b r29, com.google.android.m4b.maps.bx.C5009j r30) {
        /*
        r27 = this;
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r3 = r30;
        r4 = r30.m22388b();
        if (r4 <= 0) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r4 = r30.m22385a();
        r5 = r30.m22389c();
        r6 = new com.google.android.m4b.maps.bx.j;
        r6.<init>(r3);
        r7 = r5.m22305f();
        r8 = 0;
        r9 = 1;
        if (r7 == 0) goto L_0x00a2;
    L_0x0024:
        r7 = r0.f27511A;
        if (r7 != 0) goto L_0x004b;
    L_0x0028:
        r7 = r0.f27543s;
        r7 = r7.iterator();
    L_0x002e:
        r10 = r7.hasNext();
        if (r10 == 0) goto L_0x0046;
    L_0x0034:
        r10 = r7.next();
        r10 = (com.google.android.m4b.maps.cc.C6587q) r10;
        r11 = com.google.android.m4b.maps.ay.C4712d.m20955a();
        r10 = r10.mo7134a(r11);
        if (r10 == 0) goto L_0x002e;
    L_0x0044:
        r7 = 1;
        goto L_0x0047;
    L_0x0046:
        r7 = 0;
    L_0x0047:
        if (r7 == 0) goto L_0x004b;
    L_0x0049:
        r0.f27511A = r9;
    L_0x004b:
        r7 = r0.f27511A;
        if (r7 == 0) goto L_0x0056;
    L_0x004f:
        r7 = r0.f27550z;
        if (r7 != 0) goto L_0x0056;
    L_0x0053:
        r0.mo7044a(r2, r1);
    L_0x0056:
        r7 = r0.f27542r;
        r7 = r7.size();
        if (r7 <= 0) goto L_0x0097;
    L_0x005e:
        r7 = r0.f27542r;
        r7 = r7.get(r8);
        r7 = (com.google.android.m4b.maps.cc.C6587q) r7;
        r7 = r7.mo7127a(r2, r4);
        r7 = r7 & r9;
        if (r7 == 0) goto L_0x0097;
    L_0x006d:
        r28.m22637z();
        r6.m22386a(r9);
        r7 = r0.f27542r;
        r7 = r7.get(r8);
        r7 = (com.google.android.m4b.maps.cc.C6587q) r7;
        r7.mo7137b(r1, r2, r6);
        r7 = r0.f27542r;
        r7 = r7.iterator();
    L_0x0084:
        r10 = r7.hasNext();
        if (r10 == 0) goto L_0x0094;
    L_0x008a:
        r10 = r7.next();
        r10 = (com.google.android.m4b.maps.cc.C6587q) r10;
        r10.mo5222a(r1, r2, r3);
        goto L_0x0084;
    L_0x0094:
        r28.m22597A();
    L_0x0097:
        r3 = r0.f27519I;
        if (r3 == 0) goto L_0x00a2;
    L_0x009b:
        r3 = r0.f27541q;
        r7 = r0.f27543s;
        r3.m22005a(r7);
    L_0x00a2:
        r3 = r0.f27537m;
        if (r3 == 0) goto L_0x00ca;
    L_0x00a6:
        r3 = com.google.android.m4b.maps.bx.C5008i.NORMAL;
        if (r4 == r3) goto L_0x00ae;
    L_0x00aa:
        r3 = com.google.android.m4b.maps.bx.C5008i.NIGHT;
        if (r4 != r3) goto L_0x00ca;
    L_0x00ae:
        r3 = r0.f27542r;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x00c2;
    L_0x00b6:
        r3 = r0.f27546v;
        r3 = r3[r8];
        r7 = r0.f27543s;
        r7 = r7.size();
        if (r3 >= r7) goto L_0x00ca;
    L_0x00c2:
        r3 = r5.m22302c();
        if (r3 == 0) goto L_0x00ca;
    L_0x00c8:
        r3 = 1;
        goto L_0x00cb;
    L_0x00ca:
        r3 = 0;
    L_0x00cb:
        r7 = r28.m22603G();
        if (r7 <= 0) goto L_0x00e5;
    L_0x00d1:
        r7 = r0.f27540p;
        r7 = r7.mo7072f();
        if (r7 == 0) goto L_0x00e5;
    L_0x00d9:
        r7 = r0.f27521K;
        if (r7 == 0) goto L_0x00e5;
    L_0x00dd:
        r7 = r28.m22604H();
        if (r7 == 0) goto L_0x00e5;
    L_0x00e3:
        r7 = 1;
        goto L_0x00e6;
    L_0x00e5:
        r7 = 0;
    L_0x00e6:
        if (r7 != 0) goto L_0x0104;
    L_0x00e8:
        r10 = r28.m22603G();
        if (r10 <= 0) goto L_0x0104;
    L_0x00ee:
        r10 = r0.f27540p;
        r11 = com.google.android.m4b.maps.bo.bg.f17768x;
        r10 = r10.equals(r11);
        if (r10 != 0) goto L_0x0102;
    L_0x00f8:
        r10 = r0.f27540p;
        r11 = com.google.android.m4b.maps.bo.bg.f17767w;
        r10 = r10.equals(r11);
        if (r10 == 0) goto L_0x0104;
    L_0x0102:
        r10 = 1;
        goto L_0x0105;
    L_0x0104:
        r10 = 0;
    L_0x0105:
        if (r7 != 0) goto L_0x0109;
    L_0x0107:
        if (r10 == 0) goto L_0x010c;
    L_0x0109:
        r28.m22633v();
    L_0x010c:
        r11 = r0.f27543s;
        r11 = r11.size();
        r12 = r0.f27545u;
        r12 = r12.size();
        r13 = r5.m22303d();
        r8 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r15 = 7681; // 0x1e01 float:1.0763E-41 double:3.795E-320;
        if (r10 == 0) goto L_0x0193;
    L_0x0122:
        r14 = r28.m22635x();
        r14.glStencilOp(r15, r15, r15);
        r14 = r28.m22635x();
        r14.glStencilMask(r8);
        r14 = r0.f27543s;
        r14 = r14.size();
        r14 = r14 - r9;
    L_0x0137:
        if (r14 < 0) goto L_0x0185;
    L_0x0139:
        r15 = r0.f27543s;
        r15 = r15.get(r14);
        r15 = (com.google.android.m4b.maps.cc.C6587q) r15;
        r9 = r28.m22635x();
        r19 = r11;
        r11 = r15.mo7136b();
        r11 = r11.m21619b();
        r20 = r12;
        r12 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r9.glStencilFunc(r12, r11, r8);
        r9 = r28.m22635x();
        r9.glPushMatrix();
        r9 = r15.mo7136b();
        r9 = r9.m21626i();
        r11 = r9.m32212c();
        r9 = r9.m32215f();
        r9 = (float) r9;
        com.google.android.m4b.maps.bx.an.m22324a(r1, r2, r11, r9);
        com.google.android.m4b.maps.cc.C6588r.m29448a(r28);
        r9 = r28.m22635x();
        r9.glPopMatrix();
        r14 = r14 + -1;
        r11 = r19;
        r12 = r20;
        r9 = 1;
        r15 = 7681; // 0x1e01 float:1.0763E-41 double:3.795E-320;
        goto L_0x0137;
    L_0x0185:
        r19 = r11;
        r20 = r12;
        r9 = r28.m22635x();
        r11 = 7680; // 0x1e00 float:1.0762E-41 double:3.7944E-320;
        r9.glStencilOp(r11, r11, r11);
        goto L_0x0197;
    L_0x0193:
        r19 = r11;
        r20 = r12;
    L_0x0197:
        r9 = r19;
        r11 = 0;
    L_0x019a:
        if (r20 < 0) goto L_0x039a;
    L_0x019c:
        r12 = r0.f27546v;
        r12 = r12[r20];
        if (r12 <= 0) goto L_0x0382;
    L_0x01a2:
        r12 = r0.f27546v;
        r12 = r12[r20];
        r12 = r9 - r12;
        if (r3 == 0) goto L_0x021e;
    L_0x01aa:
        r14 = r12;
    L_0x01ab:
        if (r14 >= r9) goto L_0x021e;
    L_0x01ad:
        r15 = r0.f27543s;
        r15 = r15.get(r14);
        r15 = (com.google.android.m4b.maps.cc.C6587q) r15;
        r19 = r15.mo7139c();
        if (r19 != 0) goto L_0x020d;
    L_0x01bb:
        r8 = r15.mo7136b();
        r8 = r8.m21619b();
        r21 = r3;
        r3 = 14;
        if (r8 < r3) goto L_0x020f;
    L_0x01c9:
        r3 = r15.mo7136b();
        r8 = r28.m22635x();
        r15 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r19 = r3.m21619b();
        r15 = r15 >> r19;
        r8.glPushMatrix();
        r3 = r3.m21624g();
        r15 = (float) r15;
        com.google.android.m4b.maps.bx.an.m22324a(r1, r2, r3, r15);
        r3 = r1.f18687e;
        r3.mo7123d(r1);
        r3 = com.google.android.m4b.maps.bx.ai.m29003a(r4);
        r22 = r11;
        r15 = 0;
        r11 = r3[r15];
        r16 = 1;
        r15 = r3[r16];
        r16 = 2;
        r23 = r13;
        r13 = r3[r16];
        r16 = 3;
        r3 = r3[r16];
        r8.glColor4x(r11, r15, r13, r3);
        r3 = 5;
        r11 = 4;
        r13 = 0;
        r8.glDrawArrays(r3, r13, r11);
        r8.glPopMatrix();
        goto L_0x0213;
    L_0x020d:
        r21 = r3;
    L_0x020f:
        r22 = r11;
        r23 = r13;
    L_0x0213:
        r14 = r14 + 1;
        r3 = r21;
        r11 = r22;
        r13 = r23;
        r8 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        goto L_0x01ab;
    L_0x021e:
        r21 = r3;
        r22 = r11;
        r23 = r13;
        if (r7 == 0) goto L_0x0282;
    L_0x0226:
        r3 = r28.m22635x();
        r8 = 7681; // 0x1e01 float:1.0763E-41 double:3.795E-320;
        r3.glStencilOp(r8, r8, r8);
        r3 = r28.m22635x();
        r11 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r3.glStencilMask(r11);
        r3 = r12;
    L_0x0239:
        if (r3 >= r9) goto L_0x0276;
    L_0x023b:
        r13 = r0.f27543s;
        r13 = r13.get(r3);
        r13 = (com.google.android.m4b.maps.cc.C6587q) r13;
        r14 = r28.m22635x();
        r3 = r3 + 1;
        r15 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r14.glStencilFunc(r15, r3, r11);
        r11 = r28.m22635x();
        r11.glPushMatrix();
        r11 = r13.mo7136b();
        r11 = r11.m21626i();
        r13 = r11.m32212c();
        r11 = r11.m32215f();
        r11 = (float) r11;
        com.google.android.m4b.maps.bx.an.m22324a(r1, r2, r13, r11);
        com.google.android.m4b.maps.cc.C6588r.m29448a(r28);
        r11 = r28.m22635x();
        r11.glPopMatrix();
        r11 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        goto L_0x0239;
    L_0x0276:
        r15 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r3 = r28.m22635x();
        r11 = 7680; // 0x1e00 float:1.0762E-41 double:3.7944E-320;
        r3.glStencilOp(r11, r11, r11);
        goto L_0x0288;
    L_0x0282:
        r8 = 7681; // 0x1e01 float:1.0763E-41 double:3.795E-320;
        r11 = 7680; // 0x1e00 float:1.0762E-41 double:3.7944E-320;
        r15 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
    L_0x0288:
        r3 = r0.m32426a(r2, r4, r12, r9);
        r13 = 0;
    L_0x028d:
        if (r3 == 0) goto L_0x0373;
    L_0x028f:
        r14 = r3 & 1;
        if (r14 == 0) goto L_0x0359;
    L_0x0293:
        r28.m22637z();
        r6.m22386a(r13);
        r14 = r0.f27543s;
        r14 = r14.get(r12);
        r14 = (com.google.android.m4b.maps.cc.C6587q) r14;
        r14.mo7137b(r1, r2, r6);
        r14 = 1;
        r17 = r14 << r13;
        r8 = r12;
    L_0x02a8:
        if (r8 >= r9) goto L_0x034d;
    L_0x02aa:
        r11 = r0.f27543s;
        r11 = r11.get(r8);
        r11 = (com.google.android.m4b.maps.cc.C6587q) r11;
        r14 = r11.mo7136b();
        r14 = r14.m21627j();
        r15 = r0.f27540p;
        r24 = r4;
        r4 = com.google.android.m4b.maps.bo.bg.f17758n;
        r18 = 0;
        if (r15 != r4) goto L_0x02de;
    L_0x02c4:
        if (r14 == 0) goto L_0x02de;
    L_0x02c6:
        r4 = com.google.android.m4b.maps.bo.bd.C4839a.INDOOR;
        r4 = r14.m21642a(r4);
        r4 = (com.google.android.m4b.maps.bo.C6526r) r4;
        if (r4 != 0) goto L_0x02d3;
    L_0x02d0:
        r4 = r18;
        goto L_0x02d8;
    L_0x02d3:
        r18 = r4.m28766b();
        goto L_0x02d0;
    L_0x02d8:
        r18 = r5.m22296a(r4);
        if (r18 == 0) goto L_0x0338;
    L_0x02de:
        r4 = r18;
        r14 = r0.f27544t;
        r14 = r14[r8];
        r14 = r14 & r17;
        if (r14 == 0) goto L_0x0338;
    L_0x02e8:
        r14 = 514; // 0x202 float:7.2E-43 double:2.54E-321;
        if (r7 == 0) goto L_0x02fc;
    L_0x02ec:
        r15 = r28.m22635x();
        r25 = r9;
        r9 = r8 + 1;
        r26 = r12;
        r12 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r15.glStencilFunc(r14, r9, r12);
        goto L_0x0302;
    L_0x02fc:
        r25 = r9;
        r26 = r12;
        r12 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
    L_0x0302:
        if (r10 == 0) goto L_0x0316;
    L_0x0304:
        r9 = r28.m22635x();
        r15 = r11.mo7136b();
        r15 = r15.m21619b();
        r9.glStencilFunc(r14, r15, r12);
        r11.mo7140d();
    L_0x0316:
        r28.m22637z();
        r9 = r11.mo7136b();
        r9 = r9.m21626i();
        r9 = r9.m32212c();
        if (r4 == 0) goto L_0x032a;
    L_0x0327:
        r4.mo5088a(r1, r2, r6, r9);
    L_0x032a:
        r11.mo5222a(r1, r2, r6);
        if (r4 == 0) goto L_0x0332;
    L_0x032f:
        r4.mo5087a(r1, r6);
    L_0x0332:
        r28.m22597A();
        r22 = 1;
        goto L_0x033e;
    L_0x0338:
        r25 = r9;
        r26 = r12;
        r12 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
    L_0x033e:
        r8 = r8 + 1;
        r4 = r24;
        r9 = r25;
        r12 = r26;
        r11 = 7680; // 0x1e00 float:1.0762E-41 double:3.7944E-320;
        r14 = 1;
        r15 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        goto L_0x02a8;
    L_0x034d:
        r24 = r4;
        r25 = r9;
        r26 = r12;
        r12 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r28.m22597A();
        goto L_0x0361;
    L_0x0359:
        r24 = r4;
        r25 = r9;
        r26 = r12;
        r12 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
    L_0x0361:
        r13 = r13 + 1;
        r3 = r3 >>> 1;
        r4 = r24;
        r9 = r25;
        r12 = r26;
        r8 = 7681; // 0x1e01 float:1.0763E-41 double:3.795E-320;
        r11 = 7680; // 0x1e00 float:1.0762E-41 double:3.7944E-320;
        r15 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        goto L_0x028d;
    L_0x0373:
        r24 = r4;
        r26 = r12;
        r12 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r23 == 0) goto L_0x037d;
    L_0x037b:
        if (r22 != 0) goto L_0x039a;
    L_0x037d:
        r11 = r22;
        r9 = r26;
        goto L_0x038e;
    L_0x0382:
        r21 = r3;
        r24 = r4;
        r25 = r9;
        r22 = r11;
        r23 = r13;
        r12 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
    L_0x038e:
        r20 = r20 + -1;
        r3 = r21;
        r13 = r23;
        r4 = r24;
        r8 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        goto L_0x019a;
    L_0x039a:
        if (r7 != 0) goto L_0x039e;
    L_0x039c:
        if (r10 == 0) goto L_0x03a1;
    L_0x039e:
        r28.m22634w();
    L_0x03a1:
        r1 = r5.m22306g();
        if (r1 == 0) goto L_0x03b5;
    L_0x03a7:
        r1 = r0.f27519I;
        if (r1 == 0) goto L_0x03b5;
    L_0x03ab:
        r1 = r0.f27541q;
        r2 = r0.f27543s;
        r1.m22009b(r2);
        r1 = 0;
        r0.f27519I = r1;
    L_0x03b5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.al.a(com.google.android.m4b.maps.ca.d, com.google.android.m4b.maps.bz.b, com.google.android.m4b.maps.bx.j):void");
    }

    /* renamed from: a */
    private int m32426a(C6570b c6570b, C5008i c5008i, int i, int i2) {
        int i3 = 0;
        if (c5008i == C5008i.NONE) {
            return 0;
        }
        while (i < i2) {
            this.f27544t[i] = ((C6587q) this.f27543s.get(i)).mo7127a(c6570b, c5008i);
            i3 |= this.f27544t[i];
            i++;
        }
        return this.f27540p.mo7071a(i3, c5008i);
    }

    public final boolean e_() {
        return this.f27528b;
    }

    /* renamed from: a */
    public final void m32445a(C6570b c6570b, C5008i c5008i, HashSet<String> hashSet, HashSet<String> hashSet2, int[] iArr) {
        m32426a(c6570b, c5008i, this.f27543s.size(), 0);
        c6570b = this.f27543s.iterator();
        int i = -1;
        while (c6570b.hasNext()) {
            C6587q c6587q = (C6587q) c6570b.next();
            c6587q.mo7128a(-1, (Collection) hashSet);
            c6587q.mo7131a((Collection) hashSet2);
            int e = c6587q.mo7141e();
            if (e > i) {
                i = e;
            }
        }
        if (iArr != null && iArr.length > null) {
            iArr[0] = i;
        }
    }

    /* renamed from: m */
    public final C4788h m32461m() {
        return this.f27522L;
    }

    /* renamed from: a */
    public int mo7552a(bp bpVar, ae aeVar, Set<C4699a> set) {
        Iterator it = this.f27543s.iterator();
        int i = 0;
        while (it.hasNext()) {
            C6587q c6587q = (C6587q) it.next();
            if (c6587q != null && (bpVar == null || bpVar.mo5135b(c6587q.mo7136b().m21626i()))) {
                c6587q.mo7130a(this.f27529c);
                if (c6587q.mo7135a(aeVar)) {
                    i = Math.max(i, c6587q.mo7136b().m21619b());
                }
            }
            if (c6587q instanceof C7504t) {
                ((C7504t) c6587q).m32743a((Set) set);
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo7557a(Set<C5094b> set, Map<C5094b, C4847g> map) {
        set.add(this.f27529c);
    }

    public String toString() {
        return C5569h.m24283a(this).m24281a("tileType", this.f27540p).m24282a("isBase", this.f27521K).m24279a("maxTilesPerView", this.f27530f).m24279a("maxTilesToFetch", this.f27531g).m24281a("drawOrder", this.f27532h).m24282a("fetchMissingAncestorTiles", this.f27536l).m24282a("allowMultiZoom", this.f27539o).m24282a("prefetchAncestors", this.f27538n).m24279a("tileSize", this.f27534j).m24282a("allowMultiZoom", this.f27539o).m24282a("isContributingLabels", this.f27520J).m24279a("maxTileSize", this.f27535k).toString();
    }
}
