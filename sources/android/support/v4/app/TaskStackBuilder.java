package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.C0432b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class TaskStackBuilder implements Iterable<Intent> {
    /* renamed from: a */
    private static final C0385b f1313a;
    /* renamed from: b */
    private final ArrayList<Intent> f1314b = new ArrayList();
    /* renamed from: c */
    private final Context f1315c;

    public interface SupportParentable {
        @Nullable
        Intent getSupportParentActivityIntent();
    }

    /* renamed from: android.support.v4.app.TaskStackBuilder$b */
    static class C0385b {
        C0385b() {
        }
    }

    @RequiresApi(16)
    /* renamed from: android.support.v4.app.TaskStackBuilder$a */
    static class C2824a extends C0385b {
        C2824a() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f1313a = new C2824a();
        } else {
            f1313a = new C0385b();
        }
    }

    private TaskStackBuilder(Context context) {
        this.f1315c = context;
    }

    @NonNull
    /* renamed from: a */
    public static TaskStackBuilder m1440a(@NonNull Context context) {
        return new TaskStackBuilder(context);
    }

    @NonNull
    /* renamed from: a */
    public TaskStackBuilder m1443a(@NonNull Intent intent) {
        this.f1314b.add(intent);
        return this;
    }

    @NonNull
    /* renamed from: a */
    public TaskStackBuilder m1441a(@NonNull Activity activity) {
        Intent supportParentActivityIntent = activity instanceof SupportParentable ? ((SupportParentable) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C0420r.m1566a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f1315c.getPackageManager());
            }
            m1442a(component);
            m1443a(supportParentActivityIntent);
        }
        return this;
    }

    /* renamed from: a */
    public TaskStackBuilder m1442a(ComponentName componentName) {
        int size = this.f1314b.size();
        try {
            componentName = C0420r.m1567a(this.f1315c, componentName);
            while (componentName != null) {
                this.f1314b.add(size, componentName);
                componentName = C0420r.m1567a(this.f1315c, componentName.getComponent());
            }
            return this;
        } catch (ComponentName componentName2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(componentName2);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1314b.iterator();
    }

    /* renamed from: a */
    public void m1444a() {
        m1445a(null);
    }

    /* renamed from: a */
    public void m1445a(@Nullable Bundle bundle) {
        if (this.f1314b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f1314b.toArray(new Intent[this.f1314b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C0432b.m1642a(this.f1315c, intentArr, bundle) == null) {
            bundle = new Intent(intentArr[intentArr.length - 1]);
            bundle.addFlags(268435456);
            this.f1315c.startActivity(bundle);
        }
    }
}
