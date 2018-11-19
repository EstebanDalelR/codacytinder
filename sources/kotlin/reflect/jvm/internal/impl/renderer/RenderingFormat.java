package kotlin.reflect.jvm.internal.impl.renderer;

import com.tinder.api.ManagerWebServices;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;

public enum RenderingFormat {
    ;

    static final class HTML extends RenderingFormat {
        HTML(String str, int i) {
            super(str, i);
        }

        @NotNull
        public String escape(@NotNull String str) {
            C2668g.b(str, ManagerWebServices.PARAM_TEASER_STRING);
            return C19296q.m68672a(C19296q.m68672a(str, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    }

    static final class PLAIN extends RenderingFormat {
        @NotNull
        public String escape(@NotNull String str) {
            C2668g.b(str, ManagerWebServices.PARAM_TEASER_STRING);
            return str;
        }

        PLAIN(String str, int i) {
            super(str, i);
        }
    }

    @NotNull
    public abstract String escape(@NotNull String str);
}
