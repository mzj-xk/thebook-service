package com.mzj.thebook;

import java.util.UUID;

public class IdUtil {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
