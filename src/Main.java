import functions.*;
import functions.basic.*;

import java.io.*;

public class Main{
    public static void main(String[] args) {
        double leftX=0;
        double rightX=5;
        double values[]={-1.0,1.0,3.0,5.0,7.0};
        double values2[]={-1.0,1.0,3.0,5.0,7.0};

        Object temp=null;
        Object temp2=null;

        try {
            temp=new ArrayTabulatedFunction(leftX,rightX,values);
            temp2=new LinkedListTabulatedFunction(leftX,rightX,values2);
        } catch (InappropriateFunctionPointException e) {
            throw new RuntimeException(e);
        }

        System.out.println(temp.toString());
        System.out.println();
        System.out.println(temp2.toString());
        System.out.println();

        System.out.println(temp.hashCode());
        System.out.println();
        System.out.println(temp2.hashCode());
        System.out.println();
        System.out.println(temp.equals(temp2));


    }
}