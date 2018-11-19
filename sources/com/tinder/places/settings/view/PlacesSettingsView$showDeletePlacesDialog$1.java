package com.tinder.places.settings.view;

import com.tinder.C6250b.C6248a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "confirmed", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesSettingsView$showDeletePlacesDialog$1 extends Lambda implements Function1<Boolean, C15813i> {
    /* renamed from: a */
    final /* synthetic */ PlacesSettingsView f57841a;
    /* renamed from: b */
    final /* synthetic */ Function2 f57842b;

    PlacesSettingsView$showDeletePlacesDialog$1(PlacesSettingsView placesSettingsView, Function2 function2) {
        this.f57841a = placesSettingsView;
        this.f57842b = function2;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67036a(((Boolean) obj).booleanValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67036a(boolean z) {
        this.f57842b.invoke(Boolean.valueOf(z), ((EditablePlacesRecyclerView) this.f57841a.m60796a(C6248a.placesList)).getSelectedItemIDs());
    }
}
