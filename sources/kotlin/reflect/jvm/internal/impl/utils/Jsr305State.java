package kotlin.reflect.jvm.internal.impl.utils;

import com.tinder.api.ManagerWebServices;
import java.util.Map;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Jsr305State {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Jsr305State.class), ManagerWebServices.PARAM_BADGE_DESC, "getDescription()[Ljava/lang/String;"))};
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final Jsr305State DEFAULT = new Jsr305State(ReportLevel.WARN, null, ah.m66884a(), false, 8, null);
    @NotNull
    @JvmField
    public static final Jsr305State DISABLED = new Jsr305State(ReportLevel.IGNORE, ReportLevel.IGNORE, ah.m66884a(), false, 8, null);
    @NotNull
    @JvmField
    public static final Jsr305State STRICT = new Jsr305State(ReportLevel.STRICT, ReportLevel.STRICT, ah.m66884a(), false, 8, null);
    @NotNull
    private final Lazy description$delegate;
    private final boolean enableCompatqualCheckerFrameworkAnnotations;
    @NotNull
    private final ReportLevel global;
    @Nullable
    private final ReportLevel migration;
    @NotNull
    private final Map<String, ReportLevel> user;

    public static final class Companion {
        private Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Jsr305State) {
            Jsr305State jsr305State = (Jsr305State) obj;
            if (C2668g.a(this.global, jsr305State.global) && C2668g.a(this.migration, jsr305State.migration) && C2668g.a(this.user, jsr305State.user)) {
                if ((this.enableCompatqualCheckerFrameworkAnnotations == jsr305State.enableCompatqualCheckerFrameworkAnnotations ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        ReportLevel reportLevel = this.global;
        int i = 0;
        int hashCode = (reportLevel != null ? reportLevel.hashCode() : 0) * 31;
        ReportLevel reportLevel2 = this.migration;
        hashCode = (hashCode + (reportLevel2 != null ? reportLevel2.hashCode() : 0)) * 31;
        Map map = this.user;
        if (map != null) {
            i = map.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.enableCompatqualCheckerFrameworkAnnotations;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Jsr305State(global=");
        stringBuilder.append(this.global);
        stringBuilder.append(", migration=");
        stringBuilder.append(this.migration);
        stringBuilder.append(", user=");
        stringBuilder.append(this.user);
        stringBuilder.append(", enableCompatqualCheckerFrameworkAnnotations=");
        stringBuilder.append(this.enableCompatqualCheckerFrameworkAnnotations);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Jsr305State(@NotNull ReportLevel reportLevel, @Nullable ReportLevel reportLevel2, @NotNull Map<String, ? extends ReportLevel> map, boolean z) {
        C2668g.b(reportLevel, "global");
        C2668g.b(map, ManagerWebServices.PARAM_USER);
        this.global = reportLevel;
        this.migration = reportLevel2;
        this.user = map;
        this.enableCompatqualCheckerFrameworkAnnotations = z;
        this.description$delegate = C15810e.m59833a((Function0) new Jsr305State$description$2(this));
    }

    @NotNull
    public final ReportLevel getGlobal() {
        return this.global;
    }

    @Nullable
    public final ReportLevel getMigration() {
        return this.migration;
    }

    @NotNull
    public final Map<String, ReportLevel> getUser() {
        return this.user;
    }

    public /* synthetic */ Jsr305State(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, boolean z, int i, C15823e c15823e) {
        if ((i & 8) != 0) {
            z = true;
        }
        this(reportLevel, reportLevel2, map, z);
    }

    public final boolean getEnableCompatqualCheckerFrameworkAnnotations() {
        return this.enableCompatqualCheckerFrameworkAnnotations;
    }

    public final boolean getDisabled() {
        return ((Jsr305State) this) == DISABLED;
    }
}
