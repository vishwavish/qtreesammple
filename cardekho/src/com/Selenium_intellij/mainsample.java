package com.Selenium_intellij;

import java.util.Locale;

public class mainsample {

    public static void main(String args[])
    {
        String a="mercy";
        String b="mahesh";
        String c="vignesh";
        String d="viswa";
        String e="gopi";
        String attendance="Today's attendance is "+a+" "+b+" "+c+" "+d+" "+e;
        System.out.println(attendance);
       /* String f=e.toLowerCase();
        boolean booleanv=f.equals("gopi");*/
        boolean booleanvalue=e.toLowerCase().equals("gopi");
    }
}

