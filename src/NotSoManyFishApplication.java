import java.util.Random;

public class NotSoManyFishApplication {

    public static void main(String[] args) {
    String[] people = {"Lisa","Sarah", "Mary", "Simon", "Michael", "Jack"};
    boolean[][] matched = new boolean[6][6];

    for(int i = 0,dateCounter = 0; i < 10; ++i) {
        Random random = new Random();

        int first;
        int second;

        do {
            first = random.nextInt(6);
            second = random.nextInt(6);
        }while (matched[first][second]);

        matched[first][second] = true;

        String firstPerson = people[first];
        String secondPerson = people[second];

       // System.out.printf("%d:%s - %d:%s \n",first, firstPerson, second, secondPerson);

        if (first == second) {
            System.out.printf(" * %s is free Saturday night\n",firstPerson);
        } else {
            boolean[] interactionUsed = new boolean[7];

            for(int j = 0; j < 4;++j) {
                System.out.printf("%2s ",j==0?++dateCounter:"");
                int selector;
                do {
                    selector = random.nextInt(7);
                } while(interactionUsed[selector]);

                interactionUsed[selector] = true;

                switch (selector) {
                    case 0:
                        System.out.printf("%s tipped over a glass during a date with %s\n", firstPerson, secondPerson);
                        break;
                    case 1:
                        System.out.printf("%s asked %s out, and %s accepted\n", firstPerson, secondPerson, secondPerson);
                        break;
                    case 2:
                        System.out.printf("%s played chess with %s\n", firstPerson, secondPerson);
                        break;
                    case 3:
                        System.out.printf("%s visited %s\n", firstPerson, secondPerson);
                        break;
                    case 4:
                        System.out.printf("%s went to dinner with %s\n", firstPerson, secondPerson);
                        break;
                    case 5:
                        System.out.printf("%s saw a movie with %s\n", firstPerson, secondPerson);
                        break;
                    case 6:
                        System.out.printf("%s went to a meetup with %s\n", firstPerson, secondPerson);
                        break;
                }
            }
        }
    }


    }
}
