package gr.aueb.cf.cf9.review.Junior_level;

public class ArrayMax {
    public static void main(String[] args) {
        int [] a ={ 1,2,3,4};

        int maxvalue = a[0];

        for(int i = 1; i < a.length; i ++){
            if (a[i] > maxvalue){
                maxvalue = a[i];
            }

        }
        System.out.println(maxvalue);
    }

    }

