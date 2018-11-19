package com.tinder.views.grid.p449a;

import android.util.LruCache;
import com.tinder.domain.common.model.Photo;
import com.tinder.recs.card.UserRecCard;
import com.tinder.scope.ActivityScope;
import com.tinder.views.grid.C15459f;
import com.tinder.views.grid.C15459f.C15458a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/views/grid/provider/UserRecPhotoAlbumProvider;", "", "()V", "albumCache", "Landroid/util/LruCache;", "", "Lcom/tinder/views/grid/UserRecPhotoAlbum;", "clear", "", "generateId", "userRecCard", "Lcom/tinder/recs/card/UserRecCard;", "width", "", "height", "getUserRecPhotoAlbum", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ActivityScope
/* renamed from: com.tinder.views.grid.a.a */
public final class C15453a {
    /* renamed from: a */
    public static final C15452a f47879a = new C15452a();
    /* renamed from: b */
    private final LruCache<String, C15459f> f47880b = new LruCache(50);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/views/grid/provider/UserRecPhotoAlbumProvider$Companion;", "", "()V", "DEFAULT_CACHE_SIZE", "", "DEFAULT_THUMBNAIL_HEIGHT", "DEFAULT_THUMBNAIL_WIDTH", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.views.grid.a.a$a */
    public static final class C15452a {
        private C15452a() {
        }
    }

    @NotNull
    /* renamed from: a */
    public final C15459f m57943a(@NotNull UserRecCard userRecCard, int i, int i2) {
        C2668g.b(userRecCard, "userRecCard");
        String b = m57942b(userRecCard, i, i2);
        C15459f c15459f = (C15459f) this.f47880b.get(b);
        if (c15459f != null) {
            return c15459f;
        }
        List photos = userRecCard.userRec().getUser().photos();
        C2668g.a(photos, "userRecCard.userRec().user.photos()");
        Iterable<Photo> iterable = photos;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        int i3 = 0;
        for (Photo photo : iterable) {
            int i4 = i3 + 1;
            String photoUrlForSize = userRecCard.photoUrlForSize(i3, i, i2);
            String photoUrlForSize2 = userRecCard.photoUrlForSize(i3, 20, 20);
            C2668g.a(photoUrlForSize, "photoUrl");
            C2668g.a(photoUrlForSize2, "thumbnailUrl");
            arrayList.add(new C15458a(photoUrlForSize, photoUrlForSize2));
            i3 = i4;
        }
        userRecCard = new C15459f(b, (List) arrayList);
        this.f47880b.put(b, userRecCard);
        return userRecCard;
    }

    /* renamed from: a */
    public final void m57944a() {
        this.f47880b.evictAll();
    }

    /* renamed from: b */
    private final String m57942b(UserRecCard userRecCard, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(userRecCard.userRec().getId());
        stringBuilder.append(" w: ");
        stringBuilder.append(i);
        stringBuilder.append(" h: ");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }
}
