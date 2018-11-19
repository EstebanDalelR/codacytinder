package com.theartofdev.edmodo.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.theartofdev.edmodo.cropper.CropImageView.RequestSizeOptions;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;

/* renamed from: com.theartofdev.edmodo.cropper.c */
final class C6139c {
    /* renamed from: a */
    static final Rect f22623a = new Rect();
    /* renamed from: b */
    static final RectF f22624b = new RectF();
    /* renamed from: c */
    static final RectF f22625c = new RectF();
    /* renamed from: d */
    static final float[] f22626d = new float[6];
    /* renamed from: e */
    static final float[] f22627e = new float[6];
    /* renamed from: f */
    static int f22628f;
    /* renamed from: g */
    static Pair<String, WeakReference<Bitmap>> f22629g;

    /* renamed from: com.theartofdev.edmodo.cropper.c$a */
    public static final class C6137a {
        /* renamed from: a */
        public final Bitmap f22619a;
        /* renamed from: b */
        public final int f22620b;

        public C6137a(Bitmap bitmap, int i) {
            this.f22619a = bitmap;
            this.f22620b = i;
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.c$b */
    public static final class C6138b {
        /* renamed from: a */
        public final Bitmap f22621a;
        /* renamed from: b */
        public final int f22622b;

        C6138b(Bitmap bitmap, int i) {
            this.f22621a = bitmap;
            this.f22622b = i;
        }
    }

    /* renamed from: a */
    public static com.theartofdev.edmodo.cropper.C6139c.C6138b m26706a(android.graphics.Bitmap r0, android.content.Context r1, android.net.Uri r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = com.theartofdev.edmodo.cropper.C6139c.m26708a(r1, r2);	 Catch:{ Exception -> 0x0018 }
        r2 = r1.exists();	 Catch:{ Exception -> 0x0018 }
        if (r2 == 0) goto L_0x0018;	 Catch:{ Exception -> 0x0018 }
    L_0x000a:
        r2 = new android.media.ExifInterface;	 Catch:{ Exception -> 0x0018 }
        r1 = r1.getAbsolutePath();	 Catch:{ Exception -> 0x0018 }
        r2.<init>(r1);	 Catch:{ Exception -> 0x0018 }
        r1 = com.theartofdev.edmodo.cropper.C6139c.m26707a(r0, r2);	 Catch:{ Exception -> 0x0018 }
        return r1;
    L_0x0018:
        r1 = new com.theartofdev.edmodo.cropper.c$b;
        r2 = 0;
        r1.<init>(r0, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(android.graphics.Bitmap, android.content.Context, android.net.Uri):com.theartofdev.edmodo.cropper.c$b");
    }

    /* renamed from: a */
    public static C6138b m26707a(Bitmap bitmap, ExifInterface exifInterface) {
        exifInterface = exifInterface.getAttributeInt("Orientation", 1);
        exifInterface = exifInterface != 3 ? exifInterface != 6 ? exifInterface != 8 ? null : 270 : 90 : 180;
        return new C6138b(bitmap, exifInterface);
    }

    /* renamed from: a */
    public static C6137a m26701a(Context context, Uri uri, int i, int i2) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Options a = C6139c.m26699a(contentResolver, uri);
            a.inSampleSize = Math.max(C6139c.m26693a(a.outWidth, a.outHeight, i, i2), C6139c.m26692a(a.outWidth, a.outHeight));
            return new C6137a(C6139c.m26694a(contentResolver, uri, a), a.inSampleSize);
        } catch (Context context2) {
            i2 = new StringBuilder();
            i2.append("Failed to load sampled bitmap: ");
            i2.append(uri);
            i2.append("\r\n");
            i2.append(context2.getMessage());
            throw new RuntimeException(i2.toString(), context2);
        }
    }

    /* renamed from: a */
    public static Bitmap m26697a(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3) {
        Rect a = C6139c.m26700a(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i2, i3);
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, a.left, a.top, a.width(), a.height(), matrix, true);
        if (createBitmap == bitmap) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i % 90 != 0 ? C6139c.m26698a(createBitmap, fArr, a, i, z, i2, i3) : createBitmap;
    }

