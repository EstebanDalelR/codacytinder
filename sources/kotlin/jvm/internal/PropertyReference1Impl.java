package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;

public class PropertyReference1Impl extends PropertyReference1 {
    /* renamed from: a */
    private final KDeclarationContainer f59931a;
    /* renamed from: b */
    private final String f59932b;
    /* renamed from: c */
    private final String f59933c;

    public PropertyReference1Impl(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        this.f59931a = kDeclarationContainer;
        this.f59932b = str;
        this.f59933c = str2;
    }

    public KDeclarationContainer getOwner() {
        return this.f59931a;
    }

    public String getName() {
        return this.f59932b;
    }

    public String getSignature() {
        return this.f59933c;
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }
}
