package lv.Homework6;

public class NumberService {

    private int numberOne;
    private int numberTwo;
    private int sumResult;

    public NumberService(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    //metodes rakstam ar mazo burtu
    //metodei ir jāatgriež summa nvis jābūt void
    public void SumInRange() {

        if (numberOne < numberTwo) {
            sumResult = numberOne;
            int i = numberOne;
            while (i <= numberTwo) {
                i++;
                sumResult = sumResult + i;
            }
            System.out.println(this.sumResult);
        } else {
            sumResult = numberTwo;
            //kods dublējas - iznest atsevišķā metodē
            int i = numberTwo;
            while (i <= numberOne) {
                i++;
                sumResult = sumResult + i;
            }
            System.out.println(this.sumResult);
            //līz pat šejienei
        }
    }

    //metodei ir jāatgriež skaits nevis jābūt void
    //getEvenNumberCount
    public void getEvenNumber() {
        if (numberOne < numberTwo) {
            //kods dublējas - iznest atsevišķā metodē
            for (int i = numberOne; i <= numberTwo; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = numberTwo; i <= numberOne; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}