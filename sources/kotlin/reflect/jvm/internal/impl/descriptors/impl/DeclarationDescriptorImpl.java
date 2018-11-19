package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

public abstract class DeclarationDescriptorImpl extends AnnotatedImpl implements DeclarationDescriptor {
    @NotNull
    private final Name name;

    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this;
    }

    public DeclarationDescriptorImpl(@NotNull Annotations annotations, @NotNull Name name) {
        super(annotations);
        this.name = name;
    }

    @NotNull
    public Name getName() {
        return this.name;
    }

    public String toString() {
        return toString(this);
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String toString(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0038 }
        r0.<init>();	 Catch:{ Throwable -> 0x0038 }
        r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.DEBUG_TEXT;	 Catch:{ Throwable -> 0x0038 }
        r1 = r1.render(r2);	 Catch:{ Throwable -> 0x0038 }
        r0.append(r1);	 Catch:{ Throwable -> 0x0038 }
        r1 = "[";	 Catch:{ Throwable -> 0x0038 }
        r0.append(r1);	 Catch:{ Throwable -> 0x0038 }
        r1 = r2.getClass();	 Catch:{ Throwable -> 0x0038 }
        r1 = r1.getSimpleName();	 Catch:{ Throwable -> 0x0038 }
        r0.append(r1);	 Catch:{ Throwable -> 0x0038 }
        r1 = "@";	 Catch:{ Throwable -> 0x0038 }
        r0.append(r1);	 Catch:{ Throwable -> 0x0038 }
        r1 = java.lang.System.identityHashCode(r2);	 Catch:{ Throwable -> 0x0038 }
        r1 = java.lang.Integer.toHexString(r1);	 Catch:{ Throwable -> 0x0038 }
        r0.append(r1);	 Catch:{ Throwable -> 0x0038 }
        r1 = "]";	 Catch:{ Throwable -> 0x0038 }
        r0.append(r1);	 Catch:{ Throwable -> 0x0038 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0038 }
        return r0;
    L_0x0038:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r2.getClass();
        r1 = r1.getSimpleName();
        r0.append(r1);
        r1 = " ";
        r0.append(r1);
        r2 = r2.getName();
        r0.append(r2);
        r2 = r0.toString();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl.toString(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor):java.lang.String");
    }
}
