package com.tinder.api.model.fastmatch.adapter;

import com.tinder.api.model.fastmatch.FastMatchPreviewResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15957l;
import okhttp3.C15968t;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\t"}, d2 = {"Lcom/tinder/api/model/fastmatch/adapter/FastMatchPreviewResponseAdapter;", "", "()V", "fromApi", "Lcom/tinder/api/model/fastmatch/FastMatchPreviewResponse;", "apiResponse", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "Companion", "api_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchPreviewResponseAdapter {
    public static final Companion Companion = new Companion();
    private static final String PREVIEW_HEADER_COUNT = "fast-match-count";
    private static final String PREVIEW_HEADER_IS_RANGE = "is-range";

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/api/model/fastmatch/adapter/FastMatchPreviewResponseAdapter$Companion;", "", "()V", "PREVIEW_HEADER_COUNT", "", "PREVIEW_HEADER_IS_RANGE", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    @NotNull
    public final FastMatchPreviewResponse fromApi(@NotNull Response<C15968t> response) {
        boolean parseBoolean;
        C2668g.b(response, "apiResponse");
        C15957l headers = response.headers();
        C15968t c15968t = (C15968t) response.body();
        String str = null;
        response = c15968t != null ? c15968t.bytes() : null;
        if (headers != null) {
            String a = headers.a(PREVIEW_HEADER_IS_RANGE);
            if (a != null) {
                parseBoolean = Boolean.parseBoolean(a);
                if (headers != null) {
                    str = headers.a(PREVIEW_HEADER_COUNT);
                }
                return new FastMatchPreviewResponse(response, parseBoolean, Integer.parseInt(str));
            }
        }
        parseBoolean = false;
        if (headers != null) {
            str = headers.a(PREVIEW_HEADER_COUNT);
        }
        return new FastMatchPreviewResponse(response, parseBoolean, Integer.parseInt(str));
    }
}
