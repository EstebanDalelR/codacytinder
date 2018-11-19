package com.tinder.recs.provider;

import android.support.v4.util.C0551g;
import com.tinder.api.ManagerWebServices;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/recs/provider/UserRecActivePhotoIndexProvider;", "", "()V", "userIdPhotoIndexMap", "Landroid/support/v4/util/LruCache;", "", "", "getActivePhotoIndex", "userId", "updateActivePhotoIndex", "", "activePhotoIndex", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public final class UserRecActivePhotoIndexProvider {
    private final C0551g<String, Integer> userIdPhotoIndexMap = new C0551g(10);

    public final int getActivePhotoIndex(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        if (this.userIdPhotoIndexMap.get(str) == null) {
            return null;
        }
        str = this.userIdPhotoIndexMap.get(str);
        C2668g.a(str, "userIdPhotoIndexMap.get(userId)");
        return ((Number) str).intValue();
    }

    public final void updateActivePhotoIndex(@NotNull String str, int i) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        this.userIdPhotoIndexMap.put(str, Integer.valueOf(i));
    }
}
