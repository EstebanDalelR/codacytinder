package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

final class DateTimeZone$Stub implements Serializable {
    private static final long serialVersionUID = -6471952376487863581L;
    /* renamed from: a */
    private transient String f60067a;

    DateTimeZone$Stub(String str) {
        this.f60067a = str;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.f60067a);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.f60067a = objectInputStream.readUTF();
    }

    private Object readResolve() throws ObjectStreamException {
        return DateTimeZone.a(this.f60067a);
    }
}
