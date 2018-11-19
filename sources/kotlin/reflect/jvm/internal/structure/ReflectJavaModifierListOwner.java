package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaModifierListOwner;", "isAbstract", "", "()Z", "isFinal", "isStatic", "modifiers", "", "getModifiers", "()I", "visibility", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "getVisibility", "()Lorg/jetbrains/kotlin/descriptors/Visibility;", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
public interface ReflectJavaModifierListOwner extends JavaModifierListOwner {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public static final class DefaultImpls {
        public static boolean isAbstract(ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            return Modifier.isAbstract(reflectJavaModifierListOwner.getModifiers());
        }

        public static boolean isStatic(ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            return Modifier.isStatic(reflectJavaModifierListOwner.getModifiers());
        }

        public static boolean isFinal(ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            return Modifier.isFinal(reflectJavaModifierListOwner.getModifiers());
        }

        @NotNull
        public static Visibility getVisibility(ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            reflectJavaModifierListOwner = reflectJavaModifierListOwner.getModifiers();
            if (Modifier.isPublic(reflectJavaModifierListOwner)) {
                reflectJavaModifierListOwner = Visibilities.PUBLIC;
                C2668g.a(reflectJavaModifierListOwner, "Visibilities.PUBLIC");
                return reflectJavaModifierListOwner;
            } else if (Modifier.isPrivate(reflectJavaModifierListOwner)) {
                reflectJavaModifierListOwner = Visibilities.PRIVATE;
                C2668g.a(reflectJavaModifierListOwner, "Visibilities.PRIVATE");
                return reflectJavaModifierListOwner;
            } else if (Modifier.isProtected(reflectJavaModifierListOwner)) {
                if (Modifier.isStatic(reflectJavaModifierListOwner) != null) {
                    reflectJavaModifierListOwner = JavaVisibilities.PROTECTED_STATIC_VISIBILITY;
                } else {
                    reflectJavaModifierListOwner = JavaVisibilities.PROTECTED_AND_PACKAGE;
                }
                C2668g.a(reflectJavaModifierListOwner, "if (Modifier.isStatic(mo…ies.PROTECTED_AND_PACKAGE");
                return reflectJavaModifierListOwner;
            } else {
                reflectJavaModifierListOwner = JavaVisibilities.PACKAGE_VISIBILITY;
                C2668g.a(reflectJavaModifierListOwner, "JavaVisibilities.PACKAGE_VISIBILITY");
                return reflectJavaModifierListOwner;
            }
        }
    }

    int getModifiers();
}
