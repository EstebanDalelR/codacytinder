package com.tinder.shimmy.mask;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import com.tinder.shimmy.mask.AlphaMaskConfig.Layer;
import com.tinder.shimmy.p411a.C14941a;
import com.tinder.shimmy.p411a.C14945d;
import com.tinder.shimmy.p411a.C14946e;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u001f\u0010\u000f\u001a\u00020\f2\u0014\b\u0004\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0011H\bJ\b\u0010\u0013\u001a\u00020\fH\u0003J\b\u0010\u0014\u001a\u00020\fH\u0007J\b\u0010\u0015\u001a\u00020\fH\u0007J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001f\u0010\u0017\u001a\u00020\f2\u0014\b\u0004\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0011H\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/shimmy/mask/AlphaMaskManager;", "", "()V", "alphaMask", "Lcom/tinder/shimmy/mask/MutableAlphaMask;", "alphaMaskLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "bitmapPool", "Lcom/tinder/shimmy/utils/AlphaMaskBitmapPool;", "updateAlphaMaskSubscription", "Lrx/Subscription;", "createAlphaMask", "", "alphaMaskConfig", "Lcom/tinder/shimmy/mask/AlphaMaskConfig;", "readAlphaMask", "action", "Lkotlin/Function1;", "Lcom/tinder/shimmy/mask/AlphaMask;", "releaseAlphaMask", "start", "stop", "updateAlphaMask", "writeAlphaMask", "shimmy_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.shimmy.mask.b */
public final class C14950b {
    /* renamed from: a */
    private C14952e f46681a = new C14952e(null, null, 3, null);
    /* renamed from: b */
    private final ReentrantReadWriteLock f46682b = new ReentrantReadWriteLock(true);
    /* renamed from: c */
    private Subscription f46683c;
    /* renamed from: d */
    private final C14941a f46684d = C14941a.f46664a.m56442a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.mask.b$a */
    static final class C18858a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C14950b f58477a;

        C18858a(C14950b c14950b) {
            this.f58477a = c14950b;
        }