    /* renamed from: a */
    public static C6137a m26703a(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        int i8 = 1;
        while (true) {
            try {
                break;
            } catch (Throwable e) {
                i8 *= 2;
                if (i8 > 16) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to handle OOM by sampling (");
                    stringBuilder.append(i8);
                    stringBuilder.append("): ");
                    stringBuilder.append(uri);
                    stringBuilder.append("\r\n");
                    stringBuilder.append(e.getMessage());
                    throw new RuntimeException(stringBuilder.toString(), e);
                }
                Uri uri2 = uri;
            }
        }
        return C6139c.m26704a(context, uri, fArr, i, i2, i3, z, i4, i5, i6, i7, i8);
    }

    /* renamed from: a */
    public static float m26690a(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: b */
    public static float m26712b(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: c */
    public static float m26713c(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: d */
    public static float m26714d(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: e */
    public static float m26715e(float[] fArr) {
        return C6139c.m26713c(fArr) - C6139c.m26690a(fArr);
    }

    /* renamed from: f */
    public static float m26716f(float[] fArr) {
        return C6139c.m26714d(fArr) - C6139c.m26712b(fArr);
    }

    /* renamed from: g */
    public static float m26717g(float[] fArr) {
        return (C6139c.m26713c(fArr) + C6139c.m26690a(fArr)) / 1073741824;
    }

    /* renamed from: h */
    public static float m26718h(float[] fArr) {
        return (C6139c.m26714d(fArr) + C6139c.m26712b(fArr)) / 1073741824;
    }

    /* renamed from: a */
    public static Rect m26700a(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, C6139c.m26690a(fArr))), Math.round(Math.max(0.0f, C6139c.m26712b(fArr))), Math.round(Math.min((float) i, C6139c.m26713c(fArr))), Math.round(Math.min((float) i2, C6139c.m26714d(fArr))));
        if (z) {
            C6139c.m26710a(rect, i3, i4);
        }
        return rect;
    }

    /* renamed from: a */
    public static void m26710a(Rect rect, int i, int i2) {
        if (i == i2 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
            } else {
                rect.right -= rect.width() - rect.height();
            }
        }
    }

    /* renamed from: a */
    public static void m26709a(Context context, Bitmap bitmap, Uri uri, CompressFormat compressFormat, int i) throws FileNotFoundException {
        Closeable closeable = null;
        try {
            Closeable openOutputStream = context.getContentResolver().openOutputStream(uri);
            try {
                bitmap.compress(compressFormat, i, openOutputStream);
                C6139c.m26711a(openOutputStream);
            } catch (Throwable th) {
                bitmap = th;
                closeable = openOutputStream;
                C6139c.m26711a(closeable);
                throw bitmap;
            }
        } catch (Throwable th2) {
            bitmap = th2;
            C6139c.m26711a(closeable);
            throw bitmap;
        }
    }

