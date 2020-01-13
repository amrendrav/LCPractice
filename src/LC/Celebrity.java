package LC;

/**
 * To find a celebrity if there ias a celebrity then return the nth number else return -1 - if there is no celebrity
 */

public class Celebrity {

    public int findCelebrity(int n){
        int possibleCelebrity = 0;
        //iterate and check
        for (int i = 1; i < n ; i++) {
            if (knows(possibleCelebrity, i))
                possibleCelebrity = i;
        }

        for (int j = 0; j < n ; j++) {
            if(possibleCelebrity != j && knows(possibleCelebrity, j))
                return -1;

            if(possibleCelebrity != j && !knows(j, possibleCelebrity))
                return -1;
        }

        return possibleCelebrity;
    }

    public boolean knows(int p1 , int p2){
        return true;
    }
}


