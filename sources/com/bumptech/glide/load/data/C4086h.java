package com.bumptech.glide.load.data;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.h */
public class C4086h extends C3026f<InputStream> {
    /* renamed from: a */
    private static final UriMatcher f12959a = new UriMatcher(-1);

    /* renamed from: b */
    protected /* synthetic */ Object mo3183b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        return m15942a(uri, contentResolver);
    }

    static {
        f12959a.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f12959a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f12959a.addURI("com.android.contacts", "contacts/#/photo", 2);
        f12959a.addURI("com.android.contacts", "contacts/#", 3);
        f12959a.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    }

    public C4086h(Context context, Uri uri) {
        super(context, uri);
    }

    /* renamed from: a */
    protected InputStream m15942a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        return m15941a(uri, contentResolver, f12959a.match(uri));
    }

    /* renamed from: a */
    protected void m15943a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: a */
    private InputStream m15941a(Uri uri, ContentResolver contentResolver, int i) throws FileNotFoundException {
        if (i != 1 && i != 3) {
            return contentResolver.openInputStream(uri);
        }
        if (i == 1) {
            uri = Contacts.lookupContact(contentResolver, uri);
            if (uri == null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
        }
        return m15940a(contentResolver, uri);
    }

    @TargetApi(14)
    /* renamed from: a */
    private InputStream m15940a(ContentResolver contentResolver, Uri uri) {
        if (VERSION.SDK_INT < 14) {
            return Contacts.openContactPhotoInputStream(contentResolver, uri);
        }
        return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
