package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.jetbrains.annotations.NotNull;

public final class GivenFunctionsMemberScope$createFakeOverrides$4 extends NonReportingOverrideStrategy {
    final /* synthetic */ ArrayList $result;
    final /* synthetic */ GivenFunctionsMemberScope this$0;

    GivenFunctionsMemberScope$createFakeOverrides$4(GivenFunctionsMemberScope givenFunctionsMemberScope, ArrayList arrayList) {
        this.this$0 = givenFunctionsMemberScope;
        this.$result = arrayList;
    }

    public void addFakeOverride(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "fakeOverride");
        OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
        this.$result.add(callableMemberDescriptor);
    }

    protected void conflict(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
        C2668g.b(callableMemberDescriptor, "fromSuper");
        C2668g.b(callableMemberDescriptor2, "fromCurrent");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Conflict in scope of ");
        stringBuilder.append(this.this$0.getContainingClass());
        stringBuilder.append(": ");
        stringBuilder.append(callableMemberDescriptor);
        stringBuilder.append(" vs ");
        stringBuilder.append(callableMemberDescriptor2);
        throw ((Throwable) new IllegalStateException(stringBuilder.toString().toString()));
    }
}
