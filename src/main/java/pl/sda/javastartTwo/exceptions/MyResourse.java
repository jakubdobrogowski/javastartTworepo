package pl.sda.javastartTwo.exceptions;

public class MyResourse implements AutoCloseable { //wałasny menadżer kontekstu

    public void doSomeWork(String work){

        System.out.println("Doing " + work);

        throw new RuntimeException("Exeption during work");

        }

        public void close(){

            System.out.println("Closing reosurece");
            throw new RuntimeException("Exeptiond during close");
        }
}
