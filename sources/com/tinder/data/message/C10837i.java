package com.tinder.data.message;

import com.tinder.common.function.Mapper;
import com.tinder.domain.message.Gif;
import com.tinder.domain.message.Gif.Provider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tinder/data/message/GiphyUrlToGifMapper;", "Lcom/tinder/common/function/Mapper;", "", "Lcom/tinder/domain/message/Gif;", "()V", "extractDimensionsFromUrl", "Lkotlin/Pair;", "", "httpUrl", "Lokhttp3/HttpUrl;", "extractGifIdFromUrl", "map", "apiUrl", "Companion", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.i */
public final class C10837i implements Mapper<String, Gif> {
    @Deprecated
    /* renamed from: a */
    public static final C8694a f35450a = new C8694a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/data/message/GiphyUrlToGifMapper$Companion;", "", "()V", "PARAM_HEIHT", "", "PARAM_WIDTH", "PATH_SEGMENT_ID_INDEX", "", "PATH_TOTAL_SEGMENTS", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.i$a */
    private static final class C8694a {
        private C8694a() {
        }
    }

    public /* synthetic */ Object map(Object obj) {
        return m43289a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public Gif m43289a(@NotNull String str) {
        C2668g.b(str, "apiUrl");
        HttpUrl f = HttpUrl.f(str);
        if (f == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Malformed URL received: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        Pair a = m43287a(f);
        return new Gif(m43288b(f), Provider.GIPHY, str, ((Number) a.c()).intValue(), ((Number) a.d()).intValue());
    }

    /* renamed from: a */
    private final Pair<Integer, Integer> m43287a(HttpUrl httpUrl) {
        String c = httpUrl.c("width");
        if (c == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("width param is missing from url ");
            stringBuilder.append(httpUrl);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        String c2 = httpUrl.c("height");
        if (c2 != null) {
            return new Pair(Integer.valueOf(Integer.parseInt(c)), Integer.valueOf(Integer.parseInt(c2)));
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("height param is missing from url ");
        stringBuilder.append(httpUrl);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    /* renamed from: b */
    private final String m43288b(HttpUrl httpUrl) {
        httpUrl = httpUrl.k();
        if ((httpUrl.size() == 3 ? 1 : null) == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Giphy URL expected to have 3 path segments but ");
            stringBuilder.append("actually received ");
            stringBuilder.append(httpUrl);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        httpUrl = httpUrl.get(1);
        C2668g.a(httpUrl, "pathSegments[PATH_SEGMENT_ID_INDEX]");
        return (String) httpUrl;
    }
}
