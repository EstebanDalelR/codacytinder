package com.squareup.picasso;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import com.squareup.picasso.C6107q.C6106a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.d */
class C7253d extends C6107q {
    /* renamed from: a */
    private static final UriMatcher f26147a = new UriMatcher(-1);
    /* renamed from: b */
    private final Context f26148b;

    @TargetApi(14)
    /* renamed from: com.squareup.picasso.d$a */
    private static class C6091a {
        /* renamed from: a */
        static InputStream m26476a(ContentResolver contentResolver, Uri uri) {
            return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        f26147a.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f26147a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f26147a.addURI("com.android.contacts", "contacts/#/photo", 2);
        f26147a.addURI("com.android.contacts", "contacts/#", 3);
        f26147a.addURI("com.android.contacts", "display_photo/#", 4);
    }

    C7253d(Context context) {
        this.f26148b = context;
    }

    /* renamed from: a */
    public boolean mo6575a(C6104o c6104o) {
        Uri uri = c6104o.f22430d;
        return ("content".equals(uri.getScheme()) && Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f26147a.match(c6104o.f22430d) != -1) ? true : null;
    }

    /* renamed from: a */
    public C6106a mo6574a(C6104o c6104o, int i) throws IOException {
        InputStream b = m31067b(c6104o);
        return b != null ? new C6106a(b, LoadedFrom.DISK) : 0;
    }

    /* renamed from: b */
    private InputStream m31067b(C6104o c6104o) throws IOException {
        ContentResolver contentResolver = this.f26148b.getContentResolver();
        c6104o = c6104o.f22430d;
        switch (f26147a.match(c6104o)) {
            case 1:
                c6104o = Contacts.lookupContact(contentResolver, c6104o);
                if (c6104o == null) {
                    return null;
                }
                break;
            case 2:
            case 4:
                return contentResolver.openInputStream(c6104o);
            case 3:
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid uri: ");
                stringBuilder.append(c6104o);
                throw new IllegalStateException(stringBuilder.toString());
        }
        if (VERSION.SDK_INT < 14) {
            return Contacts.openContactPhotoInputStream(contentResolver, c6104o);
        }
        return C6091a.m26476a(contentResolver, c6104o);
    }
}
