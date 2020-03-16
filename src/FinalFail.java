/*
public class FinalFail {

    public class GuideWire {
        public static void main(String[] args) {
            int[] t1 = {-3, -14, -5, 7, 8, 42, 8, 3};
            int[] t2 = {2,-10,3, 1, 10, 8, 2, 5, 10, 9, 9, 18};
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
                    if(maxAp < (maxT-minT) ){
                        maxAp = maxT-minT;
                        counter++;
                    }
                    minT = Integer.MAX_VALUE;
                    maxT = Integer.MIN_VALUE;
                }
            }
            return seasons[counter-1];
        }

    }

    private static int calculateSeats(String str,int n) {

        int count =0;

        if(str!=null && !str.isEmpty()) {

            String[] array = str.split(" ");

            Map<Integer,List<Character>> map = new HashMap<>();

            for(String s: array) {

                int row =s.charAt(0)-'0';

                char column = s.charAt(1);

                List<Character> list = map.get(row);

                if(list==null) {

                    list = new java.util.ArrayList<>();

                }

                list.add(column);

                map.put(row-'0', list);

            }

            for(int i=1;i<= n;i++) {

                List<Character> list = map.get(i);

                if(list==null || list.isEmpty()) {

                    count = 2;

                } else {

                    count+=checkReservation(list);

                }

            }

        } else {

            count=2;

        }

        return count;

    }



    private static int checkReservation(List<Character> list) {

        int count = 0;

        for(Character ch:list) {

            if(ch!='B' && ch!='C' && ch!='D' && ch!='E' && ch!='D' && ch!='F' && ch!='G' && ch!='H' && ch!='J') {

                return 2;

            } else if ((ch!='B' && ch!='C' && ch!='D' && ch!='E') || (ch!='F' && ch!='G' && ch!='H' && ch!='J' )) {

                return 1;

            }

        }

        return count;

    }

}
*/
