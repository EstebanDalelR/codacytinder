package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.joda.time.field.AbstractReadableInstantFieldProperty;

public final class DateTime$Property extends AbstractReadableInstantFieldProperty {
    private static final long serialVersionUID = -6983323811635733510L;
    /* renamed from: a */
    private DateTime f60810a;
    /* renamed from: b */
    private C19305b f60811b;

    DateTime$Property(DateTime dateTime, C19305b c19305b) {
        this.f60810a = dateTime;
        this.f60811b = c19305b;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f60810a);
        objectOutputStream.writeObject(this.f60811b.mo14534a());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f60810a = (DateTime) objectInputStream.readObject();
        this.f60811b = ((DateTimeFieldType) objectInputStream.readObject()).mo14453a(this.f60810a.getChronology());
    }

    /* renamed from: a */
    public C19305b mo14450a() {
        return this.f60811b;
    }

    /* renamed from: b */
    protected long mo14451b() {
        return this.f60810a.getMillis();
    }

    /* renamed from: c */
    protected C19304a mo14452c() {
        return this.f60810a.getChronology();
    }
}
