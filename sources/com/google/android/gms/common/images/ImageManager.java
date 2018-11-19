package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.util.C0551g;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.internal.oh;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    /* renamed from: a */
    private static final Object f7565a = new Object();
    /* renamed from: b */
    private static HashSet<Uri> f7566b = new HashSet();
    /* renamed from: c */
    private final Context f7567c;
    /* renamed from: d */
    private final Handler f7568d;
    /* renamed from: e */
    private final ExecutorService f7569e;
    /* renamed from: f */
    private final C3815a f7570f;
    /* renamed from: g */
    private final oh f7571g;
    /* renamed from: h */
    private final Map<C2494a, ImageReceiver> f7572h;
    /* renamed from: i */
    private final Map<Uri, ImageReceiver> f7573i;
    /* renamed from: j */
    private final Map<Uri, Long> f7574j;

    @KeepName
    final class ImageReceiver extends ResultReceiver {
        private final Uri mUri;
        private final ArrayList<C2494a> zzfxa = new ArrayList();
        private /* synthetic */ ImageManager zzfxb;

        ImageReceiver(ImageManager imageManager, Uri uri) {
            this.zzfxb = imageManager;
            super(new Handler(Looper.getMainLooper()));
            this.mUri = uri;
        }

        public final void onReceiveResult(int i, Bundle bundle) {
            this.zzfxb.f7569e.execute(new C2492b(this.zzfxb, this.mUri, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }

        public final void zzakd() {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", this.mUri);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            this.zzfxb.f7567c.sendBroadcast(intent);
        }

        public final void zzb(C2494a c2494a) {
            ak.m9061a("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zzfxa.add(c2494a);
        }

        public final void zzc(C2494a c2494a) {
            ak.m9061a("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zzfxa.remove(c2494a);
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable, boolean z);
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    final class C2492b implements Runnable {
        /* renamed from: a */
        private final Uri f7557a;
        /* renamed from: b */
        private final ParcelFileDescriptor f7558b;
        /* renamed from: c */
        private /* synthetic */ ImageManager f7559c;

        public C2492b(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.f7559c = imageManager;
            this.f7557a = uri;
            this.f7558b = parcelFileDescriptor;
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r12 = this;
            r0 = "LoadBitmapFromDiskRunnable can't be executed in the main thread";
            r1 = android.os.Looper.getMainLooper();
            r1 = r1.getThread();
            r2 = java.lang.Thread.currentThread();
            if (r1 != r2) goto L_0x0060;
        L_0x0010:
            r1 = "Asserts";
            r2 = java.lang.Thread.currentThread();
            r2 = java.lang.String.valueOf(r2);
            r3 = android.os.Looper.getMainLooper();
            r3 = r3.getThread();
            r3 = java.lang.String.valueOf(r3);
            r4 = java.lang.String.valueOf(r2);
            r4 = r4.length();
            r4 = r4 + 56;
            r5 = java.lang.String.valueOf(r3);
            r5 = r5.length();
            r4 = r4 + r5;
            r5 = new java.lang.StringBuilder;
            r5.<init>(r4);
            r4 = "checkNotMainThread: current thread ";
            r5.append(r4);
            r5.append(r2);
            r2 = " IS the main thread ";
            r5.append(r2);
            r5.append(r3);
            r2 = "!";
            r5.append(r2);
            r2 = r5.toString();
            android.util.Log.e(r1, r2);
            r1 = new java.lang.IllegalStateException;
            r1.<init>(r0);
            throw r1;
        L_0x0060:
            r0 = 0;
            r1 = 0;
            r2 = r12.f7558b;
            r3 = 1;
            if (r2 == 0) goto L_0x00ac;
        L_0x0067:
            r2 = r12.f7558b;	 Catch:{ OutOfMemoryError -> 0x0073 }
            r2 = r2.getFileDescriptor();	 Catch:{ OutOfMemoryError -> 0x0073 }
            r2 = android.graphics.BitmapFactory.decodeFileDescriptor(r2);	 Catch:{ OutOfMemoryError -> 0x0073 }
            r1 = r2;
            goto L_0x009b;
        L_0x0073:
            r0 = move-exception;
            r2 = "ImageManager";
            r4 = r12.f7557a;
            r4 = java.lang.String.valueOf(r4);
            r5 = java.lang.String.valueOf(r4);
            r5 = r5.length();
            r5 = r5 + 34;
            r6 = new java.lang.StringBuilder;
            r6.<init>(r5);
            r5 = "OOM while loading bitmap for uri: ";
            r6.append(r5);
            r6.append(r4);
            r4 = r6.toString();
            android.util.Log.e(r2, r4, r0);
            r0 = 1;
        L_0x009b:
            r2 = r12.f7558b;	 Catch:{ IOException -> 0x00a1 }
            r2.close();	 Catch:{ IOException -> 0x00a1 }
            goto L_0x00a9;
        L_0x00a1:
            r2 = move-exception;
            r4 = "ImageManager";
            r5 = "closed failed";
            android.util.Log.e(r4, r5, r2);
        L_0x00a9:
            r10 = r0;
            r9 = r1;
            goto L_0x00ae;
        L_0x00ac:
            r9 = r1;
            r10 = 0;
        L_0x00ae:
            r0 = new java.util.concurrent.CountDownLatch;
            r0.<init>(r3);
            r1 = r12.f7559c;
            r1 = r1.f7568d;
            r2 = new com.google.android.gms.common.images.ImageManager$c;
            r7 = r12.f7559c;
            r8 = r12.f7557a;
            r6 = r2;
            r11 = r0;
            r6.<init>(r7, r8, r9, r10, r11);
            r1.post(r2);
            r0.await();	 Catch:{ InterruptedException -> 0x00cb }
            return;
        L_0x00cb:
            r0 = "ImageManager";
            r1 = r12.f7557a;
            r1 = java.lang.String.valueOf(r1);
            r2 = java.lang.String.valueOf(r1);
            r2 = r2.length();
            r2 = r2 + 32;
            r3 = new java.lang.StringBuilder;
            r3.<init>(r2);
            r2 = "Latch interrupted while posting ";
            r3.append(r2);
            r3.append(r1);
            r1 = r3.toString();
            android.util.Log.w(r0, r1);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.ImageManager.b.run():void");
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    final class C2493c implements Runnable {
        /* renamed from: a */
        private final Uri f7560a;
        /* renamed from: b */
        private final Bitmap f7561b;
        /* renamed from: c */
        private final CountDownLatch f7562c;
        /* renamed from: d */
        private boolean f7563d;
        /* renamed from: e */
        private /* synthetic */ ImageManager f7564e;

        public C2493c(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.f7564e = imageManager;
            this.f7560a = uri;
            this.f7561b = bitmap;
            this.f7563d = z;
            this.f7562c = countDownLatch;
        }

        public final void run() {
            ak.m9061a("OnBitmapLoadedRunnable must be executed in the main thread");
            Object obj = this.f7561b != null ? 1 : null;
            if (this.f7564e.f7570f != null) {
                if (this.f7563d) {
                    this.f7564e.f7570f.evictAll();
                    System.gc();
                    this.f7563d = false;
                    this.f7564e.f7568d.post(this);
                    return;
                } else if (obj != null) {
                    this.f7564e.f7570f.put(new C2495b(this.f7560a), this.f7561b);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) this.f7564e.f7573i.remove(this.f7560a);
            if (imageReceiver != null) {
                ArrayList zza = imageReceiver.zzfxa;
                int size = zza.size();
                for (int i = 0; i < size; i++) {
                    C2494a c2494a = (C2494a) zza.get(i);
                    if (obj != null) {
                        c2494a.m9042a(this.f7564e.f7567c, this.f7561b, false);
                    } else {
                        this.f7564e.f7574j.put(this.f7560a, Long.valueOf(SystemClock.elapsedRealtime()));
                        c2494a.m9043a(this.f7564e.f7567c, this.f7564e.f7571g, false);
                    }
                    if (!(c2494a instanceof C3816c)) {
                        this.f7564e.f7572h.remove(c2494a);
                    }
                }
            }
            this.f7562c.countDown();
            synchronized (ImageManager.f7565a) {
                ImageManager.f7566b.remove(this.f7560a);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    static final class C3815a extends C0551g<C2495b, Bitmap> {
        protected final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            super.entryRemoved(z, (C2495b) obj, (Bitmap) obj2, (Bitmap) obj3);
        }

        protected final /* synthetic */ int sizeOf(Object obj, Object obj2) {
            Bitmap bitmap = (Bitmap) obj2;
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }
}
