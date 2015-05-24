package org.spongepowered.api.data.value;

import org.spongepowered.api.data.component.Component;

public class BoundValue<V> {

    private final Value<V> value;
    private final Component component;

    private BoundValue(Value<V> value, Component component) {
        this.value = value;
        this.component = component;
    }

    public V get() {
        return component.getDataObject().tryGet(value, value.getValueClass());
    }

    public static <V> BoundValue<V> of(Value<V> value, Component component) {
        return new BoundValue<V>(value, component);
    }

}
