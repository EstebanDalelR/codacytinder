package io.paperdb;

class PaperTable<T> {
    T mContent;

    PaperTable() {
    }

    PaperTable(T t) {
        this.mContent = t;
    }
}
