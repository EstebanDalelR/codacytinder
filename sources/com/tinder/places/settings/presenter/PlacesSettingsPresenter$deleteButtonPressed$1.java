package com.tinder.places.settings.presenter;

import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "confirmed", "", "placesIds", "", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesSettingsPresenter$deleteButtonPressed$1 extends Lambda implements Function2<Boolean, List<? extends String>, C15813i> {
    /* renamed from: a */
    final /* synthetic */ C14318c f57828a;

    PlacesSettingsPresenter$deleteButtonPressed$1(C14318c c14318c) {
        this.f57828a = c14318c;
        super(2);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        m67028a(((Boolean) obj).booleanValue(), (List) obj2);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67028a(boolean z, @NotNull List<String> list) {
        C2668g.b(list, "placesIds");
        if (z) {
            this.f57828a.m54615a((List) list);
        }
        this.f57828a.f45484o.a(list, z);
    }
}
