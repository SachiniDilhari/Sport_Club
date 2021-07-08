package tennis;

import java.util.Arrays;
import java.util.List;
;


public class Tennis01 {
  public Tennis01(String string) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
    List<Club> table = Arrays.asList(
        new Club(1,  "Racketeers", 33, 17, 2, 6, 521, 521, 236, 62, 68,4,6, 54),
        new Club(2,  "Ace of Base", 33, 17, 1, 7, 522, 856, 452, 45, 68, 5, 4, 50),
        new Club(3,  "Ace Ventura", 33, 16, 2, 7, 458, 246, 65, 53, 68, 6, 4, 76),
        new Club(4,  "Alley Cats", 33, 15, 0, 8, 256, 256, 423, 46, 40, 6, 4, 75),
        new Club(5,  "Baby Got Backhand", 33, 15, 1, 9, 231, 437, 354, 70, 46, 8, 4, 68),
        new Club(6,  "Baseline Babes", 33, 12, 2, 10, 521, 256, 185, 77, 54, 2, 1, 68),
        new Club(7,  "Big Hitters",33, 12, 2, 12, 856, 231, 25, 54, 54, 2, 9, 77),
        new Club(8,  "Big Shotss", 33, 11, 1, 13, 246, 521, 80,	54, 50, 2, 4, 54),
        new Club(9,  "Blurred Linesr", 33, 10, 2, 13, 256, 856, 33, 50, 76, 5, 5, 54),
        new Club(10, "Court Dogs", 33, 8, 1, 15, 243, 578, 136, 62, 75, 7, 5, 40),
        new Club(11,  "Courtney Love", 33, 6, 2, 17, 485, 658, 80, 45, 68, 4, 9, 34),
        new Club(12,  "Double Trouble", 33, 1, 1, 23, 582, 800, 856, 29, 68, 1, 0, 1));

     table.forEach(x -> System.out.println(x));
     
  }



}
