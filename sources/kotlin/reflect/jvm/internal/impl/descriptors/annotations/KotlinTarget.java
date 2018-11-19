package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C15811g;
import kotlin.collections.C19066k;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public enum KotlinTarget {
    ;
    
    @NotNull
    private static final Set<KotlinTarget> ALL_TARGET_SET = null;
    public static final Companion Companion = null;
    @NotNull
    private static final Set<KotlinTarget> DEFAULT_TARGET_SET = null;
    @NotNull
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> USE_SITE_MAPPING = null;
    private static final HashMap<String, KotlinTarget> map = null;
    @NotNull
    private final String description;
    private final boolean isDefault;

    public static final class Companion {
        private Companion() {
        }
    }

    protected KotlinTarget(String str, boolean z) {
        C2668g.b(str, ManagerWebServices.PARAM_BADGE_DESC);
        this.description = str;
        this.isDefault = z;
    }

    static {
        Companion = new Companion();
        map = new HashMap();
        for (KotlinTarget kotlinTarget : values()) {
            map.put(kotlinTarget.name(), kotlinTarget);
        }
        KotlinTarget[] values = values();
        Collection arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget2 : values) {
            if (kotlinTarget2.isDefault) {
                arrayList.add(kotlinTarget2);
            }
        }
        DEFAULT_TARGET_SET = C19299w.m68842n((List) arrayList);
        ALL_TARGET_SET = C19066k.m68009k(values());
        USE_SITE_MAPPING = ah.m66889a(C15811g.m59834a(AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER, VALUE_PARAMETER), C15811g.m59834a(AnnotationUseSiteTarget.FIELD, FIELD), C15811g.m59834a(AnnotationUseSiteTarget.PROPERTY, PROPERTY), C15811g.m59834a(AnnotationUseSiteTarget.FILE, FILE), C15811g.m59834a(AnnotationUseSiteTarget.PROPERTY_GETTER, PROPERTY_GETTER), C15811g.m59834a(AnnotationUseSiteTarget.PROPERTY_SETTER, PROPERTY_SETTER), C15811g.m59834a(AnnotationUseSiteTarget.RECEIVER, VALUE_PARAMETER), C15811g.m59834a(AnnotationUseSiteTarget.SETTER_PARAMETER, VALUE_PARAMETER), C15811g.m59834a(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, FIELD));
    }
}
