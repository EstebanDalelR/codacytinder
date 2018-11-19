package com.tinder.onboarding;

import com.tinder.managers.bt;
import com.tinder.onboarding.model.OnboardingPermissions;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/onboarding/OnboardingPermissionManagerPermissions;", "Lcom/tinder/onboarding/model/OnboardingPermissions;", "permissionManager", "Lcom/tinder/managers/PermissionManager;", "(Lcom/tinder/managers/PermissionManager;)V", "isExtStorageReadPermissionGranted", "", "isGranted", "grantResults", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.onboarding.e */
public final class C12168e implements OnboardingPermissions {
    /* renamed from: a */
    private final bt f39439a;

    @Inject
    public C12168e(@NotNull bt btVar) {
        C2668g.b(btVar, "permissionManager");
        this.f39439a = btVar;
    }

    public boolean isExtStorageReadPermissionGranted() {
        return this.f39439a.m40518c();
    }

    public boolean isGranted(@NotNull int[] iArr) {
        C2668g.b(iArr, "grantResults");
        return this.f39439a.m40516a(iArr);
    }
}
