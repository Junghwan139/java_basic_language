public class Stu03_if {
    public static void main(String[] args) {

//        1. 조건문
//        1) if / if-else
        System.out.println("1) if / if-else");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("나이에 따른 구분입니다. \n나이를 입력해 주세요 : ");
        System.out.println("(예제 1)");
        int age = 29;
        System.out.println("당신의 나이는 " + age + "세 입니다.");
        if (age >= 8 && age <= 19) {
            System.out.println("학교에 다닙니다.");
        } else if (age < 8) {
            System.out.println("미취학 아동입니다.");
        } else {
            System.out.println("성인 입니다.");
        }
        System.out.println("---------------------------------------------------------------------");

//        2) switch-case문
        System.out.println("2) switch-case");

        System.out.println("(예제 1)");
        int ranking = 1;
        char medalColor;

        switch (ranking) {
            case 1:
                medalColor = 'G';
                break;
            case 2:
                medalColor = 'S';
                break;
            case 3:
                medalColor = 'B';
            default:
                medalColor = 'A';
        }
        System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다");

        System.out.println("(예제 2)");
        String medal = "Gold";

        switch (medal) {
            case "Gold":
                System.out.println("금메달입니다.");
                break;
            case "Silver":
                System.out.println("은메달입니다.");
                break;
            case "Bronze":
                System.out.println("동메달입니다.");
                break;
            default:
                System.out.printf("메달이 없습니다.");
                break;
        }


    }
}
