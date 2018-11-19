package com.tinder.data.message.p225a;

import com.tinder.api.giphy.GiphyApiResponse.Giphy;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.message.Gif;
import com.tinder.domain.message.Gif.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0007B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/data/message/gif/GiphyDomainAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/message/Gif;", "Lcom/tinder/api/giphy/GiphyApiResponse$Giphy;", "()V", "fromApi", "giphyData", "Companion", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.a.a */
public final class C10809a extends C2646o<Gif, Giphy> {
    /* renamed from: a */
    public static final C8681a f35254a = new C8681a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/data/message/gif/GiphyDomainAdapter$Companion;", "", "()V", "TYPE_GIF", "", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.a.a$a */
    public static final class C8681a {
        private C8681a() {
        }
    }

    @Nullable
    /* renamed from: a */
    public Gif m43270a(@NotNull Giphy giphy) {
        C2668g.b(giphy, "giphyData");
        try {
            if (C2668g.a("gif", giphy.type())) {
                String id = giphy.id();
                if (id == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                giphy = giphy.images();
                if (giphy == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                giphy = giphy.fixedHeightImage();
                if (giphy == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                String url = giphy.url();
                if (url != null) {
                    return new Gif(id, Provider.GIPHY, url, giphy.width(), giphy.height());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Giphy must be a gif".toString());
        } catch (Giphy giphy2) {
            C0001a.b((Throwable) giphy2, "Error adapting giphy", new Object[0]);
            return null;
        }
    }
}
