package com.tinder.places.settings.view;

import android.view.View;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.places.main.view.PlacesPinDropView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesSettingsView$visibleWhenDisabledViews$2 extends Lambda implements Function0<List<? extends View>> {
    /* renamed from: a */
    final /* synthetic */ PlacesSettingsView f57843a;

    PlacesSettingsView$visibleWhenDisabledViews$2(PlacesSettingsView placesSettingsView) {
        this.f57843a = placesSettingsView;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m67037a();
    }

    @NotNull
    /* renamed from: a */
    public final List<View> m67037a() {
        return C17554o.m64199b((Object[]) new View[]{(TextView) this.f57843a.m60796a(C6248a.turnPlacesOnCta), (PlacesPinDropView) this.f57843a.m60796a(C6248a.pinDropView), this.f57843a.m60796a(C6248a.pinDropViewOverlayTop), this.f57843a.m60796a(C6248a.pinDropViewOverlayBottom), this.f57843a.m60796a(C6248a.pinDropViewOverlaySolidTop), this.f57843a.m60796a(C6248a.pinDropViewOverlaySolidBottom), (TextView) this.f57843a.m60796a(C6248a.placesIsOff), (TextView) this.f57843a.m60796a(C6248a.placesTurnOnDetail)});
    }
}
