package Java20240325;

public class Main {
    public static void main(String[] args) {
        //Java20240325Abstract java20240325Abstract = new Java20240325Abstract(); //추상클래스는 인스턴스화 안 됨.
        Java20240325child javaChild = new Java20240325child();// 추상클래스를 상속한 클래스는 인스턴스화 가능
        System.out.println(javaChild.getValue());
        System.out.println(javaChild.getString());

        Java20240325child java20240325child1 = new Java20240325child(20,"Apple");
        System.out.println(java20240325child1.getValue());
        System.out.println(java20240325child1.getString());

        Java20240325child java20240325child2 = new Java20240325child();
        java20240325child2.setValue(999);
        java20240325child2.setString("Banana");
        System.out.println(java20240325child2.getValue());
        System.out.println(java20240325child2.getString());
        //왜 Banana 가 출력이 안 될까?
    }
}
