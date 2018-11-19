package com.tinder.ads;

import android.content.Context;
import com.tinder.ads.source.dfp.NativeDfpSource.Builder;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/ads/NativeDfpSourceBuilderFactory;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "newBuilder", "Lcom/tinder/ads/source/dfp/NativeDfpSource$Builder;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class NativeDfpSourceBuilderFactory {
    private final Context context;

    public NativeDfpSourceBuilderFactory(@NotNull Context context) {
        C2668g.b(context, "context");
        this.context = context;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this.context);
    }
}
