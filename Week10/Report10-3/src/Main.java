//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final int[] WEIGHT = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
    final int[] CENTURY = {1800, 1900, 1900, 2000, 2000, 1900, 1900, 2000, 2000, 1800};
    final String[] GENDER = {"여성", "남성", "여성", "남성", "여성", "남성", "여성", "남성", "여성", "남성"};
    String source;                  // 입력한 주민등록 번호
    int[] jumin = new int[13];      // 주민등록 번호 13자리를 저장하는 배열
    boolean flag;                   // 올바른 번호인가
    String message = "";            // 오류 내용
    String region = "";             // 출생 지역
    int year = 0, month = 0, day = 0, lastDay = 0;
    int sum = 0, check = 0, area;
    boolean leap;

    System.out.print("주민등록 번호 입력 (예 : 660510-1321611) : ");
    source = keyboard.nextLine();

    /******  1. 형식 검사 + 배열에 저장 ***********/
    flag = (source.length() == 14 && source.charAt(6) == '-');
    if (flag == true) {
        for (int i = 0; i < jumin.length; i++) {
            char c = (i < 6) ? source.charAt(i) : source.charAt(i + 1);
            if (c >= '0' && c <= '9')
                jumin[i] = c - '0';
            else
                flag = false;
        }
    }

    if (flag == false) {
        message = "[형식 오류] ";
    } else {
        /*******  2. 생년월일 검사 ***********/
        year = CENTURY[jumin[6]] + jumin[0] * 10 + jumin[1];
        month = jumin[2] * 10 + jumin[3];
        day = jumin[4] * 10 + jumin[5];
        leap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                lastDay = 31;
                break;
            case 4: case 6: case 9: case 11:
                lastDay = 30;
                break;
            case 2:
                lastDay = leap ? 29 : 28;
                break;
            default:
                lastDay = 0;
                break;
        }
        if (day < 1 || day > lastDay) {
            flag = false;
            message += "[생년월일 오류] ";
        }

        /****  3. 검증 코드 검사 ********/
        for (int i = 0; i < WEIGHT.length; i++)
            sum += jumin[i] * WEIGHT[i];
        check = 11 - sum % 11;
        if (check >= 10)
            check -= 10;
        if (check != jumin[12]) {
            flag = false;
            message += "[검증 코드 오류] ";
        }

        /*******  4. 지역 코드 (참고 정보) *******/
        area = jumin[7] * 10 + jumin[8];
        if (area <= 8)
            region = "서울특별시";
        else if (area <= 12)
            region = "부산광역시";
        else if (area <= 15)
            region = "인천광역시";
        else if (area <= 25)
            region = "경기도";
        else if (area <= 34)
            region = "강원도";
        else if (area <= 39)
            region = "충청북도";
        else if (area == 40)
            region = "대전광역시";
        else if (area == 44)
            region = "충청남도(세종특별자치시)";
        else if (area <= 47)
            region = "충청남도";
        else if (area <= 54)
            region = "전라북도";
        else if (area <= 64)
            region = "전라남도";
        else if (area <= 66)
            region = "광주광역시";
        else if (area <= 70)
            region = "대구광역시";
        else if (area <= 80)
            region = "경상북도";
        else if (area <= 84)
            region = "경상남도";
        else if (area == 85)
            region = "울산광역시";
        else if (area <= 90)
            region = "경상남도";
        else if (area <= 95)
            region = "제주특별자치도";
        else if (area == 96)
            region = "세종특별자치시";
        else
            region = "알 수 없음";
    }

    /******  출력 ***********/
    System.out.println();
    if (flag == true) {
        System.out.println("올바른 주민등록 번호입니다.");
        System.out.printf("생년월일 : %d년 %d월 %d일\n", year, month, day);
        System.out.printf("성별 : %s (%s)\n", GENDER[jumin[6]], (jumin[6] >= 5 && jumin[6] <= 8) ? "외국인" : "내국인");
        System.out.printf("출생 지역 : %s\n", region);
        System.out.printf("검증 코드 : %d\n", check);
    } else
        System.out.println("올바르지 않은 주민등록 번호입니다. " + message);
}
