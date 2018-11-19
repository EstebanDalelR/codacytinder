package com.tinder.places.card.p308a;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import com.tinder.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\r"}, d2 = {"Lcom/tinder/places/card/util/PlacesVisitorsCountAdapter;", "", "()V", "getBackgroundColor", "Landroid/graphics/drawable/ColorDrawable;", "visitors", "", "res", "Landroid/content/res/Resources;", "getRecentVisitorsDisplay", "", "recentVisitors", "getVisitorsDisplay", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.a.a */
public final class C10125a {
    /* renamed from: a */
    public static final C10125a f33093a = new C10125a();

    private C10125a() {
    }

    @NotNull
    /* renamed from: a */
    public final String m41366a(int i, @NotNull Resources resources) {
        C2668g.b(resources, "res");
        if (i == 0) {
            i = resources.getString(R.string.places_zero_visitors);
            C2668g.a(i, "res.getString(R.string.places_zero_visitors)");
            return i;
        } else if (i >= 99) {
            i = resources.getString(R.string.places_greater_than_99_visitors);
            C2668g.a(i, "res.getString(R.string.p…greater_than_99_visitors)");
            return i;
        } else {
            resources = resources.getQuantityString(R.plurals.place_visitors, i);
            C15828l c15828l = C15828l.f49033a;
            C2668g.a(resources, "recentVisitorsFormat");
            Object[] objArr = new Object[]{Integer.valueOf(i)};
            i = String.format(resources, Arrays.copyOf(objArr, objArr.length));
            C2668g.a(i, "java.lang.String.format(format, *args)");
            return i;
        }
    }

    @NotNull
    /* renamed from: b */
    public final String m41367b(int i, @NotNull Resources resources) {
        C2668g.b(resources, "res");
        if (i == 0) {
            i = resources.getString(R.string.places_zero_visitors);
            C2668g.a(i, "res.getString(R.string.places_zero_visitors)");
            return i;
        } else if (i >= 99) {
            i = resources.getString(R.string.places_greater_than_99_recent_visitors);
            C2668g.a(i, "res.getString(R.string.p…_than_99_recent_visitors)");
            return i;
        } else {
            resources = resources.getQuantityString(R.plurals.place_recent_visitors, i);
            C15828l c15828l = C15828l.f49033a;
            C2668g.a(resources, "recentVisitorsFormat");
            Object[] objArr = new Object[]{Integer.valueOf(i)};
            i = String.format(resources, Arrays.copyOf(objArr, objArr.length));
            C2668g.a(i, "java.lang.String.format(format, *args)");
            return i;
        }
    }

    @NotNull
    /* renamed from: c */
    public final ColorDrawable m41368c(int i, @NotNull Resources resources) {
        C2668g.b(resources, "res");
        return new ColorDrawable(resources.getColor(i > 0 ? R.color.places_black_overlay : 17170445));
    }
}
