package cn.plus.boot.annotation;
import java.lang.annotation.*;

/**
 * 动态数据源注解
 * @author 
 *
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    
    /**
     * 数据源key值
     * @return
     */
    String value();
    
}