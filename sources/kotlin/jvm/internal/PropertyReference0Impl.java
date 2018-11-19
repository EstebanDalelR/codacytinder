package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;

public class PropertyReference0Impl extends PropertyReference0 {
    /* renamed from: a */
    private final KDeclarationContainer f59928a;
    /* renamed from: b */
    private final String f59929b;
    /* renamed from: c */
    private final String f59930c;

    public PropertyReference0Impl(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        this.f59928a = kDeclarationContainer;
        this.f59929b = str;
        this.f59930c = str2;
    }

    public KDeclarationContainer getOwner() {
        return this.f59928a;
    }

    public String getName() {
        return this.f59929b;
    }

    public String getSignature() {
        return this.f59930c;
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }
}
