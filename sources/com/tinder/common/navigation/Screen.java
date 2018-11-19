package com.tinder.common.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\r\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/tinder/common/navigation/Screen;", "", "()V", "Account", "Background", "Chat", "EditProfile", "Feed", "ItsAMatch", "LikesYou", "Matches", "Places", "PlacesRecs", "Profile", "Recs", "TopPicks", "Lcom/tinder/common/navigation/Screen$Background;", "Lcom/tinder/common/navigation/Screen$Account;", "Lcom/tinder/common/navigation/Screen$Recs;", "Lcom/tinder/common/navigation/Screen$Chat;", "Lcom/tinder/common/navigation/Screen$Profile;", "Lcom/tinder/common/navigation/Screen$Feed;", "Lcom/tinder/common/navigation/Screen$EditProfile;", "Lcom/tinder/common/navigation/Screen$LikesYou;", "Lcom/tinder/common/navigation/Screen$TopPicks;", "Lcom/tinder/common/navigation/Screen$Places;", "Lcom/tinder/common/navigation/Screen$PlacesRecs;", "Lcom/tinder/common/navigation/Screen$ItsAMatch;", "Lcom/tinder/common/navigation/Screen$Matches;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class Screen {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tinder/common/navigation/Screen$Matches;", "Lcom/tinder/common/navigation/Screen;", "activeSubscreen", "Lcom/tinder/common/navigation/Screen$Matches$Subscreen;", "(Lcom/tinder/common/navigation/Screen$Matches$Subscreen;)V", "getActiveSubscreen", "()Lcom/tinder/common/navigation/Screen$Matches$Subscreen;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Subscreen", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Matches extends Screen {
        @NotNull
        /* renamed from: a */
        private final Subscreen f35022a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/common/navigation/Screen$Matches$Subscreen;", "", "(Ljava/lang/String;I)V", "MESSAGES", "FEED", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        public enum Subscreen {
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Matches) {
                    if (C2668g.a(this.f35022a, ((Matches) obj).f35022a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Subscreen subscreen = this.f35022a;
            return subscreen != null ? subscreen.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Matches(activeSubscreen=");
            stringBuilder.append(this.f35022a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Matches(@NotNull Subscreen subscreen) {
            C2668g.b(subscreen, "activeSubscreen");
            super();
            this.f35022a = subscreen;
        }

        @NotNull
        /* renamed from: a */
        public final Subscreen m43011a() {
            return this.f35022a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/common/navigation/Screen$Account;", "Lcom/tinder/common/navigation/Screen;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.navigation.Screen$a */
    public static final class C10682a extends Screen {
        /* renamed from: a */
        public static final C10682a f35023a = new C10682a();

        private C10682a() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/common/navigation/Screen$Background;", "Lcom/tinder/common/navigation/Screen;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.navigation.Screen$b */
    public static final class C10683b extends Screen {
        /* renamed from: a */
        public static final C10683b f35024a = new C10683b();

        private C10683b() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/common/navigation/Screen$Chat;", "Lcom/tinder/common/navigation/Screen;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.navigation.Screen$c */
    public static final class C10684c extends Screen {
        /* renamed from: a */
        public static final C10684c f35025a = new C10684c();

        private C10684c() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/common/navigation/Screen$EditProfile;", "Lcom/tinder/common/navigation/Screen;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.navigation.Screen$d */
    public static final class C10685d extends Screen {
        /* renamed from: a */
        public static final C10685d f35026a = new C10685d();

        private C10685d() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/common/navigation/Screen$Feed;", "Lcom/tinder/common/navigation/Screen;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.navigation.Screen$e */
    public static final class C10686e extends Screen {
        /* renamed from: a */
        public static final C10686e f35027a = new C10686e();

        private C10686e() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/common/navigation/Screen$ItsAMatch;", "Lcom/tinder/common/navigation/Screen;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.navigation.Screen$f */
    public static final class C10687f extends Screen {
        /* renamed from: a */
        public static final C10687f f35028a = new C10687f();

        private C10687f() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/common/navigation/Screen$LikesYou;", "Lcom/tinder/common/navigation/Screen;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.navigation.Screen$g */
    public static final class C10688g extends Screen {
        /* renamed from: a */
        public static final C10688g f35029a = new C10688g();

        private C10688g() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/common/navigation/Screen$Places;", "Lcom/tinder/common/navigation/Screen;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.navigation.Screen$h */
    public static final class C10689h extends Screen {
        /* renamed from: a */
        public static final C10689h f35030a = new C10689h();

        private C10689h() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/common/navigation/Screen$PlacesRecs;", "Lcom/tinder/common/navigation/Screen;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.navigation.Screen$i */
    public static final class C10690i extends Screen {
        /* renamed from: a */
        public static final C10690i f35031a = new C10690i();

        private C10690i() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/common/navigation/Screen$Profile;", "Lcom/tinder/common/navigation/Screen;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.navigation.Screen$j */
    public static final class C10691j extends Screen {
        /* renamed from: a */
        public static final C10691j f35032a = new C10691j();

        private C10691j() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/common/navigation/Screen$Recs;", "Lcom/tinder/common/navigation/Screen;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.navigation.Screen$k */
    public static final class C10692k extends Screen {
        /* renamed from: a */
        public static final C10692k f35033a = new C10692k();

        private C10692k() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/common/navigation/Screen$TopPicks;", "Lcom/tinder/common/navigation/Screen;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.navigation.Screen$l */
    public static final class C10693l extends Screen {
        /* renamed from: a */
        public static final C10693l f35034a = new C10693l();

        private C10693l() {
            super();
        }
    }

    private Screen() {
    }
}
