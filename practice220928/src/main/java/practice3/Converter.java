package practice3;

@FunctionalInterface
public interface Converter<F, T> {
    T convert (F from);
}
