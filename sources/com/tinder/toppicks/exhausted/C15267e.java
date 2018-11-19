package com.tinder.toppicks.exhausted;

import android.graphics.PointF;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.recs.model.TopPickTeaserRec;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/toppicks/exhausted/TopPicksTeaserExhaustedViewModelFactory;", "", "()V", "create", "Lcom/tinder/toppicks/exhausted/TopPickTeaserExhaustedViewModel;", "index", "", "teaser", "Lcom/tinder/domain/recs/model/TopPickTeaserRec;", "width", "location", "Landroid/graphics/PointF;", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.exhausted.e */
public final class C15267e {
    @NotNull
    /* renamed from: a */
    public final C15264a m57366a(int i, @NotNull TopPickTeaserRec topPickTeaserRec, int i2, @NotNull PointF pointF) {
        C2668g.b(topPickTeaserRec, ManagerWebServices.PARAM_TEASER);
        C2668g.b(pointF, "location");
        float f = ((float) i2) * 1.44f;
        switch (i) {
            case 0:
                i = TopPicksExhaustedPosition.CENTER;
                break;
            case 1:
                i = TopPicksExhaustedPosition.LEFT;
                break;
            default:
                i = TopPicksExhaustedPosition.RIGHT;
                break;
        }
        TopPicksExhaustedPosition topPicksExhaustedPosition = i;
        topPickTeaserRec = topPickTeaserRec.getPhotos();
        if (topPickTeaserRec != null) {
            Photo photo = (Photo) C19299w.m68831g((List) topPickTeaserRec);
            if (photo != null) {
                topPickTeaserRec = photo.url();
                if (topPickTeaserRec != null) {
                    return new C15264a(topPickTeaserRec, topPicksExhaustedPosition, pointF, i2, (int) f);
                }
            }
        }
        topPickTeaserRec = "";
        return new C15264a(topPickTeaserRec, topPicksExhaustedPosition, pointF, i2, (int) f);
    }
}
