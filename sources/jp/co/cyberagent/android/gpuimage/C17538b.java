package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.b */
public class C17538b extends C15785a {
    /* renamed from: g */
    private int f54700g;
    /* renamed from: h */
    private int f54701h;
    /* renamed from: i */
    private float f54702i = 1.0f;
    /* renamed from: j */
    private int f54703j;

    public C17538b() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "precision highp float;\nvarying vec2 textureCoordinate;\nuniform float imageWidthFactor;\nuniform float imageHeightFactor;\nuniform sampler2D inputImageTexture;\nuniform float pixel;\nvoid main()\n{\n  vec2 uv  = textureCoordinate.xy;\n  float dx = pixel * imageWidthFactor;\n  float dy = pixel * imageHeightFactor;\n  vec2 coord = vec2(dx * floor(uv.x / dx), dy * floor(uv.y / dy));\n  vec3 tc = texture2D(inputImageTexture, coord).xyz;\n  gl_FragColor = vec4(tc, 1.0);\n}");
    }

    /* renamed from: b */
    public void mo13013b() {
        super.mo13013b();
        this.f54700g = GLES20.glGetUniformLocation(m59765h(), "imageWidthFactor");
        this.f54701h = GLES20.glGetUniformLocation(m59765h(), "imageHeightFactor");
        this.f54703j = GLES20.glGetUniformLocation(m59765h(), "pixel");
        m64131a(this.f54702i);
    }

    /* renamed from: a */
    public void mo13012a(int i, int i2) {
        super.mo13012a(i, i2);
        m59755a(this.f54700g, (float) 1065353216 / ((float) i));
        m59755a(this.f54701h, 1.0f / ((float) i2));
    }

    /* renamed from: a */
    public void m64131a(float f) {
        this.f54702i = f;
        m59755a((int) this.f54703j, this.f54702i);
    }
}
