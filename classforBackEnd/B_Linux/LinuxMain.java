package classforBackEnd.B_Linux;

public class LinuxMain {

    public static void main(String[] args) {

/*

2. 리눅스
ls : 현재경로에서 파일목록을 조회하는 명령어
ls -a : 숨긴파일까지 자세하게 조회
ls -al : 숨김파일포함 자세한 권한사항까지 조회

cd : 폴더 이동명령어
cd / root / abc / cbd : 절대경로 이동 명령어
cd.. : 현재폴더 기준 한단계 상위 폴더로 이동하라는 명령어 (상대경로 이동)
pwd : 현재폴더가 어디인지 출력해주는 명령어
cd : 만 누르면 홈으로 이동
cd - : 직전 폴더로 이동
.은 현재경로를 위미, ..은 상위경로를 의미(나중에)

/ : root경로(최상위 폴더)
mkdir : 폴더 만들기
touch : 빈파일 생성

rm : 파일삭제
rm -r : 파일/폴더삭제
rm -f : 묻지 않고 파일삭제(원래 리눅스에서는 삭제시 y/n 물어봄)
rm -rf : 묻지 않고 파일/폴더삭제

 자동완성과 히스토리
tap키를 눌러 자동완성

history : 사용한 명령어
mv : 이동 시키기 (잘라내기) ( -r 옵션 없어도 됨)
cp 복사하는파일이름  경로 /  붙여넣을 파일이름  : 파일복사
cp -r : 폴더복사

소유자 : 소유자 그룹
developer 그룹 : 더 많은 권한
marketer 그룹 : 더 적은 권한
marketer1

d rwx r-x r-x
   r read, w write

chmod 744 파일이름 : 권한 변경
r - 4
w - 2
x - 1

chown test : testgroup : 소유자 그룹 변경


3. vi편집기

설치
apt-get update   (패키지 관리 툴 업데이트 *배포판 별로 툴은 다를 수 있음)
apt-get install vim (패키지관리 툴에서 받음)

실행
vi 파일이름 : 실행
입력모드
i  -> 인설트 모드
명령모드
: wq!  저장하고 나가라(write and quit)
:q! 저장없이 나가라(quit)    !있으면 물어보는 것 없이 실행
x: 현재커서가 위치한 단어 삭제
dd : 행 삭제
o : 다음행부터 입력

yy: 행복사
p : 행이후붙여넣기


cat 파일이름 : 바로 출력




*/







    }


}
