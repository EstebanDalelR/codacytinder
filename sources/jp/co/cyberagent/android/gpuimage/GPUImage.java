package jp.co.cyberagent.android.gpuimage;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.AsyncTask;
import android.view.WindowManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class GPUImage {
    /* renamed from: a */
    private final Context f48931a;
    /* renamed from: b */
    private final C15790c f48932b;
    /* renamed from: c */
    private GLSurfaceView f48933c;
    /* renamed from: d */
    private C15785a f48934d;
    /* renamed from: e */
    private Bitmap f48935e;
    /* renamed from: f */
    private ScaleType f48936f = ScaleType.CENTER_CROP;

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$1 */
    class C157791 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ GPUImage f48926a;

        C157791(GPUImage gPUImage) {
            this.f48926a = gPUImage;
        }

        public void run() {
            synchronized (this.f48926a.f48934d) {
                this.f48926a.f48934d.m59761d();
                this.f48926a.f48934d.notify();
            }
        }
    }

    public interface OnPictureSavedListener {
        void onPictureSaved(Uri uri);
    }

    public interface ResponseListener<T> {
        void response(T t);
    }

    public enum ScaleType {
        CENTER_INSIDE,
        CENTER_CROP
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$b */
    private abstract class C15780b extends AsyncTask<Void, Void, Bitmap> {
        /* renamed from: a */
        private final GPUImage f48927a;
        /* renamed from: b */
        final /* synthetic */ GPUImage f48928b;
        /* renamed from: c */
        private int f48929c;
        /* renamed from: d */
        private int f48930d;

        /* renamed from: a */
        protected abstract int mo13010a() throws IOException;

        /* renamed from: a */
        protected abstract Bitmap mo13011a(Options options);

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m59730a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m59731a((Bitmap) obj);
        }

        public C15780b(GPUImage gPUImage, GPUImage gPUImage2) {
            this.f48928b = gPUImage;
            this.f48927a = gPUImage2;
        }

        /* renamed from: a */
        protected Bitmap m59730a(Void... voidArr) {
            if (this.f48928b.f48932b != null && this.f48928b.f48932b.m59788b() == null) {
                try {
                    synchronized (this.f48928b.f48932b.f48971b) {
                        this.f48928b.f48932b.f48971b.wait(3000);
                    }
                } catch (Void[] voidArr2) {
                    voidArr2.printStackTrace();
                }
            }
            this.f48929c = this.f48928b.m59736d();
            this.f48930d = this.f48928b.m59738e();
            return m59725b();
        }

        /* renamed from: a */
        protected void m59731a(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            this.f48927a.m59749b();
            this.f48927a.m59742a(bitmap);
        }

        /* renamed from: b */
        private Bitmap m59725b() {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            mo13011a(options);
            int i = 1;
            while (true) {
                boolean z = false;
                boolean z2 = options.outWidth / i > this.f48929c;
                if (options.outHeight / i > this.f48930d) {
                    z = true;
                }
                if (!m59723a(z2, z)) {
                    break;
                }
                i++;
            }
            int i2 = i - 1;
            if (i2 < 1) {
                i2 = 1;
            }
            Options options2 = new Options();
            options2.inSampleSize = i2;
            options2.inPreferredConfig = Config.RGB_565;
            options2.inPurgeable = true;
            options2.inTempStorage = new byte[32768];
            Bitmap a = mo13011a(options2);
            if (a == null) {
                return null;
            }
            return m59726b(m59727c(a));
        }

        /* renamed from: b */
        private Bitmap m59726b(Bitmap bitmap) {
            int[] a = m59724a(bitmap.getWidth(), bitmap.getHeight());
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, a[0], a[1], true);
            if (createScaledBitmap != bitmap) {
                bitmap.recycle();
                System.gc();
                bitmap = createScaledBitmap;
            }
            if (this.f48928b.f48936f != ScaleType.CENTER_CROP) {
                return bitmap;
            }
            int i = a[0] - this.f48929c;
            int i2 = a[1] - this.f48930d;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, i / 2, i2 / 2, a[0] - i, a[1] - i2);
            if (createBitmap == bitmap) {
                return bitmap;
            }
            bitmap.recycle();
            return createBitmap;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        private int[] m59724a(int r7, int r8) {
            /*
            r6 = this;
            r7 = (float) r7;
            r0 = r6.f48929c;
            r0 = (float) r0;
            r0 = r7 / r0;
            r8 = (float) r8;
            r1 = r6.f48930d;
            r1 = (float) r1;
            r1 = r8 / r1;
            r2 = r6.f48928b;
            r2 = r2.f48936f;
            r3 = jp.co.cyberagent.android.gpuimage.GPUImage.ScaleType.CENTER_CROP;
            r4 = 0;
            r5 = 1;
            if (r2 != r3) goto L_0x0020;
        L_0x0018:
            r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
            if (r0 <= 0) goto L_0x001e;
        L_0x001c:
            r0 = 1;
            goto L_0x0025;
        L_0x001e:
            r0 = 0;
            goto L_0x0025;
        L_0x0020:
            r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
            if (r0 >= 0) goto L_0x001e;
        L_0x0024:
            goto L_0x001c;
        L_0x0025:
            if (r0 == 0) goto L_0x0030;
        L_0x0027:
            r0 = r6.f48930d;
            r0 = (float) r0;
            r8 = r0 / r8;
            r8 = r8 * r7;
            r7 = r0;
            goto L_0x0038;
        L_0x0030:
            r0 = r6.f48929c;
            r0 = (float) r0;
            r7 = r0 / r7;
            r7 = r7 * r8;
            r8 = r0;
        L_0x0038:
            r0 = 2;
            r0 = new int[r0];
            r8 = java.lang.Math.round(r8);
            r0[r4] = r8;
            r7 = java.lang.Math.round(r7);
            r0[r5] = r7;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.co.cyberagent.android.gpuimage.GPUImage.b.a(int, int):int[]");
        }

        /* renamed from: a */
        private boolean m59723a(boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f48928b.f48936f == ScaleType.CENTER_CROP) {
                if (z && z2) {
                    z3 = true;
                }
                return z3;
            }
            if (z || z2) {
                z3 = true;
            }
            return z3;
        }

        /* renamed from: c */
        private Bitmap m59727c(Bitmap bitmap) {
            IOException iOException;
            if (bitmap == null) {
                return null;
            }
            try {
                int a = mo13010a();
                if (a != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate((float) a);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    try {
                        bitmap.recycle();
                        bitmap = createBitmap;
                    } catch (Bitmap bitmap2) {
                        Bitmap bitmap3 = createBitmap;
                        iOException = bitmap2;
                        bitmap2 = bitmap3;
                        iOException.printStackTrace();
                        return bitmap2;
                    }
                }
            } catch (IOException e) {
                iOException = e;
                iOException.printStackTrace();
                return bitmap2;
            }
            return bitmap2;
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$a */
    private class C17536a extends C15780b {
        /* renamed from: a */
        final /* synthetic */ GPUImage f54696a;
        /* renamed from: c */
        private final File f54697c;

        public C17536a(GPUImage gPUImage, GPUImage gPUImage2, File file) {
            this.f54696a = gPUImage;
            super(gPUImage, gPUImage2);
            this.f54697c = file;
        }

        /* renamed from: a */
        protected Bitmap mo13011a(Options options) {
            return BitmapFactory.decodeFile(this.f54697c.getAbsolutePath(), options);
        }

        /* renamed from: a */
        protected int mo13010a() throws IOException {
            int attributeInt = new ExifInterface(this.f54697c.getAbsolutePath()).getAttributeInt("Orientation", 1);
            if (attributeInt == 1) {
                return 0;
            }
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            } else {
                return 90;
            }
        }
    }

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImage$c */
    private class C17537c extends C15780b {
        /* renamed from: a */
        final /* synthetic */ GPUImage f54698a;
        /* renamed from: c */
        private final Uri f54699c;

        public C17537c(GPUImage gPUImage, GPUImage gPUImage2, Uri uri) {
            this.f54698a = gPUImage;
            super(gPUImage, gPUImage2);
            this.f54699c = uri;
        }

        /* renamed from: a */
        protected Bitmap mo13011a(Options options) {
            try {
                InputStream openInputStream;
                if (!this.f54699c.getScheme().startsWith("http")) {
                    if (!this.f54699c.getScheme().startsWith("https")) {
                        openInputStream = this.f54698a.f48931a.getContentResolver().openInputStream(this.f54699c);
                        return BitmapFactory.decodeStream(openInputStream, null, options);
                    }
                }
                openInputStream = new URL(this.f54699c.toString()).openStream();
                return BitmapFactory.decodeStream(openInputStream, null, options);
            } catch (Options options2) {
                options2.printStackTrace();
                return null;
            }
        }

        /* renamed from: a */
        protected int mo13010a() throws IOException {
            Cursor query = this.f54698a.f48931a.getContentResolver().query(this.f54699c, new String[]{"orientation"}, null, null, null);
            if (query != null) {
                if (query.getCount() == 1) {
                    query.moveToFirst();
                    int i = query.getInt(0);
                    query.close();
                    return i;
                }
            }
            return 0;
        }
    }

    public GPUImage(Context context) {
        if (m59733a(context)) {
            this.f48931a = context;
            this.f48934d = new C15785a();
            this.f48932b = new C15790c(this.f48934d);
            return;
        }
        throw new IllegalStateException("OpenGL ES 2.0 is not supported on this phone.");
    }

    /* renamed from: a */
    private boolean m59733a(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 131072 ? true : null;
    }

    /* renamed from: a */
    public void m59741a() {
        if (this.f48933c != null) {
            this.f48933c.requestRender();
        }
    }

    /* renamed from: a */
    public void m59747a(C15785a c15785a) {
        this.f48934d = c15785a;
        this.f48932b.m59787a(this.f48934d);
        m59741a();
    }

    /* renamed from: a */
    public void m59742a(Bitmap bitmap) {
        this.f48935e = bitmap;
        this.f48932b.m59782a(bitmap, false);
        m59741a();
    }

    /* renamed from: a */
    public void m59745a(ScaleType scaleType) {
        this.f48936f = scaleType;
        this.f48932b.m59784a(scaleType);
        this.f48932b.m59781a();
        this.f48935e = null;
        m59741a();
    }

    /* renamed from: a */
    public void m59746a(Rotation rotation) {
        this.f48932b.m59785a(rotation);
    }

    /* renamed from: b */
    public void m59749b() {
        this.f48932b.m59781a();
        this.f48935e = null;
        m59741a();
    }

    /* renamed from: a */
    public void m59743a(Uri uri) {
        new C17537c(this, this, uri).execute(new Void[null]);
    }

    /* renamed from: a */
    public void m59744a(File file) {
        new C17536a(this, this, file).execute(new Void[null]);
    }

    /* renamed from: c */
    public Bitmap m59750c() {
        return m59748b(this.f48935e);
    }

    /* renamed from: b */
    public Bitmap m59748b(Bitmap bitmap) {
        if (this.f48933c != null) {
            this.f48932b.m59781a();
            this.f48932b.m59783a(new C157791(this));
            synchronized (this.f48934d) {
                m59741a();
                try {
                    this.f48934d.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        C15790c c15790c = new C15790c(this.f48934d);
        c15790c.m59786a(Rotation.NORMAL, this.f48932b.m59790d(), this.f48932b.m59791e());
        c15790c.m59784a(this.f48936f);
        C15792e c15792e = new C15792e(bitmap.getWidth(), bitmap.getHeight());
        c15792e.m59799a(c15790c);
        c15790c.m59782a(bitmap, false);
        bitmap = c15792e.m59798a();
        this.f48934d.m59761d();
        c15790c.m59781a();
        c15792e.m59800b();
        this.f48932b.m59787a(this.f48934d);
        if (this.f48935e != null) {
            this.f48932b.m59782a(this.f48935e, false);
        }
        m59741a();
        return bitmap;
    }

    /* renamed from: d */
    private int m59736d() {
        if (this.f48932b != null && this.f48932b.m59788b() != 0) {
            return this.f48932b.m59788b();
        }
        if (this.f48935e != null) {
            return this.f48935e.getWidth();
        }
        return ((WindowManager) this.f48931a.getSystemService("window")).getDefaultDisplay().getWidth();
    }

    /* renamed from: e */
    private int m59738e() {
        if (this.f48932b != null && this.f48932b.m59789c() != 0) {
            return this.f48932b.m59789c();
        }
        if (this.f48935e != null) {
            return this.f48935e.getHeight();
        }
        return ((WindowManager) this.f48931a.getSystemService("window")).getDefaultDisplay().getHeight();
    }
}
