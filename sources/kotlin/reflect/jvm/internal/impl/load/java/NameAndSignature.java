package kotlin.reflect.jvm.internal.impl.load.java;

import com.tinder.api.ManagerWebServices;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

final class NameAndSignature {
    @NotNull
    private final Name name;
    @NotNull
    private final String signature;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NameAndSignature) {
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                if (C2668g.a(this.name, nameAndSignature.name) && C2668g.a(this.signature, nameAndSignature.signature)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Name name = this.name;
        int i = 0;
        int hashCode = (name != null ? name.hashCode() : 0) * 31;
        String str = this.signature;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NameAndSignature(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.signature);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public NameAndSignature(@NotNull Name name, @NotNull String str) {
        C2668g.b(name, "name");
        C2668g.b(str, ManagerWebServices.PARAM_SIGNATURE);
        this.name = name;
        this.signature = str;
    }

    @NotNull
    public final Name getName() {
        return this.name;
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }
}
