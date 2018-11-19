package com.tinder.loops.engine.creation;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 1, 10})
final class LoopsFileProvider$loopsCacheDir$2 extends Lambda implements Function0<File> {
    /* renamed from: a */
    final /* synthetic */ C9779c f44510a;

    LoopsFileProvider$loopsCacheDir$2(C9779c c9779c) {
        this.f44510a = c9779c;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53745a();
    }

    @NotNull
    /* renamed from: a */
    public final File m53745a() {
        File file = new File(this.f44510a.f32415c.getCacheDir(), "loops");
        file.mkdir();
        return file;
    }
}
