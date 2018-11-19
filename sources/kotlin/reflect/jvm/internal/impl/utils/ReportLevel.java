package kotlin.reflect.jvm.internal.impl.utils;

import com.tinder.api.ManagerWebServices;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public enum ReportLevel {
    ;
    
    public static final Companion Companion = null;
    @NotNull
    private final String description;

    public static final class Companion {
        private Companion() {
        }
    }

    protected ReportLevel(String str) {
        C2668g.b(str, ManagerWebServices.PARAM_BADGE_DESC);
        this.description = str;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    static {
        Companion = new Companion();
    }

    public final boolean isWarning() {
        return ((ReportLevel) this) == WARN;
    }

    public final boolean isIgnore() {
        return ((ReportLevel) this) == IGNORE;
    }
}
