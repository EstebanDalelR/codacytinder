package com.tinder.screenshot;

import com.tinder.managers.bt;
import com.tinder.screenshotty.MediaPermissionsListener;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/screenshot/ScreenshotMediaPermissionsListener;", "Lcom/tinder/screenshotty/MediaPermissionsListener;", "permissionManager", "Lcom/tinder/managers/PermissionManager;", "(Lcom/tinder/managers/PermissionManager;)V", "hasPermissions", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.screenshot.e */
public final class C16569e implements MediaPermissionsListener {
    /* renamed from: a */
    private final bt f51262a;

    @Inject
    public C16569e(@NotNull bt btVar) {
        C2668g.b(btVar, "permissionManager");
        this.f51262a = btVar;
    }

    public boolean hasPermissions() {
        this.f51262a.c();
        return this.f51262a.c();
    }
}
