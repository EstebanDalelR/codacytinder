package com.tinder.common.p318g;

import android.content.Context;
import android.support.v4.content.C0432b;
import com.tinder.common.permissions.IsExternalReadPermissionGranted;
import com.tinder.module.ForApplication;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/common/permission/IsAndroidExternalReadPermissionGranted;", "Lcom/tinder/common/permissions/IsExternalReadPermissionGranted;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "invoke", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.g.a */
public final class C10672a implements IsExternalReadPermissionGranted {
    /* renamed from: a */
    private final Context f35013a;

    @Inject
    public C10672a(@NotNull @ForApplication Context context) {
        C2668g.b(context, "context");
        this.f35013a = context;
    }

    public boolean invoke() {
        return C0432b.b(this.f35013a, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }
}
