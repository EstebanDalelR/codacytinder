package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.C15811g;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public final class EnumValue extends ConstantValue<Pair<? extends ClassId, ? extends Name>> {
    @NotNull
    private final ClassId enumClassId;
    @NotNull
    private final Name enumEntryName;

    public EnumValue(@NotNull ClassId classId, @NotNull Name name) {
        C2668g.b(classId, "enumClassId");
        C2668g.b(name, "enumEntryName");
        super(C15811g.m59834a(classId, name));
        this.enumClassId = classId;
        this.enumEntryName = name;
    }

    @NotNull
    public final Name getEnumEntryName() {
        return this.enumEntryName;
    }

    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(moduleDescriptor, "module");
        moduleDescriptor = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, this.enumClassId);
        if (moduleDescriptor != null) {
            if (!DescriptorUtils.isEnumClass(moduleDescriptor)) {
                moduleDescriptor = null;
            }
            if (moduleDescriptor != null) {
                moduleDescriptor = moduleDescriptor.getDefaultType();
                if (moduleDescriptor != null) {
                    return (KotlinType) moduleDescriptor;
                }
            }
        }
        moduleDescriptor = new StringBuilder();
        moduleDescriptor.append("Containing class for error-class based enum entry ");
        moduleDescriptor.append(this.enumClassId);
        moduleDescriptor.append('.');
        moduleDescriptor.append(this.enumEntryName);
        moduleDescriptor = ErrorUtils.createErrorType(moduleDescriptor.toString());
        C2668g.a(moduleDescriptor, "ErrorUtils.createErrorTy…mClassId.$enumEntryName\")");
        return (KotlinType) moduleDescriptor;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.enumClassId.getShortClassName());
        stringBuilder.append('.');
        stringBuilder.append(this.enumEntryName);
        return stringBuilder.toString();
    }
}
