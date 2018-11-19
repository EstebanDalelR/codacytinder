package jp.co.cyberagent.android.gpuimage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import jp.co.cyberagent.android.gpuimage.GPUImage.ScaleType;
import jp.co.cyberagent.android.gpuimage.p456a.C15784a;

@TargetApi(11)
/* renamed from: jp.co.cyberagent.android.gpuimage.c */
public class C15790c implements PreviewCallback, Renderer {
    /* renamed from: a */
    static final float[] f48970a = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    /* renamed from: b */
    public final Object f48971b = new Object();
    /* renamed from: c */
    private C15785a f48972c;
    /* renamed from: d */
    private int f48973d = -1;
    /* renamed from: e */
    private SurfaceTexture f48974e = null;
    /* renamed from: f */
    private final FloatBuffer f48975f;
    /* renamed from: g */
    private final FloatBuffer f48976g;
    /* renamed from: h */
    private IntBuffer f48977h;
    /* renamed from: i */
    private int f48978i;
    /* renamed from: j */
    private int f48979j;
    /* renamed from: k */
    private int f48980k;
    /* renamed from: l */
    private int f48981l;
    /* renamed from: m */
    private int f48982m;
    /* renamed from: n */
    private final Queue<Runnable> f48983n;
    /* renamed from: o */
    private final Queue<Runnable> f48984o;
    /* renamed from: p */
    private Rotation f48985p;
    /* renamed from: q */
    private boolean f48986q;
    /* renamed from: r */
    private boolean f48987r;
    /* renamed from: s */
    private ScaleType f48988s = ScaleType.CENTER_CROP;
    /* renamed from: t */
    private float f48989t = 0.0f;
    /* renamed from: u */
    private float f48990u = 0.0f;
    /* renamed from: v */
    private float f48991v = 0.0f;

    /* renamed from: jp.co.cyberagent.android.gpuimage.c$3 */
    class C157883 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C15790c f48966a;

        C157883(C15790c c15790c) {
            this.f48966a = c15790c;
        }

