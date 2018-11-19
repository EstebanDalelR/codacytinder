package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.C1037f;
import com.bumptech.glide.load.resource.bitmap.C3082c;
import com.bumptech.glide.load.resource.p028a.C1041b;
import com.bumptech.glide.load.resource.p030c.C1049a;
import com.bumptech.glide.load.resource.p030c.C3095f;
import com.bumptech.glide.manager.C1064i;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.provider.LoadProvider;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.animation.C3118a;
import com.bumptech.glide.request.animation.GlideAnimationFactory;
import com.bumptech.glide.request.target.Target;

/* renamed from: com.bumptech.glide.c */
public class C3018c<ModelType> extends C0990e<ModelType, C1037f, C1049a, C1041b> {
    /* renamed from: b */
    public /* synthetic */ C0990e mo1237b(int i, int i2) {
        return m11830a(i, i2);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1238b(Drawable drawable) {
        return m11831a(drawable);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1239b(Priority priority) {
        return m11832a(priority);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1240b(C0990e c0990e) {
        return m11834a(c0990e);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1241b(Encoder encoder) {
        return m11835a(encoder);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1242b(Key key) {
        return m11836a(key);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1243b(ResourceDecoder resourceDecoder) {
        return m11837a(resourceDecoder);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1244b(DiskCacheStrategy diskCacheStrategy) {
        return m11838a(diskCacheStrategy);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1245b(RequestListener requestListener) {
        return m11839a(requestListener);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1246b(GlideAnimationFactory glideAnimationFactory) {
        return m11840a(glideAnimationFactory);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1247b(Object obj) {
        return m11841a(obj);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1248b(boolean z) {
        return m11842a(z);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1249b(Transformation[] transformationArr) {
        return m11862c(transformationArr);
    }

    /* renamed from: c */
    public /* synthetic */ C0990e mo1250c(int i) {
        return m11847b(i);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m11872k();
    }

    /* renamed from: d */
    public /* synthetic */ C0990e mo1252d(int i) {
        return m11829a(i);
    }

    /* renamed from: h */
    public /* synthetic */ C0990e mo1255h() {
        return m11872k();
    }

    /* renamed from: i */
    public /* synthetic */ C0990e mo1256i() {
        return m11864d();
    }

    /* renamed from: j */
    public /* synthetic */ C0990e mo1257j() {
        return m11866e();
    }

    C3018c(Context context, Class<ModelType> cls, LoadProvider<ModelType, C1037f, C1049a, C1041b> loadProvider, C0994i c0994i, C1064i c1064i, Lifecycle lifecycle) {
        super(context, cls, loadProvider, C1041b.class, c0994i, c1064i, lifecycle);
        m11861c();
    }

    /* renamed from: a */
    public C3018c<ModelType> m11833a(C3018c<?> c3018c) {
        super.mo1240b((C0990e) c3018c);
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11834a(C0990e<?, ?, ?, C1041b> c0990e) {
        super.mo1240b((C0990e) c0990e);
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11837a(ResourceDecoder<C1037f, C1049a> resourceDecoder) {
        super.mo1243b((ResourceDecoder) resourceDecoder);
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11832a(Priority priority) {
        super.mo1239b(priority);
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11844a(C3082c... c3082cArr) {
        return m11843a((Transformation[]) c3082cArr);
    }

    /* renamed from: a */
    public C3018c<ModelType> mo1235a() {
        return m11862c(this.c.m3499e());
    }

    /* renamed from: b */
    public C3018c<ModelType> m11846b() {
        return m11862c(this.c.m3500f());
    }

    /* renamed from: a */
    public C3018c<ModelType> m11843a(Transformation<Bitmap>... transformationArr) {
        Transformation[] transformationArr2 = new C3095f[transformationArr.length];
        for (int i = 0; i < transformationArr.length; i++) {
            transformationArr2[i] = new C3095f(this.c.m3490a(), transformationArr[i]);
        }
        return m11862c(transformationArr2);
    }

    /* renamed from: c */
    public C3018c<ModelType> m11862c(Transformation<C1049a>... transformationArr) {
        super.mo1249b((Transformation[]) transformationArr);
        return this;
    }

    /* renamed from: c */
    public final C3018c<ModelType> m11861c() {
        super.mo1246b(new C3118a());
        return this;
    }

    /* renamed from: d */
    public C3018c<ModelType> m11864d() {
        super.mo1256i();
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11840a(GlideAnimationFactory<C1041b> glideAnimationFactory) {
        super.mo1246b((GlideAnimationFactory) glideAnimationFactory);
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11829a(int i) {
        super.mo1252d(i);
        return this;
    }

    /* renamed from: b */
    public C3018c<ModelType> m11847b(int i) {
        super.mo1250c(i);
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11831a(Drawable drawable) {
        super.mo1238b(drawable);
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11839a(RequestListener<? super ModelType, C1041b> requestListener) {
        super.mo1245b((RequestListener) requestListener);
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11838a(DiskCacheStrategy diskCacheStrategy) {
        super.mo1244b(diskCacheStrategy);
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11842a(boolean z) {
        super.mo1248b(z);
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11830a(int i, int i2) {
        super.mo1237b(i, i2);
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11835a(Encoder<C1037f> encoder) {
        super.mo1241b((Encoder) encoder);
        return this;
    }

    /* renamed from: e */
    public C3018c<ModelType> m11866e() {
        super.mo1257j();
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11836a(Key key) {
        super.mo1242b(key);
        return this;
    }

    /* renamed from: a */
    public C3018c<ModelType> m11841a(ModelType modelType) {
        super.mo1247b((Object) modelType);
        return this;
    }

    /* renamed from: k */
    public C3018c<ModelType> m11872k() {
        return (C3018c) super.mo1255h();
    }

    /* renamed from: a */
    public Target<C1041b> mo1236a(ImageView imageView) {
        return super.mo1236a(imageView);
    }

    /* renamed from: f */
    void mo1253f() {
        m11846b();
    }

    /* renamed from: g */
    void mo1254g() {
        mo1235a();
    }
}
