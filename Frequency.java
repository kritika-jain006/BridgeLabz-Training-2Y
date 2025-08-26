public class Frequency {
    public static void main(String[] args) {
        int[] array1 = {2,5,6,3,2,5,6,3,2,6};
        for(int i=0; i<array1.length; i++){
            int count = 1;
            boolean counted = false;
            for(int k=0 ; k<i; k++){
                if(array1[i]==array1[k]) {
                    counted = true;
                    break;
                }
            }
            if(counted) {
                continue;
            }
            for(int j=i+1; j<array1.length;j++) {
                if(array1[i]==array1[j]) {
                    count++;
                }
            }
            System.out.println(array1[i]+"-"+count);
        }
    }
}