package com.tinder.loops.p267a;

import android.content.Context;
import android.net.Uri;
import android.support.v4.content.FileProvider;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/loops/model/LoopsVideoUriOwner;", "", "path", "", "context", "Landroid/content/Context;", "(Ljava/lang/String;Landroid/content/Context;)V", "fileSizeInKb", "", "getFileSizeInKb", "()J", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "loops_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.a.a */
public final class C9752a {
    @NotNull
    /* renamed from: a */
    private final Uri f32373a;
    /* renamed from: b */
    private final long f32374b;

    public C9752a(@NotNull String str, @NotNull Context context) {
        C2668g.b(str, "path");
        C2668g.b(context, "context");
        File file = new File(str);
        str = FileProvider.a(context, "com.tinder.fileprovider", file);
        C2668g.a(str, "FileProvider.getUriForFi…       loopFile\n        )");
        this.f32373a = str;
        this.f32374b = file.length() / ((long) 1024);
    }
}
