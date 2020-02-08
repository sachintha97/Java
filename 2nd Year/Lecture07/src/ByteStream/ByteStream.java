package ByteStream;

import lk.iit.Lecture1.Circle;

import java.io.*;

public class ByteStream {
    public static void main(String[] args) {
        File file1 = new File("Object.txt");
        try (FileOutputStream fos = new FileOutputStream(file1) {
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                Circle obj1 = new Circle(25.5);
                Circle obj2 = new Circle(25);
                Circle obj3 = new Circle(35.5);
                Circle obj4 = new Circle(15.5);

                System.out.println(obj1);
                oos.writeObject(obj1);
                System.out.println(obj2);
                oos.writeObject(obj2);
                System.out.println(obj3);
                oos.writeObject(obj3);
                System.out.println(obj4);
                oos.writeObject(obj4);

            }
        } catch (FileNotFoundException e) {
            System.err.println("Error in writng to file : " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error in writing to the file : " + e.getMessage());
        }

        // to read java Object from the file
        try (FileInputStream fis = new FileInputStream(file1)) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (true) {
                    Circle obj = (Circle) ois.readObject();
                    obj.setHeart(new Heart());
                    System.out.println();
                }
            }
            catch (EOFException e) {

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
        catch (FileNotFoundException e){
           e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
