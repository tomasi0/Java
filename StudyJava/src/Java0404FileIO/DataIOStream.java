package Java0404FileIO;

import java.io.*;
import java.io.FileInputStream;

public class DataIOStream {
    public static void main(String[] args) throws IOException {
        File dataFile = new File(FileObject.CURRENT + "/fileData.data");
        OutputStream os = new FileOutputStream(dataFile);
        InputStream is = new FileInputStream(dataFile);

        //기존의 IO Stream들은 바이트 단위로만 읽고 쓸 수 있는 반면,
        //DataInoutStream/DataOutputStream은 여러 원시자료형의 형태에 맞춰 읽고 쓸 수 있음
        DataOutputStream dos = new DataOutputStream(os);
        DataInputStream dis = new DataInputStream(is);

        dos.writeInt(35);
        dos.writeDouble(5.8);
        dos.writeChar('A');
        dos.writeUTF("안녕하세요");
        dos.flush();

        //읽기
        int a = dis.readInt();
        double b = dis.readDouble();
        char c = dis.readChar();
        String d =dis.readUTF();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        os.close();
        dos.close();
        is.close();
        dis.close();
    }
}
