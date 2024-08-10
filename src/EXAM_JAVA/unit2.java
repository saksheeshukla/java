package EXAM_JAVA;
//USER-BUILD CUSTOM EXCEPTION
 class MycustomException extends Exception {
    public MycustomException(String message) {
        super(message);
    }
}

public class unit2 {
    public static void main(String[] args) {
        try {
             //Code that might throw the custom exception
            throw new MycustomException("This is a custom exception");
        } catch (MycustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
        finally {
            System.out.println("again");
        }
    }
}


//USE OF THROW
import java.io.FileNotFoundException;
import java.io.IOException;

public class Unit2 {
    public static void main(String[] args) {
        try {
             //Code that might throw an exception (e.g., FileNotFoundException)
        } catch (FileNotFoundException e) {
            IOException ioException=new IOException("File not found");
            ioException.initCause(e);
            throw ioException;
        } catch (IOException e) {  Catch any other IOExceptions
            System.out.println("General I/O error: " + e.getMessage());
        }
    }
}


import java.io.IOException;  //USE OF THROWS
public void readFile(String fileName) throws IOException{

}



//INPUT STREAM CLASS OPERATIONS

import java.io.FileInputStream;

class unit2{
    public static void main(String[] args)  throws Exception{
        FileInputStream fin=new FileInputStream("p1.txt");
        int a1=fin.read();
        int a2=fin.read();
        fin.skip(5);  skip bytes
        byte[] b=new byte[3];
        fin.read(b);
        int a4=fin.available(); return number of byte available for reading
        fin.close();

    }
}




//OUTPUT STREAM CLASS OPERATIONS
import java.io.FileInputStream;
import java.io.FileOutputStream;
class unit2{
    public static void main(String[] args)  throws Exception{
        FileOutputStream fout=new FileOutputStream("p1.txt");
        fout.write(34);
        fout.write(3443);
        byte[] b= {34,34,34,23,87,0};
        fout.write(b);
        fout.write(b,2,4)
        fout.close();

    }
}


//FILE READER
import java.io.FileReader;
import java.io.IOException;

public class unit2 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("file.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//FILE WRITER
import java.io.FileWriter;
import java.io.IOException;

public class unit2 {
    public static void main(String[] args) {
        String data="hi, it's me";
        try (FileWriter writer = new FileWriter("file.txt")) {
            writer.write(data);
            writer.write('A');
            writer.write(data,0,5);
            writer.flush();  //ensure all data is writter
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





//FILE CLASS OPERAIION

import java.io.File;

public class unit2 {
    public static void main(String[] args) throws Exception {
        File file=new File("example.txt");
        if(file.exists()){
            System.out.println("exists");
        }
        else{
            System.out.println("doesn't exist");
            if(file.createNewFile()){
                System.out.println("created");
            }
            else{
                System.out.println("failed");
            }
        }
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        if(file.delete()){
            System.out.println("deleted");
        }
        else{
            System.out.println("failed");
        }

    }

//IMPLEMENT THREAD USING THREAD CLASS

class MyThread extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}

public class unit2 {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();

    }
}



//IMPLEMENTING THE RUNNABLE INTERFACE
class MyRunnable implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
public class unit2{
    public static void main(String[] args) {
        Runnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
    }
}

import java.io.BufferedReader;

import java.io.FileReader;

//Ques1: Write a program to read text file and display the contents on monitor
public class unit2{
    public static void main(String[] args) {
        FileReader fr=new FileReader("file.txt");
        BufferedReader bfr= new BufferedReader(fr);
        String line=bfr.readLine();
        while(line!=null){
            System.out.println(line);
            line= bfr.readLine();
        }
        fr.close();
    }
}


//Ques 2: copy contents of 1 file into another(binary or text)
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class unit2{
    public static void main(String[] args) {
        FileInputStream fin=new FileInputStream("sourcefile.txt");
        FileOutputStream fout=new FileOutputStream("destination.txt");
        int a=fin.read();
        while(a>=0){
            fout.write(a);
            a=fin.read();
        }
        fin.close();
        fout.close();
    }
}




//Ques:3 Append data in text file
import java.io.FileWriter;

class unit2{
    public static void main(String[] args)  throws Exception{
        FileWriter fout=new FileWriter("file.txt",true);
        fout.write("line1");;
        fout.write("line2");
        fout.close();
    }
}

//Ques:4 write a program to read data from keyboard using bufferreader
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class unit2 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

        String s1=bufferedReader.readLine();
        String s2=bufferedReader.readLine();
        String s3=bufferedReader.readLine();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

//12. Write a Java program to read from and write to a file using byte streams.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class unit2 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("sourcefile.txt");
            FileOutputStream fout = new FileOutputStream("destination.txt");

            int a = fin.read();
            while (a >= 0) {
                fout.write(a);
                a = fin.read();
            }

            fin.close();
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





//13. Provide a code example of reading from and writing to a file using FileReader and
FileWriter.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class unit2 {
    public static void main(String[] args) {
        try {
            FileReader fin = new FileReader("sourcefile.txt");
            FileWriter fout = new FileWriter("destination.txt");

            int a = fin.read();
            while (a >= 0) {
                fout.write(a);
                a = fin.read();
            }

            fin.close();
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//SYNCHRONIZATION IN JAVA
class Counter {
    private int count = 0;

     //Synchronized method to ensure that only one thread can increment at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}public class unit2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

         //Create two threads that will increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start the threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print the final value of the counter
        System.out.println("Final count: " + counter.getCount()); //  Expected: 2000
    }
}




//INTER THREAD COMMUNICATION IN JAVA
class Message {
    private String content;
    private boolean isEmpty = true;

    public synchronized void writeMessage(String message) throws InterruptedException {
        while (!isEmpty) {
            wait();   //Wait if there is already a message to be read
        }
        content = message;
        isEmpty = false;
        notify();  // Notify the reader that a new message is available
    }

    public synchronized String readMessage() throws InterruptedException {
        while (isEmpty) {
            wait();   //Wait if there is no message to read
        }
        isEmpty = true;
        notify();  // Notify the writer that the message has been read
        return content;
    }
}

public class unit2 {
    public static void main(String[] args) {
        Message message = new Message();

         Writer thread: writes a message
        Thread writer = new Thread(() -> {
            try {
                message.writeMessage("Hello from writer!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Reader thread: reads the message
        Thread reader = new Thread(() -> {
            try {
                System.out.println("Received: " + message.readMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        writer.start();
        reader.start();
    }
}