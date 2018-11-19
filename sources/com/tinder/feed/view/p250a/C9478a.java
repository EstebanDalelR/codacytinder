package com.tinder.feed.view.p250a;

import com.tinder.chat.view.model.C10638f;
import com.tinder.chat.view.model.C8499q;
import com.tinder.chat.view.model.PhotoMediaViewModel;
import com.tinder.chat.view.model.ak;
import com.tinder.feed.view.FeedCarouselView.C9474a;
import com.tinder.feed.view.media.C9521l.C9520b;
import com.tinder.feed.view.media.FeedInstagramMediaView.C9506b;
import com.tinder.feed.view.model.C13282k;
import com.tinder.feed.view.model.C13284m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005¨\u0006\u0006"}, d2 = {"toFeedCarouselViewModel", "Lcom/tinder/feed/view/FeedCarouselView$FeedCarouselViewModel;", "Lcom/tinder/feed/view/media/FeedInstagramMediaView$FeedInstagramMediaViewModel;", "Lcom/tinder/feed/view/media/FeedSpotifyTopArtistMediaView$FeedSpotifyTopArtistViewModel;", "Lcom/tinder/feed/view/model/NewMatchFeedViewModel;", "Lcom/tinder/feed/view/model/ProfileAddPhotoFeedViewModel;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.a.a */
public final class C9478a {
    @NotNull
    /* renamed from: a */
    public static final C9474a m39642a(@NotNull C9520b c9520b) {
        C2668g.b(c9520b, "$receiver");
        String a = c9520b.m39780a();
        Iterable<ak> b = c9520b.m39781b();
        Collection arrayList = new ArrayList(C19301m.a(b, 10));
        for (ak a2 : b) {
            arrayList.add(a2.m36349a());
        }
        return new C9474a(a, (List) arrayList);
    }

    @NotNull
    /* renamed from: a */
    public static final C9474a m39641a(@NotNull C9506b c9506b) {
        C2668g.b(c9506b, "$receiver");
        String a = c9506b.m39758a();
        Iterable<C8499q> b = c9506b.m39759b();
        Collection arrayList = new ArrayList(C19301m.a(b, 10));
        for (C8499q a2 : b) {
            arrayList.add(a2.m36419a());
        }
        return new C9474a(a, (List) arrayList);
    }

    @NotNull
    /* renamed from: a */
    public static final C9474a m39643a(@NotNull C13282k c13282k) {
        C2668g.b(c13282k, "$receiver");
        String id = c13282k.getId();
        Iterable<PhotoMediaViewModel> c = c13282k.mo11143e().m39805c();
        Collection arrayList = new ArrayList(C19301m.a(c, 10));
        for (PhotoMediaViewModel id2 : c) {
            arrayList.add(id2.getId());
        }
        return new C9474a(id, (List) arrayList);
    }

    @NotNull
    /* renamed from: a */
    public static final C9474a m39644a(@NotNull C13284m c13284m) {
        C2668g.b(c13284m, "$receiver");
        String id = c13284m.getId();
        Iterable<C10638f> c = c13284m.m51404g().m42915c();
        Collection arrayList = new ArrayList(C19301m.a(c, 10));
        for (C10638f id2 : c) {
            arrayList.add(id2.getId());
        }
        return new C9474a(id, (List) arrayList);
    }
}
