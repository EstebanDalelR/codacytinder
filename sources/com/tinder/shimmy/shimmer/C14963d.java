package com.tinder.shimmy.shimmer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader.TileMode;
import android.graphics.SurfaceTexture;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import android.view.Surface;
import com.tinder.shimmy.mask.C14949a;
import com.tinder.shimmy.mask.C14950b;
import com.tinder.shimmy.p411a.C14945d;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Ref.ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 )2\u00020\u0001:\u0003'()B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0003J@\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0018H\u0003J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0003J\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!H\u0003J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%H\u0007J\b\u0010&\u001a\u00020\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/tinder/shimmy/shimmer/ShimmerEngine;", "", "rollAngleTracker", "Lcom/tinder/shimmy/shimmer/RollAngleTracker;", "alphaMaskManager", "Lcom/tinder/shimmy/mask/AlphaMaskManager;", "(Lcom/tinder/shimmy/shimmer/RollAngleTracker;Lcom/tinder/shimmy/mask/AlphaMaskManager;)V", "canvasManager", "Lcom/tinder/shimmy/shimmer/ShimmerEngine$CanvasManager;", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "frameCallbackProvider", "Lcom/tinder/shimmy/shimmer/FrameCallbackProvider;", "clearShimmer", "", "canvas", "Landroid/graphics/Canvas;", "createShimmerPaint", "Landroid/graphics/Paint;", "shimmerSize", "Lcom/tinder/shimmy/utils/Size;", "colors", "", "positions", "", "drawShimmer", "alphaMaskBitmap", "Landroid/graphics/Bitmap;", "maskSize", "maskOffset", "shimmerColors", "shimmerPositions", "rollAngle", "", "normalizeRollAngle", "start", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "stop", "CanvasHolder", "CanvasManager", "Companion", "shimmy_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.shimmy.shimmer.d */
public final class C14963d {
    /* renamed from: a */
    public static final C14962c f46710a = new C14962c();
    /* renamed from: g */
    private static final float f46711g = 50.0f;
    /* renamed from: h */
    private static final int f46712h = Color.parseColor("#E9AA43");
    /* renamed from: i */
    private static final int f46713i = Color.parseColor("#E09220");
    /* renamed from: j */
    private static final int f46714j = Color.parseColor("#F4D37C");
    /* renamed from: b */
    private final C14954a f46715b = C14954a.f46688a.m56483a();
    /* renamed from: c */
    private final C14961b f46716c = new C14961b(this);
    /* renamed from: d */
    private final C19573b f46717d = new C19573b();
    /* renamed from: e */
    private final C14959b f46718e;
    /* renamed from: f */
    private final C14950b f46719f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nH\u0007J\b\u0010\f\u001a\u00020\bH\u0007R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/shimmy/shimmer/ShimmerEngine$CanvasHolder;", "", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "(Landroid/graphics/SurfaceTexture;)V", "surface", "Landroid/view/Surface;", "obtainCanvas", "", "draw", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "releaseCanvas", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.shimmer.d$a */
    public static final class C14960a {
        /* renamed from: a */
        private SurfaceTexture f46706a;
        /* renamed from: b */
        private Surface f46707b;

        public C14960a(@NotNull SurfaceTexture surfaceTexture) {
            C2668g.b(surfaceTexture, "surfaceTexture");
            this.f46706a = surfaceTexture;
            this.f46707b = new Surface(surfaceTexture);
        }

        @WorkerThread
        /* renamed from: a */
        public final synchronized void m56502a(@NotNull Function1<? super Canvas, C15813i> function1) {
            C2668g.b(function1, "draw");
            Surface surface = this.f46707b;
            if (surface == null) {
                return;
            }
            if (surface.isValid()) {
                Canvas lockCanvas;
                try {
                    lockCanvas = surface.lockCanvas(null);
                    if (lockCanvas != null) {
                        function1.invoke(lockCanvas);
                        try {
                            surface.unlockCanvasAndPost(lockCanvas);
                        } catch (Function1<? super Canvas, C15813i> function12) {
                            C0001a.c((Throwable) function12, "unlockCanvasAndPost failed", new Object[0]);
                        }
                    } else {
                        return;
                    }
                } catch (Function1<? super Canvas, C15813i> function122) {
                    C0001a.c((Throwable) function122, "lockCanvas failed", new Object[0]);
                } catch (Throwable th) {
                    try {
                        surface.unlockCanvasAndPost(lockCanvas);
                    } catch (IllegalArgumentException e) {
                        C0001a.c(e, "unlockCanvasAndPost failed", new Object[0]);
                    }
                }
            } else {
                return;
            }
            return;
        }

