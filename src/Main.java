import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        //Kintamieji ir salygos 1 uzduotis. Sukurkite 4 kintamuosius, kurie saugotų jūsų vardą, pavardę, gimimo metus ir šiuos metus (nebūtinai tikrus).
        // Parašykite kodą, kuris pagal gimimo metus paskaičiuotų jūsų amžių ir naudodamas vardo ir pavardės kintamuosius atspausdintų tokį sakinį :
        //"Aš esu Vardenis Pavardenis. Man yra XX metai(ų)".
        String manoVardas = " Eulalija";
        String pavarde = " Petroke";
        int gimimometai = 1995;
        int metai = 2024;


        System.out.println("As esu " + manoVardas + " " + pavarde + ". Man yra " + (metai - gimimometai) + " metai");


        //2 uzduotis. Sukurkite du kintamuosius ir naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 4.
        // Didesnę reikšmę padalinkite iš mažesnės. Atspausdinkite rezultatą jį suapvalinę iki 2 skaičių po kablelio.

        int rndNum1 = (int) round(Math.random() * 4);
        int rndNum2 = (int) round(Math.random() * 4);

        System.out.println(rndNum1 + "  " + rndNum2);

        if (rndNum1 != 0 && rndNum2 != 0) {
            if (rndNum1 > rndNum2) {
                System.out.println(round((double) rndNum1 / rndNum2 * 100) / 100.0);
            } else {
                System.out.println(round((double) rndNum2 / rndNum1 * 100) / 100.0);
            }
        } else {
            System.out.println("dalyba is 0 negalima");
        }


        // 3 uzduotis. Naudokite funkcija Math.random(). Sukurkite tris kintamuosius ir naudodamiesi funkcija Math.random()
        // jiems priskirkite atsitiktines reikšmes nuo 0 iki 25. Raskite ir atspausdinkite kintąmąjį turintį vidurinę reikšmę.

        int num1 = (int) round(Math.random() * 25); //15
        int num2 = (int) round(Math.random() * 25); //24
        int num3 = (int) round(Math.random() * 25); //15
        System.out.println(num1 + " " + num2 + " " + num3);

        if ((num1 > num2 && num2 > num3) || (num1 < num3 && num1 < num2)) {
            System.out.println("Vidurine reiksme yra: " + num2);
        }
        if ((num2 > num1 && num2 > num3) || (num2 < num3 && num2 < num1)) {
            System.out.println("Vidurine reiksme yra: " + num1);
        }
        if ((num3 > num1 && num3 > num2) || (num3 < num2 && num3 < num1)) {
            System.out.println("Vidurine reiksme yra: " + num3);
        }
        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("Yra vienodu skaiciu");
        }


        //4 uzduotis. Įvedami skaičiai - a, b, c –kraštinių ilgiai, trys kintamieji (naudojame int) (naudokite ​Math.random()​ funkcija nuo 1 iki 10).
        // Parašykite Java programą, kuri nustatytų, ar galima sudaryti trikampį ir atsakymą atspausdintų.

        int min = 1;
        int max = 10;
        System.out.println();
        int a = (int) (min + round(Math.random() * (max - min)));
        int b = (int) (min + round(Math.random() * (max - min)));
        int c = (int) (min + round(Math.random() * (max - min)));


        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Trikampis");
        } else {
            System.out.println("Ne trikampis");
        }

        System.out.println("<5 uzduotis>");
        // 5 uzduotis. Sukurkite keturis kintamuosius ir Math.random funkcija sugeneruokite jiems
        //reikšmes nuo 0 iki 2. Suskaičiuokite kiek yra nulių, vienetų ir dvejetų. (sprendimui masyvo nenaudoti).

        int x = (int) round(Math.random() * 2);
        int y = (int) round(Math.random() * 2);
        int z = (int) round(Math.random() * 2);
        int q = (int) round(Math.random() * 2);
        System.out.println(x + " " + y + " " + z + " " + q);

        int countZeros = 0;
        int countOnes = 0;
        int countTwos = 0;

        //      countZeros = countZeros + 1;
        //       countZeros = countZeros + 1;
        //     countZeros = countZeros + 10;
        //    countZeros = countZeros - 8;

        //  countZeros = countZeros + 5;
        //countZeros ++;
        //       countZeros --;

        if (x == 0) {
            countZeros = countZeros + 1;
        }

        if (y == 0) {
            countZeros = countZeros + 1;
        }
        if (z == 0) {
            countZeros = countZeros + 1;
        }
        if (q == 0) {
            countZeros = countZeros + 1;
        }
        System.out.println("Nuliu yra: " + countZeros);

        if (x == 1) {
            countOnes = countOnes + 1;
        }

        if (y == 1) {
            countOnes = countOnes + 1;
        }
        if (z == 1) {
            countOnes = countOnes + 1;
        }
        if (q == 1) {
            countOnes = countOnes + 1;
        }
        System.out.println("Vienetu yra: " + countOnes);

        if (x == 2) {
            countTwos = countTwos + 1;
        }

        if (y == 2) {
            countTwos = countTwos + 1;
        }
        if (z == 2) {
            countTwos = countTwos + 1;
        }
        if (q == 2) {
            countTwos = countTwos + 1;
        }
        System.out.println("Dvejetu yra: " + countTwos);

        System.out.println("<6 uzduotis>");
        //6 uzduotis. Naudokite funkcija Math.random(). Sukurkite ir atspausdinkite 3 skaičius nuo -10 iki 10.
        // Skaičiai mažesni už 0 turi būti  laužtiniuose skliaustuose [], 0 -  (), didesni už 0 {}.   [-4],  (0),  {7}

        min = -10;
        max = 10;

        int w = (int) (min + Math.round(Math.random() * (max - min)));
        int e = (int) (min + Math.round(Math.random() * (max - min)));
        int r = (int) (min + Math.round(Math.random() * (max - min)));

        System.out.println(w + " " + e + " " + r);

        if (w < 0) {
            System.out.println("[" + w + "]");
        }
        if (e < 0) {
            System.out.println("[" + e + "]");
        }
        if (r < 0) {
            System.out.println("[" + r + "]");
        }

        if (w > 0) {
            System.out.println("{" + w + "}");
        }
        if (e > 0) {
            System.out.println("{" + e + "}");
        }
        if (r > 0) {
            System.out.println("{" + r + "}");
        }

        if (w == 0) {
            System.out.println("(" + w + ")");
        }
        if (e == 0) {
            System.out.println("(" + e + ")");
        }
        if (r == 0) {
            System.out.println("(" + r + ")");
        }


        System.out.println("<7 uzduotis>");
        //7 uzduotis. Įmonė parduoda žvakes po 1 EUR. Perkant daugiau kaip 1000 vienetų taikoma 3 % nuolaida, daugiau kaip 2000 vienetų- 4 % nuolaida.
        // Parašykite programą, kuri skaičiuos žvakių kainą ir atspausdintų atsakymą kiek žvakių ir kokia kaina perkama. Žvakių kiekį generuokite
        //Math.random funkcija nuo 5 iki 3000.

        min = 5;
        max = 3000;
        int p = 1; //kaina

        int k = (int) (min + Math.round(Math.random() * (max - min))); //zvakiu kiekis

        System.out.println(k);

        if (k > 1000 && k <= 2000) {
            System.out.println("Zvakiu kaina su nuolaida " + (p * k) * 0.97);
        }
        if (k > 2000) {
            System.out.println("Zvakiu kaina su nuolaida " + (p * k) * 0.96);
        }
        if (k < 1000) {
            System.out.println("nera nuolaidos");
        }

        System.out.println(" <8 uzduotis>");
        //8 uzduotis. Naudokite funkcija Math.random(). Sukurkite tris kintamuosius su atsitiktinėm reikšmėm nuo 0 iki 100.
        // Paskaičiuokite jų aritmetinį vidurkį. Ir aritmetinį vidurkį atmetus tas reikšmes, kurios yra mažesnės nei 10 arba didesnės nei 90.
        // Abu vidurkius atspausdinkite. Rezultatus apvalinkite iki sveiko skaičiaus.

        int min1 = 0;
        int max2 = 100;

        double t = (min1 + (Math.random() * (max2 - min1)));
        double u = (min1 + (Math.random() * (max2 - min1)));
        double v = (min1 + (Math.random() * (max2 - min1)));

        System.out.println(t + " " + u + " " + v);

        System.out.println(Math.round((t + u + v) / 3));


//        if (t<10 || t>90) {
//            System.out.println(Math.round((u + v) / 2));
//        }
//        if (u<10 || u>90) {
//            System.out.println(Math.round((t + v) / 2));
//        }
//        if (v<10 || v>90) {
//            System.out.println(Math.round((t + u) / 2));
//        }
//
//        if (t<10 || t>90 && u<10 || u>90) {
//            System.out.println(Math.round((v)));
//        }
//        if (t<10 || t>90 && v<10 || v>90) {
//            System.out.println(Math.round((u)));
//        }
//        if (u<10 || u>90 && v<10 || v>90) {
//            System.out.println(Math.round((t)));
//        }
//        if (u<10 && u>90 && v<10 && v>90 && t<10 && t>90) {
//            System.out.println("Reiksme negalima");
//        }

        double sum = 0;
        int count = 0;

        if (t >= 10 && t <= 90) {
            sum += t;
            count++;
        }

        if (u >= 10 && u <= 90) {
            sum += u;
            count++;
        }

        if (v >= 10 && v <= 90) {
            sum += v;
            count++;
        }

        System.out.println(Math.round(sum / count));


        --global user.name "eulptr"
            -- global user.email "e.skelaite@gmail.com"


    }
}