    /* renamed from: a */
    public static Bitmap m26696a(Bitmap bitmap, int i, int i2, RequestSizeOptions requestSizeOptions) {
        if (i > 0 && i2 > 0) {
            try {
                if (requestSizeOptions == RequestSizeOptions.RESIZE_FIT || requestSizeOptions == RequestSizeOptions.RESIZE_INSIDE || requestSizeOptions == RequestSizeOptions.RESIZE_EXACT) {
                    Bitmap bitmap2 = null;
                    if (requestSizeOptions == RequestSizeOptions.RESIZE_EXACT) {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i, i2, false);
                    } else {
                        float width = (float) bitmap.getWidth();
                        float height = (float) bitmap.getHeight();
                        i = Math.max(width / ((float) i), height / ((float) i2));
                        if (i > 1065353216 || requestSizeOptions == RequestSizeOptions.RESIZE_FIT) {
                            bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (width / i), (int) (height / i), false);
                        }
                    }
                    if (bitmap2 != null) {
                        if (bitmap2 != bitmap) {
                            bitmap.recycle();
                        }
                        return bitmap2;
                    }
                }
            } catch (int i3) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", i3);
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    private static com.theartofdev.edmodo.cropper.C6139c.C6137a m26704a(android.content.Context r15, android.net.Uri r16, float[] r17, int r18, int r19, int r20, boolean r21, int r22, int r23, int r24, int r25, int r26) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = r18;
        r5 = r17;
        r6 = r19;
        r7 = r20;
        r8 = r21;
        r9 = r22;
        r10 = r23;
        r12 = com.theartofdev.edmodo.cropper.C6139c.m26700a(r5, r6, r7, r8, r9, r10);
        if (r24 <= 0) goto L_0x0017;
    L_0x0014:
        r13 = r24;
        goto L_0x001c;
    L_0x0017:
        r1 = r12.width();
        r13 = r1;
    L_0x001c:
        if (r25 <= 0) goto L_0x0021;
    L_0x001e:
        r14 = r25;
        goto L_0x0026;
    L_0x0021:
        r1 = r12.height();
        r14 = r1;
    L_0x0026:
        r1 = 0;
        r2 = 1;
        r6 = r15;
        r7 = r16;
        r8 = r12;
        r9 = r13;
        r10 = r14;
        r11 = r26;
        r3 = com.theartofdev.edmodo.cropper.C6139c.m26702a(r6, r7, r8, r9, r10, r11);	 Catch:{ Exception -> 0x003a }
        r5 = r3.f22619a;	 Catch:{ Exception -> 0x003a }
        r1 = r3.f22620b;	 Catch:{ Exception -> 0x003b }
        r8 = r1;
        goto L_0x003c;
    L_0x003a:
        r5 = r1;
    L_0x003b:
        r8 = 1;
    L_0x003c:
        if (r5 == 0) goto L_0x0067;
    L_0x003e:
        r9 = com.theartofdev.edmodo.cropper.C6139c.m26695a(r5, r4);	 Catch:{ OutOfMemoryError -> 0x005e }
        r1 = r4 % 90;	 Catch:{ OutOfMemoryError -> 0x005b }
        if (r1 == 0) goto L_0x0055;	 Catch:{ OutOfMemoryError -> 0x005b }
    L_0x0046:
        r1 = r9;	 Catch:{ OutOfMemoryError -> 0x005b }
        r2 = r17;	 Catch:{ OutOfMemoryError -> 0x005b }
        r3 = r12;	 Catch:{ OutOfMemoryError -> 0x005b }
        r5 = r21;	 Catch:{ OutOfMemoryError -> 0x005b }
        r6 = r22;	 Catch:{ OutOfMemoryError -> 0x005b }
        r7 = r23;	 Catch:{ OutOfMemoryError -> 0x005b }
        r1 = com.theartofdev.edmodo.cropper.C6139c.m26698a(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ OutOfMemoryError -> 0x005b }
        r9 = r1;
    L_0x0055:
        r1 = new com.theartofdev.edmodo.cropper.c$a;
        r1.<init>(r9, r8);
        return r1;
    L_0x005b:
        r0 = move-exception;
        r1 = r0;
        goto L_0x0061;
    L_0x005e:
        r0 = move-exception;
        r1 = r0;
        r9 = r5;
    L_0x0061:
        if (r9 == 0) goto L_0x0066;
    L_0x0063:
        r9.recycle();
    L_0x0066:
        throw r1;
    L_0x0067:
        r1 = r15;
        r2 = r16;
        r3 = r17;
        r5 = r21;
        r6 = r22;
        r7 = r23;
        r8 = r26;
        r9 = r12;
        r10 = r13;
        r11 = r14;
        r1 = com.theartofdev.edmodo.cropper.C6139c.m26705a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, int):com.theartofdev.edmodo.cropper.c$a");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static com.theartofdev.edmodo.cropper.C6139c.C6137a m26705a(android.content.Context r13, android.net.Uri r14, float[] r15, int r16, boolean r17, int r18, int r19, int r20, android.graphics.Rect r21, int r22, int r23) {
        /*
        r1 = r14;
        r2 = r15;
        r3 = 0;
        r4 = new android.graphics.BitmapFactory$Options;	 Catch:{ OutOfMemoryError -> 0x0088, Exception -> 0x0063 }
        r4.<init>();	 Catch:{ OutOfMemoryError -> 0x0088, Exception -> 0x0063 }
        r5 = r21.width();	 Catch:{ OutOfMemoryError -> 0x0088, Exception -> 0x0063 }
        r6 = r21.height();	 Catch:{ OutOfMemoryError -> 0x0088, Exception -> 0x0063 }
        r7 = r22;
        r8 = r23;
        r5 = com.theartofdev.edmodo.cropper.C6139c.m26693a(r5, r6, r7, r8);	 Catch:{ OutOfMemoryError -> 0x0088, Exception -> 0x0063 }
        r5 = r5 * r20;
        r4.inSampleSize = r5;	 Catch:{ OutOfMemoryError -> 0x0088, Exception -> 0x0063 }
        r6 = r13.getContentResolver();	 Catch:{ OutOfMemoryError -> 0x0088, Exception -> 0x0063 }
        r6 = com.theartofdev.edmodo.cropper.C6139c.m26694a(r6, r1, r4);	 Catch:{ OutOfMemoryError -> 0x0088, Exception -> 0x0063 }
        if (r6 == 0) goto L_0x005d;
    L_0x0026:
        r7 = r2.length;	 Catch:{ all -> 0x0055 }
        r8 = new float[r7];	 Catch:{ all -> 0x0055 }
        r7 = r2.length;	 Catch:{ all -> 0x0055 }
        r9 = 0;
        java.lang.System.arraycopy(r2, r9, r8, r9, r7);	 Catch:{ all -> 0x0055 }
    L_0x002e:
        r2 = r8.length;	 Catch:{ all -> 0x0055 }
        if (r9 >= r2) goto L_0x003c;
    L_0x0031:
        r2 = r8[r9];	 Catch:{ all -> 0x0055 }
        r7 = r4.inSampleSize;	 Catch:{ all -> 0x0055 }
        r7 = (float) r7;	 Catch:{ all -> 0x0055 }
        r2 = r2 / r7;
        r8[r9] = r2;	 Catch:{ all -> 0x0055 }
        r9 = r9 + 1;
        goto L_0x002e;
    L_0x003c:
        r7 = r6;
        r9 = r16;
        r10 = r17;
        r11 = r18;
        r12 = r19;
        r2 = com.theartofdev.edmodo.cropper.C6139c.m26697a(r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x0055 }
        if (r2 == r6) goto L_0x0053;
    L_0x004b:
        r6.recycle();	 Catch:{ OutOfMemoryError -> 0x004f, Exception -> 0x0063 }
        goto L_0x0053;
    L_0x004f:
        r0 = move-exception;
        r1 = r0;
        r3 = r2;
        goto L_0x008a;
    L_0x0053:
        r3 = r2;
        goto L_0x005d;
    L_0x0055:
        r0 = move-exception;
        r2 = r0;
        if (r6 == 0) goto L_0x005c;
    L_0x0059:
        r6.recycle();	 Catch:{ OutOfMemoryError -> 0x0088, Exception -> 0x0063 }
    L_0x005c:
        throw r2;	 Catch:{ OutOfMemoryError -> 0x0088, Exception -> 0x0063 }
    L_0x005d:
        r1 = new com.theartofdev.edmodo.cropper.c$a;
        r1.<init>(r3, r5);
        return r1;
    L_0x0063:
        r0 = move-exception;
        r2 = r0;
        r3 = new java.lang.RuntimeException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Failed to load sampled bitmap: ";
        r4.append(r5);
        r4.append(r1);
        r1 = "\r\n";
        r4.append(r1);
        r1 = r2.getMessage();
        r4.append(r1);
        r1 = r4.toString();
        r3.<init>(r1, r2);
        throw r3;
    L_0x0088:
        r0 = move-exception;
        r1 = r0;
    L_0x008a:
        if (r3 == 0) goto L_0x008f;
    L_0x008c:
        r3.recycle();
    L_0x008f:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(android.content.Context, android.net.Uri, float[], int, boolean, int, int, int, android.graphics.Rect, int, int):com.theartofdev.edmodo.cropper.c$a");
    }

    /* renamed from: a */
    private static Options m26699a(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        Closeable openInputStream;
        try {
            openInputStream = contentResolver.openInputStream(uri);
            try {
                uri = new Options();
                uri.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(openInputStream, f22623a, uri);
                uri.inJustDecodeBounds = false;
                C6139c.m26711a(openInputStream);
                return uri;
            } catch (Throwable th) {
                uri = th;
                C6139c.m26711a(openInputStream);
                throw uri;
            }
        } catch (Throwable th2) {
            uri = th2;
            openInputStream = null;
            C6139c.m26711a(openInputStream);
            throw uri;
        }
    }

    /* renamed from: a */
    private static android.graphics.Bitmap m26694a(android.content.ContentResolver r2, android.net.Uri r3, android.graphics.BitmapFactory.Options r4) throws java.io.FileNotFoundException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
    L_0x0000:
        r0 = 0;
        r1 = r2.openInputStream(r3);	 Catch:{ OutOfMemoryError -> 0x0016 }
        r0 = f22623a;	 Catch:{ OutOfMemoryError -> 0x0012, all -> 0x000f }
        r0 = android.graphics.BitmapFactory.decodeStream(r1, r0, r4);	 Catch:{ OutOfMemoryError -> 0x0012, all -> 0x000f }
        com.theartofdev.edmodo.cropper.C6139c.m26711a(r1);
        return r0;
    L_0x000f:
        r2 = move-exception;
        r0 = r1;
        goto L_0x003c;
    L_0x0012:
        r0 = r1;
        goto L_0x0016;
    L_0x0014:
        r2 = move-exception;
        goto L_0x003c;
    L_0x0016:
        r1 = r4.inSampleSize;	 Catch:{ all -> 0x0014 }
        r1 = r1 * 2;	 Catch:{ all -> 0x0014 }
        r4.inSampleSize = r1;	 Catch:{ all -> 0x0014 }
        com.theartofdev.edmodo.cropper.C6139c.m26711a(r0);
        r0 = r4.inSampleSize;
        r1 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r0 <= r1) goto L_0x0000;
    L_0x0025:
        r2 = new java.lang.RuntimeException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = "Failed to decode image: ";
        r4.append(r0);
        r4.append(r3);
        r3 = r4.toString();
        r2.<init>(r3);
        throw r2;
    L_0x003c:
        com.theartofdev.edmodo.cropper.C6139c.m26711a(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(android.content.ContentResolver, android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static com.theartofdev.edmodo.cropper.C6139c.C6137a m26702a(android.content.Context r4, android.net.Uri r5, android.graphics.Rect r6, int r7, int r8, int r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = new android.graphics.BitmapFactory$Options;	 Catch:{ Exception -> 0x0061, all -> 0x005e }
        r1.<init>();	 Catch:{ Exception -> 0x0061, all -> 0x005e }
        r2 = r6.width();	 Catch:{ Exception -> 0x0061, all -> 0x005e }
        r3 = r6.height();	 Catch:{ Exception -> 0x0061, all -> 0x005e }
        r7 = com.theartofdev.edmodo.cropper.C6139c.m26693a(r2, r3, r7, r8);	 Catch:{ Exception -> 0x0061, all -> 0x005e }
        r9 = r9 * r7;	 Catch:{ Exception -> 0x0061, all -> 0x005e }
        r1.inSampleSize = r9;	 Catch:{ Exception -> 0x0061, all -> 0x005e }
        r4 = r4.getContentResolver();	 Catch:{ Exception -> 0x0061, all -> 0x005e }
        r4 = r4.openInputStream(r5);	 Catch:{ Exception -> 0x0061, all -> 0x005e }
        r7 = 0;
        r7 = android.graphics.BitmapRegionDecoder.newInstance(r4, r7);	 Catch:{ Exception -> 0x005a, all -> 0x0056 }
    L_0x0023:
        r8 = new com.theartofdev.edmodo.cropper.c$a;	 Catch:{ OutOfMemoryError -> 0x003b }
        r9 = r7.decodeRegion(r6, r1);	 Catch:{ OutOfMemoryError -> 0x003b }
        r2 = r1.inSampleSize;	 Catch:{ OutOfMemoryError -> 0x003b }
        r8.<init>(r9, r2);	 Catch:{ OutOfMemoryError -> 0x003b }
        com.theartofdev.edmodo.cropper.C6139c.m26711a(r4);
        if (r7 == 0) goto L_0x0036;
    L_0x0033:
        r7.recycle();
    L_0x0036:
        return r8;
    L_0x0037:
        r5 = move-exception;
        goto L_0x0058;
    L_0x0039:
        r6 = move-exception;
        goto L_0x005c;
    L_0x003b:
        r8 = r1.inSampleSize;	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r8 = r8 * 2;	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r1.inSampleSize = r8;	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r8 = r1.inSampleSize;	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r9 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r8 <= r9) goto L_0x0023;
    L_0x0047:
        com.theartofdev.edmodo.cropper.C6139c.m26711a(r4);
        if (r7 == 0) goto L_0x004f;
    L_0x004c:
        r7.recycle();
    L_0x004f:
        r4 = new com.theartofdev.edmodo.cropper.c$a;
        r5 = 1;
        r4.<init>(r0, r5);
        return r4;
    L_0x0056:
        r5 = move-exception;
        r7 = r0;
    L_0x0058:
        r0 = r4;
        goto L_0x0087;
    L_0x005a:
        r6 = move-exception;
        r7 = r0;
    L_0x005c:
        r0 = r4;
        goto L_0x0063;
    L_0x005e:
        r5 = move-exception;
        r7 = r0;
        goto L_0x0087;
    L_0x0061:
        r6 = move-exception;
        r7 = r0;
    L_0x0063:
        r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0086 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0086 }
        r8.<init>();	 Catch:{ all -> 0x0086 }
        r9 = "Failed to load sampled bitmap: ";	 Catch:{ all -> 0x0086 }
        r8.append(r9);	 Catch:{ all -> 0x0086 }
        r8.append(r5);	 Catch:{ all -> 0x0086 }
        r5 = "\r\n";	 Catch:{ all -> 0x0086 }
        r8.append(r5);	 Catch:{ all -> 0x0086 }
        r5 = r6.getMessage();	 Catch:{ all -> 0x0086 }
        r8.append(r5);	 Catch:{ all -> 0x0086 }
        r5 = r8.toString();	 Catch:{ all -> 0x0086 }
        r4.<init>(r5, r6);	 Catch:{ all -> 0x0086 }
        throw r4;	 Catch:{ all -> 0x0086 }
    L_0x0086:
        r5 = move-exception;
    L_0x0087:
        com.theartofdev.edmodo.cropper.C6139c.m26711a(r0);
        if (r7 == 0) goto L_0x008f;
    L_0x008c:
        r7.recycle();
    L_0x008f:
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):com.theartofdev.edmodo.cropper.c$a");
    }

    /* renamed from: a */
    private static Bitmap m26698a(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z, int i2, int i3) {
        if (i % 90 == 0) {
            return bitmap;
        }
        int i4;
        int i5;
        int abs;
        double toRadians = Math.toRadians((double) i);
        if (i >= 90) {
            if (i <= 180 || i >= 270) {
                i = rect.right;
                i4 = 0;
                i5 = 0;
                while (i5 < fArr.length) {
                    if (fArr[i5] < ((float) (i - 1)) && fArr[i5] <= ((float) (i + 1))) {
                        i5++;
                        i4 = (int) Math.abs(Math.sin(toRadians) * ((double) (((float) rect.bottom) - fArr[i5])));
                        i = (int) Math.abs(Math.cos(toRadians) * ((double) (fArr[i5] - ((float) rect.top))));
                        abs = (int) Math.abs(((double) (fArr[i5] - ((float) rect.top))) / Math.sin(toRadians));
                        fArr = (int) Math.abs(((double) (((float) rect.bottom) - fArr[i5])) / Math.cos(toRadians));
                        break;
                    }
                    i5 += 2;
                }
                fArr = null;
                i = 0;
                abs = 0;
                rect.set(i4, i, abs + i4, fArr + i);
                if (z) {
                    C6139c.m26710a(rect, i2, i3);
                }
                fArr = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
                if (bitmap != fArr) {
                    bitmap.recycle();
                }
                return fArr;
            }
        }
        i = rect.left;
        i4 = 0;
        i5 = 0;
        while (i5 < fArr.length) {
            if (fArr[i5] < ((float) (i - 1))) {
            }
            i5 += 2;
        }
        fArr = null;
        i = 0;
        abs = 0;
        rect.set(i4, i, abs + i4, fArr + i);
        if (z) {
            C6139c.m26710a(rect, i2, i3);
        }
        fArr = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (bitmap != fArr) {
            bitmap.recycle();
        }
        return fArr;
    }

    /* renamed from: a */
    private static int m26693a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    private static int m26692a(int i, int i2) {
        if (f22628f == 0) {
            f22628f = C6139c.m26691a();
        }
        int i3 = 1;
        if (f22628f > 0) {
            while (true) {
                if (i2 / i3 <= f22628f && i / i3 <= f22628f) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static java.io.File m26708a(android.content.Context r9, android.net.Uri r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new java.io.File;
        r1 = r10.getPath();
        r0.<init>(r1);
        r1 = r0.exists();
        if (r1 == 0) goto L_0x0010;
    L_0x000f:
        return r0;
    L_0x0010:
        r1 = 0;
        r2 = "_data";	 Catch:{ Exception -> 0x0041, all -> 0x003e }
        r5 = new java.lang.String[]{r2};	 Catch:{ Exception -> 0x0041, all -> 0x003e }
        r3 = r9.getContentResolver();	 Catch:{ Exception -> 0x0041, all -> 0x003e }
        r6 = 0;	 Catch:{ Exception -> 0x0041, all -> 0x003e }
        r7 = 0;	 Catch:{ Exception -> 0x0041, all -> 0x003e }
        r8 = 0;	 Catch:{ Exception -> 0x0041, all -> 0x003e }
        r4 = r10;	 Catch:{ Exception -> 0x0041, all -> 0x003e }
        r9 = r3.query(r4, r5, r6, r7, r8);	 Catch:{ Exception -> 0x0041, all -> 0x003e }
        r10 = "_data";	 Catch:{ Exception -> 0x0049, all -> 0x003c }
        r10 = r9.getColumnIndexOrThrow(r10);	 Catch:{ Exception -> 0x0049, all -> 0x003c }
        r9.moveToFirst();	 Catch:{ Exception -> 0x0049, all -> 0x003c }
        r10 = r9.getString(r10);	 Catch:{ Exception -> 0x0049, all -> 0x003c }
        r1 = new java.io.File;	 Catch:{ Exception -> 0x0049, all -> 0x003c }
        r1.<init>(r10);	 Catch:{ Exception -> 0x0049, all -> 0x003c }
        if (r9 == 0) goto L_0x003a;
    L_0x0037:
        r9.close();
    L_0x003a:
        r0 = r1;
        goto L_0x004e;
    L_0x003c:
        r10 = move-exception;
        goto L_0x0043;
    L_0x003e:
        r10 = move-exception;
        r9 = r1;
        goto L_0x0043;
    L_0x0041:
        r9 = r1;
        goto L_0x0049;
    L_0x0043:
        if (r9 == 0) goto L_0x0048;
    L_0x0045:
        r9.close();
    L_0x0048:
        throw r10;
    L_0x0049:
        if (r9 == 0) goto L_0x004e;
    L_0x004b:
        r9.close();
    L_0x004e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(android.content.Context, android.net.Uri):java.io.File");
    }

    /* renamed from: a */
    private static Bitmap m26695a(Bitmap bitmap, int i) {
        if (i <= 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i);
        i = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (i != bitmap) {
            bitmap.recycle();
        }
        return i;
    }

    /* renamed from: a */
    private static int m26691a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r1 = javax.microedition.khronos.egl.EGLContext.getEGL();	 Catch:{ Exception -> 0x0045 }
        r1 = (javax.microedition.khronos.egl.EGL10) r1;	 Catch:{ Exception -> 0x0045 }
        r2 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;	 Catch:{ Exception -> 0x0045 }
        r2 = r1.eglGetDisplay(r2);	 Catch:{ Exception -> 0x0045 }
        r3 = 2;	 Catch:{ Exception -> 0x0045 }
        r3 = new int[r3];	 Catch:{ Exception -> 0x0045 }
        r1.eglInitialize(r2, r3);	 Catch:{ Exception -> 0x0045 }
        r3 = 1;	 Catch:{ Exception -> 0x0045 }
        r4 = new int[r3];	 Catch:{ Exception -> 0x0045 }
        r5 = 0;	 Catch:{ Exception -> 0x0045 }
        r6 = 0;	 Catch:{ Exception -> 0x0045 }
        r1.eglGetConfigs(r2, r5, r6, r4);	 Catch:{ Exception -> 0x0045 }
        r5 = r4[r6];	 Catch:{ Exception -> 0x0045 }
        r5 = new javax.microedition.khronos.egl.EGLConfig[r5];	 Catch:{ Exception -> 0x0045 }
        r7 = r4[r6];	 Catch:{ Exception -> 0x0045 }
        r1.eglGetConfigs(r2, r5, r7, r4);	 Catch:{ Exception -> 0x0045 }
        r3 = new int[r3];	 Catch:{ Exception -> 0x0045 }
        r7 = 0;	 Catch:{ Exception -> 0x0045 }
        r8 = 0;	 Catch:{ Exception -> 0x0045 }
    L_0x0029:
        r9 = r4[r6];	 Catch:{ Exception -> 0x0045 }
        if (r7 >= r9) goto L_0x003d;	 Catch:{ Exception -> 0x0045 }
    L_0x002d:
        r9 = r5[r7];	 Catch:{ Exception -> 0x0045 }
        r10 = 12332; // 0x302c float:1.7281E-41 double:6.093E-320;	 Catch:{ Exception -> 0x0045 }
        r1.eglGetConfigAttrib(r2, r9, r10, r3);	 Catch:{ Exception -> 0x0045 }
        r9 = r3[r6];	 Catch:{ Exception -> 0x0045 }
        if (r8 >= r9) goto L_0x003a;	 Catch:{ Exception -> 0x0045 }
    L_0x0038:
        r8 = r3[r6];	 Catch:{ Exception -> 0x0045 }
    L_0x003a:
        r7 = r7 + 1;	 Catch:{ Exception -> 0x0045 }
        goto L_0x0029;	 Catch:{ Exception -> 0x0045 }
    L_0x003d:
        r1.eglTerminate(r2);	 Catch:{ Exception -> 0x0045 }
        r1 = java.lang.Math.max(r8, r0);	 Catch:{ Exception -> 0x0045 }
        return r1;
    L_0x0045:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a():int");
    }

    /* renamed from: a */
    private static void m26711a(java.io.Closeable r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r0 == 0) goto L_0x0005;
    L_0x0002:
        r0.close();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(java.io.Closeable):void");
    }
}
