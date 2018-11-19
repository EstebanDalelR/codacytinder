package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.util.LinkedList;

/* renamed from: jp.co.cyberagent.android.gpuimage.a */
public class C15785a {
    /* renamed from: a */
    protected int f48950a;
    /* renamed from: b */
    protected int f48951b;
    /* renamed from: c */
    protected int f48952c;
    /* renamed from: d */
    protected int f48953d;
    /* renamed from: e */
    protected int f48954e;
    /* renamed from: f */
    protected int f48955f;
    /* renamed from: g */
    private final LinkedList<Runnable> f48956g;
    /* renamed from: h */
    private final String f48957h;
    /* renamed from: i */
    private final String f48958i;
    /* renamed from: j */
    private boolean f48959j;

    /* renamed from: c */
    public void m59760c() {
    }

    /* renamed from: e */
    public void m59762e() {
    }

    /* renamed from: f */
    protected void m59763f() {
    }

    public C15785a() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public C15785a(String str, String str2) {
        this.f48956g = new LinkedList();
        this.f48957h = str;
        this.f48958i = str2;
    }

    /* renamed from: a */
    public final void m59754a() {
        mo13013b();
        this.f48959j = true;
        m59760c();
    }

    /* renamed from: b */
    public void mo13013b() {
        this.f48950a = C15791d.m59794a(this.f48957h, this.f48958i);
        this.f48951b = GLES20.glGetAttribLocation(this.f48950a, "position");
        this.f48952c = GLES20.glGetUniformLocation(this.f48950a, "inputImageTexture");
        this.f48953d = GLES20.glGetAttribLocation(this.f48950a, "inputTextureCoordinate");
        this.f48959j = true;
    }

    /* renamed from: d */
    public final void m59761d() {
        this.f48959j = false;
        GLES20.glDeleteProgram(this.f48950a);
        m59762e();
    }

    /* renamed from: a */
    public void mo13012a(int i, int i2) {
        this.f48954e = i;
        this.f48955f = i2;
    }

    /* renamed from: a */
    public void m59757a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.f48950a);
        m59764g();
        if (this.f48959j) {
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.f48951b, 2, 5126, false, 0, floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f48951b);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.f48953d, 2, 5126, false, 0, floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.f48953d);
            if (i != -1) {
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i);
                GLES20.glUniform1i(this.f48952c, 0);
            }
            m59763f();
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f48951b);
            GLES20.glDisableVertexAttribArray(this.f48953d);
            GLES20.glBindTexture(3553, 0);
        }
    }

    /* renamed from: g */
    protected void m59764g() {
        while (!this.f48956g.isEmpty()) {
            ((Runnable) this.f48956g.removeFirst()).run();
        }
    }

    /* renamed from: h */
    public int m59765h() {
        return this.f48950a;
    }

    /* renamed from: a */
    protected void m59755a(final int i, final float f) {
        m59758a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ C15785a f48944c;

            public void run() {
                GLES20.glUniform1f(i, f);
            }
        });
    }

    /* renamed from: a */
    protected void m59758a(Runnable runnable) {
        synchronized (this.f48956g) {
            this.f48956g.addLast(runnable);
        }
    }
}
