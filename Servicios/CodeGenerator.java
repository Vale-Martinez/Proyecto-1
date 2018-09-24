
package Servicios;

import java.util.Random;

public class CodeGenerator {
    private String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private int CodeLenght;
    private Random random;

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public int getCodeLenght() {
        return CodeLenght;
    }

    public void setCodeLenght(int CodeLenght) {
        this.CodeLenght = CodeLenght;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public CodeGenerator(int CodeLenght) {
        this.CodeLenght = CodeLenght;
        this.random = new Random();
    }

    @Override
    public String toString() {
        return "CodeGenerator{" + "letters=" + letters + ", CodeLenght=" + CodeLenght + ", random=" + random + '}';
    }
    
    public String generateCode(){
        String msg = "";
        for (int i =0; i< CodeLenght;i++){
            msg+= letters.charAt(random.nextInt(letters.length()));       
        }
        return msg;
    }
    
}
