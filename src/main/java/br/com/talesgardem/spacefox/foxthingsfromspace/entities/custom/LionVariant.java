package br.com.talesgardem.spacefox.foxthingsfromspace.entities.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum LionVariant {
    RED(0),
    BROWN(1);

    private static final LionVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(LionVariant::getId)
    ).toArray(LionVariant[]::new);

    private final int id;

    LionVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static LionVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
