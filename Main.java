
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        List<String> elementArray = new ArrayList<>();
        List<Integer> elementArray2 = new ArrayList<>();
        List<String> elementLinked = new LinkedList <>();
        List<Integer> elementLinked2 = new LinkedList <>();

        int sizeEl=1000;

        long timestart1=System.currentTimeMillis() ;
for (int i=0; i<sizeEl; i++){
    String tmp = i+"";
    elementArray.add(tmp);
}
        long timeend1=System.currentTimeMillis();
        System.out.println(timeend1-timestart1);

        long timestart2=System.currentTimeMillis() ;
        for (int i=0; i<sizeEl; i++){
            Integer tmp = i;
            elementArray2.add(tmp);
        }
        long timeend2=System.currentTimeMillis();
        System.out.println(timeend2-timestart2);


        long timestart3=System.currentTimeMillis() ;
        for (int i=0; i<sizeEl; i++){
            String tmp = i+"";
            elementLinked.add(tmp);
        }
        long timeend3=System.currentTimeMillis();
        System.out.println(timeend3-timestart3);


        long timestart4=System.currentTimeMillis() ;
        for (int i=0; i<sizeEl; i++){
            Integer tmp = i;
            elementLinked2.add(tmp);
        }
        long timeend4=System.currentTimeMillis();
        System.out.println(timeend4-timestart4);



        long timestart5=System.currentTimeMillis() ;
        for (int i=0; i<sizeEl; i++){
            String tmp = i+"";
            elementArray.set(i, tmp);
        }
        long timeend5=System.currentTimeMillis();
        System.out.println(timeend5-timestart5);

        long timestart6=System.currentTimeMillis() ;
        for (int i=0; i<sizeEl; i++){
            Integer tmp = i;
            elementArray2.set(i, tmp);
        }
        long timeend6=System.currentTimeMillis();
        System.out.println(timeend6-timestart6);


        long timestart7=System.currentTimeMillis() ;
        for (int i=0; i<sizeEl; i++){
            String tmp = i+"";
            elementLinked.set(i, tmp);
        }
        long timeend7=System.currentTimeMillis();
        System.out.println(timeend7-timestart7);


        long timestart8=System.currentTimeMillis() ;
        for (int i=0; i<sizeEl; i++){
            Integer tmp = i;
            elementLinked2.set(i, tmp);
        }
        long timeend8=System.currentTimeMillis();
        System.out.println(timeend8-timestart8);



        long timestart9=System.currentTimeMillis() ;
        for (int i=0; i<sizeEl; i++){

            elementArray.get(i);
        }
        long timeend9=System.currentTimeMillis();
        System.out.println(timeend9-timestart9);

        long timestart10=System.currentTimeMillis() ;
        for (int i=0; i<sizeEl; i++){

            elementArray2.get(i);
        }
        long timeend10=System.currentTimeMillis();
        System.out.println(timeend10-timestart10);


        long timestart11=System.currentTimeMillis() ;
        for (int i=0; i<sizeEl; i++){

            elementLinked.get(i);
        }
        long timeend11=System.currentTimeMillis();
        System.out.println(timeend11-timestart11);


        long timestart12=System.currentTimeMillis() ;
        for (int i=0; i<sizeEl; i++){

            elementLinked2.get(i);
        }
        long timeend12=System.currentTimeMillis();
        System.out.println(timeend12-timestart12);


      long timestart13=System.currentTimeMillis() ;
       for (int i=0; i<elementArray.size(); i++){

           elementArray.remove(i);
        }
        long timeend13=System.currentTimeMillis();
       System.out.println(timeend13-timestart13);

        long timestart14=System.currentTimeMillis() ;
        for (int i=0; i<elementArray.size(); i++){

            elementArray2.remove(i);
        }
        long timeend14=System.currentTimeMillis();
        System.out.println(timeend14-timestart14);


        long timestart15=System.currentTimeMillis() ;
        for (int i=0; i<elementArray.size(); i++){

            elementLinked.remove(i);
        }
        long timeend15=System.currentTimeMillis();
        System.out.println(timeend15-timestart15);


        long timestart16=System.currentTimeMillis() ;
        for (int i=0; i<elementArray.size(); i++){

            elementLinked2.remove(i);
        }
        long timeend16=System.currentTimeMillis();
        System.out.println(timeend16-timestart16);

    }
}
