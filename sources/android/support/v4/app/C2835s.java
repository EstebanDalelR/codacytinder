package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.app.NotificationCompat.Action;
import android.support.v4.app.NotificationCompat.C0382c;
import android.support.v4.app.NotificationCompat.C0383d;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.app.s */
class C2835s implements NotificationBuilderWithBuilderAccessor {
    /* renamed from: a */
    private final Builder f9011a;
    /* renamed from: b */
    private final C0382c f9012b;
    /* renamed from: c */
    private RemoteViews f9013c;
    /* renamed from: d */
    private RemoteViews f9014d;
    /* renamed from: e */
    private final List<Bundle> f9015e = new ArrayList();
    /* renamed from: f */
    private final Bundle f9016f = new Bundle();
    /* renamed from: g */
    private int f9017g;
    /* renamed from: h */
    private RemoteViews f9018h;

    C2835s(C0382c c0382c) {
        this.f9012b = c0382c;
        if (VERSION.SDK_INT >= 26) {
            this.f9011a = new Builder(c0382c.f1281a, c0382c.f1274H);
        } else {
            this.f9011a = new Builder(c0382c.f1281a);
        }
        Notification notification = c0382c.f1279M;
        this.f9011a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, c0382c.f1287g).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c0382c.f1283c).setContentText(c0382c.f1284d).setContentInfo(c0382c.f1289i).setContentIntent(c0382c.f1285e).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c0382c.f1286f, (notification.flags & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0).setLargeIcon(c0382c.f1288h).setNumber(c0382c.f1290j).setProgress(c0382c.f1297q, c0382c.f1298r, c0382c.f1299s);
        if (VERSION.SDK_INT < 21) {
            this.f9011a.setSound(notification.sound, notification.audioStreamType);
        }
        if (VERSION.SDK_INT >= 16) {
            this.f9011a.setSubText(c0382c.f1295o).setUsesChronometer(c0382c.f1293m).setPriority(c0382c.f1291k);
            Iterator it = c0382c.f1282b.iterator();
            while (it.hasNext()) {
                m11222a((Action) it.next());
            }
            if (c0382c.f1267A != null) {
                this.f9016f.putAll(c0382c.f1267A);
            }
            if (VERSION.SDK_INT < 20) {
                if (c0382c.f1303w) {
                    this.f9016f.putBoolean("android.support.localOnly", true);
                }
                if (c0382c.f1300t != null) {
                    this.f9016f.putString("android.support.groupKey", c0382c.f1300t);
                    if (c0382c.f1301u) {
                        this.f9016f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f9016f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (c0382c.f1302v != null) {
                    this.f9016f.putString("android.support.sortKey", c0382c.f1302v);
                }
            }
            this.f9013c = c0382c.f1271E;
            this.f9014d = c0382c.f1272F;
        }
        if (VERSION.SDK_INT >= 19) {
            this.f9011a.setShowWhen(c0382c.f1292l);
            if (!(VERSION.SDK_INT >= 21 || c0382c.f1280N == null || c0382c.f1280N.isEmpty())) {
                this.f9016f.putStringArray("android.people", (String[]) c0382c.f1280N.toArray(new String[c0382c.f1280N.size()]));
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.f9011a.setLocalOnly(c0382c.f1303w).setGroup(c0382c.f1300t).setGroupSummary(c0382c.f1301u).setSortKey(c0382c.f1302v);
            this.f9017g = c0382c.f1278L;
        }
        if (VERSION.SDK_INT >= 21) {
            this.f9011a.setCategory(c0382c.f1306z).setColor(c0382c.f1268B).setVisibility(c0382c.f1269C).setPublicVersion(c0382c.f1270D).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = c0382c.f1280N.iterator();
            while (it2.hasNext()) {
                this.f9011a.addPerson((String) it2.next());
            }
            this.f9018h = c0382c.f1273G;
        }
        if (VERSION.SDK_INT >= 24) {
            this.f9011a.setExtras(c0382c.f1267A).setRemoteInputHistory(c0382c.f1296p);
            if (c0382c.f1271E != null) {
                this.f9011a.setCustomContentView(c0382c.f1271E);
            }
            if (c0382c.f1272F != null) {
                this.f9011a.setCustomBigContentView(c0382c.f1272F);
            }
            if (c0382c.f1273G != null) {
                this.f9011a.setCustomHeadsUpContentView(c0382c.f1273G);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.f9011a.setBadgeIconType(c0382c.f1275I).setShortcutId(c0382c.f1276J).setTimeoutAfter(c0382c.f1277K).setGroupAlertBehavior(c0382c.f1278L);
            if (c0382c.f1305y) {
                this.f9011a.setColorized(c0382c.f1304x);
            }
            if (TextUtils.isEmpty(c0382c.f1274H) == null) {
                this.f9011a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    public Builder getBuilder() {
        return this.f9011a;
    }

    /* renamed from: a */
    public Notification m11223a() {
        C0383d c0383d = this.f9012b.f1294n;
        if (c0383d != null) {
            c0383d.mo397a((NotificationBuilderWithBuilderAccessor) this);
        }
        RemoteViews b = c0383d != null ? c0383d.m1428b(this) : null;
        Notification b2 = m11224b();
        if (b != null) {
            b2.contentView = b;
        } else if (this.f9012b.f1271E != null) {
            b2.contentView = this.f9012b.f1271E;
        }
        if (VERSION.SDK_INT >= 16 && c0383d != null) {
            b = c0383d.m1429c(this);
            if (b != null) {
                b2.bigContentView = b;
            }
        }
        if (VERSION.SDK_INT >= 21 && c0383d != null) {
            b = this.f9012b.f1294n.m1430d(this);
            if (b != null) {
                b2.headsUpContentView = b;
            }
        }
        if (VERSION.SDK_INT >= 16 && c0383d != null) {
            Bundle a = NotificationCompat.m1431a(b2);
            if (a != null) {
                c0383d.m1425a(a);
            }
        }
        return b2;
    }

    /* renamed from: a */
    private void m11222a(Action action) {
        if (VERSION.SDK_INT >= 20) {
            Bundle bundle;
            Notification.Action.Builder builder = new Notification.Action.Builder(action.m1400a(), action.m1401b(), action.m1402c());
            if (action.m1405f() != null) {
                for (RemoteInput addRemoteInput : C0424w.m1582a(action.m1405f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (action.m1403d() != null) {
                bundle = new Bundle(action.m1403d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.m1404e());
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(action.m1404e());
            }
            builder.addExtras(bundle);
            this.f9011a.addAction(builder.build());
        } else if (VERSION.SDK_INT >= 16) {
            this.f9015e.add(C0421t.m1572a(this.f9011a, action));
        }
    }

    /* renamed from: b */
    protected Notification m11224b() {
        if (VERSION.SDK_INT >= 26) {
            return this.f9011a.build();
        }
        Notification build;
        if (VERSION.SDK_INT >= 24) {
            build = this.f9011a.build();
            if (this.f9017g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f9017g != 2)) {
                    m11221a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f9017g == 1) {
                    m11221a(build);
                }
            }
            return build;
        } else if (VERSION.SDK_INT >= 21) {
            this.f9011a.setExtras(this.f9016f);
            build = this.f9011a.build();
            if (this.f9013c != null) {
                build.contentView = this.f9013c;
            }
            if (this.f9014d != null) {
                build.bigContentView = this.f9014d;
            }
            if (this.f9018h != null) {
                build.headsUpContentView = this.f9018h;
            }
            if (this.f9017g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f9017g != 2)) {
                    m11221a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f9017g == 1) {
                    m11221a(build);
                }
            }
            return build;
        } else if (VERSION.SDK_INT >= 20) {
            this.f9011a.setExtras(this.f9016f);
            build = this.f9011a.build();
            if (this.f9013c != null) {
                build.contentView = this.f9013c;
            }
            if (this.f9014d != null) {
                build.bigContentView = this.f9014d;
            }
            if (this.f9017g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f9017g != 2)) {
                    m11221a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f9017g == 1) {
                    m11221a(build);
                }
            }
            return build;
        } else if (VERSION.SDK_INT >= 19) {
            SparseArray a = C0421t.m1575a(this.f9015e);
            if (a != null) {
                this.f9016f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f9011a.setExtras(this.f9016f);
            build = this.f9011a.build();
            if (this.f9013c != null) {
                build.contentView = this.f9013c;
            }
            if (this.f9014d != null) {
                build.bigContentView = this.f9014d;
            }
            return build;
        } else if (VERSION.SDK_INT < 16) {
            return this.f9011a.getNotification();
        } else {
            build = this.f9011a.build();
            Bundle a2 = NotificationCompat.m1431a(build);
            Bundle bundle = new Bundle(this.f9016f);
            for (String str : this.f9016f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray a3 = C0421t.m1575a(this.f9015e);
            if (a3 != null) {
                NotificationCompat.m1431a(build).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            if (this.f9013c != null) {
                build.contentView = this.f9013c;
            }
            if (this.f9014d != null) {
                build.bigContentView = this.f9014d;
            }
            return build;
        }
    }

    /* renamed from: a */
    private void m11221a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
