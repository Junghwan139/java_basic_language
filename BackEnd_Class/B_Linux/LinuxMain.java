package BackEnd_Class.B_Linux;

public class LinuxMain {

    public static void main(String[] args) {

/*

2. Linux
    1. 리눅스 종류 : redhat, centos, ubuntu, debian, awslinux
    2. 우분투(Linux설치) docker run -it --name test-ubuntu ubuntu:20.04 /bin/bash
    3. 명령어
        1. 현재경로에서 파일목록을 조회하는 명령어 : ls
        2. 조회(숨긴파일까지 모두) : ls -a
        3. 조회(숨긴파일+자세한 권한사항까지) : ls -al
        4. 이동 / 경로 명령어
            1. 폴더 이동 : cd
            2. 현재폴더 기준 한 단계 상위 폴더로 이동(상대경로) : cd..
            3. 직전 폴더로 이동 : cd -
            4. 절대경로 이동 명령어 : cd / root / abc / cbd
            5. 현재 폴더가 어디 있는지 출력 : pwd
            6. 홈(최상이 폴더 아님) 으로 이동 : cd
            7. / : root경로(최상위 폴더)
        5. 파일 생성 / 삭제
            1. 폴더 만들기 : mkdir
            2. 빈파일 생성 : touch
            3. 파일 삭제(질문o) : rm
            4. 파일+폴더 삭제(질문o) : rm -r
            5. 파일삭제(질문x) rm -f
            6. 파일 / 폴더 삭제(질문x) : rm -rf
            7. 파일 이동 시키기(잘라내기) : mv ( -r 옵션 없어도 됨)
            8. 파일 복사 : cp 복사하는 파일이름 경로 / 붙여넣을 파일이름
            9. 폴더 복사 : cp -r
        6. history : 사용한 명령어
    4. 권한관리
        1. 소유자 : 소유자 그룹, developer 그룹 : 더 많은 권한, marketer 그룹 : 더 적은 권한
        2. d rwx r-x r-x  (r read, w write)
        3. chmod 744 파일이름 : 권한 변경
        4. r - 4, w - 2, x - 1
        5. chown test : testgroup : 소유자 그룹 변경
    5. vi편집기
        1. 설치
            1. apt-get update   (패키지 관리 툴 업데이트 *배포판 별로 툴은 다를 수 있음)
            2. apt-get install vim (패키지관리 툴에서 받음)
        2. 실행
        3. vi 파일이름 : 실행
        4. 모드 : 입력모드 / insert 모드(i  -> 인설트 모드), 명령모드
        5. 명령어
            1. wq!  저장하고 나가라(write and quit)
            2. q! 저장없이 나가라(quit)    !있으면 물어보는 것 없이 실행
            3. x: 현재커서가 위치한 단어 삭제
            4. dd : 행 삭제
            5. o : 다음행부터 입력
            6. yy: 행복사
            7. p : 행이후붙여넣기
            8. cat 파일이름 : 바로 출력

*/







    }


}
