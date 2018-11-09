public class LogicHW {

    public static void main(String[] args) {

        HalfAdder testAdd = new HalfAdder();
        System.out.println("----------Half Adder---------");
        System.out.println("0,0: " + (testAdd.halfAdder(0, 0)));
        System.out.println("1,0: " + (testAdd.halfAdder(1, 0)));
        System.out.println("0,1: " + (testAdd.halfAdder(0, 1)));
        System.out.println("1,1: " + (testAdd.halfAdder(1, 1)));
        System.out.println("-----------------------------");
        System.out.println();

        FullAdder testFullAdd = new FullAdder();
        System.out.println("----------Full Adder---------");
        System.out.println("0,0, 0: " + (testFullAdd.fullAdder(0, 0, 0)));
        System.out.println("0,0, 1: " + (testFullAdd.fullAdder(0, 0, 1)));
        System.out.println("1,0, 0: " + (testFullAdd.fullAdder(1, 0, 0)));
        System.out.println("0,1, 1: " + (testFullAdd.fullAdder(0, 1, 1)));
        System.out.println("0,1, 0: " + (testFullAdd.fullAdder(0, 1, 0)));
        System.out.println("1,0, 1: " + (testFullAdd.fullAdder(1, 0, 1)));
        System.out.println("1,1, 0: " + (testFullAdd.fullAdder(1, 1, 0)));
        System.out.println("1,1, 1: " + (testFullAdd.fullAdder(1, 1, 1)));
        System.out.println("-----------------------------");
        System.out.println();

        HalfSubtractor testSub = new HalfSubtractor();
        System.out.println("----------Half Subtractor---------");
        System.out.println("0,0: " + (testSub.halfSubtractor(0, 0)));
        System.out.println("1,0: " + (testSub.halfSubtractor(1, 0)));
        System.out.println("0,1: " + (testSub.halfSubtractor(0, 1)));
        System.out.println("1,1: " + (testSub.halfSubtractor(1, 1)));
        System.out.println("----------------------------------");
        System.out.println();

        FullSubtrator testFullSub = new FullSubtrator();
        System.out.println("----------Full Subtractor---------");
        System.out.println("0,0, 0: " + (testFullSub.fullsubtractor(0, 0, 0)));
        System.out.println("0,0, 1: " + (testFullSub.fullsubtractor(0, 0, 1)));
        System.out.println("0,1, 0: " + (testFullSub.fullsubtractor(0, 1, 0)));
        System.out.println("0,1, 1: " + (testFullSub.fullsubtractor(0, 1, 1)));
        System.out.println("1,0, 0: " + (testFullSub.fullsubtractor(1, 0, 0)));
        System.out.println("1,0, 1: " + (testFullSub.fullsubtractor(1, 0, 1)));
        System.out.println("1,1, 0: " + (testFullSub.fullsubtractor(1, 1, 0)));
        System.out.println("1,1, 1: " + (testFullSub.fullsubtractor(1, 1, 1)));
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("-----------------------OLD WORK-----------------------------------");

        //AND
        And testAnd = new And();
        System.out.println("----------AND---------");
        System.out.println("0,0: " + (testAnd.and(0, 0)));
        System.out.println("1,0: " + (testAnd.and(1, 0)));
        System.out.println("0,1: " + (testAnd.and(0, 1)));
        System.out.println("1,1: " + (testAnd.and(1, 1)));
        System.out.println("---------------------");

        //OR
        Or testOr = new Or();
        System.out.println("----------OR---------");
        System.out.println("0,0: " + (testOr.or(0, 0)));
        System.out.println("1,0: " + (testOr.or(1, 0)));
        System.out.println("0,1: " + (testOr.or(0, 1)));
        System.out.println("1,1: " + (testOr.or(1, 1)));
        System.out.println("---------------------");

        //XOR
        Xor testXor = new Xor();
        System.out.println("----------XOR---------");
        System.out.println("0,0: " + (testXor.xor(0, 0)));
        System.out.println("1,0: " + (testXor.xor(1, 0)));
        System.out.println("0,1: " + (testXor.xor(0, 1)));
        System.out.println("1,1: " + (testXor.xor(1, 1)));
        System.out.println("---------------------");

        //NAND
        Nand testNand = new Nand();
        System.out.println("----------NAND---------");
        System.out.println("0,0: " + (testNand.nand(0, 0)));
        System.out.println("1,0: " + (testNand.nand(1, 0)));
        System.out.println("0,1: " + (testNand.nand(0, 1)));
        System.out.println("1,1: " + (testNand.nand(1, 1)));
        System.out.println("---------------------");

        //NOR
        Nor testNor = new Nor();
        System.out.println("----------NOR---------");
        System.out.println("0,0: " + (testNor.nor(0, 0)));
        System.out.println("1,0: " + (testNor.nor(1, 0)));
        System.out.println("0,1: " + (testNor.nor(0, 1)));
        System.out.println("1,1: " + (testNor.nor(1, 1)));
        System.out.println("---------------------");

        //XNOR
        Xnor testXnor = new Xnor();
        System.out.println("----------XNOR---------");
        System.out.println("0,0: " + (testXnor.xnor(0, 0)));
        System.out.println("1,0: " + (testXnor.xnor(1, 0)));
        System.out.println("0,1: " + (testXnor.xnor(0, 1)));
        System.out.println("1,1: " + (testXnor.xnor(1, 1)));
        System.out.println("---------------------");


        //NOT
        Not testNot = new Not();
        System.out.println("----------NOR---------");
        System.out.println("0: " + (testNot.notFunction(testAnd.and(0, 0))));
        System.out.println("1: " + (testNot.notFunction(testAnd.and(1, 1))));
        System.out.println("---------------------");


    }
}

