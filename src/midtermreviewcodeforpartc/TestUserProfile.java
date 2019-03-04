package midtermreviewcodeforpartc;

import java.util.Arrays;
import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[]args){
        String[] genres={"Comedy","Action","Romance"};
        Scanner scan=new Scanner(System.in);
        System.out.println("create user profile first enter your name");
        String name=scan.next();
        System.out.println("now input from one of the following genres Action,Romance or Comedy if it doesn't match it will automatically be action");
        String genre= scan.next();
        System.out.println(name+"is now created their favorite genre is "+genre);


    }
}
