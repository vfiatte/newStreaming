/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.util;

import javax.servlet.http.Cookie;

/**
 *
 * @author admin
 */
public class CookieUtil {

    public static String getCookies(Cookie[] mesCookies, String key) {
        key = "";
        for (Cookie c : mesCookies) {
            if (c.getName().equals(key)) 
                return c.getValue();
            }
            throw new RuntimeException("Cookie Introuvable");
        }
    }

