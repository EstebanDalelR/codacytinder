package com.tinder.recs.view.loops.presenter;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo;
import com.tinder.recs.view.loops.target.DefaultTappyLoopsCarouselTarget;
import com.tinder.recs.view.loops.target.TappyLoopsCarouselTarget;
import com.tinder.video.p444a.C15402b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/recs/view/loops/presenter/TappyLoopsCarouselViewPresenter;", "", "()V", "photos", "", "Lcom/tinder/domain/common/model/Photo;", "target", "Lcom/tinder/recs/view/loops/target/TappyLoopsCarouselTarget;", "bind", "", "userId", "", "index", "", "onDrop", "onShowPhotoAtIndex", "onTake", "tappyLoopsCarouselTarget", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public final class TappyLoopsCarouselViewPresenter {
    private List<? extends Photo> photos = C17554o.m64195a();
    private TappyLoopsCarouselTarget target = new DefaultTappyLoopsCarouselTarget();

    public final void onTake(@NotNull TappyLoopsCarouselTarget tappyLoopsCarouselTarget) {
        C2668g.b(tappyLoopsCarouselTarget, "tappyLoopsCarouselTarget");
        this.target = tappyLoopsCarouselTarget;
    }

    public final void onDrop() {
        this.target = new DefaultTappyLoopsCarouselTarget();
    }

    public final void bind(@NotNull String str, @NotNull List<? extends Photo> list, int i) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(list, "photos");
        this.photos = list;
    }

    public final void onShowPhotoAtIndex(int i) {
        Photo photo = (Photo) this.photos.get(i);
        this.target.showMedia(C15402b.m57731a(photo), C15402b.m57732b(photo));
    }
}
