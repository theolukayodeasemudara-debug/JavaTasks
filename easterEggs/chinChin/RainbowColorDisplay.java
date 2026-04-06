public class RainbowColorDisplay {
                public static void main (String[] args) {
//                    generating random numbers
                      int randomNum = (int)(Math.random() * 7);

//                    displaying the colors based on the numbers displayed
                      if(randomNum == 0) {               
                      System.out.printf("%d means no color is picked %n%n", randomNum);
                       }
                      if(randomNum == 1) {               
                      System.out.printf("%d is violet %n%n", randomNum);
                       }
                      else if(randomNum == 2) {               
                      System.out.printf("%d is indigo %n%n", randomNum);
                       }
                      else if(randomNum == 3) {               
                      System.out.printf("%d is blue %n%n", randomNum);
                       }
                      else if(randomNum == 4) {               
                      System.out.printf("%d is green %n%n", randomNum);
                       }
                      else if(randomNum == 5) {               
                      System.out.printf("%d is yellow %n%n", randomNum);
                       }
                      else if(randomNum == 6) {               
                      System.out.printf("%d is orange %n%n", randomNum);
                       }
                      else if(randomNum == 7) {               
                      System.out.printf("%d is red %n%n", randomNum);
                       }
                }
}

//                  colors to be used are; violet, indigo, blue, green, yellow, orange and, red
