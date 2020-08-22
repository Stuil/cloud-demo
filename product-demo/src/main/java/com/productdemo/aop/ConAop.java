package com.productdemo.aop;

import java.lang.annotation.*;

/**
 * @title: ConAop
 * @description: 自定义注解
 * @date: 2019/12/26
 * @author: Stuil
 * @copyright: Copyright (c) 2019
 * @version:
 */

/**
 * @description: 注解@Retention可以用来修饰注解，是注解的注解，称为元注解。
 *   RetentionPolicy这个枚举类型的常量描述保留注释的各种策略，它们与元注释(@Retention)一起指定注释要保留多长时间
 *   RetentionPolicy.SOURCE:这种类型的Annotations只在源代码级别保留,编译时就会被忽略,在class字节码文件中不包含。
 *   RetentionPolicy.CLASS:这种类型的Annotations编译时被保留,默认的保留策略,在class文件中存在,但JVM将会忽略,运行时无法获得。
 *   RetentionPolicy.RUNTIME:这种类型的Annotations将被JVM保留,所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用。
 *
 *
 * @description: @Target说明了Annotation所修饰的对象范围：Annotation可被用于 packages、types（类、接口、枚举、Annotation类型）
 *    、类型成员（方法、构造方法、成员变量、枚举值）、方法参数和本地变量（如循环变量、catch参数）。
 *    在Annotation类型的声明中使用了target可更加明晰其修饰的目标。
 *    @Target(ElementType.TYPE)——接口、类、枚举、注解
 *    @Target(ElementType.FIELD)——字段、枚举的常量
 *    @Target(ElementType.METHOD)——方法
 *    @Target(ElementType.PARAMETER)——方法参数
 *    @Target(ElementType.CONSTRUCTOR) ——构造函数
 *    @Target(ElementType.LOCAL_VARIABLE)——局部变量
 *    @Target(ElementType.ANNOTATION_TYPE)——注解
 *    @Target(ElementType.PACKAGE)——包

 *
 * @description: Documented注解表明这个注释是由 javadoc记录的，在默认情况下也有类似的记录工具。
 *    如果一个类型声明被注释了文档化，它的注释成为公共API的一部分。
 *
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ConAop {
    String value() default "";
}
