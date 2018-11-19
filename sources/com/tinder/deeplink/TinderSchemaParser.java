package com.tinder.deeplink;

import com.tinder.activities.ActivityEditProfile.EditProfileDestination;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.toppicks.view.TopPicksView$TopPicksDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser;", "", "()V", "parseUrl", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "url", "", "ChatSupportedDeeplinks", "Companion", "TinderDestination", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TinderSchemaParser {
    /* renamed from: a */
    public static final C8816a f30916a = new C8816a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$ChatSupportedDeeplinks;", "", "deepLink", "", "readableTextResId", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getDeepLink", "()Ljava/lang/String;", "getReadableTextResId", "()I", "PAYWALL", "EDIT_PROFILE", "SETTINGS", "GOLD", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum ChatSupportedDeeplinks {
        ;
        
        @NotNull
        private final String deepLink;
        private final int readableTextResId;

        protected ChatSupportedDeeplinks(String str, int i) {
            C2668g.b(str, "deepLink");
            this.deepLink = str;
            this.readableTextResId = i;
        }

        @NotNull
        public final String getDeepLink() {
            return this.deepLink;
        }

        public final int getReadableTextResId() {
            return this.readableTextResId;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$Companion;", "", "()V", "ADD_PHOTOS_PATH", "", "APP_SETTINGS_PATH", "BOOST_PAYWALL_PATH", "CHAT_PATH", "CONNECT_INSTAGRAM_PATH", "CONNECT_SPOTIFY_PATH", "DEEPLINK_EDIT_PROFILE", "DEEPLINK_GOLD", "DEEPLINK_PAYWALL", "DEEPLINK_SETTINGS", "EDIT_ANTHEM_PATH", "EDIT_PROFILE_PATH", "EDIT_SCHOOL_PATH", "EDIT_WORK_PATH", "EMPTY_STRING", "FASTMATCH_PATH", "FEED_PATH", "GOLD_PAYWALL_PATH", "MESSAGES_PATH", "NATIVE_AD_QUERY_PARAMETER", "PAYWALL", "PAYWALL_GOLD", "PAYWALL_PLUS", "PLACES_PATH", "PUSH_SETTINGS_PATH", "SETTINGS_PATH", "SUPERLIKE_PAYWALL_PATH", "TINDER_PLUS_PAYWALL_PATH_1", "TINDER_PLUS_PAYWALL_PATH_2", "TINDER_SCHEMA", "TOP_PICKS_PATH", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.deeplink.TinderSchemaParser$a */
    public static final class C8816a {
        private C8816a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\r\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "", "()V", "AppSettings", "Chat", "EditProfile", "Fastmatch", "Feed", "Matches", "Paywall", "Places", "Profile", "PushSettings", "TinderSettings", "TopPicks", "Unknown", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Chat;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Matches;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Feed;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Profile;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Paywall;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$EditProfile;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Places;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$TopPicks;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$TinderSettings;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$AppSettings;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$PushSettings;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Fastmatch;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Unknown;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.deeplink.TinderSchemaParser$b */
    public static abstract class C8817b {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$AppSettings;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.deeplink.TinderSchemaParser$b$a */
        public static final class C11087a extends C8817b {
            public C11087a() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Chat;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "matchId", "", "(Ljava/lang/String;)V", "getMatchId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.deeplink.TinderSchemaParser$b$b */
        public static final class C11088b extends C8817b {
            @NotNull
            /* renamed from: a */
            private final String f35880a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C11088b) {
                        if (C2668g.a(this.f35880a, ((C11088b) obj).f35880a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.f35880a;
                return str != null ? str.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Chat(matchId=");
                stringBuilder.append(this.f35880a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C11088b(@NotNull String str) {
                C2668g.b(str, "matchId");
                super();
                this.f35880a = str;
            }

            @NotNull
            /* renamed from: a */
            public final String m43775a() {
                return this.f35880a;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$EditProfile;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "destination", "Lcom/tinder/activities/ActivityEditProfile$EditProfileDestination;", "(Lcom/tinder/activities/ActivityEditProfile$EditProfileDestination;)V", "getDestination", "()Lcom/tinder/activities/ActivityEditProfile$EditProfileDestination;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.deeplink.TinderSchemaParser$b$c */
        public static final class C11089c extends C8817b {
            @NotNull
            /* renamed from: a */
            private final EditProfileDestination f35881a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C11089c) {
                        if (C2668g.a(this.f35881a, ((C11089c) obj).f35881a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                EditProfileDestination editProfileDestination = this.f35881a;
                return editProfileDestination != null ? editProfileDestination.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("EditProfile(destination=");
                stringBuilder.append(this.f35881a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: a */
            public final EditProfileDestination m43776a() {
                return this.f35881a;
            }

            public C11089c(@NotNull EditProfileDestination editProfileDestination) {
                C2668g.b(editProfileDestination, "destination");
                super();
                this.f35881a = editProfileDestination;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Fastmatch;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.deeplink.TinderSchemaParser$b$d */
        public static final class C11090d extends C8817b {
            public C11090d() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Feed;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.deeplink.TinderSchemaParser$b$e */
        public static final class C11091e extends C8817b {
            public C11091e() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Matches;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.deeplink.TinderSchemaParser$b$f */
        public static final class C11092f extends C8817b {
            public C11092f() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Paywall;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "source", "Lcom/tinder/paywall/legacy/PaywallTypeSource;", "(Lcom/tinder/paywall/legacy/PaywallTypeSource;)V", "getSource", "()Lcom/tinder/paywall/legacy/PaywallTypeSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.deeplink.TinderSchemaParser$b$g */
        public static final class C11093g extends C8817b {
            @NotNull
            /* renamed from: a */
            private final PaywallTypeSource f35882a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C11093g) {
                        if (C2668g.a(this.f35882a, ((C11093g) obj).f35882a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                PaywallTypeSource paywallTypeSource = this.f35882a;
                return paywallTypeSource != null ? paywallTypeSource.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Paywall(source=");
                stringBuilder.append(this.f35882a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C11093g(@NotNull PaywallTypeSource paywallTypeSource) {
                C2668g.b(paywallTypeSource, "source");
                super();
                this.f35882a = paywallTypeSource;
            }

            @NotNull
            /* renamed from: a */
            public final PaywallTypeSource m43777a() {
                return this.f35882a;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Places;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.deeplink.TinderSchemaParser$b$h */
        public static final class C11094h extends C8817b {
            public C11094h() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$PushSettings;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.deeplink.TinderSchemaParser$b$i */
        public static final class C11095i extends C8817b {
            public C11095i() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$TinderSettings;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.deeplink.TinderSchemaParser$b$j */
        public static final class C11096j extends C8817b {
            public C11096j() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$TopPicks;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "destination", "Lcom/tinder/toppicks/view/TopPicksView$TopPicksDestination;", "(Lcom/tinder/toppicks/view/TopPicksView$TopPicksDestination;)V", "getDestination", "()Lcom/tinder/toppicks/view/TopPicksView$TopPicksDestination;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.deeplink.TinderSchemaParser$b$k */
        public static final class C11097k extends C8817b {
            @NotNull
            /* renamed from: a */
            private final TopPicksView$TopPicksDestination f35883a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C11097k) {
                        if (C2668g.a(this.f35883a, ((C11097k) obj).f35883a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                TopPicksView$TopPicksDestination topPicksView$TopPicksDestination = this.f35883a;
                return topPicksView$TopPicksDestination != null ? topPicksView$TopPicksDestination.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("TopPicks(destination=");
                stringBuilder.append(this.f35883a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C11097k(@NotNull TopPicksView$TopPicksDestination topPicksView$TopPicksDestination) {
                C2668g.b(topPicksView$TopPicksDestination, "destination");
                super();
                this.f35883a = topPicksView$TopPicksDestination;
            }

            @NotNull
            /* renamed from: a */
            public final TopPicksView$TopPicksDestination m43778a() {
                return this.f35883a;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination$Unknown;", "Lcom/tinder/deeplink/TinderSchemaParser$TinderDestination;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.deeplink.TinderSchemaParser$b$l */
        public static final class C11098l extends C8817b {
            public C11098l() {
                super();
            }
        }

        private C8817b() {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    public final com.tinder.deeplink.TinderSchemaParser.C8817b m37519a(@org.jetbrains.annotations.NotNull java.lang.String r8) {
        /*
        r7 = this;
        r0 = "url";
        kotlin.jvm.internal.C2668g.b(r8, r0);
        r2 = "tinder://";
        r3 = "";
        r4 = 0;
        r5 = 4;
        r6 = 0;
        r1 = r8;
        r8 = kotlin.text.C19303i.a(r1, r2, r3, r4, r5, r6);
        r0 = java.util.Locale.US;
        r1 = "Locale.US";
        kotlin.jvm.internal.C2668g.a(r0, r1);
        if (r8 != 0) goto L_0x0022;
    L_0x001a:
        r8 = new kotlin.TypeCastException;
        r0 = "null cannot be cast to non-null type java.lang.String";
        r8.<init>(r0);
        throw r8;
    L_0x0022:
        r8 = r8.toLowerCase(r0);
        r0 = "(this as java.lang.String).toLowerCase(locale)";
        kotlin.jvm.internal.C2668g.a(r8, r0);
        r0 = new java.util.StringTokenizer;
        r1 = "/?";
        r0.<init>(r8, r1);
        r8 = r0.hasMoreTokens();
        if (r8 != 0) goto L_0x0040;
    L_0x0038:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$l;
        r8.<init>();
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        return r8;
    L_0x0040:
        r8 = r0.nextToken();
        if (r8 != 0) goto L_0x0048;
    L_0x0046:
        goto L_0x02c2;
    L_0x0048:
        r1 = r8.hashCode();
        switch(r1) {
            case -2043732212: goto L_0x02ae;
            case -1998723398: goto L_0x029c;
            case -1828268901: goto L_0x0288;
            case -1412793399: goto L_0x0276;
            case -1316731398: goto L_0x024a;
            case -1268031254: goto L_0x0239;
            case -985774004: goto L_0x0228;
            case -907977868: goto L_0x0215;
            case -873639720: goto L_0x01e5;
            case -786387342: goto L_0x014d;
            case -406203903: goto L_0x013c;
            case -91022241: goto L_0x0129;
            case -74550090: goto L_0x00f8;
            case 3052376: goto L_0x00ce;
            case 3655441: goto L_0x00bb;
            case 28903346: goto L_0x00a8;
            case 819938402: goto L_0x0095;
            case 1434631203: goto L_0x0084;
            case 1629337901: goto L_0x0073;
            case 1985073752: goto L_0x0062;
            case 2023952660: goto L_0x0051;
            default: goto L_0x004f;
        };
    L_0x004f:
        goto L_0x02c2;
    L_0x0051:
        r0 = "fast-match";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x0059:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$d;
        r8.<init>();
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x0062:
        r0 = "system-push-settings";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x006a:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$i;
        r8.<init>();
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x0073:
        r0 = "activityfeed";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x007b:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$e;
        r8.<init>();
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x0084:
        r0 = "settings";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x008c:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$j;
        r8.<init>();
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x0095:
        r0 = "addphotos";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x009d:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$c;
        r0 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.PHOTO;
        r8.<init>(r0);
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x00a8:
        r0 = "instagram";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x00b0:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$c;
        r0 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.INSTAGRAM;
        r8.<init>(r0);
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x00bb:
        r0 = "work";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x00c3:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$c;
        r0 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.WORK;
        r8.<init>(r0);
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x00ce:
        r1 = "chat";
        r8 = r8.equals(r1);
        if (r8 == 0) goto L_0x02c2;
    L_0x00d6:
        r8 = r0.hasMoreTokens();
        if (r8 == 0) goto L_0x00ef;
    L_0x00dc:
        r8 = r0.nextToken();
        r0 = new com.tinder.deeplink.TinderSchemaParser$b$b;
        r1 = "matchId";
        kotlin.jvm.internal.C2668g.a(r8, r1);
        r0.<init>(r8);
        r8 = r0;
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x00ef:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$l;
        r8.<init>();
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x00f8:
        r1 = "getgold";
        r8 = r8.equals(r1);
        if (r8 == 0) goto L_0x02c2;
    L_0x0100:
        r8 = r0.hasMoreTokens();
        if (r8 == 0) goto L_0x011c;
    L_0x0106:
        r8 = "utm_source=ad";
        r0 = r0.nextToken();
        r8 = kotlin.jvm.internal.C2668g.a(r8, r0);
        if (r8 == 0) goto L_0x011c;
    L_0x0112:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$g;
        r0 = com.tinder.paywall.legacy.GoldPaywallSource.NATIVE_DFP_AD;
        r0 = (com.tinder.paywall.legacy.PaywallTypeSource) r0;
        r8.<init>(r0);
        goto L_0x0125;
    L_0x011c:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$g;
        r0 = com.tinder.paywall.legacy.GoldPaywallSource.DEEPLINK;
        r0 = (com.tinder.paywall.legacy.PaywallTypeSource) r0;
        r8.<init>(r0);
    L_0x0125:
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x0129:
        r0 = "editprofile";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x0131:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$c;
        r0 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.DEFAULT;
        r8.<init>(r0);
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x013c:
        r0 = "system-settings";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x0144:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$a;
        r8.<init>();
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x014d:
        r1 = "paywall";
        r8 = r8.equals(r1);
        if (r8 == 0) goto L_0x02c2;
    L_0x0155:
        r8 = r0.hasMoreTokens();
        if (r8 == 0) goto L_0x01d8;
    L_0x015b:
        r8 = r0.nextToken();
        if (r8 != 0) goto L_0x0163;
    L_0x0161:
        goto L_0x01ce;
    L_0x0163:
        r1 = r8.hashCode();
        r2 = 3178592; // 0x308060 float:4.454156E-39 double:1.570433E-317;
        if (r1 == r2) goto L_0x01a0;
    L_0x016c:
        r2 = 3444122; // 0x348d9a float:4.826243E-39 double:1.7016224E-317;
        if (r1 == r2) goto L_0x0172;
    L_0x0171:
        goto L_0x01ce;
    L_0x0172:
        r1 = "plus";
        r8 = r8.equals(r1);
        if (r8 == 0) goto L_0x01ce;
    L_0x017a:
        r8 = r0.hasMoreTokens();
        if (r8 == 0) goto L_0x0196;
    L_0x0180:
        r8 = "utm_source=ad";
        r0 = r0.nextToken();
        r8 = kotlin.jvm.internal.C2668g.a(r8, r0);
        if (r8 == 0) goto L_0x0196;
    L_0x018c:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$g;
        r0 = com.tinder.paywall.legacy.PlusPaywallSource.NATIVE_DFP_AD;
        r0 = (com.tinder.paywall.legacy.PaywallTypeSource) r0;
        r8.<init>(r0);
        goto L_0x01e1;
    L_0x0196:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$g;
        r0 = com.tinder.paywall.legacy.PlusPaywallSource.DEEPLINK_PLUS;
        r0 = (com.tinder.paywall.legacy.PaywallTypeSource) r0;
        r8.<init>(r0);
        goto L_0x01e1;
    L_0x01a0:
        r1 = "gold";
        r8 = r8.equals(r1);
        if (r8 == 0) goto L_0x01ce;
    L_0x01a8:
        r8 = r0.hasMoreTokens();
        if (r8 == 0) goto L_0x01c4;
    L_0x01ae:
        r8 = "utm_source=ad";
        r0 = r0.nextToken();
        r8 = kotlin.jvm.internal.C2668g.a(r8, r0);
        if (r8 == 0) goto L_0x01c4;
    L_0x01ba:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$g;
        r0 = com.tinder.paywall.legacy.GoldPaywallSource.NATIVE_DFP_AD;
        r0 = (com.tinder.paywall.legacy.PaywallTypeSource) r0;
        r8.<init>(r0);
        goto L_0x01e1;
    L_0x01c4:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$g;
        r0 = com.tinder.paywall.legacy.GoldPaywallSource.DEEPLINK;
        r0 = (com.tinder.paywall.legacy.PaywallTypeSource) r0;
        r8.<init>(r0);
        goto L_0x01e1;
    L_0x01ce:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$g;
        r0 = com.tinder.paywall.legacy.PlusPaywallSource.DEEPLINK_PLUS;
        r0 = (com.tinder.paywall.legacy.PaywallTypeSource) r0;
        r8.<init>(r0);
        goto L_0x01e1;
    L_0x01d8:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$g;
        r0 = com.tinder.paywall.legacy.PlusPaywallSource.DEEPLINK_PLUS;
        r0 = (com.tinder.paywall.legacy.PaywallTypeSource) r0;
        r8.<init>(r0);
    L_0x01e1:
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x01e5:
        r1 = "tinder";
        r8 = r8.equals(r1);
        if (r8 == 0) goto L_0x02c2;
    L_0x01ed:
        r8 = r0.hasMoreTokens();
        if (r8 == 0) goto L_0x020c;
    L_0x01f3:
        r8 = "paywall";
        r0 = r0.nextToken();
        r8 = kotlin.jvm.internal.C2668g.a(r8, r0);
        if (r8 == 0) goto L_0x020c;
    L_0x01ff:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$g;
        r0 = com.tinder.paywall.legacy.PlusPaywallSource.DEEPLINK_PLUS;
        r0 = (com.tinder.paywall.legacy.PaywallTypeSource) r0;
        r8.<init>(r0);
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x020c:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$l;
        r8.<init>();
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x0215:
        r0 = "school";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x021d:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$c;
        r0 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.SCHOOL;
        r8.<init>(r0);
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x0228:
        r0 = "places";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x0230:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$h;
        r8.<init>();
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x0239:
        r0 = "messagesfeed";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x0241:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$f;
        r8.<init>();
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x024a:
        r1 = "top-picks";
        r8 = r8.equals(r1);
        if (r8 == 0) goto L_0x02c2;
    L_0x0252:
        r8 = r0.hasMoreTokens();
        if (r8 == 0) goto L_0x026c;
    L_0x0258:
        r8 = r0.nextToken();
        r0 = "getgold";
        r8 = kotlin.jvm.internal.C2668g.a(r8, r0);
        if (r8 == 0) goto L_0x026c;
    L_0x0264:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$k;
        r0 = com.tinder.toppicks.view.TopPicksView$TopPicksDestination.PAYWALL;
        r8.<init>(r0);
        goto L_0x0273;
    L_0x026c:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$k;
        r0 = com.tinder.toppicks.view.TopPicksView$TopPicksDestination.TOP_PICKS;
        r8.<init>(r0);
    L_0x0273:
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x0276:
        r0 = "anthem";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x027e:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$c;
        r0 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.ANTHEM;
        r8.<init>(r0);
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x0288:
        r0 = "getmoreboosts";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x0290:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$g;
        r0 = com.tinder.paywall.legacy.BoostPaywallSource.DEEPLINK_BOOST;
        r0 = (com.tinder.paywall.legacy.PaywallTypeSource) r0;
        r8.<init>(r0);
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x029c:
        r0 = "spotify";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x02a4:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$c;
        r0 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.SPOTIFY;
        r8.<init>(r0);
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x02ae:
        r0 = "getmoresuperlikes";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x02c2;
    L_0x02b6:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$g;
        r0 = com.tinder.paywall.legacy.SuperlikePaywallSource.DEEPLINK_SUPERLIKE;
        r0 = (com.tinder.paywall.legacy.PaywallTypeSource) r0;
        r8.<init>(r0);
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
        goto L_0x02c9;
    L_0x02c2:
        r8 = new com.tinder.deeplink.TinderSchemaParser$b$l;
        r8.<init>();
        r8 = (com.tinder.deeplink.TinderSchemaParser.C8817b) r8;
    L_0x02c9:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.deeplink.TinderSchemaParser.a(java.lang.String):com.tinder.deeplink.TinderSchemaParser$b");
    }
}
