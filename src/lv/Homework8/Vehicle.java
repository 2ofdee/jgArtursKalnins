package lv.Homework8;

//ctrl + alt + l
public class Vehicle {

    private int wheelCount;
    private int seatCount;

    public Vehicle(int wheelCount, int seatCount) {
        this.wheelCount = wheelCount;
        this.seatCount = seatCount;
    }
//lieka rinda

    public boolean equals(Vehicle obj) {
        return this.wheelCount == obj.wheelCount
         && this.seatCount == obj.seatCount;
    }
}



//   Izveidojiet klases hierarhiju. Galvenajai hierarhijas klasei jābūt klase Mašīna.
//   Viņa mantinieki: PasažieruAutomašīna, KravasAutomašīna, Autobuss.

//       Kopīgajām īpašībām jābūt klasē Mašīna, bet citas īpašības ir jānorāda mantiniekos.
//       Katrā klasē pārrakstiet toString() un equals() metodes.