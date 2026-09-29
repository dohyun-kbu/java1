void main() {
    Scanner keyboard = new Scanner(System.in);
    String school;
    String name;
    int age;
    String gender;
    double height;
    double weight;

    System.out.printf("학교를 입력하세요 : ");
    school = keyboard.nextLine();
    System.out.printf("이름을 입력하세요 : ");
    name = keyboard.nextLine();
    System.out.printf("나이를 입력하세요 : ");
    age = keyboard.nextInt();
    System.out.printf("성별을 입력하세요 : ");
    gender = keyboard.next();
    System.out.printf("신장을 입력하세요 : ");
    height = keyboard.nextDouble();
    System.out.printf("체중을 입력하세요 : ");
    weight = keyboard.nextDouble();

    System.out.printf("학교 : %s\n", school);
    System.out.printf("이름 : %s\n", name);
    System.out.printf("나이 : %d\n", age);
    System.out.printf("성별 : %s\n", gender);
    System.out.printf("신장 : %.1f Cm\n", height);
    System.out.printf("체중 : %.1f Kg\n", weight);
}