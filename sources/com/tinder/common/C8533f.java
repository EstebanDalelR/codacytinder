package com.tinder.common;

import android.content.Context;
import com.tinder.R;
import com.tinder.managers.bk;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/common/DistanceFormatter;", "", "managerSharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "(Lcom/tinder/managers/ManagerSharedPreferences;)V", "getDistanceFromInteger", "", "distanceInMiles", "", "context", "Landroid/content/Context;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.f */
public final class C8533f {
    /* renamed from: a */
    private final bk f30280a;

    @Inject
    public C8533f(@NotNull bk bkVar) {
        C2668g.b(bkVar, "managerSharedPreferences");
        this.f30280a = bkVar;
    }

    @NotNull
    /* renamed from: a */
    public final String m36501a(int i, @NotNull Context context) {
        C2668g.b(context, "context");
        boolean k = this.f30280a.k();
        if (!k) {
            i = (int) (((float) i) * 1070464730);
        }
        int i2 = k ? R.plurals.distance_units_away_mi : R.plurals.distance_units_away_km;
        if (i < 1) {
            if (k) {
                i = context.getResources().getString(R.string.small_distance_away);
            } else {
                i = context.getResources().getString(R.string.small_distance_away_km);
            }
            C2668g.a(i, "if (userPrefersMiles) {\n…g.small_distance_away_km)");
            return i;
        }
        i = context.getResources().getQuantityString(i2, i, new Object[]{Integer.valueOf(i)});
        C2668g.a(i, "context.resources.getQua…anceInMilesOrKm\n        )");
        return i;
    }
}
