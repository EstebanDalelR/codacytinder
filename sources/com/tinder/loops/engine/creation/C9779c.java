package com.tinder.loops.engine.creation;

import android.content.Context;
import com.tinder.injection.ForApplication;
import java.io.File;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/tinder/loops/engine/creation/LoopsFileProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "loopsCacheDir", "Ljava/io/File;", "getLoopsCacheDir", "()Ljava/io/File;", "loopsCacheDir$delegate", "Lkotlin/Lazy;", "createTemporaryFile", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.creation.c */
public final class C9779c {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f32413a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C9779c.class), "loopsCacheDir", "getLoopsCacheDir()Ljava/io/File;"))};
    /* renamed from: b */
    private final Lazy f32414b = C18451c.a((Function0) new LoopsFileProvider$loopsCacheDir$2(this));
    /* renamed from: c */
    private final Context f32415c;

    /* renamed from: b */
    private final File m40335b() {
        Lazy lazy = this.f32414b;
        KProperty kProperty = f32413a[0];
        return (File) lazy.getValue();
    }

    @Inject
    public C9779c(@NotNull @ForApplication Context context) {
        C2668g.b(context, "context");
        this.f32415c = context;
    }

    @NotNull
    /* renamed from: a */
    public final File m40336a() {
        File createTempFile = File.createTempFile("loopstestvideo", ".mp4", m40335b());
        C2668g.a(createTempFile, "File.createTempFile(TEMP…EXTENSION, loopsCacheDir)");
        return createTempFile;
    }
}
