package com.tinder.intropricing.p263a;

import android.content.SharedPreferences;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/intropricing/data/IntroPricingSharedPreferenceDataStore;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "isIntroPricingEnabled", "", "setIntroPricingEnabled", "", "enabled", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.a.a */
public final class C9727a {
    /* renamed from: a */
    private final SharedPreferences f32321a;

    @Inject
    public C9727a(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f32321a = sharedPreferences;
    }

    /* renamed from: a */
    public final void m40222a(boolean z) {
        this.f32321a.edit().putBoolean("KEY_IS_INTRO_PRICING_ENABLED", z).apply();
    }

    /* renamed from: a */
    public final boolean m40223a() {
        return this.f32321a.getBoolean("KEY_IS_INTRO_PRICING_ENABLED", false);
    }
}
