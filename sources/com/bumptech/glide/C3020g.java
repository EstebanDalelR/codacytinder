package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.C3082c;
import com.bumptech.glide.load.resource.gif.C3101b;
import com.bumptech.glide.load.resource.gif.C3103e;
import com.bumptech.glide.provider.LoadProvider;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.animation.C3118a;
import com.bumptech.glide.request.animation.GlideAnimationFactory;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.g */
public class C3020g<ModelType> extends C0990e<ModelType, InputStream, C3101b, C3101b> {
    /* renamed from: b */
    public /* synthetic */ C0990e mo1237b(int i, int i2) {
        return m11880a(i, i2);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1238b(Drawable drawable) {
        return m11881a(drawable);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1239b(Priority priority) {
        return m11882a(priority);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1240b(C0990e c0990e) {
        return m11883a(c0990e);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1241b(Encoder encoder) {
        return m11884a(encoder);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1242b(Key key) {
        return m11885a(key);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1243b(ResourceDecoder resourceDecoder) {
        return m11886a(resourceDecoder);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1244b(DiskCacheStrategy diskCacheStrategy) {
        return m11887a(diskCacheStrategy);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1245b(RequestListener requestListener) {
        return m11888a(requestListener);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1246b(GlideAnimationFactory glideAnimationFactory) {
        return m11889a(glideAnimationFactory);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1247b(Object obj) {
        return m11890a(obj);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1248b(boolean z) {
        return m11891a(z);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1249b(Transformation[] transformationArr) {
        return m11892a(transformationArr);
    }

    /* renamed from: c */
    public /* synthetic */ C0990e mo1250c(int i) {
        return m11908b(i);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m11919k();
    }

    /* renamed from: d */
    public /* synthetic */ C0990e mo1252d(int i) {
        return m11879a(i);
    }

    /* renamed from: h */
    public /* synthetic */ C0990e mo1255h() {
        return m11919k();
    }

    /* renamed from: i */
    public /* synthetic */ C0990e mo1256i() {
        return m11912d();
    }

    /* renamed from: j */
    public /* synthetic */ C0990e mo1257j() {
        return m11913e();
    }

    C3020g(LoadProvider<ModelType, InputStream, C3101b, C3101b> loadProvider, Class<C3101b> cls, C0990e<ModelType, ?, ?, ?> c0990e) {
        super(loadProvider, cls, c0990e);
    }

    /* renamed from: a */
    public C3020g<ModelType> m11883a(C0990e<?, ?, ?, C3101b> c0990e) {
        super.mo1240b((C0990e) c0990e);
        return this;
    }

    /* renamed from: a */
    public C3020g<ModelType> m11886a(ResourceDecoder<InputStream, C3101b> resourceDecoder) {
        super.mo1243b((ResourceDecoder) resourceDecoder);
        return this;
    }

    /* renamed from: a */
    public C3020g<ModelType> m11882a(Priority priority) {
        super.mo1239b(priority);
        return this;
    }

    /* renamed from: a */
    public C3020g<ModelType> mo1235a() {
        return m11893a(this.c.m3497c());
    }

    /* renamed from: b */
    public C3020g<ModelType> m11907b() {
        return m11893a(this.c.m3498d());
    }

    /* renamed from: a */
    public C3020g<ModelType> m11893a(C3082c... c3082cArr) {
        return m11892a(m11877c((Transformation[]) c3082cArr));
    }

    /* renamed from: c */
    private C3103e[] m11877c(Transformation<Bitmap>[] transformationArr) {
        C3103e[] c3103eArr = new C3103e[transformationArr.length];
        for (int i = 0; i < transformationArr.length; i++) {
            c3103eArr[i] = new C3103e(transformationArr[i], this.c.m3490a());
        }
        return c3103eArr;
    }

    /* renamed from: a */
    public C3020g<ModelType> m11892a(Transformation<C3101b>... transformationArr) {
        super.mo1249b((Transformation[]) transformationArr);
        return this;
    }

    /* renamed from: c */
    public C3020g<ModelType> m11910c() {
        super.mo1246b(new C3118a());
        return this;
    }

    /* renamed from: d */
    public C3020g<ModelType> m11912d() {
        super.mo1256i();
        return this;
    }

    /* renamed from: a */
    public C3020g<ModelType> m11889a(GlideAnimationFactory<C3101b> glideAnimationFactory) {
        super.mo1246b((GlideAnimationFactory) glideAnimationFactory);
        return this;
    }

    /* renamed from: a */
    public C3020g<ModelType> m11879a(int i) {
        super.mo1252d(i);
        return this;
    }

    /* renamed from: b */
    public C3020g<ModelType> m11908b(int i) {
        super.mo1250c(i);
        return this;
    }

    /* renamed from: a */
    public C3020g<ModelType> m11881a(Drawable drawable) {
        super.mo1238b(drawable);
        return this;
    }

    /* renamed from: a */
    public C3020g<ModelType> m11888a(RequestListener<? super ModelType, C3101b> requestListener) {
        super.mo1245b((RequestListener) requestListener);
        return this;
    }

    /* renamed from: a */
    public C3020g<ModelType> m11891a(boolean z) {
        super.mo1248b(z);
        return this;
    }

    /* renamed from: a */
    public C3020g<ModelType> m11887a(DiskCacheStrategy diskCacheStrategy) {
        super.mo1244b(diskCacheStrategy);
        return this;
    }

    /* renamed from: a */
    public C3020g<ModelType> m11880a(int i, int i2) {
        super.mo1237b(i, i2);
        return this;
    }

    /* renamed from: a */
    public C3020g<ModelType> m11884a(Encoder<InputStream> encoder) {
        super.mo1241b((Encoder) encoder);
        return this;
    }

    /* renamed from: e */
    public C3020g<ModelType> m11913e() {
        super.mo1257j();
        return this;
    }

    /* renamed from: a */
    public C3020g<ModelType> m11885a(Key key) {
        super.mo1242b(key);
        return this;
    }

    /* renamed from: a */
    public C3020g<ModelType> m11890a(ModelType modelType) {
        super.mo1247b((Object) modelType);
        return this;
    }

    /* renamed from: k */
    public C3020g<ModelType> m11919k() {
        return (C3020g) super.mo1255h();
    }

    /* renamed from: f */
    void mo1253f() {
        m11907b();
    }

    /* renamed from: g */
    void mo1254g() {
        mo1235a();
    }
}
