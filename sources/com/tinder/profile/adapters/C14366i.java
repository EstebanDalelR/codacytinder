package com.tinder.profile.adapters;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Render;
import com.tinder.domain.common.model.Photo.Video;
import com.tinder.model.ProfilePhoto;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/profile/adapters/LegacyProfilePhotoAdapter;", "", "processedPhotoAdapter", "Lcom/tinder/profile/adapters/LegacyProcessedPhotoAdapter;", "processedVideoAdapter", "Lcom/tinder/profile/adapters/LegacyProcessedVideoAdapter;", "(Lcom/tinder/profile/adapters/LegacyProcessedPhotoAdapter;Lcom/tinder/profile/adapters/LegacyProcessedVideoAdapter;)V", "fromPhoto", "Lcom/tinder/model/ProfilePhoto;", "photo", "Lcom/tinder/domain/common/model/Photo;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profile.adapters.i */
public final class C14366i {
    /* renamed from: a */
    private final C14364e f45563a;
    /* renamed from: b */
    private final C14365g f45564b;

    @Inject
    public C14366i(@NotNull C14364e c14364e, @NotNull C14365g c14365g) {
        C2668g.b(c14364e, "processedPhotoAdapter");
        C2668g.b(c14365g, "processedVideoAdapter");
        this.f45563a = c14364e;
        this.f45564b = c14365g;
    }

    @NotNull
    /* renamed from: a */
    public final ProfilePhoto m54715a(@NotNull Photo photo) {
        C2668g.b(photo, ManagerWebServices.PARAM_PHOTO);
        List<Render> renders = photo.renders();
        C2668g.a(renders, "photo.renders()");
        Collection linkedList = new LinkedList();
        for (Render render : renders) {
            C14364e c14364e = this.f45563a;
            C2668g.a(render, "it");
            linkedList.add(c14364e.m54713a(render));
        }
        LinkedList linkedList2 = (LinkedList) linkedList;
        List<Video> videos = photo.videos();
        C2668g.a(videos, "photo.videos()");
        Collection linkedList3 = new LinkedList();
        for (Video video : videos) {
            C14365g c14365g = this.f45564b;
            C2668g.a(video, "it");
            linkedList3.add(c14365g.m54714a(video));
        }
        return new ProfilePhoto(photo.url(), photo.id(), linkedList2, (LinkedList) linkedList3);
    }
}
