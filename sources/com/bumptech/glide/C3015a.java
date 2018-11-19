package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.model.C1037f;
import com.bumptech.glide.load.resource.bitmap.C3082c;
import com.bumptech.glide.load.resource.bitmap.C3083e;
import com.bumptech.glide.load.resource.bitmap.C3085g;
import com.bumptech.glide.load.resource.bitmap.C3090n;
import com.bumptech.glide.provider.LoadProvider;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.animation.GlideAnimationFactory;
import com.bumptech.glide.request.target.Target;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.a */
public class C3015a<ModelType, TranscodeType> extends C0990e<ModelType, C1037f, Bitmap, TranscodeType> {
    /* renamed from: g */
    private final BitmapPool f9399g;
    /* renamed from: h */
    private C3083e f9400h = C3083e.f9541a;
    /* renamed from: i */
    private DecodeFormat f9401i;
    /* renamed from: j */
    private ResourceDecoder<InputStream, Bitmap> f9402j;
    /* renamed from: k */
    private ResourceDecoder<ParcelFileDescriptor, Bitmap> f9403k;

    /* renamed from: b */
    public /* synthetic */ C0990e mo1237b(int i, int i2) {
        return m11786a(i, i2);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1238b(Drawable drawable) {
        return m11787a(drawable);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1239b(Priority priority) {
        return m11788a(priority);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1240b(C0990e c0990e) {
        return m11790a(c0990e);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1241b(Encoder encoder) {
        return m11791a(encoder);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1242b(Key key) {
        return m11792a(key);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1243b(ResourceDecoder resourceDecoder) {
        return m11793a(resourceDecoder);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1244b(DiskCacheStrategy diskCacheStrategy) {
        return m11794a(diskCacheStrategy);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1245b(RequestListener requestListener) {
        return m11795a(requestListener);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1246b(GlideAnimationFactory glideAnimationFactory) {
        return m11796a(glideAnimationFactory);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1247b(Object obj) {
        return m11797a(obj);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1248b(boolean z) {
        return m11798a(z);
    }

    /* renamed from: b */
    public /* synthetic */ C0990e mo1249b(Transformation[] transformationArr) {
        return m11799a(transformationArr);
    }

    /* renamed from: c */
    public /* synthetic */ C0990e mo1250c(int i) {
        return m11803b(i);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m11821e();
    }

    /* renamed from: d */
    public /* synthetic */ C0990e mo1252d(int i) {
        return m11785a(i);
    }

    /* renamed from: h */
    public /* synthetic */ C0990e mo1255h() {
        return m11821e();
    }

    /* renamed from: i */
    public /* synthetic */ C0990e mo1256i() {
        return m11817c();
    }

    /* renamed from: j */
    public /* synthetic */ C0990e mo1257j() {
        return m11819d();
    }

    C3015a(LoadProvider<ModelType, C1037f, Bitmap, TranscodeType> loadProvider, Class<TranscodeType> cls, C0990e<ModelType, ?, ?, ?> c0990e) {
        super(loadProvider, cls, c0990e);
        this.f9399g = c0990e.f2692c.m3490a();
        this.f9401i = c0990e.f2692c.m3502h();
        this.f9402j = new C3090n(this.f9399g, this.f9401i);
        this.f9403k = new C3085g(this.f9399g, this.f9401i);
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11789a(C3015a<?, TranscodeType> c3015a) {
        super.mo1240b((C0990e) c3015a);
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11793a(ResourceDecoder<C1037f, Bitmap> resourceDecoder) {
        super.mo1243b((ResourceDecoder) resourceDecoder);
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11788a(Priority priority) {
        super.mo1239b(priority);
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11800a(C3082c... c3082cArr) {
        super.mo1249b((Transformation[]) c3082cArr);
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> mo1235a() {
        return m11800a(this.c.m3497c());
    }

    /* renamed from: b */
    public C3015a<ModelType, TranscodeType> m11802b() {
        return m11800a(this.c.m3498d());
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11799a(Transformation<Bitmap>... transformationArr) {
        super.mo1249b((Transformation[]) transformationArr);
        return this;
    }

    /* renamed from: c */
    public C3015a<ModelType, TranscodeType> m11817c() {
        super.mo1256i();
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11796a(GlideAnimationFactory<TranscodeType> glideAnimationFactory) {
        super.mo1246b((GlideAnimationFactory) glideAnimationFactory);
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11785a(int i) {
        super.mo1252d(i);
        return this;
    }

    /* renamed from: b */
    public C3015a<ModelType, TranscodeType> m11803b(int i) {
        super.mo1250c(i);
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11787a(Drawable drawable) {
        super.mo1238b(drawable);
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11795a(RequestListener<? super ModelType, TranscodeType> requestListener) {
        super.mo1245b((RequestListener) requestListener);
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11798a(boolean z) {
        super.mo1248b(z);
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11794a(DiskCacheStrategy diskCacheStrategy) {
        super.mo1244b(diskCacheStrategy);
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11786a(int i, int i2) {
        super.mo1237b(i, i2);
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11790a(C0990e<?, ?, ?, TranscodeType> c0990e) {
        super.mo1240b((C0990e) c0990e);
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11791a(Encoder<C1037f> encoder) {
        super.mo1241b((Encoder) encoder);
        return this;
    }

    /* renamed from: d */
    public C3015a<ModelType, TranscodeType> m11819d() {
        super.mo1257j();
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11792a(Key key) {
        super.mo1242b(key);
        return this;
    }

    /* renamed from: a */
    public C3015a<ModelType, TranscodeType> m11797a(ModelType modelType) {
        super.mo1247b((Object) modelType);
        return this;
    }

    /* renamed from: e */
    public C3015a<ModelType, TranscodeType> m11821e() {
        return (C3015a) super.mo1255h();
    }

    /* renamed from: a */
    public Target<TranscodeType> mo1236a(ImageView imageView) {
        return super.mo1236a(imageView);
    }

    /* renamed from: f */
    void mo1253f() {
        m11802b();
    }

    /* renamed from: g */
    void mo1254g() {
        mo1235a();
    }
}
