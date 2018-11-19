package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C17554o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.Member;
import kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsBoolean;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsInt;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsUnit;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.AtLeast;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.Equals;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter;
import org.jetbrains.annotations.NotNull;

public final class OperatorChecks extends AbstractModifierChecks {
    public static final OperatorChecks INSTANCE = new OperatorChecks();
    @NotNull
    private static final List<Checks> checks;

    static {
        r0 = new Checks[18];
        Name name = OperatorNameConventions.GET;
        C2668g.a(name, "GET");
        r0[0] = new Checks(name, new Check[]{MemberOrExtension.INSTANCE, new AtLeast(1)}, null, 4, null);
        name = OperatorNameConventions.SET;
        C2668g.a(name, "SET");
        r0[1] = new Checks(name, new Check[]{MemberOrExtension.INSTANCE, new AtLeast(2)}, (Function1) OperatorChecks$checks$1.INSTANCE);
        Name name2 = OperatorNameConventions.GET_VALUE;
        C2668g.a(name2, "GET_VALUE");
        r0[2] = new Checks(name2, new Check[]{MemberOrExtension.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE, new AtLeast(2), IsKPropertyCheck.INSTANCE}, null, 4, null);
        Name name3 = OperatorNameConventions.SET_VALUE;
        C2668g.a(name3, "SET_VALUE");
        r0[3] = new Checks(name3, new Check[]{MemberOrExtension.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE, new AtLeast(3), IsKPropertyCheck.INSTANCE}, null, 4, null);
        name2 = OperatorNameConventions.PROVIDE_DELEGATE;
        C2668g.a(name2, "PROVIDE_DELEGATE");
        r0[4] = new Checks(name2, new Check[]{MemberOrExtension.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE, new Equals(2), IsKPropertyCheck.INSTANCE}, null, 4, null);
        name3 = OperatorNameConventions.INVOKE;
        C2668g.a(name3, "INVOKE");
        r0[5] = new Checks(name3, new Check[]{MemberOrExtension.INSTANCE}, null, 4, null);
        name2 = OperatorNameConventions.CONTAINS;
        C2668g.a(name2, "CONTAINS");
        r0[6] = new Checks(name2, new Check[]{MemberOrExtension.INSTANCE, SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE, ReturnsBoolean.INSTANCE}, null, 4, null);
        name2 = OperatorNameConventions.ITERATOR;
        C2668g.a(name2, "ITERATOR");
        r0[7] = new Checks(name2, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE}, null, 4, null);
        name2 = OperatorNameConventions.NEXT;
        C2668g.a(name2, "NEXT");
        r0[8] = new Checks(name2, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE}, null, 4, null);
        name2 = OperatorNameConventions.HAS_NEXT;
        C2668g.a(name2, "HAS_NEXT");
        r0[9] = new Checks(name2, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE, ReturnsBoolean.INSTANCE}, null, 4, null);
        name2 = OperatorNameConventions.RANGE_TO;
        C2668g.a(name2, "RANGE_TO");
        r0[10] = new Checks(name2, new Check[]{MemberOrExtension.INSTANCE, SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE}, null, 4, null);
        name3 = OperatorNameConventions.EQUALS;
        C2668g.a(name3, "EQUALS");
        r0[11] = new Checks(name3, new Check[]{Member.INSTANCE}, (Function1) OperatorChecks$checks$2.INSTANCE);
        name2 = OperatorNameConventions.COMPARE_TO;
        C2668g.a(name2, "COMPARE_TO");
        r0[12] = new Checks(name2, new Check[]{MemberOrExtension.INSTANCE, ReturnsInt.INSTANCE, SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE}, null, 4, null);
        r0[13] = new Checks((Collection) OperatorNameConventions.BINARY_OPERATION_NAMES, new Check[]{MemberOrExtension.INSTANCE, SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE}, null, 4, null);
        r0[14] = new Checks((Collection) OperatorNameConventions.SIMPLE_UNARY_OPERATION_NAMES, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE}, null, 4, null);
        r0[15] = new Checks((Collection) C17554o.m64199b((Object[]) new Name[]{OperatorNameConventions.INC, OperatorNameConventions.DEC}), new Check[]{MemberOrExtension.INSTANCE}, (Function1) OperatorChecks$checks$3.INSTANCE);
        r0[16] = new Checks((Collection) OperatorNameConventions.ASSIGNMENT_OPERATIONS, new Check[]{MemberOrExtension.INSTANCE, ReturnsUnit.INSTANCE, SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE}, null, 4, null);
        r0[17] = new Checks(OperatorNameConventions.COMPONENT_REGEX, new Check[]{MemberOrExtension.INSTANCE, NoValueParameters.INSTANCE}, null, 4, null);
        checks = C17554o.m64199b((Object[]) r0);
    }

    private OperatorChecks() {
    }

    @NotNull
    public List<Checks> getChecks$descriptors() {
        return checks;
    }
}
