package com.tinder.places.main.view;

import com.tinder.C6250b.C6248a;
import com.tinder.places.map.view.PlacePinView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/tinder/places/map/view/PlacePinView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesErrorView$pinViews$2 extends Lambda implements Function0<List<? extends PlacePinView>> {
    /* renamed from: a */
    final /* synthetic */ C12372c f45027a;

    PlacesErrorView$pinViews$2(C12372c c12372c) {
        this.f45027a = c12372c;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53933a();
    }

    @NotNull
    /* renamed from: a */
    public final List<PlacePinView> m53933a() {
        return C19301m.b(new PlacePinView[]{(PlacePinView) this.f45027a.m48773a(C6248a.pin1), (PlacePinView) this.f45027a.m48773a(C6248a.pin2), (PlacePinView) this.f45027a.m48773a(C6248a.pin3), (PlacePinView) this.f45027a.m48773a(C6248a.pin4), (PlacePinView) this.f45027a.m48773a(C6248a.pin5)});
    }
}
