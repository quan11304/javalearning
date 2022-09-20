import java.lang.annotation.*;

@Target(ElementType.CONSTRUCTOR)
@Retention()
public @interface annotation {
    String name();
    boolean update() default false;
    String installed_date();
    int size();
}
