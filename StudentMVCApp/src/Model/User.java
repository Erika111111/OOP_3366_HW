package Model;


// основной класс
public class User {
    private String name;
    private String surname;
    private int age;

// конструктор
public User(String name, String surname, int age){
    this.name = name;
    this.surname = surname;
    this.age = age;
}
//  получаем имя
public String getName(){
    return name;
}
// получаем фамилию
 public String getSurname(){
    return surname;
 }
//получаем возраст
 public int getAge(){
    return age;
 }

 public void setName(String name){
    this.name = name;
 }
 public void setSurname(String surname){
    this.surname = surname;
 }
 public void setAge(int age){
    this.age = age;
 }

 @Override
 //переопределние метода
 public String toString() 
 {
     return "User{" + 
     "surname= '" + surname + '\'' +
     ", name= '" + name + '\'' +
     ", age= '" + age + '\'' +
     '}';
}
}
