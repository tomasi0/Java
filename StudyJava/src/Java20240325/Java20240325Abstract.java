package Java20240325;

abstract public class Java20240325Abstract {
    //필드
    int a;
    String b;
    //생성자


    public Java20240325Abstract() {
    }

    public Java20240325Abstract(int a, String b) {
        this.a = 10;
        this.b = "default";
    }

    // 메서드
    public int getValue(){
        return a;
    }
    abstract public String getString();

    public void setValue(int a) {
        this.a = a;
    }
    public void setString(String b) {// 세터(Setter) 메서드
        this.b = b;
    }
}
