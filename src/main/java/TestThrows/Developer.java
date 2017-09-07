package TestThrows;

public class Developer {
    public void developerJava(){
        CppDeveloper cpp = new CppDeveloper();
        try {
            cpp.Method();
        }catch (ArithmeticException e){
            System.out.println("Ошибка деление на 0 ");
        }
    }
}
