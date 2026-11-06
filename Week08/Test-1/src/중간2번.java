//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int age;
    boolean flag;
    int fee;
    String feeText;
    String result;

    System.out.print("나이 입력 : ");
    age = keyboard.nextInt();

    flag = (age >= 0 && age <= 120) ? true : false;
    fee = (age >= 18) ? 4000 :
            ((age >= 13) ? 3000 :
                    ((age >= 7) ? 1000 : 0));
    feeText = (fee == 0) ? "무료" : String.format("%,d원", fee);

    result = flag == true ? String.format("나이 : %d세, 입장료 = %s", age, feeText) : "나이 오류입니다.";

    System.out.println(result);
}