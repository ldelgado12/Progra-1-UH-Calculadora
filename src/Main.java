import calculator.calculator;

import javax.sound.midi.Soundbank;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        //Creates a new instance of Calculator class.
        calculator calculator = new calculator();
        calculator.start();

    }

}




/***************************************************
 Extra points

 Let user decide what operation to do.

 1 is Add
 2 is subtract
 3 is multiply
 4 is divide
 5 to exit

 and let the user keep doing operation until 5 is chose.

 In other words, the user can do as many operation as he wants. So you need to create a while and that while should be stopped when user inserts 5.

 Pseudocode:
 1- ask usert what to do(Add, subtract, divide, multiply, exit)
 if not select exit
 2- do askValuesToUser
 3- do the method regarding the user operation selected.
 4- Show on screen " el resultado es #."
 Repeat until user selects exit.

 ************/