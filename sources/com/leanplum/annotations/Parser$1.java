package com.leanplum.annotations;

import com.leanplum.Var;
import com.leanplum.callbacks.VariableCallback;
import com.leanplum.p069a.ao;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

final class Parser$1 extends VariableCallback<T> {
    /* renamed from: a */
    private /* synthetic */ WeakReference f25632a;
    /* renamed from: b */
    private /* synthetic */ boolean f25633b;
    /* renamed from: c */
    private /* synthetic */ Field f25634c;
    /* renamed from: d */
    private /* synthetic */ Var f25635d;

    Parser$1(WeakReference weakReference, boolean z, Field field, Var var) {
        this.f25632a = weakReference;
        this.f25633b = z;
        this.f25634c = field;
        this.f25635d = var;
    }

    public final void handle(Var<T> var) {
        Object[] objArr;
        StringBuilder stringBuilder;
        var = this.f25632a.get();
        if ((this.f25633b && var == null) || this.f25634c == null) {
            this.f25635d.removeValueChangedHandler(this);
            return;
        }
        try {
            boolean isAccessible = this.f25634c.isAccessible();
            if (!isAccessible) {
                this.f25634c.setAccessible(true);
            }
            this.f25634c.set(var, this.f25635d.value());
            if (!isAccessible) {
                this.f25634c.setAccessible(false);
            }
        } catch (Var<T> var2) {
            objArr = new Object[3];
            objArr[0] = "Leanplum";
            stringBuilder = new StringBuilder("Invalid value ");
            stringBuilder.append(this.f25635d.value());
            stringBuilder.append(" for field ");
            stringBuilder.append(this.f25635d.name());
            objArr[1] = stringBuilder.toString();
            objArr[2] = var2;
            ao.a(objArr);
        } catch (Var<T> var22) {
            objArr = new Object[3];
            objArr[0] = "Leanplum";
            stringBuilder = new StringBuilder("Error setting value for field ");
            stringBuilder.append(this.f25635d.name());
            objArr[1] = stringBuilder.toString();
            objArr[2] = var22;
            ao.a(objArr);
        }
    }
}
