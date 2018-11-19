package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalSignature;
import kotlin.reflect.jvm.internal.impl.util.CheckResult.SuccessCheck;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Checks {
    @NotNull
    private final Function1<FunctionDescriptor, String> additionalCheck;
    @NotNull
    private final Check[] checks;
    @Nullable
    private final Name name;
    @Nullable
    private final Collection<Name> nameList;
    @Nullable
    private final Regex regex;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$2 */
    static final class C191482 extends Lambda implements Function1 {
        public static final C191482 INSTANCE = new C191482();

        C191482() {
            super(1);
        }

        @Nullable
        public final Void invoke(@NotNull FunctionDescriptor functionDescriptor) {
            C2668g.b(functionDescriptor, "$receiver");
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$3 */
    static final class C191493 extends Lambda implements Function1 {
        public static final C191493 INSTANCE = new C191493();

        C191493() {
            super(1);
        }

        @Nullable
        public final Void invoke(@NotNull FunctionDescriptor functionDescriptor) {
            C2668g.b(functionDescriptor, "$receiver");
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$4 */
    static final class C191504 extends Lambda implements Function1 {
        public static final C191504 INSTANCE = new C191504();

        C191504() {
            super(1);
        }

        @Nullable
        public final Void invoke(@NotNull FunctionDescriptor functionDescriptor) {
            C2668g.b(functionDescriptor, "$receiver");
            return null;
        }
    }

    private Checks(Name name, Regex regex, Collection<Name> collection, Function1<? super FunctionDescriptor, String> function1, Check... checkArr) {
        this.name = name;
        this.regex = regex;
        this.nameList = collection;
        this.additionalCheck = function1;
        this.checks = checkArr;
    }

    public final boolean isApplicable(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "functionDescriptor");
        if (this.name != null && (C2668g.a(functionDescriptor.getName(), this.name) ^ 1) != 0) {
            return false;
        }
        if (this.regex != null) {
            String asString = functionDescriptor.getName().asString();
            C2668g.a(asString, "functionDescriptor.name.asString()");
            if (!this.regex.m59921a(asString)) {
                return false;
            }
        }
        return this.nameList == null || this.nameList.contains(functionDescriptor.getName()) != null;
    }

    @NotNull
    public final CheckResult checkAll(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "functionDescriptor");
        for (Check invoke : this.checks) {
            String invoke2 = invoke.invoke(functionDescriptor);
            if (invoke2 != null) {
                return (CheckResult) new IllegalSignature(invoke2);
            }
        }
        String str = (String) this.additionalCheck.invoke(functionDescriptor);
        if (str != null) {
            return new IllegalSignature(str);
        }
        return (CheckResult) SuccessCheck.INSTANCE;
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr, Function1 function1, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            function1 = C191482.INSTANCE;
        }
        this(name, checkArr, function1);
    }

    public Checks(@NotNull Name name, @NotNull Check[] checkArr, @NotNull Function1<? super FunctionDescriptor, String> function1) {
        C2668g.b(name, "name");
        C2668g.b(checkArr, "checks");
        C2668g.b(function1, "additionalChecks");
        this(name, null, null, (Function1) function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
    }

    public /* synthetic */ Checks(Regex regex, Check[] checkArr, Function1 function1, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            function1 = C191493.INSTANCE;
        }
        this(regex, checkArr, function1);
    }

    public Checks(@NotNull Regex regex, @NotNull Check[] checkArr, @NotNull Function1<? super FunctionDescriptor, String> function1) {
        C2668g.b(regex, "regex");
        C2668g.b(checkArr, "checks");
        C2668g.b(function1, "additionalChecks");
        this(null, regex, null, (Function1) function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
    }

    public /* synthetic */ Checks(Collection collection, Check[] checkArr, Function1 function1, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            function1 = C191504.INSTANCE;
        }
        this(collection, checkArr, function1);
    }

    public Checks(@NotNull Collection<Name> collection, @NotNull Check[] checkArr, @NotNull Function1<? super FunctionDescriptor, String> function1) {
        C2668g.b(collection, "nameList");
        C2668g.b(checkArr, "checks");
        C2668g.b(function1, "additionalChecks");
        this(null, null, (Collection) collection, (Function1) function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
    }
}
