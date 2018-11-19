package com.tinder.data.fastmatch;

import android.content.SharedPreferences;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/data/fastmatch/FastMatchSharedPreferenceDataStore;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "isEnabled", "", "fastMatchEnabled", "getFastMatchEnabled", "()Z", "setFastMatchEnabled", "(Z)V", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.fastmatch.b */
public final class C8649b {
    /* renamed from: a */
    private final SharedPreferences f30498a;

    @Inject
    public C8649b(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f30498a = sharedPreferences;
    }

    /* renamed from: a */
    public final void m36883a(boolean z) {
        this.f30498a.edit().putBoolean("KEY_FAST_MATCH_CONFIG_ENABLED", z).apply();
    }

    /* renamed from: a */
    public final boolean m36884a() {
        return this.f30498a.getBoolean("KEY_FAST_MATCH_CONFIG_ENABLED", false);
    }
}