        public void run() {
            GLES20.glDeleteTextures(1, new int[]{this.f48966a.f48973d}, 0);
            this.f48966a.f48973d = -1;
        }
    }

    /* renamed from: a */
    private float m59766a(float f, float f2) {
        return f == 0.0f ? f2 : 1.0f - f2;
    }

    public C15790c(C15785a c15785a) {
        this.f48972c = c15785a;
        this.f48983n = new LinkedList();
        this.f48984o = new LinkedList();
        this.f48975f = ByteBuffer.allocateDirect(f48970a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f48975f.put(f48970a).position(0);
        this.f48976g = ByteBuffer.allocateDirect(C15784a.f48946a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        m59786a(Rotation.NORMAL, false, false);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(this.f48989t, this.f48990u, this.f48991v, 1.0f);
        GLES20.glDisable(2929);
        this.f48972c.m59754a();
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f48978i = i;
        this.f48979j = i2;
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glUseProgram(this.f48972c.m59765h());
        this.f48972c.mo13012a(i, i2);
        m59779f();
        synchronized (this.f48971b) {
            this.f48971b.notifyAll();
        }
    }

    public void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        m59770a(this.f48983n);
        this.f48972c.m59757a(this.f48973d, this.f48975f, this.f48976g);
        m59770a(this.f48984o);
        if (this.f48974e != null) {
            this.f48974e.updateTexImage();
        }
    }

    /* renamed from: a */
    private void m59770a(Queue<Runnable> queue) {
        synchronized (queue) {
            while (!queue.isEmpty()) {
                ((Runnable) queue.poll()).run();
            }
        }
    }

    public void onPreviewFrame(final byte[] bArr, final Camera camera) {
        final Size previewSize = camera.getParameters().getPreviewSize();
        if (this.f48977h == null) {
            this.f48977h = IntBuffer.allocate(previewSize.width * previewSize.height);
        }
        if (this.f48983n.isEmpty()) {
            m59783a(new Runnable(this) {
                /* renamed from: d */
                final /* synthetic */ C15790c f48963d;

                public void run() {
                    GPUImageNativeLibrary.YUVtoRBGA(bArr, previewSize.width, previewSize.height, this.f48963d.f48977h.array());
                    this.f48963d.f48973d = C15791d.m59795a(this.f48963d.f48977h, previewSize, this.f48963d.f48973d);
                    camera.addCallbackBuffer(bArr);
                    if (this.f48963d.f48980k != previewSize.width) {
                        this.f48963d.f48980k = previewSize.width;
                        this.f48963d.f48981l = previewSize.height;
                        this.f48963d.m59779f();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void m59787a(final C15785a c15785a) {
        m59783a(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C15790c f48965b;

            public void run() {
                C15785a e = this.f48965b.f48972c;
                this.f48965b.f48972c = c15785a;
                if (e != null) {
                    e.m59761d();
                }
                this.f48965b.f48972c.m59754a();
                GLES20.glUseProgram(this.f48965b.f48972c.m59765h());
                this.f48965b.f48972c.mo13012a(this.f48965b.f48978i, this.f48965b.f48979j);
            }
        });
    }

    /* renamed from: a */
    public void m59781a() {
        m59783a(new C157883(this));
    }

    /* renamed from: a */
    public void m59782a(final Bitmap bitmap, final boolean z) {
        if (bitmap != null) {
            m59783a(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ C15790c f48969c;

                public void run() {
                    Bitmap createBitmap;
                    if (bitmap.getWidth() % 2 == 1) {
                        createBitmap = Bitmap.createBitmap(bitmap.getWidth() + 1, bitmap.getHeight(), Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.drawARGB(0, 0, 0, 0);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
                        this.f48969c.f48982m = 1;
                    } else {
                        this.f48969c.f48982m = 0;
                        createBitmap = null;
                    }
                    this.f48969c.f48973d = C15791d.m59792a(createBitmap != null ? createBitmap : bitmap, this.f48969c.f48973d, z);
                    if (createBitmap != null) {
                        createBitmap.recycle();
                    }
                    this.f48969c.f48980k = bitmap.getWidth();
                    this.f48969c.f48981l = bitmap.getHeight();
                    this.f48969c.m59779f();
                }
            });
        }
    }

    /* renamed from: a */
    public void m59784a(ScaleType scaleType) {
        this.f48988s = scaleType;
    }

    /* renamed from: b */
    protected int m59788b() {
        return this.f48978i;
    }

    /* renamed from: c */
    protected int m59789c() {
        return this.f48979j;
    }

    /* renamed from: f */
    private void m59779f() {
        float[] fArr;
        float f = (float) this.f48978i;
        float f2 = (float) this.f48979j;
        if (this.f48985p == Rotation.ROTATION_270 || this.f48985p == Rotation.ROTATION_90) {
            f = (float) this.f48979j;
            f2 = (float) this.f48978i;
        }
        float max = Math.max(f / ((float) this.f48980k), f2 / ((float) this.f48981l));
        float round = ((float) Math.round(((float) this.f48980k) * max)) / f;
        f = ((float) Math.round(((float) this.f48981l) * max)) / f2;
        float[] fArr2 = f48970a;
        float[] a = C15784a.m59753a(this.f48985p, this.f48986q, this.f48987r);
        if (this.f48988s == ScaleType.CENTER_CROP) {
            round = (1.0f - (1.0f / round)) / 2.0f;
            float f3 = (1.0f - (1.0f / f)) / 2.0f;
            fArr = new float[]{m59766a(a[0], round), m59766a(a[1], f3), m59766a(a[2], round), m59766a(a[3], f3), m59766a(a[4], round), m59766a(a[5], f3), m59766a(a[6], round), m59766a(a[7], f3)};
        } else {
            fArr2 = new float[]{f48970a[0] / f, f48970a[1] / round, f48970a[2] / f, f48970a[3] / round, f48970a[4] / f, f48970a[5] / round, f48970a[6] / f, f48970a[7] / round};
            fArr = a;
        }
        this.f48975f.clear();
        this.f48975f.put(fArr2).position(0);
        this.f48976g.clear();
        this.f48976g.put(fArr).position(0);
    }

    /* renamed from: a */
    public void m59785a(Rotation rotation) {
        this.f48985p = rotation;
        m59779f();
    }

    /* renamed from: a */
    public void m59786a(Rotation rotation, boolean z, boolean z2) {
        this.f48986q = z;
        this.f48987r = z2;
        m59785a(rotation);
    }

    /* renamed from: d */
    public boolean m59790d() {
        return this.f48986q;
    }

    /* renamed from: e */
    public boolean m59791e() {
        return this.f48987r;
    }

    /* renamed from: a */
    protected void m59783a(Runnable runnable) {
        synchronized (this.f48983n) {
            this.f48983n.add(runnable);
        }
    }
}
