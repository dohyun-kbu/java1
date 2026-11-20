class Customer {
    String waterNo;
    String name;
    char type;
    String typeName;
    float usage;
    int charge;
    int tax;

    public Customer(String waterNo, String name, char type) {
        this.waterNo = waterNo;
        this.name = name;
        this.type = type;
    }
}

void main() {
    Customer[] customers = new Customer[] {
            new Customer("1111", "홍길동", '1'),
            new Customer("1211", "이대한", '1'),
            new Customer("1311", "한길사", '1'),
            new Customer("1411", "한민국", '1'),
            new Customer("1511", "정동진", '1'),
            new Customer("1611", "이순신", '1'),
            new Customer("1711", "세정기", '1'),
            new Customer("1811", "", '1'),
            new Customer("1911", "홍길동", '1'),
            new Customer("2011", "홍길동", '1')
    };

    for (Customer c : customers) {
        System.out.println(c.waterNo + " " + c.name + " " + c.type);
    }
}