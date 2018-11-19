package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import org.jetbrains.annotations.NotNull;

public interface JavaMethod extends JavaMember, JavaTypeParameterListOwner {
    boolean getHasAnnotationParameterDefaultValue();

    @NotNull
    JavaType getReturnType();

    @NotNull
    List<JavaValueParameter> getValueParameters();
}
