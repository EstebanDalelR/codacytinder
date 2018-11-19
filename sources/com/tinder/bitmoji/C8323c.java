package com.tinder.bitmoji;

import android.content.Context;
import com.snapchat.kit.sdk.Bitmoji;
import com.snapchat.kit.sdk.bitmoji.networking.FetchAvatarUrlCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/bitmoji/BitmojiWrapper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "fetchAvatarUrl", "", "fetchAvatarUrlCallback", "Lcom/snapchat/kit/sdk/bitmoji/networking/FetchAvatarUrlCallback;", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.c */
public final class C8323c {
    /* renamed from: a */
    private final Context f29606a;

    public C8323c(@NotNull Context context) {
        C2668g.b(context, "context");
        this.f29606a = context;
    }

    /* renamed from: a */
    public final void m35436a(@NotNull FetchAvatarUrlCallback fetchAvatarUrlCallback) {
        C2668g.b(fetchAvatarUrlCallback, "fetchAvatarUrlCallback");
        Bitmoji.fetchAvatarUrl(this.f29606a, fetchAvatarUrlCallback);
    }
}
