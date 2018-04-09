package com.caretronics.validacoesr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaEmail {
	
	
	public static boolean validaEmail(String email) {
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(email);
        if (m.matches()) {
            return false;
        } else {
            return true;
        }
    }
	

}
