package com.tinder.screenshotty;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore.Images.Media;
import com.tinder.api.ManagerWebServices;
import com.tinder.screenshotty.p401a.C14826a;
import com.tinder.screenshotty.p401a.C14826a.C16570a;
import com.tinder.screenshotty.p401a.C14826a.C16571b;
import java.io.File;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import kotlin.text.C19298r;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nH\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\nH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/screenshotty/ScreenshotWatcher;", "Landroid/database/ContentObserver;", "handler", "Landroid/os/Handler;", "contentResolver", "Landroid/content/ContentResolver;", "screenshotNotifierAndProvider", "Lcom/tinder/screenshotty/ScreenshotNotifierAndProvider;", "(Landroid/os/Handler;Landroid/content/ContentResolver;Lcom/tinder/screenshotty/ScreenshotNotifierAndProvider;)V", "MEDIA_EXTERNAL_URI_STRING", "", "PROJECTION", "", "[Ljava/lang/String;", "permissionsListener", "Lcom/tinder/screenshotty/MediaPermissionsListener;", "generateScreenshotFromCursor", "Lcom/tinder/screenshotty/model/Screenshot;", "cursor", "Landroid/database/Cursor;", "handleScreenshotCaptured", "", "uri", "Landroid/net/Uri;", "isFileScreenshot", "", "fileName", "isPathScreenshot", "path", "isSingleImageFile", "onChange", "selfChange", "setMediaPermissionsListener", "screenshotty_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.screenshotty.b */
public final class C14829b extends ContentObserver {
    /* renamed from: a */
    private MediaPermissionsListener f46429a;
    /* renamed from: b */
    private final String[] f46430b = new String[]{ManagerWebServices.PARAM_ID_UNDERSCORE, "_display_name", "_data"};
    /* renamed from: c */
    private final String f46431c = Media.EXTERNAL_CONTENT_URI.toString();
    /* renamed from: d */
    private final ContentResolver f46432d;
    /* renamed from: e */
    private final C14827a f46433e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/tinder/screenshotty/ScreenshotWatcher$handleScreenshotCaptured$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.screenshotty.b$a */
    static final class C14828a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C14829b f46427a;
        /* renamed from: b */
        final /* synthetic */ C14826a f46428b;

        C14828a(C14829b c14829b, C14826a c14826a) {
            this.f46427a = c14829b;
            this.f46428b = c14826a;
        }

        public final void run() {
            this.f46427a.f46433e.m56180a(this.f46428b);
        }
    }

    public C14829b(@NotNull Handler handler, @NotNull ContentResolver contentResolver, @NotNull C14827a c14827a) {
        C2668g.b(handler, "handler");
        C2668g.b(contentResolver, "contentResolver");
        C2668g.b(c14827a, "screenshotNotifierAndProvider");
        super(handler);
        this.f46432d = contentResolver;
        this.f46433e = c14827a;
    }

    public void onChange(boolean z, @Nullable Uri uri) {
        super.onChange(z, uri);
        if (uri != null && m56183a(uri)) {
            z = this.f46429a;
            if (z && z.hasPermissions()) {
                m56185b(uri);
            } else {
                this.f46433e.m56180a((C14826a) C16571b.f51265a);
            }
        }
    }

    /* renamed from: a */
    public final void m56187a(@NotNull MediaPermissionsListener mediaPermissionsListener) {
        C2668g.b(mediaPermissionsListener, "permissionsListener");
        this.f46429a = mediaPermissionsListener;
    }

    /* renamed from: a */
    private final boolean m56183a(Uri uri) {
        uri = uri.toString();
        C2668g.a(uri, "uri.toString()");
        CharSequence charSequence = (CharSequence) uri;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f46431c);
        stringBuilder.append("/[0-9]+");
        return new Regex(stringBuilder.toString()).m59921a(charSequence);
    }

    @SuppressLint({"Recycle"})
    /* renamed from: b */
    private final void m56185b(Uri uri) {
        Throwable th;
        Cursor cursor = (Cursor) null;
        try {
            uri = this.f46432d.query(uri, this.f46430b, null, null, null);
            if (uri != null) {
                try {
                    if (uri.moveToFirst()) {
                        C14826a a = m56181a((Cursor) uri);
                        if (a != null) {
                            new Handler(Looper.getMainLooper()).post(new C14828a(this, a));
                        }
                    }
                    if (uri != null) {
                        uri.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (uri != null) {
                        uri.close();
                    }
                    throw th;
                }
            }
        } catch (Uri uri2) {
            Cursor cursor2 = cursor;
            th = uri2;
            uri2 = cursor2;
            if (uri2 != null) {
                uri2.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private final C14826a m56181a(Cursor cursor) {
        cursor.getLong(cursor.getColumnIndex(ManagerWebServices.PARAM_ID_UNDERSCORE));
        String string = cursor.getString(cursor.getColumnIndex("_display_name"));
        String string2 = cursor.getString(cursor.getColumnIndex("_data"));
        C2668g.a(string2, "path");
        if (m56186b(string2)) {
            C2668g.a(string, "fileName");
            if (m56184a(string)) {
                cursor = Uri.fromFile(new File(Uri.parse(string2).toString()));
                Bitmap bitmap = Media.getBitmap(this.f46432d, cursor);
                C2668g.a(bitmap, "bitmap");
                C2668g.a(cursor, ManagerWebServices.PARAM_SPOTIFY_URI);
                return new C16570a(bitmap, cursor);
            }
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m56184a(String str) {
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        str = str.toLowerCase();
        C2668g.a(str, "(this as java.lang.String).toLowerCase()");
        return C19296q.m68678b(str, "screenshot", false, 2, null);
    }

    /* renamed from: b */
    private final boolean m56186b(String str) {
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        str = str.toLowerCase();
        C2668g.a(str, "(this as java.lang.String).toLowerCase()");
        return C19298r.m68786b((CharSequence) str, (CharSequence) "screenshots/", false, 2, null);
    }
}
