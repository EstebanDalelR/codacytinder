package com.tinder.fireboarding.domain;

import android.content.res.Resources;
import com.tinder.fireboarding.C9559a.C9557f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/tinder/fireboarding/domain/FeatureNameFactory;", "", "()V", "create", "", "resources", "Landroid/content/res/Resources;", "level", "Lcom/tinder/fireboarding/domain/Level;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.f */
public final class C9564f {
    @NotNull
    /* renamed from: a */
    public final String m39870a(@NotNull Resources resources, @NotNull Level level) {
        C2668g.b(resources, "resources");
        C2668g.b(level, "level");
        switch (C9565g.f31966a[level.ordinal()]) {
            case 1:
                throw ((Throwable) new IllegalArgumentException("There is no feature name for like and pass"));
            case 2:
                resources = resources.getString(C9557f.fireboarding_feature_rewind);
                C2668g.a(resources, "resources.getString(R.st…eboarding_feature_rewind)");
                return resources;
            case 3:
                resources = resources.getString(C9557f.fireboarding_feature_superlike);
                C2668g.a(resources, "resources.getString(R.st…arding_feature_superlike)");
                return resources;
            case 4:
                resources = resources.getString(C9557f.fireboarding_feature_boost);
                C2668g.a(resources, "resources.getString(R.st…reboarding_feature_boost)");
                return resources;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
