package classforBackEnd.Java_Basic.completed;

import java.util.*;

public class C_5W_Cla07_SetStack {

    public static void main(String[] args) {

//        5. Set(집합)
//        1) 선언
        Set<String> se1 = new HashSet<>();  // 순서 고려시 TreeSet()
        se1.add("kim");
        se1.add("park");

        String[] s_arr = {"kim","park","choi"};
        Set<String> se2 = new HashSet<>(Arrays.asList(s_arr));
        System.out.println(se2);

//        2) 특징 : 중복이 없다. 순서가 없다.
//        3) 메소드 : addAll(합집합), retainAll(교집합), removeAll(차집합)
//                   더할떄 add, 여러값을 더할때 addAll, 제거할 떄 remove

//        6. Stack(후입선출)
//        1) 선언
        Stack<String> sta1 = new Stack<>();
//        2) 특징 : 후입선출
//        3) 메소드 : 더할때 push, 꺼낼때 pop(꺼낸 것 원본 값 사라짐) / peek
//        ★ collection framework에서 값이 없을 때 꺼내면 에러! isEmpty 확인 할 것

        sta1.push("a1");
        sta1.push("a2");
        sta1.push("a3");
        sta1.push("a4");
        sta1.push("a5");

        System.out.println(sta1);
        System.out.println(sta1.pop());
        System.out.println(sta1);
        System.out.println(sta1.peek());
        System.out.println(sta1);

//        7. Queue
//        1) 선언
        Queue<Integer> q1 = new LinkedList<>(); // Queue선언시 LinkedList로 받는 것이 일반적
//        2) 특징 : (LinkedList의 특징) List와 유사하나 뒷자리의 주소를 가지고 있음
//        ★ collection framework 선언 시 <업캐스팅>이 일반적
//           업캐스팅의 이유 ① 추후 변경사항이 생겼을 때, 유연하게 하위 부분만 바꾸면 된다. (하드코딩과 반대 되는 개념)
//                        ② 상위(LinkedList)가 Queue 상속(또는 구현) 하고 있기 때문에, LinkedList에는 없는 기능을 사용할 수 있다.


//        8. ArrayDeque
//        1) 선언
        Deque<Integer> dq = new ArrayDeque<>();
//        2) 특징 : ★ Stack, Queue의 기능을 모두 가지고 있고, 속도도 좋으므로, ArrayDeque를 사용 하도록 한다.
//        3) 메소드 : addFirst, addLast, peekFirst, peekLast,
        dq.addFirst(1);
        dq.addLast(2);
        dq.add(3);
        dq.add(4);
        System.out.println(dq);

        System.out.println(dq.peekFirst());
        System.out.println(dq.peek());
        System.out.println(dq.peekLast());
        System.out.println(dq.peek());

//        9. 다차원 배열
//        1) 선언 : ★ 최초 선언시 2차원 크기 선언 건너뛸 수 있으나, 인덱스 사용, 값 입력 시에는 크기 선언 필수
        int[][] arr = new int[2][];
        arr[0] = new int [3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;


























    }

}
