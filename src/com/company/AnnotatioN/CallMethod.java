package com.company.AnnotatioN;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@VeryImportant
public class CallMethod {

    public static void callAllMethods(AnimeCharacter animeCharacter) {
        System.out.println(animeCharacter.getClass().getSimpleName() + " class");
        for (Method method : animeCharacter.getClass().getDeclaredMethods()) {
            try {
                System.out.println("Calling the method " + method.getName() + "() ");
                method.invoke(animeCharacter);
            } catch (InvocationTargetException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void callForMultipleTimes(AnimeCharacter animeCharacter, Method method) {
        if (method.isAnnotationPresent(MultipleCallPermission.class)) {
            MultipleCallPermission multipleCallPermission = method.getAnnotation(MultipleCallPermission.class);

            for (int i = 0; i <= multipleCallPermission.times(); i++) {
                try {
                    method.invoke(animeCharacter);
                } catch (InvocationTargetException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
