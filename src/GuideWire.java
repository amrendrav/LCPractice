public class GuideWire {
    public static void main(String[] args) {
        int[] t1 = {-3, -14, -5, 7, 8, 42, 8, 3};
        int[] t2 = {2,-3,3, 1, 10, 8, 2, 5, 13, -5, 3, 18};
        System.out.println(soultion(t2));
    }
    private static  String  soultion(int [] T){
        String [] seasons = {"WINTER", "SPRING", "SUMMER", "AUTUMN"};
        int slength = T.length/4;
        if(T.length<4){
            return seasons[0];
        }
        int maxAp = Integer.MIN_VALUE;
        int minT = Integer.MAX_VALUE;
        int maxT = Integer.MIN_VALUE;
        int counter = 0;
        for(int i=0; i<T.length;i++ ){
            minT = Math.min(minT, T[i]);
            maxT = Math.max(maxT, T[i]);
            if((i+1)%slength == 0) {
                System.out.println(i+" "+ ((maxT-minT)));
                if(maxAp < (maxT-minT) ){
                    maxAp = maxT-minT;
                    counter++;
                }
                System.out.println();
                minT = Integer.MAX_VALUE;
                maxT = Integer.MIN_VALUE;
            }
        }
        return seasons[counter];
    }

}
