import java.util.Scanner;

public class fit {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        long x;
        String sonuc1,sonuc2,sonuc3,sonuc4 ;
        System.out.print("Enter Any Number To Check :");
        x =inp.nextLong();
         boolean b1 =x>-128;
         boolean b2 =x<127;
         boolean s1 =x<32767;
         boolean s2 =x>-32768;

         boolean i1 =x<2147483647;
         boolean i2 =x>-2147483648;

        boolean sonucb = b1&&b2;
        boolean sonucs = s1&&s2;
        boolean sonuci = i1&&i2;
         boolean sonucl = i1&&i2;
         sonuc1 =  sonucb ? "can be fit byte": "" ;
         sonuc2 =  sonucs ? "can be fit short": "" ;
         sonuc3 =  sonuci ? "can be fit integer": "" ;
         sonuc4 =  sonucl ? "can be fit long": "cant fit Any " ;
        System.out.println("Number =" + x +" :");
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);
    }
    }

