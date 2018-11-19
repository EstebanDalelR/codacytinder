package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper.EMPTY;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Visibilities {
    public static final ReceiverValue ALWAYS_SUITABLE_RECEIVER = new ReceiverValue() {
        @NotNull
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    };
    public static final Visibility DEFAULT_VISIBILITY = PUBLIC;
    @Deprecated
    public static final ReceiverValue FALSE_IF_PROTECTED = new ReceiverValue() {
        @NotNull
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    };
    @NotNull
    public static final Visibility INHERITED = new Visibility("inherited", false) {
        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
            throw new IllegalStateException("Visibility is unknown yet");
        }
    };
    @NotNull
    public static final Visibility INTERNAL = new Visibility("internal", false) {
        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
            if (DescriptorUtils.getContainingModule(declarationDescriptor).shouldSeeInternalsOf(DescriptorUtils.getContainingModule(declarationDescriptorWithVisibility)) == null) {
                return null;
            }
            return Visibilities.MODULE_VISIBILITY_HELPER.isInFriendModule(declarationDescriptorWithVisibility, declarationDescriptor);
        }
    };
    @NotNull
    public static final Visibility INVISIBLE_FAKE = new Visibility("invisible_fake", false) {
        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
            return false;
        }
    };
    public static final Set<Visibility> INVISIBLE_FROM_OTHER_MODULES = Collections.unmodifiableSet(am.m64178a((Object[]) new Visibility[]{PRIVATE, PRIVATE_TO_THIS, INTERNAL, LOCAL}));
    private static final ReceiverValue IRRELEVANT_RECEIVER = new ReceiverValue() {
        @NotNull
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    };
    @NotNull
    public static final Visibility LOCAL = new Visibility("local", false) {
        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    };
    @NotNull
    private static final ModuleVisibilityHelper MODULE_VISIBILITY_HELPER;
    private static final Map<Visibility, Integer> ORDERED_VISIBILITIES;
    @NotNull
    public static final Visibility PRIVATE = new Visibility("private", false) {
        private boolean hasContainingSourceFile(@NotNull DeclarationDescriptor declarationDescriptor) {
            return DescriptorUtils.getContainingSourceFile(declarationDescriptor) != SourceFile.NO_SOURCE_FILE ? true : null;
        }

        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
            if (DescriptorUtils.isTopLevelDeclaration(declarationDescriptorWithVisibility) != null && hasContainingSourceFile(declarationDescriptor) != null) {
                return Visibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            if ((declarationDescriptorWithVisibility instanceof ConstructorDescriptor) != null) {
                receiverValue = ((ConstructorDescriptor) declarationDescriptorWithVisibility).getContainingDeclaration();
                if (!(!DescriptorUtils.isSealedClass(receiverValue) || DescriptorUtils.isTopLevelDeclaration(receiverValue) == null || (declarationDescriptor instanceof ConstructorDescriptor) == null || DescriptorUtils.isTopLevelDeclaration(declarationDescriptor.getContainingDeclaration()) == null || Visibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor) == null)) {
                    return true;
                }
            }
            while (declarationDescriptorWithVisibility != null) {
                declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.getContainingDeclaration();
                if ((declarationDescriptorWithVisibility instanceof ClassDescriptor) == null || DescriptorUtils.isCompanionObject(declarationDescriptorWithVisibility) != null) {
                    if ((declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) != null) {
                        break;
                    }
                }
                break;
            }
            receiverValue = null;
            if (declarationDescriptorWithVisibility == null) {
                return false;
            }
            Object containingDeclaration;
            while (containingDeclaration != null) {
                if (declarationDescriptorWithVisibility == containingDeclaration) {
                    return true;
                }
                if (containingDeclaration instanceof PackageFragmentDescriptor) {
                    if ((declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && ((PackageFragmentDescriptor) declarationDescriptorWithVisibility).getFqName().equals(((PackageFragmentDescriptor) containingDeclaration).getFqName()) && DescriptorUtils.areInSameModule(containingDeclaration, declarationDescriptorWithVisibility) != null) {
                        receiverValue = true;
                    }
                    return receiverValue;
                }
                containingDeclaration = containingDeclaration.getContainingDeclaration();
            }
            return false;
        }
    };
    @NotNull
    public static final Visibility PRIVATE_TO_THIS = new Visibility("private_to_this", false) {
        @NotNull
        public String getDisplayName() {
            return "private/*private to this*/";
        }

        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
            if (Visibilities.PRIVATE.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor) != null) {
                if (receiverValue == Visibilities.ALWAYS_SUITABLE_RECEIVER) {
                    return true;
                }
                if (receiverValue == Visibilities.IRRELEVANT_RECEIVER) {
                    return false;
                }
                declarationDescriptorWithVisibility = DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class);
                if (!(declarationDescriptorWithVisibility == null || (receiverValue instanceof ThisClassReceiver) == null)) {
                    return ((ThisClassReceiver) receiverValue).getClassDescriptor().getOriginal().equals(declarationDescriptorWithVisibility.getOriginal());
                }
            }
            return false;
        }
    };
    @NotNull
    public static final Visibility PROTECTED = new Visibility("protected", true) {
        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
            ClassDescriptor classDescriptor = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class);
            ClassDescriptor classDescriptor2 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, ClassDescriptor.class, false);
            if (classDescriptor2 == null) {
                return false;
            }
            if (classDescriptor != null && DescriptorUtils.isCompanionObject(classDescriptor)) {
                classDescriptor = (ClassDescriptor) DescriptorUtils.getParentOfType(classDescriptor, ClassDescriptor.class);
                if (classDescriptor != null && DescriptorUtils.isSubclass(classDescriptor2, classDescriptor)) {
                    return true;
                }
            }
            Object unwrapFakeOverrideToAnyDeclaration = DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility);
            ClassDescriptor classDescriptor3 = (ClassDescriptor) DescriptorUtils.getParentOfType(unwrapFakeOverrideToAnyDeclaration, ClassDescriptor.class);
            if (classDescriptor3 == null) {
                return false;
            }
            if (DescriptorUtils.isSubclass(classDescriptor2, classDescriptor3) && doesReceiverFitForProtectedVisibility(receiverValue, unwrapFakeOverrideToAnyDeclaration, classDescriptor2)) {
                return true;
            }
            return isVisible(receiverValue, declarationDescriptorWithVisibility, classDescriptor2.getContainingDeclaration());
        }

        private boolean doesReceiverFitForProtectedVisibility(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull ClassDescriptor classDescriptor) {
            boolean z = false;
            if (receiverValue == Visibilities.FALSE_IF_PROTECTED) {
                return false;
            }
            if (!(declarationDescriptorWithVisibility instanceof CallableMemberDescriptor) || (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) != null || receiverValue == Visibilities.ALWAYS_SUITABLE_RECEIVER) {
                return true;
            }
            if (receiverValue != Visibilities.IRRELEVANT_RECEIVER) {
                if (receiverValue != null) {
                    receiverValue = (receiverValue instanceof SuperCallReceiverValue) != null ? ((SuperCallReceiverValue) receiverValue).getThisType() : receiverValue.getType();
                    if (!(DescriptorUtils.isSubtypeOfClass(receiverValue, classDescriptor) == null && DynamicTypesKt.isDynamic(receiverValue) == null)) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }
    };
    @NotNull
    public static final Visibility PUBLIC = new Visibility("public", true) {
        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
            return true;
        }
    };
    @NotNull
    public static final Visibility UNKNOWN = new Visibility("unknown", false) {
        public boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
            return false;
        }
    };

    static {
        Map newHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(4);
        newHashMapWithExpectedSize.put(PRIVATE_TO_THIS, Integer.valueOf(0));
        newHashMapWithExpectedSize.put(PRIVATE, Integer.valueOf(0));
        newHashMapWithExpectedSize.put(INTERNAL, Integer.valueOf(1));
        newHashMapWithExpectedSize.put(PROTECTED, Integer.valueOf(1));
        newHashMapWithExpectedSize.put(PUBLIC, Integer.valueOf(2));
        ORDERED_VISIBILITIES = Collections.unmodifiableMap(newHashMapWithExpectedSize);
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        MODULE_VISIBILITY_HELPER = it.hasNext() ? (ModuleVisibilityHelper) it.next() : EMPTY.INSTANCE;
    }

    public static boolean isVisibleIgnoringReceiver(@NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
        return findInvisibleMember(ALWAYS_SUITABLE_RECEIVER, declarationDescriptorWithVisibility, declarationDescriptor) == null ? true : null;
    }

    public static boolean inSameFile(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        declarationDescriptor2 = DescriptorUtils.getContainingSourceFile(declarationDescriptor2);
        return declarationDescriptor2 != SourceFile.NO_SOURCE_FILE ? declarationDescriptor2.equals(DescriptorUtils.getContainingSourceFile(declarationDescriptor)) : null;
    }

    @Nullable
    public static DeclarationDescriptorWithVisibility findInvisibleMember(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
        Object obj = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.getOriginal();
        while (obj != null && obj.getVisibility() != LOCAL) {
            if (!obj.getVisibility().isVisible(receiverValue, obj, declarationDescriptor)) {
                return obj;
            }
            DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.getParentOfType(obj, DeclarationDescriptorWithVisibility.class);
        }
        if (declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) {
            receiverValue = findInvisibleMember(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).getUnderlyingConstructorDescriptor(), declarationDescriptor);
            if (receiverValue != null) {
                return receiverValue;
            }
        }
        return null;
    }

    @Nullable
    static Integer compareLocal(@NotNull Visibility visibility, @NotNull Visibility visibility2) {
        if (visibility == visibility2) {
            return Integer.valueOf(null);
        }
        Integer num = (Integer) ORDERED_VISIBILITIES.get(visibility);
        Integer num2 = (Integer) ORDERED_VISIBILITIES.get(visibility2);
        if (!(num == null || num2 == null)) {
            if (!num.equals(num2)) {
                return Integer.valueOf(num.intValue() - num2.intValue());
            }
        }
        return null;
    }

    @Nullable
    public static Integer compare(@NotNull Visibility visibility, @NotNull Visibility visibility2) {
        Integer compareTo = visibility.compareTo(visibility2);
        if (compareTo != null) {
            return compareTo;
        }
        visibility = visibility2.compareTo(visibility);
        return visibility != null ? Integer.valueOf(-visibility.intValue()) : null;
    }

    public static boolean isPrivate(@NotNull Visibility visibility) {
        if (visibility != PRIVATE) {
            if (visibility != PRIVATE_TO_THIS) {
                return null;
            }
        }
        return true;
    }
}