        public final void call() {
            this.f58477a.m56471c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.mask.b$b */
    static final class C18859b implements Action0 {
        /* renamed from: a */
        public static final C18859b f58478a = new C18859b();

        C18859b() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.mask.b$c */
    static final class C18860c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C14950b f58479a;
        /* renamed from: b */
        final /* synthetic */ AlphaMaskConfig f58480b;

        C18860c(C14950b c14950b, AlphaMaskConfig alphaMaskConfig) {
            this.f58479a = c14950b;
            this.f58480b = alphaMaskConfig;
        }

        public final void call() {
            this.f58479a.m56469b(this.f58480b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.mask.b$d */
    static final class C18861d implements Action0 {
        /* renamed from: a */
        public static final C18861d f58481a = new C18861d();

        C18861d() {
        }

        public final void call() {
        }
    }

    @UiThread
    /* renamed from: a */
    public final void m56473a() {
    }

    @UiThread
    /* renamed from: b */
    public final void m56475b() {
        Subscription subscription = this.f46683c;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        Completable b = Completable.a(new C18858a(this)).b(Schedulers.computation());
        Action0 action0 = C18859b.f58478a;
        Function1 function1 = AlphaMaskManager$stop$3.f59403a;
        if (function1 != null) {
            function1 = new C18862d(function1);
        }
        b.a(action0, (Action1) function1);
    }

    @UiThread
    /* renamed from: a */
    public final void m56474a(@NotNull AlphaMaskConfig alphaMaskConfig) {
        C2668g.b(alphaMaskConfig, "alphaMaskConfig");
        if (C14946e.m56454a(this.f46683c)) {
            Subscription subscription = this.f46683c;
            if (subscription != null) {
                subscription.unsubscribe();
            }
        }
        alphaMaskConfig = Completable.a(new C18860c(this, alphaMaskConfig)).b(Schedulers.computation());
        Action0 action0 = C18861d.f58481a;
        Function1 function1 = AlphaMaskManager$updateAlphaMask$3.f59404a;
        if (function1 != null) {
            function1 = new C18862d(function1);
        }
        this.f46683c = alphaMaskConfig.a(action0, (Action1) function1);
    }

    @WorkerThread
    /* renamed from: b */
    private final void m56469b(AlphaMaskConfig alphaMaskConfig) {
        ReentrantReadWriteLock b = this.f46682b;
        ReadLock readLock = b.readLock();
        int i = 0;
        int readHoldCount = (b.getWriteHoldCount() == 0 ? b.getReadHoldCount() : 0) - 1;
        if (readHoldCount >= 0) {
            int i2 = 0;
            while (true) {
                readLock.unlock();
                if (i2 == readHoldCount) {
                    break;
                }
                i2++;
            }
        }
        WriteLock writeLock = b.writeLock();
        writeLock.lock();
        this.f46681a;
        C14945d a = alphaMaskConfig.m56462a();
        alphaMaskConfig = alphaMaskConfig.m56463b();
        if ((C2668g.a(this.f46681a.m56479b(), a) ^ 1) != 0) {
            this.f46681a.m56478a(a);
            m56471c();
        }
        if (this.f46681a.m56480c() == null) {
            this.f46681a.m56477a(this.f46684d.m56445a(a));
        }
        Bitmap c = this.f46681a.m56480c();
        if (c != null) {
            Canvas canvas = new Canvas(c);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            canvas.drawColor(0, Mode.CLEAR);
            for (Layer layer : (Iterable) alphaMaskConfig) {
                Xfermode porterDuffXfermode;
                switch (C14951c.f46685a[layer.m56458b().ordinal()]) {
                    case 1:
                        porterDuffXfermode = new PorterDuffXfermode(Mode.SRC_OVER);
                        break;
                    case 2:
                        porterDuffXfermode = new PorterDuffXfermode(Mode.DST_OUT);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                paint.setXfermode(porterDuffXfermode);
                Bitmap a2 = layer.f46671a.m56445a(layer.m56457a());
                if (a2 != null) {
                    try {
                        layer.f46674d.invoke(new Canvas(a2));
                        canvas.drawBitmap(a2, 0.0f, 0.0f, paint);
                        layer.f46671a.m56446a(a2);
                    } catch (AlphaMaskConfig alphaMaskConfig2) {
                        try {
                            C0001a.c(alphaMaskConfig2);
                        } catch (Throwable th) {
                            if (readHoldCount >= 0) {
                                while (true) {
                                    readLock.lock();
                                    if (i != readHoldCount) {
                                        i++;
                                    }
                                }
                            }
                            writeLock.unlock();
                        }
                    }
                }
            }
        }
        alphaMaskConfig2 = C15813i.f49016a;
        if (readHoldCount >= 0) {
            while (true) {
                readLock.lock();
                if (i != readHoldCount) {
                    i++;
                }
            }
        }
        writeLock.unlock();
    }

    @WorkerThread
    /* renamed from: c */
    private final void m56471c() {
        ReentrantReadWriteLock b = this.f46682b;
        ReadLock readLock = b.readLock();
        int i = 0;
        int readHoldCount = (b.getWriteHoldCount() == 0 ? b.getReadHoldCount() : 0) - 1;
        if (readHoldCount >= 0) {
            int i2 = 0;
            while (true) {
                readLock.unlock();
                if (i2 == readHoldCount) {
                    break;
                }
                i2++;
            }
        }
        WriteLock writeLock = b.writeLock();
        writeLock.lock();
        try {
            C14952e c = this.f46681a;
            Bitmap c2 = c.m56480c();
            if (c2 != null) {
                this.f46684d.m56446a(c2);
            }
            c.m56477a((Bitmap) null);
        } catch (Throwable th) {
            if (readHoldCount >= 0) {
                while (true) {
                    readLock.lock();
                    if (i == readHoldCount) {
                        break;
                    }
                    i++;
                }
            }
            writeLock.unlock();
        }
        C15813i c15813i = C15813i.f49016a;
        if (readHoldCount >= 0) {
            while (true) {
                readLock.lock();
                if (i == readHoldCount) {
                    break;
                }
                i++;
            }
        }
        writeLock.unlock();
    }
}
