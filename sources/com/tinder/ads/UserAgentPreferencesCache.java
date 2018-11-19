package com.tinder.ads;

import android.content.SharedPreferences;
import com.tinder.messageads.UserAgentCache;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/ads/UserAgentPreferencesCache;", "Lcom/tinder/messageads/UserAgentCache;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "clear", "", "exists", "", "get", "", "update", "userAgent", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class UserAgentPreferencesCache implements UserAgentCache {
    private final SharedPreferences sharedPreferences;

    public UserAgentPreferencesCache(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    public void update(@NotNull String str) {
        C2668g.b(str, "userAgent");
        this.sharedPreferences.edit().putString("USER_AGENT_KEY", str).apply();
    }

    @Nullable
    public String get() {
        return this.sharedPreferences.getString("USER_AGENT_KEY", null);
    }

    public boolean exists() {
        return this.sharedPreferences.contains("USER_AGENT_KEY");
    }

    public void clear() {
        this.sharedPreferences.edit().remove("USER_AGENT_KEY").apply();
    }
}
