package com.mycompany.app;

import javax.crypto.Cipher;
import java.lang.Exception;

/**
 * Hello world!
 *
 */
public class Server2
{
    public void bar()
    {
        System.out.println( "Hello World!" );
    }

    private void foo(String p) {
       String s = "aloha";
       System.out.println(String.format("This is a faulty message: %i", s));
       System.out.format("No %d",1); // Fix another bug instead of one i claim :)
       if ("1" == "2") {
            //dosomething
       }
    }
  
    private void cipher(String s) throws Exception
    {
        Cipher c = Cipher.getInstance(s);
    }

}