class And {
    public int x;
    public int y;

    public And() {
    }

    public And(int x, int y) {
        this.x = x;
        this.y = x;
    }

    public int and(int x, int y) {
        if (x == 1) {
            if (y == 1) {
                return 1;
            }
        }
        return 0;
    }
}

class Or {
    public int x;
    public int y;

    public Or() {
    }

    public Or(int x, int y) {
        this.x = x;
        this.y = x;
    }

    public int or(int x, int y) {
        if (x + y >= 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Xor {
    public int x;
    public int y;

    public Xor() {
    }

    public Xor(int x, int y) {
        this.x = x;
        this.y = x;
    }

    public int xor(int x, int y) {
        if (x == y) {
            return 0;
        } else {
            return 1;
        }
    }
}

class Nand {
    public int x;
    public int y;

    public Nand() {
    }

    public Nand(int x, int y) {
        this.x = x;
        this.y = x;
    }

    public int nand(int x, int y) {
        if (x + y == 2) {
            return 0;
        } else {
            return 1;
        }
    }
}

class Nor {
    public int x;
    public int y;

    public Nor() {
    }

    public Nor(int x, int y) {
        this.x = x;
        this.y = x;
    }

    public int nor(int x, int y) {
        if (x + y == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Xnor {
    public int x;
    public int y;

    public Xnor() {
    }

    public Xnor(int x, int y) {
        this.x = x;
        this.y = x;
    }

    public int xnor(int x, int y) {
        if (x + y == 0) {
            return 1;
        } else if (x + y == 2) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Not {
    public int x;

    public Not() {
    }

    public Not(int x) {
        this.x = x;
    }

    public int notFunction(int x) {
        if (x == 1) {
            return 0;
        }
        return 1;
    }
}


class FullAdder{
    HalfAdder adderOne = new HalfAdder();
    HalfAdder adderTwo = new HalfAdder();
    Or adderOr = new Or();
    int sum;
    int sum2;
    int carry1;
    int carry2;
    int carry3;


    public FullAdder() {
    }

    public String fullAdder(int a, int b, int carry){

        sum =  adderOne.halfAdderSum(a,b);
        carry1 = adderOne.halfAdderCarry(a,b);
        sum2 =  adderTwo.halfAdderSum(carry,sum);
        carry2 = adderOne.halfAdderCarry(carry,sum);
        carry3 = adderOr.or(carry1,carry2);
        return "Sum: " + sum2 + " Carry: " + carry3;
    }
}

class HalfAdder{
    Xor testXor = new Xor();
    And testAnd = new And();
    int sum;
    int carry;

    public HalfAdder() {
    }

    public String halfAdder(int a, int b){

        sum = testXor.xor(a,b);
        carry = testAnd.and(a,b);
        return "Sum: " + sum + " Carry: " +carry;
    }

    public int halfAdderSum(int a, int b){

        sum = testXor.xor(a,b);
        return sum;

    }

    public int halfAdderCarry(int a, int b) {
        carry = testAnd.and(a,b);
        return carry;
    }
}

class HalfSubtractor{
    Xor testXor = new Xor();
    And testAnd = new And();
    Not testNot = new Not();
    int sum;
    int carry;

    public HalfSubtractor() {
    }

    public String halfSubtractor(int a, int b){

        sum = testXor.xor(a,b);
        carry = testAnd.and(testNot.notFunction(a),b);
        return "Difference: " + sum + " Carry: " +carry;
    }

    public int halfSubtractorDifference(int a, int b){

        sum = testXor.xor(a,b);
        return sum;

    }

    public int halfSubtractorCarry(int a, int b) {
        carry = testAnd.and(testNot.notFunction(a),b);
        return carry;
    }
}

class FullSubtrator{
    HalfSubtractor SubtractorOne = new HalfSubtractor();
    HalfSubtractor SubtractorTwo = new HalfSubtractor();
    Or adderOr = new Or();
    int sum;
    int sum2;
    int carry1;
    int carry2;
    int carry3;


    public FullSubtrator() {
    }

    public String fullsubtractor(int a, int b, int carry){

        sum =  SubtractorOne.halfSubtractorDifference(a,b);
        carry1 = SubtractorOne.halfSubtractorCarry(a,b);
        sum2 =  SubtractorTwo.halfSubtractorDifference(sum,carry);
        carry2 = SubtractorOne.halfSubtractorCarry(sum,carry);
        carry3 = adderOr.or(carry1,carry2);

        return "Difference: " + sum2 + " Carry: " + carry3;
    }
}
/************************         OUTPUT            *******************************
 ----------AND---------
 0,0: 0
 1,0: 0
 0,1: 0
 1,1: 1
 ---------------------
 ----------OR---------
 0,0: 0
 1,0: 1
 0,1: 1
 1,1: 1
 ---------------------
 ----------XOR---------
 0,0: 0
 1,0: 1
 0,1: 1
 1,1: 0
 ---------------------
 ----------NAND---------
 0,0: 1
 1,0: 1
 0,1: 1
 1,1: 0
 ---------------------
 ----------NOR---------
 0,0: 1
 1,0: 0
 0,1: 0
 1,1: 0
 ---------------------
 ----------XNOR---------
 0,0: 1
 1,0: 0
 0,1: 0
 1,1: 1
 ---------------------
 ----------NOR---------
 0: 1
 1: 0
 ---------------------
 *****************************************************************************************/


