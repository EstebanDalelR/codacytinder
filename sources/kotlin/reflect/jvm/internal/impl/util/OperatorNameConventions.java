package kotlin.reflect.jvm.internal.impl.util;

import com.tinder.api.ManagerWebServices;
import java.util.Set;
import kotlin.jvm.JvmField;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

public final class OperatorNameConventions {
    @NotNull
    @JvmField
    public static final Name AND = Name.identifier("and");
    @NotNull
    @JvmField
    public static final Set<Name> ASSIGNMENT_OPERATIONS = am.m64178a((Object[]) new Name[]{TIMES_ASSIGN, DIV_ASSIGN, MOD_ASSIGN, REM_ASSIGN, PLUS_ASSIGN, MINUS_ASSIGN});
    @NotNull
    @JvmField
    public static final Set<Name> BINARY_OPERATION_NAMES = am.m64178a((Object[]) new Name[]{TIMES, PLUS, MINUS, DIV, MOD, REM, RANGE_TO});
    @NotNull
    @JvmField
    public static final Name COMPARE_TO = Name.identifier("compareTo");
    @NotNull
    @JvmField
    public static final Regex COMPONENT_REGEX = new Regex("component\\d+");
    @NotNull
    @JvmField
    public static final Name CONTAINS = Name.identifier("contains");
    @NotNull
    @JvmField
    public static final Name DEC = Name.identifier("dec");
    @NotNull
    @JvmField
    public static final Name DIV = Name.identifier("div");
    @NotNull
    @JvmField
    public static final Name DIV_ASSIGN = Name.identifier("divAssign");
    @NotNull
    @JvmField
    public static final Name EQUALS = Name.identifier("equals");
    @NotNull
    @JvmField
    public static final Name GET = Name.identifier("get");
    @NotNull
    @JvmField
    public static final Name GET_VALUE = Name.identifier("getValue");
    @NotNull
    @JvmField
    public static final Name HAS_NEXT = Name.identifier("hasNext");
    @NotNull
    @JvmField
    public static final Name INC = Name.identifier("inc");
    public static final OperatorNameConventions INSTANCE = new OperatorNameConventions();
    @NotNull
    @JvmField
    public static final Name INVOKE = Name.identifier("invoke");
    @NotNull
    @JvmField
    public static final Name ITERATOR = Name.identifier("iterator");
    @NotNull
    @JvmField
    public static final Name MINUS = Name.identifier("minus");
    @NotNull
    @JvmField
    public static final Name MINUS_ASSIGN = Name.identifier("minusAssign");
    @NotNull
    @JvmField
    public static final Name MOD = Name.identifier("mod");
    @NotNull
    @JvmField
    public static final Name MOD_ASSIGN = Name.identifier("modAssign");
    @NotNull
    @JvmField
    public static final Name NEXT = Name.identifier(ManagerWebServices.FB_PARAM_NEXT);
    @NotNull
    @JvmField
    public static final Name NOT = Name.identifier("not");
    @NotNull
    @JvmField
    public static final Name OR = Name.identifier("or");
    @NotNull
    @JvmField
    public static final Name PLUS = Name.identifier("plus");
    @NotNull
    @JvmField
    public static final Name PLUS_ASSIGN = Name.identifier("plusAssign");
    @NotNull
    @JvmField
    public static final Name PROVIDE_DELEGATE = Name.identifier("provideDelegate");
    @NotNull
    @JvmField
    public static final Name RANGE_TO = Name.identifier("rangeTo");
    @NotNull
    @JvmField
    public static final Name REM = Name.identifier("rem");
    @NotNull
    @JvmField
    public static final Name REM_ASSIGN = Name.identifier("remAssign");
    @NotNull
    @JvmField
    public static final Name SET = Name.identifier("set");
    @NotNull
    @JvmField
    public static final Name SET_VALUE = Name.identifier("setValue");
    @NotNull
    @JvmField
    public static final Set<Name> SIMPLE_UNARY_OPERATION_NAMES = am.m64178a((Object[]) new Name[]{UNARY_PLUS, UNARY_MINUS, NOT});
    @NotNull
    @JvmField
    public static final Name TIMES = Name.identifier("times");
    @NotNull
    @JvmField
    public static final Name TIMES_ASSIGN = Name.identifier("timesAssign");
    @NotNull
    @JvmField
    public static final Name UNARY_MINUS = Name.identifier("unaryMinus");
    @NotNull
    @JvmField
    public static final Set<Name> UNARY_OPERATION_NAMES = am.m64178a((Object[]) new Name[]{INC, DEC, UNARY_PLUS, UNARY_MINUS, NOT});
    @NotNull
    @JvmField
    public static final Name UNARY_PLUS = Name.identifier("unaryPlus");

    private OperatorNameConventions() {
    }
}
