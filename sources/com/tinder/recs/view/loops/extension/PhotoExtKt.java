package com.tinder.recs.view.loops.extension;

import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Render;
import com.tinder.domain.common.model.Photo.Video;
import com.tinder.video.model.C17250a;
import com.tinder.video.model.C17251d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"imageViewModels", "", "Lcom/tinder/video/model/ImageViewModel;", "Lcom/tinder/domain/common/model/Photo;", "getImageViewModels", "(Lcom/tinder/domain/common/model/Photo;)Ljava/util/List;", "videoViewModels", "Lcom/tinder/video/model/VideoViewModel;", "getVideoViewModels", "recs-cards_release"}, k = 2, mv = {1, 1, 10})
public final class PhotoExtKt {
    @NotNull
    public static final List<C17251d> getVideoViewModels(@NotNull Photo photo) {
        C2668g.b(photo, "$receiver");
        photo = photo.videos();
        C2668g.a(photo, "videos()");
        Iterable<Video> iterable = (Iterable) photo;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Video video : iterable) {
            String url = video.url();
            C2668g.a(url, "it.url()");
            int width = video.width();
            int height = video.height();
            String url2 = video.url();
            C2668g.a(url2, "it.url()");
            arrayList.add(new C17251d(width, height, url2, url));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final List<C17250a> getImageViewModels(@NotNull Photo photo) {
        C2668g.b(photo, "$receiver");
        photo = photo.renders();
        C2668g.a(photo, "renders()");
        Iterable<Render> iterable = (Iterable) photo;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Render render : iterable) {
            String url = render.url();
            C2668g.a(url, "it.url()");
            int width = render.width();
            int height = render.height();
            String url2 = render.url();
            C2668g.a(url2, "it.url()");
            arrayList.add(new C17250a(width, height, url2, url));
        }
        return (List) arrayList;
    }
}
