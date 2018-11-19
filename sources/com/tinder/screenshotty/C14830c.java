package com.tinder.screenshotty;

import android.content.ContentResolver;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.MediaStore.Images.Media;
import com.tinder.screenshotty.p401a.C14826a;
import io.reactivex.C3959e;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/screenshotty/Screenshotty;", "", "contentResolver", "Landroid/content/ContentResolver;", "mediaPermissionsListener", "Lcom/tinder/screenshotty/MediaPermissionsListener;", "(Landroid/content/ContentResolver;Lcom/tinder/screenshotty/MediaPermissionsListener;)V", "screenshotNotifierAndProvider", "Lcom/tinder/screenshotty/ScreenshotNotifierAndProvider;", "screenshotWatcher", "Lcom/tinder/screenshotty/ScreenshotWatcher;", "observeScreenshots", "Lio/reactivex/Observable;", "Lcom/tinder/screenshotty/model/Screenshot;", "startMonitoring", "", "stopMonitoring", "screenshotty_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.screenshotty.c */
public final class C14830c {
    /* renamed from: a */
    private final C14829b f46434a;
    /* renamed from: b */
    private final C14827a f46435b = new C14827a();
    /* renamed from: c */
    private final ContentResolver f46436c;

    public C14830c(@NotNull ContentResolver contentResolver, @NotNull MediaPermissionsListener mediaPermissionsListener) {
        C2668g.b(contentResolver, "contentResolver");
        C2668g.b(mediaPermissionsListener, "mediaPermissionsListener");
        this.f46436c = contentResolver;
        contentResolver = new HandlerThread("Screenshotty");
        contentResolver.start();
        this.f46434a = new C14829b(new Handler(contentResolver.getLooper()), this.f46436c, this.f46435b);
        this.f46434a.m56187a(mediaPermissionsListener);
    }

    /* renamed from: a */
    public final void m56188a() {
        this.f46436c.registerContentObserver(Media.EXTERNAL_CONTENT_URI, true, this.f46434a);
    }

    /* renamed from: b */
    public final void m56189b() {
        this.f46436c.unregisterContentObserver(this.f46434a);
    }

    @NotNull
    /* renamed from: c */
    public final C3959e<C14826a> m56190c() {
        return this.f46435b.m56179a();
    }
}
