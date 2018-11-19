package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.widget.RemoteViews;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public class NotificationCompat {

    public static class Action {
        /* renamed from: a */
        final Bundle f1260a;
        /* renamed from: b */
        public int f1261b;
        /* renamed from: c */
        public CharSequence f1262c;
        /* renamed from: d */
        public PendingIntent f1263d;
        /* renamed from: e */
        private final C0424w[] f1264e;
        /* renamed from: f */
        private final C0424w[] f1265f;
        /* renamed from: g */
        private boolean f1266g;

        public interface Extender {
            C0381a extend(C0381a c0381a);
        }

        /* renamed from: android.support.v4.app.NotificationCompat$Action$a */
        public static final class C0381a {
        }

        /* renamed from: a */
        public int m1400a() {
            return this.f1261b;
        }

        /* renamed from: b */
        public CharSequence m1401b() {
            return this.f1262c;
        }

        /* renamed from: c */
        public PendingIntent m1402c() {
            return this.f1263d;
        }

        /* renamed from: d */
        public Bundle m1403d() {
            return this.f1260a;
        }

        /* renamed from: e */
        public boolean m1404e() {
            return this.f1266g;
        }

        /* renamed from: f */
        public C0424w[] m1405f() {
            return this.f1264e;
        }

        /* renamed from: g */
        public C0424w[] m1406g() {
            return this.f1265f;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    public interface Extender {
        C0382c extend(C0382c c0382c);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    /* renamed from: android.support.v4.app.NotificationCompat$c */
    public static class C0382c {
        /* renamed from: A */
        Bundle f1267A;
        /* renamed from: B */
        int f1268B;
        /* renamed from: C */
        int f1269C;
        /* renamed from: D */
        Notification f1270D;
        /* renamed from: E */
        RemoteViews f1271E;
        /* renamed from: F */
        RemoteViews f1272F;
        /* renamed from: G */
        RemoteViews f1273G;
        /* renamed from: H */
        String f1274H;
        /* renamed from: I */
        int f1275I;
        /* renamed from: J */
        String f1276J;
        /* renamed from: K */
        long f1277K;
        /* renamed from: L */
        int f1278L;
        /* renamed from: M */
        Notification f1279M;
        @Deprecated
        /* renamed from: N */
        public ArrayList<String> f1280N;
        @RestrictTo({Scope.LIBRARY_GROUP})
        /* renamed from: a */
        public Context f1281a;
        @RestrictTo({Scope.LIBRARY_GROUP})
        /* renamed from: b */
        public ArrayList<Action> f1282b;
        /* renamed from: c */
        CharSequence f1283c;
        /* renamed from: d */
        CharSequence f1284d;
        /* renamed from: e */
        PendingIntent f1285e;
        /* renamed from: f */
        PendingIntent f1286f;
        /* renamed from: g */
        RemoteViews f1287g;
        /* renamed from: h */
        Bitmap f1288h;
        /* renamed from: i */
        CharSequence f1289i;
        /* renamed from: j */
        int f1290j;
        /* renamed from: k */
        int f1291k;
        /* renamed from: l */
        boolean f1292l;
        /* renamed from: m */
        boolean f1293m;
        /* renamed from: n */
        C0383d f1294n;
        /* renamed from: o */
        CharSequence f1295o;
        /* renamed from: p */
        CharSequence[] f1296p;
        /* renamed from: q */
        int f1297q;
        /* renamed from: r */
        int f1298r;
        /* renamed from: s */
        boolean f1299s;
        /* renamed from: t */
        String f1300t;
        /* renamed from: u */
        boolean f1301u;
        /* renamed from: v */
        String f1302v;
        /* renamed from: w */
        boolean f1303w;
        /* renamed from: x */
        boolean f1304x;
        /* renamed from: y */
        boolean f1305y;
        /* renamed from: z */
        String f1306z;

        public C0382c(@NonNull Context context, @NonNull String str) {
            this.f1282b = new ArrayList();
            this.f1292l = true;
            this.f1303w = false;
            this.f1268B = 0;
            this.f1269C = 0;
            this.f1275I = 0;
            this.f1278L = 0;
            this.f1279M = new Notification();
            this.f1281a = context;
            this.f1274H = str;
            this.f1279M.when = System.currentTimeMillis();
            this.f1279M.audioStreamType = -1;
            this.f1291k = 0;
            this.f1280N = new ArrayList();
        }

        @Deprecated
        public C0382c(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public C0382c m1411a(long j) {
            this.f1279M.when = j;
            return this;
        }

        /* renamed from: a */
        public C0382c m1410a(int i) {
            this.f1279M.icon = i;
            return this;
        }

        /* renamed from: a */
        public C0382c m1416a(CharSequence charSequence) {
            this.f1283c = C0382c.m1408d(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0382c m1420b(CharSequence charSequence) {
            this.f1284d = C0382c.m1408d(charSequence);
            return this;
        }

        /* renamed from: a */
        public C0382c m1412a(PendingIntent pendingIntent) {
            this.f1285e = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public C0382c m1423c(CharSequence charSequence) {
            this.f1279M.tickerText = C0382c.m1408d(charSequence);
            return this;
        }

        /* renamed from: a */
        public C0382c m1413a(Bitmap bitmap) {
            this.f1288h = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0382c m1414a(Uri uri) {
            this.f1279M.sound = uri;
            this.f1279M.audioStreamType = -1;
            if (VERSION.SDK_INT >= 21) {
                this.f1279M.audioAttributes = new Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: a */
        public C0382c m1418a(boolean z) {
            m1407a(16, z);
            return this;
        }

        /* renamed from: b */
        public C0382c m1421b(boolean z) {
            this.f1303w = z;
            return this;
        }

        /* renamed from: b */
        public C0382c m1419b(int i) {
            this.f1279M.defaults = i;
            if ((i & 4) != 0) {
                i = this.f1279M;
                i.flags |= 1;
            }
            return this;
        }

        /* renamed from: a */
        private void m1407a(int i, boolean z) {
            if (z) {
                z = this.f1279M;
                z.flags = i | z.flags;
                return;
            }
            z = this.f1279M;
            z.flags = (i ^ -1) & z.flags;
        }

        /* renamed from: c */
        public C0382c m1422c(int i) {
            this.f1291k = i;
            return this;
        }

        /* renamed from: a */
        public C0382c m1415a(C0383d c0383d) {
            if (this.f1294n != c0383d) {
                this.f1294n = c0383d;
                if (this.f1294n != null) {
                    this.f1294n.m1427a(this);
                }
            }
            return this;
        }

        /* renamed from: d */
        public C0382c m1424d(@ColorInt int i) {
            this.f1268B = i;
            return this;
        }

        /* renamed from: a */
        public C0382c m1417a(@NonNull String str) {
            this.f1274H = str;
            return this;
        }

        /* renamed from: a */
        public Notification m1409a() {
            return new C2835s(this).m11223a();
        }

        /* renamed from: d */
        protected static CharSequence m1408d(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }
    }

    /* renamed from: android.support.v4.app.NotificationCompat$d */
    public static abstract class C0383d {
        @RestrictTo({Scope.LIBRARY_GROUP})
        /* renamed from: a */
        protected C0382c f1307a;
        /* renamed from: b */
        CharSequence f1308b;
        /* renamed from: c */
        CharSequence f1309c;
        /* renamed from: d */
        boolean f1310d = false;

        @RestrictTo({Scope.LIBRARY_GROUP})
        /* renamed from: a */
        public void m1425a(Bundle bundle) {
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        /* renamed from: a */
        public void mo397a(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        /* renamed from: b */
        public RemoteViews m1428b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        /* renamed from: c */
        public RemoteViews m1429c(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        /* renamed from: d */
        public RemoteViews m1430d(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        /* renamed from: a */
        public void m1427a(C0382c c0382c) {
            if (this.f1307a != c0382c) {
                this.f1307a = c0382c;
                if (this.f1307a != null) {
                    this.f1307a.m1415a(this);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.NotificationCompat$a */
    public static class C2822a extends C0383d {
        /* renamed from: e */
        private Bitmap f8928e;
        /* renamed from: f */
        private Bitmap f8929f;
        /* renamed from: g */
        private boolean f8930g;

        /* renamed from: a */
        public C2822a m11015a(CharSequence charSequence) {
            this.b = C0382c.m1408d(charSequence);
            return this;
        }

        /* renamed from: b */
        public C2822a m11017b(CharSequence charSequence) {
            this.c = C0382c.m1408d(charSequence);
            this.d = true;
            return this;
        }

        /* renamed from: a */
        public C2822a m11014a(Bitmap bitmap) {
            this.f8928e = bitmap;
            return this;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        /* renamed from: a */
        public void mo397a(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (VERSION.SDK_INT >= 16) {
                notificationBuilderWithBuilderAccessor = new BigPictureStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.b).bigPicture(this.f8928e);
                if (this.f8930g) {
                    notificationBuilderWithBuilderAccessor.bigLargeIcon(this.f8929f);
                }
                if (this.d) {
                    notificationBuilderWithBuilderAccessor.setSummaryText(this.c);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.NotificationCompat$b */
    public static class C2823b extends C0383d {
        /* renamed from: e */
        private CharSequence f8931e;

        /* renamed from: a */
        public C2823b m11018a(CharSequence charSequence) {
            this.f8931e = C0382c.m1408d(charSequence);
            return this;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        /* renamed from: a */
        public void mo397a(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (VERSION.SDK_INT >= 16) {
                notificationBuilderWithBuilderAccessor = new BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.b).bigText(this.f8931e);
                if (this.d) {
                    notificationBuilderWithBuilderAccessor.setSummaryText(this.c);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m1431a(Notification notification) {
        if (VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        return VERSION.SDK_INT >= 16 ? C0421t.m1573a(notification) : null;
    }
}