        @WorkerThread
        /* renamed from: a */
        public final synchronized void m56501a() {
            Surface surface = this.f46707b;
            if (surface != null) {
                surface.release();
            }
            this.f46707b = (Surface) null;
            SurfaceTexture surfaceTexture = this.f46706a;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.f46706a = (SurfaceTexture) null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u0007H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/shimmy/shimmer/ShimmerEngine$CanvasManager;", "", "(Lcom/tinder/shimmy/shimmer/ShimmerEngine;)V", "canvasHolder", "Lcom/tinder/shimmy/shimmer/ShimmerEngine$CanvasHolder;", "getCanvasHolder", "onStart", "", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "onStop", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.shimmer.d$b */
    private final class C14961b {
        /* renamed from: a */
        final /* synthetic */ C14963d f46708a;
        /* renamed from: b */
        private C14960a f46709b;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.shimmy.shimmer.d$b$a */
        static final class C18863a implements Action0 {
            /* renamed from: a */
            final /* synthetic */ C14960a f58491a;

            C18863a(C14960a c14960a) {
                this.f58491a = c14960a;
            }

            public final void call() {
                this.f58491a.m56501a();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.shimmy.shimmer.d$b$b */
        static final class C18864b implements Action0 {
            /* renamed from: a */
            public static final C18864b f58492a = new C18864b();

            C18864b() {
            }

            public final void call() {
            }
        }

        public C14961b(C14963d c14963d) {
            this.f46708a = c14963d;
        }

        @UiThread
        /* renamed from: a */
        public final synchronized void m56504a(@NotNull SurfaceTexture surfaceTexture) {
            C2668g.b(surfaceTexture, "surfaceTexture");
            this.f46709b = new C14960a(surfaceTexture);
        }

        @UiThread
        /* renamed from: a */
        public final synchronized void m56503a() {
            C14960a c14960a = this.f46709b;
            if (c14960a != null) {
                this.f46709b = (C14960a) null;
                Completable b = Completable.a(new C18863a(c14960a)).b(Schedulers.computation());
                Action0 action0 = C18864b.f58492a;
                Function1 function1 = ShimmerEngine$CanvasManager$onStop$3.f59405a;
                if (function1 != null) {
                    function1 = new C18866e(function1);
                }
                b.a(action0, (Action1) function1);
            }
        }

        @WorkerThread
        @Nullable
        /* renamed from: b */
        public final synchronized C14960a m56505b() {
            return this.f46709b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/shimmy/shimmer/ShimmerEngine$Companion;", "", "()V", "GOLD_COLOR_1", "", "getGOLD_COLOR_1", "()I", "GOLD_COLOR_2", "getGOLD_COLOR_2", "GOLD_COLOR_3", "getGOLD_COLOR_3", "SHIMMER_TILT_ANGLE", "", "getSHIMMER_TILT_ANGLE", "()F", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.shimmer.d$c */
    public static final class C14962c {
        private C14962c() {
        }

        /* renamed from: d */
        private final float m56507d() {
            return C14963d.f46711g;
        }

        /* renamed from: a */
        public final int m56508a() {
            return C14963d.f46712h;
        }

        /* renamed from: b */
        public final int m56509b() {
            return C14963d.f46713i;
        }

        /* renamed from: c */
        public final int m56510c() {
            return C14963d.f46714j;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "call", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.shimmer.d$d */
    static final class C18865d<T> implements Action1<C15813i> {
        /* renamed from: a */
        public static final C18865d f58493a = new C18865d();

        C18865d() {
        }

        /* renamed from: a */
        public final void m67328a(C15813i c15813i) {
        }

        public /* synthetic */ void call(Object obj) {
            m67328a((C15813i) obj);
        }
    }

    public C14963d(@NotNull C14959b c14959b, @NotNull C14950b c14950b) {
        C2668g.b(c14959b, "rollAngleTracker");
        C2668g.b(c14950b, "alphaMaskManager");
        this.f46718e = c14959b;
        this.f46719f = c14950b;
    }

    @UiThread
    /* renamed from: a */
    public final void m56526a(@NotNull SurfaceTexture surfaceTexture) {
        C2668g.b(surfaceTexture, "surfaceTexture");
        this.f46717d.a();
        this.f46718e.m56498b();
        this.f46715b.m56486a();
        this.f46716c.m56504a(surfaceTexture);
        C14963d c14963d = this;
        surfaceTexture = this.f46718e.m56500d().i(this.f46715b.m56488c()).l().a(Schedulers.computation()).k(new C18083f(new ShimmerEngine$start$subscription$1(c14963d))).k(new C18083f(new ShimmerEngine$start$subscription$2(c14963d)));
        Action1 action1 = C18865d.f58493a;
        Function1 function1 = ShimmerEngine$start$subscription$4.f59406a;
        if (function1 != null) {
            function1 = new C18866e(function1);
        }
        this.f46717d.a(surfaceTexture.a(action1, (Action1) function1));
    }

    @UiThread
    /* renamed from: a */
    public final void m56525a() {
        this.f46718e.m56499c();
        this.f46715b.m56487b();
        this.f46716c.m56503a();
        this.f46717d.a();
    }

    @WorkerThread
    /* renamed from: a */
    private final float m56511a(float f) {
        return Math.min(1.0f, Math.max(0.0f, (f + 1.5707964f) / ((float) 3.141592653589793d)));
    }

    @WorkerThread
    /* renamed from: b */
    private final void m56520b(float f) {
        C14950b c14950b = this.f46719f;
        ReadLock readLock = c14950b.f46682b.readLock();
        readLock.lock();
        try {
            C14949a a = c14950b.f46681a.m56476a();
            C14945d a2 = a.m56464a();
            Bitmap b = a.m56465b();
            if (b != null) {
                float max = Math.max(a2.m56452a(), a2.m56453b());
                float max2 = Math.max(a2.m56452a(), a2.m56453b()) * ((float) 50);
                float tan = ((float) Math.tan(((double) (f46710a.m56507d() / ((float) 180))) * 3.141592653589793d)) * max2;
                C14945d c14945d = new C14945d(max2, tan);
                ObjectRef objectRef = new ObjectRef();
                float f2 = (float) 2;
                objectRef.f49022a = new C14945d((max2 - a2.m56452a()) / f2, (tan - a2.m56453b()) / f2);
                tan = (1.0f - (max / max2)) * 0.5f;
                int[] iArr = new int[]{f46710a.m56508a(), f46710a.m56508a(), f46710a.m56509b(), f46710a.m56508a(), f46710a.m56510c(), f46710a.m56508a(), f46710a.m56509b(), f46710a.m56508a(), f46710a.m56508a()};
                float[] fArr = new float[]{0.0f, tan, (0.18f * max) + tan, (0.32f * max) + tan, (0.5f * max) + tan, (0.67f * max) + tan, (0.83f * max) + tan, tan + (max / max2), 1.0f};
                objectRef.f49022a = new C14945d(((C14945d) objectRef.f49022a).m56452a() - ((((1.0f - f) * c14945d.m56452a()) / f2) - (c14945d.m56452a() / ((float) 4))), ((C14945d) objectRef.f49022a).m56453b());
                C14960a b2 = this.f46716c.m56505b();
                if (b2 != null) {
                    b2.m56502a(new ShimmerEngine$drawShimmer$$inlined$readAlphaMask$lambda$1(b, a2, objectRef, c14945d, iArr, fArr, r10, f));
                }
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            readLock.unlock();
        }
        C15813i c15813i = C15813i.f49016a;
        readLock.unlock();
    }

    @WorkerThread
    /* renamed from: a */
    private final void m56516a(Canvas canvas, Bitmap bitmap, C14945d c14945d, C14945d c14945d2, C14945d c14945d3, int[] iArr, float[] fArr) {
        float a = c14945d2.m56452a();
        c14945d2 = c14945d2.m56453b();
        float a2 = c14945d.m56452a() + a;
        float b = c14945d2 + c14945d.m56453b();
        fArr = m56513a(c14945d3, iArr, fArr);
        canvas.save();
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        canvas.translate(-a, -c14945d2);
        canvas.drawRect(a, c14945d2, a2, b, fArr);
        canvas.restore();
    }

    @WorkerThread
    /* renamed from: a */
    private final void m56515a(Canvas canvas) {
        canvas.drawColor(0, Mode.CLEAR);
    }

    @WorkerThread
    /* renamed from: a */
    private final Paint m56513a(C14945d c14945d, int[] iArr, float[] fArr) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_ATOP));
        paint.setShader(new LinearGradient(0.0f, 0.0f, c14945d.m56452a(), c14945d.m56453b(), iArr, fArr, TileMode.CLAMP));
        return paint;
    }
}
