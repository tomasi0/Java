package Java20240325;

public class Java20240325child extends Java20240325Abstract{

    public Java20240325child(){
        super();//Java20240325Abstract의 기본생성자를 의미
    }

    public Java20240325child(int a, String b) {
        super(a, b);
    }

    @Override
    public String getString() {
        return "이것은 자식 클래스";
    }

    public void setValue(int a) {
        super.setValue(a);//자바스타일. 자바는 세터와 게터를 사용하는 것을 추천함!!!
        //== super.a =a; //비추천. 자바스타일이 아님
    }

    public void setString(String b) {
        super.setString(b);
    }

}
