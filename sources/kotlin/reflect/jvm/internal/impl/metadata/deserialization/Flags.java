package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Flags {
    public static final FlagField<Kind> CLASS_KIND = FlagField.after(MODALITY, Kind.values());
    public static final BooleanFlagField DECLARES_DEFAULT_VALUE = FlagField.booleanAfter(HAS_ANNOTATIONS);
    public static final BooleanFlagField HAS_ANNOTATIONS = FlagField.booleanFirst();
    public static final BooleanFlagField HAS_CONSTANT = FlagField.booleanAfter(IS_LATEINIT);
    public static final BooleanFlagField HAS_GETTER = FlagField.booleanAfter(IS_VAR);
    public static final BooleanFlagField HAS_SETTER = FlagField.booleanAfter(HAS_GETTER);
    public static final BooleanFlagField IS_CONST = FlagField.booleanAfter(HAS_SETTER);
    public static final BooleanFlagField IS_CROSSINLINE = FlagField.booleanAfter(DECLARES_DEFAULT_VALUE);
    public static final BooleanFlagField IS_DATA = FlagField.booleanAfter(IS_INNER);
    public static final BooleanFlagField IS_DELEGATED = FlagField.booleanAfter(IS_EXTERNAL_PROPERTY);
    public static final BooleanFlagField IS_EXPECT_CLASS = FlagField.booleanAfter(IS_EXTERNAL_CLASS);
    public static final BooleanFlagField IS_EXPECT_FUNCTION = FlagField.booleanAfter(IS_SUSPEND);
    public static final BooleanFlagField IS_EXPECT_PROPERTY = FlagField.booleanAfter(IS_DELEGATED);
    public static final BooleanFlagField IS_EXTERNAL_ACCESSOR = FlagField.booleanAfter(IS_NOT_DEFAULT);
    public static final BooleanFlagField IS_EXTERNAL_CLASS = FlagField.booleanAfter(IS_DATA);
    public static final BooleanFlagField IS_EXTERNAL_FUNCTION = FlagField.booleanAfter(IS_TAILREC);
    public static final BooleanFlagField IS_EXTERNAL_PROPERTY = FlagField.booleanAfter(HAS_CONSTANT);
    public static final BooleanFlagField IS_INFIX = FlagField.booleanAfter(IS_OPERATOR);
    public static final BooleanFlagField IS_INLINE = FlagField.booleanAfter(IS_INFIX);
    public static final BooleanFlagField IS_INLINE_ACCESSOR = FlagField.booleanAfter(IS_EXTERNAL_ACCESSOR);
    public static final BooleanFlagField IS_INLINE_CLASS = FlagField.booleanAfter(IS_EXPECT_CLASS);
    public static final BooleanFlagField IS_INNER = FlagField.booleanAfter(CLASS_KIND);
    public static final BooleanFlagField IS_LATEINIT = FlagField.booleanAfter(IS_CONST);
    public static final BooleanFlagField IS_NEGATED = FlagField.booleanFirst();
    public static final BooleanFlagField IS_NOINLINE = FlagField.booleanAfter(IS_CROSSINLINE);
    public static final BooleanFlagField IS_NOT_DEFAULT = FlagField.booleanAfter(MODALITY);
    public static final BooleanFlagField IS_NULL_CHECK_PREDICATE = FlagField.booleanAfter(IS_NEGATED);
    public static final BooleanFlagField IS_OPERATOR = FlagField.booleanAfter(MEMBER_KIND);
    public static final BooleanFlagField IS_SECONDARY = FlagField.booleanAfter(VISIBILITY);
    public static final BooleanFlagField IS_SUSPEND = FlagField.booleanAfter(IS_EXTERNAL_FUNCTION);
    public static final BooleanFlagField IS_TAILREC = FlagField.booleanAfter(IS_INLINE);
    public static final BooleanFlagField IS_VAR = FlagField.booleanAfter(MEMBER_KIND);
    public static final FlagField<MemberKind> MEMBER_KIND = FlagField.after(MODALITY, MemberKind.values());
    public static final FlagField<Modality> MODALITY = FlagField.after(VISIBILITY, Modality.values());
    public static final BooleanFlagField SUSPEND_TYPE = FlagField.booleanFirst();
    public static final FlagField<Visibility> VISIBILITY = FlagField.after(HAS_ANNOTATIONS, Visibility.values());

    public static abstract class FlagField<E> {
        protected final int bitWidth;
        protected final int offset;

        public abstract E get(int i);

        public static <E extends EnumLite> FlagField<E> after(FlagField<?> flagField, E[] eArr) {
            return new EnumLiteFlagField(flagField.offset + flagField.bitWidth, eArr);
        }

        public static BooleanFlagField booleanFirst() {
            return new BooleanFlagField(0);
        }

        public static BooleanFlagField booleanAfter(FlagField<?> flagField) {
            return new BooleanFlagField(flagField.offset + flagField.bitWidth);
        }

        private FlagField(int i, int i2) {
            this.offset = i;
            this.bitWidth = i2;
        }
    }

    public static class BooleanFlagField extends FlagField<Boolean> {
        public BooleanFlagField(int i) {
            super(i, 1);
        }

        @NotNull
        public Boolean get(int i) {
            boolean z = true;
            if ((i & (1 << this.offset)) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    private static class EnumLiteFlagField<E extends EnumLite> extends FlagField<E> {
        private final E[] values;

        public EnumLiteFlagField(int i, E[] eArr) {
            super(i, bitWidth(eArr));
            this.values = eArr;
        }

        private static <E> int bitWidth(@NotNull E[] eArr) {
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Empty enum: ");
            stringBuilder.append(eArr.getClass());
            throw new IllegalStateException(stringBuilder.toString());
        }

        @Nullable
        public E get(int i) {
            i = (i & (((1 << this.bitWidth) - 1) << this.offset)) >> this.offset;
            for (E e : this.values) {
                if (e.getNumber() == i) {
                    return e;
                }
            }
            return null;
        }
    }
}
