import java.io.*;
public class CharStreamTest {
    pubic static void main(string[] args) throws IOException{
        StringReader sr = new StringReader("Hi!");
        int x;
        while((x=sr.read()) != -1){
            System.out.print((char)X + " ");
        }
    }
}