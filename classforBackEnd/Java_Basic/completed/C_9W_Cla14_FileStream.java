package classforBackEnd.Java_Basic.completed;

import java.io.*;  // io패키지와 nio패키지(non blocking 방식 - 비동기화 => io는 작업이 순서대로 진행 되도록 하고 진행되는 작업이 완료
                   // 되어야 다음 작업을 할 수 있음. non blocking은 오래 걸리는 작업(파일 입출력, 저장)은 일단 던져 놓고, 아래 작업을
                   // 진행함. 최근에는 nio패키지로 작업을 많이 하는 추세이나. ex)웹사이트 로그인 같은 경우 io로 작업을 해야 함.

public class C_9W_Cla14_FileStream {

    public static void main(String[] args) {



        try{  // 파일입출력(java와 다른 프로세스를 연결할 경우 에러가 발생할 확률이 높아 예외처리를 강제함)
            FileWriter fw = new FileWriter("/Users/junghwanlim/Desktop/mytestfile.txt");
            // java는 메모리에 저장을 하지만 file은 hdd에 저장해야(파일 시스템이라 함) 하기 때문에 직접 저장하면 시간이 오래걸림
            // 따라서 작업중에는 메모리에 저장해 놓고 모아서 hdd에 저장할 필요가 있음(버퍼역할 필요)
            BufferedWriter bw = new BufferedWriter(fw);
            //Buffer을 사용해서 중간 매개체 역할을 시킴
            bw.write("손흥민");
            bw.newLine();
            bw.write("이강인");
            bw.newLine();
            bw.write("차범근");
            bw.newLine();
            bw.close();

        } catch (IOException e){
            e.printStackTrace();
        }

        try{
            FileReader fr = new FileReader("/Users/junghwanlim/Desktop/mytestfile.txt");
            BufferedReader br = new BufferedReader(fr);
            String readL = null;
            while(true){
                //br.readLine()은 한줄한줄 소모가 되는 메서드
                readL = br.readLine();
                if(readL==null){
                    break;
                }

                System.out.println(readL);

            }

        }catch(IOException e){
            e.printStackTrace();
        }










    }

}
