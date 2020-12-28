package com.nestlings.entities.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NestlingUtils {

    public static final List<NotificationType> emailSenderExcludeUserActions = new ArrayList();

    public static String getMemberFullName(String firstName, String lastName) {
        String fullName = "";
        boolean hasFirstName = !Objects.isNull(firstName) && !firstName.isEmpty();
        boolean hasLastName = !Objects.isNull(lastName) && !lastName.isEmpty();
        if (hasFirstName) {
            fullName = firstName;
        }
        if (hasFirstName && hasLastName) {
            fullName = fullName + " ";
        }

        if (hasLastName) {
            fullName = fullName + lastName;
        }
        return fullName;
    }
}
