//The U.S. Census Bureau projects population based on the following assumption:
//One birth happens every 7 seconds
//One death happens every 13 seconds
//The population of the USA is currently: 331,002,651.
//Write a program that calculates how the US population are projected to be in 5 years.
//Print the growth & sum

public class Ex4 {
    public static void main(String[] args) {
        int startPop = 331002651;
        int secondsInAYear = 31556926;
        int newPop = startPop;
        int death = 0;
        int birth = 0;
        //timer;
        for (int i = 0; i < secondsInAYear*5; i++) {
            death++;
            birth++;
            if(birth == 7){
                newPop = newPop + 1;
                birth = 0;
            }
            if(death == 13){
                newPop = newPop -1;
                death = 0;
            }
            if(i%secondsInAYear == 0){
                System.out.println(newPop);
            }

        }
        System.out.println(newPop);
    }
}
