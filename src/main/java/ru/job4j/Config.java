package ru.job4j;

public interface Config {
 public <T> Class<? extends T>  getImplClass(Class<T> ifc);
}
