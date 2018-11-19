package com.tinder.places.card.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Take;
import com.tinder.domain.common.model.Photo.Quality;
import com.tinder.domain.match.model.visitor.UserPhotoExtKt;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.places.card.target.PlaceRecTeasersTarget;
import com.tinder.places.p312g.p313a.C10211a;
import com.tinder.viewmodel.C15425d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.collections.ab;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ \u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fJ\b\u0010\u0019\u001a\u00020\nH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/tinder/places/card/presenter/PlaceRecTeasersPresenter;", "", "()V", "target", "Lcom/tinder/places/card/target/PlaceRecTeasersTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/card/target/PlaceRecTeasersTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/card/target/PlaceRecTeasersTarget;)V", "bindTeasers", "", "viewModel", "Lcom/tinder/viewmodel/PlaceRecTeasersViewModel;", "bindVisitorCounts", "totalVisitors", "", "newVisitors", "backgroundDrawable", "Lcom/tinder/places/view/util/PlacesGradientDrawable;", "onLayout", "changed", "", "onThumbnailLayout", "width", "height", "setupImageViews", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.presenter.f */
public final class C10133f {
    /* renamed from: b */
    public static final C10132a f33122b = new C10132a();
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlaceRecTeasersTarget f33123a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/places/card/presenter/PlaceRecTeasersPresenter$Companion;", "", "()V", "ADJUSTED_THUMBNAIL_ASPECT_RATIO", "", "MAX_PLACE_TEASERS", "", "mapRecsUpdateToImageUrls", "", "", "update", "Lcom/tinder/domain/recs/model/RecsUpdate;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.f$a */
    public static final class C10132a {
        private C10132a() {
        }

        @NotNull
        /* renamed from: a */
        public final List<String> m41434a(@NotNull RecsUpdate recsUpdate) {
            C2668g.b(recsUpdate, "update");
            Collection arrayList = new ArrayList();
            for (Object next : recsUpdate.getCurrentRecs()) {
                if ((((Rec) next).getType() == RecType.USER ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            Iterable<Rec> iterable = (List) arrayList;
            Collection collection = (Collection) new ArrayList(C19301m.a(iterable, 10));
            for (Rec rec : iterable) {
                if (rec == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.UserRec");
                }
                collection.add((UserRec) rec);
            }
            Iterable<UserRec> iterable2 = (List) collection;
            arrayList = new ArrayList(C19301m.a(iterable2, 10));
            for (UserRec user : iterable2) {
                arrayList.add(UserPhotoExtKt.avatarUrl(user.getUser(), Quality.S));
            }
            return C19301m.d((List) arrayList, 4);
        }
    }

    @Take
    /* renamed from: a */
    public final void m41435a() {
        PlaceRecTeasersTarget placeRecTeasersTarget = this.f33123a;
        if (placeRecTeasersTarget == null) {
            C2668g.b("target");
        }
        placeRecTeasersTarget.setImageViewCount(4);
    }

    /* renamed from: a */
    public final void m41438a(@NotNull C15425d c15425d) {
        C2668g.b(c15425d, "viewModel");
        PlaceRecTeasersTarget placeRecTeasersTarget = this.f33123a;
        if (placeRecTeasersTarget == null) {
            C2668g.b("target");
        }
        placeRecTeasersTarget.resetImageViews();
        c15425d = c15425d.a();
        Iterator it = C19068g.b(0, 4).iterator();
        while (it.hasNext()) {
            int b = ((ab) it).b();
            if (c15425d != null) {
                String str = b < c15425d.size() ? (String) c15425d.get(b) : null;
                PlaceRecTeasersTarget placeRecTeasersTarget2 = this.f33123a;
                if (placeRecTeasersTarget2 == null) {
                    C2668g.b("target");
                }
                placeRecTeasersTarget2.loadImage(b, str, 6);
            }
        }
    }

    /* renamed from: a */
    public final void m41437a(int i, int i2, @Nullable C10211a c10211a) {
        if (i > 4 && i2 > 0 && c10211a != null) {
            i = this.f33123a;
            if (i == 0) {
                C2668g.b("target");
            }
            i.applyNewVisitorsOverlay(i2, c10211a);
        }
    }

    /* renamed from: a */
    public final void m41439a(boolean z) {
        if (z) {
            z = this.f33123a;
            if (!z) {
                C2668g.b("target");
            }
            z.requestThumbnailsHeight();
        }
    }

    /* renamed from: a */
    public final void m41436a(int i, int i2) {
        if (i >= i2) {
            i = (int) (((double) i) * 1.2d);
            i2 = this.f33123a;
            if (i2 == 0) {
                C2668g.b("target");
            }
            i2.setThumbnailsHeight(i);
        }
    }
}
