package com.leanplum.p069a;

/* renamed from: com.leanplum.a.m */
public class C7036m implements ay {
    /* renamed from: A */
    private static String f25536A = "lp_imageUrl";
    /* renamed from: B */
    private static String f25537B = "region";
    /* renamed from: C */
    private static String f25538C = "regionState";
    /* renamed from: D */
    private static String f25539D = "regions";
    /* renamed from: E */
    private static String f25540E = "size";
    /* renamed from: F */
    private static String f25541F = "Subtitle";
    /* renamed from: G */
    private static String f25542G = "syncNewsfeed";
    /* renamed from: H */
    private static String f25543H = "loggingEnabled";
    /* renamed from: I */
    private static String f25544I = "timezone";
    /* renamed from: J */
    private static String f25545J = "timezoneOffsetSeconds";
    /* renamed from: K */
    private static String f25546K = "Title";
    /* renamed from: L */
    private static String f25547L = "Image";
    /* renamed from: M */
    private static String f25548M = "Data";
    /* renamed from: N */
    private static String f25549N = "token";
    /* renamed from: O */
    private static String f25550O = "variants";
    /* renamed from: P */
    private static String f25551P = "vars";
    /* renamed from: Q */
    private static String f25552Q = "varsFromCode";
    /* renamed from: R */
    private static String f25553R = "notificationChannels";
    /* renamed from: S */
    private static String f25554S = "defaultNotificationChannel";
    /* renamed from: T */
    private static String f25555T = "notificationChannelGroups";
    /* renamed from: a */
    private static String f25556a = "city";
    /* renamed from: b */
    private static String f25557b = "country";
    /* renamed from: c */
    private static String f25558c = "deliveryTimestamp";
    /* renamed from: d */
    private static String f25559d = "expirationTimestamp";
    /* renamed from: e */
    private static String f25560e = "filename";
    /* renamed from: f */
    private static String f25561f = "hash";
    /* renamed from: g */
    private static String f25562g = "installTimeInitialized";
    /* renamed from: h */
    private static String f25563h = "isRead";
    /* renamed from: i */
    private static String f25564i = "isRegistered";
    /* renamed from: j */
    private static String f25565j = "isRegisteredFromOtherApp";
    /* renamed from: k */
    private static String f25566k = "latestVersion";
    /* renamed from: l */
    private static String f25567l = "locale";
    /* renamed from: m */
    private static String f25568m = "location";
    /* renamed from: n */
    private static String f25569n = "locationAccuracyType";
    /* renamed from: o */
    private static String f25570o = "messageData";
    /* renamed from: p */
    private static String f25571p = "messages";
    /* renamed from: q */
    private static String f25572q = "interfaceRules";
    /* renamed from: r */
    private static String f25573r = "interfaceEvents";
    /* renamed from: s */
    private static String f25574s = "newsfeedMessages";
    /* renamed from: t */
    private static String f25575t = "_lpx";
    /* renamed from: u */
    private static String f25576u = "_lpm";
    /* renamed from: v */
    private static String f25577v = "_lpu";
    /* renamed from: w */
    private static String f25578w = "_lpn";
    /* renamed from: x */
    private static String f25579x = "_lpv";
    /* renamed from: y */
    private static String f25580y = "lp_messageId";
    /* renamed from: z */
    private static String f25581z = "lp_message";
    /* renamed from: U */
    private /* synthetic */ ag$7$1 f25582U;

    C7036m(ag$7$1 ag_7_1) {
        this.f25582U = ag_7_1;
    }

    /* renamed from: a */
    public void m30597a(Exception exception) {
        this.f25582U.f21139a.f12102c.a(false);
        Object[] objArr = new Object[1];
        StringBuilder stringBuilder = new StringBuilder("setUserAttributes failed when specifying location with error: ");
        stringBuilder.append(exception.getMessage());
        objArr[0] = stringBuilder.toString();
        ao.a(objArr);
    }
}
