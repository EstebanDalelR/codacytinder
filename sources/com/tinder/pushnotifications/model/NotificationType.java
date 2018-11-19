package com.tinder.pushnotifications.model;

import android.support.annotation.StringRes;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0001\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\"B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006#"}, d2 = {"Lcom/tinder/pushnotifications/model/NotificationType;", "", "defaultNotificationId", "", "titleResource", "", "messageResource", "iconResource", "(Ljava/lang/String;ILjava/lang/String;III)V", "getDefaultNotificationId", "()Ljava/lang/String;", "getIconResource", "()I", "getMessageResource", "getTitleResource", "GENERAL", "MESSAGE", "MATCH", "PHOTO_OPTIMIZED", "SUPERLIKE", "DISCOUNT", "MARKET", "BOOST", "FASTMATCH", "ERROR", "SELECT", "SUPER_LIKEABLE", "TOP_PICKS_DAILY", "PLACES", "REMOVE", "SCREENSHOT", "TOP_PICKS_DISCOVERY", "BITMOJI", "PHONE_NUMBER_VERIFIED", "Factory", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public enum NotificationType {
    ;
    
    public static final C14553a Factory = null;
    @NotNull
    private final String defaultNotificationId;
    private final int iconResource;
    private final int messageResource;
    private final int titleResource;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/pushnotifications/model/NotificationType$Factory;", "", "()V", "fromString", "Lcom/tinder/pushnotifications/model/NotificationType;", "name", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.model.NotificationType$a */
    public static final class C14553a {
        private C14553a() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @org.jetbrains.annotations.NotNull
        /* renamed from: a */
        public final com.tinder.pushnotifications.model.NotificationType m55577a(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            /*
            r1 = this;
            r0 = "name";
            kotlin.jvm.internal.C2668g.b(r2, r0);
            r0 = r2.hashCode();
            switch(r0) {
                case -1718391333: goto L_0x00e0;
                case -1649235110: goto L_0x00d5;
                case -1340115421: goto L_0x00ca;
                case -1286318897: goto L_0x00c1;
                case -985774004: goto L_0x00b6;
                case -936713436: goto L_0x00ab;
                case -934610812: goto L_0x00a0;
                case -906021636: goto L_0x0095;
                case -839557086: goto L_0x008a;
                case -277681973: goto L_0x007e;
                case -102405906: goto L_0x0075;
                case -75080375: goto L_0x006c;
                case 92899676: goto L_0x0060;
                case 96784904: goto L_0x0054;
                case 103668165: goto L_0x0048;
                case 876875309: goto L_0x003c;
                case 954925063: goto L_0x0032;
                case 1049417136: goto L_0x0026;
                case 1452108601: goto L_0x001a;
                case 1573908514: goto L_0x000e;
                default: goto L_0x000c;
            };
        L_0x000c:
            goto L_0x00eb;
        L_0x000e:
            r0 = "top_picks_daily";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x0016:
            r2 = com.tinder.pushnotifications.model.NotificationType.TOP_PICKS_DAILY;
            goto L_0x00ed;
        L_0x001a:
            r0 = "top_picks_discovery";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x0022:
            r2 = com.tinder.pushnotifications.model.NotificationType.TOP_PICKS_DISCOVERY;
            goto L_0x00ed;
        L_0x0026:
            r0 = "discount_reminder";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x002e:
            r2 = com.tinder.pushnotifications.model.NotificationType.DISCOUNT;
            goto L_0x00ed;
        L_0x0032:
            r0 = "message";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x003a:
            goto L_0x00d2;
        L_0x003c:
            r0 = "phone_number_verified";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x0044:
            r2 = com.tinder.pushnotifications.model.NotificationType.PHONE_NUMBER_VERIFIED;
            goto L_0x00ed;
        L_0x0048:
            r0 = "match";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x0050:
            r2 = com.tinder.pushnotifications.model.NotificationType.MATCH;
            goto L_0x00ed;
        L_0x0054:
            r0 = "error";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x005c:
            r2 = com.tinder.pushnotifications.model.NotificationType.ERROR;
            goto L_0x00ed;
        L_0x0060:
            r0 = "alert";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x0068:
            r2 = com.tinder.pushnotifications.model.NotificationType.MARKET;
            goto L_0x00ed;
        L_0x006c:
            r0 = "gesture";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x0074:
            goto L_0x00d2;
        L_0x0075:
            r0 = "bitmoji";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x007d:
            goto L_0x00d2;
        L_0x007e:
            r0 = "boost_expiration";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x0086:
            r2 = com.tinder.pushnotifications.model.NotificationType.BOOST;
            goto L_0x00ed;
        L_0x008a:
            r0 = "fast_match";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x0092:
            r2 = com.tinder.pushnotifications.model.NotificationType.FASTMATCH;
            goto L_0x00ed;
        L_0x0095:
            r0 = "select";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x009d:
            r2 = com.tinder.pushnotifications.model.NotificationType.SELECT;
            goto L_0x00ed;
        L_0x00a0:
            r0 = "remove";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x00a8:
            r2 = com.tinder.pushnotifications.model.NotificationType.REMOVE;
            goto L_0x00ed;
        L_0x00ab:
            r0 = "screenshot_notification";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x00b3:
            r2 = com.tinder.pushnotifications.model.NotificationType.SCREENSHOT;
            goto L_0x00ed;
        L_0x00b6:
            r0 = "places";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x00be:
            r2 = com.tinder.pushnotifications.model.NotificationType.PLACES;
            goto L_0x00ed;
        L_0x00c1:
            r0 = "message_like";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x00c9:
            goto L_0x00d2;
        L_0x00ca:
            r0 = "message_notification";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x00d2:
            r2 = com.tinder.pushnotifications.model.NotificationType.MESSAGE;
            goto L_0x00ed;
        L_0x00d5:
            r0 = "photo_optimized";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x00dd:
            r2 = com.tinder.pushnotifications.model.NotificationType.PHOTO_OPTIMIZED;
            goto L_0x00ed;
        L_0x00e0:
            r0 = "super_like";
            r2 = r2.equals(r0);
            if (r2 == 0) goto L_0x00eb;
        L_0x00e8:
            r2 = com.tinder.pushnotifications.model.NotificationType.SUPERLIKE;
            goto L_0x00ed;
        L_0x00eb:
            r2 = com.tinder.pushnotifications.model.NotificationType.GENERAL;
        L_0x00ed:
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.pushnotifications.model.NotificationType.a.a(java.lang.String):com.tinder.pushnotifications.model.NotificationType");
        }
    }

    protected NotificationType(String str, int i, @NotNull int i2, @StringRes int i3) {
        C2668g.b(str, "defaultNotificationId");
        this.defaultNotificationId = str;
        this.titleResource = i;
        this.messageResource = i2;
        this.iconResource = i3;
    }

    @NotNull
    public final String getDefaultNotificationId() {
        return this.defaultNotificationId;
    }

    public final int getTitleResource() {
        return this.titleResource;
    }

    public final int getMessageResource() {
        return this.messageResource;
    }

    public final int getIconResource() {
        return this.iconResource;
    }

    static {
        Factory = new C14553a();
    }
}
