package com.tinder.places.p307b;

import android.app.Dialog;
import android.content.Context;
import com.tinder.R;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.dialogs.DialogError;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/places/dialog/PlacesErrorDialog;", "Lcom/tinder/dialogs/DialogError;", "context", "Landroid/content/Context;", "titleText", "", "bodyText", "(Landroid/content/Context;II)V", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.b.e */
public final class C12296e extends DialogError {
    /* renamed from: a */
    public static final C10124a f39820a = new C10124a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/tinder/places/dialog/PlacesErrorDialog$Companion;", "", "()V", "fromError", "Landroid/app/Dialog;", "error", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "context", "Landroid/content/Context;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.b.e$a */
    public static final class C10124a {
        private C10124a() {
        }

        @NotNull
        /* renamed from: a */
        public final Dialog m41365a(@Nullable PlacesApiException placesApiException, @NotNull Context context) {
            String format;
            C2668g.b(context, "context");
            if (placesApiException != null) {
                placesApiException = placesApiException.m37235a();
                if (placesApiException != null) {
                    placesApiException = ((Number) placesApiException).intValue();
                    C15828l c15828l = C15828l.f49033a;
                    String string = context.getString(R.string.error_contact_support_with_code);
                    C2668g.a(string, "context.getString(R.stri…ontact_support_with_code)");
                    Object[] objArr = new Object[]{Integer.valueOf(placesApiException)};
                    format = String.format(string, Arrays.copyOf(objArr, objArr.length));
                    C2668g.a(format, "java.lang.String.format(format, *args)");
                    if (format != null) {
                        placesApiException = DialogError.m37618a(context).m37615a(format).m37613a((int) R.string.oops).m37616a();
                        C2668g.a(placesApiException, "DialogError.builder(cont…                 .build()");
                        return (Dialog) placesApiException;
                    }
                }
            }
            format = context.getString(R.string.error_contact_support);
            placesApiException = DialogError.m37618a(context).m37615a(format).m37613a((int) R.string.oops).m37616a();
            C2668g.a(placesApiException, "DialogError.builder(cont…                 .build()");
            return (Dialog) placesApiException;
        }
    }
}
