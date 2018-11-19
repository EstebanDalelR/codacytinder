package com.tinder.video.factory;

import android.content.Context;
import com.google.android.exoplayer2.upstream.C3722e;
import com.google.android.exoplayer2.upstream.C3724g;
import com.google.android.exoplayer2.upstream.C4388i;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.cache.C3719i;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.video.C15407a.C15399f;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/tinder/video/factory/VideoCacheDataSourceFactory;", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "defaultDatasourceFactory", "Lcom/google/android/exoplayer2/upstream/DefaultDataSourceFactory;", "simpleCache", "Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;", "getSimpleCache", "()Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;", "simpleCache$delegate", "Lkotlin/Lazy;", "createDataSource", "Lcom/google/android/exoplayer2/upstream/DataSource;", "video_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.video.factory.a */
public final class C17249a implements Factory {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f52861a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(C17249a.class), "simpleCache", "getSimpleCache()Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;"))};
    /* renamed from: b */
    private final C3724g f52862b;
    /* renamed from: c */
    private final Lazy f52863c;

    /* renamed from: a */
    private final C3719i m63160a() {
        Lazy lazy = this.f52863c;
        KProperty kProperty = f52861a[0];
        return (C3719i) lazy.getValue();
    }

    public C17249a(@NotNull Context context) {
        C2668g.b(context, "context");
        this.f52863c = C15810e.m59833a(new VideoCacheDataSourceFactory$simpleCache$2(context));
        TransferListener c3722e = new C3722e();
        this.f52862b = new C3724g(context, c3722e, new C4388i(C2314v.a(context, context.getString(C15399f.app_name)), c3722e));
    }

    @NotNull
    public DataSource createDataSource() {
        return new CacheDataSource(m63160a(), this.f52862b.a(), new FileDataSource(), new CacheDataSink(m63160a(), 5242880), 3, null);
    }
}
