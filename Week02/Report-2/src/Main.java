void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius;
    double 원의면적;
    double 정사각형면적;
    double 빨간영역면적;

    System.out.print("원의 반지름 입력(정수형) ?");
    radius = keyboard.nextInt();

    원의면적 = 3.141592 * radius * radius;
    정사각형면적 = (radius * 2) * (radius * 2);
    빨간영역면적 = 정사각형면적 - 원의면적;

    System.out.printf("원의 반지름 : %d Cm, 원의 면적 : %,.2f \u33a0\n", radius, 원의면적);
    System.out.printf("정사각형 면적 : %,.2f \u33a0\n", 정사각형면적);
    System.out.printf("빨간색 영역 면적 : %,.2f \u33a0\n", 빨간영역면적);
}