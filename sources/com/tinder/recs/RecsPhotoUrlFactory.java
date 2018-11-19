package com.tinder.recs;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.tinder.common.p077b.C2641a;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Render;
import java.util.List;
import java8.util.stream.Collectors;
import java8.util.stream.StreamSupport;
import p000a.p001a.C0001a;

public class RecsPhotoUrlFactory {
    private static final String EMPTY_PHOTO_URL = "";

    @NonNull
    public String createUrl(@NonNull Photo photo, int i, int i2) {
        List renders = photo.renders();
        if (C2641a.a(renders)) {
            i = photo.url();
            if (TextUtils.isEmpty(i) != 0) {
                C0001a.d("Rec has an empty photo url: %s", new Object[]{photo});
            }
            if (i == 0) {
                i = "";
            }
            return i;
        }
        photo = findBestRenderMatch(renders, i, i2);
        if (photo != null) {
            i = photo.url();
        } else {
            i = ((Render) getSortedRenders(renders).get(renders.size() - 1)).url();
        }
        if (TextUtils.isEmpty(i) != 0) {
            C0001a.d("Rec has an empty 'best fit' render url: %s", new Object[]{photo});
        }
        if (i == 0) {
            i = "";
        }
        return i;
    }

    @Nullable
    private Render findBestRenderMatch(@NonNull List<Render> list, int i, int i2) {
        list = StreamSupport.m59708a(getSortedRenders(list)).filter(new RecsPhotoUrlFactory$$Lambda$0(i, i2)).findFirst();
        return list.m59132c() != 0 ? (Render) list.m59127b() : null;
    }

    static final /* synthetic */ boolean lambda$findBestRenderMatch$0$RecsPhotoUrlFactory(int i, int i2, Render render) {
        return render.width() >= i && render.height() >= i2;
    }

    private List<Render> getSortedRenders(@NonNull List<Render> list) {
        return (List) StreamSupport.m59708a(list).sorted(RecsPhotoUrlFactory$$Lambda$1.$instance).collect(Collectors.m59434a());
    }

    static final /* synthetic */ int lambda$getSortedRenders$1$RecsPhotoUrlFactory(Render render, Render render2) {
        if (render.height() == render2.height()) {
            return null;
        }
        return render.height() < render2.height() ? -1 : true;
    }
}
