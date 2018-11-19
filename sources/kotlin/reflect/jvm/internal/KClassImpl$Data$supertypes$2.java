package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "T", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class KClassImpl$Data$supertypes$2 extends Lambda implements Function0<List<? extends KTypeImpl>> {
    final /* synthetic */ Data this$0;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "", "T", "invoke"}, k = 3, mv = {1, 1, 10})
    /* renamed from: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$3 */
    static final class C190763 extends Lambda implements Function0<Class<Object>> {
        public static final C190763 INSTANCE = new C190763();

        C190763() {
            super(0);
        }

        @NotNull
        public final Class<Object> invoke() {
            return Object.class;
        }
    }

    KClassImpl$Data$supertypes$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    @NotNull
    public final List<KTypeImpl> invoke() {
        TypeConstructor typeConstructor = this.this$0.getDescriptor().getTypeConstructor();
        C2668g.a(typeConstructor, "descriptor.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        ArrayList arrayList = new ArrayList(supertypes.size());
        C2668g.a(supertypes, "kotlinTypes");
        for (KotlinType kotlinType : supertypes) {
            Collection collection = arrayList;
            C2668g.a(kotlinType, "kotlinType");
            collection.add(new KTypeImpl(kotlinType, new KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1(kotlinType, this)));
        }
        Collection collection2 = arrayList;
        if (!KotlinBuiltIns.isSpecialClassWithNoSupertypes(this.this$0.getDescriptor())) {
            Iterable<KTypeImpl> iterable = arrayList;
            Object obj = 1;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (KTypeImpl type : iterable) {
                    Object obj2;
                    ClassDescriptor classDescriptorForType = DescriptorUtils.getClassDescriptorForType(type.getType());
                    C2668g.a(classDescriptorForType, "DescriptorUtils.getClassDescriptorForType(it.type)");
                    ClassKind kind = classDescriptorForType.getKind();
                    if (kind != ClassKind.INTERFACE) {
                        if (kind != ClassKind.ANNOTATION_CLASS) {
                            obj2 = null;
                            continue;
                            if (obj2 == null) {
                                obj = null;
                                break;
                            }
                        }
                    }
                    obj2 = 1;
                    continue;
                    if (obj2 == null) {
                        obj = null;
                        break;
                    }
                }
            }
            if (obj != null) {
                SimpleType anyType = DescriptorUtilsKt.getBuiltIns(this.this$0.getDescriptor()).getAnyType();
                C2668g.a(anyType, "descriptor.builtIns.anyType");
                collection2.add(new KTypeImpl(anyType, C190763.INSTANCE));
            }
        }
        return CollectionsKt.compact(arrayList);
    }
}
