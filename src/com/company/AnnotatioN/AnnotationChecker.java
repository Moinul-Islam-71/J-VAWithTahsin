package com.company.AnnotatioN;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * {@code AnnotationChecker} ক্লাসটি অ্যানোটেশন চেক করার জন্য ব্যবহৃত হয়।
 * এটি বিভিন্ন ক্লাস, ফিল্ড এবং মেথডে থাকা অ্যানোটেশন খুঁজে বের করে।
 *
 * @author Taiyo Asano
 * @version 1.0
 */
@Preamble(date = "30/09/2024", author = "Taiyo", currentRevision = 1, lastModified = "N\\A", reviewers = "Tahsin")
public class AnnotationChecker {

    /**
     * {@code getClassAnnotationNames} মেথডটি প্রদত্ত {@code Animal} অবজেক্টের ক্লাসের অ্যানোটেশনগুলো প্রিন্ট করে।
     *
     * @param animeCharacter {@code Animal} অবজেক্ট
     */
    public static void getClassAnnotationNames(AnimeCharacter animeCharacter) {
        Annotation annotation[] = animeCharacter.getClass().getAnnotations();
        for (Annotation annotation1 : annotation) {
            System.out.println("Class: " + animeCharacter.getClass().getSimpleName() + "    Annotation: " + annotation1.annotationType().getSimpleName());
        }
    }

    /**
     * {@code getFieldAnnotationNames} মেথডটি {@code Animal} অবজেক্টের ফিল্ডের অ্যানোটেশনগুলো প্রিন্ট করে।
     *
     * @param animeCharacter {@code Animal} অবজেক্ট
     */
    public static void getFieldAnnotationNames(AnimeCharacter animeCharacter) {
        Field fields[] = animeCharacter.getClass().getDeclaredFields();
        for (Field field : fields) {
            Annotation annotations[] = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("Method: " + field.getName() + "     Annotation: " + annotation.annotationType().getSimpleName());
            }
        }
    }

    /**
     * {@code getMethodAnnotationNames} মেথডটি {@code Animal} অবজেক্টের মেথডের অ্যানোটেশনগুলো প্রিন্ট করে।
     *
     * @param animeCharacter {@code Animal} অবজেক্ট
     */
    public static void getMethodAnnotationNames(AnimeCharacter animeCharacter) {
        System.out.println("\nGetting the method's names from " + animeCharacter.getClass().getSimpleName() + " class");
        Method methods[] = animeCharacter.getClass().getDeclaredMethods();
        for (Method method1 : methods) {
            Annotation annotation[] = method1.getAnnotations();
            for (Annotation annotation1 : annotation) {
                System.out.println("Method: " + method1.getName() + "     Annotation: " + annotation1.annotationType().getSimpleName());
            }
        }
    }
}
