import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        1.Task: Tələbəni adı, yaşı və qeydiyyatdan keçdiyi kursların siyahısı olan sadə "Student" sinfini yaradin.
//        "Student" sinfinin bir neçə obyektini yaradın, onları fayla seriallaşdırın,
//        sonra deseriallasdirin və  məlumat geri çap edin.

        Student student1 = new Student("User1",10,"Course1");
        Student student2 = new Student("User2",20,"Course2");
        Student student3 = new Student("User3",30,"Course3");

        FileOutputStream fileOutputStream = new FileOutputStream("Student.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student1);
        objectOutputStream.writeObject(student2);
        objectOutputStream.writeObject(student3);
        fileOutputStream.close();
        objectOutputStream.close();

        FileInputStream fileInputStream=new FileInputStream("Student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student std1 = (Student) objectInputStream.readObject();
        Student std2 = (Student) objectInputStream.readObject();
        Student std3 = (Student) objectInputStream.readObject();
        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);
        System.out.println();
//        2.Kitabı adı, müəllifi və nəşr ili ilə təmsil edən "Book" sinfini yaradin.
//        "Kitab" sinfinin bir neçə nümunəsini yaradın, onları bir fayla seriallaşdırın,
//                sonra onların məlumatlarını seriyadan çıxarın və çap edin.
        Book book1 = new Book("Book1","Author1",2010);
        Book book2 = new Book("Book2","Author2",2015);
        Book book3 = new Book("Book3","Author3",2020);

        FileOutputStream fileOutputStream1 = new FileOutputStream("Book.txt");
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);
        objectOutputStream1.writeObject(book1);
        objectOutputStream1.writeObject(book2);
        objectOutputStream1.writeObject(book3);
        fileOutputStream1.close();
        objectOutputStream1.close();

        FileInputStream fileInputStream1 = new FileInputStream("Book.txt");
        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
        Book b1 = (Book) objectInputStream1.readObject();
        Book b2 = (Book) objectInputStream1.readObject();
        Book b3 = (Book) objectInputStream1.readObject();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);



























    }
}