package com.tinder.places.settings.view;

import com.tinder.places.settings.presenter.C14318c;
import dagger.MembersInjector;
import java.util.List;
import javax.inject.Provider;

/* renamed from: com.tinder.places.settings.view.c */
public final class C16039c implements MembersInjector<PlacesSettingsView> {
    /* renamed from: a */
    private final Provider<C14318c> f49812a;
    /* renamed from: b */
    private final Provider<List<String>> f49813b;

    public /* synthetic */ void injectMembers(Object obj) {
        m60806a((PlacesSettingsView) obj);
    }

    /* renamed from: a */
    public void m60806a(PlacesSettingsView placesSettingsView) {
        C16039c.m60804a(placesSettingsView, (C14318c) this.f49812a.get());
        C16039c.m60805a(placesSettingsView, (List) this.f49813b.get());
    }

    /* renamed from: a */
    public static void m60804a(PlacesSettingsView placesSettingsView, C14318c c14318c) {
        placesSettingsView.f49799b = c14318c;
    }

    /* renamed from: a */
    public static void m60805a(PlacesSettingsView placesSettingsView, List<String> list) {
        placesSettingsView.f49800c = list;
    }
}
