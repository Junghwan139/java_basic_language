package classforBackEnd.Java_Basic.typing.Cla14_FileStream;

import java.io.*;

public class FileWriteWith {

    public static void main(String[] args)  {

        // Java의 file 라이브러리를 통해 파일을 생성하고 read하는 방법
        // 기본적으로, 파일을 read하고, write하는 작업은 시간이 오래걸리는 작업이다.
        // 그래서, 버퍼라는 중간매개 메모리를 사용한다.

        try{
            // 파일입출력의 경우 예외가 발생할 가능성이 높기 때문에, 라이브러리에서 예외처리강제
            // filewriter, filereader방식은 io패키지로, 동기 blocking 방식을 사용했다.
            // nio패키지도 있는데, 이것은 비동기 non-blocking방식을 사용하여 성능을 높였다.
            FileWriter fw = new FileWriter("test_file.txt",true);
            BufferedWriter bw = new BufferedWriter(fw); // 버퍼를 써야 메모리에 중간 저장 함(속도 빠름)
            bw.write("손흥민");
            bw.newLine();
            bw.write("이강인");
            bw.newLine();
            bw.close();

        } catch (IOException e){ // 인풋아웃풋 exception
            e.printStackTrace();
        }

        // file read 또한 buffer를 사용해 read한다.
        // inputstream / outputstream
        // nio 패키지(non blocking방식- 비동기적인 방식), io패키지
        try{
            FileReader fr = new FileReader("test_file.txt");
            BufferedReader br = new BufferedReader(fr);
            String readLine = null;
            while (true){
                //br.readLine()은 한줄한줄 소모가 되는 메서드
                readLine = br.readLine();
                if(readLine == null){
                    break;
                }
                System.out.println(readLine);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
















    }


}
