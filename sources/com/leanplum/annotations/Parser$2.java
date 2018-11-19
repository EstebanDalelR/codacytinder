package com.leanplum.annotations;

import com.leanplum.Var;
import com.leanplum.callbacks.VariableCallback;
import com.leanplum.p069a.ao;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

final class Parser$2 extends VariableCallback<String> {
    /* renamed from: a */
    private /* synthetic */ WeakReference f25636a;
    /* renamed from: b */
    private /* synthetic */ boolean f25637b;
    /* renamed from: c */
    private /* synthetic */ Field f25638c;
    /* renamed from: d */
    private /* synthetic */ Var f25639d;

    Parser$2(WeakReference weakReference, boolean z, Field field, Var var) {
        this.f25636a = weakReference;
        this.f25637b = z;
        this.f25638c = field;
        this.f25639d = var;
    }

    public final void handle(Var<String> var) {
        Object[] objArr;
        StringBuilder stringBuilder;
        var = this.f25636a.get();
        if ((this.f25637b && var == null) || this.f25638c == null) {
            this.f25639d.removeFileReadyHandler(this);
            return;
        }
        try {
            boolean isAccessible = this.f25638c.isAccessible();
            if (!isAccessible) {
                this.f25638c.setAccessible(true);
            }
            this.f25638c.set(var, this.f25639d.fileValue());
            if (!isAccessible) {
                this.f25638c.setAccessible(false);
            }
        } catch (Var<String> var2) {
            objArr = new Object[3];
            objArr[0] = "Leanplum";
            stringBuilder = new StringBuilder("Invalid value ");
            stringBuilder.append((String) this.f25639d.value());
            stringBuilder.append(" for field ");
            stringBuilder.append(this.f25639d.name());
            objArr[1] = stringBuilder.toString();
            objArr[2] = var2;
            ao.a(objArr);
        } catch (Var<String> var22) {
            objArr = new Object[3];
            objArr[0] = "Leanplum";
            stringBuilder = new StringBuilder("Error setting value for field ");
            stringBuilder.append(this.f25639d.name());
            objArr[1] = stringBuilder.toString();
            objArr[2] = var22;
            ao.a(objArr);
        }
    }
}
