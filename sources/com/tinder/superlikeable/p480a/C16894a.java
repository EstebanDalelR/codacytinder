package com.tinder.superlikeable.p480a;

import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.superlikeable.C15088a.C15083a;
import com.tinder.superlikeable.view.SuperLikeableGridView.CellView;
import com.tinder.superlikeable.view.SuperLikeableGridView.GridAdapter;
import com.tinder.superlikeable.view.cardview.GridCardView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0016J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/superlikeable/adapter/SuperLikeableRecsGridAdapter;", "Lcom/tinder/superlikeable/view/SuperLikeableGridView$GridAdapter;", "recs", "", "Lcom/tinder/domain/recs/model/UserRec;", "(Ljava/util/List;)V", "createLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "position", "", "gridCardMargin", "getCount", "getItem", "getView", "Lcom/tinder/superlikeable/view/SuperLikeableGridView$CellView;", "container", "Landroid/view/ViewGroup;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.a.a */
public final class C16894a implements GridAdapter {
    /* renamed from: a */
    private final List<UserRec> f52055a;

    public C16894a(@NotNull List<? extends UserRec> list) {
        C2668g.b(list, "recs");
        this.f52055a = list;
    }

    public int getCount() {
        return this.f52055a.size();
    }

    @NotNull
    public CellView getView(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "container");
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(C15083a.grid_card_margin);
        viewGroup = viewGroup.getContext();
        C2668g.a(viewGroup, "container.context");
        GridCardView gridCardView = new GridCardView(viewGroup, null, 2, null);
        gridCardView.setLayoutParams(m62491a(i, dimensionPixelSize));
        gridCardView.m66000a((UserRec) this.f52055a.get(i));
        return gridCardView;
    }

    @NotNull
    /* renamed from: a */
    public final UserRec m62492a(int i) {
        return (UserRec) this.f52055a.get(i);
    }

    /* renamed from: a */
    private final LayoutParams m62491a(int i, int i2) {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        switch (i) {
            case 0:
                i = i2 / 2;
                layoutParams.setMargins(i2, i2, i, i);
                break;
            case 1:
                i = i2 / 2;
                layoutParams.setMargins(i, i2, i2, i);
                break;
            case 2:
                i = i2 / 2;
                layoutParams.setMargins(i2, i, i, i2);
                break;
            case 3:
                i = i2 / 2;
                layoutParams.setMargins(i, i, i2, i2);
                break;
            default:
                layoutParams.setMargins(i2, i2, i2, i2);
                break;
        }
        return layoutParams;
    }
}
