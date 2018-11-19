package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

final class Jsr305State$description$2 extends Lambda implements Function0<String[]> {
    final /* synthetic */ Jsr305State this$0;

    Jsr305State$description$2(Jsr305State jsr305State) {
        this.this$0 = jsr305State;
        super(0);
    }

    @NotNull
    public final String[] invoke() {
        List arrayList = new ArrayList();
        arrayList.add(this.this$0.getGlobal().getDescription());
        ReportLevel migration = this.this$0.getMigration();
        if (migration != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("under-migration:");
            stringBuilder.append(migration.getDescription());
            arrayList.add(stringBuilder.toString());
        }
        for (Entry entry : this.this$0.getUser().entrySet()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append('@');
            stringBuilder2.append((String) entry.getKey());
            stringBuilder2.append(':');
            stringBuilder2.append(((ReportLevel) entry.getValue()).getDescription());
            arrayList.add(stringBuilder2.toString());
        }
        Object[] toArray = arrayList.toArray(new String[0]);
        if (toArray != null) {
            return (String[]) toArray;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
